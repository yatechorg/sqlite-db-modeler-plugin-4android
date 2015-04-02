package org.yatech.sqlitedb.modeler.edit;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.yatech.sqlitedb.modeler.model.Database;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.ModelPackage;
import org.yatech.sqlitedb.modeler.model.column.Column;
import org.yatech.sqlitedb.modeler.model.common.CommonPackage;
import org.yatech.sqlitedb.modeler.model.table.Table;
import org.yatech.sqlitedb.modeler.model.table.TableFactory;

public class DatabaseEditingFacade extends AbstractEditingFacade<DatabaseEditingFacade>{
	
	private final DatabaseVersion databaseVersion;
	
	DatabaseEditingFacade(ModelEditingFacade modelEditingFacade, DatabaseVersion databaseVersion) {
		super(modelEditingFacade);
		this.databaseVersion = databaseVersion;
	}
	
	public DatabaseVersion getDatabaseVersion() {
		return databaseVersion;
	}
	
	public DatabaseEditingFacade databaseName(String databaseName) {
		Database database = databaseVersion.getDatabase();
		Command cmd = SetCommand.create(getEditingDomain(), 
				database, 
				CommonPackage.Literals.NAME_PROVIDER__NAME, 
				databaseName);
		execute(cmd);
		return this;
	}
	
	public TableEditingFacade addNewTable() {
		Table table = TableFactory.eINSTANCE.createTable();
		Database database = databaseVersion.getDatabase();
		Command cmd = AddCommand.create(getEditingDomain(), 
				database, 
				ModelPackage.Literals.DATABASE__TABLES, 
				table);
		execute(cmd);
		return edit(table);
	}
	
	public DatabaseEditingFacade remove(Table table) {
		//TODO [YA] IMPLEMENT! Update also the table mapping
		return this;
	}
	
	public TableEditingFacade edit(Table table) {
		return new TableEditingFacade(getModelEditingFacade(), databaseVersion, table);
	}
	
}
