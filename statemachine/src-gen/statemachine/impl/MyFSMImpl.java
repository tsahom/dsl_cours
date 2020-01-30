/**
 */
package statemachine.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import statemachine.InitialState;
import statemachine.MyFSM;
import statemachine.State;
import statemachine.StatemachinePackage;
import statemachine.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My FSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link statemachine.impl.MyFSMImpl#getState <em>State</em>}</li>
 *   <li>{@link statemachine.impl.MyFSMImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link statemachine.impl.MyFSMImpl#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.impl.MyFSMImpl#getInitialstate <em>Initialstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MyFSMImpl extends MinimalEObjectImpl.Container implements MyFSM {
	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> tr;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialstate() <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialstate()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyFSMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinePackage.Literals.MY_FSM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, StatemachinePackage.MY_FSM__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTr() {
		if (tr == null) {
			tr = new EObjectContainmentEList<Transition>(Transition.class, this, StatemachinePackage.MY_FSM__TR);
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.MY_FSM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialstate() {
		if (initialstate != null && initialstate.eIsProxy()) {
			InternalEObject oldInitialstate = (InternalEObject) initialstate;
			initialstate = (InitialState) eResolveProxy(oldInitialstate);
			if (initialstate != oldInitialstate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatemachinePackage.MY_FSM__INITIALSTATE,
							oldInitialstate, initialstate));
			}
		}
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialstate() {
		return initialstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialstate(InitialState newInitialstate) {
		InitialState oldInitialstate = initialstate;
		initialstate = newInitialstate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatemachinePackage.MY_FSM__INITIALSTATE,
					oldInitialstate, initialstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StatemachinePackage.MY_FSM__STATE:
			return ((InternalEList<?>) getState()).basicRemove(otherEnd, msgs);
		case StatemachinePackage.MY_FSM__TR:
			return ((InternalEList<?>) getTr()).basicRemove(otherEnd, msgs);
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
		case StatemachinePackage.MY_FSM__STATE:
			return getState();
		case StatemachinePackage.MY_FSM__TR:
			return getTr();
		case StatemachinePackage.MY_FSM__NAME:
			return getName();
		case StatemachinePackage.MY_FSM__INITIALSTATE:
			if (resolve)
				return getInitialstate();
			return basicGetInitialstate();
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
		case StatemachinePackage.MY_FSM__STATE:
			getState().clear();
			getState().addAll((Collection<? extends State>) newValue);
			return;
		case StatemachinePackage.MY_FSM__TR:
			getTr().clear();
			getTr().addAll((Collection<? extends Transition>) newValue);
			return;
		case StatemachinePackage.MY_FSM__NAME:
			setName((String) newValue);
			return;
		case StatemachinePackage.MY_FSM__INITIALSTATE:
			setInitialstate((InitialState) newValue);
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
		case StatemachinePackage.MY_FSM__STATE:
			getState().clear();
			return;
		case StatemachinePackage.MY_FSM__TR:
			getTr().clear();
			return;
		case StatemachinePackage.MY_FSM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StatemachinePackage.MY_FSM__INITIALSTATE:
			setInitialstate((InitialState) null);
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
		case StatemachinePackage.MY_FSM__STATE:
			return state != null && !state.isEmpty();
		case StatemachinePackage.MY_FSM__TR:
			return tr != null && !tr.isEmpty();
		case StatemachinePackage.MY_FSM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StatemachinePackage.MY_FSM__INITIALSTATE:
			return initialstate != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MyFSMImpl
