/**
 */
package hills.impl;

import hills.GenericNode;
import hills.HClassifier;
import hills.HRequirementSpecification;
import hills.HSpecification;
import hills.HillsPackage;
import hills.Lien;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSpecification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.HSpecificationImpl#getNomModele <em>Nom Modele</em>}</li>
 *   <li>{@link hills.impl.HSpecificationImpl#getDescripModele <em>Descrip Modele</em>}</li>
 *   <li>{@link hills.impl.HSpecificationImpl#getComposants <em>Composants</em>}</li>
 *   <li>{@link hills.impl.HSpecificationImpl#getLiens <em>Liens</em>}</li>
 *   <li>{@link hills.impl.HSpecificationImpl#getHspecification <em>Hspecification</em>}</li>
 *   <li>{@link hills.impl.HSpecificationImpl#getGenericNodes <em>Generic Nodes</em>}</li>
 *   <li>{@link hills.impl.HSpecificationImpl#getRequirementSpecification <em>Requirement Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HSpecificationImpl extends EObjectImpl implements HSpecification {
	/**
	 * The default value of the '{@link #getNomModele() <em>Nom Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomModele()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_MODELE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomModele() <em>Nom Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomModele()
	 * @generated
	 * @ordered
	 */
	protected String nomModele = NOM_MODELE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescripModele() <em>Descrip Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripModele()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIP_MODELE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescripModele() <em>Descrip Modele</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescripModele()
	 * @generated
	 * @ordered
	 */
	protected String descripModele = DESCRIP_MODELE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposants() <em>Composants</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposants()
	 * @generated
	 * @ordered
	 */
	protected EList<HClassifier> composants;

	/**
	 * The cached value of the '{@link #getLiens() <em>Liens</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiens()
	 * @generated
	 * @ordered
	 */
	protected EList<Lien> liens;

	/**
	 * The cached value of the '{@link #getHspecification() <em>Hspecification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHspecification()
	 * @generated
	 * @ordered
	 */
	protected EList<HSpecification> hspecification;

	/**
	 * The cached value of the '{@link #getGenericNodes() <em>Generic Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GenericNode> genericNodes;

	/**
	 * The cached value of the '{@link #getRequirementSpecification() <em>Requirement Specification</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementSpecification()
	 * @generated
	 * @ordered
	 */
	protected EList<HRequirementSpecification> requirementSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.HSPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNomModele() {
		return nomModele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNomModele(String newNomModele) {
		String oldNomModele = nomModele;
		nomModele = newNomModele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.HSPECIFICATION__NOM_MODELE, oldNomModele, nomModele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescripModele() {
		return descripModele;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescripModele(String newDescripModele) {
		String oldDescripModele = descripModele;
		descripModele = newDescripModele;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.HSPECIFICATION__DESCRIP_MODELE, oldDescripModele, descripModele));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HClassifier> getComposants() {
		if (composants == null) {
			composants = new EObjectContainmentEList<HClassifier>(HClassifier.class, this, HillsPackage.HSPECIFICATION__COMPOSANTS);
		}
		return composants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Lien> getLiens() {
		if (liens == null) {
			liens = new EObjectContainmentEList<Lien>(Lien.class, this, HillsPackage.HSPECIFICATION__LIENS);
		}
		return liens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HSpecification> getHspecification() {
		if (hspecification == null) {
			hspecification = new EObjectContainmentEList<HSpecification>(HSpecification.class, this, HillsPackage.HSPECIFICATION__HSPECIFICATION);
		}
		return hspecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GenericNode> getGenericNodes() {
		if (genericNodes == null) {
			genericNodes = new EObjectContainmentEList<GenericNode>(GenericNode.class, this, HillsPackage.HSPECIFICATION__GENERIC_NODES);
		}
		return genericNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HRequirementSpecification> getRequirementSpecification() {
		if (requirementSpecification == null) {
			requirementSpecification = new EObjectContainmentEList<HRequirementSpecification>(HRequirementSpecification.class, this, HillsPackage.HSPECIFICATION__REQUIREMENT_SPECIFICATION);
		}
		return requirementSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.HSPECIFICATION__COMPOSANTS:
				return ((InternalEList<?>)getComposants()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSPECIFICATION__LIENS:
				return ((InternalEList<?>)getLiens()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSPECIFICATION__HSPECIFICATION:
				return ((InternalEList<?>)getHspecification()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSPECIFICATION__GENERIC_NODES:
				return ((InternalEList<?>)getGenericNodes()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSPECIFICATION__REQUIREMENT_SPECIFICATION:
				return ((InternalEList<?>)getRequirementSpecification()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.HSPECIFICATION__NOM_MODELE:
				return getNomModele();
			case HillsPackage.HSPECIFICATION__DESCRIP_MODELE:
				return getDescripModele();
			case HillsPackage.HSPECIFICATION__COMPOSANTS:
				return getComposants();
			case HillsPackage.HSPECIFICATION__LIENS:
				return getLiens();
			case HillsPackage.HSPECIFICATION__HSPECIFICATION:
				return getHspecification();
			case HillsPackage.HSPECIFICATION__GENERIC_NODES:
				return getGenericNodes();
			case HillsPackage.HSPECIFICATION__REQUIREMENT_SPECIFICATION:
				return getRequirementSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HillsPackage.HSPECIFICATION__NOM_MODELE:
				setNomModele((String)newValue);
				return;
			case HillsPackage.HSPECIFICATION__DESCRIP_MODELE:
				setDescripModele((String)newValue);
				return;
			case HillsPackage.HSPECIFICATION__COMPOSANTS:
				getComposants().clear();
				getComposants().addAll((Collection<? extends HClassifier>)newValue);
				return;
			case HillsPackage.HSPECIFICATION__LIENS:
				getLiens().clear();
				getLiens().addAll((Collection<? extends Lien>)newValue);
				return;
			case HillsPackage.HSPECIFICATION__HSPECIFICATION:
				getHspecification().clear();
				getHspecification().addAll((Collection<? extends HSpecification>)newValue);
				return;
			case HillsPackage.HSPECIFICATION__GENERIC_NODES:
				getGenericNodes().clear();
				getGenericNodes().addAll((Collection<? extends GenericNode>)newValue);
				return;
			case HillsPackage.HSPECIFICATION__REQUIREMENT_SPECIFICATION:
				getRequirementSpecification().clear();
				getRequirementSpecification().addAll((Collection<? extends HRequirementSpecification>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case HillsPackage.HSPECIFICATION__NOM_MODELE:
				setNomModele(NOM_MODELE_EDEFAULT);
				return;
			case HillsPackage.HSPECIFICATION__DESCRIP_MODELE:
				setDescripModele(DESCRIP_MODELE_EDEFAULT);
				return;
			case HillsPackage.HSPECIFICATION__COMPOSANTS:
				getComposants().clear();
				return;
			case HillsPackage.HSPECIFICATION__LIENS:
				getLiens().clear();
				return;
			case HillsPackage.HSPECIFICATION__HSPECIFICATION:
				getHspecification().clear();
				return;
			case HillsPackage.HSPECIFICATION__GENERIC_NODES:
				getGenericNodes().clear();
				return;
			case HillsPackage.HSPECIFICATION__REQUIREMENT_SPECIFICATION:
				getRequirementSpecification().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case HillsPackage.HSPECIFICATION__NOM_MODELE:
				return NOM_MODELE_EDEFAULT == null ? nomModele != null : !NOM_MODELE_EDEFAULT.equals(nomModele);
			case HillsPackage.HSPECIFICATION__DESCRIP_MODELE:
				return DESCRIP_MODELE_EDEFAULT == null ? descripModele != null : !DESCRIP_MODELE_EDEFAULT.equals(descripModele);
			case HillsPackage.HSPECIFICATION__COMPOSANTS:
				return composants != null && !composants.isEmpty();
			case HillsPackage.HSPECIFICATION__LIENS:
				return liens != null && !liens.isEmpty();
			case HillsPackage.HSPECIFICATION__HSPECIFICATION:
				return hspecification != null && !hspecification.isEmpty();
			case HillsPackage.HSPECIFICATION__GENERIC_NODES:
				return genericNodes != null && !genericNodes.isEmpty();
			case HillsPackage.HSPECIFICATION__REQUIREMENT_SPECIFICATION:
				return requirementSpecification != null && !requirementSpecification.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nomModele: ");
		result.append(nomModele);
		result.append(", descripModele: ");
		result.append(descripModele);
		result.append(')');
		return result.toString();
	}

} //HSpecificationImpl
