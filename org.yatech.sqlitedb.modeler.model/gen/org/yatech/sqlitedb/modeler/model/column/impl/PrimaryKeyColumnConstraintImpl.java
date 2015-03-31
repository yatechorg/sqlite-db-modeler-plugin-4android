/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.ecore.EClass;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyColumnConstraintImpl extends ColumnConstraintImpl implements PrimaryKeyColumnConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnPackage.Literals.PRIMARY_KEY_COLUMN_CONSTRAINT;
	}

} //PrimaryKeyColumnConstraintImpl
