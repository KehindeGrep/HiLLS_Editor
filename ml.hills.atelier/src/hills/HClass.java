/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.HClass#getDeclaratios <em>Declaratios</em>}</li>
 *   <li>{@link hills.HClass#getFonctions <em>Fonctions</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getHClass()
 * @model annotation="gmf.node label='ntime' figure='rectangle' size='150,180' label.icon='false' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface HClass extends HClassifier {
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
	 * @see hills.HillsPackage#getHClass_Declaratios()
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
	 * @see hills.HillsPackage#getHClass_Fonctions()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Function> getFonctions();

} // HClass
