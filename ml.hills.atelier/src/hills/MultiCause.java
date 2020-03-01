/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.MultiCause#getCauses <em>Causes</em>}</li>
 *   <li>{@link hills.MultiCause#getEffect <em>Effect</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getMultiCause()
 * @model
 * @generated
 */
public interface MultiCause extends PrecedenceChain {
	/**
	 * Returns the value of the '<em><b>Causes</b></em>' reference list.
	 * The list contents are of type {@link hills.Proposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Causes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' reference list.
	 * @see hills.HillsPackage#getMultiCause_Causes()
	 * @model lower="2"
	 * @generated
	 */
	EList<Proposition> getCauses();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' reference.
	 * @see #setEffect(Proposition)
	 * @see hills.HillsPackage#getMultiCause_Effect()
	 * @model required="true"
	 * @generated
	 */
	Proposition getEffect();

	/**
	 * Sets the value of the '{@link hills.MultiCause#getEffect <em>Effect</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(Proposition value);

} // MultiCause
