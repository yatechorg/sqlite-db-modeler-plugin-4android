/**
 */
package org.yatech.sqlitedb.modeler.model.column;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getName <em>Name</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getColumn <em>Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumnConstraint()
 * @model abstract="true"
 * @generated
 */
public interface ColumnConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumnConstraint_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.column.Column#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' container reference.
	 * @see #setColumn(Column)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumnConstraint_Column()
	 * @see org.yatech.sqlitedb.modeler.model.column.Column#getConstraints
	 * @model opposite="constraints" required="true" transient="false"
	 * @generated
	 */
	Column getColumn();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getColumn <em>Column</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' container reference.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(Column value);

} // ColumnConstraint
