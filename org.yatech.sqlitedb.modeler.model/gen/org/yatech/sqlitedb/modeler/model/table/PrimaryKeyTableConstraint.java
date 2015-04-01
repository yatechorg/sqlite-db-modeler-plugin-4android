/**
 */
package org.yatech.sqlitedb.modeler.model.table;

import org.eclipse.emf.common.util.EList;
import org.yatech.sqlitedb.modeler.model.column.IndexedColumn;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key Table Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getPrimaryKeyTableConstraint()
 * @model
 * @generated
 */
public interface PrimaryKeyTableConstraint extends TableConstraint {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.column.IndexedColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.table.TablePackage#getPrimaryKeyTableConstraint_Columns()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IndexedColumn> getColumns();

} // PrimaryKeyTableConstraint
