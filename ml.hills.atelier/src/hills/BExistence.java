/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BExistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.BExistence#getBename <em>Bename</em>}</li>
 *   <li>{@link hills.BExistence#getPredicats <em>Predicats</em>}</li>
 *   <li>{@link hills.BExistence#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.BExistence#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getBExistence()
 * @model annotation="gmf.node label='bename' figure='rounded' size='55,100' label.icon='false' border.width='2' border.color='0,0,0' tool.name='BExistence'"
 * @generated
 */
public interface BExistence extends TLProperty {
	/**
	 * Returns the value of the '<em><b>Bename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bename</em>' attribute.
	 * @see #setBename(String)
	 * @see hills.HillsPackage#getBExistence_Bename()
	 * @model
	 * @generated
	 */
	String getBename();

	/**
	 * Sets the value of the '{@link hills.BExistence#getBename <em>Bename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bename</em>' attribute.
	 * @see #getBename()
	 * @generated
	 */
	void setBename(String value);

	/**
	 * Returns the value of the '<em><b>Predicats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicats</em>' containment reference.
	 * @see #setPredicats(Predicat)
	 * @see hills.HillsPackage#getBExistence_Predicats()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	Predicat getPredicats();

	/**
	 * Sets the value of the '{@link hills.BExistence#getPredicats <em>Predicats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicats</em>' containment reference.
	 * @see #getPredicats()
	 * @generated
	 */
	void setPredicats(Predicat value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
	 * The list contents are of type {@link hills.PortDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' containment reference list.
	 * @see hills.HillsPackage#getBExistence_Declarations()
	 * @model containment="true"
	 *        annotation="gmf.compartement layout='free'"
	 * @generated
	 */
	EList<PortDeclaration> getDeclarations();

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
	 * @see hills.HillsPackage#getBExistence_Ppredicats()
	 * @model containment="true"
	 *        annotation="gmf.compartement layout='free'"
	 * @generated
	 */
	EList<PortDeclaration> getPpredicats();

} // BExistence
