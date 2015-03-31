/**
 */
package org.yatech.sqlitedb.modeler.model.view;

import org.yatech.sqlitedb.modeler.model.Database;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.view.View#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.view.ViewPackage#getView()
 * @model
 * @generated
 */
public interface View extends NameProvider {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.Database#getViews <em>Views</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' container reference.
	 * @see #setDatabase(Database)
	 * @see org.yatech.sqlitedb.modeler.model.view.ViewPackage#getView_Database()
	 * @see org.yatech.sqlitedb.modeler.model.Database#getViews
	 * @model opposite="views" required="true" transient="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.view.View#getDatabase <em>Database</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' container reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

} // View
