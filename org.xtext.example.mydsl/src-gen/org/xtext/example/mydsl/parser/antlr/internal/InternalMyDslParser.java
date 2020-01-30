package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MyFSM'", "'initialState'", "'state'", "','", "'tr'", "'finalState'", "'from'", "'to'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MyFSM";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMyFSM"
    // InternalMyDsl.g:64:1: entryRuleMyFSM returns [EObject current=null] : iv_ruleMyFSM= ruleMyFSM EOF ;
    public final EObject entryRuleMyFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyFSM = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleMyFSM= ruleMyFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleMyFSM= ruleMyFSM EOF
            {
             newCompositeNode(grammarAccess.getMyFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMyFSM=ruleMyFSM();

            state._fsp--;

             current =iv_ruleMyFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMyFSM"


    // $ANTLR start "ruleMyFSM"
    // InternalMyDsl.g:71:1: ruleMyFSM returns [EObject current=null] : ( () otherlv_1= 'MyFSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initialState' ( ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* ) | (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* ) )* ) ;
    public final EObject ruleMyFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_state_8_0 = null;

        EObject lv_state_10_0 = null;

        EObject lv_tr_12_0 = null;

        EObject lv_tr_14_0 = null;

        EObject lv_state_16_0 = null;

        EObject lv_state_18_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'MyFSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initialState' ( ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* ) | (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* ) )* ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'MyFSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initialState' ( ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* ) | (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* ) )* )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'MyFSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initialState' ( ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* ) | (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* ) )* )
            // InternalMyDsl.g:79:3: () otherlv_1= 'MyFSM' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'initialState' ( ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) ) ) ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* ) | (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMyFSMAccess().getMyFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMyFSMAccess().getMyFSMKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMyFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMyFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMyFSMAccess().getInitialStateKeyword_3());
            		
            // InternalMyDsl.g:113:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:114:4: ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:114:4: ( ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:115:5: ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMyFSMAccess().getUnorderedGroup_4());
            				
            // InternalMyDsl.g:118:5: ( ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:119:6: ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:119:6: ( ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 0) || getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 1) ) ) {
                    int LA1_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 0) ) {
                        alt1=1;
                    }
                    else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 1) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:120:4: ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:120:4: ({...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) ) )
            	    // InternalMyDsl.g:121:5: {...}? => ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMyFSM", "getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalMyDsl.g:121:102: ( ({...}? => ( (lv_state_5_0= ruleInitialState ) ) ) )
            	    // InternalMyDsl.g:122:6: ({...}? => ( (lv_state_5_0= ruleInitialState ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalMyDsl.g:125:9: ({...}? => ( (lv_state_5_0= ruleInitialState ) ) )
            	    // InternalMyDsl.g:125:10: {...}? => ( (lv_state_5_0= ruleInitialState ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMyFSM", "true");
            	    }
            	    // InternalMyDsl.g:125:19: ( (lv_state_5_0= ruleInitialState ) )
            	    // InternalMyDsl.g:125:20: (lv_state_5_0= ruleInitialState )
            	    {
            	    // InternalMyDsl.g:125:20: (lv_state_5_0= ruleInitialState )
            	    // InternalMyDsl.g:126:10: lv_state_5_0= ruleInitialState
            	    {

            	    										newCompositeNode(grammarAccess.getMyFSMAccess().getStateInitialStateParserRuleCall_4_0_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_state_5_0=ruleInitialState();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    										}
            	    										add(
            	    											current,
            	    											"state",
            	    											lv_state_5_0,
            	    											"org.xtext.example.mydsl.MyDsl.InitialState");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMyFSMAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:148:4: ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:148:4: ({...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) ) )
            	    // InternalMyDsl.g:149:5: {...}? => ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMyFSM", "getUnorderedGroupHelper().canSelect(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalMyDsl.g:149:102: ( ({...}? => ( (otherlv_6= RULE_ID ) ) ) )
            	    // InternalMyDsl.g:150:6: ({...}? => ( (otherlv_6= RULE_ID ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMyFSMAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalMyDsl.g:153:9: ({...}? => ( (otherlv_6= RULE_ID ) ) )
            	    // InternalMyDsl.g:153:10: {...}? => ( (otherlv_6= RULE_ID ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMyFSM", "true");
            	    }
            	    // InternalMyDsl.g:153:19: ( (otherlv_6= RULE_ID ) )
            	    // InternalMyDsl.g:153:20: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMyDsl.g:153:20: (otherlv_6= RULE_ID )
            	    // InternalMyDsl.g:154:10: otherlv_6= RULE_ID
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMyFSMRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_5); 

            	    										newLeafNode(otherlv_6, grammarAccess.getMyFSMAccess().getInitialstateInitialStateCrossReference_4_1_0());
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMyFSMAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMyFSMAccess().getUnorderedGroup_4()) ) {
                throw new FailedPredicateException(input, "ruleMyFSM", "getUnorderedGroupHelper().canLeave(grammarAccess.getMyFSMAccess().getUnorderedGroup_4())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMyFSMAccess().getUnorderedGroup_4());
            				

            }

            // InternalMyDsl.g:178:3: ( (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* ) | (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* ) | (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* ) )*
            loop5:
            do {
                int alt5=4;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    alt5=1;
                    }
                    break;
                case 15:
                    {
                    alt5=2;
                    }
                    break;
                case 16:
                    {
                    alt5=3;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:179:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    {
            	    // InternalMyDsl.g:179:4: (otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )* )
            	    // InternalMyDsl.g:180:5: otherlv_7= 'state' ( (lv_state_8_0= ruleState ) ) (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getMyFSMAccess().getStateKeyword_5_0_0());
            	    				
            	    // InternalMyDsl.g:184:5: ( (lv_state_8_0= ruleState ) )
            	    // InternalMyDsl.g:185:6: (lv_state_8_0= ruleState )
            	    {
            	    // InternalMyDsl.g:185:6: (lv_state_8_0= ruleState )
            	    // InternalMyDsl.g:186:7: lv_state_8_0= ruleState
            	    {

            	    							newCompositeNode(grammarAccess.getMyFSMAccess().getStateStateParserRuleCall_5_0_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_state_8_0=ruleState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_8_0,
            	    								"org.xtext.example.mydsl.MyDsl.State");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:203:5: (otherlv_9= ',' ( (lv_state_10_0= ruleState ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==14) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:204:6: otherlv_9= ',' ( (lv_state_10_0= ruleState ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,14,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_9, grammarAccess.getMyFSMAccess().getCommaKeyword_5_0_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:208:6: ( (lv_state_10_0= ruleState ) )
            	    	    // InternalMyDsl.g:209:7: (lv_state_10_0= ruleState )
            	    	    {
            	    	    // InternalMyDsl.g:209:7: (lv_state_10_0= ruleState )
            	    	    // InternalMyDsl.g:210:8: lv_state_10_0= ruleState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getMyFSMAccess().getStateStateParserRuleCall_5_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_state_10_0=ruleState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_10_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.State");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:230:4: (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* )
            	    {
            	    // InternalMyDsl.g:230:4: (otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )* )
            	    // InternalMyDsl.g:231:5: otherlv_11= 'tr' ( (lv_tr_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getMyFSMAccess().getTrKeyword_5_1_0());
            	    				
            	    // InternalMyDsl.g:235:5: ( (lv_tr_12_0= ruleTransition ) )
            	    // InternalMyDsl.g:236:6: (lv_tr_12_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:236:6: (lv_tr_12_0= ruleTransition )
            	    // InternalMyDsl.g:237:7: lv_tr_12_0= ruleTransition
            	    {

            	    							newCompositeNode(grammarAccess.getMyFSMAccess().getTrTransitionParserRuleCall_5_1_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_tr_12_0=ruleTransition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"tr",
            	    								lv_tr_12_0,
            	    								"org.xtext.example.mydsl.MyDsl.Transition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:254:5: (otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==14) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:255:6: otherlv_13= ',' ( (lv_tr_14_0= ruleTransition ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,14,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_13, grammarAccess.getMyFSMAccess().getCommaKeyword_5_1_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:259:6: ( (lv_tr_14_0= ruleTransition ) )
            	    	    // InternalMyDsl.g:260:7: (lv_tr_14_0= ruleTransition )
            	    	    {
            	    	    // InternalMyDsl.g:260:7: (lv_tr_14_0= ruleTransition )
            	    	    // InternalMyDsl.g:261:8: lv_tr_14_0= ruleTransition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getMyFSMAccess().getTrTransitionParserRuleCall_5_1_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_tr_14_0=ruleTransition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"tr",
            	    	    									lv_tr_14_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.Transition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:281:4: (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* )
            	    {
            	    // InternalMyDsl.g:281:4: (otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )* )
            	    // InternalMyDsl.g:282:5: otherlv_15= 'finalState' ( (lv_state_16_0= ruleFinalState ) ) (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )*
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_3); 

            	    					newLeafNode(otherlv_15, grammarAccess.getMyFSMAccess().getFinalStateKeyword_5_2_0());
            	    				
            	    // InternalMyDsl.g:286:5: ( (lv_state_16_0= ruleFinalState ) )
            	    // InternalMyDsl.g:287:6: (lv_state_16_0= ruleFinalState )
            	    {
            	    // InternalMyDsl.g:287:6: (lv_state_16_0= ruleFinalState )
            	    // InternalMyDsl.g:288:7: lv_state_16_0= ruleFinalState
            	    {

            	    							newCompositeNode(grammarAccess.getMyFSMAccess().getStateFinalStateParserRuleCall_5_2_1_0());
            	    						
            	    pushFollow(FOLLOW_6);
            	    lv_state_16_0=ruleFinalState();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    							}
            	    							add(
            	    								current,
            	    								"state",
            	    								lv_state_16_0,
            	    								"org.xtext.example.mydsl.MyDsl.FinalState");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:305:5: (otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==14) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:306:6: otherlv_17= ',' ( (lv_state_18_0= ruleFinalState ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,14,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_17, grammarAccess.getMyFSMAccess().getCommaKeyword_5_2_2_0());
            	    	    					
            	    	    // InternalMyDsl.g:310:6: ( (lv_state_18_0= ruleFinalState ) )
            	    	    // InternalMyDsl.g:311:7: (lv_state_18_0= ruleFinalState )
            	    	    {
            	    	    // InternalMyDsl.g:311:7: (lv_state_18_0= ruleFinalState )
            	    	    // InternalMyDsl.g:312:8: lv_state_18_0= ruleFinalState
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getMyFSMAccess().getStateFinalStateParserRuleCall_5_2_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_state_18_0=ruleFinalState();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getMyFSMRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"state",
            	    	    									lv_state_18_0,
            	    	    									"org.xtext.example.mydsl.MyDsl.FinalState");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMyFSM"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:336:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:336:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:337:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:343:1: ruleState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:349:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:350:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:350:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:351:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:351:3: ()
            // InternalMyDsl.g:352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:358:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:359:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:359:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:360:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleFinalState"
    // InternalMyDsl.g:381:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalMyDsl.g:381:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalMyDsl.g:382:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalMyDsl.g:388:1: ruleFinalState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:394:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:395:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:395:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:396:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:396:3: ()
            // InternalMyDsl.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:403:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:404:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:404:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:405:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleInitialState"
    // InternalMyDsl.g:426:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalMyDsl.g:426:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalMyDsl.g:427:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMyDsl.g:433:1: ruleInitialState returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:439:2: ( ( () ( (lv_name_1_0= ruleEString ) ) ) )
            // InternalMyDsl.g:440:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:440:2: ( () ( (lv_name_1_0= ruleEString ) ) )
            // InternalMyDsl.g:441:3: () ( (lv_name_1_0= ruleEString ) )
            {
            // InternalMyDsl.g:441:3: ()
            // InternalMyDsl.g:442:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:448:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:449:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:449:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:450:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:471:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:471:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:472:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:478:1: ruleTransition returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:484:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) ) )
            // InternalMyDsl.g:485:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) )
            {
            // InternalMyDsl.g:485:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) )
            // InternalMyDsl.g:486:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) )
            {
            // InternalMyDsl.g:486:3: ()
            // InternalMyDsl.g:487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:493:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:494:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:494:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:495:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getFromKeyword_2());
            		
            // InternalMyDsl.g:516:3: ( ( ruleEString ) )
            // InternalMyDsl.g:517:4: ( ruleEString )
            {
            // InternalMyDsl.g:517:4: ( ruleEString )
            // InternalMyDsl.g:518:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getToKeyword_4());
            		
            // InternalMyDsl.g:536:3: ( ( ruleEString ) )
            // InternalMyDsl.g:537:4: ( ruleEString )
            {
            // InternalMyDsl.g:537:4: ( ruleEString )
            // InternalMyDsl.g:538:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getToStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:556:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:556:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:557:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:563:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:569:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:570:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:570:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:571:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:579:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001A032L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});

}
