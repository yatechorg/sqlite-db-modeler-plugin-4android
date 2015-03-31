/**
 */
package org.yatech.sqlitedb.modeler.model.table.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yatech.sqlitedb.modeler.model.table.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TableFactoryImpl extends EFactoryImpl implements TableFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TableFactory init() {
		try {
			TableFactory theTableFactory = (TableFactory)EPackage.Registry.INSTANCE.getEFactory(TablePackage.eNS_URI);
			if (theTableFactory != null) {
				return theTableFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TableFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TablePackage.TABLE: return createTable();
			case TablePackage.PRIMARY_KEY_TABLE_CONSTRAINT: return createPrimaryKeyTableConstraint();
			case TablePackage.UNIQUE_TABLE_CONSTRAINT: return createUniqueTableConstraint();
			case TablePackage.CHECK_TABLE_CONSTRAINT: return createCheckTableConstraint();
			case TablePackage.FOREIGN_KEY_TABLE_CONSTRAINT: return createForeignKeyTableConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyTableConstraint createPrimaryKeyTableConstraint() {
		PrimaryKeyTableConstraintImpl primaryKeyTableConstraint = new PrimaryKeyTableConstraintImpl();
		return primaryKeyTableConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueTableConstraint createUniqueTableConstraint() {
		UniqueTableConstraintImpl uniqueTableConstraint = new UniqueTableConstraintImpl();
		return uniqueTableConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckTableConstraint createCheckTableConstraint() {
		CheckTableConstraintImpl checkTableConstraint = new CheckTableConstraintImpl();
		return checkTableConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyTableConstraint createForeignKeyTableConstraint() {
		ForeignKeyTableConstraintImpl foreignKeyTableConstraint = new ForeignKeyTableConstraintImpl();
		return foreignKeyTableConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TablePackage getTablePackage() {
		return (TablePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TablePackage getPackage() {
		return TablePackage.eINSTANCE;
	}

} //TableFactoryImpl
