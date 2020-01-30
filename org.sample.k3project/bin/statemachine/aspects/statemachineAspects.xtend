package statemachine.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import statemachine.MyFSM
import statemachine.State
import statemachine.Transition
import statemachine.InitialState
import statemachine.FinalState

import static extension statemachine.aspects.MyFSMAspect.*
import static extension statemachine.aspects.StateAspect.*
import static extension statemachine.aspects.TransitionAspect.*
import static extension statemachine.aspects.InitialStateAspect.*
import static extension statemachine.aspects.FinalStateAspect.*
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.resource.Resource
import statemachine.StatemachinePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI


class Interpreter {
	def static void main(String[] args) {
		StatemachinePackage.eINSTANCE.class
		Resource$Factory.Registry.INSTANCE.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl);
		var Resource resource = new ResourceSetImpl().getResource(URI.createURI('\\Users\\Etu\\Documents\\eclipse_Gmoc_Studio\\workspace\\statemachine\\model\\MyFSM.xmi'), true)
		var myFSM = resource.contents.get(0) as MyFSM
		myFSM.execute
	}
}

@Aspect(className=MyFSM)
class MyFSMAspect {
	var State currentState;
	def void execute(){
		for (State state : _self.state){
			if (state instanceof InitialState){ 
				_self.currentState = state
				println(_self.currentState.name)
			} 
		}
		while(true){
			for (Transition tr : _self.tr){
				if(_self.currentState == tr.from){
					_self.currentState = tr.to
					println(_self.currentState.name)
				}
			}
			if(_self.currentState instanceof FinalState){
				return
			}
			
		}
	}
}

@Aspect(className=State)
class StateAspect {

}

@Aspect(className=Transition)
class TransitionAspect {

}

@Aspect(className=InitialState)
class InitialStateAspect extends StateAspect {

}

@Aspect(className=FinalState)
class FinalStateAspect extends StateAspect {

}



