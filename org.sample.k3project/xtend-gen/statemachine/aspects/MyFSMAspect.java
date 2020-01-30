package statemachine.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import statemachine.FinalState;
import statemachine.InitialState;
import statemachine.MyFSM;
import statemachine.State;
import statemachine.Transition;
import statemachine.aspects.MyFSMAspectMyFSMAspectProperties;

@Aspect(className = MyFSM.class)
@SuppressWarnings("all")
public class MyFSMAspect {
  public static void execute(final MyFSM _self) {
    final statemachine.aspects.MyFSMAspectMyFSMAspectProperties _self_ = statemachine.aspects.MyFSMAspectMyFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void execute()
    if (_self instanceof statemachine.MyFSM){
    	statemachine.aspects.MyFSMAspect._privk3_execute(_self_, (statemachine.MyFSM)_self);
    };
  }
  
  private static State currentState(final MyFSM _self) {
    final statemachine.aspects.MyFSMAspectMyFSMAspectProperties _self_ = statemachine.aspects.MyFSMAspectMyFSMAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# State currentState()
    if (_self instanceof statemachine.MyFSM){
    	result = statemachine.aspects.MyFSMAspect._privk3_currentState(_self_, (statemachine.MyFSM)_self);
    };
    return (statemachine.State)result;
  }
  
  private static void currentState(final MyFSM _self, final State currentState) {
    final statemachine.aspects.MyFSMAspectMyFSMAspectProperties _self_ = statemachine.aspects.MyFSMAspectMyFSMAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void currentState(State)
    if (_self instanceof statemachine.MyFSM){
    	statemachine.aspects.MyFSMAspect._privk3_currentState(_self_, (statemachine.MyFSM)_self,currentState);
    };
  }
  
  protected static void _privk3_execute(final MyFSMAspectMyFSMAspectProperties _self_, final MyFSM _self) {
    EList<State> _state = _self.getState();
    for (final State state : _state) {
      if ((state instanceof InitialState)) {
        MyFSMAspect.currentState(_self, state);
        InputOutput.<String>println(MyFSMAspect.currentState(_self).getName());
      }
    }
    while (true) {
      {
        EList<Transition> _tr = _self.getTr();
        for (final Transition tr : _tr) {
          State _currentState = MyFSMAspect.currentState(_self);
          State _from = tr.getFrom();
          boolean _equals = Objects.equal(_currentState, _from);
          if (_equals) {
            MyFSMAspect.currentState(_self, tr.getTo());
            InputOutput.<String>println(MyFSMAspect.currentState(_self).getName());
          }
        }
        State _currentState_1 = MyFSMAspect.currentState(_self);
        if ((_currentState_1 instanceof FinalState)) {
          return;
        }
      }
    }
  }
  
  protected static State _privk3_currentState(final MyFSMAspectMyFSMAspectProperties _self_, final MyFSM _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentState") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (statemachine.State) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentState;
  }
  
  protected static void _privk3_currentState(final MyFSMAspectMyFSMAspectProperties _self_, final MyFSM _self, final State currentState) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentState")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentState);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.currentState = currentState;
    }
  }
}
