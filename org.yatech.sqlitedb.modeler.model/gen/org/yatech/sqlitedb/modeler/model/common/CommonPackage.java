/**
 */
package org.yatech.sqlitedb.modeler.model.common;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yatech.org/sqlitedb/modeler/model/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.yatech.sqlitedb.modeler.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.common.NameProvider
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getNameProvider()
	 * @generated
	 */
	int NAME_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Name Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Name Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.MappingEntryImpl
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getMappingEntry()
	 * @generated
	 */
	int MAPPING_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__PREVIOUS = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY__CURRENT = 1;

	/**
	 * The number of structural features of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.StringToTableMappingEntryMapImpl <em>String To Table Mapping Entry Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.StringToTableMappingEntryMapImpl
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getStringToTableMappingEntryMap()
	 * @generated
	 */
	int STRING_TO_TABLE_MAPPING_ENTRY_MAP = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TABLE_MAPPING_ENTRY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TABLE_MAPPING_ENTRY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Table Mapping Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TABLE_MAPPING_ENTRY_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Table Mapping Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_TABLE_MAPPING_ENTRY_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.StringToColumnMappingEntryMapImpl <em>String To Column Mapping Entry Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.StringToColumnMappingEntryMapImpl
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getStringToColumnMappingEntryMap()
	 * @generated
	 */
	int STRING_TO_COLUMN_MAPPING_ENTRY_MAP = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_COLUMN_MAPPING_ENTRY_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_COLUMN_MAPPING_ENTRY_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String To Column Mapping Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_COLUMN_MAPPING_ENTRY_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String To Column Mapping Entry Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TO_COLUMN_MAPPING_ENTRY_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl <em>Table Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getTableMapping()
	 * @generated
	 */
	int TABLE_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Prev2entry Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__PREV2ENTRY_MAP = 0;

	/**
	 * The feature id for the '<em><b>Curr2entry Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__CURR2ENTRY_MAP = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Table Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING___GET_PREVIOUS__TABLE = 0;

	/**
	 * The operation id for the '<em>Get All Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING___GET_ALL_PREVIOUS = 1;

	/**
	 * The operation id for the '<em>Get Current</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING___GET_CURRENT__TABLE = 2;

	/**
	 * The operation id for the '<em>Get All Current</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING___GET_ALL_CURRENT = 3;

	/**
	 * The operation id for the '<em>Put</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING___PUT__TABLE_TABLE = 4;

	/**
	 * The operation id for the '<em>Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING___ENTRIES = 5;

	/**
	 * The number of operations of the '<em>Table Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_MAPPING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.ColumnMappingImpl <em>Column Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.ColumnMappingImpl
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getColumnMapping()
	 * @generated
	 */
	int COLUMN_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Prev2entry Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING__PREV2ENTRY_MAP = 0;

	/**
	 * The feature id for the '<em><b>Curr2entry Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING__CURR2ENTRY_MAP = 1;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING__ENTRIES = 2;

	/**
	 * The number of structural features of the '<em>Column Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING___GET_PREVIOUS__COLUMN = 0;

	/**
	 * The operation id for the '<em>Get All Previous</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING___GET_ALL_PREVIOUS = 1;

	/**
	 * The operation id for the '<em>Get Current</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING___GET_CURRENT__COLUMN = 2;

	/**
	 * The operation id for the '<em>Get All Current</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING___GET_ALL_CURRENT = 3;

	/**
	 * The operation id for the '<em>Put</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING___PUT__COLUMN_COLUMN = 4;

	/**
	 * The operation id for the '<em>Entries</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING___ENTRIES = 5;

	/**
	 * The number of operations of the '<em>Column Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_MAPPING_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 6;


	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Provider</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.NameProvider
	 * @generated
	 */
	EClass getNameProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.common.NameProvider#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.NameProvider#getName()
	 * @see #getNameProvider()
	 * @generated
	 */
	EAttribute getNameProvider_Name();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry <em>Mapping Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Entry</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.MappingEntry
	 * @generated
	 */
	EClass getMappingEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Previous</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.MappingEntry#getPrevious()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EAttribute getMappingEntry_Previous();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.common.MappingEntry#getCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.MappingEntry#getCurrent()
	 * @see #getMappingEntry()
	 * @generated
	 */
	EAttribute getMappingEntry_Current();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Table Mapping Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Table Mapping Entry Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.table.Table>" valueRequired="true"
	 * @generated
	 */
	EClass getStringToTableMappingEntryMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTableMappingEntryMap()
	 * @generated
	 */
	EAttribute getStringToTableMappingEntryMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToTableMappingEntryMap()
	 * @generated
	 */
	EReference getStringToTableMappingEntryMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String To Column Mapping Entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String To Column Mapping Entry Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString" keyRequired="true"
	 *        valueType="org.yatech.sqlitedb.modeler.model.common.MappingEntry<org.yatech.sqlitedb.modeler.model.column.Column>" valueRequired="true"
	 * @generated
	 */
	EClass getStringToColumnMappingEntryMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToColumnMappingEntryMap()
	 * @generated
	 */
	EAttribute getStringToColumnMappingEntryMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringToColumnMappingEntryMap()
	 * @generated
	 */
	EReference getStringToColumnMappingEntryMap_Value();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping <em>Table Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Mapping</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping
	 * @generated
	 */
	EClass getTableMapping();

	/**
	 * Returns the meta object for the map '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping <em>Prev2entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Prev2entry Map</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_Prev2entryMap();

	/**
	 * Returns the meta object for the map '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping <em>Curr2entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Curr2entry Map</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_Curr2entryMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping
	 * @see #getTableMapping()
	 * @generated
	 */
	EReference getTableMapping_Entries();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping#getPrevious(org.yatech.sqlitedb.modeler.model.table.Table) <em>Get Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping#getPrevious(org.yatech.sqlitedb.modeler.model.table.Table)
	 * @generated
	 */
	EOperation getTableMapping__GetPrevious__Table();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping#getAllPrevious() <em>Get All Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Previous</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping#getAllPrevious()
	 * @generated
	 */
	EOperation getTableMapping__GetAllPrevious();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping#getCurrent(org.yatech.sqlitedb.modeler.model.table.Table) <em>Get Current</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping#getCurrent(org.yatech.sqlitedb.modeler.model.table.Table)
	 * @generated
	 */
	EOperation getTableMapping__GetCurrent__Table();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping#getAllCurrent() <em>Get All Current</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Current</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping#getAllCurrent()
	 * @generated
	 */
	EOperation getTableMapping__GetAllCurrent();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping#put(org.yatech.sqlitedb.modeler.model.table.Table, org.yatech.sqlitedb.modeler.model.table.Table) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping#put(org.yatech.sqlitedb.modeler.model.table.Table, org.yatech.sqlitedb.modeler.model.table.Table)
	 * @generated
	 */
	EOperation getTableMapping__Put__Table_Table();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.TableMapping#entries() <em>Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entries</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.TableMapping#entries()
	 * @generated
	 */
	EOperation getTableMapping__Entries();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping <em>Column Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Mapping</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping
	 * @generated
	 */
	EClass getColumnMapping();

	/**
	 * Returns the meta object for the map '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping <em>Prev2entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Prev2entry Map</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping
	 * @see #getColumnMapping()
	 * @generated
	 */
	EReference getColumnMapping_Prev2entryMap();

	/**
	 * Returns the meta object for the map '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping <em>Curr2entry Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Curr2entry Map</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping
	 * @see #getColumnMapping()
	 * @generated
	 */
	EReference getColumnMapping_Curr2entryMap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping
	 * @see #getColumnMapping()
	 * @generated
	 */
	EReference getColumnMapping_Entries();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getPrevious(org.yatech.sqlitedb.modeler.model.column.Column) <em>Get Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getPrevious(org.yatech.sqlitedb.modeler.model.column.Column)
	 * @generated
	 */
	EOperation getColumnMapping__GetPrevious__Column();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getAllPrevious() <em>Get All Previous</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Previous</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getAllPrevious()
	 * @generated
	 */
	EOperation getColumnMapping__GetAllPrevious();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getCurrent(org.yatech.sqlitedb.modeler.model.column.Column) <em>Get Current</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Current</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getCurrent(org.yatech.sqlitedb.modeler.model.column.Column)
	 * @generated
	 */
	EOperation getColumnMapping__GetCurrent__Column();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getAllCurrent() <em>Get All Current</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Current</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping#getAllCurrent()
	 * @generated
	 */
	EOperation getColumnMapping__GetAllCurrent();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping#put(org.yatech.sqlitedb.modeler.model.column.Column, org.yatech.sqlitedb.modeler.model.column.Column) <em>Put</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Put</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping#put(org.yatech.sqlitedb.modeler.model.column.Column, org.yatech.sqlitedb.modeler.model.column.Column)
	 * @generated
	 */
	EOperation getColumnMapping__Put__Column_Column();

	/**
	 * Returns the meta object for the '{@link org.yatech.sqlitedb.modeler.model.common.ColumnMapping#entries() <em>Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Entries</em>' operation.
	 * @see org.yatech.sqlitedb.modeler.model.common.ColumnMapping#entries()
	 * @generated
	 */
	EOperation getColumnMapping__Entries();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.common.NameProvider <em>Name Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.common.NameProvider
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getNameProvider()
		 * @generated
		 */
		EClass NAME_PROVIDER = eINSTANCE.getNameProvider();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_PROVIDER__NAME = eINSTANCE.getNameProvider_Name();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.MappingEntryImpl <em>Mapping Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.MappingEntryImpl
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getMappingEntry()
		 * @generated
		 */
		EClass MAPPING_ENTRY = eINSTANCE.getMappingEntry();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTRY__PREVIOUS = eINSTANCE.getMappingEntry_Previous();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING_ENTRY__CURRENT = eINSTANCE.getMappingEntry_Current();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.StringToTableMappingEntryMapImpl <em>String To Table Mapping Entry Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.StringToTableMappingEntryMapImpl
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getStringToTableMappingEntryMap()
		 * @generated
		 */
		EClass STRING_TO_TABLE_MAPPING_ENTRY_MAP = eINSTANCE.getStringToTableMappingEntryMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_TABLE_MAPPING_ENTRY_MAP__KEY = eINSTANCE.getStringToTableMappingEntryMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_TABLE_MAPPING_ENTRY_MAP__VALUE = eINSTANCE.getStringToTableMappingEntryMap_Value();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.StringToColumnMappingEntryMapImpl <em>String To Column Mapping Entry Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.StringToColumnMappingEntryMapImpl
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getStringToColumnMappingEntryMap()
		 * @generated
		 */
		EClass STRING_TO_COLUMN_MAPPING_ENTRY_MAP = eINSTANCE.getStringToColumnMappingEntryMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TO_COLUMN_MAPPING_ENTRY_MAP__KEY = eINSTANCE.getStringToColumnMappingEntryMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_TO_COLUMN_MAPPING_ENTRY_MAP__VALUE = eINSTANCE.getStringToColumnMappingEntryMap_Value();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl <em>Table Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getTableMapping()
		 * @generated
		 */
		EClass TABLE_MAPPING = eINSTANCE.getTableMapping();

		/**
		 * The meta object literal for the '<em><b>Prev2entry Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__PREV2ENTRY_MAP = eINSTANCE.getTableMapping_Prev2entryMap();

		/**
		 * The meta object literal for the '<em><b>Curr2entry Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__CURR2ENTRY_MAP = eINSTANCE.getTableMapping_Curr2entryMap();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_MAPPING__ENTRIES = eINSTANCE.getTableMapping_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_MAPPING___GET_PREVIOUS__TABLE = eINSTANCE.getTableMapping__GetPrevious__Table();

		/**
		 * The meta object literal for the '<em><b>Get All Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_MAPPING___GET_ALL_PREVIOUS = eINSTANCE.getTableMapping__GetAllPrevious();

		/**
		 * The meta object literal for the '<em><b>Get Current</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_MAPPING___GET_CURRENT__TABLE = eINSTANCE.getTableMapping__GetCurrent__Table();

		/**
		 * The meta object literal for the '<em><b>Get All Current</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_MAPPING___GET_ALL_CURRENT = eINSTANCE.getTableMapping__GetAllCurrent();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_MAPPING___PUT__TABLE_TABLE = eINSTANCE.getTableMapping__Put__Table_Table();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_MAPPING___ENTRIES = eINSTANCE.getTableMapping__Entries();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.common.impl.ColumnMappingImpl <em>Column Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.ColumnMappingImpl
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getColumnMapping()
		 * @generated
		 */
		EClass COLUMN_MAPPING = eINSTANCE.getColumnMapping();

		/**
		 * The meta object literal for the '<em><b>Prev2entry Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_MAPPING__PREV2ENTRY_MAP = eINSTANCE.getColumnMapping_Prev2entryMap();

		/**
		 * The meta object literal for the '<em><b>Curr2entry Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_MAPPING__CURR2ENTRY_MAP = eINSTANCE.getColumnMapping_Curr2entryMap();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_MAPPING__ENTRIES = eINSTANCE.getColumnMapping_Entries();

		/**
		 * The meta object literal for the '<em><b>Get Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_MAPPING___GET_PREVIOUS__COLUMN = eINSTANCE.getColumnMapping__GetPrevious__Column();

		/**
		 * The meta object literal for the '<em><b>Get All Previous</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_MAPPING___GET_ALL_PREVIOUS = eINSTANCE.getColumnMapping__GetAllPrevious();

		/**
		 * The meta object literal for the '<em><b>Get Current</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_MAPPING___GET_CURRENT__COLUMN = eINSTANCE.getColumnMapping__GetCurrent__Column();

		/**
		 * The meta object literal for the '<em><b>Get All Current</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_MAPPING___GET_ALL_CURRENT = eINSTANCE.getColumnMapping__GetAllCurrent();

		/**
		 * The meta object literal for the '<em><b>Put</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_MAPPING___PUT__COLUMN_COLUMN = eINSTANCE.getColumnMapping__Put__Column_Column();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COLUMN_MAPPING___ENTRIES = eINSTANCE.getColumnMapping__Entries();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.yatech.sqlitedb.modeler.model.common.impl.CommonPackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

	}

} //CommonPackage
