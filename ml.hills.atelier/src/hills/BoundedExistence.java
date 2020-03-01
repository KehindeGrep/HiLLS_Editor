/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Existence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.BoundedExistence#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link hills.BoundedExistence#getState <em>State</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getBoundedExistence()
 * @model
 * @generated
 */
public interface BoundedExistence extends PropertyPattern {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see hills.HillsPackage#getBoundedExistence_Frequency()
	 * @model
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link hills.BoundedExistence#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

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
	 * @see hills.HillsPackage#getBoundedExistence_State()
	 * @model required="true"
	 * @generated
	 */
	Proposition getState();

	/**
	 * Sets the value of the '{@link hills.BoundedExistence#getState <em>State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(Proposition value);

} // BoundedExistence
