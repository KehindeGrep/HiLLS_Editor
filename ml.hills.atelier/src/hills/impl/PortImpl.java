/**
 */
package hills.impl;

import hills.HillsPackage;
import hills.Port;

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
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.PortImpl#getPname <em>Pname</em>}</li>
 *   <li>{@link hills.impl.PortImpl#getOthername <em>Othername</em>}</li>
 *   <li>{@link hills.impl.PortImpl#getEntreePorts <em>Entree Ports</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends EObjectImpl implements Port {
	/**
	 * The default value of the '{@link #getPname() <em>Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPname()
	 * @generated
	 * @ordered
	 */
	protected static final String PNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPname() <em>Pname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPname()
	 * @generated
	 * @ordered
	 */
	protected String pname = PNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOthername() <em>Othername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthername()
	 * @generated
	 * @ordered
	 */
	protected static final String OTHERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOthername() <em>Othername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthername()
	 * @generated
	 * @ordered
	 */
	protected String othername = OTHERNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntreePorts() <em>Entree Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntreePorts()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDeclaration> entreePorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPname() {
		return pname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPname(String newPname) {
		String oldPname = pname;
		pname = newPname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.PORT__PNAME, oldPname, pname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOthername() {
		return othername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOthername(String newOthername) {
		String oldOthername = othername;
		othername = newOthername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.PORT__OTHERNAME, oldOthername, othername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getEntreePorts() {
		if (entreePorts == null) {
			entreePorts = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.PORT__ENTREE_PORTS);
		}
		return entreePorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.PORT__ENTREE_PORTS:
				return ((InternalEList<?>)getEntreePorts()).basicRemove(otherEnd, msgs);
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
			case HillsPackage.PORT__PNAME:
				return getPname();
			case HillsPackage.PORT__OTHERNAME:
				return getOthername();
			case HillsPackage.PORT__ENTREE_PORTS:
				return getEntreePorts();
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
			case HillsPackage.PORT__PNAME:
				setPname((String)newValue);
				return;
			case HillsPackage.PORT__OTHERNAME:
				setOthername((String)newValue);
				return;
			case HillsPackage.PORT__ENTREE_PORTS:
				getEntreePorts().clear();
				getEntreePorts().addAll((Collection<? extends PortDeclaration>)newValue);
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
			case HillsPackage.PORT__PNAME:
				setPname(PNAME_EDEFAULT);
				return;
			case HillsPackage.PORT__OTHERNAME:
				setOthername(OTHERNAME_EDEFAULT);
				return;
			case HillsPackage.PORT__ENTREE_PORTS:
				getEntreePorts().clear();
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
			case HillsPackage.PORT__PNAME:
				return PNAME_EDEFAULT == null ? pname != null : !PNAME_EDEFAULT.equals(pname);
			case HillsPackage.PORT__OTHERNAME:
				return OTHERNAME_EDEFAULT == null ? othername != null : !OTHERNAME_EDEFAULT.equals(othername);
			case HillsPackage.PORT__ENTREE_PORTS:
				return entreePorts != null && !entreePorts.isEmpty();
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
		result.append(" (pname: ");
		result.append(pname);
		result.append(", othername: ");
		result.append(othername);
		result.append(')');
		return result.toString();
	}

} //PortImpl
