/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.SingleTrigger#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link hills.SingleTrigger#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getSingleTrigger()
 * @model
 * @generated
 */
public interface SingleTrigger extends ResponseChain {
	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' reference.
	 * @see #setTriggers(Proposition)
	 * @see hills.HillsPackage#getSingleTrigger_Triggers()
	 * @model required="true"
	 * @generated
	 */
	Proposition getTriggers();

	/**
	 * Sets the value of the '{@link hills.SingleTrigger#getTriggers <em>Triggers</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggers</em>' reference.
	 * @see #getTriggers()
	 * @generated
	 */
	void setTriggers(Proposition value);

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' reference list.
	 * The list contents are of type {@link hills.Proposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' reference list.
	 * @see hills.HillsPackage#getSingleTrigger_Responses()
	 * @model lower="2"
	 * @generated
	 */
	EList<Proposition> getResponses();

} // SingleTrigger
