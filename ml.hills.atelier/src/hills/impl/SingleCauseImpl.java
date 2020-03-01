/**
 */
package hills.impl;

import hills.HillsPackage;
import hills.Proposition;
import hills.SingleCause;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.SingleCauseImpl#getCauses <em>Causes</em>}</li>
 *   <li>{@link hills.impl.SingleCauseImpl#getEffects <em>Effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleCauseImpl extends PrecedenceChainImpl implements SingleCause {
	/**
	 * The cached value of the '{@link #getCauses() <em>Causes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauses()
	 * @generated
	 * @ordered
	 */
	protected Proposition causes;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Proposition> effects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleCauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.SINGLE_CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proposition getCauses() {
		if (causes != null && causes.eIsProxy()) {
			InternalEObject oldCauses = (InternalEObject)causes;
			causes = (Proposition)eResolveProxy(oldCauses);
			if (causes != oldCauses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HillsPackage.SINGLE_CAUSE__CAUSES, oldCauses, causes));
			}
		}
		return causes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetCauses() {
		return causes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCauses(Proposition newCauses) {
		Proposition oldCauses = causes;
		causes = newCauses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.SINGLE_CAUSE__CAUSES, oldCauses, causes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Proposition> getEffects() {
		if (effects == null) {
			effects = new EObjectResolvingEList<Proposition>(Proposition.class, this, HillsPackage.SINGLE_CAUSE__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.SINGLE_CAUSE__CAUSES:
				if (resolve) return getCauses();
				return basicGetCauses();
			case HillsPackage.SINGLE_CAUSE__EFFECTS:
				return getEffects();
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
			case HillsPackage.SINGLE_CAUSE__CAUSES:
				setCauses((Proposition)newValue);
				return;
			case HillsPackage.SINGLE_CAUSE__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends Proposition>)newValue);
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
			case HillsPackage.SINGLE_CAUSE__CAUSES:
				setCauses((Proposition)null);
				return;
			case HillsPackage.SINGLE_CAUSE__EFFECTS:
				getEffects().clear();
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
			case HillsPackage.SINGLE_CAUSE__CAUSES:
				return causes != null;
			case HillsPackage.SINGLE_CAUSE__EFFECTS:
				return effects != null && !effects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SingleCauseImpl
