package statemachine.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachine.InitialState;
import statemachine.aspects.StateAspect;

@Aspect(className = InitialState.class)
@SuppressWarnings("all")
public class InitialStateAspect extends StateAspect {
}
