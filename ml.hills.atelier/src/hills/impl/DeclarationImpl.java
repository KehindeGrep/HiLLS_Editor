/**
 */
package hills.impl;

import hills.Declaration;
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
 * An implementation of the model object '<em><b>Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.DeclarationImpl#getEname <em>Ename</em>}</li>
 *   <li>{@link hills.impl.DeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.impl.DeclarationImpl#getPredicats <em>Predicats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeclarationImpl extends EObjectImpl implements Declaration {
	/**
	 * The default value of the '{@link #getEname() <em>Ename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEname()
	 * @generated
	 * @ordered
	 */
	protected static final String ENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEname() <em>Ename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEname()
	 * @generated
	 * @ordered
	 */
	protected String ename = ENAME_EDEFAULT;

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
	 * The cached value of the '{@link #getPredicats() <em>Predicats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicats()
	 * @generated
	 * @ordered
	 */
	protected EList<PortDeclaration> predicats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEname() {
		return ename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEname(String newEname) {
		String oldEname = ename;
		ename = newEname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.DECLARATION__ENAME, oldEname, ename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.DECLARATION__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getPredicats() {
		if (predicats == null) {
			predicats = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.DECLARATION__PREDICATS);
		}
		return predicats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.DECLARATION__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
			case HillsPackage.DECLARATION__PREDICATS:
				return ((InternalEList<?>)getPredicats()).basicRemove(otherEnd, msgs);
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
			case HillsPackage.DECLARATION__ENAME:
				return getEname();
			case HillsPackage.DECLARATION__DECLARATIONS:
				return getDeclarations();
			case HillsPackage.DECLARATION__PREDICATS:
				return getPredicats();
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
			case HillsPackage.DECLARATION__ENAME:
				setEname((String)newValue);
				return;
			case HillsPackage.DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends PortDeclaration>)newValue);
				return;
			case HillsPackage.DECLARATION__PREDICATS:
				getPredicats().clear();
				getPredicats().addAll((Collection<? extends PortDeclaration>)newValue);
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
			case HillsPackage.DECLARATION__ENAME:
				setEname(ENAME_EDEFAULT);
				return;
			case HillsPackage.DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				return;
			case HillsPackage.DECLARATION__PREDICATS:
				getPredicats().clear();
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
			case HillsPackage.DECLARATION__ENAME:
				return ENAME_EDEFAULT == null ? ename != null : !ENAME_EDEFAULT.equals(ename);
			case HillsPackage.DECLARATION__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case HillsPackage.DECLARATION__PREDICATS:
				return predicats != null && !predicats.isEmpty();
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
		result.append(" (ename: ");
		result.append(ename);
		result.append(')');
		return result.toString();
	}

} //DeclarationImpl
