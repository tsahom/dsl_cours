package statemachine.aspects;

import java.util.Map;
import statemachine.InitialState;
import statemachine.aspects.InitialStateAspectInitialStateAspectProperties;

@SuppressWarnings("all")
public class InitialStateAspectInitialStateAspectContext {
  public final static InitialStateAspectInitialStateAspectContext INSTANCE = new InitialStateAspectInitialStateAspectContext();
  
  public static InitialStateAspectInitialStateAspectProperties getSelf(final InitialState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.aspects.InitialStateAspectInitialStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<InitialState, InitialStateAspectInitialStateAspectProperties> map = new java.util.WeakHashMap<statemachine.InitialState, statemachine.aspects.InitialStateAspectInitialStateAspectProperties>();
  
  public Map<InitialState, InitialStateAspectInitialStateAspectProperties> getMap() {
    return map;
  }
}
