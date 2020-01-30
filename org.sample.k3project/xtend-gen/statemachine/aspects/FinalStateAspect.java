package statemachine.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import statemachine.FinalState;
import statemachine.aspects.StateAspect;

@Aspect(className = FinalState.class)
@SuppressWarnings("all")
public class FinalStateAspect extends StateAspect {
}
