/**
 */
package hills.impl;

import hills.Declaration;
import hills.Function;
import hills.HClass;
import hills.HillsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.HClassImpl#getDeclaratios <em>Declaratios</em>}</li>
 *   <li>{@link hills.impl.HClassImpl#getFonctions <em>Fonctions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HClassImpl extends HClassifierImpl implements HClass {
	/**
	 * The cached value of the '{@link #getDeclaratios() <em>Declaratios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaratios()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaratios;

	/**
	 * The cached value of the '{@link #getFonctions() <em>Fonctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> fonctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.HCLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Declaration> getDeclaratios() {
		if (declaratios == null) {
			declaratios = new EObjectContainmentEList<Declaration>(Declaration.class, this, HillsPackage.HCLASS__DECLARATIOS);
		}
		return declaratios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function> getFonctions() {
		if (fonctions == null) {
			fonctions = new EObjectContainmentEList<Function>(Function.class, this, HillsPackage.HCLASS__FONCTIONS);
		}
		return fonctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.HCLASS__DECLARATIOS:
				return ((InternalEList<?>)getDeclaratios()).basicRemove(otherEnd, msgs);
			case HillsPackage.HCLASS__FONCTIONS:
				return ((InternalEList<?>)getFonctions()).basicRemove(otherEnd, msgs);
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
			case HillsPackage.HCLASS__DECLARATIOS:
				return getDeclaratios();
			case HillsPackage.HCLASS__FONCTIONS:
				return getFonctions();
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
			case HillsPackage.HCLASS__DECLARATIOS:
				getDeclaratios().clear();
				getDeclaratios().addAll((Collection<? extends Declaration>)newValue);
				return;
			case HillsPackage.HCLASS__FONCTIONS:
				getFonctions().clear();
				getFonctions().addAll((Collection<? extends Function>)newValue);
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
			case HillsPackage.HCLASS__DECLARATIOS:
				getDeclaratios().clear();
				return;
			case HillsPackage.HCLASS__FONCTIONS:
				getFonctions().clear();
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
			case HillsPackage.HCLASS__DECLARATIOS:
				return declaratios != null && !declaratios.isEmpty();
			case HillsPackage.HCLASS__FONCTIONS:
				return fonctions != null && !fonctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HClassImpl
