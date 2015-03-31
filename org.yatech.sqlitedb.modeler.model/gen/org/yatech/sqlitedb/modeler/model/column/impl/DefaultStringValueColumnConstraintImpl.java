/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default String Value Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DefaultStringValueColumnConstraintImpl extends DefaultValueColumnConstraintImpl<String> implements DefaultStringValueColumnConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultStringValueColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnPackage.Literals.DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetValue(String newValue, NotificationChain msgs) {
		return super.basicSetValue(newValue, msgs);
	}

} //DefaultStringValueColumnConstraintImpl
