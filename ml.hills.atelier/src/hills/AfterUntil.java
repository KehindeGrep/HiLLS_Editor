/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Until</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.AfterUntil#getStartDelimiter <em>Start Delimiter</em>}</li>
 *   <li>{@link hills.AfterUntil#getEndDelimiter <em>End Delimiter</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getAfterUntil()
 * @model
 * @generated
 */
public interface AfterUntil extends Scope {
	/**
	 * Returns the value of the '<em><b>Start Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Delimiter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Delimiter</em>' reference.
	 * @see #setStartDelimiter(Proposition)
	 * @see hills.HillsPackage#getAfterUntil_StartDelimiter()
	 * @model required="true"
	 * @generated
	 */
	Proposition getStartDelimiter();

	/**
	 * Sets the value of the '{@link hills.AfterUntil#getStartDelimiter <em>Start Delimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Delimiter</em>' reference.
	 * @see #getStartDelimiter()
	 * @generated
	 */
	void setStartDelimiter(Proposition value);

	/**
	 * Returns the value of the '<em><b>End Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Delimiter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Delimiter</em>' reference.
	 * @see #setEndDelimiter(Proposition)
	 * @see hills.HillsPackage#getAfterUntil_EndDelimiter()
	 * @model required="true"
	 * @generated
	 */
	Proposition getEndDelimiter();

	/**
	 * Sets the value of the '{@link hills.AfterUntil#getEndDelimiter <em>End Delimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Delimiter</em>' reference.
	 * @see #getEndDelimiter()
	 * @generated
	 */
	void setEndDelimiter(Proposition value);

} // AfterUntil
