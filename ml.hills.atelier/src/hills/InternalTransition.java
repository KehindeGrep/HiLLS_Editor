/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.InternalTransition#getItname <em>Itname</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getInternalTransition()
 * @model annotation="gmf.link source='source' target='target' style='solid' target.decoration='arrow' color='0,0,0' border.width='3' label='itname'"
 * @generated
 */
public interface InternalTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Itname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itname</em>' attribute.
	 * @see #setItname(String)
	 * @see hills.HillsPackage#getInternalTransition_Itname()
	 * @model
	 * @generated
	 */
	String getItname();

	/**
	 * Sets the value of the '{@link hills.InternalTransition#getItname <em>Itname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itname</em>' attribute.
	 * @see #getItname()
	 * @generated
	 */
	void setItname(String value);

} // InternalTransition
