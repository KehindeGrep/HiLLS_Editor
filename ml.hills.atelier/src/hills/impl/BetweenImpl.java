/**
 */
package hills.impl;

import hills.Between;
import hills.HillsPackage;
import hills.Proposition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Between</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.BetweenImpl#getStartDelimiter <em>Start Delimiter</em>}</li>
 *   <li>{@link hills.impl.BetweenImpl#getEndDelimiter <em>End Delimiter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BetweenImpl extends ScopeImpl implements Between {
	/**
	 * The cached value of the '{@link #getStartDelimiter() <em>Start Delimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDelimiter()
	 * @generated
	 * @ordered
	 */
	protected Proposition startDelimiter;

	/**
	 * The cached value of the '{@link #getEndDelimiter() <em>End Delimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDelimiter()
	 * @generated
	 * @ordered
	 */
	protected Proposition endDelimiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BetweenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.BETWEEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proposition getStartDelimiter() {
		if (startDelimiter != null && startDelimiter.eIsProxy()) {
			InternalEObject oldStartDelimiter = (InternalEObject)startDelimiter;
			startDelimiter = (Proposition)eResolveProxy(oldStartDelimiter);
			if (startDelimiter != oldStartDelimiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HillsPackage.BETWEEN__START_DELIMITER, oldStartDelimiter, startDelimiter));
			}
		}
		return startDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetStartDelimiter() {
		return startDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDelimiter(Proposition newStartDelimiter) {
		Proposition oldStartDelimiter = startDelimiter;
		startDelimiter = newStartDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.BETWEEN__START_DELIMITER, oldStartDelimiter, startDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proposition getEndDelimiter() {
		if (endDelimiter != null && endDelimiter.eIsProxy()) {
			InternalEObject oldEndDelimiter = (InternalEObject)endDelimiter;
			endDelimiter = (Proposition)eResolveProxy(oldEndDelimiter);
			if (endDelimiter != oldEndDelimiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HillsPackage.BETWEEN__END_DELIMITER, oldEndDelimiter, endDelimiter));
			}
		}
		return endDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetEndDelimiter() {
		return endDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndDelimiter(Proposition newEndDelimiter) {
		Proposition oldEndDelimiter = endDelimiter;
		endDelimiter = newEndDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.BETWEEN__END_DELIMITER, oldEndDelimiter, endDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.BETWEEN__START_DELIMITER:
				if (resolve) return getStartDelimiter();
				return basicGetStartDelimiter();
			case HillsPackage.BETWEEN__END_DELIMITER:
				if (resolve) return getEndDelimiter();
				return basicGetEndDelimiter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HillsPackage.BETWEEN__START_DELIMITER:
				setStartDelimiter((Proposition)newValue);
				return;
			case HillsPackage.BETWEEN__END_DELIMITER:
				setEndDelimiter((Proposition)newValue);
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
			case HillsPackage.BETWEEN__START_DELIMITER:
				setStartDelimiter((Proposition)null);
				return;
			case HillsPackage.BETWEEN__END_DELIMITER:
				setEndDelimiter((Proposition)null);
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
			case HillsPackage.BETWEEN__START_DELIMITER:
				return startDelimiter != null;
			case HillsPackage.BETWEEN__END_DELIMITER:
				return endDelimiter != null;
		}
		return super.eIsSet(featureID);
	}

} //BetweenImpl
