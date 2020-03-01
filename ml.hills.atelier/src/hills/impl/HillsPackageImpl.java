/**
 */
package hills.impl;

import hills.Absence;
import hills.Activity;
import hills.After;
import hills.AfterUntil;
import hills.Aggregation;
import hills.BExistence;
import hills.Before;
import hills.Between;
import hills.BoundedExistence;
import hills.CAbsence;
import hills.Composition;
import hills.Concurrency;
import hills.ConfNomme;
import hills.Configuration;
import hills.ConfluentTransition;
import hills.Declaration;
import hills.EExistence;
import hills.Existence;
import hills.ExternalTransition;
import hills.FiniteConfiguration;
import hills.Function;
import hills.GenericNode;
import hills.Global;
import hills.HClass;
import hills.HClassifier;
import hills.HRequirementSpecification;
import hills.HSpecification;
import hills.HSystem;
import hills.HillsFactory;
import hills.HillsPackage;
import hills.Implication;
import hills.InitialConfiguration;
import hills.InternalTransition;
import hills.Lien;
import hills.MultiCause;
import hills.MultiTrigger;
import hills.Next;
import hills.Nomme;
import hills.PassiveConfiguration;
import hills.Port;
import hills.PortDeclaration;
import hills.Precedence;
import hills.PrecedenceChain;
import hills.Predicat;
import hills.Property;
import hills.PropertyPattern;
import hills.Proposition;
import hills.Reference;
import hills.Response;
import hills.ResponseChain;
import hills.Scope;
import hills.SingleCause;
import hills.SingleTrigger;
import hills.SojournTime;
import hills.TLLien;
import hills.TLProperty;
import hills.TestNode;
import hills.TransientConfiguration;
import hills.Transition;
import hills.UExistence;
import hills.Universality;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HillsPackageImpl extends EPackageImpl implements HillsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nommeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lienEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confNommeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finiteConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passiveConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transientConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confluentTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sojournTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hRequirementSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cAbsenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundedExistenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass precedenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleCauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass absenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beforeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afterUntilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betweenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlLienEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hills.HillsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private HillsPackageImpl() {
		super(eNS_URI, HillsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link HillsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static HillsPackage init() {
		if (isInited) return (HillsPackage)EPackage.Registry.INSTANCE.getEPackage(HillsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredHillsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		HillsPackageImpl theHillsPackage = registeredHillsPackage instanceof HillsPackageImpl ? (HillsPackageImpl)registeredHillsPackage : new HillsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHillsPackage.createPackageContents();

		// Initialize created meta-data
		theHillsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHillsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(HillsPackage.eNS_URI, theHillsPackage);
		return theHillsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSpecification() {
		return hSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHSpecification_NomModele() {
		return (EAttribute)hSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHSpecification_DescripModele() {
		return (EAttribute)hSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpecification_Composants() {
		return (EReference)hSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpecification_Liens() {
		return (EReference)hSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpecification_Hspecification() {
		return (EReference)hSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpecification_GenericNodes() {
		return (EReference)hSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSpecification_RequirementSpecification() {
		return (EReference)hSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNomme() {
		return nommeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNomme_Ntime() {
		return (EAttribute)nommeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHClassifier() {
		return hClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHClassifier_Ports() {
		return (EReference)hClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHSystem() {
		return hSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSystem_Declaratios() {
		return (EReference)hSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSystem_Fonctions() {
		return (EReference)hSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSystem_Configurations() {
		return (EReference)hSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSystem_Transitions() {
		return (EReference)hSystemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHSystem_Conditions() {
		return (EReference)hSystemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHClass() {
		return hClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHClass_Declaratios() {
		return (EReference)hClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHClass_Fonctions() {
		return (EReference)hClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Pname() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPort_Othername() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPort_EntreePorts() {
		return (EReference)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPortDeclaration() {
		return portDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPortDeclaration_Pdeclaration() {
		return (EAttribute)portDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericNode() {
		return genericNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLien() {
		return lienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLien_Llabel() {
		return (EAttribute)lienEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLien_Source() {
		return (EReference)lienEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLien_Target() {
		return (EReference)lienEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAggregation() {
		return aggregationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReference() {
		return referenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfNomme() {
		return confNommeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfNomme_Libelle() {
		return (EAttribute)confNommeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeclaration_Ename() {
		return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_Declarations() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeclaration_Predicats() {
		return (EReference)declarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiniteConfiguration() {
		return finiteConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFiniteConfiguration_Proprietes() {
		return (EReference)finiteConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFiniteConfiguration_Activites() {
		return (EReference)finiteConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFiniteConfiguration_SojTime() {
		return (EReference)finiteConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInitialConfiguration() {
		return initialConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPassiveConfiguration() {
		return passiveConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassiveConfiguration_Proprietes() {
		return (EReference)passiveConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPassiveConfiguration_Activites() {
		return (EReference)passiveConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransientConfiguration() {
		return transientConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransientConfiguration_Proprietes() {
		return (EReference)transientConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransientConfiguration_Activites() {
		return (EReference)transientConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfluentTransition() {
		return confluentTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfluentTransition_Ctname() {
		return (EAttribute)confluentTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalTransition() {
		return internalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalTransition_Itname() {
		return (EAttribute)internalTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternalTransition() {
		return externalTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternalTransition_Etname() {
		return (EAttribute)externalTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Fname() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Declarations() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Ppredicats() {
		return (EReference)functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Prname1() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProperty_Prname2() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProperty_Ppredicats() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Acname1() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivity_Acname2() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivity_Ppredicats() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSojournTime() {
		return sojournTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSojournTime_Stime() {
		return (EAttribute)sojournTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestNode() {
		return testNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestNode_Ttime() {
		return (EAttribute)testNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTestNode_Contenu() {
		return (EAttribute)testNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHRequirementSpecification() {
		return hRequirementSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHRequirementSpecification_Description() {
		return (EAttribute)hRequirementSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHRequirementSpecification_TemporalProperties() {
		return (EReference)hRequirementSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBExistence() {
		return bExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBExistence_Bename() {
		return (EAttribute)bExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBExistence_Predicats() {
		return (EReference)bExistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBExistence_Declarations() {
		return (EReference)bExistenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBExistence_Ppredicats() {
		return (EReference)bExistenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUExistence() {
		return uExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUExistence_Uename() {
		return (EAttribute)uExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUExistence_Predicats() {
		return (EReference)uExistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUExistence_Declarations() {
		return (EReference)uExistenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUExistence_Ppredicats() {
		return (EReference)uExistenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEExistence() {
		return eExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEExistence_Eename() {
		return (EAttribute)eExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEExistence_Predicats() {
		return (EReference)eExistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEExistence_Declarations() {
		return (EReference)eExistenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEExistence_Ppredicats() {
		return (EReference)eExistenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCAbsence() {
		return cAbsenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCAbsence_Caname() {
		return (EAttribute)cAbsenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAbsence_Predicats() {
		return (EReference)cAbsenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAbsence_Declarations() {
		return (EReference)cAbsenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCAbsence_Ppredicats() {
		return (EReference)cAbsenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLProperty() {
		return tlPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLProperty_Pattern() {
		return (EReference)tlPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLProperty_Scope() {
		return (EReference)tlPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponseChain() {
		return responseChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedenceChain() {
		return precedenceChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundedExistence() {
		return boundedExistenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundedExistence_Frequency() {
		return (EAttribute)boundedExistenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundedExistence_State() {
		return (EReference)boundedExistenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyPattern() {
		return propertyPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPropertyPattern_Ppname() {
		return (EAttribute)propertyPatternEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiTrigger() {
		return multiTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiTrigger_Triggers() {
		return (EReference)multiTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiTrigger_Response() {
		return (EReference)multiTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleTrigger() {
		return singleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleTrigger_Triggers() {
		return (EReference)singleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleTrigger_Responses() {
		return (EReference)singleTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMultiCause() {
		return multiCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiCause_Causes() {
		return (EReference)multiCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMultiCause_Effect() {
		return (EReference)multiCauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Trigger() {
		return (EReference)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResponse_Response() {
		return (EReference)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversality() {
		return universalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversality_State() {
		return (EReference)universalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrecedence() {
		return precedenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleCause() {
		return singleCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleCause_Causes() {
		return (EReference)singleCauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleCause_Effects() {
		return (EReference)singleCauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExistence() {
		return existenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExistence_State() {
		return (EReference)existenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbsence() {
		return absenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbsence_State() {
		return (EReference)absenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProposition() {
		return propositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredicat() {
		return predicatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBefore() {
		return beforeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBefore_Delimiter() {
		return (EReference)beforeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAfter() {
		return afterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAfter_Delimiter() {
		return (EReference)afterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobal() {
		return globalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAfterUntil() {
		return afterUntilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAfterUntil_StartDelimiter() {
		return (EReference)afterUntilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAfterUntil_EndDelimiter() {
		return (EReference)afterUntilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getScope() {
		return scopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetween() {
		return betweenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBetween_StartDelimiter() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBetween_EndDelimiter() {
		return (EReference)betweenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImplication() {
		return implicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNext() {
		return nextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrency() {
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTLLien() {
		return tlLienEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTLLien_Tll() {
		return (EAttribute)tlLienEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLLien_Source() {
		return (EReference)tlLienEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTLLien_Target() {
		return (EReference)tlLienEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HillsFactory getHillsFactory() {
		return (HillsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hSpecificationEClass = createEClass(HSPECIFICATION);
		createEAttribute(hSpecificationEClass, HSPECIFICATION__NOM_MODELE);
		createEAttribute(hSpecificationEClass, HSPECIFICATION__DESCRIP_MODELE);
		createEReference(hSpecificationEClass, HSPECIFICATION__COMPOSANTS);
		createEReference(hSpecificationEClass, HSPECIFICATION__LIENS);
		createEReference(hSpecificationEClass, HSPECIFICATION__HSPECIFICATION);
		createEReference(hSpecificationEClass, HSPECIFICATION__GENERIC_NODES);
		createEReference(hSpecificationEClass, HSPECIFICATION__REQUIREMENT_SPECIFICATION);

		nommeEClass = createEClass(NOMME);
		createEAttribute(nommeEClass, NOMME__NTIME);

		hClassifierEClass = createEClass(HCLASSIFIER);
		createEReference(hClassifierEClass, HCLASSIFIER__PORTS);

		hSystemEClass = createEClass(HSYSTEM);
		createEReference(hSystemEClass, HSYSTEM__DECLARATIOS);
		createEReference(hSystemEClass, HSYSTEM__FONCTIONS);
		createEReference(hSystemEClass, HSYSTEM__CONFIGURATIONS);
		createEReference(hSystemEClass, HSYSTEM__TRANSITIONS);
		createEReference(hSystemEClass, HSYSTEM__CONDITIONS);

		hClassEClass = createEClass(HCLASS);
		createEReference(hClassEClass, HCLASS__DECLARATIOS);
		createEReference(hClassEClass, HCLASS__FONCTIONS);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__PNAME);
		createEAttribute(portEClass, PORT__OTHERNAME);
		createEReference(portEClass, PORT__ENTREE_PORTS);

		portDeclarationEClass = createEClass(PORT_DECLARATION);
		createEAttribute(portDeclarationEClass, PORT_DECLARATION__PDECLARATION);

		genericNodeEClass = createEClass(GENERIC_NODE);

		lienEClass = createEClass(LIEN);
		createEAttribute(lienEClass, LIEN__LLABEL);
		createEReference(lienEClass, LIEN__SOURCE);
		createEReference(lienEClass, LIEN__TARGET);

		compositionEClass = createEClass(COMPOSITION);

		aggregationEClass = createEClass(AGGREGATION);

		referenceEClass = createEClass(REFERENCE);

		confNommeEClass = createEClass(CONF_NOMME);
		createEAttribute(confNommeEClass, CONF_NOMME__LIBELLE);

		configurationEClass = createEClass(CONFIGURATION);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);

		declarationEClass = createEClass(DECLARATION);
		createEAttribute(declarationEClass, DECLARATION__ENAME);
		createEReference(declarationEClass, DECLARATION__DECLARATIONS);
		createEReference(declarationEClass, DECLARATION__PREDICATS);

		finiteConfigurationEClass = createEClass(FINITE_CONFIGURATION);
		createEReference(finiteConfigurationEClass, FINITE_CONFIGURATION__PROPRIETES);
		createEReference(finiteConfigurationEClass, FINITE_CONFIGURATION__ACTIVITES);
		createEReference(finiteConfigurationEClass, FINITE_CONFIGURATION__SOJ_TIME);

		initialConfigurationEClass = createEClass(INITIAL_CONFIGURATION);

		passiveConfigurationEClass = createEClass(PASSIVE_CONFIGURATION);
		createEReference(passiveConfigurationEClass, PASSIVE_CONFIGURATION__PROPRIETES);
		createEReference(passiveConfigurationEClass, PASSIVE_CONFIGURATION__ACTIVITES);

		transientConfigurationEClass = createEClass(TRANSIENT_CONFIGURATION);
		createEReference(transientConfigurationEClass, TRANSIENT_CONFIGURATION__PROPRIETES);
		createEReference(transientConfigurationEClass, TRANSIENT_CONFIGURATION__ACTIVITES);

		confluentTransitionEClass = createEClass(CONFLUENT_TRANSITION);
		createEAttribute(confluentTransitionEClass, CONFLUENT_TRANSITION__CTNAME);

		internalTransitionEClass = createEClass(INTERNAL_TRANSITION);
		createEAttribute(internalTransitionEClass, INTERNAL_TRANSITION__ITNAME);

		externalTransitionEClass = createEClass(EXTERNAL_TRANSITION);
		createEAttribute(externalTransitionEClass, EXTERNAL_TRANSITION__ETNAME);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__FNAME);
		createEAttribute(functionEClass, FUNCTION__DECLARATIONS);
		createEReference(functionEClass, FUNCTION__PPREDICATS);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__PRNAME1);
		createEAttribute(propertyEClass, PROPERTY__PRNAME2);
		createEReference(propertyEClass, PROPERTY__PPREDICATS);

		activityEClass = createEClass(ACTIVITY);
		createEAttribute(activityEClass, ACTIVITY__ACNAME1);
		createEAttribute(activityEClass, ACTIVITY__ACNAME2);
		createEReference(activityEClass, ACTIVITY__PPREDICATS);

		sojournTimeEClass = createEClass(SOJOURN_TIME);
		createEAttribute(sojournTimeEClass, SOJOURN_TIME__STIME);

		testNodeEClass = createEClass(TEST_NODE);
		createEAttribute(testNodeEClass, TEST_NODE__TTIME);
		createEAttribute(testNodeEClass, TEST_NODE__CONTENU);

		hRequirementSpecificationEClass = createEClass(HREQUIREMENT_SPECIFICATION);
		createEAttribute(hRequirementSpecificationEClass, HREQUIREMENT_SPECIFICATION__DESCRIPTION);
		createEReference(hRequirementSpecificationEClass, HREQUIREMENT_SPECIFICATION__TEMPORAL_PROPERTIES);

		bExistenceEClass = createEClass(BEXISTENCE);
		createEAttribute(bExistenceEClass, BEXISTENCE__BENAME);
		createEReference(bExistenceEClass, BEXISTENCE__PREDICATS);
		createEReference(bExistenceEClass, BEXISTENCE__DECLARATIONS);
		createEReference(bExistenceEClass, BEXISTENCE__PPREDICATS);

		uExistenceEClass = createEClass(UEXISTENCE);
		createEAttribute(uExistenceEClass, UEXISTENCE__UENAME);
		createEReference(uExistenceEClass, UEXISTENCE__PREDICATS);
		createEReference(uExistenceEClass, UEXISTENCE__DECLARATIONS);
		createEReference(uExistenceEClass, UEXISTENCE__PPREDICATS);

		eExistenceEClass = createEClass(EEXISTENCE);
		createEAttribute(eExistenceEClass, EEXISTENCE__EENAME);
		createEReference(eExistenceEClass, EEXISTENCE__PREDICATS);
		createEReference(eExistenceEClass, EEXISTENCE__DECLARATIONS);
		createEReference(eExistenceEClass, EEXISTENCE__PPREDICATS);

		cAbsenceEClass = createEClass(CABSENCE);
		createEAttribute(cAbsenceEClass, CABSENCE__CANAME);
		createEReference(cAbsenceEClass, CABSENCE__PREDICATS);
		createEReference(cAbsenceEClass, CABSENCE__DECLARATIONS);
		createEReference(cAbsenceEClass, CABSENCE__PPREDICATS);

		tlPropertyEClass = createEClass(TL_PROPERTY);
		createEReference(tlPropertyEClass, TL_PROPERTY__PATTERN);
		createEReference(tlPropertyEClass, TL_PROPERTY__SCOPE);

		responseChainEClass = createEClass(RESPONSE_CHAIN);

		precedenceChainEClass = createEClass(PRECEDENCE_CHAIN);

		boundedExistenceEClass = createEClass(BOUNDED_EXISTENCE);
		createEAttribute(boundedExistenceEClass, BOUNDED_EXISTENCE__FREQUENCY);
		createEReference(boundedExistenceEClass, BOUNDED_EXISTENCE__STATE);

		propertyPatternEClass = createEClass(PROPERTY_PATTERN);
		createEAttribute(propertyPatternEClass, PROPERTY_PATTERN__PPNAME);

		multiTriggerEClass = createEClass(MULTI_TRIGGER);
		createEReference(multiTriggerEClass, MULTI_TRIGGER__TRIGGERS);
		createEReference(multiTriggerEClass, MULTI_TRIGGER__RESPONSE);

		singleTriggerEClass = createEClass(SINGLE_TRIGGER);
		createEReference(singleTriggerEClass, SINGLE_TRIGGER__TRIGGERS);
		createEReference(singleTriggerEClass, SINGLE_TRIGGER__RESPONSES);

		multiCauseEClass = createEClass(MULTI_CAUSE);
		createEReference(multiCauseEClass, MULTI_CAUSE__CAUSES);
		createEReference(multiCauseEClass, MULTI_CAUSE__EFFECT);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__TRIGGER);
		createEReference(responseEClass, RESPONSE__RESPONSE);

		universalityEClass = createEClass(UNIVERSALITY);
		createEReference(universalityEClass, UNIVERSALITY__STATE);

		precedenceEClass = createEClass(PRECEDENCE);

		singleCauseEClass = createEClass(SINGLE_CAUSE);
		createEReference(singleCauseEClass, SINGLE_CAUSE__CAUSES);
		createEReference(singleCauseEClass, SINGLE_CAUSE__EFFECTS);

		existenceEClass = createEClass(EXISTENCE);
		createEReference(existenceEClass, EXISTENCE__STATE);

		absenceEClass = createEClass(ABSENCE);
		createEReference(absenceEClass, ABSENCE__STATE);

		propositionEClass = createEClass(PROPOSITION);

		predicatEClass = createEClass(PREDICAT);

		beforeEClass = createEClass(BEFORE);
		createEReference(beforeEClass, BEFORE__DELIMITER);

		afterEClass = createEClass(AFTER);
		createEReference(afterEClass, AFTER__DELIMITER);

		globalEClass = createEClass(GLOBAL);

		afterUntilEClass = createEClass(AFTER_UNTIL);
		createEReference(afterUntilEClass, AFTER_UNTIL__START_DELIMITER);
		createEReference(afterUntilEClass, AFTER_UNTIL__END_DELIMITER);

		scopeEClass = createEClass(SCOPE);

		betweenEClass = createEClass(BETWEEN);
		createEReference(betweenEClass, BETWEEN__START_DELIMITER);
		createEReference(betweenEClass, BETWEEN__END_DELIMITER);

		implicationEClass = createEClass(IMPLICATION);

		nextEClass = createEClass(NEXT);

		concurrencyEClass = createEClass(CONCURRENCY);

		tlLienEClass = createEClass(TL_LIEN);
		createEAttribute(tlLienEClass, TL_LIEN__TLL);
		createEReference(tlLienEClass, TL_LIEN__SOURCE);
		createEReference(tlLienEClass, TL_LIEN__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hClassifierEClass.getESuperTypes().add(this.getNomme());
		hSystemEClass.getESuperTypes().add(this.getHClassifier());
		hClassEClass.getESuperTypes().add(this.getHClassifier());
		genericNodeEClass.getESuperTypes().add(this.getNomme());
		compositionEClass.getESuperTypes().add(this.getLien());
		aggregationEClass.getESuperTypes().add(this.getLien());
		referenceEClass.getESuperTypes().add(this.getLien());
		configurationEClass.getESuperTypes().add(this.getConfNomme());
		finiteConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		initialConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		passiveConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		transientConfigurationEClass.getESuperTypes().add(this.getConfiguration());
		confluentTransitionEClass.getESuperTypes().add(this.getTransition());
		internalTransitionEClass.getESuperTypes().add(this.getTransition());
		externalTransitionEClass.getESuperTypes().add(this.getTransition());
		testNodeEClass.getESuperTypes().add(this.getConfiguration());
		hRequirementSpecificationEClass.getESuperTypes().add(this.getNomme());
		bExistenceEClass.getESuperTypes().add(this.getTLProperty());
		uExistenceEClass.getESuperTypes().add(this.getTLProperty());
		eExistenceEClass.getESuperTypes().add(this.getTLProperty());
		cAbsenceEClass.getESuperTypes().add(this.getTLProperty());
		responseChainEClass.getESuperTypes().add(this.getPropertyPattern());
		precedenceChainEClass.getESuperTypes().add(this.getPropertyPattern());
		boundedExistenceEClass.getESuperTypes().add(this.getPropertyPattern());
		multiTriggerEClass.getESuperTypes().add(this.getResponseChain());
		singleTriggerEClass.getESuperTypes().add(this.getResponseChain());
		multiCauseEClass.getESuperTypes().add(this.getPrecedenceChain());
		responseEClass.getESuperTypes().add(this.getPropertyPattern());
		universalityEClass.getESuperTypes().add(this.getPropertyPattern());
		precedenceEClass.getESuperTypes().add(this.getPropertyPattern());
		singleCauseEClass.getESuperTypes().add(this.getPrecedenceChain());
		existenceEClass.getESuperTypes().add(this.getPropertyPattern());
		absenceEClass.getESuperTypes().add(this.getPropertyPattern());
		beforeEClass.getESuperTypes().add(this.getScope());
		afterEClass.getESuperTypes().add(this.getScope());
		globalEClass.getESuperTypes().add(this.getScope());
		afterUntilEClass.getESuperTypes().add(this.getScope());
		betweenEClass.getESuperTypes().add(this.getScope());
		implicationEClass.getESuperTypes().add(this.getTLLien());
		nextEClass.getESuperTypes().add(this.getTLLien());
		concurrencyEClass.getESuperTypes().add(this.getTLLien());

		// Initialize classes and features; add operations and parameters
		initEClass(hSpecificationEClass, HSpecification.class, "HSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHSpecification_NomModele(), ecorePackage.getEString(), "nomModele", null, 0, 1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHSpecification_DescripModele(), ecorePackage.getEString(), "descripModele", null, 0, 1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpecification_Composants(), this.getHClassifier(), null, "composants", null, 0, -1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpecification_Liens(), this.getLien(), null, "liens", null, 0, -1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpecification_Hspecification(), this.getHSpecification(), null, "hspecification", null, 0, -1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpecification_GenericNodes(), this.getGenericNode(), null, "genericNodes", null, 0, -1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSpecification_RequirementSpecification(), this.getHRequirementSpecification(), null, "requirementSpecification", null, 0, -1, HSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nommeEClass, Nomme.class, "Nomme", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNomme_Ntime(), ecorePackage.getEString(), "ntime", null, 0, 1, Nomme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hClassifierEClass, HClassifier.class, "HClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHClassifier_Ports(), this.getPort(), null, "ports", null, 0, -1, HClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hSystemEClass, HSystem.class, "HSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHSystem_Declaratios(), this.getDeclaration(), null, "declaratios", null, 0, -1, HSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSystem_Fonctions(), this.getFunction(), null, "fonctions", null, 0, -1, HSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSystem_Configurations(), this.getConfiguration(), null, "configurations", null, 0, -1, HSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSystem_Transitions(), this.getTransition(), null, "transitions", null, 0, -1, HSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHSystem_Conditions(), this.getTestNode(), null, "conditions", null, 0, -1, HSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hClassEClass, HClass.class, "HClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHClass_Declaratios(), this.getDeclaration(), null, "declaratios", null, 0, -1, HClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHClass_Fonctions(), this.getFunction(), null, "fonctions", null, 0, -1, HClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Pname(), ecorePackage.getEString(), "pname", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPort_Othername(), ecorePackage.getEString(), "othername", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPort_EntreePorts(), this.getPortDeclaration(), null, "entreePorts", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portDeclarationEClass, PortDeclaration.class, "PortDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortDeclaration_Pdeclaration(), ecorePackage.getEString(), "pdeclaration", null, 0, 1, PortDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericNodeEClass, GenericNode.class, "GenericNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lienEClass, Lien.class, "Lien", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLien_Llabel(), ecorePackage.getEString(), "llabel", null, 0, 1, Lien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLien_Source(), this.getHClassifier(), null, "source", null, 0, 1, Lien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLien_Target(), this.getNomme(), null, "target", null, 0, 1, Lien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationEClass, Aggregation.class, "Aggregation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceEClass, Reference.class, "Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(confNommeEClass, ConfNomme.class, "ConfNomme", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfNomme_Libelle(), ecorePackage.getEString(), "libelle", null, 0, 1, ConfNomme.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getConfiguration(), null, "source", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getConfNomme(), null, "target", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeclaration_Ename(), ecorePackage.getEString(), "ename", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_Declarations(), this.getPortDeclaration(), null, "declarations", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeclaration_Predicats(), this.getPortDeclaration(), null, "predicats", null, 0, -1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(finiteConfigurationEClass, FiniteConfiguration.class, "FiniteConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFiniteConfiguration_Proprietes(), this.getProperty(), null, "proprietes", null, 0, -1, FiniteConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteConfiguration_Activites(), this.getActivity(), null, "activites", null, 0, -1, FiniteConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFiniteConfiguration_SojTime(), this.getSojournTime(), null, "SojTime", null, 1, 1, FiniteConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initialConfigurationEClass, InitialConfiguration.class, "InitialConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(passiveConfigurationEClass, PassiveConfiguration.class, "PassiveConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPassiveConfiguration_Proprietes(), this.getProperty(), null, "proprietes", null, 0, -1, PassiveConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassiveConfiguration_Activites(), this.getActivity(), null, "activites", null, 0, -1, PassiveConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transientConfigurationEClass, TransientConfiguration.class, "TransientConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransientConfiguration_Proprietes(), this.getProperty(), null, "proprietes", null, 0, -1, TransientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransientConfiguration_Activites(), this.getActivity(), null, "activites", null, 0, -1, TransientConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confluentTransitionEClass, ConfluentTransition.class, "ConfluentTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfluentTransition_Ctname(), ecorePackage.getEString(), "ctname", null, 0, 1, ConfluentTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalTransitionEClass, InternalTransition.class, "InternalTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalTransition_Itname(), ecorePackage.getEString(), "itname", null, 0, 1, InternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalTransitionEClass, ExternalTransition.class, "ExternalTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalTransition_Etname(), ecorePackage.getEString(), "etname", null, 0, 1, ExternalTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Fname(), ecorePackage.getEString(), "fname", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Declarations(), ecorePackage.getEString(), "declarations", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Prname1(), ecorePackage.getEString(), "prname1", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProperty_Prname2(), ecorePackage.getEString(), "prname2", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivity_Acname1(), ecorePackage.getEString(), "acname1", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActivity_Acname2(), ecorePackage.getEString(), "acname2", null, 0, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivity_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sojournTimeEClass, SojournTime.class, "SojournTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSojournTime_Stime(), ecorePackage.getEString(), "stime", null, 0, 1, SojournTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testNodeEClass, TestNode.class, "TestNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestNode_Ttime(), ecorePackage.getEString(), "ttime", null, 0, 1, TestNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTestNode_Contenu(), ecorePackage.getEString(), "contenu", null, 0, 1, TestNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hRequirementSpecificationEClass, HRequirementSpecification.class, "HRequirementSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHRequirementSpecification_Description(), ecorePackage.getEString(), "description", null, 0, 1, HRequirementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHRequirementSpecification_TemporalProperties(), this.getTLProperty(), null, "temporalProperties", null, 0, -1, HRequirementSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bExistenceEClass, BExistence.class, "BExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBExistence_Bename(), ecorePackage.getEString(), "bename", null, 0, 1, BExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBExistence_Predicats(), this.getPredicat(), null, "predicats", null, 1, 1, BExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBExistence_Declarations(), this.getPortDeclaration(), null, "declarations", null, 0, -1, BExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBExistence_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, BExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uExistenceEClass, UExistence.class, "UExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUExistence_Uename(), ecorePackage.getEString(), "uename", null, 0, 1, UExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUExistence_Predicats(), this.getPredicat(), null, "predicats", null, 1, 1, UExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUExistence_Declarations(), this.getPortDeclaration(), null, "declarations", null, 0, -1, UExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUExistence_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, UExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eExistenceEClass, EExistence.class, "EExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEExistence_Eename(), ecorePackage.getEString(), "eename", null, 0, 1, EExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExistence_Predicats(), this.getPredicat(), null, "predicats", null, 1, 1, EExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExistence_Declarations(), this.getPortDeclaration(), null, "declarations", null, 0, -1, EExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEExistence_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, EExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cAbsenceEClass, CAbsence.class, "CAbsence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCAbsence_Caname(), ecorePackage.getEString(), "caname", null, 0, 1, CAbsence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAbsence_Predicats(), this.getPredicat(), null, "predicats", null, 1, 1, CAbsence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAbsence_Declarations(), this.getPortDeclaration(), null, "declarations", null, 0, -1, CAbsence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCAbsence_Ppredicats(), this.getPortDeclaration(), null, "ppredicats", null, 0, -1, CAbsence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tlPropertyEClass, TLProperty.class, "TLProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTLProperty_Pattern(), this.getPropertyPattern(), null, "pattern", null, 1, 1, TLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLProperty_Scope(), this.getScope(), null, "scope", null, 1, 1, TLProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseChainEClass, ResponseChain.class, "ResponseChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(precedenceChainEClass, PrecedenceChain.class, "PrecedenceChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundedExistenceEClass, BoundedExistence.class, "BoundedExistence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoundedExistence_Frequency(), ecorePackage.getEInt(), "frequency", null, 0, 1, BoundedExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundedExistence_State(), this.getProposition(), null, "state", null, 1, 1, BoundedExistence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyPatternEClass, PropertyPattern.class, "PropertyPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyPattern_Ppname(), ecorePackage.getEString(), "ppname", null, 0, 1, PropertyPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiTriggerEClass, MultiTrigger.class, "MultiTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiTrigger_Triggers(), this.getProposition(), null, "triggers", null, 2, -1, MultiTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiTrigger_Response(), this.getProposition(), null, "response", null, 1, 1, MultiTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleTriggerEClass, SingleTrigger.class, "SingleTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleTrigger_Triggers(), this.getProposition(), null, "triggers", null, 1, 1, SingleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleTrigger_Responses(), this.getProposition(), null, "responses", null, 2, -1, SingleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiCauseEClass, MultiCause.class, "MultiCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiCause_Causes(), this.getProposition(), null, "causes", null, 2, -1, MultiCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiCause_Effect(), this.getProposition(), null, "effect", null, 1, 1, MultiCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_Trigger(), this.getProposition(), null, "trigger", null, 1, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResponse_Response(), this.getProposition(), null, "response", null, 1, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universalityEClass, Universality.class, "Universality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversality_State(), this.getProposition(), null, "state", null, 1, 1, Universality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(precedenceEClass, Precedence.class, "Precedence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleCauseEClass, SingleCause.class, "SingleCause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleCause_Causes(), this.getProposition(), null, "causes", null, 1, 1, SingleCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleCause_Effects(), this.getProposition(), null, "effects", null, 2, -1, SingleCause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existenceEClass, Existence.class, "Existence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistence_State(), this.getProposition(), null, "state", null, 1, 1, Existence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(absenceEClass, Absence.class, "Absence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbsence_State(), this.getProposition(), null, "state", null, 1, 1, Absence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propositionEClass, Proposition.class, "Proposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(predicatEClass, Predicat.class, "Predicat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(beforeEClass, Before.class, "Before", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBefore_Delimiter(), this.getProposition(), null, "delimiter", null, 1, 1, Before.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(afterEClass, After.class, "After", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAfter_Delimiter(), this.getProposition(), null, "delimiter", null, 1, 1, After.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalEClass, Global.class, "Global", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(afterUntilEClass, AfterUntil.class, "AfterUntil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAfterUntil_StartDelimiter(), this.getProposition(), null, "startDelimiter", null, 1, 1, AfterUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAfterUntil_EndDelimiter(), this.getProposition(), null, "endDelimiter", null, 1, 1, AfterUntil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeEClass, Scope.class, "Scope", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(betweenEClass, Between.class, "Between", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBetween_StartDelimiter(), this.getProposition(), null, "startDelimiter", null, 1, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBetween_EndDelimiter(), this.getProposition(), null, "endDelimiter", null, 1, 1, Between.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicationEClass, Implication.class, "Implication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nextEClass, Next.class, "Next", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(concurrencyEClass, Concurrency.class, "Concurrency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tlLienEClass, TLLien.class, "TLLien", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLLien_Tll(), ecorePackage.getEString(), "tll", null, 0, 1, TLLien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLLien_Source(), this.getTLProperty(), null, "source", null, 0, 1, TLLien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLLien_Target(), this.getTLProperty(), null, "target", null, 0, 1, TLLien.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.affixed
		createGmf_2Annotations();
		// gmf.node
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
		// emf.gen
		createEmfAnnotations();
		// gmf.link
		createGmf_5Annotations();
		// gmf.compartement
		createGmf_6Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (hSpecificationEClass,
		   source,
		   new String[] {
			   "model.extension", "hills",
			   "diagram.extension", "dhills"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.affixed";
		addAnnotation
		  (getHClassifier_Ports(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (hSystemEClass,
		   source,
		   new String[] {
			   "label", "ntime",
			   "figure", "rectangle",
			   "size", "200,300",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (hClassEClass,
		   source,
		   new String[] {
			   "label", "ntime",
			   "figure", "rectangle",
			   "size", "150,180",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (portEClass,
		   source,
		   new String[] {
			   "label", "pname",
			   "figure", "rectangle",
			   "size", "90,60",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (portDeclarationEClass,
		   source,
		   new String[] {
			   "label", "pdeclaration",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "size", "85,25"
		   });
		addAnnotation
		  (genericNodeEClass,
		   source,
		   new String[] {
			   "label", "ntime",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "size", "150,30",
			   "border.color", "0,0,0",
			   "border.width", "2"
		   });
		addAnnotation
		  (declarationEClass,
		   source,
		   new String[] {
			   "label", "ename",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "size", "55,100",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (finiteConfigurationEClass,
		   source,
		   new String[] {
			   "label", "libelle",
			   "figure", "rounded",
			   "size", "55,100",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (initialConfigurationEClass,
		   source,
		   new String[] {
			   "label", "libelle",
			   "figure", "ellipse",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0",
			   "color", "0,0,0"
		   });
		addAnnotation
		  (passiveConfigurationEClass,
		   source,
		   new String[] {
			   "label", "libelle",
			   "figure", "rounded",
			   "size", "55,80",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (transientConfigurationEClass,
		   source,
		   new String[] {
			   "label", "libelle",
			   "figure", "ellipse",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (functionEClass,
		   source,
		   new String[] {
			   "label", "fname",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "size", "100,55",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (propertyEClass,
		   source,
		   new String[] {
			   "label", "prname1",
			   "label.icon", "false"
		   });
		addAnnotation
		  (activityEClass,
		   source,
		   new String[] {
			   "label", "acname1",
			   "label.icon", "false"
		   });
		addAnnotation
		  (sojournTimeEClass,
		   source,
		   new String[] {
			   "label", "stime",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "border", "none"
		   });
		addAnnotation
		  (testNodeEClass,
		   source,
		   new String[] {
			   "label", "ttime",
			   "label.icon", "false",
			   "figure", "org.eclipse.gmf.runtime.gef.ui.internal.figures.DiamondFigure",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (hRequirementSpecificationEClass,
		   source,
		   new String[] {
			   "label", "ntime",
			   "label.icon", "false",
			   "figure", "rectangle",
			   "size", "100,55",
			   "border.width", "2",
			   "border.color", "0,0,0"
		   });
		addAnnotation
		  (bExistenceEClass,
		   source,
		   new String[] {
			   "label", "bename",
			   "figure", "rounded",
			   "size", "55,100",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0",
			   "tool.name", "BExistence"
		   });
		addAnnotation
		  (uExistenceEClass,
		   source,
		   new String[] {
			   "label", "uename",
			   "figure", "rounded",
			   "size", "55,100",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0",
			   "tool.name", "UExistence"
		   });
		addAnnotation
		  (eExistenceEClass,
		   source,
		   new String[] {
			   "label", "eename",
			   "figure", "rounded",
			   "size", "55,100",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0",
			   "tool.name", "EExistence"
		   });
		addAnnotation
		  (cAbsenceEClass,
		   source,
		   new String[] {
			   "label", "caname",
			   "figure", "rounded",
			   "size", "55,100",
			   "label.icon", "false",
			   "border.width", "2",
			   "border.color", "0,0,0",
			   "border.kind", "DASH",
			   "tool.name", "CAbsence",
			   "border.style", "dash"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getHSystem_Declaratios(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getHSystem_Fonctions(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getHSystem_Configurations(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getHClass_Declaratios(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getHClass_Fonctions(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getPort_EntreePorts(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getFiniteConfiguration_Proprietes(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getFiniteConfiguration_Activites(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getFiniteConfiguration_SojTime(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getPassiveConfiguration_Proprietes(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getPassiveConfiguration_Activites(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getTransientConfiguration_Proprietes(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getTransientConfiguration_Activites(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getFunction_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getProperty_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getActivity_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getHRequirementSpecification_TemporalProperties(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getBExistence_Predicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getUExistence_Predicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getEExistence_Predicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getCAbsence_Predicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
	}

	/**
	 * Initializes the annotations for <b>emf.gen</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmfAnnotations() {
		String source = "emf.gen";
		addAnnotation
		  (getPort_Othername(),
		   source,
		   new String[] {
			   "propertyMultiline", "true"
		   });
		addAnnotation
		  (getFunction_Declarations(),
		   source,
		   new String[] {
			   "propertyMultiline", "true"
		   });
		addAnnotation
		  (getProperty_Prname2(),
		   source,
		   new String[] {
			   "propertyMultiline", "true"
		   });
		addAnnotation
		  (getActivity_Acname2(),
		   source,
		   new String[] {
			   "propertyMultiline", "true"
		   });
		addAnnotation
		  (getTestNode_Contenu(),
		   source,
		   new String[] {
			   "propertyMultiline", "true"
		   });
		addAnnotation
		  (getHRequirementSpecification_Description(),
		   source,
		   new String[] {
			   "propertyMultiline", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (compositionEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "source.decoration", "filledrhomb",
			   "target", "target",
			   "style", "solid",
			   "width", "3",
			   "label.icon", "false",
			   "color", "0,0,0",
			   "label", "llabel"
		   });
		addAnnotation
		  (aggregationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "source.decoration", "rhomb",
			   "target", "target",
			   "style", "solid",
			   "width", "3",
			   "label.icon", "false",
			   "color", "0,0,0",
			   "label", "llabel"
		   });
		addAnnotation
		  (referenceEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "width", "3",
			   "label.icon", "false",
			   "color", "0,0,0",
			   "label", "llabel"
		   });
		addAnnotation
		  (confluentTransitionEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "dot",
			   "target.decoration", "arrow",
			   "label.icon", "false",
			   "color", "0,0,0",
			   "border.width", "3",
			   "label", "ctname"
		   });
		addAnnotation
		  (internalTransitionEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "target.decoration", "arrow",
			   "color", "0,0,0",
			   "border.width", "3",
			   "label", "itname"
		   });
		addAnnotation
		  (externalTransitionEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "dash",
			   "target.decoration", "arrow",
			   "color", "0,0,0",
			   "border.width", "3",
			   "label", "etname"
		   });
		addAnnotation
		  (implicationEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "target.decoration", "arrow",
			   "color", "0,0,0",
			   "border.width", "2",
			   "label", "tll"
		   });
		addAnnotation
		  (nextEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "target.decoration", "arrow",
			   "color", "0,0,0",
			   "border.width", "2",
			   "label", "tll"
		   });
		addAnnotation
		  (concurrencyEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "style", "solid",
			   "source.decoration", "arrow",
			   "target.decoration", "arrow",
			   "color", "0,0,0",
			   "border.width", "2",
			   "label", "tll"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartement</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_6Annotations() {
		String source = "gmf.compartement";
		addAnnotation
		  (getDeclaration_Declarations(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getDeclaration_Predicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getBExistence_Declarations(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getBExistence_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getUExistence_Declarations(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getUExistence_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getEExistence_Declarations(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getEExistence_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getCAbsence_Declarations(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
		addAnnotation
		  (getCAbsence_Ppredicats(),
		   source,
		   new String[] {
			   "layout", "free"
		   });
	}

} //HillsPackageImpl
