/**
 */
package org.yatech.sqlitedb.modeler.model.column.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yatech.sqlitedb.modeler.model.column.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ColumnFactoryImpl extends EFactoryImpl implements ColumnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ColumnFactory init() {
		try {
			ColumnFactory theColumnFactory = (ColumnFactory)EPackage.Registry.INSTANCE.getEFactory(ColumnPackage.eNS_URI);
			if (theColumnFactory != null) {
				return theColumnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ColumnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ColumnPackage.COLUMN: return createColumn();
			case ColumnPackage.INDEXED_COLUMN: return createIndexedColumn();
			case ColumnPackage.PRIMARY_KEY_COLUMN_CONSTRAINT: return createPrimaryKeyColumnConstraint();
			case ColumnPackage.FOREIGN_KEY_COLUMN_CONSTRAINT: return createForeignKeyColumnConstraint();
			case ColumnPackage.NOT_NULL_COLUMN_CONSTRAINT: return createNotNullColumnConstraint();
			case ColumnPackage.UNIQUE_COLUMN_CONSTRAINT: return createUniqueColumnConstraint();
			case ColumnPackage.CHECK_COLUMN_CONSTRAINT: return createCheckColumnConstraint();
			case ColumnPackage.DEFAULT_EXPRESSION_VALUE_COLUMN_CONSTRAINT: return createDefaultExpressionValueColumnConstraint();
			case ColumnPackage.DEFAULT_STRING_VALUE_COLUMN_CONSTRAINT: return createDefaultStringValueColumnConstraint();
			case ColumnPackage.DEFAULT_INTEGER_VALUE_COLUMN_CONSTRAINT: return createDefaultIntegerValueColumnConstraint();
			case ColumnPackage.DEFAULT_REAL_VALUE_COLUMN_CONSTRAINT: return createDefaultRealValueColumnConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ColumnPackage.DATA_TYPE:
				return createDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ColumnPackage.DATA_TYPE:
				return convertDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndexedColumn createIndexedColumn() {
		IndexedColumnImpl indexedColumn = new IndexedColumnImpl();
		return indexedColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryKeyColumnConstraint createPrimaryKeyColumnConstraint() {
		PrimaryKeyColumnConstraintImpl primaryKeyColumnConstraint = new PrimaryKeyColumnConstraintImpl();
		return primaryKeyColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForeignKeyColumnConstraint createForeignKeyColumnConstraint() {
		ForeignKeyColumnConstraintImpl foreignKeyColumnConstraint = new ForeignKeyColumnConstraintImpl();
		return foreignKeyColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotNullColumnConstraint createNotNullColumnConstraint() {
		NotNullColumnConstraintImpl notNullColumnConstraint = new NotNullColumnConstraintImpl();
		return notNullColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueColumnConstraint createUniqueColumnConstraint() {
		UniqueColumnConstraintImpl uniqueColumnConstraint = new UniqueColumnConstraintImpl();
		return uniqueColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckColumnConstraint createCheckColumnConstraint() {
		CheckColumnConstraintImpl checkColumnConstraint = new CheckColumnConstraintImpl();
		return checkColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultExpressionValueColumnConstraint createDefaultExpressionValueColumnConstraint() {
		DefaultExpressionValueColumnConstraintImpl defaultExpressionValueColumnConstraint = new DefaultExpressionValueColumnConstraintImpl();
		return defaultExpressionValueColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultStringValueColumnConstraint createDefaultStringValueColumnConstraint() {
		DefaultStringValueColumnConstraintImpl defaultStringValueColumnConstraint = new DefaultStringValueColumnConstraintImpl();
		return defaultStringValueColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultIntegerValueColumnConstraint createDefaultIntegerValueColumnConstraint() {
		DefaultIntegerValueColumnConstraintImpl defaultIntegerValueColumnConstraint = new DefaultIntegerValueColumnConstraintImpl();
		return defaultIntegerValueColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultRealValueColumnConstraint createDefaultRealValueColumnConstraint() {
		DefaultRealValueColumnConstraintImpl defaultRealValueColumnConstraint = new DefaultRealValueColumnConstraintImpl();
		return defaultRealValueColumnConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType createDataTypeFromString(EDataType eDataType, String initialValue) {
		DataType result = DataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColumnPackage getColumnPackage() {
		return (ColumnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ColumnPackage getPackage() {
		return ColumnPackage.eINSTANCE;
	}

} //ColumnFactoryImpl
