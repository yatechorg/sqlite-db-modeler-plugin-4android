/**
 */
package org.yatech.sqlitedb.modeler.model.table.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.yatech.sqlitedb.modeler.model.ModelPackage;

import org.yatech.sqlitedb.modeler.model.column.ColumnPackage;

import org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl;

import org.yatech.sqlitedb.modeler.model.common.CommonPackage;

import org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl;

import org.yatech.sqlitedb.modeler.model.expression.ExpressionPackage;

import org.yatech.sqlitedb.modeler.model.expression.impl.ExpressionPackageImpl;

import org.yatech.sqlitedb.modeler.model.impl.ModelPackageImpl;

import org.yatech.sqlitedb.modeler.model.index.IndexPackage;

import org.yatech.sqlitedb.modeler.model.index.impl.IndexPackageImpl;

import org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint;
import org.yatech.sqlitedb.modeler.model.table.Table;
import org.yatech.sqlitedb.modeler.model.table.TableConstraint;
import org.yatech.sqlitedb.modeler.model.table.TableFactory;
import org.yatech.sqlitedb.modeler.model.table.TablePackage;
import org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint;

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
public class TablePackageImpl extends EPackageImpl implements TablePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primaryKeyTableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uniqueTableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkTableConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreignKeyTableConstraintEClass = null;

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
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TablePackageImpl() {
		super(eNS_URI, TableFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TablePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TablePackage init() {
		if (isInited) return (TablePackage)EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI);

		// Obtain or create and register package
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TablePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) : ColumnPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		IndexPackageImpl theIndexPackage = (IndexPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) instanceof IndexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI) : IndexPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theTablePackage.createPackageContents();
		theModelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theColumnPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theIndexPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theTablePackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theColumnPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theIndexPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTablePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TablePackage.eNS_URI, theTablePackage);
		return theTablePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Database() {
		return (EReference)tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Columns() {
		return (EReference)tableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_Constraints() {
		return (EReference)tableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableConstraint() {
		return tableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableConstraint_Name() {
		return (EAttribute)tableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableConstraint_Table() {
		return (EReference)tableConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimaryKeyTableConstraint() {
		return primaryKeyTableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimaryKeyTableConstraint_Columns() {
		return (EReference)primaryKeyTableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniqueTableConstraint() {
		return uniqueTableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniqueTableConstraint_Columns() {
		return (EReference)uniqueTableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCheckTableConstraint() {
		return checkTableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCheckTableConstraint_Expression() {
		return (EReference)checkTableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForeignKeyTableConstraint() {
		return foreignKeyTableConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyTableConstraint_Columns() {
		return (EReference)foreignKeyTableConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyTableConstraint_ForeignTable() {
		return (EReference)foreignKeyTableConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForeignKeyTableConstraint_ForeignColumns() {
		return (EReference)foreignKeyTableConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFactory getTableFactory() {
		return (TableFactory)getEFactoryInstance();
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
		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__DATABASE);
		createEReference(tableEClass, TABLE__COLUMNS);
		createEReference(tableEClass, TABLE__CONSTRAINTS);

		tableConstraintEClass = createEClass(TABLE_CONSTRAINT);
		createEAttribute(tableConstraintEClass, TABLE_CONSTRAINT__NAME);
		createEReference(tableConstraintEClass, TABLE_CONSTRAINT__TABLE);

		primaryKeyTableConstraintEClass = createEClass(PRIMARY_KEY_TABLE_CONSTRAINT);
		createEReference(primaryKeyTableConstraintEClass, PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS);

		uniqueTableConstraintEClass = createEClass(UNIQUE_TABLE_CONSTRAINT);
		createEReference(uniqueTableConstraintEClass, UNIQUE_TABLE_CONSTRAINT__COLUMNS);

		checkTableConstraintEClass = createEClass(CHECK_TABLE_CONSTRAINT);
		createEReference(checkTableConstraintEClass, CHECK_TABLE_CONSTRAINT__EXPRESSION);

		foreignKeyTableConstraintEClass = createEClass(FOREIGN_KEY_TABLE_CONSTRAINT);
		createEReference(foreignKeyTableConstraintEClass, FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS);
		createEReference(foreignKeyTableConstraintEClass, FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE);
		createEReference(foreignKeyTableConstraintEClass, FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS);
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ColumnPackage theColumnPackage = (ColumnPackage)EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tableEClass.getESuperTypes().add(theCommonPackage.getNameProvider());
		primaryKeyTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		uniqueTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		checkTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());
		foreignKeyTableConstraintEClass.getESuperTypes().add(this.getTableConstraint());

		// Initialize classes, features, and operations; add parameters
		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_Database(), theModelPackage.getDatabase(), theModelPackage.getDatabase_Tables(), "database", null, 1, 1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Columns(), theColumnPackage.getColumn(), theColumnPackage.getColumn_Table(), "columns", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTable_Constraints(), this.getTableConstraint(), this.getTableConstraint_Table(), "constraints", null, 0, -1, Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableConstraintEClass, TableConstraint.class, "TableConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableConstraint_Name(), ecorePackage.getEString(), "name", null, 0, 1, TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableConstraint_Table(), this.getTable(), this.getTable_Constraints(), "table", null, 1, 1, TableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryKeyTableConstraintEClass, PrimaryKeyTableConstraint.class, "PrimaryKeyTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimaryKeyTableConstraint_Columns(), theColumnPackage.getIndexedColumn(), null, "columns", null, 1, 1, PrimaryKeyTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uniqueTableConstraintEClass, UniqueTableConstraint.class, "UniqueTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniqueTableConstraint_Columns(), theColumnPackage.getIndexedColumn(), null, "columns", null, 1, 1, UniqueTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkTableConstraintEClass, CheckTableConstraint.class, "CheckTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckTableConstraint_Expression(), theExpressionPackage.getExpression(), null, "expression", null, 1, 1, CheckTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreignKeyTableConstraintEClass, ForeignKeyTableConstraint.class, "ForeignKeyTableConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForeignKeyTableConstraint_Columns(), theColumnPackage.getColumn(), null, "columns", null, 1, -1, ForeignKeyTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyTableConstraint_ForeignTable(), this.getTable(), null, "foreignTable", null, 1, 1, ForeignKeyTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getForeignKeyTableConstraint_ForeignColumns(), theColumnPackage.getColumn(), null, "foreignColumns", null, 1, -1, ForeignKeyTableConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TablePackageImpl
