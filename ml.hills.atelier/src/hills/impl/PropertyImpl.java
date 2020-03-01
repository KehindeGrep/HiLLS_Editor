/**
 */
package hills.impl;

import hills.HillsPackage;
import hills.PortDeclaration;
import hills.Property;

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
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.PropertyImpl#getPrname1 <em>Prname1</em>}</li>
 *   <li>{@link hills.impl.PropertyImpl#getPrname2 <em>Prname2</em>}</li>
 *   <li>{@link hills.impl.PropertyImpl#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyImpl extends EObjectImpl implements Property {
	/**
	 * The default value of the '{@link #getPrname1() <em>Prname1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrname1()
	 * @generated
	 * @ordered
	 */
	protected static final String PRNAME1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrname1() <em>Prname1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrname1()
	 * @generated
	 * @ordered
	 */
	protected String prname1 = PRNAME1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrname2() <em>Prname2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrname2()
	 * @generated
	 * @ordered
	 */
	protected static final String PRNAME2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrname2() <em>Prname2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrname2()
	 * @generated
	 * @ordered
	 */
	protected String prname2 = PRNAME2_EDEFAULT;

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
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrname1() {
		return prname1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrname1(String newPrname1) {
		String oldPrname1 = prname1;
		prname1 = newPrname1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.PROPERTY__PRNAME1, oldPrname1, prname1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrname2() {
		return prname2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrname2(String newPrname2) {
		String oldPrname2 = prname2;
		prname2 = newPrname2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.PROPERTY__PRNAME2, oldPrname2, prname2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getPpredicats() {
		if (ppredicats == null) {
			ppredicats = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.PROPERTY__PPREDICATS);
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
			case HillsPackage.PROPERTY__PPREDICATS:
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
			case HillsPackage.PROPERTY__PRNAME1:
				return getPrname1();
			case HillsPackage.PROPERTY__PRNAME2:
				return getPrname2();
			case HillsPackage.PROPERTY__PPREDICATS:
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
			case HillsPackage.PROPERTY__PRNAME1:
				setPrname1((String)newValue);
				return;
			case HillsPackage.PROPERTY__PRNAME2:
				setPrname2((String)newValue);
				return;
			case HillsPackage.PROPERTY__PPREDICATS:
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
			case HillsPackage.PROPERTY__PRNAME1:
				setPrname1(PRNAME1_EDEFAULT);
				return;
			case HillsPackage.PROPERTY__PRNAME2:
				setPrname2(PRNAME2_EDEFAULT);
				return;
			case HillsPackage.PROPERTY__PPREDICATS:
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
			case HillsPackage.PROPERTY__PRNAME1:
				return PRNAME1_EDEFAULT == null ? prname1 != null : !PRNAME1_EDEFAULT.equals(prname1);
			case HillsPackage.PROPERTY__PRNAME2:
				return PRNAME2_EDEFAULT == null ? prname2 != null : !PRNAME2_EDEFAULT.equals(prname2);
			case HillsPackage.PROPERTY__PPREDICATS:
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
		result.append(" (prname1: ");
		result.append(prname1);
		result.append(", prname2: ");
		result.append(prname2);
		result.append(')');
		return result.toString();
	}

} //PropertyImpl
