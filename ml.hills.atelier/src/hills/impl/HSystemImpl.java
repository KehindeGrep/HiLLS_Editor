/**
 */
package hills.impl;

import hills.Configuration;
import hills.Declaration;
import hills.Function;
import hills.HSystem;
import hills.HillsPackage;
import hills.TestNode;
import hills.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HSystem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hills.impl.HSystemImpl#getDeclaratios <em>Declaratios</em>}</li>
 *   <li>{@link hills.impl.HSystemImpl#getFonctions <em>Fonctions</em>}</li>
 *   <li>{@link hills.impl.HSystemImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link hills.impl.HSystemImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link hills.impl.HSystemImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HSystemImpl extends HClassifierImpl implements HSystem {
	/**
	 * The cached value of the '{@link #getDeclaratios() <em>Declaratios</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaratios()
	 * @generated
	 * @ordered
	 */
	protected EList<Declaration> declaratios;

	/**
	 * The cached value of the '{@link #getFonctions() <em>Fonctions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFonctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> fonctions;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<Configuration> configurations;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<TestNode> conditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HillsPackage.Literals.HSYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Declaration> getDeclaratios() {
		if (declaratios == null) {
			declaratios = new EObjectContainmentEList<Declaration>(Declaration.class, this, HillsPackage.HSYSTEM__DECLARATIOS);
		}
		return declaratios;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Function> getFonctions() {
		if (fonctions == null) {
			fonctions = new EObjectContainmentEList<Function>(Function.class, this, HillsPackage.HSYSTEM__FONCTIONS);
		}
		return fonctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Configuration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<Configuration>(Configuration.class, this, HillsPackage.HSYSTEM__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, HillsPackage.HSYSTEM__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TestNode> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<TestNode>(TestNode.class, this, HillsPackage.HSYSTEM__CONDITIONS);
		}
		return conditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HillsPackage.HSYSTEM__DECLARATIOS:
				return ((InternalEList<?>)getDeclaratios()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSYSTEM__FONCTIONS:
				return ((InternalEList<?>)getFonctions()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSYSTEM__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSYSTEM__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case HillsPackage.HSYSTEM__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
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
			case HillsPackage.HSYSTEM__DECLARATIOS:
				return getDeclaratios();
			case HillsPackage.HSYSTEM__FONCTIONS:
				return getFonctions();
			case HillsPackage.HSYSTEM__CONFIGURATIONS:
				return getConfigurations();
			case HillsPackage.HSYSTEM__TRANSITIONS:
				return getTransitions();
			case HillsPackage.HSYSTEM__CONDITIONS:
				return getConditions();
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
			case HillsPackage.HSYSTEM__DECLARATIOS:
				getDeclaratios().clear();
				getDeclaratios().addAll((Collection<? extends Declaration>)newValue);
				return;
			case HillsPackage.HSYSTEM__FONCTIONS:
				getFonctions().clear();
				getFonctions().addAll((Collection<? extends Function>)newValue);
				return;
			case HillsPackage.HSYSTEM__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends Configuration>)newValue);
				return;
			case HillsPackage.HSYSTEM__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case HillsPackage.HSYSTEM__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends TestNode>)newValue);
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
			case HillsPackage.HSYSTEM__DECLARATIOS:
				getDeclaratios().clear();
				return;
			case HillsPackage.HSYSTEM__FONCTIONS:
				getFonctions().clear();
				return;
			case HillsPackage.HSYSTEM__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case HillsPackage.HSYSTEM__TRANSITIONS:
				getTransitions().clear();
				return;
			case HillsPackage.HSYSTEM__CONDITIONS:
				getConditions().clear();
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
			case HillsPackage.HSYSTEM__DECLARATIOS:
				return declaratios != null && !declaratios.isEmpty();
			case HillsPackage.HSYSTEM__FONCTIONS:
				return fonctions != null && !fonctions.isEmpty();
			case HillsPackage.HSYSTEM__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case HillsPackage.HSYSTEM__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case HillsPackage.HSYSTEM__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HSystemImpl
