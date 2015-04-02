package org.yatech.sqlitedb.modeler.edit;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.DatabaseVersions;
import org.yatech.sqlitedb.modeler.model.ModelFactory;
import org.yatech.sqlitedb.modeler.model.ModelPackage;

public class ModelEditingFacade {
	
	private final EditingDomain editingDomain;
	private final DatabaseVersions databaseVersions;
	private CompoundCommand compoundCommand;
	
	private ModelEditingFacade(EditingDomain editingDomain, DatabaseVersions databaseVersions) {
		this.editingDomain = editingDomain;
		this.databaseVersions = databaseVersions;
	}
	
	public static ModelEditingFacade using(EditingDomain editingDomain, DatabaseVersions databaseVersions) {
		return new ModelEditingFacade(editingDomain, databaseVersions);
	}
	
	EditingDomain getEditingDomain() {
		return editingDomain;
	}
	
	public ModelEditingFacade startCompound(String label) {
		checkStateForStart();
		compoundCommand = new CompoundCommand(label);
		return this;
	}
	
	public ModelEditingFacade endCompound() {
		checkStateForEnd();
		editingDomain.getCommandStack().execute(compoundCommand);
		compoundCommand = null;
		return this;
	}
	
	void execute(Command command) {
		if (compoundCommand != null) {
			compoundCommand.append(command);
		} else {
			editingDomain.getCommandStack().execute(command);
		}
	}
	
	public static DatabaseVersions createModel(String databaseName, String fileName, String packageName) {
		DatabaseVersions databaseVersions = ModelFactory.eINSTANCE.createDatabaseVersions();
		databaseVersions.setFileName(fileName);
		databaseVersions.setPackageName(packageName);
		DatabaseVersion databaseVersion = databaseVersions.createVersion();
		databaseVersion.getDatabase().setName(databaseName);
		databaseVersions.getVersions().add(databaseVersion);
		return databaseVersions;
	}
	
	public DatabaseVersions getModel() {
		return databaseVersions;
	}
	
	public DatabaseEditingFacade addNewVersion() {
		DatabaseVersion databaseVersion = databaseVersions.createVersion();
		Command cmd = AddCommand.create(editingDomain, 
				databaseVersions, 
				ModelPackage.Literals.DATABASE_VERSIONS__VERSIONS, 
				databaseVersion);
		execute(cmd);
		return edit(databaseVersion);
	}
	
	public DatabaseEditingFacade edit(DatabaseVersion databaseVersion) {
		return new DatabaseEditingFacade(this, databaseVersion);
	}
	
	public DatabaseEditingFacade editLastVersion() {
		return edit(databaseVersions.getLastVersion());
	}

	private void checkStateForStart() {
		if (compoundCommand != null) {
			throw new IllegalStateException(
					"Cannot start a compound command - there is already a started one. Label: " + compoundCommand.getLabel());
		}
	}

	private void checkStateForEnd() {
		if (compoundCommand == null) {
			throw new IllegalStateException("Cannot end a compound command - there is no one started");
		}
	}

}
