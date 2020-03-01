/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HClassifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.HClassifier#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getHClassifier()
 * @model abstract="true"
 * @generated
 */
public interface HClassifier extends Nomme {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see hills.HillsPackage#getHClassifier_Ports()
	 * @model containment="true"
	 *        annotation="gmf.affixed layout='free'"
	 * @generated
	 */
	EList<Port> getPorts();

} // HClassifier
