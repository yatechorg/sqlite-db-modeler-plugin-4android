/**
 */
package org.yatech.sqlitedb.modeler.model.table;

import org.eclipse.emf.common.util.EList;

import org.yatech.sqlitedb.modeler.model.Database;

import org.yatech.sqlitedb.modeler.model.column.Column;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.Table#getDatabase <em>Database</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.Table#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.Table#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getTable()
 * @model
 * @generated
 */
public interface Table extends NameProvider {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.Database#getTables <em>Tables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' container reference.
	 * @see #setDatabase(Database)
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getTable_Database()
	 * @see org.yatech.sqlitedb.modeler.model.Database#getTables
	 * @model opposite="tables" required="true" transient="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.table.Table#getDatabase <em>Database</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' container reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.column.Column}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.column.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getTable_Columns()
	 * @see org.yatech.sqlitedb.modeler.model.column.Column#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<Column> getColumns();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.table.TableConstraint}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.table.TableConstraint#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getTable_Constraints()
	 * @see org.yatech.sqlitedb.modeler.model.table.TableConstraint#getTable
	 * @model opposite="table" containment="true"
	 * @generated
	 */
	EList<TableConstraint> getConstraints();

} // Table
