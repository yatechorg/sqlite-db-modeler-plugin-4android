/**
 */
package org.yatech.sqlitedb.modeler.model.column;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage
 * @generated
 */
public interface ColumnFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ColumnFactory eINSTANCE = org.yatech.sqlitedb.modeler.model.column.impl.ColumnFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Indexed Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indexed Column</em>'.
	 * @generated
	 */
	IndexedColumn createIndexedColumn();

	/**
	 * Returns a new object of class '<em>Primary Key Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary Key Column Constraint</em>'.
	 * @generated
	 */
	PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint();

	/**
	 * Returns a new object of class '<em>Foreign Key Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Key Column Constraint</em>'.
	 * @generated
	 */
	ForeignKeyColumnConstraint createForeignKeyColumnConstraint();

	/**
	 * Returns a new object of class '<em>Not Null Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Null Column Constraint</em>'.
	 * @generated
	 */
	NotNullColumnConstraint createNotNullColumnConstraint();

	/**
	 * Returns a new object of class '<em>Unique Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Column Constraint</em>'.
	 * @generated
	 */
	UniqueColumnConstraint createUniqueColumnConstraint();

	/**
	 * Returns a new object of class '<em>Check Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Check Column Constraint</em>'.
	 * @generated
	 */
	CheckColumnConstraint createCheckColumnConstraint();

	/**
	 * Returns a new object of class '<em>Default Expression Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Expression Value Column Constraint</em>'.
	 * @generated
	 */
	DefaultExpressionValueColumnConstraint createDefaultExpressionValueColumnConstraint();

	/**
	 * Returns a new object of class '<em>Default String Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default String Value Column Constraint</em>'.
	 * @generated
	 */
	DefaultStringValueColumnConstraint createDefaultStringValueColumnConstraint();

	/**
	 * Returns a new object of class '<em>Default Integer Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Integer Value Column Constraint</em>'.
	 * @generated
	 */
	DefaultIntegerValueColumnConstraint createDefaultIntegerValueColumnConstraint();

	/**
	 * Returns a new object of class '<em>Default Real Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Real Value Column Constraint</em>'.
	 * @generated
	 */
	DefaultRealValueColumnConstraint createDefaultRealValueColumnConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ColumnPackage getColumnPackage();

} //ColumnFactory
