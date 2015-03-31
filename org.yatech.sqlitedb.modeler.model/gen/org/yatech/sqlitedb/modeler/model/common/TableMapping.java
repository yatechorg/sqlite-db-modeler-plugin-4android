/**
 */
package org.yatech.sqlitedb.modeler.model.common;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import org.yatech.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * </ul>
 * </p>
 *
 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage#getTableMapping()
 * @model features="prev2entryMap curr2entryMap entries" 
 *        prev2entryMapMapType="org.yatech.sqlitedb.modeler.model.common.StringToTableMappingEntryMap<org.eclipse.emf.ecore.EString, org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.table.Table>>" prev2entryMapSuppressedGetVisibility="true" prev2entryMapSuppressedSetVisibility="true"
 *        curr2entryMapMapType="org.yatech.sqlitedb.modeler.model.common.StringToTableMappingEntryMap<org.eclipse.emf.ecore.EString, org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.table.Table>>" curr2entryMapSuppressedGetVisibility="true" curr2entryMapSuppressedSetVisibility="true"
 *        entriesType="org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.table.Table>" entriesContainment="true" entriesMany="true" entriesSuppressedGetVisibility="true" entriesSuppressedSetVisibility="true"
 * @generated
 */
public interface TableMapping extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model currentRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String currKey = current.getName();\r\nMappingEntry<Table> mappingEntry = getCurr2entryMap().get(currKey);\r\nif (mappingEntry == null) return null;\r\nreturn mappingEntry.getPrevious();'"
	 * @generated
	 */
	Table getPrevious(Table current);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.yatech.sqlitedb.modeler.model.common.Collection<org.yatech.sqlitedb.modeler.model.table.Table>" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Collection<Table> all = new <%java.util.ArrayList%><Table>(getEntries().size());\r\nfor (MappingEntry<Table> entry : getEntries()) {\r\n\tall.add(entry.getPrevious());\r\n}\r\nreturn all;'"
	 * @generated
	 */
	Collection<Table> getAllPrevious();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model previousRequired="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='String prevKey = previous.getName();\r\nMappingEntry<Table> mappingEntry = getPrev2entryMap().get(prevKey);\r\nif (mappingEntry == null) return null;\r\nreturn mappingEntry.getCurrent();'"
	 * @generated
	 */
	Table getCurrent(Table previous);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.yatech.sqlitedb.modeler.model.common.Collection<org.yatech.sqlitedb.modeler.model.table.Table>" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='Collection<Table> all = new ArrayList<Table>(getEntries().size());\r\nfor (MappingEntry<Table> entry : getEntries()) {\r\n\tall.add(entry.getCurrent());\r\n}\r\nreturn all;'"
	 * @generated
	 */
	Collection<Table> getAllCurrent();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='MappingEntry<Table> entry = CommonFactory.eINSTANCE.createMappingEntry();\r\nentry.setPrevious(previous);\r\nentry.setCurrent(current);\r\nString prevKey = previous.getName();\r\nString currKey = current.getName();\r\n// TODO - Do it in a transaction\r\n// If there is already a mapping for previous or current - remove it\r\nif (getPrev2entryMap().containsKey(prevKey) || getCurr2entryMap().containsKey(currKey)) {\r\n\tMappingEntry<Table> oldEntry;\r\n\toldEntry = getPrev2entryMap().removeKey(prevKey);\r\n\tif (oldEntry != null) getEntries().remove(oldEntry);\r\n\toldEntry = getCurr2entryMap().removeKey(currKey);\r\n\tif (oldEntry != null) getEntries().remove(oldEntry);\r\n}\r\ngetEntries().add(entry);\r\ngetPrev2entryMap().put(prevKey, entry);\r\ngetCurr2entryMap().put(currKey, entry);'"
	 * @generated
	 */
	void put(Table previous, Table current);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.yatech.sqlitedb.modeler.model.common.Collection<org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.table.Table>>" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return <%java.util.Collections%>.unmodifiableCollection(getEntries());'"
	 * @generated
	 */
	Collection<MappingEntry<Table>> entries();

} // TableMapping
