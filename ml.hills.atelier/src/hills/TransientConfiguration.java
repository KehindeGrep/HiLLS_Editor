/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transient Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.TransientConfiguration#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link hills.TransientConfiguration#getActivites <em>Activites</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getTransientConfiguration()
 * @model annotation="gmf.node label='libelle' figure='ellipse' label.icon='false' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface TransientConfiguration extends Configuration {
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
	 * @see hills.HillsPackage#getTransientConfiguration_Proprietes()
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
	 * @see hills.HillsPackage#getTransientConfiguration_Activites()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<Activity> getActivites();

} // TransientConfiguration
