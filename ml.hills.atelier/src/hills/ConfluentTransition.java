/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Confluent Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.ConfluentTransition#getCtname <em>Ctname</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getConfluentTransition()
 * @model annotation="gmf.link source='source' target='target' style='dot' target.decoration='arrow' label.icon='false' color='0,0,0' border.width='3' label='ctname'"
 * @generated
 */
public interface ConfluentTransition extends Transition {
	/**
	 * Returns the value of the '<em><b>Ctname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ctname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ctname</em>' attribute.
	 * @see #setCtname(String)
	 * @see hills.HillsPackage#getConfluentTransition_Ctname()
	 * @model
	 * @generated
	 */
	String getCtname();

	/**
	 * Sets the value of the '{@link hills.ConfluentTransition#getCtname <em>Ctname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ctname</em>' attribute.
	 * @see #getCtname()
	 * @generated
	 */
	void setCtname(String value);

} // ConfluentTransition
