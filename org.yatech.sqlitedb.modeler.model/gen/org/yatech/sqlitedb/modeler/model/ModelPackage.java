/**
 */
package org.yatech.sqlitedb.modeler.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yatech.sqlitedb.modeler.model.common.CommonPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yatech.org/sqlitedb/modeler/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.yatech.sqlitedb.modeler";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionsImpl <em>Database Versions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionsImpl
	 * @see org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl#getDatabaseVersions()
	 * @generated
	 */
	int DATABASE_VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS__VERSIONS = 0;

	/**
	 * The feature id for the '<em><b>Package Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS__PACKAGE_NAME = 1;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS__FILE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Database Versions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get First Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS___GET_FIRST_VERSION = 0;

	/**
	 * The operation id for the '<em>Get Last Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS___GET_LAST_VERSION = 1;

	/**
	 * The operation id for the '<em>Create Version</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS___CREATE_VERSION = 2;

	/**
	 * The number of operations of the '<em>Database Versions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSIONS_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl <em>Database Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl
	 * @see org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl#getDatabaseVersion()
	 * @generated
	 */
	int DATABASE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Database</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION__DATABASE = 0;

	/**
	 * The feature id for the '<em><b>Previous Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION__PREVIOUS_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Next Version</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION__NEXT_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Table Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION__TABLE_MAPPING = 3;

	/**
	 * The feature id for the '<em><b>Column Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION__COLUMN_MAPPING = 4;

	/**
	 * The number of structural features of the '<em>Database Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Database Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.impl.DatabaseImpl
	 * @see org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__NAME = CommonPackage.NAME_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Tables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__TABLES = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Views</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__VIEWS = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__TRIGGERS = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indexes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE__INDEXES = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = CommonPackage.NAME_PROVIDER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions <em>Database Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Versions</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions
	 * @generated
	 */
	EClass getDatabaseVersions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions#getVersions <em>Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Versions</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions#getVersions()
	 * @see #getDatabaseVersions()
	 * @generated
	 */
	EReference getDatabaseVersions_Versions();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions#getPackageName <em>Package Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Name</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions#getPackageName()
	 * @see #getDatabaseVersions()
	 * @generated
	 */
	EAttribute getDatabaseVersions_PackageName();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions#getFileName()
	 * @see #getDatabaseVersions()
	 * @generated
	 */
	EAttribute getDatabaseVersions_FileName();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions#getFirstVersion() <em>Get First Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get First Version</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions#getFirstVersion()
	 * @generated
	 */
	EOperation getDatabaseVersions__GetFirstVersion();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions#getLastVersion() <em>Get Last Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Last Version</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions#getLastVersion()
	 * @generated
	 */
	EOperation getDatabaseVersions__GetLastVersion();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersions#createVersion() <em>Create Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Version</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersions#createVersion()
	 * @generated
	 */
	EOperation getDatabaseVersions__CreateVersion();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersion <em>Database Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database Version</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersion
	 * @generated
	 */
	EClass getDatabaseVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersion#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Database</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersion#getDatabase()
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	EReference getDatabaseVersion_Database();

	/**
	 * Returns the meta object for the reference '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersion#getPreviousVersion <em>Previous Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Version</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersion#getPreviousVersion()
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	EReference getDatabaseVersion_PreviousVersion();

	/**
	 * Returns the meta object for the reference '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersion#getNextVersion <em>Next Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next Version</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersion#getNextVersion()
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	EReference getDatabaseVersion_NextVersion();

	/**
	 * Returns the meta object for the containment reference '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersion#getTableMapping <em>Table Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table Mapping</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersion#getTableMapping()
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	EReference getDatabaseVersion_TableMapping();

	/**
	 * Returns the meta object for the containment reference '{@link org.yatech.sqlitedb.modeler.model.DatabaseVersion#getColumnMapping <em>Column Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Column Mapping</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.DatabaseVersion#getColumnMapping()
	 * @see #getDatabaseVersion()
	 * @generated
	 */
	EReference getDatabaseVersion_ColumnMapping();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.Database#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tables</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.Database#getTables()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Tables();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.Database#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Views</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.Database#getViews()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Views();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.Database#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.Database#getTriggers()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Triggers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.Database#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indexes</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.Database#getIndexes()
	 * @see #getDatabase()
	 * @generated
	 */
	EReference getDatabase_Indexes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionsImpl <em>Database Versions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionsImpl
		 * @see org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl#getDatabaseVersions()
		 * @generated
		 */
		EClass DATABASE_VERSIONS = eINSTANCE.getDatabaseVersions();

		/**
		 * The meta object literal for the '<em><b>Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_VERSIONS__VERSIONS = eINSTANCE.getDatabaseVersions_Versions();

		/**
		 * The meta object literal for the '<em><b>Package Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_VERSIONS__PACKAGE_NAME = eINSTANCE.getDatabaseVersions_PackageName();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATABASE_VERSIONS__FILE_NAME = eINSTANCE.getDatabaseVersions_FileName();

		/**
		 * The meta object literal for the '<em><b>Get First Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_VERSIONS___GET_FIRST_VERSION = eINSTANCE.getDatabaseVersions__GetFirstVersion();

		/**
		 * The meta object literal for the '<em><b>Get Last Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_VERSIONS___GET_LAST_VERSION = eINSTANCE.getDatabaseVersions__GetLastVersion();

		/**
		 * The meta object literal for the '<em><b>Create Version</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATABASE_VERSIONS___CREATE_VERSION = eINSTANCE.getDatabaseVersions__CreateVersion();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl <em>Database Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.impl.DatabaseVersionImpl
		 * @see org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl#getDatabaseVersion()
		 * @generated
		 */
		EClass DATABASE_VERSION = eINSTANCE.getDatabaseVersion();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_VERSION__DATABASE = eINSTANCE.getDatabaseVersion_Database();

		/**
		 * The meta object literal for the '<em><b>Previous Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_VERSION__PREVIOUS_VERSION = eINSTANCE.getDatabaseVersion_PreviousVersion();

		/**
		 * The meta object literal for the '<em><b>Next Version</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_VERSION__NEXT_VERSION = eINSTANCE.getDatabaseVersion_NextVersion();

		/**
		 * The meta object literal for the '<em><b>Table Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_VERSION__TABLE_MAPPING = eINSTANCE.getDatabaseVersion_TableMapping();

		/**
		 * The meta object literal for the '<em><b>Column Mapping</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE_VERSION__COLUMN_MAPPING = eINSTANCE.getDatabaseVersion_ColumnMapping();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.impl.DatabaseImpl
		 * @see org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '<em><b>Tables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__TABLES = eINSTANCE.getDatabase_Tables();

		/**
		 * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__VIEWS = eINSTANCE.getDatabase_Views();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__TRIGGERS = eINSTANCE.getDatabase_Triggers();

		/**
		 * The meta object literal for the '<em><b>Indexes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATABASE__INDEXES = eINSTANCE.getDatabase_Indexes();

	}

} //ModelPackage
