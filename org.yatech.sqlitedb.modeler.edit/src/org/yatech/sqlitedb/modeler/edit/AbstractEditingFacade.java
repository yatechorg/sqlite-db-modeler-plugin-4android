package org.yatech.sqlitedb.modeler.edit;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;

@SuppressWarnings("rawtypes")
public class AbstractEditingFacade<T extends AbstractEditingFacade> {
	
	private final ModelEditingFacade modelEditingFacade;
	
	AbstractEditingFacade(ModelEditingFacade editingFacade) {
		this.modelEditingFacade = editingFacade;
	}
	
	@SuppressWarnings("unchecked")
	public T startCompound(String label) {
		modelEditingFacade.startCompound(label);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public T endCompound() {
		modelEditingFacade.endCompound();
		return (T) this;
	}
	
	protected ModelEditingFacade getModelEditingFacade() {
		return modelEditingFacade;
	}
	
	protected EditingDomain getEditingDomain() {
		return modelEditingFacade.getEditingDomain();
	}
	
	protected void execute(Command command) {
		modelEditingFacade.execute(command);
	}

}
