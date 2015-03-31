/**
 */
package org.yatech.sqlitedb.modeler.model.index;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yatech.sqlitedb.modeler.model.index.IndexPackage
 * @generated
 */
public interface IndexFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IndexFactory eINSTANCE = org.yatech.sqlitedb.modeler.model.index.impl.IndexFactoryImpl.init();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IndexPackage getIndexPackage();

} //IndexFactory
