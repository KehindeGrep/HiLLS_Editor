/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Function#getFname <em>Fname</em>}</li>
 *   <li>{@link hills.Function#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.Function#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getFunction()
 * @model annotation="gmf.node label='fname' label.icon='false' figure='rectangle' size='100,55' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface Function extends EObject {
	/**
	 * Returns the value of the '<em><b>Fname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fname</em>' attribute.
	 * @see #setFname(String)
	 * @see hills.HillsPackage#getFunction_Fname()
	 * @model
	 * @generated
	 */
	String getFname();

	/**
	 * Sets the value of the '{@link hills.Function#getFname <em>Fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fname</em>' attribute.
	 * @see #getFname()
	 * @generated
	 */
	void setFname(String value);

	/**
	 * Returns the value of the '<em><b>Declarations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations</em>' attribute.
	 * @see #setDeclarations(String)
	 * @see hills.HillsPackage#getFunction_Declarations()
	 * @model annotation="emf.gen propertyMultiline='true'"
	 * @generated
	 */
	String getDeclarations();

	/**
	 * Sets the value of the '{@link hills.Function#getDeclarations <em>Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declarations</em>' attribute.
	 * @see #getDeclarations()
	 * @generated
	 */
	void setDeclarations(String value);

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
	 * @see hills.HillsPackage#getFunction_Ppredicats()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<PortDeclaration> getPpredicats();

} // Function
