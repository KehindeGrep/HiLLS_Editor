/**
 */
package hills.impl;

import hills.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HillsFactoryImpl extends EFactoryImpl implements HillsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HillsFactory init() {
		try {
			HillsFactory theHillsFactory = (HillsFactory)EPackage.Registry.INSTANCE.getEFactory(HillsPackage.eNS_URI);
			if (theHillsFactory != null) {
				return theHillsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HillsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HillsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HillsPackage.HSPECIFICATION: return createHSpecification();
			case HillsPackage.HSYSTEM: return createHSystem();
			case HillsPackage.HCLASS: return createHClass();
			case HillsPackage.PORT: return createPort();
			case HillsPackage.PORT_DECLARATION: return createPortDeclaration();
			case HillsPackage.GENERIC_NODE: return createGenericNode();
			case HillsPackage.COMPOSITION: return createComposition();
			case HillsPackage.AGGREGATION: return createAggregation();
			case HillsPackage.REFERENCE: return createReference();
			case HillsPackage.DECLARATION: return createDeclaration();
			case HillsPackage.FINITE_CONFIGURATION: return createFiniteConfiguration();
			case HillsPackage.INITIAL_CONFIGURATION: return createInitialConfiguration();
			case HillsPackage.PASSIVE_CONFIGURATION: return createPassiveConfiguration();
			case HillsPackage.TRANSIENT_CONFIGURATION: return createTransientConfiguration();
			case HillsPackage.CONFLUENT_TRANSITION: return createConfluentTransition();
			case HillsPackage.INTERNAL_TRANSITION: return createInternalTransition();
			case HillsPackage.EXTERNAL_TRANSITION: return createExternalTransition();
			case HillsPackage.FUNCTION: return createFunction();
			case HillsPackage.PROPERTY: return createProperty();
			case HillsPackage.ACTIVITY: return createActivity();
			case HillsPackage.SOJOURN_TIME: return createSojournTime();
			case HillsPackage.TEST_NODE: return createTestNode();
			case HillsPackage.HREQUIREMENT_SPECIFICATION: return createHRequirementSpecification();
			case HillsPackage.BEXISTENCE: return createBExistence();
			case HillsPackage.UEXISTENCE: return createUExistence();
			case HillsPackage.EEXISTENCE: return createEExistence();
			case HillsPackage.CABSENCE: return createCAbsence();
			case HillsPackage.TL_PROPERTY: return createTLProperty();
			case HillsPackage.RESPONSE_CHAIN: return createResponseChain();
			case HillsPackage.PRECEDENCE_CHAIN: return createPrecedenceChain();
			case HillsPackage.BOUNDED_EXISTENCE: return createBoundedExistence();
			case HillsPackage.PROPERTY_PATTERN: return createPropertyPattern();
			case HillsPackage.MULTI_TRIGGER: return createMultiTrigger();
			case HillsPackage.SINGLE_TRIGGER: return createSingleTrigger();
			case HillsPackage.MULTI_CAUSE: return createMultiCause();
			case HillsPackage.RESPONSE: return createResponse();
			case HillsPackage.UNIVERSALITY: return createUniversality();
			case HillsPackage.PRECEDENCE: return createPrecedence();
			case HillsPackage.SINGLE_CAUSE: return createSingleCause();
			case HillsPackage.EXISTENCE: return createExistence();
			case HillsPackage.ABSENCE: return createAbsence();
			case HillsPackage.PROPOSITION: return createProposition();
			case HillsPackage.PREDICAT: return createPredicat();
			case HillsPackage.BEFORE: return createBefore();
			case HillsPackage.AFTER: return createAfter();
			case HillsPackage.GLOBAL: return createGlobal();
			case HillsPackage.AFTER_UNTIL: return createAfterUntil();
			case HillsPackage.SCOPE: return createScope();
			case HillsPackage.BETWEEN: return createBetween();
			case HillsPackage.IMPLICATION: return createImplication();
			case HillsPackage.NEXT: return createNext();
			case HillsPackage.CONCURRENCY: return createConcurrency();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSpecification createHSpecification() {
		HSpecificationImpl hSpecification = new HSpecificationImpl();
		return hSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HSystem createHSystem() {
		HSystemImpl hSystem = new HSystemImpl();
		return hSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HClass createHClass() {
		HClassImpl hClass = new HClassImpl();
		return hClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDeclaration createPortDeclaration() {
		PortDeclarationImpl portDeclaration = new PortDeclarationImpl();
		return portDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericNode createGenericNode() {
		GenericNodeImpl genericNode = new GenericNodeImpl();
		return genericNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Aggregation createAggregation() {
		AggregationImpl aggregation = new AggregationImpl();
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference createReference() {
		ReferenceImpl reference = new ReferenceImpl();
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Declaration createDeclaration() {
		DeclarationImpl declaration = new DeclarationImpl();
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FiniteConfiguration createFiniteConfiguration() {
		FiniteConfigurationImpl finiteConfiguration = new FiniteConfigurationImpl();
		return finiteConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InitialConfiguration createInitialConfiguration() {
		InitialConfigurationImpl initialConfiguration = new InitialConfigurationImpl();
		return initialConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PassiveConfiguration createPassiveConfiguration() {
		PassiveConfigurationImpl passiveConfiguration = new PassiveConfigurationImpl();
		return passiveConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransientConfiguration createTransientConfiguration() {
		TransientConfigurationImpl transientConfiguration = new TransientConfigurationImpl();
		return transientConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfluentTransition createConfluentTransition() {
		ConfluentTransitionImpl confluentTransition = new ConfluentTransitionImpl();
		return confluentTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalTransition createInternalTransition() {
		InternalTransitionImpl internalTransition = new InternalTransitionImpl();
		return internalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalTransition createExternalTransition() {
		ExternalTransitionImpl externalTransition = new ExternalTransitionImpl();
		return externalTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity createActivity() {
		ActivityImpl activity = new ActivityImpl();
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SojournTime createSojournTime() {
		SojournTimeImpl sojournTime = new SojournTimeImpl();
		return sojournTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TestNode createTestNode() {
		TestNodeImpl testNode = new TestNodeImpl();
		return testNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HRequirementSpecification createHRequirementSpecification() {
		HRequirementSpecificationImpl hRequirementSpecification = new HRequirementSpecificationImpl();
		return hRequirementSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BExistence createBExistence() {
		BExistenceImpl bExistence = new BExistenceImpl();
		return bExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UExistence createUExistence() {
		UExistenceImpl uExistence = new UExistenceImpl();
		return uExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EExistence createEExistence() {
		EExistenceImpl eExistence = new EExistenceImpl();
		return eExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CAbsence createCAbsence() {
		CAbsenceImpl cAbsence = new CAbsenceImpl();
		return cAbsence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TLProperty createTLProperty() {
		TLPropertyImpl tlProperty = new TLPropertyImpl();
		return tlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResponseChain createResponseChain() {
		ResponseChainImpl responseChain = new ResponseChainImpl();
		return responseChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrecedenceChain createPrecedenceChain() {
		PrecedenceChainImpl precedenceChain = new PrecedenceChainImpl();
		return precedenceChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundedExistence createBoundedExistence() {
		BoundedExistenceImpl boundedExistence = new BoundedExistenceImpl();
		return boundedExistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertyPattern createPropertyPattern() {
		PropertyPatternImpl propertyPattern = new PropertyPatternImpl();
		return propertyPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiTrigger createMultiTrigger() {
		MultiTriggerImpl multiTrigger = new MultiTriggerImpl();
		return multiTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleTrigger createSingleTrigger() {
		SingleTriggerImpl singleTrigger = new SingleTriggerImpl();
		return singleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MultiCause createMultiCause() {
		MultiCauseImpl multiCause = new MultiCauseImpl();
		return multiCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Universality createUniversality() {
		UniversalityImpl universality = new UniversalityImpl();
		return universality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Precedence createPrecedence() {
		PrecedenceImpl precedence = new PrecedenceImpl();
		return precedence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleCause createSingleCause() {
		SingleCauseImpl singleCause = new SingleCauseImpl();
		return singleCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Existence createExistence() {
		ExistenceImpl existence = new ExistenceImpl();
		return existence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Absence createAbsence() {
		AbsenceImpl absence = new AbsenceImpl();
		return absence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proposition createProposition() {
		PropositionImpl proposition = new PropositionImpl();
		return proposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicat createPredicat() {
		PredicatImpl predicat = new PredicatImpl();
		return predicat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Before createBefore() {
		BeforeImpl before = new BeforeImpl();
		return before;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public After createAfter() {
		AfterImpl after = new AfterImpl();
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Global createGlobal() {
		GlobalImpl global = new GlobalImpl();
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AfterUntil createAfterUntil() {
		AfterUntilImpl afterUntil = new AfterUntilImpl();
		return afterUntil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Between createBetween() {
		BetweenImpl between = new BetweenImpl();
		return between;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Implication createImplication() {
		ImplicationImpl implication = new ImplicationImpl();
		return implication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Next createNext() {
		NextImpl next = new NextImpl();
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HillsPackage getHillsPackage() {
		return (HillsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HillsPackage getPackage() {
		return HillsPackage.eINSTANCE;
	}

} //HillsFactoryImpl
