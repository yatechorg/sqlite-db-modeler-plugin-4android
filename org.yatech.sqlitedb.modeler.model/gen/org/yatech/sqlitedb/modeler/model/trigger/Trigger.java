/**
 */
package org.yatech.sqlitedb.modeler.model.trigger;

import org.yatech.sqlitedb.modeler.model.Database;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.trigger.Trigger#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.trigger.TriggerPackage#getTrigger()
 * @model
 * @generated
 */
public interface Trigger extends NameProvider {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.Database#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' container reference.
	 * @see #setDatabase(Database)
	 * @see org.yatech.sqlitedb.modeler.model.trigger.TriggerPackage#getTrigger_Database()
	 * @see org.yatech.sqlitedb.modeler.model.Database#getTriggers
	 * @model opposite="triggers" required="true" transient="false"
	 * @generated
	 */
	Database getDatabase();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.trigger.Trigger#getDatabase <em>Database</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' container reference.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(Database value);

} // Trigger
