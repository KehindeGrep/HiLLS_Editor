/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Absence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Absence#getState <em>State</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getAbsence()
 * @model
 * @generated
 */
public interface Absence extends PropertyPattern {
	/**
	 * Returns the value of the '<em><b>State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' reference.
	 * @see #setState(Proposition)
	 * @see hills.HillsPackage#getAbsence_State()
	 * @model required="true"
	 * @generated
	 */
	Proposition getState();

	/**
	 * Sets the value of the '{@link hills.Absence#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(Proposition value);

} // Absence
