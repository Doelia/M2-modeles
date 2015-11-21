/**
 */
package example;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link example.Entry#getPersonName <em>Person Name</em>}</li>
 *   <li>{@link example.Entry#getPersonAddress <em>Person Address</em>}</li>
 *   <li>{@link example.Entry#getAnneeNaissance <em>Annee Naissance</em>}</li>
 *   <li>{@link example.Entry#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @see example.ExamplePackage#getEntry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ageCorrect'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot null='age = 2015 - self.anneeNaissance' ageCorrect='self.age < 140 and self.age >=0'"
 * @generated
 */
public interface Entry extends EObject {
	/**
	 * Returns the value of the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Name</em>' attribute.
	 * @see #setPersonName(String)
	 * @see example.ExamplePackage#getEntry_PersonName()
	 * @model
	 * @generated
	 */
	String getPersonName();

	/**
	 * Sets the value of the '{@link example.Entry#getPersonName <em>Person Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Name</em>' attribute.
	 * @see #getPersonName()
	 * @generated
	 */
	void setPersonName(String value);

	/**
	 * Returns the value of the '<em><b>Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Address</em>' attribute.
	 * @see #setPersonAddress(String)
	 * @see example.ExamplePackage#getEntry_PersonAddress()
	 * @model
	 * @generated
	 */
	String getPersonAddress();

	/**
	 * Sets the value of the '{@link example.Entry#getPersonAddress <em>Person Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person Address</em>' attribute.
	 * @see #getPersonAddress()
	 * @generated
	 */
	void setPersonAddress(String value);

	/**
	 * Returns the value of the '<em><b>Annee Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annee Naissance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annee Naissance</em>' attribute.
	 * @see #setAnneeNaissance(BigInteger)
	 * @see example.ExamplePackage#getEntry_AnneeNaissance()
	 * @model
	 * @generated
	 */
	BigInteger getAnneeNaissance();

	/**
	 * Sets the value of the '{@link example.Entry#getAnneeNaissance <em>Annee Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annee Naissance</em>' attribute.
	 * @see #getAnneeNaissance()
	 * @generated
	 */
	void setAnneeNaissance(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(BigInteger)
	 * @see example.ExamplePackage#getEntry_Age()
	 * @model
	 * @generated
	 */
	BigInteger getAge();

	/**
	 * Sets the value of the '{@link example.Entry#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(BigInteger value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot pre='new >=0 and new <140' post='self.age = new'"
	 * @generated
	 */
	void changeAge(BigInteger new_);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot post='self.age = self.age@pre+1'"
	 * @generated
	 */
	void incrementeAge();

} // Entry
