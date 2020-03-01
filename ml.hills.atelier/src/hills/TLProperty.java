/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TL Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.TLProperty#getPattern <em>Pattern</em>}</li>
 *   <li>{@link hills.TLProperty#getScope <em>Scope</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getTLProperty()
 * @model
 * @generated
 */
public interface TLProperty extends EObject {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' reference.
	 * @see #setPattern(PropertyPattern)
	 * @see hills.HillsPackage#getTLProperty_Pattern()
	 * @model required="true"
	 * @generated
	 */
	PropertyPattern getPattern();

	/**
	 * Sets the value of the '{@link hills.TLProperty#getPattern <em>Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' reference.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(PropertyPattern value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' reference.
	 * @see #setScope(Scope)
	 * @see hills.HillsPackage#getTLProperty_Scope()
	 * @model required="true"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link hills.TLProperty#getScope <em>Scope</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' reference.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

} // TLProperty
