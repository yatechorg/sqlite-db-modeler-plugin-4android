/**
 */
package org.yatech.sqlitedb.modeler.model.index;

import org.eclipse.emf.ecore.EObject;

import org.yatech.sqlitedb.modeler.model.Database;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.index.Index#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.index.IndexPackage#getIndex()
 * @model abstract="true"
 * @generated
 */
public interface Index extends EObject {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.Database#getIndexes <em>Indexes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' container reference.
	 * @see #setDatabase(Database)
	 * @see org.yatech.sqlitedb.modeler.model.index.IndexPackage#getIndex_Database()
	 * @see org.yatech.sqlitedb.modeler.model.Database#getIndexes
	 * @model opposite="indexes" required="true" transient="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.index.Index#getDatabase <em>Database</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' container reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

} // Index
