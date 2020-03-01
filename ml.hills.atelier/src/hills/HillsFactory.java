/**
 */
package hills;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hills.HillsPackage
 * @generated
 */
public interface HillsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HillsFactory eINSTANCE = hills.impl.HillsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>HSpecification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSpecification</em>'.
	 * @generated
	 */
	HSpecification createHSpecification();

	/**
	 * Returns a new object of class '<em>HSystem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HSystem</em>'.
	 * @generated
	 */
	HSystem createHSystem();

	/**
	 * Returns a new object of class '<em>HClass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HClass</em>'.
	 * @generated
	 */
	HClass createHClass();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Port Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Declaration</em>'.
	 * @generated
	 */
	PortDeclaration createPortDeclaration();

	/**
	 * Returns a new object of class '<em>Generic Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Node</em>'.
	 * @generated
	 */
	GenericNode createGenericNode();

	/**
	 * Returns a new object of class '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composition</em>'.
	 * @generated
	 */
	Composition createComposition();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference</em>'.
	 * @generated
	 */
	Reference createReference();

	/**
	 * Returns a new object of class '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Declaration</em>'.
	 * @generated
	 */
	Declaration createDeclaration();

	/**
	 * Returns a new object of class '<em>Finite Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finite Configuration</em>'.
	 * @generated
	 */
	FiniteConfiguration createFiniteConfiguration();

	/**
	 * Returns a new object of class '<em>Initial Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initial Configuration</em>'.
	 * @generated
	 */
	InitialConfiguration createInitialConfiguration();

	/**
	 * Returns a new object of class '<em>Passive Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passive Configuration</em>'.
	 * @generated
	 */
	PassiveConfiguration createPassiveConfiguration();

	/**
	 * Returns a new object of class '<em>Transient Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Configuration</em>'.
	 * @generated
	 */
	TransientConfiguration createTransientConfiguration();

	/**
	 * Returns a new object of class '<em>Confluent Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Confluent Transition</em>'.
	 * @generated
	 */
	ConfluentTransition createConfluentTransition();

	/**
	 * Returns a new object of class '<em>Internal Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Internal Transition</em>'.
	 * @generated
	 */
	InternalTransition createInternalTransition();

	/**
	 * Returns a new object of class '<em>External Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Transition</em>'.
	 * @generated
	 */
	ExternalTransition createExternalTransition();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity</em>'.
	 * @generated
	 */
	Activity createActivity();

	/**
	 * Returns a new object of class '<em>Sojourn Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sojourn Time</em>'.
	 * @generated
	 */
	SojournTime createSojournTime();

	/**
	 * Returns a new object of class '<em>Test Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Node</em>'.
	 * @generated
	 */
	TestNode createTestNode();

	/**
	 * Returns a new object of class '<em>HRequirement Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>HRequirement Specification</em>'.
	 * @generated
	 */
	HRequirementSpecification createHRequirementSpecification();

	/**
	 * Returns a new object of class '<em>BExistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>BExistence</em>'.
	 * @generated
	 */
	BExistence createBExistence();

	/**
	 * Returns a new object of class '<em>UExistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UExistence</em>'.
	 * @generated
	 */
	UExistence createUExistence();

	/**
	 * Returns a new object of class '<em>EExistence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EExistence</em>'.
	 * @generated
	 */
	EExistence createEExistence();

	/**
	 * Returns a new object of class '<em>CAbsence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAbsence</em>'.
	 * @generated
	 */
	CAbsence createCAbsence();

	/**
	 * Returns a new object of class '<em>TL Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TL Property</em>'.
	 * @generated
	 */
	TLProperty createTLProperty();

	/**
	 * Returns a new object of class '<em>Response Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Chain</em>'.
	 * @generated
	 */
	ResponseChain createResponseChain();

	/**
	 * Returns a new object of class '<em>Precedence Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence Chain</em>'.
	 * @generated
	 */
	PrecedenceChain createPrecedenceChain();

	/**
	 * Returns a new object of class '<em>Bounded Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounded Existence</em>'.
	 * @generated
	 */
	BoundedExistence createBoundedExistence();

	/**
	 * Returns a new object of class '<em>Property Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Pattern</em>'.
	 * @generated
	 */
	PropertyPattern createPropertyPattern();

	/**
	 * Returns a new object of class '<em>Multi Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Trigger</em>'.
	 * @generated
	 */
	MultiTrigger createMultiTrigger();

	/**
	 * Returns a new object of class '<em>Single Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Trigger</em>'.
	 * @generated
	 */
	SingleTrigger createSingleTrigger();

	/**
	 * Returns a new object of class '<em>Multi Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Cause</em>'.
	 * @generated
	 */
	MultiCause createMultiCause();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Universality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Universality</em>'.
	 * @generated
	 */
	Universality createUniversality();

	/**
	 * Returns a new object of class '<em>Precedence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Precedence</em>'.
	 * @generated
	 */
	Precedence createPrecedence();

	/**
	 * Returns a new object of class '<em>Single Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Cause</em>'.
	 * @generated
	 */
	SingleCause createSingleCause();

	/**
	 * Returns a new object of class '<em>Existence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Existence</em>'.
	 * @generated
	 */
	Existence createExistence();

	/**
	 * Returns a new object of class '<em>Absence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Absence</em>'.
	 * @generated
	 */
	Absence createAbsence();

	/**
	 * Returns a new object of class '<em>Proposition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Proposition</em>'.
	 * @generated
	 */
	Proposition createProposition();

	/**
	 * Returns a new object of class '<em>Predicat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicat</em>'.
	 * @generated
	 */
	Predicat createPredicat();

	/**
	 * Returns a new object of class '<em>Before</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Before</em>'.
	 * @generated
	 */
	Before createBefore();

	/**
	 * Returns a new object of class '<em>After</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After</em>'.
	 * @generated
	 */
	After createAfter();

	/**
	 * Returns a new object of class '<em>Global</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global</em>'.
	 * @generated
	 */
	Global createGlobal();

	/**
	 * Returns a new object of class '<em>After Until</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>After Until</em>'.
	 * @generated
	 */
	AfterUntil createAfterUntil();

	/**
	 * Returns a new object of class '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope</em>'.
	 * @generated
	 */
	Scope createScope();

	/**
	 * Returns a new object of class '<em>Between</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Between</em>'.
	 * @generated
	 */
	Between createBetween();

	/**
	 * Returns a new object of class '<em>Implication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implication</em>'.
	 * @generated
	 */
	Implication createImplication();

	/**
	 * Returns a new object of class '<em>Next</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Next</em>'.
	 * @generated
	 */
	Next createNext();

	/**
	 * Returns a new object of class '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concurrency</em>'.
	 * @generated
	 */
	Concurrency createConcurrency();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HillsPackage getHillsPackage();

} //HillsFactory
