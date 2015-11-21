/**
 */
package uml;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier is a classification of instances - it describes a set of instances that have features in common. A classifier can specify a generalization hierarchy by referencing its general classifiers. A classifier has the capability to own collaboration uses. These collaboration uses link a collaboration with the classifier to give a description of the workings of the classifier. A classifier has the capability to own use cases. Although the owning classifier typically represents the subject to which the owned use cases apply, this is not necessarily the case. In principle, the same use case can be applied to multiple subjects, as identified by the subject association role of a use case. Classifier is defined to be a kind of templateable element so that a classifier can be parameterized. It is also defined to be a kind of parameterable element so that a classifier can be a formal template parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uml.Classifier#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml.Classifier#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml.Classifier#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link uml.Classifier#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml.Classifier#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml.Classifier#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml.Classifier#getGeneral <em>General</em>}</li>
 *   <li>{@link uml.Classifier#getSubstitution <em>Substitution</em>}</li>
 *   <li>{@link uml.Classifier#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml.Classifier#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link uml.Classifier#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link uml.Classifier#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link uml.Classifier#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @see uml.UmlPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends Namespace, RedefinableElement, Type, TemplateableElement {
	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the Classifier does not provide a complete declaration and can typically not be instantiated. An abstract classifier is intended to be used by other classifiers e.g. as the target of general metarelationships or generalization relationships. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see uml.UmlPackage#getClassifier_IsAbstract()
	 * @model default="false" dataType="uml.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link uml.Classifier#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Generalization</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Generalization}.
	 * It is bidirectional and its opposite is '{@link uml.Generalization#getSpecific <em>Specific</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the Generalization relationships for this Classifier. These Generalizations navigaten to more general classifiers in the generalization hierarchy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Generalization</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_Generalization()
	 * @see uml.Generalization#getSpecific
	 * @model opposite="specific" containment="true" ordered="false"
	 * @generated
	 */
	EList<Generalization> getGeneralization();

	/**
	 * Returns the value of the '<em><b>Powertype Extent</b></em>' reference list.
	 * The list contents are of type {@link uml.GeneralizationSet}.
	 * It is bidirectional and its opposite is '{@link uml.GeneralizationSet#getPowertype <em>Powertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Designates the GeneralizationSet of which the associated Classifier is a power type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Powertype Extent</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_PowertypeExtent()
	 * @see uml.GeneralizationSet#getPowertype
	 * @model opposite="powertype" ordered="false"
	 * @generated
	 */
	EList<GeneralizationSet> getPowertypeExtent();

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference list.
	 * The list contents are of type {@link uml.Feature}.
	 * It is bidirectional and its opposite is '{@link uml.Feature#getFeaturingClassifier <em>Featuring Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Note that there may be members of the Classifier that are of the type Feature but are not included in this association, e.g. inherited features. Specifies each feature defined in the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_Feature()
	 * @see uml.Feature#getFeaturingClassifier
	 * @model opposite="featuringClassifier" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Feature> getFeature();

	/**
	 * Returns the value of the '<em><b>Inherited Member</b></em>' reference list.
	 * The list contents are of type {@link uml.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies all elements inherited by this classifier from the general classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inherited Member</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_InheritedMember()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInheritedMember();

	/**
	 * Returns the value of the '<em><b>Redefined Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Classifiers that are redefined by this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Classifier</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_RedefinedClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getRedefinedClassifier();

	/**
	 * Returns the value of the '<em><b>General</b></em>' reference list.
	 * The list contents are of type {@link uml.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the general classifier in the Generalization relationship. Specifies the general Classifiers for this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>General</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_General()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getGeneral();

	/**
	 * Returns the value of the '<em><b>Substitution</b></em>' containment reference list.
	 * The list contents are of type {@link uml.Substitution}.
	 * It is bidirectional and its opposite is '{@link uml.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the substitutions that are owned by this Classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitution</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_Substitution()
	 * @see uml.Substitution#getSubstitutingClassifier
	 * @model opposite="substitutingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<Substitution> getSubstitution();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link uml.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to all of the Properties that are direct (i.e. not inherited or imported) attributes of the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_Attribute()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Property> getAttribute();

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a collaboration use which indicates the collaboration that represents this classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' reference.
	 * @see #setRepresentation(CollaborationUse)
	 * @see uml.UmlPackage#getClassifier_Representation()
	 * @model ordered="false"
	 * @generated
	 */
	CollaborationUse getRepresentation();

	/**
	 * Sets the value of the '{@link uml.Classifier#getRepresentation <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(CollaborationUse value);

	/**
	 * Returns the value of the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * The list contents are of type {@link uml.CollaborationUse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the collaboration uses owned by the classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Collaboration Use</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_CollaborationUse()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CollaborationUse> getCollaborationUse();

	/**
	 * Returns the value of the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * The list contents are of type {@link uml.UseCase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the use cases owned by this classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Use Case</em>' containment reference list.
	 * @see uml.UmlPackage#getClassifier_OwnedUseCase()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UseCase> getOwnedUseCase();

	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' reference list.
	 * The list contents are of type {@link uml.UseCase}.
	 * It is bidirectional and its opposite is '{@link uml.UseCase#getSubject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of use cases for which this Classifier is the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Case</em>' reference list.
	 * @see uml.UmlPackage#getClassifier_UseCase()
	 * @see uml.UseCase#getSubject
	 * @model opposite="subject" ordered="false"
	 * @generated
	 */
	EList<UseCase> getUseCase();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier. not self.allParents()->includes(self)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean no_cycles_in_generalization(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generalization hierarchies must be directed and acyclical. A classifier can not be both a transitively general and transitively specific classifier of the same classifier. not self.allParents()->includes(self)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean generalization_hierarchies(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A classifier may only specialize classifiers of a valid type. self.parents()->forAll(c | self.maySpecializeType(c))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean specialize_type(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Classifier that maps to a GeneralizationSet may neither be a specific nor a general Classifier in any of the Generalization relationships defined for that GeneralizationSet. In other words, a power type may not be an instance of itself nor may its instances also be its subclasses. true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean maps_to_generalization_set(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the attributes of this classifier, including those inherited from its parents.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Property> getAllAttributes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the operations of this classifier.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Operation> getOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the operations of this classifier, including those inherited from its parents.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Operation> getAllOperations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameDataType="uml.String" nameOrdered="false" parameterNamesDataType="uml.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesMany="true" parameterTypesOrdered="false"
	 * @generated
	 */
	Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the first operation with the specified name, parameter names, and parameter types from this classifier, ignoring case if indicated.
	 * @param name The name of the operation to retrieve, or null.
	 * @param parameterNames The parameter names of the operation to retrieve, or null.
	 * @param parameterTypes The parameter types of the operation to retrieve, or null.
	 * @param ignoreCase Whether to ignore case in String comparisons.
	 * <!-- end-model-doc -->
	 * @model ordered="false" nameDataType="uml.String" nameOrdered="false" parameterNamesDataType="uml.String" parameterNamesMany="true" parameterNamesOrdered="false" parameterTypesMany="true" parameterTypesOrdered="false" ignoreCaseDataType="uml.Boolean" ignoreCaseRequired="true" ignoreCaseOrdered="false"
	 * @generated
	 */
	Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, boolean ignoreCase);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves the interfaces on which this classifier has a usage dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Interface> getUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Retrieves all the interfaces on which this classifier or any of its parents has a usage dependency.
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Interface> getAllUsedInterfaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The general classifiers are the classifiers referenced by the generalization relationships. result = self.parents()
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<Classifier> getGenerals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inheritedMember association is derived by inheriting the inheritable members of the parents. result = self.inherit(self.parents()->collect(p | p.inheritableMembers(self))
	 * <!-- end-model-doc -->
	 * @model kind="operation" ordered="false"
	 * @generated
	 */
	EList<NamedElement> getInheritedMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allFeatures() gives all of the features in the namespace of the classifier. In general, through mechanisms such as inheritance, this will be a larger set than feature. result = member->select(oclIsKindOf(Feature))
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feature> allFeatures();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parents() gives all of the immediate ancestors of a generalized Classifier. result = generalization.general
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> parents();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query inheritableMembers() gives all of the members of a classifier that may be inherited in one of its descendants, subject to whatever visibility restrictions apply. c.allParents()->includes(self) result = member->select(m | c.hasVisibilityOf(m))
	 * <!-- end-model-doc -->
	 * @model ordered="false" cRequired="true" cOrdered="false"
	 * @generated
	 */
	EList<NamedElement> inheritableMembers(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query hasVisibilityOf() determines whether a named element is visible in the classifier. By default all are visible. It is only called when the argument is something owned by a parent. self.allParents()->collect(c | c.member)->includes(n) result = if (self.inheritedMember->includes(n)) then (n.visibility <> #private) else true
	 * <!-- end-model-doc -->
	 * @model dataType="uml.Boolean" required="true" ordered="false" nRequired="true" nOrdered="false"
	 * @generated
	 */
	boolean hasVisibilityOf(NamedElement n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query conformsTo() gives true for a classifier that defines a type that conforms to another. This is used, for example, in the specification of signature conformance for operations. result = (self=other) or (self.allParents()->includes(other))
	 * <!-- end-model-doc -->
	 * @model dataType="uml.Boolean" required="true" ordered="false" otherRequired="true" otherOrdered="false"
	 * @generated
	 */
	boolean conformsTo(Classifier other);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inherit operation is overridden to exclude redefined properties. The query inherit() defines how to inherit a set of elements. Here the operation is defined to inherit them all. It is intended to be redefined in circumstances where inheritance is affected by redefinition. result = inhs
	 * <!-- end-model-doc -->
	 * @model ordered="false" inhsMany="true" inhsOrdered="false"
	 * @generated
	 */
	EList<NamedElement> inherit(EList<NamedElement> inhs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query maySpecializeType() determines whether this classifier may have a generalization relationship to classifiers of the specified type. By default a classifier may specialize classifiers of the same or a more general type. It is intended to be redefined by classifiers that have different specialization constraints. result = self.oclIsKindOf(c.oclType)
	 * <!-- end-model-doc -->
	 * @model dataType="uml.Boolean" required="true" ordered="false" cRequired="true" cOrdered="false"
	 * @generated
	 */
	boolean maySpecializeType(Classifier c);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query allParents() gives all of the direct and indirect ancestors of a generalized Classifier. result = self.parents()->union(self.parents()->collect(p | p.allParents())
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> allParents();

} // Classifier
