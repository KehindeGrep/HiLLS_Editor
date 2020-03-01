/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.MultiTrigger#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link hills.MultiTrigger#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getMultiTrigger()
 * @model
 * @generated
 */
public interface MultiTrigger extends ResponseChain {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference list.
	 * The list contents are of type {@link hills.Proposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference list.
	 * @see hills.HillsPackage#getMultiTrigger_Triggers()
	 * @model lower="2"
	 * @generated
	 */
	EList<Proposition> getTriggers();

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
	 * @see hills.HillsPackage#getMultiTrigger_Response()
	 * @model required="true"
	 * @generated
	 */
	Proposition getResponse();

	/**
	 * Sets the value of the '{@link hills.MultiTrigger#getResponse <em>Response</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response</em>' reference.
	 * @see #getResponse()
	 * @generated
	 */
	void setResponse(Proposition value);

} // MultiTrigger
