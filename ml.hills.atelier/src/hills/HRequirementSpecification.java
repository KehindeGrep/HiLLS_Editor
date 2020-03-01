/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HRequirement Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.HRequirementSpecification#getDescription <em>Description</em>}</li>
 *   <li>{@link hills.HRequirementSpecification#getTemporalProperties <em>Temporal Properties</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getHRequirementSpecification()
 * @model annotation="gmf.node label='ntime' label.icon='false' figure='rectangle' size='100,55' border.width='2' border.color='0,0,0'"
 * @generated
 */
public interface HRequirementSpecification extends Nomme {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see hills.HillsPackage#getHRequirementSpecification_Description()
	 * @model annotation="emf.gen propertyMultiline='true'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link hills.HRequirementSpecification#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Temporal Properties</b></em>' containment reference list.
	 * The list contents are of type {@link hills.TLProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temporal Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporal Properties</em>' containment reference list.
	 * @see hills.HillsPackage#getHRequirementSpecification_TemporalProperties()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='free'"
	 * @generated
	 */
	EList<TLProperty> getTemporalProperties();

} // HRequirementSpecification
