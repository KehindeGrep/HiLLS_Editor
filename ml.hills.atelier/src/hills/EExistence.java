/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EExistence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.EExistence#getEename <em>Eename</em>}</li>
 *   <li>{@link hills.EExistence#getPredicats <em>Predicats</em>}</li>
 *   <li>{@link hills.EExistence#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.EExistence#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getEExistence()
 * @model annotation="gmf.node label='eename' figure='rounded' size='55,100' label.icon='false' border.width='2' border.color='0,0,0' tool.name='EExistence'"
 * @generated
 */
public interface EExistence extends TLProperty {
	/**
	 * Returns the value of the '<em><b>Eename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eename</em>' attribute.
	 * @see #setEename(String)
	 * @see hills.HillsPackage#getEExistence_Eename()
	 * @model
	 * @generated
	 */
	String getEename();

	/**
	 * Sets the value of the '{@link hills.EExistence#getEename <em>Eename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eename</em>' attribute.
	 * @see #getEename()
	 * @generated
	 */
	void setEename(String value);

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
	 * @see hills.HillsPackage#getEExistence_Predicats()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	Predicat getPredicats();

	/**
	 * Sets the value of the '{@link hills.EExistence#getPredicats <em>Predicats</em>}' containment reference.
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
	 * @see hills.HillsPackage#getEExistence_Declarations()
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
	 * @see hills.HillsPackage#getEExistence_Ppredicats()
	 * @model containment="true"
	 *        annotation="gmf.compartement layout='free'"
	 * @generated
	 */
	EList<PortDeclaration> getPpredicats();

} // EExistence
