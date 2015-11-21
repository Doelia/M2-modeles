/**
 */
package uml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml.ParameterableElement;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateParameterSubstitution;
import uml.UmlPackage;

import uml.util.UmlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Parameter Substitution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getFormal <em>Formal</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getOwnedActual <em>Owned Actual</em>}</li>
 *   <li>{@link uml.impl.TemplateParameterSubstitutionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateParameterSubstitutionImpl extends ElementImpl implements TemplateParameterSubstitution {
	/**
	 * The cached value of the '{@link #getFormal() <em>Formal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormal()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter formal;

	/**
	 * The cached value of the '{@link #getActual() <em>Actual</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActual()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterableElement> actual;

	/**
	 * The cached value of the '{@link #getOwnedActual() <em>Owned Actual</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActual()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterableElement> ownedActual;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateParameterSubstitutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.eINSTANCE.getTemplateParameterSubstitution();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getFormal() {
		if (formal != null && formal.eIsProxy()) {
			InternalEObject oldFormal = (InternalEObject)formal;
			formal = (TemplateParameter)eResolveProxy(oldFormal);
			if (formal != oldFormal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
			}
		}
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetFormal() {
		return formal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormal(TemplateParameter newFormal) {
		TemplateParameter oldFormal = formal;
		formal = newFormal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL, oldFormal, formal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getActual() {
		if (actual == null) {
			actual = new EObjectResolvingEList<ParameterableElement>(ParameterableElement.class, this, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		}
		return actual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> getOwnedActual() {
		if (ownedActual == null) {
			ownedActual = new EObjectContainmentEList<ParameterableElement>(ParameterableElement.class, this, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		}
		return ownedActual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateBinding getTemplateBinding() {
		if (eContainerFeatureID() != UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING) return null;
		return (TemplateBinding)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateBinding(TemplateBinding newTemplateBinding, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTemplateBinding, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateBinding(TemplateBinding newTemplateBinding) {
		if (newTemplateBinding != eInternalContainer() || (eContainerFeatureID() != UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING && newTemplateBinding != null)) {
			if (EcoreUtil.isAncestor(this, newTemplateBinding))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTemplateBinding != null)
				msgs = ((InternalEObject)newTemplateBinding).eInverseAdd(this, UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
			msgs = basicSetTemplateBinding(newTemplateBinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING, newTemplateBinding, newTemplateBinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean must_be_compatible(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UmlValidator.DIAGNOSTIC_SOURCE,
						 UmlValidator.TEMPLATE_PARAMETER_SUBSTITUTION__MUST_BE_COMPATIBLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "must_be_compatible", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTemplateBinding((TemplateBinding)otherEnd, msgs);
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return ((InternalEList<?>)getOwnedActual()).basicRemove(otherEnd, msgs);
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return basicSetTemplateBinding(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return eInternalContainer().eInverseRemove(this, UmlPackage.TEMPLATE_BINDING__PARAMETER_SUBSTITUTION, TemplateBinding.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				if (resolve) return getFormal();
				return basicGetFormal();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return getActual();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return getOwnedActual();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBinding();
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActual().clear();
				getActual().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActual().clear();
				getOwnedActual().addAll((Collection<? extends ParameterableElement>)newValue);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)newValue);
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				setFormal((TemplateParameter)null);
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				getActual().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				getOwnedActual().clear();
				return;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				setTemplateBinding((TemplateBinding)null);
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL:
				return formal != null;
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL:
				return actual != null && !actual.isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL:
				return ownedActual != null && !ownedActual.isEmpty();
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING:
				return getTemplateBinding() != null;
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
			case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION___MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP:
				return must_be_compatible((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TemplateParameterSubstitutionImpl
