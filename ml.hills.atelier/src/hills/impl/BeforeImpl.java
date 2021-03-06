/**
 */
package hills.impl;

import hills.Before;
import hills.HillsPackage;
import hills.Proposition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Before</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.BeforeImpl#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BeforeImpl extends ScopeImpl implements Before {
	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected Proposition delimiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BeforeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.BEFORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Proposition getDelimiter() {
		if (delimiter != null && delimiter.eIsProxy()) {
			InternalEObject oldDelimiter = (InternalEObject)delimiter;
			delimiter = (Proposition)eResolveProxy(oldDelimiter);
			if (delimiter != oldDelimiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HillsPackage.BEFORE__DELIMITER, oldDelimiter, delimiter));
			}
		}
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proposition basicGetDelimiter() {
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelimiter(Proposition newDelimiter) {
		Proposition oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.BEFORE__DELIMITER, oldDelimiter, delimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.BEFORE__DELIMITER:
				if (resolve) return getDelimiter();
				return basicGetDelimiter();
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
			case HillsPackage.BEFORE__DELIMITER:
				setDelimiter((Proposition)newValue);
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
			case HillsPackage.BEFORE__DELIMITER:
				setDelimiter((Proposition)null);
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
			case HillsPackage.BEFORE__DELIMITER:
				return delimiter != null;
		}
		return super.eIsSet(featureID);
	}

} //BeforeImpl
