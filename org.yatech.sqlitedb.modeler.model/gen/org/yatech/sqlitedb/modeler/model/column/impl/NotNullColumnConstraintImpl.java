/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.ecore.EClass;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Null Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NotNullColumnConstraintImpl extends ColumnConstraintImpl implements NotNullColumnConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotNullColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnPackage.Literals.NOT_NULL_COLUMN_CONSTRAINT;
	}

} //NotNullColumnConstraintImpl
