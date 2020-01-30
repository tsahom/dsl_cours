/**
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;
import statemachine.MyFSM;
import statemachine.State;
import statemachine.Transition;

@SuppressWarnings("all")
public class MyDslFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MyDslGrammarAccess _myDslGrammarAccess;
  
  protected void _format(final MyFSM myFSM, @Extension final IFormattableDocument document) {
    EList<State> _state = myFSM.getState();
    for (final State state : _state) {
      document.<State>format(state);
    }
    EList<Transition> _tr = myFSM.getTr();
    for (final Transition transition : _tr) {
      document.<Transition>format(transition);
    }
  }
  
  public void format(final Object myFSM, final IFormattableDocument document) {
    if (myFSM instanceof XtextResource) {
      _format((XtextResource)myFSM, document);
      return;
    } else if (myFSM instanceof MyFSM) {
      _format((MyFSM)myFSM, document);
      return;
    } else if (myFSM instanceof EObject) {
      _format((EObject)myFSM, document);
      return;
    } else if (myFSM == null) {
      _format((Void)null, document);
      return;
    } else if (myFSM != null) {
      _format(myFSM, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(myFSM, document).toString());
    }
  }
}
