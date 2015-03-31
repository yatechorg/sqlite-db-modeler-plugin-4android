/**
 */
package org.yatech.sqlitedb.modeler.model.common;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry#getCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage#getMappingEntry()
 * @model
 * @generated
 */
public interface MappingEntry<T> extends EObject {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' attribute.
	 * @see #setPrevious(Object)
	 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage#getMappingEntry_Previous()
	 * @model
	 * @generated
	 */
	T getPrevious();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry#getPrevious <em>Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' attribute.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(T value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(Object)
	 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage#getMappingEntry_Current()
	 * @model
	 * @generated
	 */
	T getCurrent();

	/**
	 * Sets the value of the '{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry#getCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(T value);

} // MappingEntry
