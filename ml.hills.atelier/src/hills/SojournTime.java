/**
 */
package hills;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sojourn Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.SojournTime#getStime <em>Stime</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getSojournTime()
 * @model annotation="gmf.node label='stime' label.icon='false' figure='rectangle' border='none'"
 * @generated
 */
public interface SojournTime extends EObject {
	/**
	 * Returns the value of the '<em><b>Stime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stime</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stime</em>' attribute.
	 * @see #setStime(String)
	 * @see hills.HillsPackage#getSojournTime_Stime()
	 * @model
	 * @generated
	 */
	String getStime();

	/**
	 * Sets the value of the '{@link hills.SojournTime#getStime <em>Stime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stime</em>' attribute.
	 * @see #getStime()
	 * @generated
	 */
	void setStime(String value);

} // SojournTime
