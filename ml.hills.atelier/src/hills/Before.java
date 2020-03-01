/**
 */
package hills;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Before</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Before#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getBefore()
 * @model
 * @generated
 */
public interface Before extends Scope {
	/**
	 * Returns the value of the '<em><b>Delimiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delimiter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delimiter</em>' reference.
	 * @see #setDelimiter(Proposition)
	 * @see hills.HillsPackage#getBefore_Delimiter()
	 * @model required="true"
	 * @generated
	 */
	Proposition getDelimiter();

	/**
	 * Sets the value of the '{@link hills.Before#getDelimiter <em>Delimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delimiter</em>' reference.
	 * @see #getDelimiter()
	 * @generated
	 */
	void setDelimiter(Proposition value);

} // Before
