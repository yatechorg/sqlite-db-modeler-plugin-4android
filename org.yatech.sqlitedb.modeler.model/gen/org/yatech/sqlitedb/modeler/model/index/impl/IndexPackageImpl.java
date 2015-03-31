/**
 */
package org.yatech.sqlitedb.modeler.model.index.impl;

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

import org.yatech.sqlitedb.modeler.model.index.Index;
import org.yatech.sqlitedb.modeler.model.index.IndexFactory;
import org.yatech.sqlitedb.modeler.model.index.IndexPackage;

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
public class IndexPackageImpl extends EPackageImpl implements IndexPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indexEClass = null;

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
	 * @see org.yatech.sqlitedb.modeler.model.index.IndexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IndexPackageImpl() {
		super(eNS_URI, IndexFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link IndexPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IndexPackage init() {
		if (isInited) return (IndexPackage)EPackage.Registry.INSTANCE.getEPackage(IndexPackage.eNS_URI);

		// Obtain or create and register package
		IndexPackageImpl theIndexPackage = (IndexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IndexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IndexPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI) : ModelPackage.eINSTANCE);
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI) : CommonPackage.eINSTANCE);
		TablePackageImpl theTablePackage = (TablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) instanceof TablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TablePackage.eNS_URI) : TablePackage.eINSTANCE);
		ColumnPackageImpl theColumnPackage = (ColumnPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) instanceof ColumnPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ColumnPackage.eNS_URI) : ColumnPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		TriggerPackageImpl theTriggerPackage = (TriggerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) instanceof TriggerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TriggerPackage.eNS_URI) : TriggerPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);

		// Create package meta-data objects
		theIndexPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theCommonPackage.createPackageContents();
		theTablePackage.createPackageContents();
		theColumnPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theTriggerPackage.createPackageContents();
		theExpressionPackage.createPackageContents();

		// Initialize created meta-data
		theIndexPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theCommonPackage.initializePackageContents();
		theTablePackage.initializePackageContents();
		theColumnPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theTriggerPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIndexPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IndexPackage.eNS_URI, theIndexPackage);
		return theIndexPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndex() {
		return indexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndex_Database() {
		return (EReference)indexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexFactory getIndexFactory() {
		return (IndexFactory)getEFactoryInstance();
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
		indexEClass = createEClass(INDEX);
		createEReference(indexEClass, INDEX__DATABASE);
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
		ModelPackage theModelPackage = (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(indexEClass, Index.class, "Index", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndex_Database(), theModelPackage.getDatabase(), theModelPackage.getDatabase_Indexes(), "database", null, 1, 1, Index.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //IndexPackageImpl
