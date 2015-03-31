/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yatech.sqlitedb.modeler.model.ModelPackage;

import org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.Column;
import org.yatech.sqlitedb.modeler.model.column.ColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.ColumnFactory;
import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;
import org.yatech.sqlitedb.modeler.model.column.DataType;
import org.yatech.sqlitedb.modeler.model.column.DefaultExpressionValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultRealValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.IndexedColumn;
import org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint;
import org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint;

import org.yatech.sqlitedb.modeler.model.common.CommonPackage;

import org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl;

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
public class ColumnPackageImpl extends EPackageImpl implements ColumnPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexedColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notNullColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultValueColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultExpressionValueColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultStringValueColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultIntegerValueColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultRealValueColumnConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataTypeEEnum = null;

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
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ColumnPackageImpl() {
		super(eNS_URI, ColumnFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ColumnPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ColumnPackage init() {
		if (isInited) return (ColumnPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI);

		// Obtain or create and register package
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ColumnPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		IndexPackageImpl theIndexPackage = (IndexPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) instanceof IndexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) : IndexPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theColumnPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theTablePackage.createPackageContents();
		theViewPackage.createPackageContents();
		theIndexPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theColumnPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theTablePackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theIndexPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theColumnPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ColumnPackage.eNS_URI, theColumnPackage);
		return theColumnPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Table() {
		return (EReference)columnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumn_Type() {
		return (EAttribute)columnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumn_Constraints() {
		return (EReference)columnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndexedColumn() {
		return indexedColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndexedColumn_Column() {
		return (EReference)indexedColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumnConstraint() {
		return columnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColumnConstraint_Name() {
		return (EAttribute)columnConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getColumnConstraint_Column() {
		return (EReference)columnConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKeyColumnConstraint() {
		return primaryKeyColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotNullColumnConstraint() {
		return notNullColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueColumnConstraint() {
		return uniqueColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckColumnConstraint() {
		return checkColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckColumnConstraint_Expression() {
		return (EReference)checkColumnConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultValueColumnConstraint() {
		return defaultValueColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultValueColumnConstraint_Value() {
		return (EReference)defaultValueColumnConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultExpressionValueColumnConstraint() {
		return defaultExpressionValueColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultStringValueColumnConstraint() {
		return defaultStringValueColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultIntegerValueColumnConstraint() {
		return defaultIntegerValueColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultRealValueColumnConstraint() {
		return defaultRealValueColumnConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataType() {
		return dataTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnFactory getColumnFactory() {
		return (ColumnFactory)getEFactoryInstance();
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
		columnEClass = createEClass(COLUMN);
		createEReference(columnEClass, COLUMN__TABLE);
		createEAttribute(columnEClass, COLUMN__TYPE);
		createEReference(columnEClass, COLUMN__CONSTRAINTS);

		indexedColumnEClass = createEClass(INDEXED_COLUMN);
		createEReference(indexedColumnEClass, INDEXED_COLUMN__COLUMN);

		columnConstraintEClass = createEClass(COLUMN_CONSTRAINT);
		createEAttribute(columnConstraintEClass, COLUMN_CONSTRAINT__NAME);
		createEReference(columnConstraintEClass, COLUMN_CONSTRAINT__COLUMN);

		primaryKeyColumnConstraintEClass = createEClass(PRIMARY_KEY_COLUMN_CONSTRAINT);

		notNullColumnConstraintEClass = createEClass(NOT_NULL_COLUMN_CONSTRAINT);

		uniqueColumnConstraintEClass = createEClass(UNIQUE_COLUMN_CONSTRAINT);

		checkColumnConstraintEClass = createEClass(CHECK_COLUMN_CONSTRAINT);
		createEReference(checkColumnConstraintEClass, CHECK_COLUMN_CONSTRAINT__EXPRESSION);

		defaultValueColumnConstraintEClass = createEClass(DEFAULT_VALUE_COLUMN_CONSTRAINT);
		createEReference(defaultValueColumnConstraintEClass, DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE);

		defaultExpressionValueColumnConstraintEClass = createEClass(DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT);

		defaultStringValueColumnConstraintEClass = createEClass(DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT);

		defaultIntegerValueColumnConstraintEClass = createEClass(DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT);

		defaultRealValueColumnConstraintEClass = createEClass(DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT);

		// Create enums
		dataTypeEEnum = createEEnum(DATA_TYPE);
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
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters
		ETypeParameter defaultValueColumnConstraintEClass_T = addETypeParameter(defaultValueColumnConstraintEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		columnEClass.getESuperTypes().add(theCommonPackage.getNameProvider());
		primaryKeyColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
		notNullColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
		uniqueColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
		checkColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
		defaultValueColumnConstraintEClass.getESuperTypes().add(this.getColumnConstraint());
		EGenericType g1 = createEGenericType(this.getDefaultValueColumnConstraint());
		EGenericType g2 = createEGenericType(theExpressionPackage.getExpression());
		g1.getETypeArguments().add(g2);
		defaultExpressionValueColumnConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDefaultValueColumnConstraint());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		defaultStringValueColumnConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDefaultValueColumnConstraint());
		g2 = createEGenericType(ecorePackage.getELongObject());
		g1.getETypeArguments().add(g2);
		defaultIntegerValueColumnConstraintEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getDefaultValueColumnConstraint());
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		defaultRealValueColumnConstraintEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getColumn_Table(), theTablePackage.getTable(), theTablePackage.getTable_Columns(), "table", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColumn_Type(), this.getDataType(), "type", null, 1, 1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumn_Constraints(), this.getColumnConstraint(), this.getColumnConstraint_Column(), "constraints", null, 0, -1, Column.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indexedColumnEClass, IndexedColumn.class, "IndexedColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndexedColumn_Column(), this.getColumn(), null, "column", null, 1, 1, IndexedColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnConstraintEClass, ColumnConstraint.class, "ColumnConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, ColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getColumnConstraint_Column(), this.getColumn(), this.getColumn_Constraints(), "column", null, 1, 1, ColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyColumnConstraintEClass, PrimaryKeyColumnConstraint.class, "PrimaryKeyColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(notNullColumnConstraintEClass, NotNullColumnConstraint.class, "NotNullColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uniqueColumnConstraintEClass, UniqueColumnConstraint.class, "UniqueColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkColumnConstraintEClass, CheckColumnConstraint.class, "CheckColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckColumnConstraint_Expression(), theExpressionPackage.getExpression(), null, "expression", null, 1, 1, CheckColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultValueColumnConstraintEClass, DefaultValueColumnConstraint.class, "DefaultValueColumnConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(defaultValueColumnConstraintEClass_T);
		initEReference(getDefaultValueColumnConstraint_Value(), g1, null, "value", null, 1, 1, DefaultValueColumnConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(defaultExpressionValueColumnConstraintEClass, DefaultExpressionValueColumnConstraint.class, "DefaultExpressionValueColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultStringValueColumnConstraintEClass, DefaultStringValueColumnConstraint.class, "DefaultStringValueColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultIntegerValueColumnConstraintEClass, DefaultIntegerValueColumnConstraint.class, "DefaultIntegerValueColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(defaultRealValueColumnConstraintEClass, DefaultRealValueColumnConstraint.class, "DefaultRealValueColumnConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataTypeEEnum, DataType.class, "DataType");
		addEEnumLiteral(dataTypeEEnum, DataType.NULL);
		addEEnumLiteral(dataTypeEEnum, DataType.INTEGER);
		addEEnumLiteral(dataTypeEEnum, DataType.REAL);
		addEEnumLiteral(dataTypeEEnum, DataType.TEXT);
		addEEnumLiteral(dataTypeEEnum, DataType.BLOB);
	}

} //ColumnPackageImpl
