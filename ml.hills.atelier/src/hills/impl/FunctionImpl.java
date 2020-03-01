/**
 */
package hills.impl;

import hills.Function;
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
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.FunctionImpl#getFname <em>Fname</em>}</li>
 *   <li>{@link hills.impl.FunctionImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link hills.impl.FunctionImpl#getPpredicats <em>Ppredicats</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends EObjectImpl implements Function {
	/**
	 * The default value of the '{@link #getFname() <em>Fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFname()
	 * @generated
	 * @ordered
	 */
	protected static final String FNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFname() <em>Fname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFname()
	 * @generated
	 * @ordered
	 */
	protected String fname = FNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclarations() <em>Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected static final String DECLARATIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected String declarations = DECLARATIONS_EDEFAULT;

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
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFname() {
		return fname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFname(String newFname) {
		String oldFname = fname;
		fname = newFname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.FUNCTION__FNAME, oldFname, fname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeclarations() {
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeclarations(String newDeclarations) {
		String oldDeclarations = declarations;
		declarations = newDeclarations;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.FUNCTION__DECLARATIONS, oldDeclarations, declarations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PortDeclaration> getPpredicats() {
		if (ppredicats == null) {
			ppredicats = new EObjectContainmentEList<PortDeclaration>(PortDeclaration.class, this, HillsPackage.FUNCTION__PPREDICATS);
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
			case HillsPackage.FUNCTION__PPREDICATS:
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
			case HillsPackage.FUNCTION__FNAME:
				return getFname();
			case HillsPackage.FUNCTION__DECLARATIONS:
				return getDeclarations();
			case HillsPackage.FUNCTION__PPREDICATS:
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
			case HillsPackage.FUNCTION__FNAME:
				setFname((String)newValue);
				return;
			case HillsPackage.FUNCTION__DECLARATIONS:
				setDeclarations((String)newValue);
				return;
			case HillsPackage.FUNCTION__PPREDICATS:
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
			case HillsPackage.FUNCTION__FNAME:
				setFname(FNAME_EDEFAULT);
				return;
			case HillsPackage.FUNCTION__DECLARATIONS:
				setDeclarations(DECLARATIONS_EDEFAULT);
				return;
			case HillsPackage.FUNCTION__PPREDICATS:
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
			case HillsPackage.FUNCTION__FNAME:
				return FNAME_EDEFAULT == null ? fname != null : !FNAME_EDEFAULT.equals(fname);
			case HillsPackage.FUNCTION__DECLARATIONS:
				return DECLARATIONS_EDEFAULT == null ? declarations != null : !DECLARATIONS_EDEFAULT.equals(declarations);
			case HillsPackage.FUNCTION__PPREDICATS:
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
		result.append(" (fname: ");
		result.append(fname);
		result.append(", declarations: ");
		result.append(declarations);
		result.append(')');
		return result.toString();
	}

} //FunctionImpl
