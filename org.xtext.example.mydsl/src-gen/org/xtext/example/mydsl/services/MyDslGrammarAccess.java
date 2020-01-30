/*
 * generated by Xtext 2.14.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class MyFSMElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.MyFSM");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyFSMAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMyFSMKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInitialStateKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final UnorderedGroup cUnorderedGroup_4 = (UnorderedGroup)cGroup.eContents().get(4);
		private final Assignment cStateAssignment_4_0 = (Assignment)cUnorderedGroup_4.eContents().get(0);
		private final RuleCall cStateInitialStateParserRuleCall_4_0_0 = (RuleCall)cStateAssignment_4_0.eContents().get(0);
		private final Assignment cInitialstateAssignment_4_1 = (Assignment)cUnorderedGroup_4.eContents().get(1);
		private final CrossReference cInitialstateInitialStateCrossReference_4_1_0 = (CrossReference)cInitialstateAssignment_4_1.eContents().get(0);
		private final RuleCall cInitialstateInitialStateIDTerminalRuleCall_4_1_0_1 = (RuleCall)cInitialstateInitialStateCrossReference_4_1_0.eContents().get(1);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cStateKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cStateAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_5_0_1_0 = (RuleCall)cStateAssignment_5_0_1.eContents().get(0);
		private final Group cGroup_5_0_2 = (Group)cGroup_5_0.eContents().get(2);
		private final Keyword cCommaKeyword_5_0_2_0 = (Keyword)cGroup_5_0_2.eContents().get(0);
		private final Assignment cStateAssignment_5_0_2_1 = (Assignment)cGroup_5_0_2.eContents().get(1);
		private final RuleCall cStateStateParserRuleCall_5_0_2_1_0 = (RuleCall)cStateAssignment_5_0_2_1.eContents().get(0);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final Keyword cTrKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cTrAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final RuleCall cTrTransitionParserRuleCall_5_1_1_0 = (RuleCall)cTrAssignment_5_1_1.eContents().get(0);
		private final Group cGroup_5_1_2 = (Group)cGroup_5_1.eContents().get(2);
		private final Keyword cCommaKeyword_5_1_2_0 = (Keyword)cGroup_5_1_2.eContents().get(0);
		private final Assignment cTrAssignment_5_1_2_1 = (Assignment)cGroup_5_1_2.eContents().get(1);
		private final RuleCall cTrTransitionParserRuleCall_5_1_2_1_0 = (RuleCall)cTrAssignment_5_1_2_1.eContents().get(0);
		private final Group cGroup_5_2 = (Group)cAlternatives_5.eContents().get(2);
		private final Keyword cFinalStateKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Assignment cStateAssignment_5_2_1 = (Assignment)cGroup_5_2.eContents().get(1);
		private final RuleCall cStateFinalStateParserRuleCall_5_2_1_0 = (RuleCall)cStateAssignment_5_2_1.eContents().get(0);
		private final Group cGroup_5_2_2 = (Group)cGroup_5_2.eContents().get(2);
		private final Keyword cCommaKeyword_5_2_2_0 = (Keyword)cGroup_5_2_2.eContents().get(0);
		private final Assignment cStateAssignment_5_2_2_1 = (Assignment)cGroup_5_2_2.eContents().get(1);
		private final RuleCall cStateFinalStateParserRuleCall_5_2_2_1_0 = (RuleCall)cStateAssignment_5_2_2_1.eContents().get(0);
		
		//MyFSM:
		//	{MyFSM}
		//	'MyFSM'
		//	name=EString
		//	"initialState" (state+=InitialState & initialstate=[InitialState]) ('state' state+=State ("," state+=State)* | 'tr'
		//	tr+=Transition ("," tr+=Transition)* | "finalState" state+=FinalState ("," state+=FinalState)*)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyFSM} 'MyFSM' name=EString "initialState" (state+=InitialState & initialstate=[InitialState]) ('state' state+=State
		//("," state+=State)* | 'tr' tr+=Transition ("," tr+=Transition)* | "finalState" state+=FinalState (","
		//state+=FinalState)*)*
		public Group getGroup() { return cGroup; }
		
		//{MyFSM}
		public Action getMyFSMAction_0() { return cMyFSMAction_0; }
		
		//'MyFSM'
		public Keyword getMyFSMKeyword_1() { return cMyFSMKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//"initialState"
		public Keyword getInitialStateKeyword_3() { return cInitialStateKeyword_3; }
		
		//state+=InitialState & initialstate=[InitialState]
		public UnorderedGroup getUnorderedGroup_4() { return cUnorderedGroup_4; }
		
		//state+=InitialState
		public Assignment getStateAssignment_4_0() { return cStateAssignment_4_0; }
		
		//InitialState
		public RuleCall getStateInitialStateParserRuleCall_4_0_0() { return cStateInitialStateParserRuleCall_4_0_0; }
		
		//initialstate=[InitialState]
		public Assignment getInitialstateAssignment_4_1() { return cInitialstateAssignment_4_1; }
		
		//[InitialState]
		public CrossReference getInitialstateInitialStateCrossReference_4_1_0() { return cInitialstateInitialStateCrossReference_4_1_0; }
		
		//ID
		public RuleCall getInitialstateInitialStateIDTerminalRuleCall_4_1_0_1() { return cInitialstateInitialStateIDTerminalRuleCall_4_1_0_1; }
		
		//('state' state+=State ("," state+=State)* | 'tr' tr+=Transition ("," tr+=Transition)* | "finalState" state+=FinalState
		//("," state+=FinalState)*)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'state' state+=State ("," state+=State)*
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'state'
		public Keyword getStateKeyword_5_0_0() { return cStateKeyword_5_0_0; }
		
		//state+=State
		public Assignment getStateAssignment_5_0_1() { return cStateAssignment_5_0_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_5_0_1_0() { return cStateStateParserRuleCall_5_0_1_0; }
		
		//("," state+=State)*
		public Group getGroup_5_0_2() { return cGroup_5_0_2; }
		
		//","
		public Keyword getCommaKeyword_5_0_2_0() { return cCommaKeyword_5_0_2_0; }
		
		//state+=State
		public Assignment getStateAssignment_5_0_2_1() { return cStateAssignment_5_0_2_1; }
		
		//State
		public RuleCall getStateStateParserRuleCall_5_0_2_1_0() { return cStateStateParserRuleCall_5_0_2_1_0; }
		
		//'tr' tr+=Transition ("," tr+=Transition)*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//'tr'
		public Keyword getTrKeyword_5_1_0() { return cTrKeyword_5_1_0; }
		
		//tr+=Transition
		public Assignment getTrAssignment_5_1_1() { return cTrAssignment_5_1_1; }
		
		//Transition
		public RuleCall getTrTransitionParserRuleCall_5_1_1_0() { return cTrTransitionParserRuleCall_5_1_1_0; }
		
		//("," tr+=Transition)*
		public Group getGroup_5_1_2() { return cGroup_5_1_2; }
		
		//","
		public Keyword getCommaKeyword_5_1_2_0() { return cCommaKeyword_5_1_2_0; }
		
		//tr+=Transition
		public Assignment getTrAssignment_5_1_2_1() { return cTrAssignment_5_1_2_1; }
		
		//Transition
		public RuleCall getTrTransitionParserRuleCall_5_1_2_1_0() { return cTrTransitionParserRuleCall_5_1_2_1_0; }
		
		//"finalState" state+=FinalState ("," state+=FinalState)*
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//"finalState"
		public Keyword getFinalStateKeyword_5_2_0() { return cFinalStateKeyword_5_2_0; }
		
		//state+=FinalState
		public Assignment getStateAssignment_5_2_1() { return cStateAssignment_5_2_1; }
		
		//FinalState
		public RuleCall getStateFinalStateParserRuleCall_5_2_1_0() { return cStateFinalStateParserRuleCall_5_2_1_0; }
		
		//("," state+=FinalState)*
		public Group getGroup_5_2_2() { return cGroup_5_2_2; }
		
		//","
		public Keyword getCommaKeyword_5_2_2_0() { return cCommaKeyword_5_2_2_0; }
		
		//state+=FinalState
		public Assignment getStateAssignment_5_2_2_1() { return cStateAssignment_5_2_2_1; }
		
		//FinalState
		public RuleCall getStateFinalStateParserRuleCall_5_2_2_1_0() { return cStateFinalStateParserRuleCall_5_2_2_1_0; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.State");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//State:
		//	{State} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{State} name=EString
		public Group getGroup() { return cGroup; }
		
		//{State}
		public Action getStateAction_0() { return cStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class FinalStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.FinalState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFinalStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//FinalState:
		//	{FinalState} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{FinalState} name=EString
		public Group getGroup() { return cGroup; }
		
		//{FinalState}
		public Action getFinalStateAction_0() { return cFinalStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class InitialStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.InitialState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInitialStateAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//InitialState:
		//	{InitialState} name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{InitialState} name=EString
		public Group getGroup() { return cGroup; }
		
		//{InitialState}
		public Action getInitialStateAction_0() { return cInitialStateAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cFromAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cFromStateCrossReference_3_0 = (CrossReference)cFromAssignment_3.eContents().get(0);
		private final RuleCall cFromStateEStringParserRuleCall_3_0_1 = (RuleCall)cFromStateCrossReference_3_0.eContents().get(1);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cToAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cToStateCrossReference_5_0 = (CrossReference)cToAssignment_5.eContents().get(0);
		private final RuleCall cToStateEStringParserRuleCall_5_0_1 = (RuleCall)cToStateCrossReference_5_0.eContents().get(1);
		
		//Transition:
		//	{Transition} name=EString
		//	'from' from=[State|EString]
		//	'to' to=[State|EString];
		@Override public ParserRule getRule() { return rule; }
		
		//{Transition} name=EString 'from' from=[State|EString] 'to' to=[State|EString]
		public Group getGroup() { return cGroup; }
		
		//{Transition}
		public Action getTransitionAction_0() { return cTransitionAction_0; }
		
		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//from=[State|EString]
		public Assignment getFromAssignment_3() { return cFromAssignment_3; }
		
		//[State|EString]
		public CrossReference getFromStateCrossReference_3_0() { return cFromStateCrossReference_3_0; }
		
		//EString
		public RuleCall getFromStateEStringParserRuleCall_3_0_1() { return cFromStateEStringParserRuleCall_3_0_1; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//to=[State|EString]
		public Assignment getToAssignment_5() { return cToAssignment_5; }
		
		//[State|EString]
		public CrossReference getToStateCrossReference_5_0() { return cToStateCrossReference_5_0; }
		
		//EString
		public RuleCall getToStateEStringParserRuleCall_5_0_1() { return cToStateEStringParserRuleCall_5_0_1; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	
	
	private final MyFSMElements pMyFSM;
	private final StateElements pState;
	private final FinalStateElements pFinalState;
	private final InitialStateElements pInitialState;
	private final TransitionElements pTransition;
	private final EStringElements pEString;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMyFSM = new MyFSMElements();
		this.pState = new StateElements();
		this.pFinalState = new FinalStateElements();
		this.pInitialState = new InitialStateElements();
		this.pTransition = new TransitionElements();
		this.pEString = new EStringElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//MyFSM:
	//	{MyFSM}
	//	'MyFSM'
	//	name=EString
	//	"initialState" (state+=InitialState & initialstate=[InitialState]) ('state' state+=State ("," state+=State)* | 'tr'
	//	tr+=Transition ("," tr+=Transition)* | "finalState" state+=FinalState ("," state+=FinalState)*)*;
	public MyFSMElements getMyFSMAccess() {
		return pMyFSM;
	}
	
	public ParserRule getMyFSMRule() {
		return getMyFSMAccess().getRule();
	}
	
	//State:
	//	{State} name=EString;
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//FinalState:
	//	{FinalState} name=EString;
	public FinalStateElements getFinalStateAccess() {
		return pFinalState;
	}
	
	public ParserRule getFinalStateRule() {
		return getFinalStateAccess().getRule();
	}
	
	//InitialState:
	//	{InitialState} name=EString;
	public InitialStateElements getInitialStateAccess() {
		return pInitialState;
	}
	
	public ParserRule getInitialStateRule() {
		return getInitialStateAccess().getRule();
	}
	
	//Transition:
	//	{Transition} name=EString
	//	'from' from=[State|EString]
	//	'to' to=[State|EString];
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
