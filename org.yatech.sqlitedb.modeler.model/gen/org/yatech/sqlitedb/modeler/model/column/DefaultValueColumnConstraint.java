/**
 */
package org.yatech.sqlitedb.modeler.model.column;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Value Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getDefaultValueColumnConstraint()
 * @model abstract="true"
 * @generated
 */
public interface DefaultValueColumnConstraint<T> extends ColumnConstraint {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Object)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getDefaultValueColumnConstraint_Value()
	 * @model kind="reference" containment="true" required="true"
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

} // DefaultValueColumnConstraint
