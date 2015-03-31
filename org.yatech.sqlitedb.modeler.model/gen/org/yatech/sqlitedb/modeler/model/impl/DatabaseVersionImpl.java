/**
 */
package org.yatech.sqlitedb.modeler.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.yatech.sqlitedb.modeler.model.Database;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.ModelPackage;

import org.yatech.sqlitedb.modeler.model.common.ColumnMapping;
import org.yatech.sqlitedb.modeler.model.common.TableMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Database Version</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl#getPreviousVersion <em>Previous Version</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl#getNextVersion <em>Next Version</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl#getTableMapping <em>Table Mapping</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl#getColumnMapping <em>Column Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatabaseVersionImpl extends MinimalEObjectImpl.Container implements DatabaseVersion {
	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * The cached value of the '{@link #getPreviousVersion() <em>Previous Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousVersion()
	 * @generated
	 * @ordered
	 */
	protected DatabaseVersion previousVersion;

	/**
	 * The cached value of the '{@link #getNextVersion() <em>Next Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextVersion()
	 * @generated
	 * @ordered
	 */
	protected DatabaseVersion nextVersion;

	/**
	 * The cached value of the '{@link #getTableMapping() <em>Table Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableMapping()
	 * @generated
	 * @ordered
	 */
	protected TableMapping tableMapping;

	/**
	 * The cached value of the '{@link #getColumnMapping() <em>Column Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumnMapping()
	 * @generated
	 * @ordered
	 */
	protected ColumnMapping columnMapping;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatabaseVersionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.DATABASE_VERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database getDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatabase(Database newDatabase, NotificationChain msgs) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__DATABASE, oldDatabase, newDatabase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		if (newDatabase != database) {
			NotificationChain msgs = null;
			if (database != null)
				msgs = ((InternalEObject)database).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DATABASE_VERSION__DATABASE, null, msgs);
			if (newDatabase != null)
				msgs = ((InternalEObject)newDatabase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DATABASE_VERSION__DATABASE, null, msgs);
			msgs = basicSetDatabase(newDatabase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__DATABASE, newDatabase, newDatabase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseVersion getPreviousVersion() {
		if (previousVersion != null && previousVersion.eIsProxy()) {
			InternalEObject oldPreviousVersion = (InternalEObject)previousVersion;
			previousVersion = (DatabaseVersion)eResolveProxy(oldPreviousVersion);
			if (previousVersion != oldPreviousVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION, oldPreviousVersion, previousVersion));
			}
		}
		return previousVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseVersion basicGetPreviousVersion() {
		return previousVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreviousVersion(DatabaseVersion newPreviousVersion, NotificationChain msgs) {
		DatabaseVersion oldPreviousVersion = previousVersion;
		previousVersion = newPreviousVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION, oldPreviousVersion, newPreviousVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreviousVersion(DatabaseVersion newPreviousVersion) {
		if (newPreviousVersion != previousVersion) {
			NotificationChain msgs = null;
			if (previousVersion != null)
				msgs = ((InternalEObject)previousVersion).eInverseRemove(this, ModelPackage.DATABASE_VERSION__NEXT_VERSION, DatabaseVersion.class, msgs);
			if (newPreviousVersion != null)
				msgs = ((InternalEObject)newPreviousVersion).eInverseAdd(this, ModelPackage.DATABASE_VERSION__NEXT_VERSION, DatabaseVersion.class, msgs);
			msgs = basicSetPreviousVersion(newPreviousVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION, newPreviousVersion, newPreviousVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseVersion getNextVersion() {
		if (nextVersion != null && nextVersion.eIsProxy()) {
			InternalEObject oldNextVersion = (InternalEObject)nextVersion;
			nextVersion = (DatabaseVersion)eResolveProxy(oldNextVersion);
			if (nextVersion != oldNextVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.DATABASE_VERSION__NEXT_VERSION, oldNextVersion, nextVersion));
			}
		}
		return nextVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseVersion basicGetNextVersion() {
		return nextVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextVersion(DatabaseVersion newNextVersion, NotificationChain msgs) {
		DatabaseVersion oldNextVersion = nextVersion;
		nextVersion = newNextVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__NEXT_VERSION, oldNextVersion, newNextVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextVersion(DatabaseVersion newNextVersion) {
		if (newNextVersion != nextVersion) {
			NotificationChain msgs = null;
			if (nextVersion != null)
				msgs = ((InternalEObject)nextVersion).eInverseRemove(this, ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION, DatabaseVersion.class, msgs);
			if (newNextVersion != null)
				msgs = ((InternalEObject)newNextVersion).eInverseAdd(this, ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION, DatabaseVersion.class, msgs);
			msgs = basicSetNextVersion(newNextVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__NEXT_VERSION, newNextVersion, newNextVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableMapping getTableMapping() {
		return tableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableMapping(TableMapping newTableMapping, NotificationChain msgs) {
		TableMapping oldTableMapping = tableMapping;
		tableMapping = newTableMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__TABLE_MAPPING, oldTableMapping, newTableMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableMapping(TableMapping newTableMapping) {
		if (newTableMapping != tableMapping) {
			NotificationChain msgs = null;
			if (tableMapping != null)
				msgs = ((InternalEObject)tableMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DATABASE_VERSION__TABLE_MAPPING, null, msgs);
			if (newTableMapping != null)
				msgs = ((InternalEObject)newTableMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DATABASE_VERSION__TABLE_MAPPING, null, msgs);
			msgs = basicSetTableMapping(newTableMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__TABLE_MAPPING, newTableMapping, newTableMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnMapping getColumnMapping() {
		return columnMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetColumnMapping(ColumnMapping newColumnMapping, NotificationChain msgs) {
		ColumnMapping oldColumnMapping = columnMapping;
		columnMapping = newColumnMapping;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__COLUMN_MAPPING, oldColumnMapping, newColumnMapping);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumnMapping(ColumnMapping newColumnMapping) {
		if (newColumnMapping != columnMapping) {
			NotificationChain msgs = null;
			if (columnMapping != null)
				msgs = ((InternalEObject)columnMapping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DATABASE_VERSION__COLUMN_MAPPING, null, msgs);
			if (newColumnMapping != null)
				msgs = ((InternalEObject)newColumnMapping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.DATABASE_VERSION__COLUMN_MAPPING, null, msgs);
			msgs = basicSetColumnMapping(newColumnMapping, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.DATABASE_VERSION__COLUMN_MAPPING, newColumnMapping, newColumnMapping));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION:
				if (previousVersion != null)
					msgs = ((InternalEObject)previousVersion).eInverseRemove(this, ModelPackage.DATABASE_VERSION__NEXT_VERSION, DatabaseVersion.class, msgs);
				return basicSetPreviousVersion((DatabaseVersion)otherEnd, msgs);
			case ModelPackage.DATABASE_VERSION__NEXT_VERSION:
				if (nextVersion != null)
					msgs = ((InternalEObject)nextVersion).eInverseRemove(this, ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION, DatabaseVersion.class, msgs);
				return basicSetNextVersion((DatabaseVersion)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.DATABASE_VERSION__DATABASE:
				return basicSetDatabase(null, msgs);
			case ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION:
				return basicSetPreviousVersion(null, msgs);
			case ModelPackage.DATABASE_VERSION__NEXT_VERSION:
				return basicSetNextVersion(null, msgs);
			case ModelPackage.DATABASE_VERSION__TABLE_MAPPING:
				return basicSetTableMapping(null, msgs);
			case ModelPackage.DATABASE_VERSION__COLUMN_MAPPING:
				return basicSetColumnMapping(null, msgs);
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
			case ModelPackage.DATABASE_VERSION__DATABASE:
				return getDatabase();
			case ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION:
				if (resolve) return getPreviousVersion();
				return basicGetPreviousVersion();
			case ModelPackage.DATABASE_VERSION__NEXT_VERSION:
				if (resolve) return getNextVersion();
				return basicGetNextVersion();
			case ModelPackage.DATABASE_VERSION__TABLE_MAPPING:
				return getTableMapping();
			case ModelPackage.DATABASE_VERSION__COLUMN_MAPPING:
				return getColumnMapping();
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
			case ModelPackage.DATABASE_VERSION__DATABASE:
				setDatabase((Database)newValue);
				return;
			case ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION:
				setPreviousVersion((DatabaseVersion)newValue);
				return;
			case ModelPackage.DATABASE_VERSION__NEXT_VERSION:
				setNextVersion((DatabaseVersion)newValue);
				return;
			case ModelPackage.DATABASE_VERSION__TABLE_MAPPING:
				setTableMapping((TableMapping)newValue);
				return;
			case ModelPackage.DATABASE_VERSION__COLUMN_MAPPING:
				setColumnMapping((ColumnMapping)newValue);
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
			case ModelPackage.DATABASE_VERSION__DATABASE:
				setDatabase((Database)null);
				return;
			case ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION:
				setPreviousVersion((DatabaseVersion)null);
				return;
			case ModelPackage.DATABASE_VERSION__NEXT_VERSION:
				setNextVersion((DatabaseVersion)null);
				return;
			case ModelPackage.DATABASE_VERSION__TABLE_MAPPING:
				setTableMapping((TableMapping)null);
				return;
			case ModelPackage.DATABASE_VERSION__COLUMN_MAPPING:
				setColumnMapping((ColumnMapping)null);
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
			case ModelPackage.DATABASE_VERSION__DATABASE:
				return database != null;
			case ModelPackage.DATABASE_VERSION__PREVIOUS_VERSION:
				return previousVersion != null;
			case ModelPackage.DATABASE_VERSION__NEXT_VERSION:
				return nextVersion != null;
			case ModelPackage.DATABASE_VERSION__TABLE_MAPPING:
				return tableMapping != null;
			case ModelPackage.DATABASE_VERSION__COLUMN_MAPPING:
				return columnMapping != null;
		}
		return super.eIsSet(featureID);
	}

} //DatabaseVersionImpl
