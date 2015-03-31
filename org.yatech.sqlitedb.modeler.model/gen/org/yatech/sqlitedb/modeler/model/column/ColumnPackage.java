/**
 */
package org.yatech.sqlitedb.modeler.model.column;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.yatech.sqlitedb.modeler.model.common.CommonPackage;

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
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnFactory
 * @model kind="package"
 * @generated
 */
public interface ColumnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "column";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yatech.org/sqlitedb/modeler/model/column";

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
	ColumnPackage eINSTANCE = org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__NAME = CommonPackage.NAME_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TABLE = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__TYPE = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONSTRAINTS = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = CommonPackage.NAME_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.IndexedColumnImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getIndexedColumn()
	 * @generated
	 */
	int INDEXED_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN__COLUMN = 0;

	/**
	 * The number of structural features of the '<em>Indexed Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Indexed Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.ColumnConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getColumnConstraint()
	 * @generated
	 */
	int COLUMN_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT__COLUMN = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.PrimaryKeyColumnConstraintImpl <em>Primary Key Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.PrimaryKeyColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getPrimaryKeyColumnConstraint()
	 * @generated
	 */
	int PRIMARY_KEY_COLUMN_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_COLUMN_CONSTRAINT__NAME = COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_COLUMN_CONSTRAINT__COLUMN = COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The number of structural features of the '<em>Primary Key Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary Key Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_COLUMN_CONSTRAINT_OPERATION_COUNT = COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.NotNullColumnConstraintImpl <em>Not Null Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.NotNullColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getNotNullColumnConstraint()
	 * @generated
	 */
	int NOT_NULL_COLUMN_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_COLUMN_CONSTRAINT__NAME = COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_COLUMN_CONSTRAINT__COLUMN = COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The number of structural features of the '<em>Not Null Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Null Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_NULL_COLUMN_CONSTRAINT_OPERATION_COUNT = COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.UniqueColumnConstraintImpl <em>Unique Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.UniqueColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getUniqueColumnConstraint()
	 * @generated
	 */
	int UNIQUE_COLUMN_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLUMN_CONSTRAINT__NAME = COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLUMN_CONSTRAINT__COLUMN = COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The number of structural features of the '<em>Unique Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unique Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_COLUMN_CONSTRAINT_OPERATION_COUNT = COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.CheckColumnConstraintImpl <em>Check Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.CheckColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getCheckColumnConstraint()
	 * @generated
	 */
	int CHECK_COLUMN_CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COLUMN_CONSTRAINT__NAME = COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COLUMN_CONSTRAINT__COLUMN = COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COLUMN_CONSTRAINT__EXPRESSION = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_COLUMN_CONSTRAINT_OPERATION_COUNT = COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultValueColumnConstraintImpl <em>Default Value Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultValueColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultValueColumnConstraint()
	 * @generated
	 */
	int DEFAULT_VALUE_COLUMN_CONSTRAINT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_COLUMN_CONSTRAINT__NAME = COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_COLUMN_CONSTRAINT__COLUMN = COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE = COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Default Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT = COLUMN_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Default Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT = COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultExpressionValueColumnConstraintImpl <em>Default Expression Value Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultExpressionValueColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultExpressionValueColumnConstraint()
	 * @generated
	 */
	int DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT__NAME = DEFAULT_VALUE_COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT__COLUMN = DEFAULT_VALUE_COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT__VALUE = DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE;

	/**
	 * The number of structural features of the '<em>Default Expression Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Expression Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultStringValueColumnConstraintImpl <em>Default String Value Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultStringValueColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultStringValueColumnConstraint()
	 * @generated
	 */
	int DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT__NAME = DEFAULT_VALUE_COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT__COLUMN = DEFAULT_VALUE_COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT__VALUE = DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE;

	/**
	 * The number of structural features of the '<em>Default String Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default String Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultIntegerValueColumnConstraintImpl <em>Default Integer Value Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultIntegerValueColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultIntegerValueColumnConstraint()
	 * @generated
	 */
	int DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT__NAME = DEFAULT_VALUE_COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT__COLUMN = DEFAULT_VALUE_COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT__VALUE = DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE;

	/**
	 * The number of structural features of the '<em>Default Integer Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Integer Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultRealValueColumnConstraintImpl <em>Default Real Value Column Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultRealValueColumnConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultRealValueColumnConstraint()
	 * @generated
	 */
	int DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT__NAME = DEFAULT_VALUE_COLUMN_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Column</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT__COLUMN = DEFAULT_VALUE_COLUMN_CONSTRAINT__COLUMN;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT__VALUE = DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE;

	/**
	 * The number of structural features of the '<em>Default Real Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Default Real Value Column Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT = DEFAULT_VALUE_COLUMN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.column.DataType <em>Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.column.DataType
	 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 12;


	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the container reference '{@link org.yatech.sqlitedb.modeler.model.column.Column#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.Column#getTable()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Table();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.column.Column#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.Column#getType()
	 * @see #getColumn()
	 * @generated
	 */
	EAttribute getColumn_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.column.Column#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.Column#getConstraints()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Constraints();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.IndexedColumn <em>Indexed Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed Column</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.IndexedColumn
	 * @generated
	 */
	EClass getIndexedColumn();

	/**
	 * Returns the meta object for the reference '{@link org.yatech.sqlitedb.modeler.model.column.IndexedColumn#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Column</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.IndexedColumn#getColumn()
	 * @see #getIndexedColumn()
	 * @generated
	 */
	EReference getIndexedColumn_Column();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnConstraint
	 * @generated
	 */
	EClass getColumnConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getName()
	 * @see #getColumnConstraint()
	 * @generated
	 */
	EAttribute getColumnConstraint_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Column</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.ColumnConstraint#getColumn()
	 * @see #getColumnConstraint()
	 * @generated
	 */
	EReference getColumnConstraint_Column();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint <em>Primary Key Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.PrimaryKeyColumnConstraint
	 * @generated
	 */
	EClass getPrimaryKeyColumnConstraint();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint <em>Not Null Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.NotNullColumnConstraint
	 * @generated
	 */
	EClass getNotNullColumnConstraint();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint <em>Unique Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.UniqueColumnConstraint
	 * @generated
	 */
	EClass getUniqueColumnConstraint();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint <em>Check Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint
	 * @generated
	 */
	EClass getCheckColumnConstraint();

	/**
	 * Returns the meta object for the reference '{@link org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.CheckColumnConstraint#getExpression()
	 * @see #getCheckColumnConstraint()
	 * @generated
	 */
	EReference getCheckColumnConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint <em>Default Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Value Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint
	 * @generated
	 */
	EClass getDefaultValueColumnConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultValueColumnConstraint#getValue()
	 * @see #getDefaultValueColumnConstraint()
	 * @generated
	 */
	EReference getDefaultValueColumnConstraint_Value();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultExpressionValueColumnConstraint <em>Default Expression Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Expression Value Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultExpressionValueColumnConstraint
	 * @generated
	 */
	EClass getDefaultExpressionValueColumnConstraint();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint <em>Default String Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default String Value Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultStringValueColumnConstraint
	 * @generated
	 */
	EClass getDefaultStringValueColumnConstraint();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint <em>Default Integer Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Integer Value Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultIntegerValueColumnConstraint
	 * @generated
	 */
	EClass getDefaultIntegerValueColumnConstraint();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.column.DefaultRealValueColumnConstraint <em>Default Real Value Column Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Real Value Column Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DefaultRealValueColumnConstraint
	 * @generated
	 */
	EClass getDefaultRealValueColumnConstraint();

	/**
	 * Returns the meta object for enum '{@link org.yatech.sqlitedb.modeler.model.column.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Type</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.column.DataType
	 * @generated
	 */
	EEnum getDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ColumnFactory getColumnFactory();

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
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__TABLE = eINSTANCE.getColumn_Table();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN__TYPE = eINSTANCE.getColumn_Type();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__CONSTRAINTS = eINSTANCE.getColumn_Constraints();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.IndexedColumnImpl <em>Indexed Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.IndexedColumnImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getIndexedColumn()
		 * @generated
		 */
		EClass INDEXED_COLUMN = eINSTANCE.getIndexedColumn();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEXED_COLUMN__COLUMN = eINSTANCE.getIndexedColumn_Column();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.ColumnConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getColumnConstraint()
		 * @generated
		 */
		EClass COLUMN_CONSTRAINT = eINSTANCE.getColumnConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_CONSTRAINT__NAME = eINSTANCE.getColumnConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN_CONSTRAINT__COLUMN = eINSTANCE.getColumnConstraint_Column();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.PrimaryKeyColumnConstraintImpl <em>Primary Key Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.PrimaryKeyColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getPrimaryKeyColumnConstraint()
		 * @generated
		 */
		EClass PRIMARY_KEY_COLUMN_CONSTRAINT = eINSTANCE.getPrimaryKeyColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.NotNullColumnConstraintImpl <em>Not Null Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.NotNullColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getNotNullColumnConstraint()
		 * @generated
		 */
		EClass NOT_NULL_COLUMN_CONSTRAINT = eINSTANCE.getNotNullColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.UniqueColumnConstraintImpl <em>Unique Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.UniqueColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getUniqueColumnConstraint()
		 * @generated
		 */
		EClass UNIQUE_COLUMN_CONSTRAINT = eINSTANCE.getUniqueColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.CheckColumnConstraintImpl <em>Check Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.CheckColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getCheckColumnConstraint()
		 * @generated
		 */
		EClass CHECK_COLUMN_CONSTRAINT = eINSTANCE.getCheckColumnConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_COLUMN_CONSTRAINT__EXPRESSION = eINSTANCE.getCheckColumnConstraint_Expression();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultValueColumnConstraintImpl <em>Default Value Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultValueColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultValueColumnConstraint()
		 * @generated
		 */
		EClass DEFAULT_VALUE_COLUMN_CONSTRAINT = eINSTANCE.getDefaultValueColumnConstraint();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_VALUE_COLUMN_CONSTRAINT__VALUE = eINSTANCE.getDefaultValueColumnConstraint_Value();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultExpressionValueColumnConstraintImpl <em>Default Expression Value Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultExpressionValueColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultExpressionValueColumnConstraint()
		 * @generated
		 */
		EClass DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT = eINSTANCE.getDefaultExpressionValueColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultStringValueColumnConstraintImpl <em>Default String Value Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultStringValueColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultStringValueColumnConstraint()
		 * @generated
		 */
		EClass DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT = eINSTANCE.getDefaultStringValueColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultIntegerValueColumnConstraintImpl <em>Default Integer Value Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultIntegerValueColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultIntegerValueColumnConstraint()
		 * @generated
		 */
		EClass DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT = eINSTANCE.getDefaultIntegerValueColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.impl.DefaultRealValueColumnConstraintImpl <em>Default Real Value Column Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.DefaultRealValueColumnConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDefaultRealValueColumnConstraint()
		 * @generated
		 */
		EClass DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT = eINSTANCE.getDefaultRealValueColumnConstraint();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.column.DataType <em>Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.column.DataType
		 * @see org.yatech.sqlitedb.modeler.model.column.impl.ColumnPackageImpl#getDataType()
		 * @generated
		 */
		EEnum DATA_TYPE = eINSTANCE.getDataType();

	}

} //ColumnPackage
