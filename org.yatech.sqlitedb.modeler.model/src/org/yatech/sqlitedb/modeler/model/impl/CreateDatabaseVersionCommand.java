package org.yatech.sqlitedb.modeler.model.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.yatech.sqlitedb.modeler.model.Database;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.ModelFactory;
import org.yatech.sqlitedb.modeler.model.column.Column;
import org.yatech.sqlitedb.modeler.model.column.ColumnFactory;
import org.yatech.sqlitedb.modeler.model.column.IndexedColumn;
import org.yatech.sqlitedb.modeler.model.common.ColumnMapping;
import org.yatech.sqlitedb.modeler.model.common.CommonFactory;
import org.yatech.sqlitedb.modeler.model.common.TableMapping;
import org.yatech.sqlitedb.modeler.model.expression.Expression;
import org.yatech.sqlitedb.modeler.model.expression.ExpressionFactory;
import org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.Table;
import org.yatech.sqlitedb.modeler.model.table.TableConstraint;
import org.yatech.sqlitedb.modeler.model.table.TableFactory;
import org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.util.TableSwitch;

class CreateDatabaseVersionCommand {
	
	private final DatabaseVersionsImpl databaseVersions;
	private final DatabaseVersion newDatabaseVersion;
	private final TableMapping tableMapping;
	private final ColumnMapping columnMapping;
	private final TableSwitch<TableConstraint> cloneTableConstraintSwitch; 
	private boolean executed = false;
	
	CreateDatabaseVersionCommand(DatabaseVersionsImpl databaseVersions) {
		this.databaseVersions = databaseVersions;
		this.newDatabaseVersion = ModelFactory.eINSTANCE.createDatabaseVersion();
		this.tableMapping = CommonFactory.eINSTANCE.createTableMapping();
		this.columnMapping = CommonFactory.eINSTANCE.createColumnMapping();
		this.cloneTableConstraintSwitch = createCloneTableConstraintSwitch();
	}
	
	public DatabaseVersion create() {
		checkState();
		DatabaseVersion lastVersion = databaseVersions.getLastVersion();
		if (lastVersion == null) {
			createNewVersionFromScratch();
		} else {
			cloneDatabaseVersion(lastVersion);
		}
		return newDatabaseVersion;
	}

	private void checkState() {
		if (executed) {
			throw new IllegalStateException("Command was already executed!");
		}
		executed = true;
	}

	private void createNewVersionFromScratch() {
		initDatabaseVersion();
		Database newDatabase = ModelFactory.eINSTANCE.createDatabase();
		newDatabaseVersion.setDatabase(newDatabase);
	}

	private void initDatabaseVersion() {
		newDatabaseVersion.setTableMapping(tableMapping);
		newDatabaseVersion.setColumnMapping(columnMapping);
	}

	private void cloneDatabaseVersion(DatabaseVersion origVersion) {
		initDatabaseVersion();
		Database newDatabase = cloneDatabase(origVersion.getDatabase());
		newDatabaseVersion.setDatabase(newDatabase);
	}
	
	private Database cloneDatabase(Database origDatabase) {
		Database newDatabase = ModelFactory.eINSTANCE.createDatabase();
		newDatabase.setName(origDatabase.getName());
		cloneDatabaseTables(origDatabase, newDatabase);
		return newDatabase;
	}

	private void cloneDatabaseTables(Database origDatabase, Database newDatabase) {
		for (Table origTable : origDatabase.getTables()) {
			Table newTable = cloneTable(origTable);
			newTable.setDatabase(newDatabase);
			tableMapping.put(origTable, newTable);
		}
	}

	private Table cloneTable(Table origTable) {
		Table newTable = TableFactory.eINSTANCE.createTable();
		newTable.setName(origTable.getName());
		cloneColumns(origTable, newTable);
		cloneConstraints(origTable, newTable);
		return newTable;
	}

