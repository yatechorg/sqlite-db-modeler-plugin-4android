package org.yatech.sqlitedb.modeler.edit;

import java.util.Arrays;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.yatech.sqlitedb.modeler.model.column.Column;
import org.yatech.sqlitedb.modeler.model.column.ColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.ColumnFactory;
import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.DataType;
import org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultRealValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.ForeignKeyColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.common.CommonPackage;
import org.yatech.sqlitedb.modeler.model.table.Table;

public class ColumnEditingFacade extends AbstractEditingFacade<ColumnEditingFacade> {
	
	private final Column column;
	
	ColumnEditingFacade(ModelEditingFacade modelEditingFacade, Column column) {
		super(modelEditingFacade);
		this.column = column;
	}
	
	public Column getColumn() {
		return column;
	}
	
	public ColumnEditingFacade name(String name) {
		Command cmd = SetCommand.create(getEditingDomain(), 
				column, 
				CommonPackage.Literals.NAME_PROVIDER__NAME, 
				name);
		execute(cmd);
		return this;
	}
	
	public ColumnEditingFacade type(DataType type) {
		Command cmd = SetCommand.create(getEditingDomain(), 
				column, 
				ColumnPackage.Literals.COLUMN__TYPE, 
				type);
		execute(cmd);
		return this;
	}
	
	public ColumnEditingFacade addPrimaryKeyConstraint() {
		PrimaryKeyColumnConstraint constraint = ColumnFactory.eINSTANCE.createPrimaryKeyColumnConstraint();
		addOrReplaceConstraint(constraint);
		return this;
	}
	
	public ColumnEditingFacade removePrimaryKeyConstraint() {
		removeConstraint(PrimaryKeyColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade addForeignKeyConstraint(Table foreignTable, Column foreignColumn) {
		ForeignKeyColumnConstraint constraint = ColumnFactory.eINSTANCE.createForeignKeyColumnConstraint();
		constraint.setForeignTable(foreignTable);
		constraint.setForeignColumn(foreignColumn);
		addOrReplaceConstraint(constraint);
		return this;
	}
	
	public ColumnEditingFacade removeForeignKeyConstraint() {
		removeConstraint(ForeignKeyColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade addNotNullConstraint() {
		NotNullColumnConstraint constraint = ColumnFactory.eINSTANCE.createNotNullColumnConstraint();
		addOrReplaceConstraint(constraint);
		return this;
	}
	
	public ColumnEditingFacade removeNotNullColumnConstraint() {
		removeConstraint(NotNullColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade addUniqueConstraint() {
		UniqueColumnConstraint constraint = ColumnFactory.eINSTANCE.createUniqueColumnConstraint();
		addOrReplaceConstraint(constraint);
		return this;
	}
	
	public ColumnEditingFacade removeUniqueColumnConstraint() {
		removeConstraint(UniqueColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade addDefaultValueConstraint(String value) {
		DefaultStringValueColumnConstraint constraint = ColumnFactory.eINSTANCE.createDefaultStringValueColumnConstraint();
		constraint.setValue(value);
		addOrReplaceConstraint(constraint, DefaultValueColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade addDefaultValueConstraint(Long value) {
		DefaultIntegerValueColumnConstraint constraint = ColumnFactory.eINSTANCE.createDefaultIntegerValueColumnConstraint();
		constraint.setValue(value);
		addOrReplaceConstraint(constraint, DefaultValueColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade addDefaultValueConstraint(Double value) {
		DefaultRealValueColumnConstraint constraint = ColumnFactory.eINSTANCE.createDefaultRealValueColumnConstraint();
		constraint.setValue(value);
		addOrReplaceConstraint(constraint, DefaultValueColumnConstraint.class);
		return this;
	}
	
	public ColumnEditingFacade removeDefaultValueConstraint() {
		removeConstraint(DefaultValueColumnConstraint.class);
		return this;
	}
	
	private void addOrReplaceConstraint(ColumnConstraint constraint) {
		addOrReplaceConstraint(constraint, constraint.getClass());
	}
	
	private void addOrReplaceConstraint(ColumnConstraint constraint, Class<? extends ColumnConstraint> constraintClass) {
		Command removeCmd = createRemoveConstraintCommand(constraintClass);
		Command addCmd = AddCommand.create(getEditingDomain(), 
				column, 
				ColumnPackage.Literals.COLUMN__CONSTRAINTS, 
				constraint);
		Command cmd;
		if (removeCmd != null) {
			cmd = new CompoundCommand(addCmd.getLabel(), Arrays.asList(removeCmd, addCmd));
		} else {
			cmd = addCmd;
		}
		execute(cmd);
	}
	
	private void removeConstraint(Class<? extends ColumnConstraint> constraintClass) {
		Command cmd = createRemoveConstraintCommand(constraintClass);
		if (cmd != null) {
			execute(cmd);
		}
	}

	private Command createRemoveConstraintCommand(Class<? extends ColumnConstraint> constraintClass) {
		for (ColumnConstraint constraint : column.getConstraints()) {
			if (constraintClass.isInstance(constraint)) {
				return RemoveCommand.create(getEditingDomain(), 
						column, 
						ColumnPackage.Literals.COLUMN__CONSTRAINTS, 
						constraint);
			}
		}
		return null;
	}

}
