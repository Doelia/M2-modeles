/**
 */
package uml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.DataType;
import uml.Operation;
import uml.Property;
import uml.Type;
import uml.UmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.impl.DataTypeImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link uml.impl.DataTypeImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends ClassifierImpl implements DataType {
	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.eINSTANCE.getDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE, UmlPackage.PROPERTY__DATATYPE);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, UmlPackage.DATA_TYPE__OWNED_OPERATION, UmlPackage.OPERATION__DATATYPE);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, Type returnType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
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
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return getOwnedOperation();
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
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
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
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				getOwnedOperation().clear();
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
			case UmlPackage.DATA_TYPE__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case UmlPackage.DATA_TYPE__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case UmlPackage.DATA_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
				return createOwnedOperation((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Type>)arguments.get(2), (Type)arguments.get(3));
			case UmlPackage.DATA_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
				return createOwnedAttribute((String)arguments.get(0), (Type)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataTypeImpl
