/**
 */
package org.yatech.sqlitedb.modeler.model.common.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.yatech.sqlitedb.modeler.model.column.Column;

import org.yatech.sqlitedb.modeler.model.common.*;

import org.yatech.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.common.CommonPackage
 * @generated
 */
public class CommonSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CommonPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonSwitch() {
		if (modelPackage == null) {
			modelPackage = CommonPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CommonPackage.NAME_PROVIDER: {
				NameProvider nameProvider = (NameProvider)theEObject;
				T1 result = caseNameProvider(nameProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.MAPPING_ENTRY: {
				MappingEntry<?> mappingEntry = (MappingEntry<?>)theEObject;
				T1 result = caseMappingEntry(mappingEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STRING_TO_TABLE_MAPPING_ENTRY_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, MappingEntry<Table>> stringToTableMappingEntryMap = (Map.Entry<String, MappingEntry<Table>>)theEObject;
				T1 result = caseStringToTableMappingEntryMap(stringToTableMappingEntryMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.STRING_TO_COLUMN_MAPPING_ENTRY_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, MappingEntry<Column>> stringToColumnMappingEntryMap = (Map.Entry<String, MappingEntry<Column>>)theEObject;
				T1 result = caseStringToColumnMappingEntryMap(stringToColumnMappingEntryMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.TABLE_MAPPING: {
				TableMapping tableMapping = (TableMapping)theEObject;
				T1 result = caseTableMapping(tableMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CommonPackage.COLUMN_MAPPING: {
				ColumnMapping columnMapping = (ColumnMapping)theEObject;
				T1 result = caseColumnMapping(columnMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNameProvider(NameProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseMappingEntry(MappingEntry<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Table Mapping Entry Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Table Mapping Entry Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringToTableMappingEntryMap(Map.Entry<String, MappingEntry<Table>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Column Mapping Entry Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Column Mapping Entry Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringToColumnMappingEntryMap(Map.Entry<String, MappingEntry<Column>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTableMapping(TableMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumnMapping(ColumnMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //CommonSwitch
