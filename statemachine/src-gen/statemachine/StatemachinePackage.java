/**
 */
package statemachine;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see statemachine.StatemachineFactory
 * @model kind="package"
 * @generated
 */
public interface StatemachinePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "statemachine";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/statemachine";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "statemachine";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatemachinePackage eINSTANCE = statemachine.impl.StatemachinePackageImpl.init();

	/**
	 * The meta object id for the '{@link statemachine.impl.MyFSMImpl <em>My FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.MyFSMImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getMyFSM()
	 * @generated
	 */
	int MY_FSM = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FSM__STATE = 0;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FSM__TR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FSM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FSM__INITIALSTATE = 3;

	/**
	 * The number of structural features of the '<em>My FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FSM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>My FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_FSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.StateImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.TransitionImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TO = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link statemachine.impl.InitialStateImpl <em>Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.InitialStateImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getInitialState()
	 * @generated
	 */
	int INITIAL_STATE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link statemachine.impl.FinalStateImpl <em>Final State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see statemachine.impl.FinalStateImpl
	 * @see statemachine.impl.StatemachinePackageImpl#getFinalState()
	 * @generated
	 */
	int FINAL_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE__NAME = STATE__NAME;

	/**
	 * The number of structural features of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Final State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINAL_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link statemachine.MyFSM <em>My FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My FSM</em>'.
	 * @see statemachine.MyFSM
	 * @generated
	 */
	EClass getMyFSM();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.MyFSM#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see statemachine.MyFSM#getState()
	 * @see #getMyFSM()
	 * @generated
	 */
	EReference getMyFSM_State();

	/**
	 * Returns the meta object for the containment reference list '{@link statemachine.MyFSM#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see statemachine.MyFSM#getTr()
	 * @see #getMyFSM()
	 * @generated
	 */
	EReference getMyFSM_Tr();

	/**
	 * Returns the meta object for the attribute '{@link statemachine.MyFSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.MyFSM#getName()
	 * @see #getMyFSM()
	 * @generated
	 */
	EAttribute getMyFSM_Name();

	/**
	 * Returns the meta object for the reference '{@link statemachine.MyFSM#getInitialstate <em>Initialstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initialstate</em>'.
	 * @see statemachine.MyFSM#getInitialstate()
	 * @see #getMyFSM()
	 * @generated
	 */
	EReference getMyFSM_Initialstate();

	/**
	 * Returns the meta object for class '{@link statemachine.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see statemachine.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link statemachine.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link statemachine.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see statemachine.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link statemachine.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see statemachine.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see statemachine.Transition#getTo()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_To();

	/**
	 * Returns the meta object for class '{@link statemachine.InitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initial State</em>'.
	 * @see statemachine.InitialState
	 * @generated
	 */
	EClass getInitialState();

	/**
	 * Returns the meta object for class '{@link statemachine.FinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Final State</em>'.
	 * @see statemachine.FinalState
	 * @generated
	 */
	EClass getFinalState();

	/**
	 * Returns the meta object for the reference '{@link statemachine.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see statemachine.Transition#getFrom()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_From();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatemachineFactory getStatemachineFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link statemachine.impl.MyFSMImpl <em>My FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.MyFSMImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getMyFSM()
		 * @generated
		 */
		EClass MY_FSM = eINSTANCE.getMyFSM();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FSM__STATE = eINSTANCE.getMyFSM_State();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FSM__TR = eINSTANCE.getMyFSM_Tr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MY_FSM__NAME = eINSTANCE.getMyFSM_Name();

		/**
		 * The meta object literal for the '<em><b>Initialstate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_FSM__INITIALSTATE = eINSTANCE.getMyFSM_Initialstate();

		/**
		 * The meta object literal for the '{@link statemachine.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.StateImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link statemachine.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.TransitionImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TO = eINSTANCE.getTransition_To();

		/**
		 * The meta object literal for the '{@link statemachine.impl.InitialStateImpl <em>Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.InitialStateImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getInitialState()
		 * @generated
		 */
		EClass INITIAL_STATE = eINSTANCE.getInitialState();

		/**
		 * The meta object literal for the '{@link statemachine.impl.FinalStateImpl <em>Final State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see statemachine.impl.FinalStateImpl
		 * @see statemachine.impl.StatemachinePackageImpl#getFinalState()
		 * @generated
		 */
		EClass FINAL_STATE = eINSTANCE.getFinalState();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FROM = eINSTANCE.getTransition_From();

	}

} //StatemachinePackage
