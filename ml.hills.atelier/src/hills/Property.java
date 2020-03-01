/**
 */
package hills;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Property#getPrname1 <em>Prname1</em>}</li>
 *   <li>{@link hills.Property#getPrname2 <em>Prname2</em>}</li>
 *   <li>{@link hills.Property#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getProperty()
 * @model annotation="gmf.node label='prname1' label.icon='false'"
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Prname1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prname1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prname1</em>' attribute.
	 * @see #setPrname1(String)
	 * @see hills.HillsPackage#getProperty_Prname1()
	 * @model
	 * @generated
	 */
	String getPrname1();

	/**
	 * Sets the value of the '{@link hills.Property#getPrname1 <em>Prname1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prname1</em>' attribute.
	 * @see #getPrname1()
	 * @generated
	 */
	void setPrname1(String value);

	/**
	 * Returns the value of the '<em><b>Prname2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prname2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prname2</em>' attribute.
	 * @see #setPrname2(String)
	 * @see hills.HillsPackage#getProperty_Prname2()
	 * @model annotation="emf.gen propertyMultiline='true'"
	 * @generated
	 */
	String getPrname2();

	/**
	 * Sets the value of the '{@link hills.Property#getPrname2 <em>Prname2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prname2</em>' attribute.
	 * @see #getPrname2()
	 * @generated
	 */
	void setPrname2(String value);

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
	 * @see hills.HillsPackage#getProperty_Ppredicats()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<PortDeclaration> getPpredicats();

} // Property
