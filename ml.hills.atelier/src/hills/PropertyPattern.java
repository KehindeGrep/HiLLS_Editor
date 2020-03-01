/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.PropertyPattern#getPpname <em>Ppname</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getPropertyPattern()
 * @model
 * @generated
 */
public interface PropertyPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Ppname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ppname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ppname</em>' attribute.
	 * @see #setPpname(String)
	 * @see hills.HillsPackage#getPropertyPattern_Ppname()
	 * @model
	 * @generated
	 */
	String getPpname();

	/**
	 * Sets the value of the '{@link hills.PropertyPattern#getPpname <em>Ppname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ppname</em>' attribute.
	 * @see #getPpname()
	 * @generated
	 */
	void setPpname(String value);

} // PropertyPattern
