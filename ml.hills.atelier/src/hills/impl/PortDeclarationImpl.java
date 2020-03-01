/**
 */
package hills.impl;

import hills.HillsPackage;
import hills.PortDeclaration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.PortDeclarationImpl#getPdeclaration <em>Pdeclaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortDeclarationImpl extends EObjectImpl implements PortDeclaration {
	/**
	 * The default value of the '{@link #getPdeclaration() <em>Pdeclaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String PDECLARATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPdeclaration() <em>Pdeclaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPdeclaration()
	 * @generated
	 * @ordered
	 */
	protected String pdeclaration = PDECLARATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.PORT_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPdeclaration() {
		return pdeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPdeclaration(String newPdeclaration) {
		String oldPdeclaration = pdeclaration;
		pdeclaration = newPdeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HillsPackage.PORT_DECLARATION__PDECLARATION, oldPdeclaration, pdeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HillsPackage.PORT_DECLARATION__PDECLARATION:
				return getPdeclaration();
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
			case HillsPackage.PORT_DECLARATION__PDECLARATION:
				setPdeclaration((String)newValue);
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
			case HillsPackage.PORT_DECLARATION__PDECLARATION:
				setPdeclaration(PDECLARATION_EDEFAULT);
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
			case HillsPackage.PORT_DECLARATION__PDECLARATION:
				return PDECLARATION_EDEFAULT == null ? pdeclaration != null : !PDECLARATION_EDEFAULT.equals(pdeclaration);
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
		result.append(" (pdeclaration: ");
		result.append(pdeclaration);
		result.append(')');
		return result.toString();
	}

} //PortDeclarationImpl
