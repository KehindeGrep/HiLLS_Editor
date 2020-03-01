/**
 */
package hills.util;

import hills.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hills.HillsPackage
 * @generated
 */
public class HillsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HillsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HillsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HillsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HillsSwitch<Adapter> modelSwitch =
		new HillsSwitch<Adapter>() {
			@Override
			public Adapter caseHSpecification(HSpecification object) {
				return createHSpecificationAdapter();
			}
			@Override
			public Adapter caseNomme(Nomme object) {
				return createNommeAdapter();
			}
			@Override
			public Adapter caseHClassifier(HClassifier object) {
				return createHClassifierAdapter();
			}
			@Override
			public Adapter caseHSystem(HSystem object) {
				return createHSystemAdapter();
			}
			@Override
			public Adapter caseHClass(HClass object) {
				return createHClassAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter casePortDeclaration(PortDeclaration object) {
				return createPortDeclarationAdapter();
			}
			@Override
			public Adapter caseGenericNode(GenericNode object) {
				return createGenericNodeAdapter();
			}
			@Override
			public Adapter caseLien(Lien object) {
				return createLienAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseAggregation(Aggregation object) {
				return createAggregationAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseConfNomme(ConfNomme object) {
				return createConfNommeAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseFiniteConfiguration(FiniteConfiguration object) {
				return createFiniteConfigurationAdapter();
			}
			@Override
			public Adapter caseInitialConfiguration(InitialConfiguration object) {
				return createInitialConfigurationAdapter();
			}
			@Override
			public Adapter casePassiveConfiguration(PassiveConfiguration object) {
				return createPassiveConfigurationAdapter();
			}
			@Override
			public Adapter caseTransientConfiguration(TransientConfiguration object) {
				return createTransientConfigurationAdapter();
			}
			@Override
			public Adapter caseConfluentTransition(ConfluentTransition object) {
				return createConfluentTransitionAdapter();
			}
			@Override
			public Adapter caseInternalTransition(InternalTransition object) {
				return createInternalTransitionAdapter();
			}
			@Override
			public Adapter caseExternalTransition(ExternalTransition object) {
				return createExternalTransitionAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter caseSojournTime(SojournTime object) {
				return createSojournTimeAdapter();
			}
			@Override
			public Adapter caseTestNode(TestNode object) {
				return createTestNodeAdapter();
			}
			@Override
			public Adapter caseHRequirementSpecification(HRequirementSpecification object) {
				return createHRequirementSpecificationAdapter();
			}
			@Override
			public Adapter caseBExistence(BExistence object) {
				return createBExistenceAdapter();
			}
			@Override
			public Adapter caseUExistence(UExistence object) {
				return createUExistenceAdapter();
			}
			@Override
			public Adapter caseEExistence(EExistence object) {
				return createEExistenceAdapter();
			}
			@Override
			public Adapter caseCAbsence(CAbsence object) {
				return createCAbsenceAdapter();
			}
			@Override
			public Adapter caseTLProperty(TLProperty object) {
				return createTLPropertyAdapter();
			}
			@Override
			public Adapter caseResponseChain(ResponseChain object) {
				return createResponseChainAdapter();
			}
			@Override
			public Adapter casePrecedenceChain(PrecedenceChain object) {
				return createPrecedenceChainAdapter();
			}
			@Override
			public Adapter caseBoundedExistence(BoundedExistence object) {
				return createBoundedExistenceAdapter();
			}
			@Override
			public Adapter casePropertyPattern(PropertyPattern object) {
				return createPropertyPatternAdapter();
			}
			@Override
			public Adapter caseMultiTrigger(MultiTrigger object) {
				return createMultiTriggerAdapter();
			}
			@Override
			public Adapter caseSingleTrigger(SingleTrigger object) {
				return createSingleTriggerAdapter();
			}
			@Override
			public Adapter caseMultiCause(MultiCause object) {
				return createMultiCauseAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseUniversality(Universality object) {
				return createUniversalityAdapter();
			}
			@Override
			public Adapter casePrecedence(Precedence object) {
				return createPrecedenceAdapter();
			}
			@Override
			public Adapter caseSingleCause(SingleCause object) {
				return createSingleCauseAdapter();
			}
			@Override
			public Adapter caseExistence(Existence object) {
				return createExistenceAdapter();
			}
			@Override
			public Adapter caseAbsence(Absence object) {
				return createAbsenceAdapter();
			}
			@Override
			public Adapter caseProposition(Proposition object) {
				return createPropositionAdapter();
			}
			@Override
			public Adapter casePredicat(Predicat object) {
				return createPredicatAdapter();
			}
			@Override
			public Adapter caseBefore(Before object) {
				return createBeforeAdapter();
			}
			@Override
			public Adapter caseAfter(After object) {
				return createAfterAdapter();
			}
			@Override
			public Adapter caseGlobal(Global object) {
				return createGlobalAdapter();
			}
			@Override
			public Adapter caseAfterUntil(AfterUntil object) {
				return createAfterUntilAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter caseBetween(Between object) {
				return createBetweenAdapter();
			}
			@Override
			public Adapter caseImplication(Implication object) {
				return createImplicationAdapter();
			}
			@Override
			public Adapter caseNext(Next object) {
				return createNextAdapter();
			}
			@Override
			public Adapter caseConcurrency(Concurrency object) {
				return createConcurrencyAdapter();
			}
			@Override
			public Adapter caseTLLien(TLLien object) {
				return createTLLienAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hills.HSpecification <em>HSpecification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.HSpecification
	 * @generated
	 */
	public Adapter createHSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Nomme <em>Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Nomme
	 * @generated
	 */
	public Adapter createNommeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.HClassifier <em>HClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.HClassifier
	 * @generated
	 */
	public Adapter createHClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.HSystem <em>HSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.HSystem
	 * @generated
	 */
	public Adapter createHSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.HClass <em>HClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.HClass
	 * @generated
	 */
	public Adapter createHClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.PortDeclaration <em>Port Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.PortDeclaration
	 * @generated
	 */
	public Adapter createPortDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.GenericNode <em>Generic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.GenericNode
	 * @generated
	 */
	public Adapter createGenericNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Lien
	 * @generated
	 */
	public Adapter createLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Aggregation
	 * @generated
	 */
	public Adapter createAggregationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.ConfNomme <em>Conf Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.ConfNomme
	 * @generated
	 */
	public Adapter createConfNommeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.FiniteConfiguration <em>Finite Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.FiniteConfiguration
	 * @generated
	 */
	public Adapter createFiniteConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.InitialConfiguration <em>Initial Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.InitialConfiguration
	 * @generated
	 */
	public Adapter createInitialConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.PassiveConfiguration <em>Passive Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.PassiveConfiguration
	 * @generated
	 */
	public Adapter createPassiveConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.TransientConfiguration <em>Transient Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.TransientConfiguration
	 * @generated
	 */
	public Adapter createTransientConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.ConfluentTransition <em>Confluent Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.ConfluentTransition
	 * @generated
	 */
	public Adapter createConfluentTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.InternalTransition
	 * @generated
	 */
	public Adapter createInternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.ExternalTransition <em>External Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.ExternalTransition
	 * @generated
	 */
	public Adapter createExternalTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Activity
	 * @generated
	 */
	public Adapter createActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.SojournTime <em>Sojourn Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.SojournTime
	 * @generated
	 */
	public Adapter createSojournTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.TestNode <em>Test Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.TestNode
	 * @generated
	 */
	public Adapter createTestNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.HRequirementSpecification <em>HRequirement Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.HRequirementSpecification
	 * @generated
	 */
	public Adapter createHRequirementSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.BExistence <em>BExistence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.BExistence
	 * @generated
	 */
	public Adapter createBExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.UExistence <em>UExistence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.UExistence
	 * @generated
	 */
	public Adapter createUExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.EExistence <em>EExistence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.EExistence
	 * @generated
	 */
	public Adapter createEExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.CAbsence <em>CAbsence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.CAbsence
	 * @generated
	 */
	public Adapter createCAbsenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.TLProperty <em>TL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.TLProperty
	 * @generated
	 */
	public Adapter createTLPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.ResponseChain <em>Response Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.ResponseChain
	 * @generated
	 */
	public Adapter createResponseChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.PrecedenceChain <em>Precedence Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.PrecedenceChain
	 * @generated
	 */
	public Adapter createPrecedenceChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.BoundedExistence <em>Bounded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.BoundedExistence
	 * @generated
	 */
	public Adapter createBoundedExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.PropertyPattern <em>Property Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.PropertyPattern
	 * @generated
	 */
	public Adapter createPropertyPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.MultiTrigger <em>Multi Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.MultiTrigger
	 * @generated
	 */
	public Adapter createMultiTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.SingleTrigger <em>Single Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.SingleTrigger
	 * @generated
	 */
	public Adapter createSingleTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.MultiCause <em>Multi Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.MultiCause
	 * @generated
	 */
	public Adapter createMultiCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Universality <em>Universality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Universality
	 * @generated
	 */
	public Adapter createUniversalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Precedence
	 * @generated
	 */
	public Adapter createPrecedenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.SingleCause <em>Single Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.SingleCause
	 * @generated
	 */
	public Adapter createSingleCauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Existence
	 * @generated
	 */
	public Adapter createExistenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Absence <em>Absence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Absence
	 * @generated
	 */
	public Adapter createAbsenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Proposition
	 * @generated
	 */
	public Adapter createPropositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Predicat
	 * @generated
	 */
	public Adapter createPredicatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Before
	 * @generated
	 */
	public Adapter createBeforeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.After
	 * @generated
	 */
	public Adapter createAfterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Global
	 * @generated
	 */
	public Adapter createGlobalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.AfterUntil <em>After Until</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.AfterUntil
	 * @generated
	 */
	public Adapter createAfterUntilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Between <em>Between</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Between
	 * @generated
	 */
	public Adapter createBetweenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Implication
	 * @generated
	 */
	public Adapter createImplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Next
	 * @generated
	 */
	public Adapter createNextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.Concurrency
	 * @generated
	 */
	public Adapter createConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hills.TLLien <em>TL Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hills.TLLien
	 * @generated
	 */
	public Adapter createTLLienAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HillsAdapterFactory
