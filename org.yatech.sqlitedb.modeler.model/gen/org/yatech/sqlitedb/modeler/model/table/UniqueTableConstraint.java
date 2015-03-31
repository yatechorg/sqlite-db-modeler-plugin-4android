/**
 */
package org.yatech.sqlitedb.modeler.model.table;

import org.yatech.sqlitedb.modeler.model.column.IndexedColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getUniqueTableConstraint()
 * @model
 * @generated
 */
public interface UniqueTableConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference.
	 * @see #setColumns(IndexedColumn)
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getUniqueTableConstraint_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IndexedColumn getColumns();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint#getColumns <em>Columns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' containment reference.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(IndexedColumn value);

} // UniqueTableConstraint
