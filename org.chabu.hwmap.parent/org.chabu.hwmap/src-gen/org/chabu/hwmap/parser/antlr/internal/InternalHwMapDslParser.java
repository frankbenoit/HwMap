package org.chabu.hwmap.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.chabu.hwmap.services.HwMapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHwMapDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_OP_2DOT", "RULE_INT_DEC", "RULE_INT_HEX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Output'", "'VHDL'", "'C'", "'Component'", "'{'", "'}'", "'Block'", "'['", "']'", "'Constant'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_OP_2DOT=6;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_INT_DEC=7;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_INT_HEX=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalHwMapDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHwMapDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHwMapDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHwMapDsl.g"; }



     	private HwMapDslGrammarAccess grammarAccess;

        public InternalHwMapDslParser(TokenStream input, HwMapDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MemoryMap";
       	}

       	@Override
       	protected HwMapDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMemoryMap"
    // InternalHwMapDsl.g:64:1: entryRuleMemoryMap returns [EObject current=null] : iv_ruleMemoryMap= ruleMemoryMap EOF ;
    public final EObject entryRuleMemoryMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemoryMap = null;


        try {
            // InternalHwMapDsl.g:64:50: (iv_ruleMemoryMap= ruleMemoryMap EOF )
            // InternalHwMapDsl.g:65:2: iv_ruleMemoryMap= ruleMemoryMap EOF
            {
             newCompositeNode(grammarAccess.getMemoryMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMemoryMap=ruleMemoryMap();

            state._fsp--;

             current =iv_ruleMemoryMap; 
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
    // $ANTLR end "entryRuleMemoryMap"


    // $ANTLR start "ruleMemoryMap"
    // InternalHwMapDsl.g:71:1: ruleMemoryMap returns [EObject current=null] : ( () ( (lv_outputs_1_0= ruleOutput ) )* ( (lv_components_2_0= ruleComponent ) ) ) ;
    public final EObject ruleMemoryMap() throws RecognitionException {
        EObject current = null;

        EObject lv_outputs_1_0 = null;

        EObject lv_components_2_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:77:2: ( ( () ( (lv_outputs_1_0= ruleOutput ) )* ( (lv_components_2_0= ruleComponent ) ) ) )
            // InternalHwMapDsl.g:78:2: ( () ( (lv_outputs_1_0= ruleOutput ) )* ( (lv_components_2_0= ruleComponent ) ) )
            {
            // InternalHwMapDsl.g:78:2: ( () ( (lv_outputs_1_0= ruleOutput ) )* ( (lv_components_2_0= ruleComponent ) ) )
            // InternalHwMapDsl.g:79:3: () ( (lv_outputs_1_0= ruleOutput ) )* ( (lv_components_2_0= ruleComponent ) )
            {
            // InternalHwMapDsl.g:79:3: ()
            // InternalHwMapDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMemoryMapAccess().getMemoryMapAction_0(),
            					current);
            			

            }

            // InternalHwMapDsl.g:86:3: ( (lv_outputs_1_0= ruleOutput ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalHwMapDsl.g:87:4: (lv_outputs_1_0= ruleOutput )
            	    {
            	    // InternalHwMapDsl.g:87:4: (lv_outputs_1_0= ruleOutput )
            	    // InternalHwMapDsl.g:88:5: lv_outputs_1_0= ruleOutput
            	    {

            	    					newCompositeNode(grammarAccess.getMemoryMapAccess().getOutputsOutputParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_outputs_1_0=ruleOutput();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMemoryMapRule());
            	    					}
            	    					add(
            	    						current,
            	    						"outputs",
            	    						lv_outputs_1_0,
            	    						"org.chabu.hwmap.HwMapDsl.Output");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalHwMapDsl.g:105:3: ( (lv_components_2_0= ruleComponent ) )
            // InternalHwMapDsl.g:106:4: (lv_components_2_0= ruleComponent )
            {
            // InternalHwMapDsl.g:106:4: (lv_components_2_0= ruleComponent )
            // InternalHwMapDsl.g:107:5: lv_components_2_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getMemoryMapAccess().getComponentsComponentParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_components_2_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMemoryMapRule());
            					}
            					add(
            						current,
            						"components",
            						lv_components_2_0,
            						"org.chabu.hwmap.HwMapDsl.Component");
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
    // $ANTLR end "ruleMemoryMap"


    // $ANTLR start "entryRuleOutput"
    // InternalHwMapDsl.g:128:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // InternalHwMapDsl.g:128:47: (iv_ruleOutput= ruleOutput EOF )
            // InternalHwMapDsl.g:129:2: iv_ruleOutput= ruleOutput EOF
            {
             newCompositeNode(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutput=ruleOutput();

            state._fsp--;

             current =iv_ruleOutput; 
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
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalHwMapDsl.g:135:1: ruleOutput returns [EObject current=null] : ( () otherlv_1= 'Output' ( ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) ) ) ( (lv_path_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_mode_2_1=null;
        Token lv_mode_2_2=null;
        Token lv_path_3_0=null;


        	enterRule();

        try {
            // InternalHwMapDsl.g:141:2: ( ( () otherlv_1= 'Output' ( ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) ) ) ( (lv_path_3_0= RULE_STRING ) ) ) )
            // InternalHwMapDsl.g:142:2: ( () otherlv_1= 'Output' ( ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            {
            // InternalHwMapDsl.g:142:2: ( () otherlv_1= 'Output' ( ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) ) ) ( (lv_path_3_0= RULE_STRING ) ) )
            // InternalHwMapDsl.g:143:3: () otherlv_1= 'Output' ( ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) ) ) ( (lv_path_3_0= RULE_STRING ) )
            {
            // InternalHwMapDsl.g:143:3: ()
            // InternalHwMapDsl.g:144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputAccess().getOutputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getOutputKeyword_1());
            		
            // InternalHwMapDsl.g:154:3: ( ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) ) )
            // InternalHwMapDsl.g:155:4: ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) )
            {
            // InternalHwMapDsl.g:155:4: ( (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' ) )
            // InternalHwMapDsl.g:156:5: (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' )
            {
            // InternalHwMapDsl.g:156:5: (lv_mode_2_1= 'VHDL' | lv_mode_2_2= 'C' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHwMapDsl.g:157:6: lv_mode_2_1= 'VHDL'
                    {
                    lv_mode_2_1=(Token)match(input,14,FOLLOW_5); 

                    						newLeafNode(lv_mode_2_1, grammarAccess.getOutputAccess().getModeVHDLKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_2_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:168:6: lv_mode_2_2= 'C'
                    {
                    lv_mode_2_2=(Token)match(input,15,FOLLOW_5); 

                    						newLeafNode(lv_mode_2_2, grammarAccess.getOutputAccess().getModeCKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOutputRule());
                    						}
                    						setWithLastConsumed(current, "mode", lv_mode_2_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalHwMapDsl.g:181:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalHwMapDsl.g:182:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalHwMapDsl.g:182:4: (lv_path_3_0= RULE_STRING )
            // InternalHwMapDsl.g:183:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_3_0, grammarAccess.getOutputAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutputRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.chabu.hwmap.HwMapDsl.STRING");
            				

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
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleComponent"
    // InternalHwMapDsl.g:203:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalHwMapDsl.g:203:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalHwMapDsl.g:204:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalHwMapDsl.g:210:1: ruleComponent returns [EObject current=null] : ( () otherlv_1= 'Component' ( (lv_compName_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_blocks_4_0= ruleBlock ) ) | ( (lv_insts_5_0= ruleInstantiation ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_compName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_blocks_4_0 = null;

        EObject lv_insts_5_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:216:2: ( ( () otherlv_1= 'Component' ( (lv_compName_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_blocks_4_0= ruleBlock ) ) | ( (lv_insts_5_0= ruleInstantiation ) ) )* otherlv_6= '}' ) )
            // InternalHwMapDsl.g:217:2: ( () otherlv_1= 'Component' ( (lv_compName_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_blocks_4_0= ruleBlock ) ) | ( (lv_insts_5_0= ruleInstantiation ) ) )* otherlv_6= '}' )
            {
            // InternalHwMapDsl.g:217:2: ( () otherlv_1= 'Component' ( (lv_compName_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_blocks_4_0= ruleBlock ) ) | ( (lv_insts_5_0= ruleInstantiation ) ) )* otherlv_6= '}' )
            // InternalHwMapDsl.g:218:3: () otherlv_1= 'Component' ( (lv_compName_2_0= RULE_ID ) ) otherlv_3= '{' ( ( (lv_blocks_4_0= ruleBlock ) ) | ( (lv_insts_5_0= ruleInstantiation ) ) )* otherlv_6= '}'
            {
            // InternalHwMapDsl.g:218:3: ()
            // InternalHwMapDsl.g:219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentAccess().getComponentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getComponentKeyword_1());
            		
            // InternalHwMapDsl.g:229:3: ( (lv_compName_2_0= RULE_ID ) )
            // InternalHwMapDsl.g:230:4: (lv_compName_2_0= RULE_ID )
            {
            // InternalHwMapDsl.g:230:4: (lv_compName_2_0= RULE_ID )
            // InternalHwMapDsl.g:231:5: lv_compName_2_0= RULE_ID
            {
            lv_compName_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_compName_2_0, grammarAccess.getComponentAccess().getCompNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"compName",
            						lv_compName_2_0,
            						"org.chabu.hwmap.HwMapDsl.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalHwMapDsl.g:251:3: ( ( (lv_blocks_4_0= ruleBlock ) ) | ( (lv_insts_5_0= ruleInstantiation ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }
                else if ( ((LA3_0>=RULE_INT_DEC && LA3_0<=RULE_INT_HEX)) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalHwMapDsl.g:252:4: ( (lv_blocks_4_0= ruleBlock ) )
            	    {
            	    // InternalHwMapDsl.g:252:4: ( (lv_blocks_4_0= ruleBlock ) )
            	    // InternalHwMapDsl.g:253:5: (lv_blocks_4_0= ruleBlock )
            	    {
            	    // InternalHwMapDsl.g:253:5: (lv_blocks_4_0= ruleBlock )
            	    // InternalHwMapDsl.g:254:6: lv_blocks_4_0= ruleBlock
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getBlocksBlockParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_blocks_4_0=ruleBlock();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"blocks",
            	    							lv_blocks_4_0,
            	    							"org.chabu.hwmap.HwMapDsl.Block");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalHwMapDsl.g:272:4: ( (lv_insts_5_0= ruleInstantiation ) )
            	    {
            	    // InternalHwMapDsl.g:272:4: ( (lv_insts_5_0= ruleInstantiation ) )
            	    // InternalHwMapDsl.g:273:5: (lv_insts_5_0= ruleInstantiation )
            	    {
            	    // InternalHwMapDsl.g:273:5: (lv_insts_5_0= ruleInstantiation )
            	    // InternalHwMapDsl.g:274:6: lv_insts_5_0= ruleInstantiation
            	    {

            	    						newCompositeNode(grammarAccess.getComponentAccess().getInstsInstantiationParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_insts_5_0=ruleInstantiation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"insts",
            	    							lv_insts_5_0,
            	    							"org.chabu.hwmap.HwMapDsl.Instantiation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleInstantiation"
    // InternalHwMapDsl.g:300:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // InternalHwMapDsl.g:300:54: (iv_ruleInstantiation= ruleInstantiation EOF )
            // InternalHwMapDsl.g:301:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
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
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // InternalHwMapDsl.g:307:1: ruleInstantiation returns [EObject current=null] : ( () ( (lv_addr_1_0= ruleIntegerLiteral ) ) ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )? ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_0=null;
        Token lv_name_3_0=null;
        AntlrDatatypeRuleToken lv_addr_1_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:313:2: ( ( () ( (lv_addr_1_0= ruleIntegerLiteral ) ) ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )? ) )
            // InternalHwMapDsl.g:314:2: ( () ( (lv_addr_1_0= ruleIntegerLiteral ) ) ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )? )
            {
            // InternalHwMapDsl.g:314:2: ( () ( (lv_addr_1_0= ruleIntegerLiteral ) ) ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )? )
            // InternalHwMapDsl.g:315:3: () ( (lv_addr_1_0= ruleIntegerLiteral ) ) ( (lv_type_2_0= RULE_ID ) ) ( (lv_name_3_0= RULE_ID ) )?
            {
            // InternalHwMapDsl.g:315:3: ()
            // InternalHwMapDsl.g:316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInstantiationAccess().getInstantiationAction_0(),
            					current);
            			

            }

            // InternalHwMapDsl.g:322:3: ( (lv_addr_1_0= ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:323:4: (lv_addr_1_0= ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:323:4: (lv_addr_1_0= ruleIntegerLiteral )
            // InternalHwMapDsl.g:324:5: lv_addr_1_0= ruleIntegerLiteral
            {

            					newCompositeNode(grammarAccess.getInstantiationAccess().getAddrIntegerLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_addr_1_0=ruleIntegerLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInstantiationRule());
            					}
            					set(
            						current,
            						"addr",
            						lv_addr_1_0,
            						"org.chabu.hwmap.HwMapDsl.IntegerLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHwMapDsl.g:341:3: ( (lv_type_2_0= RULE_ID ) )
            // InternalHwMapDsl.g:342:4: (lv_type_2_0= RULE_ID )
            {
            // InternalHwMapDsl.g:342:4: (lv_type_2_0= RULE_ID )
            // InternalHwMapDsl.g:343:5: lv_type_2_0= RULE_ID
            {
            lv_type_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_type_2_0, grammarAccess.getInstantiationAccess().getTypeIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstantiationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.chabu.hwmap.HwMapDsl.ID");
            				

            }


            }

            // InternalHwMapDsl.g:359:3: ( (lv_name_3_0= RULE_ID ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHwMapDsl.g:360:4: (lv_name_3_0= RULE_ID )
                    {
                    // InternalHwMapDsl.g:360:4: (lv_name_3_0= RULE_ID )
                    // InternalHwMapDsl.g:361:5: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getInstantiationAccess().getNameIDTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInstantiationRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_3_0,
                    						"org.chabu.hwmap.HwMapDsl.ID");
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleBlock"
    // InternalHwMapDsl.g:381:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalHwMapDsl.g:381:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalHwMapDsl.g:382:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalHwMapDsl.g:388:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' ( (lv_name_2_0= RULE_ID ) ) ( (lv_size_3_0= ruleIntegerLiteral ) ) otherlv_4= '{' ( (lv_regs_5_0= ruleRegister ) )* otherlv_6= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_size_3_0 = null;

        EObject lv_regs_5_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:394:2: ( ( () otherlv_1= 'Block' ( (lv_name_2_0= RULE_ID ) ) ( (lv_size_3_0= ruleIntegerLiteral ) ) otherlv_4= '{' ( (lv_regs_5_0= ruleRegister ) )* otherlv_6= '}' ) )
            // InternalHwMapDsl.g:395:2: ( () otherlv_1= 'Block' ( (lv_name_2_0= RULE_ID ) ) ( (lv_size_3_0= ruleIntegerLiteral ) ) otherlv_4= '{' ( (lv_regs_5_0= ruleRegister ) )* otherlv_6= '}' )
            {
            // InternalHwMapDsl.g:395:2: ( () otherlv_1= 'Block' ( (lv_name_2_0= RULE_ID ) ) ( (lv_size_3_0= ruleIntegerLiteral ) ) otherlv_4= '{' ( (lv_regs_5_0= ruleRegister ) )* otherlv_6= '}' )
            // InternalHwMapDsl.g:396:3: () otherlv_1= 'Block' ( (lv_name_2_0= RULE_ID ) ) ( (lv_size_3_0= ruleIntegerLiteral ) ) otherlv_4= '{' ( (lv_regs_5_0= ruleRegister ) )* otherlv_6= '}'
            {
            // InternalHwMapDsl.g:396:3: ()
            // InternalHwMapDsl.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
            		
            // InternalHwMapDsl.g:407:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalHwMapDsl.g:408:4: (lv_name_2_0= RULE_ID )
            {
            // InternalHwMapDsl.g:408:4: (lv_name_2_0= RULE_ID )
            // InternalHwMapDsl.g:409:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_2_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlockRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.chabu.hwmap.HwMapDsl.ID");
            				

            }


            }

            // InternalHwMapDsl.g:425:3: ( (lv_size_3_0= ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:426:4: (lv_size_3_0= ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:426:4: (lv_size_3_0= ruleIntegerLiteral )
            // InternalHwMapDsl.g:427:5: lv_size_3_0= ruleIntegerLiteral
            {

            					newCompositeNode(grammarAccess.getBlockAccess().getSizeIntegerLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_size_3_0=ruleIntegerLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBlockRule());
            					}
            					set(
            						current,
            						"size",
            						lv_size_3_0,
            						"org.chabu.hwmap.HwMapDsl.IntegerLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalHwMapDsl.g:448:3: ( (lv_regs_5_0= ruleRegister ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_INT_DEC && LA5_0<=RULE_INT_HEX)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHwMapDsl.g:449:4: (lv_regs_5_0= ruleRegister )
            	    {
            	    // InternalHwMapDsl.g:449:4: (lv_regs_5_0= ruleRegister )
            	    // InternalHwMapDsl.g:450:5: lv_regs_5_0= ruleRegister
            	    {

            	    					newCompositeNode(grammarAccess.getBlockAccess().getRegsRegisterParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_regs_5_0=ruleRegister();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBlockRule());
            	    					}
            	    					add(
            	    						current,
            	    						"regs",
            	    						lv_regs_5_0,
            	    						"org.chabu.hwmap.HwMapDsl.Register");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleRegister"
    // InternalHwMapDsl.g:475:1: entryRuleRegister returns [EObject current=null] : iv_ruleRegister= ruleRegister EOF ;
    public final EObject entryRuleRegister() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegister = null;


        try {
            // InternalHwMapDsl.g:475:49: (iv_ruleRegister= ruleRegister EOF )
            // InternalHwMapDsl.g:476:2: iv_ruleRegister= ruleRegister EOF
            {
             newCompositeNode(grammarAccess.getRegisterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegister=ruleRegister();

            state._fsp--;

             current =iv_ruleRegister; 
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
    // $ANTLR end "entryRuleRegister"


    // $ANTLR start "ruleRegister"
    // InternalHwMapDsl.g:482:1: ruleRegister returns [EObject current=null] : ( ( (lv_addr_0_0= ruleIntegerLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ( (lv_bits_3_0= ruleRegisterBits ) )* ) ;
    public final EObject ruleRegister() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        AntlrDatatypeRuleToken lv_addr_0_0 = null;

        EObject lv_consts_2_0 = null;

        EObject lv_bits_3_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:488:2: ( ( ( (lv_addr_0_0= ruleIntegerLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ( (lv_bits_3_0= ruleRegisterBits ) )* ) )
            // InternalHwMapDsl.g:489:2: ( ( (lv_addr_0_0= ruleIntegerLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ( (lv_bits_3_0= ruleRegisterBits ) )* )
            {
            // InternalHwMapDsl.g:489:2: ( ( (lv_addr_0_0= ruleIntegerLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ( (lv_bits_3_0= ruleRegisterBits ) )* )
            // InternalHwMapDsl.g:490:3: ( (lv_addr_0_0= ruleIntegerLiteral ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ( (lv_bits_3_0= ruleRegisterBits ) )*
            {
            // InternalHwMapDsl.g:490:3: ( (lv_addr_0_0= ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:491:4: (lv_addr_0_0= ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:491:4: (lv_addr_0_0= ruleIntegerLiteral )
            // InternalHwMapDsl.g:492:5: lv_addr_0_0= ruleIntegerLiteral
            {

            					newCompositeNode(grammarAccess.getRegisterAccess().getAddrIntegerLiteralParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_addr_0_0=ruleIntegerLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegisterRule());
            					}
            					set(
            						current,
            						"addr",
            						lv_addr_0_0,
            						"org.chabu.hwmap.HwMapDsl.IntegerLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHwMapDsl.g:509:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHwMapDsl.g:510:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHwMapDsl.g:510:4: (lv_name_1_0= RULE_ID )
            // InternalHwMapDsl.g:511:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.chabu.hwmap.HwMapDsl.ID");
            				

            }


            }

            // InternalHwMapDsl.g:527:3: ( (lv_consts_2_0= ruleConstant ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHwMapDsl.g:528:4: (lv_consts_2_0= ruleConstant )
            	    {
            	    // InternalHwMapDsl.g:528:4: (lv_consts_2_0= ruleConstant )
            	    // InternalHwMapDsl.g:529:5: lv_consts_2_0= ruleConstant
            	    {

            	    					newCompositeNode(grammarAccess.getRegisterAccess().getConstsConstantParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_consts_2_0=ruleConstant();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRegisterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"consts",
            	    						lv_consts_2_0,
            	    						"org.chabu.hwmap.HwMapDsl.Constant");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalHwMapDsl.g:546:3: ( (lv_bits_3_0= ruleRegisterBits ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHwMapDsl.g:547:4: (lv_bits_3_0= ruleRegisterBits )
            	    {
            	    // InternalHwMapDsl.g:547:4: (lv_bits_3_0= ruleRegisterBits )
            	    // InternalHwMapDsl.g:548:5: lv_bits_3_0= ruleRegisterBits
            	    {

            	    					newCompositeNode(grammarAccess.getRegisterAccess().getBitsRegisterBitsParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_bits_3_0=ruleRegisterBits();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRegisterRule());
            	    					}
            	    					add(
            	    						current,
            	    						"bits",
            	    						lv_bits_3_0,
            	    						"org.chabu.hwmap.HwMapDsl.RegisterBits");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleRegister"


    // $ANTLR start "entryRuleRegisterBits"
    // InternalHwMapDsl.g:569:1: entryRuleRegisterBits returns [EObject current=null] : iv_ruleRegisterBits= ruleRegisterBits EOF ;
    public final EObject entryRuleRegisterBits() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegisterBits = null;


        try {
            // InternalHwMapDsl.g:569:53: (iv_ruleRegisterBits= ruleRegisterBits EOF )
            // InternalHwMapDsl.g:570:2: iv_ruleRegisterBits= ruleRegisterBits EOF
            {
             newCompositeNode(grammarAccess.getRegisterBitsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegisterBits=ruleRegisterBits();

            state._fsp--;

             current =iv_ruleRegisterBits; 
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
    // $ANTLR end "entryRuleRegisterBits"


    // $ANTLR start "ruleRegisterBits"
    // InternalHwMapDsl.g:576:1: ruleRegisterBits returns [EObject current=null] : ( ( (lv_range_0_0= ruleRange ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ) ;
    public final EObject ruleRegisterBits() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_range_0_0 = null;

        EObject lv_consts_2_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:582:2: ( ( ( (lv_range_0_0= ruleRange ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* ) )
            // InternalHwMapDsl.g:583:2: ( ( (lv_range_0_0= ruleRange ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* )
            {
            // InternalHwMapDsl.g:583:2: ( ( (lv_range_0_0= ruleRange ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )* )
            // InternalHwMapDsl.g:584:3: ( (lv_range_0_0= ruleRange ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_consts_2_0= ruleConstant ) )*
            {
            // InternalHwMapDsl.g:584:3: ( (lv_range_0_0= ruleRange ) )
            // InternalHwMapDsl.g:585:4: (lv_range_0_0= ruleRange )
            {
            // InternalHwMapDsl.g:585:4: (lv_range_0_0= ruleRange )
            // InternalHwMapDsl.g:586:5: lv_range_0_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getRegisterBitsAccess().getRangeRangeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_range_0_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegisterBitsRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_0_0,
            						"org.chabu.hwmap.HwMapDsl.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHwMapDsl.g:603:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalHwMapDsl.g:604:4: (lv_name_1_0= RULE_ID )
            {
            // InternalHwMapDsl.g:604:4: (lv_name_1_0= RULE_ID )
            // InternalHwMapDsl.g:605:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRegisterBitsAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegisterBitsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.chabu.hwmap.HwMapDsl.ID");
            				

            }


            }

            // InternalHwMapDsl.g:621:3: ( (lv_consts_2_0= ruleConstant ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHwMapDsl.g:622:4: (lv_consts_2_0= ruleConstant )
            	    {
            	    // InternalHwMapDsl.g:622:4: (lv_consts_2_0= ruleConstant )
            	    // InternalHwMapDsl.g:623:5: lv_consts_2_0= ruleConstant
            	    {

            	    					newCompositeNode(grammarAccess.getRegisterBitsAccess().getConstsConstantParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_consts_2_0=ruleConstant();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRegisterBitsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"consts",
            	    						lv_consts_2_0,
            	    						"org.chabu.hwmap.HwMapDsl.Constant");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleRegisterBits"


    // $ANTLR start "entryRuleRange"
    // InternalHwMapDsl.g:644:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalHwMapDsl.g:644:46: (iv_ruleRange= ruleRange EOF )
            // InternalHwMapDsl.g:645:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalHwMapDsl.g:651:1: ruleRange returns [EObject current=null] : (otherlv_0= '[' ( (lv_left_1_0= ruleIntegerLiteral ) ) (this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_OP_2DOT_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_left_1_0 = null;

        AntlrDatatypeRuleToken lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:657:2: ( (otherlv_0= '[' ( (lv_left_1_0= ruleIntegerLiteral ) ) (this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) ) )? otherlv_4= ']' ) )
            // InternalHwMapDsl.g:658:2: (otherlv_0= '[' ( (lv_left_1_0= ruleIntegerLiteral ) ) (this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) ) )? otherlv_4= ']' )
            {
            // InternalHwMapDsl.g:658:2: (otherlv_0= '[' ( (lv_left_1_0= ruleIntegerLiteral ) ) (this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) ) )? otherlv_4= ']' )
            // InternalHwMapDsl.g:659:3: otherlv_0= '[' ( (lv_left_1_0= ruleIntegerLiteral ) ) (this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalHwMapDsl.g:663:3: ( (lv_left_1_0= ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:664:4: (lv_left_1_0= ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:664:4: (lv_left_1_0= ruleIntegerLiteral )
            // InternalHwMapDsl.g:665:5: lv_left_1_0= ruleIntegerLiteral
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getLeftIntegerLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_left_1_0=ruleIntegerLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"org.chabu.hwmap.HwMapDsl.IntegerLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHwMapDsl.g:682:3: (this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_OP_2DOT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalHwMapDsl.g:683:4: this_OP_2DOT_2= RULE_OP_2DOT ( (lv_right_3_0= ruleIntegerLiteral ) )
                    {
                    this_OP_2DOT_2=(Token)match(input,RULE_OP_2DOT,FOLLOW_10); 

                    				newLeafNode(this_OP_2DOT_2, grammarAccess.getRangeAccess().getOP_2DOTTerminalRuleCall_2_0());
                    			
                    // InternalHwMapDsl.g:687:4: ( (lv_right_3_0= ruleIntegerLiteral ) )
                    // InternalHwMapDsl.g:688:5: (lv_right_3_0= ruleIntegerLiteral )
                    {
                    // InternalHwMapDsl.g:688:5: (lv_right_3_0= ruleIntegerLiteral )
                    // InternalHwMapDsl.g:689:6: lv_right_3_0= ruleIntegerLiteral
                    {

                    						newCompositeNode(grammarAccess.getRangeAccess().getRightIntegerLiteralParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_right_3_0=ruleIntegerLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangeRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_3_0,
                    							"org.chabu.hwmap.HwMapDsl.IntegerLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRangeAccess().getRightSquareBracketKeyword_3());
            		

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleConstant"
    // InternalHwMapDsl.g:715:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalHwMapDsl.g:715:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalHwMapDsl.g:716:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalHwMapDsl.g:722:1: ruleConstant returns [EObject current=null] : (otherlv_0= 'Constant' ( (lv_value_1_0= ruleIntegerLiteral ) ) this_ID_2= RULE_ID ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalHwMapDsl.g:728:2: ( (otherlv_0= 'Constant' ( (lv_value_1_0= ruleIntegerLiteral ) ) this_ID_2= RULE_ID ) )
            // InternalHwMapDsl.g:729:2: (otherlv_0= 'Constant' ( (lv_value_1_0= ruleIntegerLiteral ) ) this_ID_2= RULE_ID )
            {
            // InternalHwMapDsl.g:729:2: (otherlv_0= 'Constant' ( (lv_value_1_0= ruleIntegerLiteral ) ) this_ID_2= RULE_ID )
            // InternalHwMapDsl.g:730:3: otherlv_0= 'Constant' ( (lv_value_1_0= ruleIntegerLiteral ) ) this_ID_2= RULE_ID
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConstantAccess().getConstantKeyword_0());
            		
            // InternalHwMapDsl.g:734:3: ( (lv_value_1_0= ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:735:4: (lv_value_1_0= ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:735:4: (lv_value_1_0= ruleIntegerLiteral )
            // InternalHwMapDsl.g:736:5: lv_value_1_0= ruleIntegerLiteral
            {

            					newCompositeNode(grammarAccess.getConstantAccess().getValueIntegerLiteralParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_value_1_0=ruleIntegerLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstantRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.chabu.hwmap.HwMapDsl.IntegerLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            			newLeafNode(this_ID_2, grammarAccess.getConstantAccess().getIDTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalHwMapDsl.g:761:1: entryRuleIntegerLiteral returns [String current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final String entryRuleIntegerLiteral() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerLiteral = null;


        try {
            // InternalHwMapDsl.g:761:54: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalHwMapDsl.g:762:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral.getText(); 
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
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalHwMapDsl.g:768:1: ruleIntegerLiteral returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_DEC_0= RULE_INT_DEC | this_INT_HEX_1= RULE_INT_HEX ) ;
    public final AntlrDatatypeRuleToken ruleIntegerLiteral() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_DEC_0=null;
        Token this_INT_HEX_1=null;


        	enterRule();

        try {
            // InternalHwMapDsl.g:774:2: ( (this_INT_DEC_0= RULE_INT_DEC | this_INT_HEX_1= RULE_INT_HEX ) )
            // InternalHwMapDsl.g:775:2: (this_INT_DEC_0= RULE_INT_DEC | this_INT_HEX_1= RULE_INT_HEX )
            {
            // InternalHwMapDsl.g:775:2: (this_INT_DEC_0= RULE_INT_DEC | this_INT_HEX_1= RULE_INT_HEX )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT_DEC) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_INT_HEX) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalHwMapDsl.g:776:3: this_INT_DEC_0= RULE_INT_DEC
                    {
                    this_INT_DEC_0=(Token)match(input,RULE_INT_DEC,FOLLOW_2); 

                    			current.merge(this_INT_DEC_0);
                    		

                    			newLeafNode(this_INT_DEC_0, grammarAccess.getIntegerLiteralAccess().getINT_DECTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:784:3: this_INT_HEX_1= RULE_INT_HEX
                    {
                    this_INT_HEX_1=(Token)match(input,RULE_INT_HEX,FOLLOW_2); 

                    			current.merge(this_INT_HEX_1);
                    		

                    			newLeafNode(this_INT_HEX_1, grammarAccess.getIntegerLiteralAccess().getINT_HEXTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleIntegerLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0180L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080180L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});

}