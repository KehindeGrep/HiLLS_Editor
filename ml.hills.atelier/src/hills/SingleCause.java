/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.SingleCause#getCauses <em>Causes</em>}</li>
 *   <li>{@link hills.SingleCause#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getSingleCause()
 * @model
 * @generated
 */
public interface SingleCause extends PrecedenceChain {
	/**
	 * Returns the value of the '<em><b>Causes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' reference.
	 * @see #setCauses(Proposition)
	 * @see hills.HillsPackage#getSingleCause_Causes()
	 * @model required="true"
	 * @generated
	 */
	Proposition getCauses();

	/**
	 * Sets the value of the '{@link hills.SingleCause#getCauses <em>Causes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Causes</em>' reference.
	 * @see #getCauses()
	 * @generated
	 */
	void setCauses(Proposition value);

	/**
	 * Returns the value of the '<em><b>Effects</b></em>' reference list.
	 * The list contents are of type {@link hills.Proposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effects</em>' reference list.
	 * @see hills.HillsPackage#getSingleCause_Effects()
	 * @model lower="2"
	 * @generated
	 */
	EList<Proposition> getEffects();

} // SingleCause
