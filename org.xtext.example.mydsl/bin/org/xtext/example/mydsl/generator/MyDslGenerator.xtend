/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import statemachine.MyFSM
import statemachine.FinalState
import statemachine.InitialState

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MyDslGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		var myFSM = resource.contents.get(0) as MyFSM
		
		fsa.generateFile('FSM.java', 
'''import java.util.ArrayList;

abstract class FSM {
	static State currentState;
	static ArrayList<State> states;
	static ArrayList<Transition> transitions;
}''')
		
		fsa.generateFile(myFSM.name + ".java", 
'''import java.util.ArrayList;

class �myFSM.name� extends FSM {
	public static void main(String[] args){
		states = new ArrayList<State>();
		transitions = new ArrayList<Transition>();
		�FOR s:myFSM.state�
			�IF (s instanceof FinalState)�
				State �s.name� = new FinalState("�s.name�");
				states.add(�s.name�);
			�ELSEIF (s instanceof InitialState)�
				State �s.name� = new InitialState("�s.name�");
				states.add(�s.name�);
			�ELSE�
				State �s.name� = new State("�s.name�");
				states.add(�s.name�);
			�ENDIF�
		�ENDFOR�
		�FOR t:myFSM.tr�
		Transition �t.name� = new Transition(�t.from.name�,�t.to.name�);
		transitions.add(�t.name�);
		�ENDFOR�
		currentState = �myFSM.initialstate.name�;
		currentState.getState();
		while(true){
			for(int i = 0;i<transitions.size();i++){
				if(currentState == transitions.get(i).getFrom()){
					currentState = transitions.get(i).getTo();
					currentState.getState();
					break;
				}	
			}
			if(currentState instanceof FinalState){
				break;
			}
		}
		System.out.println("End");
	}
}''')

		fsa.generateFile("State.java", 
'''class State{
	String name;
	State(String name){
		this.name = name;
	}	

	public void getState(){
		System.out.println(name);
	}
}''')

		fsa.generateFile("InitialState.java", 
'''class InitialState extends State{
	InitialState(String name){
		super(name);
	}
}''')

		fsa.generateFile("FinalState.java", 
'''class FinalState extends State{
	FinalState(String name){
		super(name);
	}
}''')

		fsa.generateFile("Transition.java", 
'''public class Transition{ 
	State from;
	State to;
	
	Transition(State s1, State s2){
			from = s1;
			to = s2;
	}
	
	State getFrom(){
		return from;
	}
	
	State getTo(){
			return to;
		}
}''')
		}
}
