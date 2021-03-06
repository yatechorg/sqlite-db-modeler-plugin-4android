/**
 */
package org.yatech.sqlitedb.modeler.model.table.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

import org.yatech.sqlitedb.modeler.model.table.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage
 * @generated
 */
public class TableAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TablePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TablePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableSwitch<Adapter> modelSwitch =
		new TableSwitch<Adapter>() {
			@Override
			public Adapter caseTable(Table object) {
				return createTableAdapter();
			}
			@Override
			public Adapter caseTableConstraint(TableConstraint object) {
				return createTableConstraintAdapter();
			}
			@Override
			public Adapter casePrimaryKeyTableConstraint(PrimaryKeyTableConstraint object) {
				return createPrimaryKeyTableConstraintAdapter();
			}
			@Override
			public Adapter caseUniqueTableConstraint(UniqueTableConstraint object) {
				return createUniqueTableConstraintAdapter();
			}
			@Override
			public Adapter caseCheckTableConstraint(CheckTableConstraint object) {
				return createCheckTableConstraintAdapter();
			}
			@Override
			public Adapter caseForeignKeyTableConstraint(ForeignKeyTableConstraint object) {
				return createForeignKeyTableConstraintAdapter();
			}
			@Override
			public Adapter caseNameProvider(NameProvider object) {
				return createNameProviderAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.table.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.table.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.table.TableConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.table.TableConstraint
	 * @generated
	 */
	public Adapter createTableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint <em>Primary Key Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint
	 * @generated
	 */
	public Adapter createPrimaryKeyTableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint
	 * @generated
	 */
	public Adapter createUniqueTableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint <em>Check Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint
	 * @generated
	 */
	public Adapter createCheckTableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint <em>Foreign Key Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint
	 * @generated
	 */
	public Adapter createForeignKeyTableConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.common.NameProvider
	 * @generated
	 */
	public Adapter createNameProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TableAdapterFactory
