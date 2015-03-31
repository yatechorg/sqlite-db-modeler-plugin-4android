/**
 */
package org.yatech.sqlitedb.modeler.model;

import org.eclipse.emf.common.util.EList;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

import org.yatech.sqlitedb.modeler.model.index.Index;

import org.yatech.sqlitedb.modeler.model.table.Table;

import org.yatech.sqlitedb.modeler.model.trigger.Trigger;

import org.yatech.sqlitedb.modeler.model.view.View;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.Database#getTables <em>Tables</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.Database#getViews <em>Views</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.Database#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.Database#getIndexes <em>Indexes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.ModelPackage#getDatabase()
 * @model
 * @generated
 */
public interface Database extends NameProvider {
	/**
	 * Returns the value of the '<em><b>Tables</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.table.Table}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.table.Table#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tables</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.ModelPackage#getDatabase_Tables()
	 * @see org.yatech.sqlitedb.modeler.model.table.Table#getDatabase
	 * @model opposite="database" containment="true"
	 * @generated
	 */
	EList<Table> getTables();

	/**
	 * Returns the value of the '<em><b>Views</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.view.View}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.view.View#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Views</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Views</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.ModelPackage#getDatabase_Views()
	 * @see org.yatech.sqlitedb.modeler.model.view.View#getDatabase
	 * @model opposite="database" containment="true"
	 * @generated
	 */
	EList<View> getViews();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.trigger.Trigger}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.trigger.Trigger#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.ModelPackage#getDatabase_Triggers()
	 * @see org.yatech.sqlitedb.modeler.model.trigger.Trigger#getDatabase
	 * @model opposite="database" containment="true"
	 * @generated
	 */
	EList<Trigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Indexes</b></em>' containment reference list.
	 * The list contents are of type {@link org.yatech.sqlitedb.modeler.model.index.Index}.
	 * It is bidirectional and its opposite is '{@link org.yatech.sqlitedb.modeler.model.index.Index#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexes</em>' containment reference list.
	 * @see org.yatech.sqlitedb.modeler.model.ModelPackage#getDatabase_Indexes()
	 * @see org.yatech.sqlitedb.modeler.model.index.Index#getDatabase
	 * @model opposite="database" containment="true"
	 * @generated
	 */
	EList<Index> getIndexes();

} // Database
