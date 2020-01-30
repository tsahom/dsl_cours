package statemachine.aspects;

import java.util.Map;
import statemachine.MyFSM;
import statemachine.aspects.MyFSMAspectMyFSMAspectProperties;

@SuppressWarnings("all")
public class MyFSMAspectMyFSMAspectContext {
  public final static MyFSMAspectMyFSMAspectContext INSTANCE = new MyFSMAspectMyFSMAspectContext();
  
  public static MyFSMAspectMyFSMAspectProperties getSelf(final MyFSM _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new statemachine.aspects.MyFSMAspectMyFSMAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MyFSM, MyFSMAspectMyFSMAspectProperties> map = new java.util.WeakHashMap<statemachine.MyFSM, statemachine.aspects.MyFSMAspectMyFSMAspectProperties>();
  
  public Map<MyFSM, MyFSMAspectMyFSMAspectProperties> getMap() {
    return map;
  }
}
