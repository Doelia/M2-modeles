/**
 */
package uml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The realization concept is specialized to (optionally) define the classifiers that realize the contract offered by a component in terms of its provided and required interfaces. The component forms an abstraction from these various classifiers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.ComponentRealization#getAbstraction <em>Abstraction</em>}</li>
 *   <li>{@link uml.ComponentRealization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getComponentRealization()
 * @model
 * @generated
 */
public interface ComponentRealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml.Component#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Component that owns this ComponentRealization and which is implemented by its realizing classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see uml.UmlPackage#getComponentRealization_Abstraction()
	 * @see uml.Component#getRealization
	 * @model opposite="realization" transient="false" ordered="false"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link uml.ComponentRealization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier that is involved in the implementation of the Component that owns this ComponentRealization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference.
	 * @see #setRealizingClassifier(Classifier)
	 * @see uml.UmlPackage#getComponentRealization_RealizingClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getRealizingClassifier();

	/**
	 * Sets the value of the '{@link uml.ComponentRealization#getRealizingClassifier <em>Realizing Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizing Classifier</em>' reference.
	 * @see #getRealizingClassifier()
	 * @generated
	 */
	void setRealizingClassifier(Classifier value);

} // ComponentRealization
