/**
 */
package org.yatech.sqlitedb.modeler.model.common.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.yatech.sqlitedb.modeler.model.common.CommonFactory;
import org.yatech.sqlitedb.modeler.model.common.CommonPackage;
import org.yatech.sqlitedb.modeler.model.common.MappingEntry;
import org.yatech.sqlitedb.modeler.model.common.TableMapping;
import org.yatech.sqlitedb.modeler.model.table.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl#getPrev2entryMap <em>Prev2entry Map</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl#getCurr2entryMap <em>Curr2entry Map</em>}</li>
 *   <li>{@link org.yatech.sqlitedb.modeler.model.common.impl.TableMappingImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableMappingImpl extends MinimalEObjectImpl.Container implements TableMapping {
	/**
	 * The cached value of the '{@link #getPrev2entryMap() <em>Prev2entry Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev2entryMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, MappingEntry<Table>> prev2entryMap;

	/**
	 * The cached value of the '{@link #getCurr2entryMap() <em>Curr2entry Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurr2entryMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, MappingEntry<Table>> curr2entryMap;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingEntry<Table>> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TABLE_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, MappingEntry<Table>> getPrev2entryMap() {
		if (prev2entryMap == null) {
			prev2entryMap = new EcoreEMap<String,MappingEntry<Table>>(CommonPackage.Literals.STRING_TO_TABLE_MAPPING_ENTRY_MAP, StringToTableMappingEntryMapImpl.class, this, CommonPackage.TABLE_MAPPING__PREV2ENTRY_MAP);
		}
		return prev2entryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, MappingEntry<Table>> getCurr2entryMap() {
		if (curr2entryMap == null) {
			curr2entryMap = new EcoreEMap<String,MappingEntry<Table>>(CommonPackage.Literals.STRING_TO_TABLE_MAPPING_ENTRY_MAP, StringToTableMappingEntryMapImpl.class, this, CommonPackage.TABLE_MAPPING__CURR2ENTRY_MAP);
		}
		return curr2entryMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MappingEntry<Table>> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<MappingEntry<Table>>(MappingEntry.class, this, CommonPackage.TABLE_MAPPING__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getPrevious(final Table current) {
		String currKey = current.getName();
		MappingEntry<Table> mappingEntry = getCurr2entryMap().get(currKey);
		if (mappingEntry == null) return null;
		return mappingEntry.getPrevious();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<Table> getAllPrevious() {
		Collection<Table> all = new ArrayList<Table>(getEntries().size());
		for (MappingEntry<Table> entry : getEntries()) {
			all.add(entry.getPrevious());
		}
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table getCurrent(final Table previous) {
		String prevKey = previous.getName();
		MappingEntry<Table> mappingEntry = getPrev2entryMap().get(prevKey);
		if (mappingEntry == null) return null;
		return mappingEntry.getCurrent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<Table> getAllCurrent() {
		Collection<Table> all = new ArrayList<Table>(getEntries().size());
		for (MappingEntry<Table> entry : getEntries()) {
			all.add(entry.getCurrent());
		}
		return all;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void put(final Table previous, final Table current) {
		MappingEntry<Table> entry = CommonFactory.eINSTANCE.createMappingEntry();
		entry.setPrevious(previous);
		entry.setCurrent(current);
		String prevKey = previous.getName();
		String currKey = current.getName();
		// TODO - Do it in a transaction
		// If there is already a mapping for previous or current - remove it
		if (getPrev2entryMap().containsKey(prevKey) || getCurr2entryMap().containsKey(currKey)) {
			MappingEntry<Table> oldEntry;
			oldEntry = getPrev2entryMap().removeKey(prevKey);
			if (oldEntry != null) getEntries().remove(oldEntry);
			oldEntry = getCurr2entryMap().removeKey(currKey);
			if (oldEntry != null) getEntries().remove(oldEntry);
		}
		getEntries().add(entry);
		getPrev2entryMap().put(prevKey, entry);
		getCurr2entryMap().put(currKey, entry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<MappingEntry<Table>> entries() {
		return Collections.unmodifiableCollection(getEntries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.TABLE_MAPPING__PREV2ENTRY_MAP:
				return ((InternalEList<?>)getPrev2entryMap()).basicRemove(otherEnd, msgs);
			case CommonPackage.TABLE_MAPPING__CURR2ENTRY_MAP:
				return ((InternalEList<?>)getCurr2entryMap()).basicRemove(otherEnd, msgs);
			case CommonPackage.TABLE_MAPPING__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TABLE_MAPPING__PREV2ENTRY_MAP:
				if (coreType) return getPrev2entryMap();
				else return getPrev2entryMap().map();
			case CommonPackage.TABLE_MAPPING__CURR2ENTRY_MAP:
				if (coreType) return getCurr2entryMap();
				else return getCurr2entryMap().map();
			case CommonPackage.TABLE_MAPPING__ENTRIES:
				return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.TABLE_MAPPING__PREV2ENTRY_MAP:
				((EStructuralFeature.Setting)getPrev2entryMap()).set(newValue);
				return;
			case CommonPackage.TABLE_MAPPING__CURR2ENTRY_MAP:
				((EStructuralFeature.Setting)getCurr2entryMap()).set(newValue);
				return;
			case CommonPackage.TABLE_MAPPING__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends MappingEntry<Table>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.TABLE_MAPPING__PREV2ENTRY_MAP:
				getPrev2entryMap().clear();
				return;
			case CommonPackage.TABLE_MAPPING__CURR2ENTRY_MAP:
				getCurr2entryMap().clear();
				return;
			case CommonPackage.TABLE_MAPPING__ENTRIES:
				getEntries().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.TABLE_MAPPING__PREV2ENTRY_MAP:
				return prev2entryMap != null && !prev2entryMap.isEmpty();
			case CommonPackage.TABLE_MAPPING__CURR2ENTRY_MAP:
				return curr2entryMap != null && !curr2entryMap.isEmpty();
			case CommonPackage.TABLE_MAPPING__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CommonPackage.TABLE_MAPPING___GET_PREVIOUS__TABLE:
				return getPrevious((Table)arguments.get(0));
			case CommonPackage.TABLE_MAPPING___GET_ALL_PREVIOUS:
				return getAllPrevious();
			case CommonPackage.TABLE_MAPPING___GET_CURRENT__TABLE:
				return getCurrent((Table)arguments.get(0));
			case CommonPackage.TABLE_MAPPING___GET_ALL_CURRENT:
				return getAllCurrent();
			case CommonPackage.TABLE_MAPPING___PUT__TABLE_TABLE:
				put((Table)arguments.get(0), (Table)arguments.get(1));
				return null;
			case CommonPackage.TABLE_MAPPING___ENTRIES:
				return entries();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableMappingImpl
