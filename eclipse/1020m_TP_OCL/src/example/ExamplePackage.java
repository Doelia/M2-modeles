/**
 */
package example;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see example.ExampleFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface ExamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "example";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "monCarnet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExamplePackage eINSTANCE = example.impl.ExamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link example.impl.AddressBookImpl <em>Address Book</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.impl.AddressBookImpl
	 * @see example.impl.ExamplePackageImpl#getAddressBook()
	 * @generated
	 */
	int ADDRESS_BOOK = 0;

	/**
	 * The feature id for the '<em><b>Book Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK__BOOK_NAME = 0;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK__ENTRIES = 1;

	/**
	 * The number of structural features of the '<em>Address Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK___NAME = 0;

	/**
	 * The number of operations of the '<em>Address Book</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_BOOK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link example.impl.EntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see example.impl.EntryImpl
	 * @see example.impl.ExamplePackageImpl#getEntry()
	 * @generated
	 */
	int ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Person Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PERSON_NAME = 0;

	/**
	 * The feature id for the '<em><b>Person Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__PERSON_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Annee Naissance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__ANNEE_NAISSANCE = 2;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY__AGE = 3;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Change Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY___CHANGE_AGE__BIGINTEGER = 0;

	/**
	 * The operation id for the '<em>Incremente Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY___INCREMENTE_AGE = 1;

	/**
	 * The number of operations of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link example.AddressBook <em>Address Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Book</em>'.
	 * @see example.AddressBook
	 * @generated
	 */
	EClass getAddressBook();

	/**
	 * Returns the meta object for the attribute '{@link example.AddressBook#getBookName <em>Book Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Book Name</em>'.
	 * @see example.AddressBook#getBookName()
	 * @see #getAddressBook()
	 * @generated
	 */
	EAttribute getAddressBook_BookName();

	/**
	 * Returns the meta object for the containment reference list '{@link example.AddressBook#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see example.AddressBook#getEntries()
	 * @see #getAddressBook()
	 * @generated
	 */
	EReference getAddressBook_Entries();

	/**
	 * Returns the meta object for the '{@link example.AddressBook#name() <em>Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Name</em>' operation.
	 * @see example.AddressBook#name()
	 * @generated
	 */
	EOperation getAddressBook__Name();

	/**
	 * Returns the meta object for class '{@link example.Entry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see example.Entry
	 * @generated
	 */
	EClass getEntry();

	/**
	 * Returns the meta object for the attribute '{@link example.Entry#getPersonName <em>Person Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Name</em>'.
	 * @see example.Entry#getPersonName()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_PersonName();

	/**
	 * Returns the meta object for the attribute '{@link example.Entry#getPersonAddress <em>Person Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Person Address</em>'.
	 * @see example.Entry#getPersonAddress()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_PersonAddress();

	/**
	 * Returns the meta object for the attribute '{@link example.Entry#getAnneeNaissance <em>Annee Naissance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annee Naissance</em>'.
	 * @see example.Entry#getAnneeNaissance()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_AnneeNaissance();

	/**
	 * Returns the meta object for the attribute '{@link example.Entry#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see example.Entry#getAge()
	 * @see #getEntry()
	 * @generated
	 */
	EAttribute getEntry_Age();

	/**
	 * Returns the meta object for the '{@link example.Entry#changeAge(java.math.BigInteger) <em>Change Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Age</em>' operation.
	 * @see example.Entry#changeAge(java.math.BigInteger)
	 * @generated
	 */
	EOperation getEntry__ChangeAge__BigInteger();

	/**
	 * Returns the meta object for the '{@link example.Entry#incrementeAge() <em>Incremente Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Incremente Age</em>' operation.
	 * @see example.Entry#incrementeAge()
	 * @generated
	 */
	EOperation getEntry__IncrementeAge();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExampleFactory getExampleFactory();

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
		 * The meta object literal for the '{@link example.impl.AddressBookImpl <em>Address Book</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.impl.AddressBookImpl
		 * @see example.impl.ExamplePackageImpl#getAddressBook()
		 * @generated
		 */
		EClass ADDRESS_BOOK = eINSTANCE.getAddressBook();

		/**
		 * The meta object literal for the '<em><b>Book Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_BOOK__BOOK_NAME = eINSTANCE.getAddressBook_BookName();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_BOOK__ENTRIES = eINSTANCE.getAddressBook_Entries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADDRESS_BOOK___NAME = eINSTANCE.getAddressBook__Name();

		/**
		 * The meta object literal for the '{@link example.impl.EntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see example.impl.EntryImpl
		 * @see example.impl.ExamplePackageImpl#getEntry()
		 * @generated
		 */
		EClass ENTRY = eINSTANCE.getEntry();

		/**
		 * The meta object literal for the '<em><b>Person Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PERSON_NAME = eINSTANCE.getEntry_PersonName();

		/**
		 * The meta object literal for the '<em><b>Person Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__PERSON_ADDRESS = eINSTANCE.getEntry_PersonAddress();

		/**
		 * The meta object literal for the '<em><b>Annee Naissance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__ANNEE_NAISSANCE = eINSTANCE.getEntry_AnneeNaissance();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY__AGE = eINSTANCE.getEntry_Age();

		/**
		 * The meta object literal for the '<em><b>Change Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRY___CHANGE_AGE__BIGINTEGER = eINSTANCE.getEntry__ChangeAge__BigInteger();

		/**
		 * The meta object literal for the '<em><b>Incremente Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTRY___INCREMENTE_AGE = eINSTANCE.getEntry__IncrementeAge();

	}

} //ExamplePackage
