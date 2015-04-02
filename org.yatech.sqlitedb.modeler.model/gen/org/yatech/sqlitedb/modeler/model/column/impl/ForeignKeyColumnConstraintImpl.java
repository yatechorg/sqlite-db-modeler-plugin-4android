/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yatech.sqlitedb.modeler.model.column.Column;
import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.ForeignKeyColumnConstraint;

import org.yatech.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.impl.ForeignKeyColumnConstraintImpl#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.impl.ForeignKeyColumnConstraintImpl#getForeignColumn <em>Foreign Column</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyColumnConstraintImpl extends ColumnConstraintImpl implements ForeignKeyColumnConstraint {
	/**
	 * The cached value of the '{@link #getForeignTable() <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignTable()
	 * @generated
	 * @ordered
	 */
	protected Table foreignTable;

	/**
	 * The cached value of the '{@link #getForeignColumn() <em>Foreign Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignColumn()
	 * @generated
	 * @ordered
	 */
	protected Column foreignColumn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyColumnConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ColumnPackage.Literals.FOREIGN_KEY_COLUMN_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getForeignTable() {
		if (foreignTable != null && foreignTable.eIsProxy()) {
			InternalEObject oldForeignTable = (InternalEObject)foreignTable;
			foreignTable = (Table)eResolveProxy(oldForeignTable);
			if (foreignTable != oldForeignTable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_TABLE, oldForeignTable, foreignTable));
			}
		}
		return foreignTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table basicGetForeignTable() {
		return foreignTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignTable(Table newForeignTable) {
		Table oldForeignTable = foreignTable;
		foreignTable = newForeignTable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_TABLE, oldForeignTable, foreignTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column getForeignColumn() {
		if (foreignColumn != null && foreignColumn.eIsProxy()) {
			InternalEObject oldForeignColumn = (InternalEObject)foreignColumn;
			foreignColumn = (Column)eResolveProxy(oldForeignColumn);
			if (foreignColumn != oldForeignColumn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_COLUMN, oldForeignColumn, foreignColumn));
			}
		}
		return foreignColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column basicGetForeignColumn() {
		return foreignColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeignColumn(Column newForeignColumn) {
		Column oldForeignColumn = foreignColumn;
		foreignColumn = newForeignColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_COLUMN, oldForeignColumn, foreignColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_TABLE:
				if (resolve) return getForeignTable();
				return basicGetForeignTable();
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_COLUMN:
				if (resolve) return getForeignColumn();
				return basicGetForeignColumn();
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
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_TABLE:
				setForeignTable((Table)newValue);
				return;
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_COLUMN:
				setForeignColumn((Column)newValue);
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
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_TABLE:
				setForeignTable((Table)null);
				return;
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_COLUMN:
				setForeignColumn((Column)null);
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
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_TABLE:
				return foreignTable != null;
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT__FOREIGN_COLUMN:
				return foreignColumn != null;
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyColumnConstraintImpl
