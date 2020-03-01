/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nomme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Nomme#getNtime <em>Ntime</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getNomme()
 * @model abstract="true"
 * @generated
 */
public interface Nomme extends EObject {
	/**
	 * Returns the value of the '<em><b>Ntime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ntime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ntime</em>' attribute.
	 * @see #setNtime(String)
	 * @see hills.HillsPackage#getNomme_Ntime()
	 * @model
	 * @generated
	 */
	String getNtime();

	/**
	 * Sets the value of the '{@link hills.Nomme#getNtime <em>Ntime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ntime</em>' attribute.
	 * @see #getNtime()
	 * @generated
	 */
	void setNtime(String value);

} // Nomme
