/**
 */
package org.yatech.sqlitedb.modeler.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yatech.sqlitedb.modeler.model.Database;
import org.yatech.sqlitedb.modeler.model.DatabaseVersion;
import org.yatech.sqlitedb.modeler.model.DatabaseVersions;
import org.yatech.sqlitedb.modeler.model.ModelFactory;
import org.yatech.sqlitedb.modeler.model.ModelPackage;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;

import org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl;

import org.yatech.sqlitedb.modeler.model.common.CommonPackage;

import org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl;

import org.yatech.sqlitedb.modeler.model.expression.ExpressionPackage;

import org.yatech.sqlitedb.modeler.model.expression.impl.ExpressionPackageImpl;

import org.yatech.sqlitedb.modeler.model.index.IndexPackage;

import org.yatech.sqlitedb.modeler.model.index.impl.IndexPackageImpl;

import org.yatech.sqlitedb.modeler.model.table.TablePackage;

import org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl;

import org.yatech.sqlitedb.modeler.model.trigger.TriggerPackage;

import org.yatech.sqlitedb.modeler.model.trigger.impl.TriggerPackageImpl;

import org.yatech.sqlitedb.modeler.model.view.ViewPackage;

import org.yatech.sqlitedb.modeler.model.view.impl.ViewPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseVersionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.yatech.sqlitedb.modeler.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) : ColumnPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		IndexPackageImpl theIndexPackage = (IndexPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) instanceof IndexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) : IndexPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theTablePackage.createPackageContents();
		theColumnPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theIndexPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theTablePackage.initializePackageContents();
		theColumnPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theIndexPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseVersions() {
		return databaseVersionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseVersions_Versions() {
		return (EReference)databaseVersionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseVersions_PackageName() {
		return (EAttribute)databaseVersionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDatabaseVersions_FileName() {
		return (EAttribute)databaseVersionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatabaseVersions__GetFirstVersion() {
		return databaseVersionsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatabaseVersions__GetLastVersion() {
		return databaseVersionsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDatabaseVersions__CreateVersion() {
		return databaseVersionsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseVersion() {
		return databaseVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseVersion_Database() {
		return (EReference)databaseVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseVersion_PreviousVersion() {
		return (EReference)databaseVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseVersion_NextVersion() {
		return (EReference)databaseVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseVersion_TableMapping() {
		return (EReference)databaseVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabaseVersion_ColumnMapping() {
		return (EReference)databaseVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Tables() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Views() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Triggers() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDatabase_Indexes() {
		return (EReference)databaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		databaseVersionsEClass = createEClass(DATABASE_VERSIONS);
		createEReference(databaseVersionsEClass, DATABASE_VERSIONS__VERSIONS);
		createEAttribute(databaseVersionsEClass, DATABASE_VERSIONS__PACKAGE_NAME);
		createEAttribute(databaseVersionsEClass, DATABASE_VERSIONS__FILE_NAME);
		createEOperation(databaseVersionsEClass, DATABASE_VERSIONS___GET_FIRST_VERSION);
		createEOperation(databaseVersionsEClass, DATABASE_VERSIONS___GET_LAST_VERSION);
		createEOperation(databaseVersionsEClass, DATABASE_VERSIONS___CREATE_VERSION);

		databaseVersionEClass = createEClass(DATABASE_VERSION);
		createEReference(databaseVersionEClass, DATABASE_VERSION__DATABASE);
		createEReference(databaseVersionEClass, DATABASE_VERSION__PREVIOUS_VERSION);
		createEReference(databaseVersionEClass, DATABASE_VERSION__NEXT_VERSION);
		createEReference(databaseVersionEClass, DATABASE_VERSION__TABLE_MAPPING);
		createEReference(databaseVersionEClass, DATABASE_VERSION__COLUMN_MAPPING);

		databaseEClass = createEClass(DATABASE);
		createEReference(databaseEClass, DATABASE__TABLES);
		createEReference(databaseEClass, DATABASE__VIEWS);
		createEReference(databaseEClass, DATABASE__TRIGGERS);
		createEReference(databaseEClass, DATABASE__INDEXES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CommonPackage theCommonPackage = (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);
		TablePackage theTablePackage = (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);
		ColumnPackage theColumnPackage = (ColumnPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI);
		ViewPackage theViewPackage = (ViewPackage)EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI);
		IndexPackage theIndexPackage = (IndexPackage)EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI);
		TriggerPackage theTriggerPackage = (TriggerPackage)EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theCommonPackage);
		getESubpackages().add(theTablePackage);
		getESubpackages().add(theColumnPackage);
		getESubpackages().add(theViewPackage);
		getESubpackages().add(theIndexPackage);
		getESubpackages().add(theTriggerPackage);
		getESubpackages().add(theExpressionPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		databaseEClass.getESuperTypes().add(theCommonPackage.getNameProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(databaseVersionsEClass, DatabaseVersions.class, "DatabaseVersions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseVersions_Versions(), this.getDatabaseVersion(), null, "versions", null, 1, -1, DatabaseVersions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseVersions_PackageName(), ecorePackage.getEString(), "packageName", null, 1, 1, DatabaseVersions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseVersions_FileName(), ecorePackage.getEString(), "fileName", null, 1, 1, DatabaseVersions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDatabaseVersions__GetFirstVersion(), this.getDatabaseVersion(), "getFirstVersion", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDatabaseVersions__GetLastVersion(), this.getDatabaseVersion(), "getLastVersion", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDatabaseVersions__CreateVersion(), this.getDatabaseVersion(), "createVersion", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(databaseVersionEClass, DatabaseVersion.class, "DatabaseVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabaseVersion_Database(), this.getDatabase(), null, "database", null, 1, 1, DatabaseVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseVersion_PreviousVersion(), this.getDatabaseVersion(), this.getDatabaseVersion_NextVersion(), "previousVersion", null, 0, 1, DatabaseVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseVersion_NextVersion(), this.getDatabaseVersion(), this.getDatabaseVersion_PreviousVersion(), "nextVersion", null, 0, 1, DatabaseVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseVersion_TableMapping(), theCommonPackage.getTableMapping(), null, "tableMapping", null, 0, 1, DatabaseVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseVersion_ColumnMapping(), theCommonPackage.getColumnMapping(), null, "columnMapping", null, 0, 1, DatabaseVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDatabase_Tables(), theTablePackage.getTable(), theTablePackage.getTable_Database(), "tables", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Views(), theViewPackage.getView(), theViewPackage.getView_Database(), "views", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Triggers(), theTriggerPackage.getTrigger(), theTriggerPackage.getTrigger_Database(), "triggers", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabase_Indexes(), theIndexPackage.getIndex(), theIndexPackage.getIndex_Database(), "indexes", null, 0, -1, Database.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
