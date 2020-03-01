/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Lien</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.TLLien#getTll <em>Tll</em>}</li>
 *   <li>{@link hills.TLLien#getSource <em>Source</em>}</li>
 *   <li>{@link hills.TLLien#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getTLLien()
 * @model abstract="true"
 * @generated
 */
public interface TLLien extends EObject {
	/**
	 * Returns the value of the '<em><b>Tll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tll</em>' attribute.
	 * @see #setTll(String)
	 * @see hills.HillsPackage#getTLLien_Tll()
	 * @model
	 * @generated
	 */
	String getTll();

	/**
	 * Sets the value of the '{@link hills.TLLien#getTll <em>Tll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tll</em>' attribute.
	 * @see #getTll()
	 * @generated
	 */
	void setTll(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TLProperty)
	 * @see hills.HillsPackage#getTLLien_Source()
	 * @model
	 * @generated
	 */
	TLProperty getSource();

	/**
	 * Sets the value of the '{@link hills.TLLien#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TLProperty value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TLProperty)
	 * @see hills.HillsPackage#getTLLien_Target()
	 * @model
	 * @generated
	 */
	TLProperty getTarget();

	/**
	 * Sets the value of the '{@link hills.TLLien#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TLProperty value);

} // TLLien
