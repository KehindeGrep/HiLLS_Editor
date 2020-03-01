/**
 */
package hills;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Port#getPname <em>Pname</em>}</li>
 *   <li>{@link hills.Port#getOthername <em>Othername</em>}</li>
 *   <li>{@link hills.Port#getEntreePorts <em>Entree Ports</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getPort()
 * @model annotation="gmf.node label='pname' figure='rectangle' size='90,60' label.icon='false' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface Port extends EObject {
	/**
	 * Returns the value of the '<em><b>Pname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pname</em>' attribute.
	 * @see #setPname(String)
	 * @see hills.HillsPackage#getPort_Pname()
	 * @model
	 * @generated
	 */
	String getPname();

	/**
	 * Sets the value of the '{@link hills.Port#getPname <em>Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pname</em>' attribute.
	 * @see #getPname()
	 * @generated
	 */
	void setPname(String value);

	/**
	 * Returns the value of the '<em><b>Othername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Othername</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Othername</em>' attribute.
	 * @see #setOthername(String)
	 * @see hills.HillsPackage#getPort_Othername()
	 * @model annotation="emf.gen propertyMultiline='true'"
	 * @generated
	 */
	String getOthername();

	/**
	 * Sets the value of the '{@link hills.Port#getOthername <em>Othername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Othername</em>' attribute.
	 * @see #getOthername()
	 * @generated
	 */
	void setOthername(String value);

	/**
	 * Returns the value of the '<em><b>Entree Ports</b></em>' containment reference list.
	 * The list contents are of type {@link hills.PortDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree Ports</em>' containment reference list.
	 * @see hills.HillsPackage#getPort_EntreePorts()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<PortDeclaration> getEntreePorts();

} // Port
