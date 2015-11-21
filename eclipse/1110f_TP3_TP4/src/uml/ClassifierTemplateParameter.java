/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier template parameter exposes a classifier as a formal template parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}</li>
 *   <li>{@link uml.ClassifierTemplateParameter#getDefaultClassifier <em>Default Classifier</em>}</li>
 *   <li>{@link uml.ClassifierTemplateParameter#getConstrainingClassifier <em>Constraining Classifier</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getClassifierTemplateParameter()
 * @model
 * @generated
 */
public interface ClassifierTemplateParameter extends TemplateParameter {
	/**
	 * Returns the value of the '<em><b>Allow Substitutable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constrains the required relationship between an actual parameter and the parameteredElement for this formal parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #setAllowSubstitutable(boolean)
	 * @see uml.UmlPackage#getClassifierTemplateParameter_AllowSubstitutable()
	 * @model default="true" dataType="uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isAllowSubstitutable();

	/**
	 * Sets the value of the '{@link uml.ClassifierTemplateParameter#isAllowSubstitutable <em>Allow Substitutable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Substitutable</em>' attribute.
	 * @see #isAllowSubstitutable()
	 * @generated
	 */
	void setAllowSubstitutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that is used by default if no argument is provided during template binding. If this property is empty, then there is no default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Classifier</em>' reference.
	 * @see #setDefaultClassifier(Classifier)
	 * @see uml.UmlPackage#getClassifierTemplateParameter_DefaultClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getDefaultClassifier();

	/**
	 * Sets the value of the '{@link uml.ClassifierTemplateParameter#getDefaultClassifier <em>Default Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Classifier</em>' reference.
	 * @see #getDefaultClassifier()
	 * @generated
	 */
	void setDefaultClassifier(Classifier value);

	/**
	 * Returns the value of the '<em><b>Constraining Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that constrains the argument that can be used for the parameter. If the allowSubstitutable attribute is true, then any classifier that is compatible with this constraining classifier can be substituted, otherwise it must be either this classifier or one of its subclasses. If this property is empty, there are no constraints on the classifier that can be used as an argument.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constraining Classifier</em>' reference.
	 * @see #setConstrainingClassifier(Classifier)
	 * @see uml.UmlPackage#getClassifierTemplateParameter_ConstrainingClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	Classifier getConstrainingClassifier();

	/**
	 * Sets the value of the '{@link uml.ClassifierTemplateParameter#getConstrainingClassifier <em>Constraining Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraining Classifier</em>' reference.
	 * @see #getConstrainingClassifier()
	 * @generated
	 */
	void setConstrainingClassifier(Classifier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If "allowSubstitutable" is true, then there must be a constrainingClassifier. allowSubstitutable implies constrainingClassifier->notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean has_constraining_classifier(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ClassifierTemplateParameter
