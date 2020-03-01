/**
 */
package hills.impl;

import hills.ConfluentTransition;
import hills.HillsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Confluent Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.ConfluentTransitionImpl#getCtname <em>Ctname</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfluentTransitionImpl extends TransitionImpl implements ConfluentTransition {
	/**
	 * The default value of the '{@link #getCtname() <em>Ctname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtname()
	 * @generated
	 * @ordered
	 */
	protected static final String CTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCtname() <em>Ctname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtname()
	 * @generated
	 * @ordered
	 */
	protected String ctname = CTNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfluentTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.CONFLUENT_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCtname() {
		return ctname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCtname(String newCtname) {
		String oldCtname = ctname;
		ctname = newCtname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.CONFLUENT_TRANSITION__CTNAME, oldCtname, ctname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.CONFLUENT_TRANSITION__CTNAME:
				return getCtname();
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
			case HillsPackage.CONFLUENT_TRANSITION__CTNAME:
				setCtname((String)newValue);
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
			case HillsPackage.CONFLUENT_TRANSITION__CTNAME:
				setCtname(CTNAME_EDEFAULT);
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
			case HillsPackage.CONFLUENT_TRANSITION__CTNAME:
				return CTNAME_EDEFAULT == null ? ctname != null : !CTNAME_EDEFAULT.equals(ctname);
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
		result.append(" (ctname: ");
		result.append(ctname);
		result.append(')');
		return result.toString();
	}

} //ConfluentTransitionImpl
