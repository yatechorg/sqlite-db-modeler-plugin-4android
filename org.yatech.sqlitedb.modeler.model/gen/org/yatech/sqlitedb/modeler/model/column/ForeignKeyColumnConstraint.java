/**
 */
package org.yatech.sqlitedb.modeler.model.column;

import org.yatech.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Column Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.ForeignKeyColumnConstraint#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.column.ForeignKeyColumnConstraint#getForeignColumn <em>Foreign Column</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getForeignKeyColumnConstraint()
 * @model
 * @generated
 */
public interface ForeignKeyColumnConstraint extends ColumnConstraint {
	/**
	 * Returns the value of the '<em><b>Foreign Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Table</em>' reference.
	 * @see #setForeignTable(Table)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getForeignKeyColumnConstraint_ForeignTable()
	 * @model required="true"
	 * @generated
	 */
	Table getForeignTable();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.ForeignKeyColumnConstraint#getForeignTable <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Table</em>' reference.
	 * @see #getForeignTable()
	 * @generated
	 */
	void setForeignTable(Table value);

	/**
	 * Returns the value of the '<em><b>Foreign Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Column</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Column</em>' reference.
	 * @see #setForeignColumn(Column)
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage#getForeignKeyColumnConstraint_ForeignColumn()
	 * @model required="true"
	 * @generated
	 */
	Column getForeignColumn();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.column.ForeignKeyColumnConstraint#getForeignColumn <em>Foreign Column</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Column</em>' reference.
	 * @see #getForeignColumn()
	 * @generated
	 */
	void setForeignColumn(Column value);

} // ForeignKeyColumnConstraint
