/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.Declaration#getEname <em>Ename</em>}</li>
 *   <li>{@link hills.Declaration#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.Declaration#getPredicats <em>Predicats</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getDeclaration()
 * @model annotation="gmf.node label='ename' label.icon='false' figure='rectangle' size='55,100' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface Declaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Ename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ename</em>' attribute.
	 * @see #setEname(String)
	 * @see hills.HillsPackage#getDeclaration_Ename()
	 * @model
	 * @generated
	 */
	String getEname();

	/**
	 * Sets the value of the '{@link hills.Declaration#getEname <em>Ename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ename</em>' attribute.
	 * @see #getEname()
	 * @generated
	 */
	void setEname(String value);

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
	 * @see hills.HillsPackage#getDeclaration_Declarations()
	 * @model containment="true"
	 *        annotation="gmf.compartement layout='free'"
	 * @generated
	 */
	EList<PortDeclaration> getDeclarations();

	/**
	 * Returns the value of the '<em><b>Predicats</b></em>' containment reference list.
	 * The list contents are of type {@link hills.PortDeclaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicats</em>' containment reference list.
	 * @see hills.HillsPackage#getDeclaration_Predicats()
	 * @model containment="true"
	 *        annotation="gmf.compartement layout='free'"
	 * @generated
	 */
	EList<PortDeclaration> getPredicats();

} // Declaration
