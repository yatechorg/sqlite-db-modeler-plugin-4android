/**
 */
package org.yatech.sqlitedb.modeler.model.index;

import org.eclipse.emf.ecore.EClass;
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
 * @see org.yatech.sqlitedb.modeler.model.index.IndexFactory
 * @model kind="package"
 * @generated
 */
public interface IndexPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "index";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://yatech.org/sqlitedb/modeler/model/index";

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
	IndexPackage eINSTANCE = org.yatech.sqlitedb.modeler.model.index.impl.IndexPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.yatech.sqlitedb.modeler.model.index.impl.IndexImpl <em>Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.yatech.sqlitedb.modeler.model.index.impl.IndexImpl
	 * @see org.yatech.sqlitedb.modeler.model.index.impl.IndexPackageImpl#getIndex()
	 * @generated
	 */
	int INDEX = 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX__DATABASE = 0;

	/**
	 * The number of structural features of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEX_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.yatech.sqlitedb.modeler.model.index.Index <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Index</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.index.Index
	 * @generated
	 */
	EClass getIndex();

	/**
	 * Returns the meta object for the container reference '{@link org.yatech.sqlitedb.modeler.model.index.Index#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Database</em>'.
	 * @see org.yatech.sqlitedb.modeler.model.index.Index#getDatabase()
	 * @see #getIndex()
	 * @generated
	 */
	EReference getIndex_Database();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IndexFactory getIndexFactory();

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
		 * The meta object literal for the '{@link org.yatech.sqlitedb.modeler.model.index.impl.IndexImpl <em>Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.yatech.sqlitedb.modeler.model.index.impl.IndexImpl
		 * @see org.yatech.sqlitedb.modeler.model.index.impl.IndexPackageImpl#getIndex()
		 * @generated
		 */
		EClass INDEX = eINSTANCE.getIndex();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDEX__DATABASE = eINSTANCE.getIndex_Database();

	}

} //IndexPackage
