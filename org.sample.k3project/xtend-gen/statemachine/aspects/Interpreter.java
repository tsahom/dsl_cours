package statemachine.aspects;

import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import statemachine.MyFSM;
import statemachine.StatemachinePackage;
import statemachine.aspects.MyFSMAspect;

@SuppressWarnings("all")
public class Interpreter {
  public static void main(final String[] args) {
    StatemachinePackage.eINSTANCE.getClass();
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put("xmi", _xMIResourceFactoryImpl);
    Resource resource = new ResourceSetImpl().getResource(URI.createURI("\\Users\\Etu\\Documents\\eclipse_Gmoc_Studio\\workspace\\statemachine\\model\\MyFSM.xmi"), true);
    EObject _get = resource.getContents().get(0);
    MyFSM myFSM = ((MyFSM) _get);
    MyFSMAspect.execute(myFSM);
  }
}
