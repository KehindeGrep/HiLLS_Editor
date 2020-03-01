/**
 */
package hills;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Activity#getAcname1 <em>Acname1</em>}</li>
 *   <li>{@link hills.Activity#getAcname2 <em>Acname2</em>}</li>
 *   <li>{@link hills.Activity#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getActivity()
 * @model annotation="gmf.node label='acname1' label.icon='false'"
 * @generated
 */
public interface Activity extends EObject {
	/**
	 * Returns the value of the '<em><b>Acname1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acname1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acname1</em>' attribute.
	 * @see #setAcname1(String)
	 * @see hills.HillsPackage#getActivity_Acname1()
	 * @model
	 * @generated
	 */
	String getAcname1();

	/**
	 * Sets the value of the '{@link hills.Activity#getAcname1 <em>Acname1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acname1</em>' attribute.
	 * @see #getAcname1()
	 * @generated
	 */
	void setAcname1(String value);

	/**
	 * Returns the value of the '<em><b>Acname2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acname2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acname2</em>' attribute.
	 * @see #setAcname2(String)
	 * @see hills.HillsPackage#getActivity_Acname2()
	 * @model annotation="emf.gen propertyMultiline='true'"
	 * @generated
	 */
	String getAcname2();

	/**
	 * Sets the value of the '{@link hills.Activity#getAcname2 <em>Acname2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acname2</em>' attribute.
	 * @see #getAcname2()
	 * @generated
	 */
	void setAcname2(String value);

	/**
	 * Returns the value of the '<em><b>Ppredicats</b></em>' containment reference list.
	 * The list contents are of type {@link hills.PortDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ppredicats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ppredicats</em>' containment reference list.
	 * @see hills.HillsPackage#getActivity_Ppredicats()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<PortDeclaration> getPpredicats();

} // Activity
