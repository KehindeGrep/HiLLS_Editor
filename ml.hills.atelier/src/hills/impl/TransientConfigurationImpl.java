/**
 */
package hills.impl;

import hills.Activity;
import hills.HillsPackage;
import hills.Property;
import hills.TransientConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transient Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.TransientConfigurationImpl#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link hills.impl.TransientConfigurationImpl#getActivites <em>Activites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransientConfigurationImpl extends ConfigurationImpl implements TransientConfiguration {
	/**
	 * The cached value of the '{@link #getProprietes() <em>Proprietes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProprietes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> proprietes;

	/**
	 * The cached value of the '{@link #getActivites() <em>Activites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivites()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransientConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.TRANSIENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProprietes() {
		if (proprietes == null) {
			proprietes = new EObjectContainmentEList<Property>(Property.class, this, HillsPackage.TRANSIENT_CONFIGURATION__PROPRIETES);
		}
		return proprietes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activity> getActivites() {
		if (activites == null) {
			activites = new EObjectContainmentEList<Activity>(Activity.class, this, HillsPackage.TRANSIENT_CONFIGURATION__ACTIVITES);
		}
		return activites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.TRANSIENT_CONFIGURATION__PROPRIETES:
				return ((InternalEList<?>)getProprietes()).basicRemove(otherEnd, msgs);
			case HillsPackage.TRANSIENT_CONFIGURATION__ACTIVITES:
				return ((InternalEList<?>)getActivites()).basicRemove(otherEnd, msgs);
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
			case HillsPackage.TRANSIENT_CONFIGURATION__PROPRIETES:
				return getProprietes();
			case HillsPackage.TRANSIENT_CONFIGURATION__ACTIVITES:
				return getActivites();
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
			case HillsPackage.TRANSIENT_CONFIGURATION__PROPRIETES:
				getProprietes().clear();
				getProprietes().addAll((Collection<? extends Property>)newValue);
				return;
			case HillsPackage.TRANSIENT_CONFIGURATION__ACTIVITES:
				getActivites().clear();
				getActivites().addAll((Collection<? extends Activity>)newValue);
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
			case HillsPackage.TRANSIENT_CONFIGURATION__PROPRIETES:
				getProprietes().clear();
				return;
			case HillsPackage.TRANSIENT_CONFIGURATION__ACTIVITES:
				getActivites().clear();
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
			case HillsPackage.TRANSIENT_CONFIGURATION__PROPRIETES:
				return proprietes != null && !proprietes.isEmpty();
			case HillsPackage.TRANSIENT_CONFIGURATION__ACTIVITES:
				return activites != null && !activites.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransientConfigurationImpl
