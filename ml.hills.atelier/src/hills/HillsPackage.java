/**
 */
package hills;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hills.HillsFactory
 * @model kind="package"
 * @generated
 */
public interface HillsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hills";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.webfst.fst-usttb-edu.ml/hills";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hills";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HillsPackage eINSTANCE = hills.impl.HillsPackageImpl.init();

	/**
	 * The meta object id for the '{@link hills.impl.HSpecificationImpl <em>HSpecification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.HSpecificationImpl
	 * @see hills.impl.HillsPackageImpl#getHSpecification()
	 * @generated
	 */
	int HSPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Nom Modele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__NOM_MODELE = 0;

	/**
	 * The feature id for the '<em><b>Descrip Modele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__DESCRIP_MODELE = 1;

	/**
	 * The feature id for the '<em><b>Composants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__COMPOSANTS = 2;

	/**
	 * The feature id for the '<em><b>Liens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__LIENS = 3;

	/**
	 * The feature id for the '<em><b>Hspecification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__HSPECIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Generic Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__GENERIC_NODES = 5;

	/**
	 * The feature id for the '<em><b>Requirement Specification</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION__REQUIREMENT_SPECIFICATION = 6;

	/**
	 * The number of structural features of the '<em>HSpecification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link hills.impl.NommeImpl <em>Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.NommeImpl
	 * @see hills.impl.HillsPackageImpl#getNomme()
	 * @generated
	 */
	int NOMME = 1;

	/**
	 * The feature id for the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMME__NTIME = 0;

	/**
	 * The number of structural features of the '<em>Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOMME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hills.impl.HClassifierImpl <em>HClassifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.HClassifierImpl
	 * @see hills.impl.HillsPackageImpl#getHClassifier()
	 * @generated
	 */
	int HCLASSIFIER = 2;

	/**
	 * The feature id for the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASSIFIER__NTIME = NOMME__NTIME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASSIFIER__PORTS = NOMME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>HClassifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASSIFIER_FEATURE_COUNT = NOMME_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.HSystemImpl <em>HSystem</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.HSystemImpl
	 * @see hills.impl.HillsPackageImpl#getHSystem()
	 * @generated
	 */
	int HSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__NTIME = HCLASSIFIER__NTIME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__PORTS = HCLASSIFIER__PORTS;

	/**
	 * The feature id for the '<em><b>Declaratios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__DECLARATIOS = HCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fonctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__FONCTIONS = HCLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__CONFIGURATIONS = HCLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__TRANSITIONS = HCLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM__CONDITIONS = HCLASSIFIER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>HSystem</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSYSTEM_FEATURE_COUNT = HCLASSIFIER_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link hills.impl.HClassImpl <em>HClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.HClassImpl
	 * @see hills.impl.HillsPackageImpl#getHClass()
	 * @generated
	 */
	int HCLASS = 4;

	/**
	 * The feature id for the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS__NTIME = HCLASSIFIER__NTIME;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS__PORTS = HCLASSIFIER__PORTS;

	/**
	 * The feature id for the '<em><b>Declaratios</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS__DECLARATIOS = HCLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fonctions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS__FONCTIONS = HCLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HCLASS_FEATURE_COUNT = HCLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PortImpl
	 * @see hills.impl.HillsPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 5;

	/**
	 * The feature id for the '<em><b>Pname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PNAME = 0;

	/**
	 * The feature id for the '<em><b>Othername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OTHERNAME = 1;

	/**
	 * The feature id for the '<em><b>Entree Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ENTREE_PORTS = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.PortDeclarationImpl <em>Port Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PortDeclarationImpl
	 * @see hills.impl.HillsPackageImpl#getPortDeclaration()
	 * @generated
	 */
	int PORT_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Pdeclaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DECLARATION__PDECLARATION = 0;

	/**
	 * The number of structural features of the '<em>Port Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_DECLARATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hills.impl.GenericNodeImpl <em>Generic Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.GenericNodeImpl
	 * @see hills.impl.HillsPackageImpl#getGenericNode()
	 * @generated
	 */
	int GENERIC_NODE = 7;

	/**
	 * The feature id for the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE__NTIME = NOMME__NTIME;

	/**
	 * The number of structural features of the '<em>Generic Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NODE_FEATURE_COUNT = NOMME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.LienImpl <em>Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.LienImpl
	 * @see hills.impl.HillsPackageImpl#getLien()
	 * @generated
	 */
	int LIEN = 8;

	/**
	 * The feature id for the '<em><b>Llabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__LLABEL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.CompositionImpl
	 * @see hills.impl.HillsPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 9;

	/**
	 * The feature id for the '<em><b>Llabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LLABEL = LIEN__LLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = LIEN__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = LIEN__TARGET;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.AggregationImpl
	 * @see hills.impl.HillsPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 10;

	/**
	 * The feature id for the '<em><b>Llabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__LLABEL = LIEN__LLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = LIEN__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = LIEN__TARGET;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ReferenceImpl
	 * @see hills.impl.HillsPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 11;

	/**
	 * The feature id for the '<em><b>Llabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__LLABEL = LIEN__LLABEL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = LIEN__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = LIEN__TARGET;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = LIEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.ConfNommeImpl <em>Conf Nomme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ConfNommeImpl
	 * @see hills.impl.HillsPackageImpl#getConfNomme()
	 * @generated
	 */
	int CONF_NOMME = 12;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_NOMME__LIBELLE = 0;

	/**
	 * The number of structural features of the '<em>Conf Nomme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONF_NOMME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hills.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ConfigurationImpl
	 * @see hills.impl.HillsPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__LIBELLE = CONF_NOMME__LIBELLE;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = CONF_NOMME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.TransitionImpl
	 * @see hills.impl.HillsPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hills.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.DeclarationImpl
	 * @see hills.impl.HillsPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Ename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ENAME = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__DECLARATIONS = 1;

	/**
	 * The feature id for the '<em><b>Predicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__PREDICATS = 2;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.FiniteConfigurationImpl <em>Finite Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.FiniteConfigurationImpl
	 * @see hills.impl.HillsPackageImpl#getFiniteConfiguration()
	 * @generated
	 */
	int FINITE_CONFIGURATION = 16;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_CONFIGURATION__LIBELLE = CONFIGURATION__LIBELLE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_CONFIGURATION__PROPRIETES = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_CONFIGURATION__ACTIVITES = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Soj Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_CONFIGURATION__SOJ_TIME = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Finite Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINITE_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hills.impl.InitialConfigurationImpl <em>Initial Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.InitialConfigurationImpl
	 * @see hills.impl.HillsPackageImpl#getInitialConfiguration()
	 * @generated
	 */
	int INITIAL_CONFIGURATION = 17;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONFIGURATION__LIBELLE = CONFIGURATION__LIBELLE;

	/**
	 * The number of structural features of the '<em>Initial Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.PassiveConfigurationImpl <em>Passive Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PassiveConfigurationImpl
	 * @see hills.impl.HillsPackageImpl#getPassiveConfiguration()
	 * @generated
	 */
	int PASSIVE_CONFIGURATION = 18;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CONFIGURATION__LIBELLE = CONFIGURATION__LIBELLE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CONFIGURATION__PROPRIETES = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CONFIGURATION__ACTIVITES = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Passive Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSIVE_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.TransientConfigurationImpl <em>Transient Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.TransientConfigurationImpl
	 * @see hills.impl.HillsPackageImpl#getTransientConfiguration()
	 * @generated
	 */
	int TRANSIENT_CONFIGURATION = 19;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_CONFIGURATION__LIBELLE = CONFIGURATION__LIBELLE;

	/**
	 * The feature id for the '<em><b>Proprietes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_CONFIGURATION__PROPRIETES = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_CONFIGURATION__ACTIVITES = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transient Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSIENT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.ConfluentTransitionImpl <em>Confluent Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ConfluentTransitionImpl
	 * @see hills.impl.HillsPackageImpl#getConfluentTransition()
	 * @generated
	 */
	int CONFLUENT_TRANSITION = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLUENT_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLUENT_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Ctname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLUENT_TRANSITION__CTNAME = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Confluent Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFLUENT_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.InternalTransitionImpl
	 * @see hills.impl.HillsPackageImpl#getInternalTransition()
	 * @generated
	 */
	int INTERNAL_TRANSITION = 21;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Itname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION__ITNAME = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Internal Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.ExternalTransitionImpl <em>External Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ExternalTransitionImpl
	 * @see hills.impl.HillsPackageImpl#getExternalTransition()
	 * @generated
	 */
	int EXTERNAL_TRANSITION = 22;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Etname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION__ETNAME = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>External Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.FunctionImpl
	 * @see hills.impl.HillsPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 23;

	/**
	 * The feature id for the '<em><b>Fname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FNAME = 0;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DECLARATIONS = 1;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PPREDICATS = 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PropertyImpl
	 * @see hills.impl.HillsPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Prname1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PRNAME1 = 0;

	/**
	 * The feature id for the '<em><b>Prname2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PRNAME2 = 1;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__PPREDICATS = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.ActivityImpl <em>Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ActivityImpl
	 * @see hills.impl.HillsPackageImpl#getActivity()
	 * @generated
	 */
	int ACTIVITY = 25;

	/**
	 * The feature id for the '<em><b>Acname1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACNAME1 = 0;

	/**
	 * The feature id for the '<em><b>Acname2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__ACNAME2 = 1;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY__PPREDICATS = 2;

	/**
	 * The number of structural features of the '<em>Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.SojournTimeImpl <em>Sojourn Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.SojournTimeImpl
	 * @see hills.impl.HillsPackageImpl#getSojournTime()
	 * @generated
	 */
	int SOJOURN_TIME = 26;

	/**
	 * The feature id for the '<em><b>Stime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN_TIME__STIME = 0;

	/**
	 * The number of structural features of the '<em>Sojourn Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOJOURN_TIME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hills.impl.TestNodeImpl <em>Test Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.TestNodeImpl
	 * @see hills.impl.HillsPackageImpl#getTestNode()
	 * @generated
	 */
	int TEST_NODE = 27;

	/**
	 * The feature id for the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__LIBELLE = CONFIGURATION__LIBELLE;

	/**
	 * The feature id for the '<em><b>Ttime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__TTIME = CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contenu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE__CONTENU = CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_NODE_FEATURE_COUNT = CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.HRequirementSpecificationImpl <em>HRequirement Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.HRequirementSpecificationImpl
	 * @see hills.impl.HillsPackageImpl#getHRequirementSpecification()
	 * @generated
	 */
	int HREQUIREMENT_SPECIFICATION = 28;

	/**
	 * The feature id for the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREQUIREMENT_SPECIFICATION__NTIME = NOMME__NTIME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREQUIREMENT_SPECIFICATION__DESCRIPTION = NOMME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporal Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREQUIREMENT_SPECIFICATION__TEMPORAL_PROPERTIES = NOMME_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>HRequirement Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HREQUIREMENT_SPECIFICATION_FEATURE_COUNT = NOMME_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.TLPropertyImpl <em>TL Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.TLPropertyImpl
	 * @see hills.impl.HillsPackageImpl#getTLProperty()
	 * @generated
	 */
	int TL_PROPERTY = 33;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_PROPERTY__PATTERN = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_PROPERTY__SCOPE = 1;

	/**
	 * The number of structural features of the '<em>TL Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link hills.impl.BExistenceImpl <em>BExistence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.BExistenceImpl
	 * @see hills.impl.HillsPackageImpl#getBExistence()
	 * @generated
	 */
	int BEXISTENCE = 29;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE__PATTERN = TL_PROPERTY__PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE__SCOPE = TL_PROPERTY__SCOPE;

	/**
	 * The feature id for the '<em><b>Bename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE__BENAME = TL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE__PREDICATS = TL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE__DECLARATIONS = TL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE__PPREDICATS = TL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BExistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEXISTENCE_FEATURE_COUNT = TL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hills.impl.UExistenceImpl <em>UExistence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.UExistenceImpl
	 * @see hills.impl.HillsPackageImpl#getUExistence()
	 * @generated
	 */
	int UEXISTENCE = 30;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE__PATTERN = TL_PROPERTY__PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE__SCOPE = TL_PROPERTY__SCOPE;

	/**
	 * The feature id for the '<em><b>Uename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE__UENAME = TL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE__PREDICATS = TL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE__DECLARATIONS = TL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE__PPREDICATS = TL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UExistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UEXISTENCE_FEATURE_COUNT = TL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hills.impl.EExistenceImpl <em>EExistence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.EExistenceImpl
	 * @see hills.impl.HillsPackageImpl#getEExistence()
	 * @generated
	 */
	int EEXISTENCE = 31;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE__PATTERN = TL_PROPERTY__PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE__SCOPE = TL_PROPERTY__SCOPE;

	/**
	 * The feature id for the '<em><b>Eename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE__EENAME = TL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE__PREDICATS = TL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE__DECLARATIONS = TL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE__PPREDICATS = TL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EExistence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EEXISTENCE_FEATURE_COUNT = TL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hills.impl.CAbsenceImpl <em>CAbsence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.CAbsenceImpl
	 * @see hills.impl.HillsPackageImpl#getCAbsence()
	 * @generated
	 */
	int CABSENCE = 32;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE__PATTERN = TL_PROPERTY__PATTERN;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE__SCOPE = TL_PROPERTY__SCOPE;

	/**
	 * The feature id for the '<em><b>Caname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE__CANAME = TL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Predicats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE__PREDICATS = TL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE__DECLARATIONS = TL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ppredicats</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE__PPREDICATS = TL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>CAbsence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CABSENCE_FEATURE_COUNT = TL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link hills.impl.PropertyPatternImpl <em>Property Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PropertyPatternImpl
	 * @see hills.impl.HillsPackageImpl#getPropertyPattern()
	 * @generated
	 */
	int PROPERTY_PATTERN = 37;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATTERN__PPNAME = 0;

	/**
	 * The number of structural features of the '<em>Property Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_PATTERN_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link hills.impl.ResponseChainImpl <em>Response Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ResponseChainImpl
	 * @see hills.impl.HillsPackageImpl#getResponseChain()
	 * @generated
	 */
	int RESPONSE_CHAIN = 34;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CHAIN__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The number of structural features of the '<em>Response Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CHAIN_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.PrecedenceChainImpl <em>Precedence Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PrecedenceChainImpl
	 * @see hills.impl.HillsPackageImpl#getPrecedenceChain()
	 * @generated
	 */
	int PRECEDENCE_CHAIN = 35;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CHAIN__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The number of structural features of the '<em>Precedence Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_CHAIN_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.BoundedExistenceImpl <em>Bounded Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.BoundedExistenceImpl
	 * @see hills.impl.HillsPackageImpl#getBoundedExistence()
	 * @generated
	 */
	int BOUNDED_EXISTENCE = 36;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__FREQUENCY = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE__STATE = PROPERTY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bounded Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_EXISTENCE_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.MultiTriggerImpl <em>Multi Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.MultiTriggerImpl
	 * @see hills.impl.HillsPackageImpl#getMultiTrigger()
	 * @generated
	 */
	int MULTI_TRIGGER = 38;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRIGGER__PPNAME = RESPONSE_CHAIN__PPNAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRIGGER__TRIGGERS = RESPONSE_CHAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRIGGER__RESPONSE = RESPONSE_CHAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRIGGER_FEATURE_COUNT = RESPONSE_CHAIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.SingleTriggerImpl <em>Single Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.SingleTriggerImpl
	 * @see hills.impl.HillsPackageImpl#getSingleTrigger()
	 * @generated
	 */
	int SINGLE_TRIGGER = 39;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRIGGER__PPNAME = RESPONSE_CHAIN__PPNAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRIGGER__TRIGGERS = RESPONSE_CHAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRIGGER__RESPONSES = RESPONSE_CHAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TRIGGER_FEATURE_COUNT = RESPONSE_CHAIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.MultiCauseImpl <em>Multi Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.MultiCauseImpl
	 * @see hills.impl.HillsPackageImpl#getMultiCause()
	 * @generated
	 */
	int MULTI_CAUSE = 40;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CAUSE__PPNAME = PRECEDENCE_CHAIN__PPNAME;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CAUSE__CAUSES = PRECEDENCE_CHAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CAUSE__EFFECT = PRECEDENCE_CHAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_CAUSE_FEATURE_COUNT = PRECEDENCE_CHAIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ResponseImpl
	 * @see hills.impl.HillsPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 41;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__TRIGGER = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE = PROPERTY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.UniversalityImpl <em>Universality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.UniversalityImpl
	 * @see hills.impl.HillsPackageImpl#getUniversality()
	 * @generated
	 */
	int UNIVERSALITY = 42;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY__STATE = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Universality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIVERSALITY_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.PrecedenceImpl <em>Precedence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PrecedenceImpl
	 * @see hills.impl.HillsPackageImpl#getPrecedence()
	 * @generated
	 */
	int PRECEDENCE = 43;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The number of structural features of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRECEDENCE_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.SingleCauseImpl <em>Single Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.SingleCauseImpl
	 * @see hills.impl.HillsPackageImpl#getSingleCause()
	 * @generated
	 */
	int SINGLE_CAUSE = 44;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CAUSE__PPNAME = PRECEDENCE_CHAIN__PPNAME;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CAUSE__CAUSES = PRECEDENCE_CHAIN_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CAUSE__EFFECTS = PRECEDENCE_CHAIN_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_CAUSE_FEATURE_COUNT = PRECEDENCE_CHAIN_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.ExistenceImpl <em>Existence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ExistenceImpl
	 * @see hills.impl.HillsPackageImpl#getExistence()
	 * @generated
	 */
	int EXISTENCE = 45;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE__STATE = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Existence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTENCE_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.AbsenceImpl <em>Absence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.AbsenceImpl
	 * @see hills.impl.HillsPackageImpl#getAbsence()
	 * @generated
	 */
	int ABSENCE = 46;

	/**
	 * The feature id for the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE__PPNAME = PROPERTY_PATTERN__PPNAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE__STATE = PROPERTY_PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Absence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSENCE_FEATURE_COUNT = PROPERTY_PATTERN_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.PropositionImpl <em>Proposition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PropositionImpl
	 * @see hills.impl.HillsPackageImpl#getProposition()
	 * @generated
	 */
	int PROPOSITION = 47;

	/**
	 * The number of structural features of the '<em>Proposition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSITION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hills.impl.PredicatImpl <em>Predicat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.PredicatImpl
	 * @see hills.impl.HillsPackageImpl#getPredicat()
	 * @generated
	 */
	int PREDICAT = 48;

	/**
	 * The number of structural features of the '<em>Predicat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDICAT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hills.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ScopeImpl
	 * @see hills.impl.HillsPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 53;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link hills.impl.BeforeImpl <em>Before</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.BeforeImpl
	 * @see hills.impl.HillsPackageImpl#getBefore()
	 * @generated
	 */
	int BEFORE = 49;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE__DELIMITER = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Before</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEFORE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.AfterImpl <em>After</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.AfterImpl
	 * @see hills.impl.HillsPackageImpl#getAfter()
	 * @generated
	 */
	int AFTER = 50;

	/**
	 * The feature id for the '<em><b>Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER__DELIMITER = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>After</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hills.impl.GlobalImpl <em>Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.GlobalImpl
	 * @see hills.impl.HillsPackageImpl#getGlobal()
	 * @generated
	 */
	int GLOBAL = 51;

	/**
	 * The number of structural features of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.AfterUntilImpl <em>After Until</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.AfterUntilImpl
	 * @see hills.impl.HillsPackageImpl#getAfterUntil()
	 * @generated
	 */
	int AFTER_UNTIL = 52;

	/**
	 * The feature id for the '<em><b>Start Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL__START_DELIMITER = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL__END_DELIMITER = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>After Until</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AFTER_UNTIL_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.BetweenImpl <em>Between</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.BetweenImpl
	 * @see hills.impl.HillsPackageImpl#getBetween()
	 * @generated
	 */
	int BETWEEN = 54;

	/**
	 * The feature id for the '<em><b>Start Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN__START_DELIMITER = SCOPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN__END_DELIMITER = SCOPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Between</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BETWEEN_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hills.impl.TLLienImpl <em>TL Lien</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.TLLienImpl
	 * @see hills.impl.HillsPackageImpl#getTLLien()
	 * @generated
	 */
	int TL_LIEN = 58;

	/**
	 * The feature id for the '<em><b>Tll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LIEN__TLL = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LIEN__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LIEN__TARGET = 2;

	/**
	 * The number of structural features of the '<em>TL Lien</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TL_LIEN_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link hills.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ImplicationImpl
	 * @see hills.impl.HillsPackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 55;

	/**
	 * The feature id for the '<em><b>Tll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__TLL = TL_LIEN__TLL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__SOURCE = TL_LIEN__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__TARGET = TL_LIEN__TARGET;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = TL_LIEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.NextImpl <em>Next</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.NextImpl
	 * @see hills.impl.HillsPackageImpl#getNext()
	 * @generated
	 */
	int NEXT = 56;

	/**
	 * The feature id for the '<em><b>Tll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__TLL = TL_LIEN__TLL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__SOURCE = TL_LIEN__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT__TARGET = TL_LIEN__TARGET;

	/**
	 * The number of structural features of the '<em>Next</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEXT_FEATURE_COUNT = TL_LIEN_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link hills.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hills.impl.ConcurrencyImpl
	 * @see hills.impl.HillsPackageImpl#getConcurrency()
	 * @generated
	 */
	int CONCURRENCY = 57;

	/**
	 * The feature id for the '<em><b>Tll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__TLL = TL_LIEN__TLL;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__SOURCE = TL_LIEN__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__TARGET = TL_LIEN__TARGET;

	/**
	 * The number of structural features of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_FEATURE_COUNT = TL_LIEN_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hills.HSpecification <em>HSpecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSpecification</em>'.
	 * @see hills.HSpecification
	 * @generated
	 */
	EClass getHSpecification();

	/**
	 * Returns the meta object for the attribute '{@link hills.HSpecification#getNomModele <em>Nom Modele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Modele</em>'.
	 * @see hills.HSpecification#getNomModele()
	 * @see #getHSpecification()
	 * @generated
	 */
	EAttribute getHSpecification_NomModele();

	/**
	 * Returns the meta object for the attribute '{@link hills.HSpecification#getDescripModele <em>Descrip Modele</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descrip Modele</em>'.
	 * @see hills.HSpecification#getDescripModele()
	 * @see #getHSpecification()
	 * @generated
	 */
	EAttribute getHSpecification_DescripModele();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSpecification#getComposants <em>Composants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composants</em>'.
	 * @see hills.HSpecification#getComposants()
	 * @see #getHSpecification()
	 * @generated
	 */
	EReference getHSpecification_Composants();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSpecification#getLiens <em>Liens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Liens</em>'.
	 * @see hills.HSpecification#getLiens()
	 * @see #getHSpecification()
	 * @generated
	 */
	EReference getHSpecification_Liens();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSpecification#getHspecification <em>Hspecification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hspecification</em>'.
	 * @see hills.HSpecification#getHspecification()
	 * @see #getHSpecification()
	 * @generated
	 */
	EReference getHSpecification_Hspecification();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSpecification#getGenericNodes <em>Generic Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Nodes</em>'.
	 * @see hills.HSpecification#getGenericNodes()
	 * @see #getHSpecification()
	 * @generated
	 */
	EReference getHSpecification_GenericNodes();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSpecification#getRequirementSpecification <em>Requirement Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Specification</em>'.
	 * @see hills.HSpecification#getRequirementSpecification()
	 * @see #getHSpecification()
	 * @generated
	 */
	EReference getHSpecification_RequirementSpecification();

	/**
	 * Returns the meta object for class '{@link hills.Nomme <em>Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nomme</em>'.
	 * @see hills.Nomme
	 * @generated
	 */
	EClass getNomme();

	/**
	 * Returns the meta object for the attribute '{@link hills.Nomme#getNtime <em>Ntime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ntime</em>'.
	 * @see hills.Nomme#getNtime()
	 * @see #getNomme()
	 * @generated
	 */
	EAttribute getNomme_Ntime();

	/**
	 * Returns the meta object for class '{@link hills.HClassifier <em>HClassifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HClassifier</em>'.
	 * @see hills.HClassifier
	 * @generated
	 */
	EClass getHClassifier();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HClassifier#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see hills.HClassifier#getPorts()
	 * @see #getHClassifier()
	 * @generated
	 */
	EReference getHClassifier_Ports();

	/**
	 * Returns the meta object for class '{@link hills.HSystem <em>HSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSystem</em>'.
	 * @see hills.HSystem
	 * @generated
	 */
	EClass getHSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSystem#getDeclaratios <em>Declaratios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaratios</em>'.
	 * @see hills.HSystem#getDeclaratios()
	 * @see #getHSystem()
	 * @generated
	 */
	EReference getHSystem_Declaratios();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSystem#getFonctions <em>Fonctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fonctions</em>'.
	 * @see hills.HSystem#getFonctions()
	 * @see #getHSystem()
	 * @generated
	 */
	EReference getHSystem_Fonctions();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSystem#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see hills.HSystem#getConfigurations()
	 * @see #getHSystem()
	 * @generated
	 */
	EReference getHSystem_Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSystem#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see hills.HSystem#getTransitions()
	 * @see #getHSystem()
	 * @generated
	 */
	EReference getHSystem_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HSystem#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see hills.HSystem#getConditions()
	 * @see #getHSystem()
	 * @generated
	 */
	EReference getHSystem_Conditions();

	/**
	 * Returns the meta object for class '{@link hills.HClass <em>HClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HClass</em>'.
	 * @see hills.HClass
	 * @generated
	 */
	EClass getHClass();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HClass#getDeclaratios <em>Declaratios</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaratios</em>'.
	 * @see hills.HClass#getDeclaratios()
	 * @see #getHClass()
	 * @generated
	 */
	EReference getHClass_Declaratios();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HClass#getFonctions <em>Fonctions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fonctions</em>'.
	 * @see hills.HClass#getFonctions()
	 * @see #getHClass()
	 * @generated
	 */
	EReference getHClass_Fonctions();

	/**
	 * Returns the meta object for class '{@link hills.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see hills.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link hills.Port#getPname <em>Pname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pname</em>'.
	 * @see hills.Port#getPname()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Pname();

	/**
	 * Returns the meta object for the attribute '{@link hills.Port#getOthername <em>Othername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Othername</em>'.
	 * @see hills.Port#getOthername()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Othername();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.Port#getEntreePorts <em>Entree Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entree Ports</em>'.
	 * @see hills.Port#getEntreePorts()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_EntreePorts();

	/**
	 * Returns the meta object for class '{@link hills.PortDeclaration <em>Port Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Declaration</em>'.
	 * @see hills.PortDeclaration
	 * @generated
	 */
	EClass getPortDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hills.PortDeclaration#getPdeclaration <em>Pdeclaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdeclaration</em>'.
	 * @see hills.PortDeclaration#getPdeclaration()
	 * @see #getPortDeclaration()
	 * @generated
	 */
	EAttribute getPortDeclaration_Pdeclaration();

	/**
	 * Returns the meta object for class '{@link hills.GenericNode <em>Generic Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Node</em>'.
	 * @see hills.GenericNode
	 * @generated
	 */
	EClass getGenericNode();

	/**
	 * Returns the meta object for class '{@link hills.Lien <em>Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lien</em>'.
	 * @see hills.Lien
	 * @generated
	 */
	EClass getLien();

	/**
	 * Returns the meta object for the attribute '{@link hills.Lien#getLlabel <em>Llabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Llabel</em>'.
	 * @see hills.Lien#getLlabel()
	 * @see #getLien()
	 * @generated
	 */
	EAttribute getLien_Llabel();

	/**
	 * Returns the meta object for the reference '{@link hills.Lien#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hills.Lien#getSource()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Source();

	/**
	 * Returns the meta object for the reference '{@link hills.Lien#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hills.Lien#getTarget()
	 * @see #getLien()
	 * @generated
	 */
	EReference getLien_Target();

	/**
	 * Returns the meta object for class '{@link hills.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see hills.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link hills.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see hills.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link hills.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see hills.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for class '{@link hills.ConfNomme <em>Conf Nomme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conf Nomme</em>'.
	 * @see hills.ConfNomme
	 * @generated
	 */
	EClass getConfNomme();

	/**
	 * Returns the meta object for the attribute '{@link hills.ConfNomme#getLibelle <em>Libelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Libelle</em>'.
	 * @see hills.ConfNomme#getLibelle()
	 * @see #getConfNomme()
	 * @generated
	 */
	EAttribute getConfNomme_Libelle();

	/**
	 * Returns the meta object for class '{@link hills.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see hills.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for class '{@link hills.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see hills.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link hills.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hills.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link hills.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hills.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for class '{@link hills.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see hills.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hills.Declaration#getEname <em>Ename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ename</em>'.
	 * @see hills.Declaration#getEname()
	 * @see #getDeclaration()
	 * @generated
	 */
	EAttribute getDeclaration_Ename();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.Declaration#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see hills.Declaration#getDeclarations()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.Declaration#getPredicats <em>Predicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Predicats</em>'.
	 * @see hills.Declaration#getPredicats()
	 * @see #getDeclaration()
	 * @generated
	 */
	EReference getDeclaration_Predicats();

	/**
	 * Returns the meta object for class '{@link hills.FiniteConfiguration <em>Finite Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finite Configuration</em>'.
	 * @see hills.FiniteConfiguration
	 * @generated
	 */
	EClass getFiniteConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.FiniteConfiguration#getProprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proprietes</em>'.
	 * @see hills.FiniteConfiguration#getProprietes()
	 * @see #getFiniteConfiguration()
	 * @generated
	 */
	EReference getFiniteConfiguration_Proprietes();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.FiniteConfiguration#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see hills.FiniteConfiguration#getActivites()
	 * @see #getFiniteConfiguration()
	 * @generated
	 */
	EReference getFiniteConfiguration_Activites();

	/**
	 * Returns the meta object for the containment reference '{@link hills.FiniteConfiguration#getSojTime <em>Soj Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Soj Time</em>'.
	 * @see hills.FiniteConfiguration#getSojTime()
	 * @see #getFiniteConfiguration()
	 * @generated
	 */
	EReference getFiniteConfiguration_SojTime();

	/**
	 * Returns the meta object for class '{@link hills.InitialConfiguration <em>Initial Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial Configuration</em>'.
	 * @see hills.InitialConfiguration
	 * @generated
	 */
	EClass getInitialConfiguration();

	/**
	 * Returns the meta object for class '{@link hills.PassiveConfiguration <em>Passive Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passive Configuration</em>'.
	 * @see hills.PassiveConfiguration
	 * @generated
	 */
	EClass getPassiveConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.PassiveConfiguration#getProprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proprietes</em>'.
	 * @see hills.PassiveConfiguration#getProprietes()
	 * @see #getPassiveConfiguration()
	 * @generated
	 */
	EReference getPassiveConfiguration_Proprietes();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.PassiveConfiguration#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see hills.PassiveConfiguration#getActivites()
	 * @see #getPassiveConfiguration()
	 * @generated
	 */
	EReference getPassiveConfiguration_Activites();

	/**
	 * Returns the meta object for class '{@link hills.TransientConfiguration <em>Transient Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transient Configuration</em>'.
	 * @see hills.TransientConfiguration
	 * @generated
	 */
	EClass getTransientConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.TransientConfiguration#getProprietes <em>Proprietes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proprietes</em>'.
	 * @see hills.TransientConfiguration#getProprietes()
	 * @see #getTransientConfiguration()
	 * @generated
	 */
	EReference getTransientConfiguration_Proprietes();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.TransientConfiguration#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see hills.TransientConfiguration#getActivites()
	 * @see #getTransientConfiguration()
	 * @generated
	 */
	EReference getTransientConfiguration_Activites();

	/**
	 * Returns the meta object for class '{@link hills.ConfluentTransition <em>Confluent Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confluent Transition</em>'.
	 * @see hills.ConfluentTransition
	 * @generated
	 */
	EClass getConfluentTransition();

	/**
	 * Returns the meta object for the attribute '{@link hills.ConfluentTransition#getCtname <em>Ctname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ctname</em>'.
	 * @see hills.ConfluentTransition#getCtname()
	 * @see #getConfluentTransition()
	 * @generated
	 */
	EAttribute getConfluentTransition_Ctname();

	/**
	 * Returns the meta object for class '{@link hills.InternalTransition <em>Internal Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Transition</em>'.
	 * @see hills.InternalTransition
	 * @generated
	 */
	EClass getInternalTransition();

	/**
	 * Returns the meta object for the attribute '{@link hills.InternalTransition#getItname <em>Itname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Itname</em>'.
	 * @see hills.InternalTransition#getItname()
	 * @see #getInternalTransition()
	 * @generated
	 */
	EAttribute getInternalTransition_Itname();

	/**
	 * Returns the meta object for class '{@link hills.ExternalTransition <em>External Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Transition</em>'.
	 * @see hills.ExternalTransition
	 * @generated
	 */
	EClass getExternalTransition();

	/**
	 * Returns the meta object for the attribute '{@link hills.ExternalTransition#getEtname <em>Etname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etname</em>'.
	 * @see hills.ExternalTransition#getEtname()
	 * @see #getExternalTransition()
	 * @generated
	 */
	EAttribute getExternalTransition_Etname();

	/**
	 * Returns the meta object for class '{@link hills.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see hills.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link hills.Function#getFname <em>Fname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fname</em>'.
	 * @see hills.Function#getFname()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Fname();

	/**
	 * Returns the meta object for the attribute '{@link hills.Function#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declarations</em>'.
	 * @see hills.Function#getDeclarations()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.Function#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.Function#getPpredicats()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see hills.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link hills.Property#getPrname1 <em>Prname1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prname1</em>'.
	 * @see hills.Property#getPrname1()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Prname1();

	/**
	 * Returns the meta object for the attribute '{@link hills.Property#getPrname2 <em>Prname2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prname2</em>'.
	 * @see hills.Property#getPrname2()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Prname2();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.Property#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.Property#getPpredicats()
	 * @see #getProperty()
	 * @generated
	 */
	EReference getProperty_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity</em>'.
	 * @see hills.Activity
	 * @generated
	 */
	EClass getActivity();

	/**
	 * Returns the meta object for the attribute '{@link hills.Activity#getAcname1 <em>Acname1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acname1</em>'.
	 * @see hills.Activity#getAcname1()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Acname1();

	/**
	 * Returns the meta object for the attribute '{@link hills.Activity#getAcname2 <em>Acname2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Acname2</em>'.
	 * @see hills.Activity#getAcname2()
	 * @see #getActivity()
	 * @generated
	 */
	EAttribute getActivity_Acname2();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.Activity#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.Activity#getPpredicats()
	 * @see #getActivity()
	 * @generated
	 */
	EReference getActivity_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.SojournTime <em>Sojourn Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sojourn Time</em>'.
	 * @see hills.SojournTime
	 * @generated
	 */
	EClass getSojournTime();

	/**
	 * Returns the meta object for the attribute '{@link hills.SojournTime#getStime <em>Stime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stime</em>'.
	 * @see hills.SojournTime#getStime()
	 * @see #getSojournTime()
	 * @generated
	 */
	EAttribute getSojournTime_Stime();

	/**
	 * Returns the meta object for class '{@link hills.TestNode <em>Test Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Node</em>'.
	 * @see hills.TestNode
	 * @generated
	 */
	EClass getTestNode();

	/**
	 * Returns the meta object for the attribute '{@link hills.TestNode#getTtime <em>Ttime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ttime</em>'.
	 * @see hills.TestNode#getTtime()
	 * @see #getTestNode()
	 * @generated
	 */
	EAttribute getTestNode_Ttime();

	/**
	 * Returns the meta object for the attribute '{@link hills.TestNode#getContenu <em>Contenu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contenu</em>'.
	 * @see hills.TestNode#getContenu()
	 * @see #getTestNode()
	 * @generated
	 */
	EAttribute getTestNode_Contenu();

	/**
	 * Returns the meta object for class '{@link hills.HRequirementSpecification <em>HRequirement Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HRequirement Specification</em>'.
	 * @see hills.HRequirementSpecification
	 * @generated
	 */
	EClass getHRequirementSpecification();

	/**
	 * Returns the meta object for the attribute '{@link hills.HRequirementSpecification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see hills.HRequirementSpecification#getDescription()
	 * @see #getHRequirementSpecification()
	 * @generated
	 */
	EAttribute getHRequirementSpecification_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.HRequirementSpecification#getTemporalProperties <em>Temporal Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Temporal Properties</em>'.
	 * @see hills.HRequirementSpecification#getTemporalProperties()
	 * @see #getHRequirementSpecification()
	 * @generated
	 */
	EReference getHRequirementSpecification_TemporalProperties();

	/**
	 * Returns the meta object for class '{@link hills.BExistence <em>BExistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BExistence</em>'.
	 * @see hills.BExistence
	 * @generated
	 */
	EClass getBExistence();

	/**
	 * Returns the meta object for the attribute '{@link hills.BExistence#getBename <em>Bename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bename</em>'.
	 * @see hills.BExistence#getBename()
	 * @see #getBExistence()
	 * @generated
	 */
	EAttribute getBExistence_Bename();

	/**
	 * Returns the meta object for the containment reference '{@link hills.BExistence#getPredicats <em>Predicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicats</em>'.
	 * @see hills.BExistence#getPredicats()
	 * @see #getBExistence()
	 * @generated
	 */
	EReference getBExistence_Predicats();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.BExistence#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see hills.BExistence#getDeclarations()
	 * @see #getBExistence()
	 * @generated
	 */
	EReference getBExistence_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.BExistence#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.BExistence#getPpredicats()
	 * @see #getBExistence()
	 * @generated
	 */
	EReference getBExistence_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.UExistence <em>UExistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UExistence</em>'.
	 * @see hills.UExistence
	 * @generated
	 */
	EClass getUExistence();

	/**
	 * Returns the meta object for the attribute '{@link hills.UExistence#getUename <em>Uename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uename</em>'.
	 * @see hills.UExistence#getUename()
	 * @see #getUExistence()
	 * @generated
	 */
	EAttribute getUExistence_Uename();

	/**
	 * Returns the meta object for the containment reference '{@link hills.UExistence#getPredicats <em>Predicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicats</em>'.
	 * @see hills.UExistence#getPredicats()
	 * @see #getUExistence()
	 * @generated
	 */
	EReference getUExistence_Predicats();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.UExistence#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see hills.UExistence#getDeclarations()
	 * @see #getUExistence()
	 * @generated
	 */
	EReference getUExistence_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.UExistence#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.UExistence#getPpredicats()
	 * @see #getUExistence()
	 * @generated
	 */
	EReference getUExistence_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.EExistence <em>EExistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EExistence</em>'.
	 * @see hills.EExistence
	 * @generated
	 */
	EClass getEExistence();

	/**
	 * Returns the meta object for the attribute '{@link hills.EExistence#getEename <em>Eename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eename</em>'.
	 * @see hills.EExistence#getEename()
	 * @see #getEExistence()
	 * @generated
	 */
	EAttribute getEExistence_Eename();

	/**
	 * Returns the meta object for the containment reference '{@link hills.EExistence#getPredicats <em>Predicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicats</em>'.
	 * @see hills.EExistence#getPredicats()
	 * @see #getEExistence()
	 * @generated
	 */
	EReference getEExistence_Predicats();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.EExistence#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see hills.EExistence#getDeclarations()
	 * @see #getEExistence()
	 * @generated
	 */
	EReference getEExistence_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.EExistence#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.EExistence#getPpredicats()
	 * @see #getEExistence()
	 * @generated
	 */
	EReference getEExistence_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.CAbsence <em>CAbsence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CAbsence</em>'.
	 * @see hills.CAbsence
	 * @generated
	 */
	EClass getCAbsence();

	/**
	 * Returns the meta object for the attribute '{@link hills.CAbsence#getCaname <em>Caname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caname</em>'.
	 * @see hills.CAbsence#getCaname()
	 * @see #getCAbsence()
	 * @generated
	 */
	EAttribute getCAbsence_Caname();

	/**
	 * Returns the meta object for the containment reference '{@link hills.CAbsence#getPredicats <em>Predicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Predicats</em>'.
	 * @see hills.CAbsence#getPredicats()
	 * @see #getCAbsence()
	 * @generated
	 */
	EReference getCAbsence_Predicats();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.CAbsence#getDeclarations <em>Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declarations</em>'.
	 * @see hills.CAbsence#getDeclarations()
	 * @see #getCAbsence()
	 * @generated
	 */
	EReference getCAbsence_Declarations();

	/**
	 * Returns the meta object for the containment reference list '{@link hills.CAbsence#getPpredicats <em>Ppredicats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ppredicats</em>'.
	 * @see hills.CAbsence#getPpredicats()
	 * @see #getCAbsence()
	 * @generated
	 */
	EReference getCAbsence_Ppredicats();

	/**
	 * Returns the meta object for class '{@link hills.TLProperty <em>TL Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Property</em>'.
	 * @see hills.TLProperty
	 * @generated
	 */
	EClass getTLProperty();

	/**
	 * Returns the meta object for the reference '{@link hills.TLProperty#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pattern</em>'.
	 * @see hills.TLProperty#getPattern()
	 * @see #getTLProperty()
	 * @generated
	 */
	EReference getTLProperty_Pattern();

	/**
	 * Returns the meta object for the reference '{@link hills.TLProperty#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scope</em>'.
	 * @see hills.TLProperty#getScope()
	 * @see #getTLProperty()
	 * @generated
	 */
	EReference getTLProperty_Scope();

	/**
	 * Returns the meta object for class '{@link hills.ResponseChain <em>Response Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Chain</em>'.
	 * @see hills.ResponseChain
	 * @generated
	 */
	EClass getResponseChain();

	/**
	 * Returns the meta object for class '{@link hills.PrecedenceChain <em>Precedence Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence Chain</em>'.
	 * @see hills.PrecedenceChain
	 * @generated
	 */
	EClass getPrecedenceChain();

	/**
	 * Returns the meta object for class '{@link hills.BoundedExistence <em>Bounded Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Existence</em>'.
	 * @see hills.BoundedExistence
	 * @generated
	 */
	EClass getBoundedExistence();

	/**
	 * Returns the meta object for the attribute '{@link hills.BoundedExistence#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see hills.BoundedExistence#getFrequency()
	 * @see #getBoundedExistence()
	 * @generated
	 */
	EAttribute getBoundedExistence_Frequency();

	/**
	 * Returns the meta object for the reference '{@link hills.BoundedExistence#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see hills.BoundedExistence#getState()
	 * @see #getBoundedExistence()
	 * @generated
	 */
	EReference getBoundedExistence_State();

	/**
	 * Returns the meta object for class '{@link hills.PropertyPattern <em>Property Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Pattern</em>'.
	 * @see hills.PropertyPattern
	 * @generated
	 */
	EClass getPropertyPattern();

	/**
	 * Returns the meta object for the attribute '{@link hills.PropertyPattern#getPpname <em>Ppname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ppname</em>'.
	 * @see hills.PropertyPattern#getPpname()
	 * @see #getPropertyPattern()
	 * @generated
	 */
	EAttribute getPropertyPattern_Ppname();

	/**
	 * Returns the meta object for class '{@link hills.MultiTrigger <em>Multi Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Trigger</em>'.
	 * @see hills.MultiTrigger
	 * @generated
	 */
	EClass getMultiTrigger();

	/**
	 * Returns the meta object for the reference list '{@link hills.MultiTrigger#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggers</em>'.
	 * @see hills.MultiTrigger#getTriggers()
	 * @see #getMultiTrigger()
	 * @generated
	 */
	EReference getMultiTrigger_Triggers();

	/**
	 * Returns the meta object for the reference '{@link hills.MultiTrigger#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see hills.MultiTrigger#getResponse()
	 * @see #getMultiTrigger()
	 * @generated
	 */
	EReference getMultiTrigger_Response();

	/**
	 * Returns the meta object for class '{@link hills.SingleTrigger <em>Single Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Trigger</em>'.
	 * @see hills.SingleTrigger
	 * @generated
	 */
	EClass getSingleTrigger();

	/**
	 * Returns the meta object for the reference '{@link hills.SingleTrigger#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Triggers</em>'.
	 * @see hills.SingleTrigger#getTriggers()
	 * @see #getSingleTrigger()
	 * @generated
	 */
	EReference getSingleTrigger_Triggers();

	/**
	 * Returns the meta object for the reference list '{@link hills.SingleTrigger#getResponses <em>Responses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Responses</em>'.
	 * @see hills.SingleTrigger#getResponses()
	 * @see #getSingleTrigger()
	 * @generated
	 */
	EReference getSingleTrigger_Responses();

	/**
	 * Returns the meta object for class '{@link hills.MultiCause <em>Multi Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Cause</em>'.
	 * @see hills.MultiCause
	 * @generated
	 */
	EClass getMultiCause();

	/**
	 * Returns the meta object for the reference list '{@link hills.MultiCause#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Causes</em>'.
	 * @see hills.MultiCause#getCauses()
	 * @see #getMultiCause()
	 * @generated
	 */
	EReference getMultiCause_Causes();

	/**
	 * Returns the meta object for the reference '{@link hills.MultiCause#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effect</em>'.
	 * @see hills.MultiCause#getEffect()
	 * @see #getMultiCause()
	 * @generated
	 */
	EReference getMultiCause_Effect();

	/**
	 * Returns the meta object for class '{@link hills.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see hills.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the reference '{@link hills.Response#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger</em>'.
	 * @see hills.Response#getTrigger()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Trigger();

	/**
	 * Returns the meta object for the reference '{@link hills.Response#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Response</em>'.
	 * @see hills.Response#getResponse()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_Response();

	/**
	 * Returns the meta object for class '{@link hills.Universality <em>Universality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Universality</em>'.
	 * @see hills.Universality
	 * @generated
	 */
	EClass getUniversality();

	/**
	 * Returns the meta object for the reference '{@link hills.Universality#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see hills.Universality#getState()
	 * @see #getUniversality()
	 * @generated
	 */
	EReference getUniversality_State();

	/**
	 * Returns the meta object for class '{@link hills.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence</em>'.
	 * @see hills.Precedence
	 * @generated
	 */
	EClass getPrecedence();

	/**
	 * Returns the meta object for class '{@link hills.SingleCause <em>Single Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Cause</em>'.
	 * @see hills.SingleCause
	 * @generated
	 */
	EClass getSingleCause();

	/**
	 * Returns the meta object for the reference '{@link hills.SingleCause#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Causes</em>'.
	 * @see hills.SingleCause#getCauses()
	 * @see #getSingleCause()
	 * @generated
	 */
	EReference getSingleCause_Causes();

	/**
	 * Returns the meta object for the reference list '{@link hills.SingleCause#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Effects</em>'.
	 * @see hills.SingleCause#getEffects()
	 * @see #getSingleCause()
	 * @generated
	 */
	EReference getSingleCause_Effects();

	/**
	 * Returns the meta object for class '{@link hills.Existence <em>Existence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existence</em>'.
	 * @see hills.Existence
	 * @generated
	 */
	EClass getExistence();

	/**
	 * Returns the meta object for the reference '{@link hills.Existence#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see hills.Existence#getState()
	 * @see #getExistence()
	 * @generated
	 */
	EReference getExistence_State();

	/**
	 * Returns the meta object for class '{@link hills.Absence <em>Absence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Absence</em>'.
	 * @see hills.Absence
	 * @generated
	 */
	EClass getAbsence();

	/**
	 * Returns the meta object for the reference '{@link hills.Absence#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>State</em>'.
	 * @see hills.Absence#getState()
	 * @see #getAbsence()
	 * @generated
	 */
	EReference getAbsence_State();

	/**
	 * Returns the meta object for class '{@link hills.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposition</em>'.
	 * @see hills.Proposition
	 * @generated
	 */
	EClass getProposition();

	/**
	 * Returns the meta object for class '{@link hills.Predicat <em>Predicat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predicat</em>'.
	 * @see hills.Predicat
	 * @generated
	 */
	EClass getPredicat();

	/**
	 * Returns the meta object for class '{@link hills.Before <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Before</em>'.
	 * @see hills.Before
	 * @generated
	 */
	EClass getBefore();

	/**
	 * Returns the meta object for the reference '{@link hills.Before#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delimiter</em>'.
	 * @see hills.Before#getDelimiter()
	 * @see #getBefore()
	 * @generated
	 */
	EReference getBefore_Delimiter();

	/**
	 * Returns the meta object for class '{@link hills.After <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After</em>'.
	 * @see hills.After
	 * @generated
	 */
	EClass getAfter();

	/**
	 * Returns the meta object for the reference '{@link hills.After#getDelimiter <em>Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Delimiter</em>'.
	 * @see hills.After#getDelimiter()
	 * @see #getAfter()
	 * @generated
	 */
	EReference getAfter_Delimiter();

	/**
	 * Returns the meta object for class '{@link hills.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global</em>'.
	 * @see hills.Global
	 * @generated
	 */
	EClass getGlobal();

	/**
	 * Returns the meta object for class '{@link hills.AfterUntil <em>After Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>After Until</em>'.
	 * @see hills.AfterUntil
	 * @generated
	 */
	EClass getAfterUntil();

	/**
	 * Returns the meta object for the reference '{@link hills.AfterUntil#getStartDelimiter <em>Start Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Delimiter</em>'.
	 * @see hills.AfterUntil#getStartDelimiter()
	 * @see #getAfterUntil()
	 * @generated
	 */
	EReference getAfterUntil_StartDelimiter();

	/**
	 * Returns the meta object for the reference '{@link hills.AfterUntil#getEndDelimiter <em>End Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Delimiter</em>'.
	 * @see hills.AfterUntil#getEndDelimiter()
	 * @see #getAfterUntil()
	 * @generated
	 */
	EReference getAfterUntil_EndDelimiter();

	/**
	 * Returns the meta object for class '{@link hills.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see hills.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for class '{@link hills.Between <em>Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Between</em>'.
	 * @see hills.Between
	 * @generated
	 */
	EClass getBetween();

	/**
	 * Returns the meta object for the reference '{@link hills.Between#getStartDelimiter <em>Start Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start Delimiter</em>'.
	 * @see hills.Between#getStartDelimiter()
	 * @see #getBetween()
	 * @generated
	 */
	EReference getBetween_StartDelimiter();

	/**
	 * Returns the meta object for the reference '{@link hills.Between#getEndDelimiter <em>End Delimiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End Delimiter</em>'.
	 * @see hills.Between#getEndDelimiter()
	 * @see #getBetween()
	 * @generated
	 */
	EReference getBetween_EndDelimiter();

	/**
	 * Returns the meta object for class '{@link hills.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see hills.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for class '{@link hills.Next <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Next</em>'.
	 * @see hills.Next
	 * @generated
	 */
	EClass getNext();

	/**
	 * Returns the meta object for class '{@link hills.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency</em>'.
	 * @see hills.Concurrency
	 * @generated
	 */
	EClass getConcurrency();

	/**
	 * Returns the meta object for class '{@link hills.TLLien <em>TL Lien</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TL Lien</em>'.
	 * @see hills.TLLien
	 * @generated
	 */
	EClass getTLLien();

	/**
	 * Returns the meta object for the attribute '{@link hills.TLLien#getTll <em>Tll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tll</em>'.
	 * @see hills.TLLien#getTll()
	 * @see #getTLLien()
	 * @generated
	 */
	EAttribute getTLLien_Tll();

	/**
	 * Returns the meta object for the reference '{@link hills.TLLien#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see hills.TLLien#getSource()
	 * @see #getTLLien()
	 * @generated
	 */
	EReference getTLLien_Source();

	/**
	 * Returns the meta object for the reference '{@link hills.TLLien#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hills.TLLien#getTarget()
	 * @see #getTLLien()
	 * @generated
	 */
	EReference getTLLien_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HillsFactory getHillsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hills.impl.HSpecificationImpl <em>HSpecification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.HSpecificationImpl
		 * @see hills.impl.HillsPackageImpl#getHSpecification()
		 * @generated
		 */
		EClass HSPECIFICATION = eINSTANCE.getHSpecification();

		/**
		 * The meta object literal for the '<em><b>Nom Modele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSPECIFICATION__NOM_MODELE = eINSTANCE.getHSpecification_NomModele();

		/**
		 * The meta object literal for the '<em><b>Descrip Modele</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HSPECIFICATION__DESCRIP_MODELE = eINSTANCE.getHSpecification_DescripModele();

		/**
		 * The meta object literal for the '<em><b>Composants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPECIFICATION__COMPOSANTS = eINSTANCE.getHSpecification_Composants();

		/**
		 * The meta object literal for the '<em><b>Liens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPECIFICATION__LIENS = eINSTANCE.getHSpecification_Liens();

		/**
		 * The meta object literal for the '<em><b>Hspecification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPECIFICATION__HSPECIFICATION = eINSTANCE.getHSpecification_Hspecification();

		/**
		 * The meta object literal for the '<em><b>Generic Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPECIFICATION__GENERIC_NODES = eINSTANCE.getHSpecification_GenericNodes();

		/**
		 * The meta object literal for the '<em><b>Requirement Specification</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSPECIFICATION__REQUIREMENT_SPECIFICATION = eINSTANCE.getHSpecification_RequirementSpecification();

		/**
		 * The meta object literal for the '{@link hills.impl.NommeImpl <em>Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.NommeImpl
		 * @see hills.impl.HillsPackageImpl#getNomme()
		 * @generated
		 */
		EClass NOMME = eINSTANCE.getNomme();

		/**
		 * The meta object literal for the '<em><b>Ntime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOMME__NTIME = eINSTANCE.getNomme_Ntime();

		/**
		 * The meta object literal for the '{@link hills.impl.HClassifierImpl <em>HClassifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.HClassifierImpl
		 * @see hills.impl.HillsPackageImpl#getHClassifier()
		 * @generated
		 */
		EClass HCLASSIFIER = eINSTANCE.getHClassifier();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCLASSIFIER__PORTS = eINSTANCE.getHClassifier_Ports();

		/**
		 * The meta object literal for the '{@link hills.impl.HSystemImpl <em>HSystem</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.HSystemImpl
		 * @see hills.impl.HillsPackageImpl#getHSystem()
		 * @generated
		 */
		EClass HSYSTEM = eINSTANCE.getHSystem();

		/**
		 * The meta object literal for the '<em><b>Declaratios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSYSTEM__DECLARATIOS = eINSTANCE.getHSystem_Declaratios();

		/**
		 * The meta object literal for the '<em><b>Fonctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSYSTEM__FONCTIONS = eINSTANCE.getHSystem_Fonctions();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSYSTEM__CONFIGURATIONS = eINSTANCE.getHSystem_Configurations();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSYSTEM__TRANSITIONS = eINSTANCE.getHSystem_Transitions();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HSYSTEM__CONDITIONS = eINSTANCE.getHSystem_Conditions();

		/**
		 * The meta object literal for the '{@link hills.impl.HClassImpl <em>HClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.HClassImpl
		 * @see hills.impl.HillsPackageImpl#getHClass()
		 * @generated
		 */
		EClass HCLASS = eINSTANCE.getHClass();

		/**
		 * The meta object literal for the '<em><b>Declaratios</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCLASS__DECLARATIOS = eINSTANCE.getHClass_Declaratios();

		/**
		 * The meta object literal for the '<em><b>Fonctions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HCLASS__FONCTIONS = eINSTANCE.getHClass_Fonctions();

		/**
		 * The meta object literal for the '{@link hills.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PortImpl
		 * @see hills.impl.HillsPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Pname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PNAME = eINSTANCE.getPort_Pname();

		/**
		 * The meta object literal for the '<em><b>Othername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__OTHERNAME = eINSTANCE.getPort_Othername();

		/**
		 * The meta object literal for the '<em><b>Entree Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__ENTREE_PORTS = eINSTANCE.getPort_EntreePorts();

		/**
		 * The meta object literal for the '{@link hills.impl.PortDeclarationImpl <em>Port Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PortDeclarationImpl
		 * @see hills.impl.HillsPackageImpl#getPortDeclaration()
		 * @generated
		 */
		EClass PORT_DECLARATION = eINSTANCE.getPortDeclaration();

		/**
		 * The meta object literal for the '<em><b>Pdeclaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_DECLARATION__PDECLARATION = eINSTANCE.getPortDeclaration_Pdeclaration();

		/**
		 * The meta object literal for the '{@link hills.impl.GenericNodeImpl <em>Generic Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.GenericNodeImpl
		 * @see hills.impl.HillsPackageImpl#getGenericNode()
		 * @generated
		 */
		EClass GENERIC_NODE = eINSTANCE.getGenericNode();

		/**
		 * The meta object literal for the '{@link hills.impl.LienImpl <em>Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.LienImpl
		 * @see hills.impl.HillsPackageImpl#getLien()
		 * @generated
		 */
		EClass LIEN = eINSTANCE.getLien();

		/**
		 * The meta object literal for the '<em><b>Llabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEN__LLABEL = eINSTANCE.getLien_Llabel();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__SOURCE = eINSTANCE.getLien_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEN__TARGET = eINSTANCE.getLien_Target();

		/**
		 * The meta object literal for the '{@link hills.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.CompositionImpl
		 * @see hills.impl.HillsPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link hills.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.AggregationImpl
		 * @see hills.impl.HillsPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link hills.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ReferenceImpl
		 * @see hills.impl.HillsPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '{@link hills.impl.ConfNommeImpl <em>Conf Nomme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ConfNommeImpl
		 * @see hills.impl.HillsPackageImpl#getConfNomme()
		 * @generated
		 */
		EClass CONF_NOMME = eINSTANCE.getConfNomme();

		/**
		 * The meta object literal for the '<em><b>Libelle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONF_NOMME__LIBELLE = eINSTANCE.getConfNomme_Libelle();

		/**
		 * The meta object literal for the '{@link hills.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ConfigurationImpl
		 * @see hills.impl.HillsPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '{@link hills.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.TransitionImpl
		 * @see hills.impl.HillsPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '{@link hills.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.DeclarationImpl
		 * @see hills.impl.HillsPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '<em><b>Ename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECLARATION__ENAME = eINSTANCE.getDeclaration_Ename();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__DECLARATIONS = eINSTANCE.getDeclaration_Declarations();

		/**
		 * The meta object literal for the '<em><b>Predicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECLARATION__PREDICATS = eINSTANCE.getDeclaration_Predicats();

		/**
		 * The meta object literal for the '{@link hills.impl.FiniteConfigurationImpl <em>Finite Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.FiniteConfigurationImpl
		 * @see hills.impl.HillsPackageImpl#getFiniteConfiguration()
		 * @generated
		 */
		EClass FINITE_CONFIGURATION = eINSTANCE.getFiniteConfiguration();

		/**
		 * The meta object literal for the '<em><b>Proprietes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_CONFIGURATION__PROPRIETES = eINSTANCE.getFiniteConfiguration_Proprietes();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_CONFIGURATION__ACTIVITES = eINSTANCE.getFiniteConfiguration_Activites();

		/**
		 * The meta object literal for the '<em><b>Soj Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINITE_CONFIGURATION__SOJ_TIME = eINSTANCE.getFiniteConfiguration_SojTime();

		/**
		 * The meta object literal for the '{@link hills.impl.InitialConfigurationImpl <em>Initial Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.InitialConfigurationImpl
		 * @see hills.impl.HillsPackageImpl#getInitialConfiguration()
		 * @generated
		 */
		EClass INITIAL_CONFIGURATION = eINSTANCE.getInitialConfiguration();

		/**
		 * The meta object literal for the '{@link hills.impl.PassiveConfigurationImpl <em>Passive Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PassiveConfigurationImpl
		 * @see hills.impl.HillsPackageImpl#getPassiveConfiguration()
		 * @generated
		 */
		EClass PASSIVE_CONFIGURATION = eINSTANCE.getPassiveConfiguration();

		/**
		 * The meta object literal for the '<em><b>Proprietes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_CONFIGURATION__PROPRIETES = eINSTANCE.getPassiveConfiguration_Proprietes();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSIVE_CONFIGURATION__ACTIVITES = eINSTANCE.getPassiveConfiguration_Activites();

		/**
		 * The meta object literal for the '{@link hills.impl.TransientConfigurationImpl <em>Transient Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.TransientConfigurationImpl
		 * @see hills.impl.HillsPackageImpl#getTransientConfiguration()
		 * @generated
		 */
		EClass TRANSIENT_CONFIGURATION = eINSTANCE.getTransientConfiguration();

		/**
		 * The meta object literal for the '<em><b>Proprietes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_CONFIGURATION__PROPRIETES = eINSTANCE.getTransientConfiguration_Proprietes();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSIENT_CONFIGURATION__ACTIVITES = eINSTANCE.getTransientConfiguration_Activites();

		/**
		 * The meta object literal for the '{@link hills.impl.ConfluentTransitionImpl <em>Confluent Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ConfluentTransitionImpl
		 * @see hills.impl.HillsPackageImpl#getConfluentTransition()
		 * @generated
		 */
		EClass CONFLUENT_TRANSITION = eINSTANCE.getConfluentTransition();

		/**
		 * The meta object literal for the '<em><b>Ctname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFLUENT_TRANSITION__CTNAME = eINSTANCE.getConfluentTransition_Ctname();

		/**
		 * The meta object literal for the '{@link hills.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.InternalTransitionImpl
		 * @see hills.impl.HillsPackageImpl#getInternalTransition()
		 * @generated
		 */
		EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

		/**
		 * The meta object literal for the '<em><b>Itname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERNAL_TRANSITION__ITNAME = eINSTANCE.getInternalTransition_Itname();

		/**
		 * The meta object literal for the '{@link hills.impl.ExternalTransitionImpl <em>External Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ExternalTransitionImpl
		 * @see hills.impl.HillsPackageImpl#getExternalTransition()
		 * @generated
		 */
		EClass EXTERNAL_TRANSITION = eINSTANCE.getExternalTransition();

		/**
		 * The meta object literal for the '<em><b>Etname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_TRANSITION__ETNAME = eINSTANCE.getExternalTransition_Etname();

		/**
		 * The meta object literal for the '{@link hills.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.FunctionImpl
		 * @see hills.impl.HillsPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Fname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__FNAME = eINSTANCE.getFunction_Fname();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__DECLARATIONS = eINSTANCE.getFunction_Declarations();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PPREDICATS = eINSTANCE.getFunction_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PropertyImpl
		 * @see hills.impl.HillsPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Prname1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PRNAME1 = eINSTANCE.getProperty_Prname1();

		/**
		 * The meta object literal for the '<em><b>Prname2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__PRNAME2 = eINSTANCE.getProperty_Prname2();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY__PPREDICATS = eINSTANCE.getProperty_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.ActivityImpl <em>Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ActivityImpl
		 * @see hills.impl.HillsPackageImpl#getActivity()
		 * @generated
		 */
		EClass ACTIVITY = eINSTANCE.getActivity();

		/**
		 * The meta object literal for the '<em><b>Acname1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACNAME1 = eINSTANCE.getActivity_Acname1();

		/**
		 * The meta object literal for the '<em><b>Acname2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITY__ACNAME2 = eINSTANCE.getActivity_Acname2();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY__PPREDICATS = eINSTANCE.getActivity_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.SojournTimeImpl <em>Sojourn Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.SojournTimeImpl
		 * @see hills.impl.HillsPackageImpl#getSojournTime()
		 * @generated
		 */
		EClass SOJOURN_TIME = eINSTANCE.getSojournTime();

		/**
		 * The meta object literal for the '<em><b>Stime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOJOURN_TIME__STIME = eINSTANCE.getSojournTime_Stime();

		/**
		 * The meta object literal for the '{@link hills.impl.TestNodeImpl <em>Test Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.TestNodeImpl
		 * @see hills.impl.HillsPackageImpl#getTestNode()
		 * @generated
		 */
		EClass TEST_NODE = eINSTANCE.getTestNode();

		/**
		 * The meta object literal for the '<em><b>Ttime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_NODE__TTIME = eINSTANCE.getTestNode_Ttime();

		/**
		 * The meta object literal for the '<em><b>Contenu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_NODE__CONTENU = eINSTANCE.getTestNode_Contenu();

		/**
		 * The meta object literal for the '{@link hills.impl.HRequirementSpecificationImpl <em>HRequirement Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.HRequirementSpecificationImpl
		 * @see hills.impl.HillsPackageImpl#getHRequirementSpecification()
		 * @generated
		 */
		EClass HREQUIREMENT_SPECIFICATION = eINSTANCE.getHRequirementSpecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HREQUIREMENT_SPECIFICATION__DESCRIPTION = eINSTANCE.getHRequirementSpecification_Description();

		/**
		 * The meta object literal for the '<em><b>Temporal Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HREQUIREMENT_SPECIFICATION__TEMPORAL_PROPERTIES = eINSTANCE.getHRequirementSpecification_TemporalProperties();

		/**
		 * The meta object literal for the '{@link hills.impl.BExistenceImpl <em>BExistence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.BExistenceImpl
		 * @see hills.impl.HillsPackageImpl#getBExistence()
		 * @generated
		 */
		EClass BEXISTENCE = eINSTANCE.getBExistence();

		/**
		 * The meta object literal for the '<em><b>Bename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEXISTENCE__BENAME = eINSTANCE.getBExistence_Bename();

		/**
		 * The meta object literal for the '<em><b>Predicats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEXISTENCE__PREDICATS = eINSTANCE.getBExistence_Predicats();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEXISTENCE__DECLARATIONS = eINSTANCE.getBExistence_Declarations();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEXISTENCE__PPREDICATS = eINSTANCE.getBExistence_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.UExistenceImpl <em>UExistence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.UExistenceImpl
		 * @see hills.impl.HillsPackageImpl#getUExistence()
		 * @generated
		 */
		EClass UEXISTENCE = eINSTANCE.getUExistence();

		/**
		 * The meta object literal for the '<em><b>Uename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UEXISTENCE__UENAME = eINSTANCE.getUExistence_Uename();

		/**
		 * The meta object literal for the '<em><b>Predicats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEXISTENCE__PREDICATS = eINSTANCE.getUExistence_Predicats();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEXISTENCE__DECLARATIONS = eINSTANCE.getUExistence_Declarations();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UEXISTENCE__PPREDICATS = eINSTANCE.getUExistence_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.EExistenceImpl <em>EExistence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.EExistenceImpl
		 * @see hills.impl.HillsPackageImpl#getEExistence()
		 * @generated
		 */
		EClass EEXISTENCE = eINSTANCE.getEExistence();

		/**
		 * The meta object literal for the '<em><b>Eename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EEXISTENCE__EENAME = eINSTANCE.getEExistence_Eename();

		/**
		 * The meta object literal for the '<em><b>Predicats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXISTENCE__PREDICATS = eINSTANCE.getEExistence_Predicats();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXISTENCE__DECLARATIONS = eINSTANCE.getEExistence_Declarations();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EEXISTENCE__PPREDICATS = eINSTANCE.getEExistence_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.CAbsenceImpl <em>CAbsence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.CAbsenceImpl
		 * @see hills.impl.HillsPackageImpl#getCAbsence()
		 * @generated
		 */
		EClass CABSENCE = eINSTANCE.getCAbsence();

		/**
		 * The meta object literal for the '<em><b>Caname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CABSENCE__CANAME = eINSTANCE.getCAbsence_Caname();

		/**
		 * The meta object literal for the '<em><b>Predicats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABSENCE__PREDICATS = eINSTANCE.getCAbsence_Predicats();

		/**
		 * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABSENCE__DECLARATIONS = eINSTANCE.getCAbsence_Declarations();

		/**
		 * The meta object literal for the '<em><b>Ppredicats</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CABSENCE__PPREDICATS = eINSTANCE.getCAbsence_Ppredicats();

		/**
		 * The meta object literal for the '{@link hills.impl.TLPropertyImpl <em>TL Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.TLPropertyImpl
		 * @see hills.impl.HillsPackageImpl#getTLProperty()
		 * @generated
		 */
		EClass TL_PROPERTY = eINSTANCE.getTLProperty();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_PROPERTY__PATTERN = eINSTANCE.getTLProperty_Pattern();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_PROPERTY__SCOPE = eINSTANCE.getTLProperty_Scope();

		/**
		 * The meta object literal for the '{@link hills.impl.ResponseChainImpl <em>Response Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ResponseChainImpl
		 * @see hills.impl.HillsPackageImpl#getResponseChain()
		 * @generated
		 */
		EClass RESPONSE_CHAIN = eINSTANCE.getResponseChain();

		/**
		 * The meta object literal for the '{@link hills.impl.PrecedenceChainImpl <em>Precedence Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PrecedenceChainImpl
		 * @see hills.impl.HillsPackageImpl#getPrecedenceChain()
		 * @generated
		 */
		EClass PRECEDENCE_CHAIN = eINSTANCE.getPrecedenceChain();

		/**
		 * The meta object literal for the '{@link hills.impl.BoundedExistenceImpl <em>Bounded Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.BoundedExistenceImpl
		 * @see hills.impl.HillsPackageImpl#getBoundedExistence()
		 * @generated
		 */
		EClass BOUNDED_EXISTENCE = eINSTANCE.getBoundedExistence();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_EXISTENCE__FREQUENCY = eINSTANCE.getBoundedExistence_Frequency();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_EXISTENCE__STATE = eINSTANCE.getBoundedExistence_State();

		/**
		 * The meta object literal for the '{@link hills.impl.PropertyPatternImpl <em>Property Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PropertyPatternImpl
		 * @see hills.impl.HillsPackageImpl#getPropertyPattern()
		 * @generated
		 */
		EClass PROPERTY_PATTERN = eINSTANCE.getPropertyPattern();

		/**
		 * The meta object literal for the '<em><b>Ppname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_PATTERN__PPNAME = eINSTANCE.getPropertyPattern_Ppname();

		/**
		 * The meta object literal for the '{@link hills.impl.MultiTriggerImpl <em>Multi Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.MultiTriggerImpl
		 * @see hills.impl.HillsPackageImpl#getMultiTrigger()
		 * @generated
		 */
		EClass MULTI_TRIGGER = eINSTANCE.getMultiTrigger();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_TRIGGER__TRIGGERS = eINSTANCE.getMultiTrigger_Triggers();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_TRIGGER__RESPONSE = eINSTANCE.getMultiTrigger_Response();

		/**
		 * The meta object literal for the '{@link hills.impl.SingleTriggerImpl <em>Single Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.SingleTriggerImpl
		 * @see hills.impl.HillsPackageImpl#getSingleTrigger()
		 * @generated
		 */
		EClass SINGLE_TRIGGER = eINSTANCE.getSingleTrigger();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_TRIGGER__TRIGGERS = eINSTANCE.getSingleTrigger_Triggers();

		/**
		 * The meta object literal for the '<em><b>Responses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_TRIGGER__RESPONSES = eINSTANCE.getSingleTrigger_Responses();

		/**
		 * The meta object literal for the '{@link hills.impl.MultiCauseImpl <em>Multi Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.MultiCauseImpl
		 * @see hills.impl.HillsPackageImpl#getMultiCause()
		 * @generated
		 */
		EClass MULTI_CAUSE = eINSTANCE.getMultiCause();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CAUSE__CAUSES = eINSTANCE.getMultiCause_Causes();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_CAUSE__EFFECT = eINSTANCE.getMultiCause_Effect();

		/**
		 * The meta object literal for the '{@link hills.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ResponseImpl
		 * @see hills.impl.HillsPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__TRIGGER = eINSTANCE.getResponse_Trigger();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE = eINSTANCE.getResponse_Response();

		/**
		 * The meta object literal for the '{@link hills.impl.UniversalityImpl <em>Universality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.UniversalityImpl
		 * @see hills.impl.HillsPackageImpl#getUniversality()
		 * @generated
		 */
		EClass UNIVERSALITY = eINSTANCE.getUniversality();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIVERSALITY__STATE = eINSTANCE.getUniversality_State();

		/**
		 * The meta object literal for the '{@link hills.impl.PrecedenceImpl <em>Precedence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PrecedenceImpl
		 * @see hills.impl.HillsPackageImpl#getPrecedence()
		 * @generated
		 */
		EClass PRECEDENCE = eINSTANCE.getPrecedence();

		/**
		 * The meta object literal for the '{@link hills.impl.SingleCauseImpl <em>Single Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.SingleCauseImpl
		 * @see hills.impl.HillsPackageImpl#getSingleCause()
		 * @generated
		 */
		EClass SINGLE_CAUSE = eINSTANCE.getSingleCause();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_CAUSE__CAUSES = eINSTANCE.getSingleCause_Causes();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_CAUSE__EFFECTS = eINSTANCE.getSingleCause_Effects();

		/**
		 * The meta object literal for the '{@link hills.impl.ExistenceImpl <em>Existence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ExistenceImpl
		 * @see hills.impl.HillsPackageImpl#getExistence()
		 * @generated
		 */
		EClass EXISTENCE = eINSTANCE.getExistence();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXISTENCE__STATE = eINSTANCE.getExistence_State();

		/**
		 * The meta object literal for the '{@link hills.impl.AbsenceImpl <em>Absence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.AbsenceImpl
		 * @see hills.impl.HillsPackageImpl#getAbsence()
		 * @generated
		 */
		EClass ABSENCE = eINSTANCE.getAbsence();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSENCE__STATE = eINSTANCE.getAbsence_State();

		/**
		 * The meta object literal for the '{@link hills.impl.PropositionImpl <em>Proposition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PropositionImpl
		 * @see hills.impl.HillsPackageImpl#getProposition()
		 * @generated
		 */
		EClass PROPOSITION = eINSTANCE.getProposition();

		/**
		 * The meta object literal for the '{@link hills.impl.PredicatImpl <em>Predicat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.PredicatImpl
		 * @see hills.impl.HillsPackageImpl#getPredicat()
		 * @generated
		 */
		EClass PREDICAT = eINSTANCE.getPredicat();

		/**
		 * The meta object literal for the '{@link hills.impl.BeforeImpl <em>Before</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.BeforeImpl
		 * @see hills.impl.HillsPackageImpl#getBefore()
		 * @generated
		 */
		EClass BEFORE = eINSTANCE.getBefore();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEFORE__DELIMITER = eINSTANCE.getBefore_Delimiter();

		/**
		 * The meta object literal for the '{@link hills.impl.AfterImpl <em>After</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.AfterImpl
		 * @see hills.impl.HillsPackageImpl#getAfter()
		 * @generated
		 */
		EClass AFTER = eINSTANCE.getAfter();

		/**
		 * The meta object literal for the '<em><b>Delimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER__DELIMITER = eINSTANCE.getAfter_Delimiter();

		/**
		 * The meta object literal for the '{@link hills.impl.GlobalImpl <em>Global</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.GlobalImpl
		 * @see hills.impl.HillsPackageImpl#getGlobal()
		 * @generated
		 */
		EClass GLOBAL = eINSTANCE.getGlobal();

		/**
		 * The meta object literal for the '{@link hills.impl.AfterUntilImpl <em>After Until</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.AfterUntilImpl
		 * @see hills.impl.HillsPackageImpl#getAfterUntil()
		 * @generated
		 */
		EClass AFTER_UNTIL = eINSTANCE.getAfterUntil();

		/**
		 * The meta object literal for the '<em><b>Start Delimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_UNTIL__START_DELIMITER = eINSTANCE.getAfterUntil_StartDelimiter();

		/**
		 * The meta object literal for the '<em><b>End Delimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AFTER_UNTIL__END_DELIMITER = eINSTANCE.getAfterUntil_EndDelimiter();

		/**
		 * The meta object literal for the '{@link hills.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ScopeImpl
		 * @see hills.impl.HillsPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link hills.impl.BetweenImpl <em>Between</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.BetweenImpl
		 * @see hills.impl.HillsPackageImpl#getBetween()
		 * @generated
		 */
		EClass BETWEEN = eINSTANCE.getBetween();

		/**
		 * The meta object literal for the '<em><b>Start Delimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETWEEN__START_DELIMITER = eINSTANCE.getBetween_StartDelimiter();

		/**
		 * The meta object literal for the '<em><b>End Delimiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BETWEEN__END_DELIMITER = eINSTANCE.getBetween_EndDelimiter();

		/**
		 * The meta object literal for the '{@link hills.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ImplicationImpl
		 * @see hills.impl.HillsPackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '{@link hills.impl.NextImpl <em>Next</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.NextImpl
		 * @see hills.impl.HillsPackageImpl#getNext()
		 * @generated
		 */
		EClass NEXT = eINSTANCE.getNext();

		/**
		 * The meta object literal for the '{@link hills.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.ConcurrencyImpl
		 * @see hills.impl.HillsPackageImpl#getConcurrency()
		 * @generated
		 */
		EClass CONCURRENCY = eINSTANCE.getConcurrency();

		/**
		 * The meta object literal for the '{@link hills.impl.TLLienImpl <em>TL Lien</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hills.impl.TLLienImpl
		 * @see hills.impl.HillsPackageImpl#getTLLien()
		 * @generated
		 */
		EClass TL_LIEN = eINSTANCE.getTLLien();

		/**
		 * The meta object literal for the '<em><b>Tll</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TL_LIEN__TLL = eINSTANCE.getTLLien_Tll();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_LIEN__SOURCE = eINSTANCE.getTLLien_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TL_LIEN__TARGET = eINSTANCE.getTLLien_Target();

	}

} //HillsPackage
