package statemachine.aspects;

import java.util.Map;
import statemachine.FinalState;
import statemachine.aspects.FinalStateAspectFinalStateAspectProperties;

@SuppressWarnings("all")
public class FinalStateAspectFinalStateAspectContext {
  public final static FinalStateAspectFinalStateAspectContext INSTANCE = new FinalStateAspectFinalStateAspectContext();
  
  public static FinalStateAspectFinalStateAspectProperties getSelf(final FinalState _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.aspects.FinalStateAspectFinalStateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FinalState, FinalStateAspectFinalStateAspectProperties> map = new java.util.WeakHashMap<statemachine.FinalState, statemachine.aspects.FinalStateAspectFinalStateAspectProperties>();
  
  public Map<FinalState, FinalStateAspectFinalStateAspectProperties> getMap() {
    return map;
  }
}
