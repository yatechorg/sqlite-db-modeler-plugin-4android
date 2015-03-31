/**
 */
package org.yatech.sqlitedb.modeler.model.common.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yatech.sqlitedb.modeler.model.ModelPackage;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;

import org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl;

import org.yatech.sqlitedb.modeler.model.common.ColumnMapping;
import org.yatech.sqlitedb.modeler.model.common.CommonFactory;
import org.yatech.sqlitedb.modeler.model.common.CommonPackage;
import org.yatech.sqlitedb.modeler.model.common.MappingEntry;
import org.yatech.sqlitedb.modeler.model.common.NameProvider;
import org.yatech.sqlitedb.modeler.model.common.TableMapping;

import org.yatech.sqlitedb.modeler.model.expression.ExpressionPackage;

import org.yatech.sqlitedb.modeler.model.expression.impl.ExpressionPackageImpl;

import org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl;

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
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToTableMappingEntryMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToColumnMappingEntryMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

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
	 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) : ColumnPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		IndexPackageImpl theIndexPackage = (IndexPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) instanceof IndexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) : IndexPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theCommonPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theTablePackage.createPackageContents();
		theColumnPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theIndexPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theTablePackage.initializePackageContents();
		theColumnPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theIndexPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameProvider() {
		return nameProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameProvider_Name() {
		return (EAttribute)nameProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingEntry() {
		return mappingEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingEntry_Previous() {
		return (EAttribute)mappingEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMappingEntry_Current() {
		return (EAttribute)mappingEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToTableMappingEntryMap() {
		return stringToTableMappingEntryMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToTableMappingEntryMap_Key() {
		return (EAttribute)stringToTableMappingEntryMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToTableMappingEntryMap_Value() {
		return (EReference)stringToTableMappingEntryMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToColumnMappingEntryMap() {
		return stringToColumnMappingEntryMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToColumnMappingEntryMap_Key() {
		return (EAttribute)stringToColumnMappingEntryMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToColumnMappingEntryMap_Value() {
		return (EReference)stringToColumnMappingEntryMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableMapping() {
		return tableMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_Prev2entryMap() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_Curr2entryMap() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableMapping_Entries() {
		return (EReference)tableMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableMapping__GetPrevious__Table() {
		return tableMappingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableMapping__GetAllPrevious() {
		return tableMappingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableMapping__GetCurrent__Table() {
		return tableMappingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableMapping__GetAllCurrent() {
		return tableMappingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableMapping__Put__Table_Table() {
		return tableMappingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableMapping__Entries() {
		return tableMappingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnMapping() {
		return columnMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnMapping_Prev2entryMap() {
		return (EReference)columnMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnMapping_Curr2entryMap() {
		return (EReference)columnMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnMapping_Entries() {
		return (EReference)columnMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnMapping__GetPrevious__Column() {
		return columnMappingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnMapping__GetAllPrevious() {
		return columnMappingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnMapping__GetCurrent__Column() {
		return columnMappingEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnMapping__GetAllCurrent() {
		return columnMappingEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnMapping__Put__Column_Column() {
		return columnMappingEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColumnMapping__Entries() {
		return columnMappingEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
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
		nameProviderEClass = createEClass(NAME_PROVIDER);
		createEAttribute(nameProviderEClass, NAME_PROVIDER__NAME);

		mappingEntryEClass = createEClass(MAPPING_ENTRY);
		createEAttribute(mappingEntryEClass, MAPPING_ENTRY__PREVIOUS);
		createEAttribute(mappingEntryEClass, MAPPING_ENTRY__CURRENT);

		stringToTableMappingEntryMapEClass = createEClass(STRING_TO_TABLE_MAPPING_ENTRY_MAP);
		createEAttribute(stringToTableMappingEntryMapEClass, STRING_TO_TABLE_MAPPING_ENTRY_MAP__KEY);
		createEReference(stringToTableMappingEntryMapEClass, STRING_TO_TABLE_MAPPING_ENTRY_MAP__VALUE);

		stringToColumnMappingEntryMapEClass = createEClass(STRING_TO_COLUMN_MAPPING_ENTRY_MAP);
		createEAttribute(stringToColumnMappingEntryMapEClass, STRING_TO_COLUMN_MAPPING_ENTRY_MAP__KEY);
		createEReference(stringToColumnMappingEntryMapEClass, STRING_TO_COLUMN_MAPPING_ENTRY_MAP__VALUE);

		tableMappingEClass = createEClass(TABLE_MAPPING);
		createEReference(tableMappingEClass, TABLE_MAPPING__PREV2ENTRY_MAP);
		createEReference(tableMappingEClass, TABLE_MAPPING__CURR2ENTRY_MAP);
		createEReference(tableMappingEClass, TABLE_MAPPING__ENTRIES);
		createEOperation(tableMappingEClass, TABLE_MAPPING___GET_PREVIOUS__TABLE);
		createEOperation(tableMappingEClass, TABLE_MAPPING___GET_ALL_PREVIOUS);
		createEOperation(tableMappingEClass, TABLE_MAPPING___GET_CURRENT__TABLE);
		createEOperation(tableMappingEClass, TABLE_MAPPING___GET_ALL_CURRENT);
		createEOperation(tableMappingEClass, TABLE_MAPPING___PUT__TABLE_TABLE);
		createEOperation(tableMappingEClass, TABLE_MAPPING___ENTRIES);

		columnMappingEClass = createEClass(COLUMN_MAPPING);
		createEReference(columnMappingEClass, COLUMN_MAPPING__PREV2ENTRY_MAP);
		createEReference(columnMappingEClass, COLUMN_MAPPING__CURR2ENTRY_MAP);
		createEReference(columnMappingEClass, COLUMN_MAPPING__ENTRIES);
		createEOperation(columnMappingEClass, COLUMN_MAPPING___GET_PREVIOUS__COLUMN);
		createEOperation(columnMappingEClass, COLUMN_MAPPING___GET_ALL_PREVIOUS);
		createEOperation(columnMappingEClass, COLUMN_MAPPING___GET_CURRENT__COLUMN);
		createEOperation(columnMappingEClass, COLUMN_MAPPING___GET_ALL_CURRENT);
		createEOperation(columnMappingEClass, COLUMN_MAPPING___PUT__COLUMN_COLUMN);
		createEOperation(columnMappingEClass, COLUMN_MAPPING___ENTRIES);

		// Create data types
		collectionEDataType = createEDataType(COLLECTION);
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
		TablePackage theTablePackage = (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);
		ColumnPackage theColumnPackage = (ColumnPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI);

		// Create type parameters
		ETypeParameter mappingEntryEClass_T = addETypeParameter(mappingEntryEClass, "T");
		addETypeParameter(collectionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(nameProviderEClass, NameProvider.class, "NameProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameProvider_Name(), ecorePackage.getEString(), "name", null, 1, 1, NameProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEntryEClass, MappingEntry.class, "MappingEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(mappingEntryEClass_T);
		initEAttribute(getMappingEntry_Previous(), g1, "previous", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(mappingEntryEClass_T);
		initEAttribute(getMappingEntry_Current(), g1, "current", null, 0, 1, MappingEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToTableMappingEntryMapEClass, Map.Entry.class, "StringToTableMappingEntryMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToTableMappingEntryMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMappingEntry());
		EGenericType g2 = createEGenericType(theTablePackage.getTable());
		g1.getETypeArguments().add(g2);
		initEReference(getStringToTableMappingEntryMap_Value(), g1, null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToColumnMappingEntryMapEClass, Map.Entry.class, "StringToColumnMappingEntryMap", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToColumnMappingEntryMap_Key(), ecorePackage.getEString(), "key", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMappingEntry());
		g2 = createEGenericType(theColumnPackage.getColumn());
		g1.getETypeArguments().add(g2);
		initEReference(getStringToColumnMappingEntryMap_Value(), g1, null, "value", null, 1, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableMappingEClass, TableMapping.class, "TableMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableMapping_Prev2entryMap(), this.getStringToTableMappingEntryMap(), null, "prev2entryMap", null, 0, -1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableMapping_Curr2entryMap(), this.getStringToTableMappingEntryMap(), null, "curr2entryMap", null, 0, -1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMappingEntry());
		g2 = createEGenericType(theTablePackage.getTable());
		g1.getETypeArguments().add(g2);
		initEReference(getTableMapping_Entries(), g1, null, "entries", null, 0, -1, TableMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getTableMapping__GetPrevious__Table(), theTablePackage.getTable(), "getPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTablePackage.getTable(), "current", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTableMapping__GetAllPrevious(), null, "getAllPrevious", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theTablePackage.getTable());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTableMapping__GetCurrent__Table(), theTablePackage.getTable(), "getCurrent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTablePackage.getTable(), "previous", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTableMapping__GetAllCurrent(), null, "getAllCurrent", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theTablePackage.getTable());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getTableMapping__Put__Table_Table(), null, "put", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTablePackage.getTable(), "previous", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theTablePackage.getTable(), "current", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTableMapping__Entries(), null, "entries", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getMappingEntry());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(theTablePackage.getTable());
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		initEClass(columnMappingEClass, ColumnMapping.class, "ColumnMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumnMapping_Prev2entryMap(), this.getStringToColumnMappingEntryMap(), null, "prev2entryMap", null, 0, -1, ColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnMapping_Curr2entryMap(), this.getStringToColumnMappingEntryMap(), null, "curr2entryMap", null, 0, -1, ColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getMappingEntry());
		g2 = createEGenericType(theColumnPackage.getColumn());
		g1.getETypeArguments().add(g2);
		initEReference(getColumnMapping_Entries(), g1, null, "entries", null, 0, -1, ColumnMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getColumnMapping__GetPrevious__Column(), theColumnPackage.getColumn(), "getPrevious", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theColumnPackage.getColumn(), "current", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColumnMapping__GetAllPrevious(), null, "getAllPrevious", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theColumnPackage.getColumn());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getColumnMapping__GetCurrent__Column(), theColumnPackage.getColumn(), "getCurrent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theColumnPackage.getColumn(), "previous", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColumnMapping__GetAllCurrent(), null, "getAllCurrent", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theColumnPackage.getColumn());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getColumnMapping__Put__Column_Column(), null, "put", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theColumnPackage.getColumn(), "previous", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theColumnPackage.getColumn(), "current", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getColumnMapping__Entries(), null, "entries", 1, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getMappingEntry());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theColumnPackage.getColumn());
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //CommonPackageImpl
