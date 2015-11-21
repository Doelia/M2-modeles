/**
 */
package example.impl;

import example.AddressBook;
import example.Entry;
import example.ExamplePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link example.impl.AddressBookImpl#getBookName <em>Book Name</em>}</li>
 *   <li>{@link example.impl.AddressBookImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressBookImpl extends MinimalEObjectImpl.Container implements AddressBook {
	/**
	 * The cached setting delegate for the '{@link #getBookName() <em>Book Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookName()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate BOOK_NAME__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ExamplePackage.Literals.ADDRESS_BOOK__BOOK_NAME).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<Entry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressBookImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.ADDRESS_BOOK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookName() {
		return (String)BOOK_NAME__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookName(String newBookName) {
		BOOK_NAME__ESETTING_DELEGATE.dynamicSet(this, null, 0, newBookName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<Entry>(Entry.class, this, ExamplePackage.ADDRESS_BOOK__ENTRIES);
		}
		return entries;
	}

	/**
	 * The cached invocation delegate for the '{@link #name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #name()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NAME__EINVOCATION_DELEGATE = ((EOperation.Internal)ExamplePackage.Literals.ADDRESS_BOOK___NAME).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String name() {
		try {
			return (String)NAME__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExamplePackage.ADDRESS_BOOK__ENTRIES:
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
			case ExamplePackage.ADDRESS_BOOK__BOOK_NAME:
				return getBookName();
			case ExamplePackage.ADDRESS_BOOK__ENTRIES:
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
			case ExamplePackage.ADDRESS_BOOK__BOOK_NAME:
				setBookName((String)newValue);
				return;
			case ExamplePackage.ADDRESS_BOOK__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends Entry>)newValue);
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
			case ExamplePackage.ADDRESS_BOOK__BOOK_NAME:
				BOOK_NAME__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
			case ExamplePackage.ADDRESS_BOOK__ENTRIES:
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
			case ExamplePackage.ADDRESS_BOOK__BOOK_NAME:
				return BOOK_NAME__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ExamplePackage.ADDRESS_BOOK__ENTRIES:
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
			case ExamplePackage.ADDRESS_BOOK___NAME:
				return name();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AddressBookImpl
