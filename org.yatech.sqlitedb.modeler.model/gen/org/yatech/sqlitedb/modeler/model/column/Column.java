/**
 */
package org.yatech.sqlitedb.modeler.model.column;

import org.eclipse.emf.common.util.EList;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

import org.yatech.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.Column#getTable <em>Table</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.Column#getType <em>Type</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.Column#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumn()
 * @model
 * @generated
 */
public interface Column extends NameProvider {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.table.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(Table)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumn_Table()
	 * @see org.yatech.sqlitedb.modeler.model.table.Table#getColumns
	 * @model opposite="columns" required="true" transient="false"
	 * @generated
	 */
	Table getTable();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.Column#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(Table value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.yatech.sqlitedb.modeler.model.column.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.yatech.sqlitedb.modeler.model.column.DataType
	 * @see #setType(DataType)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumn_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.Column#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.yatech.sqlitedb.modeler.model.column.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getColumn_Constraints()
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getColumn
	 * @model opposite="column" containment="true"
	 * @generated
	 */
	EList<ColumnConstraint> getConstraints();

} // Column
