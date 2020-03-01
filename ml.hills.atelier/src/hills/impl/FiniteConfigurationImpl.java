/**
 */
package hills.impl;

import hills.Activity;
import hills.FiniteConfiguration;
import hills.HillsPackage;
import hills.Property;
import hills.SojournTime;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finite Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.FiniteConfigurationImpl#getProprietes <em>Proprietes</em>}</li>
 *   <li>{@link hills.impl.FiniteConfigurationImpl#getActivites <em>Activites</em>}</li>
 *   <li>{@link hills.impl.FiniteConfigurationImpl#getSojTime <em>Soj Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiniteConfigurationImpl extends ConfigurationImpl implements FiniteConfiguration {
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
	 * The cached value of the '{@link #getSojTime() <em>Soj Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSojTime()
	 * @generated
	 * @ordered
	 */
	protected SojournTime sojTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiniteConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.FINITE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProprietes() {
		if (proprietes == null) {
			proprietes = new EObjectContainmentEList<Property>(Property.class, this, HillsPackage.FINITE_CONFIGURATION__PROPRIETES);
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
			activites = new EObjectContainmentEList<Activity>(Activity.class, this, HillsPackage.FINITE_CONFIGURATION__ACTIVITES);
		}
		return activites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SojournTime getSojTime() {
		return sojTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSojTime(SojournTime newSojTime, NotificationChain msgs) {
		SojournTime oldSojTime = sojTime;
		sojTime = newSojTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HillsPackage.FINITE_CONFIGURATION__SOJ_TIME, oldSojTime, newSojTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSojTime(SojournTime newSojTime) {
		if (newSojTime != sojTime) {
			NotificationChain msgs = null;
			if (sojTime != null)
				msgs = ((InternalEObject)sojTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HillsPackage.FINITE_CONFIGURATION__SOJ_TIME, null, msgs);
			if (newSojTime != null)
				msgs = ((InternalEObject)newSojTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HillsPackage.FINITE_CONFIGURATION__SOJ_TIME, null, msgs);
			msgs = basicSetSojTime(newSojTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.FINITE_CONFIGURATION__SOJ_TIME, newSojTime, newSojTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.FINITE_CONFIGURATION__PROPRIETES:
				return ((InternalEList<?>)getProprietes()).basicRemove(otherEnd, msgs);
			case HillsPackage.FINITE_CONFIGURATION__ACTIVITES:
				return ((InternalEList<?>)getActivites()).basicRemove(otherEnd, msgs);
			case HillsPackage.FINITE_CONFIGURATION__SOJ_TIME:
				return basicSetSojTime(null, msgs);
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
			case HillsPackage.FINITE_CONFIGURATION__PROPRIETES:
				return getProprietes();
			case HillsPackage.FINITE_CONFIGURATION__ACTIVITES:
				return getActivites();
			case HillsPackage.FINITE_CONFIGURATION__SOJ_TIME:
				return getSojTime();
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
			case HillsPackage.FINITE_CONFIGURATION__PROPRIETES:
				getProprietes().clear();
				getProprietes().addAll((Collection<? extends Property>)newValue);
				return;
			case HillsPackage.FINITE_CONFIGURATION__ACTIVITES:
				getActivites().clear();
				getActivites().addAll((Collection<? extends Activity>)newValue);
				return;
			case HillsPackage.FINITE_CONFIGURATION__SOJ_TIME:
				setSojTime((SojournTime)newValue);
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
			case HillsPackage.FINITE_CONFIGURATION__PROPRIETES:
				getProprietes().clear();
				return;
			case HillsPackage.FINITE_CONFIGURATION__ACTIVITES:
				getActivites().clear();
				return;
			case HillsPackage.FINITE_CONFIGURATION__SOJ_TIME:
				setSojTime((SojournTime)null);
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
			case HillsPackage.FINITE_CONFIGURATION__PROPRIETES:
				return proprietes != null && !proprietes.isEmpty();
			case HillsPackage.FINITE_CONFIGURATION__ACTIVITES:
				return activites != null && !activites.isEmpty();
			case HillsPackage.FINITE_CONFIGURATION__SOJ_TIME:
				return sojTime != null;
		}
		return super.eIsSet(featureID);
	}

} //FiniteConfigurationImpl
