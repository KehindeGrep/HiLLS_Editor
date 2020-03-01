/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Response#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link hills.Response#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends PropertyPattern {
	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Proposition)
	 * @see hills.HillsPackage#getResponse_Trigger()
	 * @model required="true"
	 * @generated
	 */
	Proposition getTrigger();

	/**
	 * Sets the value of the '{@link hills.Response#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Proposition value);

	/**
	 * Returns the value of the '<em><b>Response</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response</em>' reference.
	 * @see #setResponse(Proposition)
	 * @see hills.HillsPackage#getResponse_Response()
	 * @model required="true"
	 * @generated
	 */
	Proposition getResponse();

	/**
	 * Sets the value of the '{@link hills.Response#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Proposition value);

} // Response
