/**
 */
package org.yatech.sqlitedb.modeler.model.table;

import org.eclipse.emf.common.util.EList;

import org.yatech.sqlitedb.modeler.model.column.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignTable <em>Foreign Table</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignColumns <em>Foreign Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getForeignKeyTableConstraint()
 * @model
 * @generated
 */
public interface ForeignKeyTableConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.column.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' reference list.
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getForeignKeyTableConstraint_Columns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getColumns();

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
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getForeignKeyTableConstraint_ForeignTable()
	 * @model required="true"
	 * @generated
	 */
	Table getForeignTable();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignTable <em>Foreign Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreign Table</em>' reference.
	 * @see #getForeignTable()
	 * @generated
	 */
	void setForeignTable(Table value);

	/**
	 * Returns the value of the '<em><b>Foreign Columns</b></em>' reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.column.Column}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreign Columns</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreign Columns</em>' reference list.
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getForeignKeyTableConstraint_ForeignColumns()
	 * @model required="true"
	 * @generated
	 */
	EList<Column> getForeignColumns();

} // ForeignKeyTableConstraint
