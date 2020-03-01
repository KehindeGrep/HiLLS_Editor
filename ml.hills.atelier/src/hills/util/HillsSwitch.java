/**
 */
package hills.util;

import hills.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hills.HillsPackage
 * @generated
 */
public class HillsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HillsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HillsSwitch() {
		if (modelPackage == null) {
			modelPackage = HillsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case HillsPackage.HSPECIFICATION: {
				HSpecification hSpecification = (HSpecification)theEObject;
				T result = caseHSpecification(hSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.NOMME: {
				Nomme nomme = (Nomme)theEObject;
				T result = caseNomme(nomme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.HCLASSIFIER: {
				HClassifier hClassifier = (HClassifier)theEObject;
				T result = caseHClassifier(hClassifier);
				if (result == null) result = caseNomme(hClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.HSYSTEM: {
				HSystem hSystem = (HSystem)theEObject;
				T result = caseHSystem(hSystem);
				if (result == null) result = caseHClassifier(hSystem);
				if (result == null) result = caseNomme(hSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.HCLASS: {
				HClass hClass = (HClass)theEObject;
				T result = caseHClass(hClass);
				if (result == null) result = caseHClassifier(hClass);
				if (result == null) result = caseNomme(hClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PORT_DECLARATION: {
				PortDeclaration portDeclaration = (PortDeclaration)theEObject;
				T result = casePortDeclaration(portDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.GENERIC_NODE: {
				GenericNode genericNode = (GenericNode)theEObject;
				T result = caseGenericNode(genericNode);
				if (result == null) result = caseNomme(genericNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.LIEN: {
				Lien lien = (Lien)theEObject;
				T result = caseLien(lien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseLien(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.AGGREGATION: {
				Aggregation aggregation = (Aggregation)theEObject;
				T result = caseAggregation(aggregation);
				if (result == null) result = caseLien(aggregation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseLien(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.CONF_NOMME: {
				ConfNomme confNomme = (ConfNomme)theEObject;
				T result = caseConfNomme(confNomme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseConfNomme(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.FINITE_CONFIGURATION: {
				FiniteConfiguration finiteConfiguration = (FiniteConfiguration)theEObject;
				T result = caseFiniteConfiguration(finiteConfiguration);
				if (result == null) result = caseConfiguration(finiteConfiguration);
				if (result == null) result = caseConfNomme(finiteConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.INITIAL_CONFIGURATION: {
				InitialConfiguration initialConfiguration = (InitialConfiguration)theEObject;
				T result = caseInitialConfiguration(initialConfiguration);
				if (result == null) result = caseConfiguration(initialConfiguration);
				if (result == null) result = caseConfNomme(initialConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PASSIVE_CONFIGURATION: {
				PassiveConfiguration passiveConfiguration = (PassiveConfiguration)theEObject;
				T result = casePassiveConfiguration(passiveConfiguration);
				if (result == null) result = caseConfiguration(passiveConfiguration);
				if (result == null) result = caseConfNomme(passiveConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.TRANSIENT_CONFIGURATION: {
				TransientConfiguration transientConfiguration = (TransientConfiguration)theEObject;
				T result = caseTransientConfiguration(transientConfiguration);
				if (result == null) result = caseConfiguration(transientConfiguration);
				if (result == null) result = caseConfNomme(transientConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.CONFLUENT_TRANSITION: {
				ConfluentTransition confluentTransition = (ConfluentTransition)theEObject;
				T result = caseConfluentTransition(confluentTransition);
				if (result == null) result = caseTransition(confluentTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.INTERNAL_TRANSITION: {
				InternalTransition internalTransition = (InternalTransition)theEObject;
				T result = caseInternalTransition(internalTransition);
				if (result == null) result = caseTransition(internalTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.EXTERNAL_TRANSITION: {
				ExternalTransition externalTransition = (ExternalTransition)theEObject;
				T result = caseExternalTransition(externalTransition);
				if (result == null) result = caseTransition(externalTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.SOJOURN_TIME: {
				SojournTime sojournTime = (SojournTime)theEObject;
				T result = caseSojournTime(sojournTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.TEST_NODE: {
				TestNode testNode = (TestNode)theEObject;
				T result = caseTestNode(testNode);
				if (result == null) result = caseConfiguration(testNode);
				if (result == null) result = caseConfNomme(testNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.HREQUIREMENT_SPECIFICATION: {
				HRequirementSpecification hRequirementSpecification = (HRequirementSpecification)theEObject;
				T result = caseHRequirementSpecification(hRequirementSpecification);
				if (result == null) result = caseNomme(hRequirementSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.BEXISTENCE: {
				BExistence bExistence = (BExistence)theEObject;
				T result = caseBExistence(bExistence);
				if (result == null) result = caseTLProperty(bExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.UEXISTENCE: {
				UExistence uExistence = (UExistence)theEObject;
				T result = caseUExistence(uExistence);
				if (result == null) result = caseTLProperty(uExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.EEXISTENCE: {
				EExistence eExistence = (EExistence)theEObject;
				T result = caseEExistence(eExistence);
				if (result == null) result = caseTLProperty(eExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.CABSENCE: {
				CAbsence cAbsence = (CAbsence)theEObject;
				T result = caseCAbsence(cAbsence);
				if (result == null) result = caseTLProperty(cAbsence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.TL_PROPERTY: {
				TLProperty tlProperty = (TLProperty)theEObject;
				T result = caseTLProperty(tlProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.RESPONSE_CHAIN: {
				ResponseChain responseChain = (ResponseChain)theEObject;
				T result = caseResponseChain(responseChain);
				if (result == null) result = casePropertyPattern(responseChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PRECEDENCE_CHAIN: {
				PrecedenceChain precedenceChain = (PrecedenceChain)theEObject;
				T result = casePrecedenceChain(precedenceChain);
				if (result == null) result = casePropertyPattern(precedenceChain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.BOUNDED_EXISTENCE: {
				BoundedExistence boundedExistence = (BoundedExistence)theEObject;
				T result = caseBoundedExistence(boundedExistence);
				if (result == null) result = casePropertyPattern(boundedExistence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PROPERTY_PATTERN: {
				PropertyPattern propertyPattern = (PropertyPattern)theEObject;
				T result = casePropertyPattern(propertyPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.MULTI_TRIGGER: {
				MultiTrigger multiTrigger = (MultiTrigger)theEObject;
				T result = caseMultiTrigger(multiTrigger);
				if (result == null) result = caseResponseChain(multiTrigger);
				if (result == null) result = casePropertyPattern(multiTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.SINGLE_TRIGGER: {
				SingleTrigger singleTrigger = (SingleTrigger)theEObject;
				T result = caseSingleTrigger(singleTrigger);
				if (result == null) result = caseResponseChain(singleTrigger);
				if (result == null) result = casePropertyPattern(singleTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.MULTI_CAUSE: {
				MultiCause multiCause = (MultiCause)theEObject;
				T result = caseMultiCause(multiCause);
				if (result == null) result = casePrecedenceChain(multiCause);
				if (result == null) result = casePropertyPattern(multiCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = casePropertyPattern(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.UNIVERSALITY: {
				Universality universality = (Universality)theEObject;
				T result = caseUniversality(universality);
				if (result == null) result = casePropertyPattern(universality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PRECEDENCE: {
				Precedence precedence = (Precedence)theEObject;
				T result = casePrecedence(precedence);
				if (result == null) result = casePropertyPattern(precedence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.SINGLE_CAUSE: {
				SingleCause singleCause = (SingleCause)theEObject;
				T result = caseSingleCause(singleCause);
				if (result == null) result = casePrecedenceChain(singleCause);
				if (result == null) result = casePropertyPattern(singleCause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.EXISTENCE: {
				Existence existence = (Existence)theEObject;
				T result = caseExistence(existence);
				if (result == null) result = casePropertyPattern(existence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.ABSENCE: {
				Absence absence = (Absence)theEObject;
				T result = caseAbsence(absence);
				if (result == null) result = casePropertyPattern(absence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PROPOSITION: {
				Proposition proposition = (Proposition)theEObject;
				T result = caseProposition(proposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.PREDICAT: {
				Predicat predicat = (Predicat)theEObject;
				T result = casePredicat(predicat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.BEFORE: {
				Before before = (Before)theEObject;
				T result = caseBefore(before);
				if (result == null) result = caseScope(before);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.AFTER: {
				After after = (After)theEObject;
				T result = caseAfter(after);
				if (result == null) result = caseScope(after);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.GLOBAL: {
				Global global = (Global)theEObject;
				T result = caseGlobal(global);
				if (result == null) result = caseScope(global);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.AFTER_UNTIL: {
				AfterUntil afterUntil = (AfterUntil)theEObject;
				T result = caseAfterUntil(afterUntil);
				if (result == null) result = caseScope(afterUntil);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.BETWEEN: {
				Between between = (Between)theEObject;
				T result = caseBetween(between);
				if (result == null) result = caseScope(between);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.IMPLICATION: {
				Implication implication = (Implication)theEObject;
				T result = caseImplication(implication);
				if (result == null) result = caseTLLien(implication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.NEXT: {
				Next next = (Next)theEObject;
				T result = caseNext(next);
				if (result == null) result = caseTLLien(next);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.CONCURRENCY: {
				Concurrency concurrency = (Concurrency)theEObject;
				T result = caseConcurrency(concurrency);
				if (result == null) result = caseTLLien(concurrency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HillsPackage.TL_LIEN: {
				TLLien tlLien = (TLLien)theEObject;
				T result = caseTLLien(tlLien);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSpecification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSpecification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSpecification(HSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nomme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nomme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNomme(Nomme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HClassifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HClassifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClassifier(HClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HSystem</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HSystem</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHSystem(HSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHClass(HClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortDeclaration(PortDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericNode(GenericNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLien(Lien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregation(Aggregation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conf Nomme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conf Nomme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfNomme(ConfNomme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finite Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finite Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiniteConfiguration(FiniteConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initial Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initial Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialConfiguration(InitialConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passive Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passive Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassiveConfiguration(PassiveConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transient Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transient Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransientConfiguration(TransientConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confluent Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confluent Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfluentTransition(ConfluentTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInternalTransition(InternalTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalTransition(ExternalTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivity(Activity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sojourn Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sojourn Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSojournTime(SojournTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestNode(TestNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>HRequirement Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HRequirement Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHRequirementSpecification(HRequirementSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BExistence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BExistence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBExistence(BExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UExistence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UExistence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUExistence(UExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EExistence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EExistence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEExistence(EExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CAbsence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CAbsence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCAbsence(CAbsence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLProperty(TLProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseChain(ResponseChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence Chain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence Chain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedenceChain(PrecedenceChain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bounded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bounded Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundedExistence(BoundedExistence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyPattern(PropertyPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiTrigger(MultiTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleTrigger(SingleTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiCause(MultiCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Universality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Universality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniversality(Universality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Precedence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrecedence(Precedence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleCause(SingleCause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Existence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Existence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExistence(Existence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Absence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Absence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbsence(Absence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProposition(Proposition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicat(Predicat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Before</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Before</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBefore(Before object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfter(After object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobal(Global object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>After Until</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>After Until</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfterUntil(AfterUntil object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Between</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Between</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBetween(Between object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplication(Implication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Next</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Next</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNext(Next object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrency(Concurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TL Lien</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TL Lien</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTLLien(TLLien object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //HillsSwitch
