/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Lien#getLlabel <em>Llabel</em>}</li>
 *   <li>{@link hills.Lien#getSource <em>Source</em>}</li>
 *   <li>{@link hills.Lien#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getLien()
 * @model abstract="true"
 * @generated
 */
public interface Lien extends EObject {
	/**
	 * Returns the value of the '<em><b>Llabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Llabel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Llabel</em>' attribute.
	 * @see #setLlabel(String)
	 * @see hills.HillsPackage#getLien_Llabel()
	 * @model
	 * @generated
	 */
	String getLlabel();

	/**
	 * Sets the value of the '{@link hills.Lien#getLlabel <em>Llabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Llabel</em>' attribute.
	 * @see #getLlabel()
	 * @generated
	 */
	void setLlabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(HClassifier)
	 * @see hills.HillsPackage#getLien_Source()
	 * @model
	 * @generated
	 */
	HClassifier getSource();

	/**
	 * Sets the value of the '{@link hills.Lien#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(HClassifier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Nomme)
	 * @see hills.HillsPackage#getLien_Target()
	 * @model
	 * @generated
	 */
	Nomme getTarget();

	/**
	 * Sets the value of the '{@link hills.Lien#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Nomme value);

} // Lien
