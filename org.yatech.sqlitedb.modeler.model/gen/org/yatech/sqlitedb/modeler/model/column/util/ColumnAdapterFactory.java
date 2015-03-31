/**
 */
package org.yatech.sqlitedb.modeler.model.column.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.yatech.sqlitedb.modeler.model.column.*;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage
 * @generated
 */
public class ColumnAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColumnPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ColumnPackage.eINSTANCE;
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
	protected ColumnSwitch<Adapter> modelSwitch =
		new ColumnSwitch<Adapter>() {
			@Override
			public Adapter caseColumn(Column object) {
				return createColumnAdapter();
			}
			@Override
			public Adapter caseIndexedColumn(IndexedColumn object) {
				return createIndexedColumnAdapter();
			}
			@Override
			public Adapter caseColumnConstraint(ColumnConstraint object) {
				return createColumnConstraintAdapter();
			}
			@Override
			public Adapter casePrimaryKeyColumnConstraint(PrimaryKeyColumnConstraint object) {
				return createPrimaryKeyColumnConstraintAdapter();
			}
			@Override
			public Adapter caseNotNullColumnConstraint(NotNullColumnConstraint object) {
				return createNotNullColumnConstraintAdapter();
			}
			@Override
			public Adapter caseUniqueColumnConstraint(UniqueColumnConstraint object) {
				return createUniqueColumnConstraintAdapter();
			}
			@Override
			public Adapter caseCheckColumnConstraint(CheckColumnConstraint object) {
				return createCheckColumnConstraintAdapter();
			}
			@Override
			public <T> Adapter caseDefaultValueColumnConstraint(DefaultValueColumnConstraint<T> object) {
				return createDefaultValueColumnConstraintAdapter();
			}
			@Override
			public Adapter caseDefaultExpressionValueColumnConstraint(DefaultExpressionValueColumnConstraint object) {
				return createDefaultExpressionValueColumnConstraintAdapter();
			}
			@Override
			public Adapter caseDefaultStringValueColumnConstraint(DefaultStringValueColumnConstraint object) {
				return createDefaultStringValueColumnConstraintAdapter();
			}
			@Override
			public Adapter caseDefaultIntegerValueColumnConstraint(DefaultIntegerValueColumnConstraint object) {
				return createDefaultIntegerValueColumnConstraintAdapter();
			}
			@Override
			public Adapter caseDefaultRealValueColumnConstraint(DefaultRealValueColumnConstraint object) {
				return createDefaultRealValueColumnConstraintAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.Column
	 * @generated
	 */
	public Adapter createColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.IndexedColumn <em>Indexed Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.IndexedColumn
	 * @generated
	 */
	public Adapter createIndexedColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnConstraint
	 * @generated
	 */
	public Adapter createColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint
	 * @generated
	 */
	public Adapter createPrimaryKeyColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint <em>Not Null Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint
	 * @generated
	 */
	public Adapter createNotNullColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint <em>Unique Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint
	 * @generated
	 */
	public Adapter createUniqueColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint <em>Check Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint
	 * @generated
	 */
	public Adapter createCheckColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint <em>Default Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint
	 * @generated
	 */
	public Adapter createDefaultValueColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultExpressionValueColumnConstraint <em>Default Expression Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultExpressionValueColumnConstraint
	 * @generated
	 */
	public Adapter createDefaultExpressionValueColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint <em>Default String Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint
	 * @generated
	 */
	public Adapter createDefaultStringValueColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint <em>Default Integer Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint
	 * @generated
	 */
	public Adapter createDefaultIntegerValueColumnConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultRealValueColumnConstraint <em>Default Real Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultRealValueColumnConstraint
	 * @generated
	 */
	public Adapter createDefaultRealValueColumnConstraintAdapter() {
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

} //ColumnAdapterFactory
