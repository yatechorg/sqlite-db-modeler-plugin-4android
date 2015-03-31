/**
 */
package org.yatech.sqlitedb.modeler.model.table.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.yatech.sqlitedb.modeler.model.column.Column;

import org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.Table;
import org.yatech.sqlitedb.modeler.model.table.TablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foreign Key Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl#getForeignColumns <em>Foreign Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ForeignKeyTableConstraintImpl extends TableConstraintImpl implements ForeignKeyTableConstraint {
	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> columns;

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
	 * The cached value of the '{@link #getForeignColumns() <em>Foreign Columns</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeignColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<Column> foreignColumns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeignKeyTableConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TablePackage.Literals.FOREIGN_KEY_TABLE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getColumns() {
		if (columns == null) {
			columns = new EObjectResolvingEList<Column>(Column.class, this, TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS);
		}
		return columns;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE, oldForeignTable, foreignTable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE, oldForeignTable, foreignTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Column> getForeignColumns() {
		if (foreignColumns == null) {
			foreignColumns = new EObjectResolvingEList<Column>(Column.class, this, TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS);
		}
		return foreignColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS:
				return getColumns();
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE:
				if (resolve) return getForeignTable();
				return basicGetForeignTable();
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS:
				return getForeignColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends Column>)newValue);
				return;
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE:
				setForeignTable((Table)newValue);
				return;
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS:
				getForeignColumns().clear();
				getForeignColumns().addAll((Collection<? extends Column>)newValue);
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
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS:
				getColumns().clear();
				return;
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE:
				setForeignTable((Table)null);
				return;
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS:
				getForeignColumns().clear();
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
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS:
				return columns != null && !columns.isEmpty();
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE:
				return foreignTable != null;
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS:
				return foreignColumns != null && !foreignColumns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeignKeyTableConstraintImpl
