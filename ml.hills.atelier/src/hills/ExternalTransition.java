/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.ExternalTransition#getEtname <em>Etname</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getExternalTransition()
 * @model annotation="gmf.link source='source' target='target' style='dash' target.decoration='arrow' color='0,0,0' border.width='3' label='etname'"
 * @generated
 */
public interface ExternalTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Etname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etname</em>' attribute.
	 * @see #setEtname(String)
	 * @see hills.HillsPackage#getExternalTransition_Etname()
	 * @model
	 * @generated
	 */
	String getEtname();

	/**
	 * Sets the value of the '{@link hills.ExternalTransition#getEtname <em>Etname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etname</em>' attribute.
	 * @see #getEtname()
	 * @generated
	 */
	void setEtname(String value);

} // ExternalTransition
