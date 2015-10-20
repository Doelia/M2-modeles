/**
 */
package example.impl;

import example.Entry;
import example.ExamplePackage;

import java.lang.reflect.InvocationTargetException;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link example.impl.EntryImpl#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link example.impl.EntryImpl#getPersonAddress <em>Person Address</em>}</li>
 *   <li>{@link example.impl.EntryImpl#getAnneeNaissance <em>Annee Naissance</em>}</li>
 *   <li>{@link example.impl.EntryImpl#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntryImpl extends MinimalEObjectImpl.Container implements Entry {
	/**
	 * The default value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonName() <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonName()
	 * @generated
	 * @ordered
	 */
	protected String personName = PERSON_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonAddress() <em>Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSON_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonAddress() <em>Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonAddress()
	 * @generated
	 * @ordered
	 */
	protected String personAddress = PERSON_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnneeNaissance() <em>Annee Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeNaissance()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ANNEE_NAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnneeNaissance() <em>Annee Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeNaissance()
	 * @generated
	 * @ordered
	 */
	protected BigInteger anneeNaissance = ANNEE_NAISSANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger AGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected BigInteger age = AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonName(String newPersonName) {
		String oldPersonName = personName;
		personName = newPersonName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.ENTRY__PERSON_NAME, oldPersonName, personName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonAddress() {
		return personAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonAddress(String newPersonAddress) {
		String oldPersonAddress = personAddress;
		personAddress = newPersonAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.ENTRY__PERSON_ADDRESS, oldPersonAddress, personAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAnneeNaissance() {
		return anneeNaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnneeNaissance(BigInteger newAnneeNaissance) {
		BigInteger oldAnneeNaissance = anneeNaissance;
		anneeNaissance = newAnneeNaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.ENTRY__ANNEE_NAISSANCE, oldAnneeNaissance, anneeNaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(BigInteger newAge) {
		BigInteger oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.ENTRY__AGE, oldAge, age));
	}

	/**
	 * The cached invocation delegate for the '{@link #changeAge(java.math.BigInteger) <em>Change Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #changeAge(java.math.BigInteger)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CHANGE_AGE_BIG_INTEGER__EINVOCATION_DELEGATE = ((EOperation.Internal)ExamplePackage.Literals.ENTRY___CHANGE_AGE__BIGINTEGER).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeAge(BigInteger new_) {
		try {
			CHANGE_AGE_BIG_INTEGER__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{new_}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #incrementeAge() <em>Incremente Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #incrementeAge()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INCREMENTE_AGE__EINVOCATION_DELEGATE = ((EOperation.Internal)ExamplePackage.Literals.ENTRY___INCREMENTE_AGE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void incrementeAge() {
		try {
			INCREMENTE_AGE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExamplePackage.ENTRY__PERSON_NAME:
				return getPersonName();
			case ExamplePackage.ENTRY__PERSON_ADDRESS:
				return getPersonAddress();
			case ExamplePackage.ENTRY__ANNEE_NAISSANCE:
				return getAnneeNaissance();
			case ExamplePackage.ENTRY__AGE:
				return getAge();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExamplePackage.ENTRY__PERSON_NAME:
				setPersonName((String)newValue);
				return;
			case ExamplePackage.ENTRY__PERSON_ADDRESS:
				setPersonAddress((String)newValue);
				return;
			case ExamplePackage.ENTRY__ANNEE_NAISSANCE:
				setAnneeNaissance((BigInteger)newValue);
				return;
			case ExamplePackage.ENTRY__AGE:
				setAge((BigInteger)newValue);
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
			case ExamplePackage.ENTRY__PERSON_NAME:
				setPersonName(PERSON_NAME_EDEFAULT);
				return;
			case ExamplePackage.ENTRY__PERSON_ADDRESS:
				setPersonAddress(PERSON_ADDRESS_EDEFAULT);
				return;
			case ExamplePackage.ENTRY__ANNEE_NAISSANCE:
				setAnneeNaissance(ANNEE_NAISSANCE_EDEFAULT);
				return;
			case ExamplePackage.ENTRY__AGE:
				setAge(AGE_EDEFAULT);
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
			case ExamplePackage.ENTRY__PERSON_NAME:
				return PERSON_NAME_EDEFAULT == null ? personName != null : !PERSON_NAME_EDEFAULT.equals(personName);
			case ExamplePackage.ENTRY__PERSON_ADDRESS:
				return PERSON_ADDRESS_EDEFAULT == null ? personAddress != null : !PERSON_ADDRESS_EDEFAULT.equals(personAddress);
			case ExamplePackage.ENTRY__ANNEE_NAISSANCE:
				return ANNEE_NAISSANCE_EDEFAULT == null ? anneeNaissance != null : !ANNEE_NAISSANCE_EDEFAULT.equals(anneeNaissance);
			case ExamplePackage.ENTRY__AGE:
				return AGE_EDEFAULT == null ? age != null : !AGE_EDEFAULT.equals(age);
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
			case ExamplePackage.ENTRY___CHANGE_AGE__BIGINTEGER:
				changeAge((BigInteger)arguments.get(0));
				return null;
			case ExamplePackage.ENTRY___INCREMENTE_AGE:
				incrementeAge();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (personName: ");
		result.append(personName);
		result.append(", personAddress: ");
		result.append(personAddress);
		result.append(", anneeNaissance: ");
		result.append(anneeNaissance);
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //EntryImpl
