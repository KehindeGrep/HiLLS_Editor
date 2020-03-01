/**
 */
package hills.impl;

import hills.BExistence;
import hills.HillsPackage;
import hills.PortDeclaration;
import hills.Predicat;

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
 * An implementation of the model object '<em><b>BExistence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.BExistenceImpl#getBename <em>Bename</em>}</li>
 *   <li>{@link hills.impl.BExistenceImpl#getPredicats <em>Predicats</em>}</li>
 *   <li>{@link hills.impl.BExistenceImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.impl.BExistenceImpl#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BExistenceImpl extends TLPropertyImpl implements BExistence {
	/**
	 * The default value of the '{@link #getBename() <em>Bename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBename()
	 * @generated
	 * @ordered
	 */
	protected static final String BENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBename() <em>Bename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBename()
	 * @generated
	 * @ordered
	 */
	protected String bename = BENAME_EDEFAULT;

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
	protected BExistenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.BEXISTENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBename() {
		return bename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBename(String newBename) {
		String oldBename = bename;
		bename = newBename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.BEXISTENCE__BENAME, oldBename, bename));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HillsPackage.BEXISTENCE__PREDICATS, oldPredicats, newPredicats);
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
				msgs = ((InternalEObject)predicats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HillsPackage.BEXISTENCE__PREDICATS, null, msgs);
			if (newPredicats != null)
				msgs = ((InternalEObject)newPredicats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HillsPackage.BEXISTENCE__PREDICATS, null, msgs);
			msgs = basicSetPredicats(newPredicats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.BEXISTENCE__PREDICATS, newPredicats, newPredicats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.BEXISTENCE__DECLARATIONS);
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
			ppredicats = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.BEXISTENCE__PPREDICATS);
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
			case HillsPackage.BEXISTENCE__PREDICATS:
				return basicSetPredicats(null, msgs);
			case HillsPackage.BEXISTENCE__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case HillsPackage.BEXISTENCE__PPREDICATS:
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
			case HillsPackage.BEXISTENCE__BENAME:
				return getBename();
			case HillsPackage.BEXISTENCE__PREDICATS:
				return getPredicats();
			case HillsPackage.BEXISTENCE__DECLARATIONS:
				return getDeclarations();
			case HillsPackage.BEXISTENCE__PPREDICATS:
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
			case HillsPackage.BEXISTENCE__BENAME:
				setBename((String)newValue);
				return;
			case HillsPackage.BEXISTENCE__PREDICATS:
				setPredicats((Predicat)newValue);
				return;
			case HillsPackage.BEXISTENCE__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends PortDeclaration>)newValue);
				return;
			case HillsPackage.BEXISTENCE__PPREDICATS:
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
			case HillsPackage.BEXISTENCE__BENAME:
				setBename(BENAME_EDEFAULT);
				return;
			case HillsPackage.BEXISTENCE__PREDICATS:
				setPredicats((Predicat)null);
				return;
			case HillsPackage.BEXISTENCE__DECLARATIONS:
				getDeclarations().clear();
				return;
			case HillsPackage.BEXISTENCE__PPREDICATS:
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
			case HillsPackage.BEXISTENCE__BENAME:
				return BENAME_EDEFAULT == null ? bename != null : !BENAME_EDEFAULT.equals(bename);
			case HillsPackage.BEXISTENCE__PREDICATS:
				return predicats != null;
			case HillsPackage.BEXISTENCE__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case HillsPackage.BEXISTENCE__PPREDICATS:
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
		result.append(" (bename: ");
		result.append(bename);
		result.append(')');
		return result.toString();
	}

} //BExistenceImpl
