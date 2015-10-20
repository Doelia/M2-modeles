/**
 */
package example;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Book</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link example.AddressBook#getBookName <em>Book Name</em>}</li>
 *   <li>{@link example.AddressBook#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see example.ExamplePackage#getAddressBook()
 * @model
 * @generated
 */
public interface AddressBook extends EObject {
	/**
	 * Returns the value of the '<em><b>Book Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Book Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Book Name</em>' attribute.
	 * @see #setBookName(String)
	 * @see example.ExamplePackage#getAddressBook_BookName()
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='\'inconnu\''"
	 * @generated
	 */
	String getBookName();

	/**
	 * Sets the value of the '{@link example.AddressBook#getBookName <em>Book Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Book Name</em>' attribute.
	 * @see #getBookName()
	 * @generated
	 */
	void setBookName(String value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link example.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see example.ExamplePackage#getAddressBook_Entries()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Entry> getEntries();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.bookName'"
	 * @generated
	 */
	String name();

} // AddressBook
