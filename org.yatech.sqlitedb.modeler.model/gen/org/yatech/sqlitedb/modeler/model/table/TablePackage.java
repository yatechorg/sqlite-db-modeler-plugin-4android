/**
 */
package org.yatech.sqlitedb.modeler.model.table;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.yatech.sqlitedb.modeler.model.table.TableFactory
 * @model kind="package"
 * @generated
 */
public interface TablePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "table";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yatech.org/sqlitedb/modeler/model/table";

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
	TablePackage eINSTANCE = org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TableImpl
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = CommonPackage.NAME_PROVIDER__NAME;

	/**
	 * The feature id for the '<em><b>Database</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DATABASE = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINTS = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = CommonPackage.NAME_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = CommonPackage.NAME_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.TableConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TableConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getTableConstraint()
	 * @generated
	 */
	int TABLE_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT__TABLE = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.PrimaryKeyTableConstraintImpl <em>Primary Key Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.PrimaryKeyTableConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getPrimaryKeyTableConstraint()
	 * @generated
	 */
	int PRIMARY_KEY_TABLE_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_TABLE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_TABLE_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primary Key Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primary Key Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_TABLE_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.UniqueTableConstraintImpl <em>Unique Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.UniqueTableConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getUniqueTableConstraint()
	 * @generated
	 */
	int UNIQUE_TABLE_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_TABLE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_TABLE_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_TABLE_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unique Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unique Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIQUE_TABLE_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.CheckTableConstraintImpl <em>Check Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.CheckTableConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getCheckTableConstraint()
	 * @generated
	 */
	int CHECK_TABLE_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TABLE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TABLE_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TABLE_CONSTRAINT__EXPRESSION = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Check Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_TABLE_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl <em>Foreign Key Table Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl
	 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getForeignKeyTableConstraint()
	 * @generated
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT__NAME = TABLE_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Table</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT__TABLE = TABLE_CONSTRAINT__TABLE;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Foreign Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE = TABLE_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Foreign Columns</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS = TABLE_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Foreign Key Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT_FEATURE_COUNT = TABLE_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Foreign Key Table Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_TABLE_CONSTRAINT_OPERATION_COUNT = TABLE_CONSTRAINT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.table.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the container reference '{@link org.yatech.sqlitedb.modeler.model.table.Table#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Database</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.Table#getDatabase()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Database();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.table.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.table.Table#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.Table#getConstraints()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Constraints();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.table.TableConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.TableConstraint
	 * @generated
	 */
	EClass getTableConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.yatech.sqlitedb.modeler.model.table.TableConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.TableConstraint#getName()
	 * @see #getTableConstraint()
	 * @generated
	 */
	EAttribute getTableConstraint_Name();

	/**
	 * Returns the meta object for the container reference '{@link org.yatech.sqlitedb.modeler.model.table.TableConstraint#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Table</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.TableConstraint#getTable()
	 * @see #getTableConstraint()
	 * @generated
	 */
	EReference getTableConstraint_Table();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint <em>Primary Key Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key Table Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint
	 * @generated
	 */
	EClass getPrimaryKeyTableConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.PrimaryKeyTableConstraint#getColumns()
	 * @see #getPrimaryKeyTableConstraint()
	 * @generated
	 */
	EReference getPrimaryKeyTableConstraint_Columns();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint <em>Unique Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unique Table Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint
	 * @generated
	 */
	EClass getUniqueTableConstraint();

	/**
	 * Returns the meta object for the containment reference list '{@link org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.UniqueTableConstraint#getColumns()
	 * @see #getUniqueTableConstraint()
	 * @generated
	 */
	EReference getUniqueTableConstraint_Columns();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint <em>Check Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check Table Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint
	 * @generated
	 */
	EClass getCheckTableConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.CheckTableConstraint#getExpression()
	 * @see #getCheckTableConstraint()
	 * @generated
	 */
	EReference getCheckTableConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint <em>Foreign Key Table Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key Table Constraint</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint
	 * @generated
	 */
	EClass getForeignKeyTableConstraint();

	/**
	 * Returns the meta object for the reference list '{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Columns</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getColumns()
	 * @see #getForeignKeyTableConstraint()
	 * @generated
	 */
	EReference getForeignKeyTableConstraint_Columns();

	/**
	 * Returns the meta object for the reference '{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignTable <em>Foreign Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Foreign Table</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignTable()
	 * @see #getForeignKeyTableConstraint()
	 * @generated
	 */
	EReference getForeignKeyTableConstraint_ForeignTable();

	/**
	 * Returns the meta object for the reference list '{@link org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignColumns <em>Foreign Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Foreign Columns</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.table.ForeignKeyTableConstraint#getForeignColumns()
	 * @see #getForeignKeyTableConstraint()
	 * @generated
	 */
	EReference getForeignKeyTableConstraint_ForeignColumns();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TableFactory getTableFactory();

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
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TableImpl
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__DATABASE = eINSTANCE.getTable_Database();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONSTRAINTS = eINSTANCE.getTable_Constraints();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.TableConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TableConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getTableConstraint()
		 * @generated
		 */
		EClass TABLE_CONSTRAINT = eINSTANCE.getTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CONSTRAINT__NAME = eINSTANCE.getTableConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_CONSTRAINT__TABLE = eINSTANCE.getTableConstraint_Table();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.PrimaryKeyTableConstraintImpl <em>Primary Key Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.PrimaryKeyTableConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getPrimaryKeyTableConstraint()
		 * @generated
		 */
		EClass PRIMARY_KEY_TABLE_CONSTRAINT = eINSTANCE.getPrimaryKeyTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY_TABLE_CONSTRAINT__COLUMNS = eINSTANCE.getPrimaryKeyTableConstraint_Columns();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.UniqueTableConstraintImpl <em>Unique Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.UniqueTableConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getUniqueTableConstraint()
		 * @generated
		 */
		EClass UNIQUE_TABLE_CONSTRAINT = eINSTANCE.getUniqueTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIQUE_TABLE_CONSTRAINT__COLUMNS = eINSTANCE.getUniqueTableConstraint_Columns();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.CheckTableConstraintImpl <em>Check Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.CheckTableConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getCheckTableConstraint()
		 * @generated
		 */
		EClass CHECK_TABLE_CONSTRAINT = eINSTANCE.getCheckTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHECK_TABLE_CONSTRAINT__EXPRESSION = eINSTANCE.getCheckTableConstraint_Expression();

		/**
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl <em>Foreign Key Table Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.ForeignKeyTableConstraintImpl
		 * @see org.yatech.sqlitedb.modeler.model.table.impl.TablePackageImpl#getForeignKeyTableConstraint()
		 * @generated
		 */
		EClass FOREIGN_KEY_TABLE_CONSTRAINT = eINSTANCE.getForeignKeyTableConstraint();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_TABLE_CONSTRAINT__COLUMNS = eINSTANCE.getForeignKeyTableConstraint_Columns();

		/**
		 * The meta object literal for the '<em><b>Foreign Table</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_TABLE = eINSTANCE.getForeignKeyTableConstraint_ForeignTable();

		/**
		 * The meta object literal for the '<em><b>Foreign Columns</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY_TABLE_CONSTRAINT__FOREIGN_COLUMNS = eINSTANCE.getForeignKeyTableConstraint_ForeignColumns();

	}

} //TablePackage
