/**
 */
package org.yatech.sqlitedb.modeler.model.column.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.yatech.sqlitedb.modeler.model.column.*;

import org.yatech.sqlitedb.modeler.model.common.NameProvider;

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
 * @see org.yatech.sqlitedb.modeler.model.column.ColumnPackage
 * @generated
 */
public class ColumnSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ColumnPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnSwitch() {
		if (modelPackage == null) {
			modelPackage = ColumnPackage.eINSTANCE;
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
			case ColumnPackage.COLUMN: {
				Column column = (Column)theEObject;
				T1 result = caseColumn(column);
				if (result == null) result = caseNameProvider(column);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.INDEXED_COLUMN: {
				IndexedColumn indexedColumn = (IndexedColumn)theEObject;
				T1 result = caseIndexedColumn(indexedColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.COLUMN_CONSTRAINT: {
				ColumnConstraint columnConstraint = (ColumnConstraint)theEObject;
				T1 result = caseColumnConstraint(columnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.PRIMARY_KEY_COLUMN_CONSTRAINT: {
				PrimaryKeyColumnConstraint primaryKeyColumnConstraint = (PrimaryKeyColumnConstraint)theEObject;
				T1 result = casePrimaryKeyColumnConstraint(primaryKeyColumnConstraint);
				if (result == null) result = caseColumnConstraint(primaryKeyColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT: {
				ForeignKeyColumnConstraint foreignKeyColumnConstraint = (ForeignKeyColumnConstraint)theEObject;
				T1 result = caseForeignKeyColumnConstraint(foreignKeyColumnConstraint);
				if (result == null) result = caseColumnConstraint(foreignKeyColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.NOT_NULL_COLUMN_CONSTRAINT: {
				NotNullColumnConstraint notNullColumnConstraint = (NotNullColumnConstraint)theEObject;
				T1 result = caseNotNullColumnConstraint(notNullColumnConstraint);
				if (result == null) result = caseColumnConstraint(notNullColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.UNIQUE_COLUMN_CONSTRAINT: {
				UniqueColumnConstraint uniqueColumnConstraint = (UniqueColumnConstraint)theEObject;
				T1 result = caseUniqueColumnConstraint(uniqueColumnConstraint);
				if (result == null) result = caseColumnConstraint(uniqueColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.CHECK_COLUMN_CONSTRAINT: {
				CheckColumnConstraint checkColumnConstraint = (CheckColumnConstraint)theEObject;
				T1 result = caseCheckColumnConstraint(checkColumnConstraint);
				if (result == null) result = caseColumnConstraint(checkColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.DEFAULT_VALUE_COLUMN_CONSTRAINT: {
				DefaultValueColumnConstraint<?> defaultValueColumnConstraint = (DefaultValueColumnConstraint<?>)theEObject;
				T1 result = caseDefaultValueColumnConstraint(defaultValueColumnConstraint);
				if (result == null) result = caseColumnConstraint(defaultValueColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT: {
				DefaultExpressionValueColumnConstraint defaultExpressionValueColumnConstraint = (DefaultExpressionValueColumnConstraint)theEObject;
				T1 result = caseDefaultExpressionValueColumnConstraint(defaultExpressionValueColumnConstraint);
				if (result == null) result = caseDefaultValueColumnConstraint(defaultExpressionValueColumnConstraint);
				if (result == null) result = caseColumnConstraint(defaultExpressionValueColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT: {
				DefaultStringValueColumnConstraint defaultStringValueColumnConstraint = (DefaultStringValueColumnConstraint)theEObject;
				T1 result = caseDefaultStringValueColumnConstraint(defaultStringValueColumnConstraint);
				if (result == null) result = caseDefaultValueColumnConstraint(defaultStringValueColumnConstraint);
				if (result == null) result = caseColumnConstraint(defaultStringValueColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT: {
				DefaultIntegerValueColumnConstraint defaultIntegerValueColumnConstraint = (DefaultIntegerValueColumnConstraint)theEObject;
				T1 result = caseDefaultIntegerValueColumnConstraint(defaultIntegerValueColumnConstraint);
				if (result == null) result = caseDefaultValueColumnConstraint(defaultIntegerValueColumnConstraint);
				if (result == null) result = caseColumnConstraint(defaultIntegerValueColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ColumnPackage.DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT: {
				DefaultRealValueColumnConstraint defaultRealValueColumnConstraint = (DefaultRealValueColumnConstraint)theEObject;
				T1 result = caseDefaultRealValueColumnConstraint(defaultRealValueColumnConstraint);
				if (result == null) result = caseDefaultValueColumnConstraint(defaultRealValueColumnConstraint);
				if (result == null) result = caseColumnConstraint(defaultRealValueColumnConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumn(Column object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexed Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexed Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseIndexedColumn(IndexedColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColumnConstraint(ColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Key Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Key Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePrimaryKeyColumnConstraint(PrimaryKeyColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Key Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Key Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseForeignKeyColumnConstraint(ForeignKeyColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Null Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Null Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNotNullColumnConstraint(NotNullColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unique Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unique Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseUniqueColumnConstraint(UniqueColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCheckColumnConstraint(CheckColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Value Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseDefaultValueColumnConstraint(DefaultValueColumnConstraint<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Expression Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Expression Value Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefaultExpressionValueColumnConstraint(DefaultExpressionValueColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default String Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default String Value Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefaultStringValueColumnConstraint(DefaultStringValueColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Integer Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Integer Value Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefaultIntegerValueColumnConstraint(DefaultIntegerValueColumnConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Real Value Column Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Real Value Column Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefaultRealValueColumnConstraint(DefaultRealValueColumnConstraint object) {
		return null;
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

} //ColumnSwitch
