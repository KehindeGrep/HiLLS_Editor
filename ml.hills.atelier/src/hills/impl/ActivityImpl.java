/**
 */
package hills.impl;

import hills.Activity;
import hills.HillsPackage;
import hills.PortDeclaration;

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
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.ActivityImpl#getAcname1 <em>Acname1</em>}</li>
 *   <li>{@link hills.impl.ActivityImpl#getAcname2 <em>Acname2</em>}</li>
 *   <li>{@link hills.impl.ActivityImpl#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityImpl extends EObjectImpl implements Activity {
	/**
	 * The default value of the '{@link #getAcname1() <em>Acname1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcname1()
	 * @generated
	 * @ordered
	 */
	protected static final String ACNAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcname1() <em>Acname1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcname1()
	 * @generated
	 * @ordered
	 */
	protected String acname1 = ACNAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAcname2() <em>Acname2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcname2()
	 * @generated
	 * @ordered
	 */
	protected static final String ACNAME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcname2() <em>Acname2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcname2()
	 * @generated
	 * @ordered
	 */
	protected String acname2 = ACNAME2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPpredicats() <em>Ppredicats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPpredicats()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDeclaration> ppredicats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcname1() {
		return acname1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcname1(String newAcname1) {
		String oldAcname1 = acname1;
		acname1 = newAcname1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.ACTIVITY__ACNAME1, oldAcname1, acname1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAcname2() {
		return acname2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAcname2(String newAcname2) {
		String oldAcname2 = acname2;
		acname2 = newAcname2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.ACTIVITY__ACNAME2, oldAcname2, acname2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getPpredicats() {
		if (ppredicats == null) {
			ppredicats = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.ACTIVITY__PPREDICATS);
		}
		return ppredicats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.ACTIVITY__PPREDICATS:
				return ((InternalEList<?>)getPpredicats()).basicRemove(otherEnd, msgs);
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
			case HillsPackage.ACTIVITY__ACNAME1:
				return getAcname1();
			case HillsPackage.ACTIVITY__ACNAME2:
				return getAcname2();
			case HillsPackage.ACTIVITY__PPREDICATS:
				return getPpredicats();
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
			case HillsPackage.ACTIVITY__ACNAME1:
				setAcname1((String)newValue);
				return;
			case HillsPackage.ACTIVITY__ACNAME2:
				setAcname2((String)newValue);
				return;
			case HillsPackage.ACTIVITY__PPREDICATS:
				getPpredicats().clear();
				getPpredicats().addAll((Collection<? extends PortDeclaration>)newValue);
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
			case HillsPackage.ACTIVITY__ACNAME1:
				setAcname1(ACNAME1_EDEFAULT);
				return;
			case HillsPackage.ACTIVITY__ACNAME2:
				setAcname2(ACNAME2_EDEFAULT);
				return;
			case HillsPackage.ACTIVITY__PPREDICATS:
				getPpredicats().clear();
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
			case HillsPackage.ACTIVITY__ACNAME1:
				return ACNAME1_EDEFAULT == null ? acname1 != null : !ACNAME1_EDEFAULT.equals(acname1);
			case HillsPackage.ACTIVITY__ACNAME2:
				return ACNAME2_EDEFAULT == null ? acname2 != null : !ACNAME2_EDEFAULT.equals(acname2);
			case HillsPackage.ACTIVITY__PPREDICATS:
				return ppredicats != null && !ppredicats.isEmpty();
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
		result.append(" (acname1: ");
		result.append(acname1);
		result.append(", acname2: ");
		result.append(acname2);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl
