/**
 */
package org.yatech.sqlitedb.modeler.model.table;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage
 * @generated
 */
public interface TableFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TableFactory eINSTANCE = org.yatech.sqlitedb.modeler.model.table.impl.TableFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Primary Key Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key Table Constraint</em>'.
	 * @generated
	 */
	PrimaryKeyTableConstraint createPrimaryKeyTableConstraint();

	/**
	 * Returns a new object of class '<em>Unique Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Table Constraint</em>'.
	 * @generated
	 */
	UniqueTableConstraint createUniqueTableConstraint();

	/**
	 * Returns a new object of class '<em>Check Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Table Constraint</em>'.
	 * @generated
	 */
	CheckTableConstraint createCheckTableConstraint();

	/**
	 * Returns a new object of class '<em>Foreign Key Table Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key Table Constraint</em>'.
	 * @generated
	 */
	ForeignKeyTableConstraint createForeignKeyTableConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TablePackage getTablePackage();

} //TableFactory