	private void cloneColumns(Table origTable, Table newTable) {
		for (Column origColumn : origTable.getColumns()) {
			Column newColumn = cloneColumn(newTable, origColumn);
			newColumn.setTable(newTable);
			columnMapping.put(origColumn, newColumn);
		}
	}

	private Column cloneColumn(Table newTable, Column origColumn) {
		Column newColumn = ColumnFactory.eINSTANCE.createColumn();
		newColumn.setName(origColumn.getName());
		newColumn.setType(origColumn.getType());
		return newColumn;
	}

	private void cloneConstraints(Table origTable, Table newTable) {
		for (TableConstraint origConstraint : origTable.getConstraints()) {
			TableConstraint newConstraint = cloneConstraint(origConstraint);
			newConstraint.setTable(newTable);
		}
	}

	private TableConstraint cloneConstraint(TableConstraint origConstraint) {
		TableConstraint newConstraint = cloneTableConstraintSwitch.doSwitch(origConstraint);
		return newConstraint;
	}

	private TableSwitch<TableConstraint> createCloneTableConstraintSwitch() { 
		return new TableSwitch<TableConstraint>() { 
			@Override
			public TableConstraint caseCheckTableConstraint(CheckTableConstraint origConstraint) {
				CheckTableConstraint newConstraint = TableFactory.eINSTANCE.createCheckTableConstraint();
				setBaseTableConstaint(origConstraint, newConstraint);
				newConstraint.setExpression(cloneExpression(origConstraint.getExpression()));
				return newConstraint;
			}
			
			@Override
			public TableConstraint caseForeignKeyTableConstraint(ForeignKeyTableConstraint origConstraint) {
				ForeignKeyTableConstraint newConstraint = TableFactory.eINSTANCE.createForeignKeyTableConstraint();
				setBaseTableConstaint(origConstraint, newConstraint);
				Table newForeignTable = tableMapping.getCurrent(origConstraint.getForeignTable());
				newConstraint.setForeignTable(newForeignTable);
				return newConstraint;
			}
			
			@Override
			public TableConstraint casePrimaryKeyTableConstraint(PrimaryKeyTableConstraint origConstraint) {
				PrimaryKeyTableConstraint newConstraint = TableFactory.eINSTANCE.createPrimaryKeyTableConstraint();
				setBaseTableConstaint(origConstraint, newConstraint);
				newConstraint.getColumns().addAll(cloneIndexColumns(origConstraint.getColumns()));
				return newConstraint;
			}
			
			@Override
			public TableConstraint caseUniqueTableConstraint(UniqueTableConstraint origConstraint) {
				UniqueTableConstraint newConstraint = TableFactory.eINSTANCE.createUniqueTableConstraint();
				setBaseTableConstaint(origConstraint, newConstraint);
				newConstraint.getColumns().addAll(cloneIndexColumns(origConstraint.getColumns()));
				return newConstraint;
			}
			
			private void setBaseTableConstaint(TableConstraint origConstraint, TableConstraint newConstraint) {
				newConstraint.setName(origConstraint.getName());
				newConstraint.setTable(tableMapping.getCurrent(origConstraint.getTable()));
			}
		};
	}

	private Collection<IndexedColumn> cloneIndexColumns(EList<IndexedColumn> origColumns) {
		List<IndexedColumn> newColumns = new ArrayList<IndexedColumn>();
		for (IndexedColumn origIndexedColumn : origColumns) {
			IndexedColumn newIndexedColumn = ColumnFactory.eINSTANCE.createIndexedColumn();
			newIndexedColumn.setColumn(columnMapping.getCurrent(origIndexedColumn.getColumn()));
			newColumns.add(newIndexedColumn);
		}
		return newColumns;
	}

	private Expression cloneExpression(Expression expression) {
		// TODO Implement
		return expression == null ? null : (Expression)ExpressionFactory.eINSTANCE.create(expression.eClass());
	}

}