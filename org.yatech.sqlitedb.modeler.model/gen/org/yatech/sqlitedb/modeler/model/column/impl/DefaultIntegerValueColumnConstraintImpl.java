/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Integer Value Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DefaultIntegerValueColumnConstraintImpl extends DefaultValueColumnConstraintImpl<Long> implements DefaultIntegerValueColumnConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultIntegerValueColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnPackage.Literals.DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetValue(Long newValue, NotificationChain msgs) {
		return super.basicSetValue(newValue, msgs);
	}

} //DefaultIntegerValueColumnConstraintImpl
