/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conf Nomme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.ConfNomme#getLibelle <em>Libelle</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getConfNomme()
 * @model abstract="true"
 * @generated
 */
public interface ConfNomme extends EObject {
	/**
	 * Returns the value of the '<em><b>Libelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Libelle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Libelle</em>' attribute.
	 * @see #setLibelle(String)
	 * @see hills.HillsPackage#getConfNomme_Libelle()
	 * @model
	 * @generated
	 */
	String getLibelle();

	/**
	 * Sets the value of the '{@link hills.ConfNomme#getLibelle <em>Libelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Libelle</em>' attribute.
	 * @see #getLibelle()
	 * @generated
	 */
	void setLibelle(String value);

} // ConfNomme
