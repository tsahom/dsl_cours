/**
 */
package statemachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link statemachine.MyFSM#getState <em>State</em>}</li>
 *   <li>{@link statemachine.MyFSM#getTr <em>Tr</em>}</li>
 *   <li>{@link statemachine.MyFSM#getName <em>Name</em>}</li>
 *   <li>{@link statemachine.MyFSM#getInitialstate <em>Initialstate</em>}</li>
 * </ul>
 *
 * @see statemachine.StatemachinePackage#getMyFSM()
 * @model
 * @generated
 */
public interface MyFSM extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getMyFSM_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference list.
	 * The list contents are of type {@link statemachine.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference list.
	 * @see statemachine.StatemachinePackage#getMyFSM_Tr()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTr();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see statemachine.StatemachinePackage#getMyFSM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link statemachine.MyFSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initialstate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialstate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initialstate</em>' reference.
	 * @see #setInitialstate(InitialState)
	 * @see statemachine.StatemachinePackage#getMyFSM_Initialstate()
	 * @model
	 * @generated
	 */
	InitialState getInitialstate();

	/**
	 * Sets the value of the '{@link statemachine.MyFSM#getInitialstate <em>Initialstate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialstate</em>' reference.
	 * @see #getInitialstate()
	 * @generated
	 */
	void setInitialstate(InitialState value);

} // MyFSM
