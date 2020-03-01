/**
 */
package hills.impl;

import hills.HillsPackage;
import hills.PortDeclaration;
import hills.Predicat;
import hills.UExistence;

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
 * An implementation of the model object '<em><b>UExistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.UExistenceImpl#getUename <em>Uename</em>}</li>
 *   <li>{@link hills.impl.UExistenceImpl#getPredicats <em>Predicats</em>}</li>
 *   <li>{@link hills.impl.UExistenceImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.impl.UExistenceImpl#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UExistenceImpl extends TLPropertyImpl implements UExistence {
	/**
	 * The default value of the '{@link #getUename() <em>Uename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUename()
	 * @generated
	 * @ordered
	 */
	protected static final String UENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUename() <em>Uename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUename()
	 * @generated
	 * @ordered
	 */
	protected String uename = UENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPredicats() <em>Predicats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicats()
	 * @generated
	 * @ordered
	 */
	protected Predicat predicats;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDeclaration> declarations;

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
	protected UExistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.UEXISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUename() {
		return uename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUename(String newUename) {
		String oldUename = uename;
		uename = newUename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.UEXISTENCE__UENAME, oldUename, uename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicat getPredicats() {
		return predicats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicats(Predicat newPredicats, NotificationChain msgs) {
		Predicat oldPredicats = predicats;
		predicats = newPredicats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HillsPackage.UEXISTENCE__PREDICATS, oldPredicats, newPredicats);
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
	public void setPredicats(Predicat newPredicats) {
		if (newPredicats != predicats) {
			NotificationChain msgs = null;
			if (predicats != null)
				msgs = ((InternalEObject)predicats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HillsPackage.UEXISTENCE__PREDICATS, null, msgs);
			if (newPredicats != null)
				msgs = ((InternalEObject)newPredicats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HillsPackage.UEXISTENCE__PREDICATS, null, msgs);
			msgs = basicSetPredicats(newPredicats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.UEXISTENCE__PREDICATS, newPredicats, newPredicats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.UEXISTENCE__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getPpredicats() {
		if (ppredicats == null) {
			ppredicats = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.UEXISTENCE__PPREDICATS);
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
			case HillsPackage.UEXISTENCE__PREDICATS:
				return basicSetPredicats(null, msgs);
			case HillsPackage.UEXISTENCE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case HillsPackage.UEXISTENCE__PPREDICATS:
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
			case HillsPackage.UEXISTENCE__UENAME:
				return getUename();
			case HillsPackage.UEXISTENCE__PREDICATS:
				return getPredicats();
			case HillsPackage.UEXISTENCE__DECLARATIONS:
				return getDeclarations();
			case HillsPackage.UEXISTENCE__PPREDICATS:
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
			case HillsPackage.UEXISTENCE__UENAME:
				setUename((String)newValue);
				return;
			case HillsPackage.UEXISTENCE__PREDICATS:
				setPredicats((Predicat)newValue);
				return;
			case HillsPackage.UEXISTENCE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends PortDeclaration>)newValue);
				return;
			case HillsPackage.UEXISTENCE__PPREDICATS:
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
			case HillsPackage.UEXISTENCE__UENAME:
				setUename(UENAME_EDEFAULT);
				return;
			case HillsPackage.UEXISTENCE__PREDICATS:
				setPredicats((Predicat)null);
				return;
			case HillsPackage.UEXISTENCE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case HillsPackage.UEXISTENCE__PPREDICATS:
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
			case HillsPackage.UEXISTENCE__UENAME:
				return UENAME_EDEFAULT == null ? uename != null : !UENAME_EDEFAULT.equals(uename);
			case HillsPackage.UEXISTENCE__PREDICATS:
				return predicats != null;
			case HillsPackage.UEXISTENCE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case HillsPackage.UEXISTENCE__PPREDICATS:
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
		result.append(" (uename: ");
		result.append(uename);
		result.append(')');
		return result.toString();
	}

} //UExistenceImpl
