/**
 */
package hills.impl;

import hills.HillsPackage;
import hills.TestNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.TestNodeImpl#getTtime <em>Ttime</em>}</li>
 *   <li>{@link hills.impl.TestNodeImpl#getContenu <em>Contenu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TestNodeImpl extends ConfigurationImpl implements TestNode {
	/**
	 * The default value of the '{@link #getTtime() <em>Ttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtime()
	 * @generated
	 * @ordered
	 */
	protected static final String TTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTtime() <em>Ttime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTtime()
	 * @generated
	 * @ordered
	 */
	protected String ttime = TTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContenu() <em>Contenu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContenu()
	 * @generated
	 * @ordered
	 */
	protected String contenu = CONTENU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.TEST_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTtime() {
		return ttime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTtime(String newTtime) {
		String oldTtime = ttime;
		ttime = newTtime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.TEST_NODE__TTIME, oldTtime, ttime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContenu() {
		return contenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContenu(String newContenu) {
		String oldContenu = contenu;
		contenu = newContenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.TEST_NODE__CONTENU, oldContenu, contenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.TEST_NODE__TTIME:
				return getTtime();
			case HillsPackage.TEST_NODE__CONTENU:
				return getContenu();
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
			case HillsPackage.TEST_NODE__TTIME:
				setTtime((String)newValue);
				return;
			case HillsPackage.TEST_NODE__CONTENU:
				setContenu((String)newValue);
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
			case HillsPackage.TEST_NODE__TTIME:
				setTtime(TTIME_EDEFAULT);
				return;
			case HillsPackage.TEST_NODE__CONTENU:
				setContenu(CONTENU_EDEFAULT);
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
			case HillsPackage.TEST_NODE__TTIME:
				return TTIME_EDEFAULT == null ? ttime != null : !TTIME_EDEFAULT.equals(ttime);
			case HillsPackage.TEST_NODE__CONTENU:
				return CONTENU_EDEFAULT == null ? contenu != null : !CONTENU_EDEFAULT.equals(contenu);
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
		result.append(" (ttime: ");
		result.append(ttime);
		result.append(", contenu: ");
		result.append(contenu);
		result.append(')');
		return result.toString();
	}

} //TestNodeImpl
