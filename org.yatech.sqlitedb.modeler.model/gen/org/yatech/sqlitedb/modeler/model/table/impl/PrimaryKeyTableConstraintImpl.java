/**
 */
package org.yatech.sqlitedb.modeler.model.table.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yatech.sqlitedb.modeler.model.column.IndexedColumn;

import org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Key Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.impl.PrimaryKeyTableConstraintImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryKeyTableConstraintImpl extends TableConstraintImpl implements PrimaryKeyTableConstraint {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected IndexedColumn columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimaryKeyTableConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.PRIMARY_KEY_TABLE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexedColumn getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumns(IndexedColumn newColumns, NotificationChain msgs) {
		IndexedColumn oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS, oldColumns, newColumns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(IndexedColumn newColumns) {
		if (newColumns != columns) {
			NotificationChain msgs = null;
			if (columns != null)
				msgs = ((InternalEObject)columns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS, null, msgs);
			if (newColumns != null)
				msgs = ((InternalEObject)newColumns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS, null, msgs);
			msgs = basicSetColumns(newColumns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS, newColumns, newColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS:
				return basicSetColumns(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS:
				return getColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS:
				setColumns((IndexedColumn)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS:
				setColumns((IndexedColumn)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS:
				return columns != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimaryKeyTableConstraintImpl
