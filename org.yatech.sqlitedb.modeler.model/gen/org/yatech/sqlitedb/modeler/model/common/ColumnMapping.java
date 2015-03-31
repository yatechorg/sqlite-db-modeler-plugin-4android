/**
 */
package org.yatech.sqlitedb.modeler.model.common;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import org.yatech.sqlitedb.modeler.model.column.Column;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Column Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage#getColumnMapping()
 * @model features="prev2entryMap curr2entryMap entries" 
 *        prev2entryMapMapType="org.yatech.sqlitedb.modeler.model.common.StringToColumnMappingEntryMap<org.eclipse.emf.ecore.EString, org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.column.Column>>" prev2entryMapSuppressedGetVisibility="true" prev2entryMapSuppressedSetVisibility="true"
 *        curr2entryMapMapType="org.yatech.sqlitedb.modeler.model.common.StringToColumnMappingEntryMap<org.eclipse.emf.ecore.EString, org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.column.Column>>" curr2entryMapSuppressedGetVisibility="true" curr2entryMapSuppressedSetVisibility="true"
 *        entriesType="org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.column.Column>" entriesContainment="true" entriesMany="true" entriesSuppressedGetVisibility="true" entriesSuppressedSetVisibility="true"
 * @generated
 */
public interface ColumnMapping extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model currentRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String currKey = current.getName();\r\nMappingEntry<Column> mappingEntry = getCurr2entryMap().get(currKey);\r\nif (mappingEntry == null) return null;\r\nreturn mappingEntry.getPrevious();'"
	 * @generated
	 */
	Column getPrevious(Column current);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.yatech.sqlitedb.modeler.model.common.Collection<org.yatech.sqlitedb.modeler.model.column.Column>" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Collection<Column> all = new <%java.util.ArrayList%><Column>(getEntries().size());\r\nfor (MappingEntry<Column> entry : getEntries()) {\r\n\tall.add(entry.getPrevious());\r\n}\r\nreturn all;'"
	 * @generated
	 */
	Collection<Column> getAllPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model previousRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String prevKey = previous.getName();\r\nMappingEntry<Column> mappingEntry = getPrev2entryMap().get(prevKey);\r\nif (mappingEntry == null) return null;\r\nreturn mappingEntry.getCurrent();'"
	 * @generated
	 */
	Column getCurrent(Column previous);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.yatech.sqlitedb.modeler.model.common.Collection<org.yatech.sqlitedb.modeler.model.column.Column>" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Collection<Column> all = new ArrayList<Column>(getEntries().size());\r\nfor (MappingEntry<Column> entry : getEntries()) {\r\n\tall.add(entry.getCurrent());\r\n}\r\nreturn all;'"
	 * @generated
	 */
	Collection<Column> getAllCurrent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='MappingEntry<Column> entry = CommonFactory.eINSTANCE.createMappingEntry();\r\nentry.setPrevious(previous);\r\nentry.setCurrent(current);\r\nString prevKey = previous.getName();\r\nString currKey = current.getName();\r\n// TODO - Do it in a transaction\r\n// If there is already a mapping for previous or current - remove it\r\nif (getPrev2entryMap().containsKey(prevKey) || getCurr2entryMap().containsKey(currKey)) {\r\n\tMappingEntry<Column> oldEntry;\r\n\toldEntry = getPrev2entryMap().removeKey(prevKey);\r\n\tif (oldEntry != null) getEntries().remove(oldEntry);\r\n\toldEntry = getCurr2entryMap().removeKey(currKey);\r\n\tif (oldEntry != null) getEntries().remove(oldEntry);\r\n}\r\ngetEntries().add(entry);\r\ngetPrev2entryMap().put(prevKey, entry);\r\ngetCurr2entryMap().put(currKey, entry);'"
	 * @generated
	 */
	void put(Column previous, Column current);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.yatech.sqlitedb.modeler.model.common.Collection<org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.column.Column>>" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return <%java.util.Collections%>.unmodifiableCollection(getEntries());'"
	 * @generated
	 */
	Collection<MappingEntry<Column>> entries();

} // ColumnMapping
