/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.FiniteConfiguration#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link hills.FiniteConfiguration#getActivites <em>Activites</em>}</li>
 *   <li>{@link hills.FiniteConfiguration#getSojTime <em>Soj Time</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getFiniteConfiguration()
 * @model annotation="gmf.node label='libelle' figure='rounded' size='55,100' label.icon='false' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface FiniteConfiguration extends Configuration {
	/**
	 * Returns the value of the '<em><b>Proprietes</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Property}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proprietes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proprietes</em>' containment reference list.
	 * @see hills.HillsPackage#getFiniteConfiguration_Proprietes()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Property> getProprietes();

	/**
	 * Returns the value of the '<em><b>Activites</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activites</em>' containment reference list.
	 * @see hills.HillsPackage#getFiniteConfiguration_Activites()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Activity> getActivites();

	/**
	 * Returns the value of the '<em><b>Soj Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soj Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soj Time</em>' containment reference.
	 * @see #setSojTime(SojournTime)
	 * @see hills.HillsPackage#getFiniteConfiguration_SojTime()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	SojournTime getSojTime();

	/**
	 * Sets the value of the '{@link hills.FiniteConfiguration#getSojTime <em>Soj Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Soj Time</em>' containment reference.
	 * @see #getSojTime()
	 * @generated
	 */
	void setSojTime(SojournTime value);

} // FiniteConfiguration
