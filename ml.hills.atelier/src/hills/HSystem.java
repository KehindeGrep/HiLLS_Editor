/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HSystem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.HSystem#getDeclaratios <em>Declaratios</em>}</li>
 *   <li>{@link hills.HSystem#getFonctions <em>Fonctions</em>}</li>
 *   <li>{@link hills.HSystem#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link hills.HSystem#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link hills.HSystem#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getHSystem()
 * @model annotation="gmf.node label='ntime' figure='rectangle' size='200,300' label.icon='false' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface HSystem extends HClassifier {
	/**
	 * Returns the value of the '<em><b>Declaratios</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaratios</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaratios</em>' containment reference list.
	 * @see hills.HillsPackage#getHSystem_Declaratios()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Declaration> getDeclaratios();

	/**
	 * Returns the value of the '<em><b>Fonctions</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fonctions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fonctions</em>' containment reference list.
	 * @see hills.HillsPackage#getHSystem_Fonctions()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Function> getFonctions();

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Configuration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see hills.HillsPackage#getHSystem_Configurations()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Configuration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see hills.HillsPackage#getHSystem_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link hills.TestNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see hills.HillsPackage#getHSystem_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestNode> getConditions();

} // HSystem
