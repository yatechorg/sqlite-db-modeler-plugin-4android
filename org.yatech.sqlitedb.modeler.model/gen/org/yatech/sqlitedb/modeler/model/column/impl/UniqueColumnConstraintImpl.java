/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.ecore.EClass;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unique Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class UniqueColumnConstraintImpl extends ColumnConstraintImpl implements UniqueColumnConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniqueColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnPackage.Literals.UNIQUE_COLUMN_CONSTRAINT;
	}

} //UniqueColumnConstraintImpl
