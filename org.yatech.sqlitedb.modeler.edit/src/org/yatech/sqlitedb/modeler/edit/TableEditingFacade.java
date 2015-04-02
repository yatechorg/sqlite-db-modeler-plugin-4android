package org.yatech.sqlitedb.modeler.edit;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.column.Column;
import org.yatech.sqlitedb.modeler.model.column.ColumnFactory;
import org.yatech.sqlitedb.modeler.model.column.IndexedColumn;
import org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.Table;
import org.yatech.sqlitedb.modeler.model.table.TableConstraint;
import org.yatech.sqlitedb.modeler.model.table.TableFactory;
import org.yatech.sqlitedb.modeler.model.table.TablePackage;
import org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint;

public class TableEditingFacade extends AbstractEditingFacade<TableEditingFacade>{
	
	private final DatabaseVersion databaseVersion;
	private final Table table;
	
	TableEditingFacade(ModelEditingFacade modelEditingFacade, DatabaseVersion databaseVersion, Table table) {
		super(modelEditingFacade);
		this.databaseVersion = databaseVersion;
		this.table = table;
	}
	
	public Table getTable() {
		return table;
	}
	
	public ColumnEditingFacade addNewColumn() {
		Column column = ColumnFactory.eINSTANCE.createColumn();
		Command cmd = AddCommand.create(getEditingDomain(), 
				table, 
				TablePackage.Literals.TABLE__COLUMNS, 
				column);
		execute(cmd);
		return edit(column);
	}
	
	public TableEditingFacade remove(Column column) {
		//TODO [YA] IMPLEMENT! Update also the column mapping
		return this;
	}
	
	public ColumnEditingFacade edit(Column column) {
		return new ColumnEditingFacade(getModelEditingFacade(), column);
	}
	
	public TableEditingFacade addPrimaryKeyConstraint(IndexedColumn column, IndexedColumn... otherColumns) {
		PrimaryKeyTableConstraint constraint = TableFactory.eINSTANCE.createPrimaryKeyTableConstraint();
		constraint.getColumns().add(column);
		if (otherColumns.length > 0) {
			constraint.getColumns().addAll(Arrays.<IndexedColumn>asList(otherColumns));
		}
		addOrReplaceConstraint(constraint);
		return this;
	}
	
	public TableEditingFacade addUniqueConstraint(IndexedColumn column, IndexedColumn... otherColumns) {
		UniqueTableConstraint constraint = TableFactory.eINSTANCE.createUniqueTableConstraint();
		constraint.getColumns().add(column);
		if (otherColumns.length > 0) {
			constraint.getColumns().addAll(Arrays.<IndexedColumn>asList(otherColumns));
		}
		Command cmd = AddCommand.create(getEditingDomain(), 
				table, 
				TablePackage.Literals.TABLE__CONSTRAINTS, 
				constraint);
		execute(cmd);
		return this;
	}
	
	public TableEditingFacade addForeignKeyConstraint(List<Column> columns, Table foreignTable, List<Column> foreignColumns) {
		ForeignKeyTableConstraint constraint = TableFactory.eINSTANCE.createForeignKeyTableConstraint();
		constraint.getColumns().addAll(columns);
		constraint.setForeignTable(foreignTable);
		if (!foreignColumns.isEmpty()) {
			constraint.getForeignColumns().addAll(foreignColumns);
		}
		Command cmd = AddCommand.create(getEditingDomain(), 
				table, 
				TablePackage.Literals.TABLE__CONSTRAINTS, 
				constraint);
		execute(cmd);
		return this;
	}
	
	private void addOrReplaceConstraint(TableConstraint constraint) {
		addOrReplaceConstraint(constraint, constraint.getClass());
	}
	
	private void addOrReplaceConstraint(TableConstraint constraint, Class<? extends TableConstraint> constraintClass) {
		Command removeCmd = createRemoveConstraintCommand(constraintClass);
		Command addCmd = AddCommand.create(getEditingDomain(), 
				table, 
				TablePackage.Literals.TABLE__CONSTRAINTS, 
				constraint);
		Command cmd;
		if (removeCmd != null) {
			cmd = new CompoundCommand(addCmd.getLabel(), Arrays.asList(removeCmd, addCmd));
		} else {
			cmd = addCmd;
		}
		execute(cmd);
	}
	
	private void removeConstraint(Class<? extends TableConstraint> constraintClass) {
		Command cmd = createRemoveConstraintCommand(constraintClass);
		if (cmd != null) {
			execute(cmd);
		}
	}

	private Command createRemoveConstraintCommand(Class<? extends TableConstraint> constraintClass) {
		for (TableConstraint constraint : table.getConstraints()) {
			if (constraintClass.isInstance(constraint)) {
				return RemoveCommand.create(getEditingDomain(), 
						table, 
						TablePackage.Literals.TABLE__CONSTRAINTS, 
						constraint);
			}
		}
		return null;
	}

}
