/**
 */
package hills;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HSpecification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hills.HSpecification#getNomModele <em>Nom Modele</em>}</li>
 *   <li>{@link hills.HSpecification#getDescripModele <em>Descrip Modele</em>}</li>
 *   <li>{@link hills.HSpecification#getComposants <em>Composants</em>}</li>
 *   <li>{@link hills.HSpecification#getLiens <em>Liens</em>}</li>
 *   <li>{@link hills.HSpecification#getHspecification <em>Hspecification</em>}</li>
 *   <li>{@link hills.HSpecification#getGenericNodes <em>Generic Nodes</em>}</li>
 *   <li>{@link hills.HSpecification#getRequirementSpecification <em>Requirement Specification</em>}</li>
 * </ul>
 *
 * @see hills.HillsPackage#getHSpecification()
 * @model annotation="gmf.diagram model.extension='hills' diagram.extension='dhills'"
 * @generated
 */
public interface HSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Nom Modele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom Modele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Modele</em>' attribute.
	 * @see #setNomModele(String)
	 * @see hills.HillsPackage#getHSpecification_NomModele()
	 * @model
	 * @generated
	 */
	String getNomModele();

	/**
	 * Sets the value of the '{@link hills.HSpecification#getNomModele <em>Nom Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Modele</em>' attribute.
	 * @see #getNomModele()
	 * @generated
	 */
	void setNomModele(String value);

	/**
	 * Returns the value of the '<em><b>Descrip Modele</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descrip Modele</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descrip Modele</em>' attribute.
	 * @see #setDescripModele(String)
	 * @see hills.HillsPackage#getHSpecification_DescripModele()
	 * @model
	 * @generated
	 */
	String getDescripModele();

	/**
	 * Sets the value of the '{@link hills.HSpecification#getDescripModele <em>Descrip Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descrip Modele</em>' attribute.
	 * @see #getDescripModele()
	 * @generated
	 */
	void setDescripModele(String value);

	/**
	 * Returns the value of the '<em><b>Composants</b></em>' containment reference list.
	 * The list contents are of type {@link hills.HClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composants</em>' containment reference list.
	 * @see hills.HillsPackage#getHSpecification_Composants()
	 * @model containment="true"
	 * @generated
	 */
	EList<HClassifier> getComposants();

	/**
	 * Returns the value of the '<em><b>Liens</b></em>' containment reference list.
	 * The list contents are of type {@link hills.Lien}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens</em>' containment reference list.
	 * @see hills.HillsPackage#getHSpecification_Liens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Lien> getLiens();

	/**
	 * Returns the value of the '<em><b>Hspecification</b></em>' containment reference list.
	 * The list contents are of type {@link hills.HSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hspecification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hspecification</em>' containment reference list.
	 * @see hills.HillsPackage#getHSpecification_Hspecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<HSpecification> getHspecification();

	/**
	 * Returns the value of the '<em><b>Generic Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link hills.GenericNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Nodes</em>' containment reference list.
	 * @see hills.HillsPackage#getHSpecification_GenericNodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<GenericNode> getGenericNodes();

	/**
	 * Returns the value of the '<em><b>Requirement Specification</b></em>' containment reference list.
	 * The list contents are of type {@link hills.HRequirementSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Specification</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Specification</em>' containment reference list.
	 * @see hills.HillsPackage#getHSpecification_RequirementSpecification()
	 * @model containment="true"
	 * @generated
	 */
	EList<HRequirementSpecification> getRequirementSpecification();

} // HSpecification
