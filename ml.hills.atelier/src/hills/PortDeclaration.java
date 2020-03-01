/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.PortDeclaration#getPdeclaration <em>Pdeclaration</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getPortDeclaration()
 * @model annotation="gmf.node label='pdeclaration' label.icon='false' figure='rectangle' size='85,25'"
 * @generated
 */
public interface PortDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Pdeclaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pdeclaration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pdeclaration</em>' attribute.
	 * @see #setPdeclaration(String)
	 * @see hills.HillsPackage#getPortDeclaration_Pdeclaration()
	 * @model
	 * @generated
	 */
	String getPdeclaration();

	/**
	 * Sets the value of the '{@link hills.PortDeclaration#getPdeclaration <em>Pdeclaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdeclaration</em>' attribute.
	 * @see #getPdeclaration()
	 * @generated
	 */
	void setPdeclaration(String value);

} // PortDeclaration
