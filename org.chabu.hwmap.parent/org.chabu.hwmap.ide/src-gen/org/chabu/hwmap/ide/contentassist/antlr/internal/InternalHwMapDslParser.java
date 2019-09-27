package org.chabu.hwmap.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.chabu.hwmap.services.HwMapDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHwMapDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT_DEC", "RULE_INT_HEX", "RULE_OP_2DOT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VHDL'", "'C'", "'Output'", "'Component'", "'{'", "'}'", "'Block'", "'['", "']'", "'Constant'"
    };
    public static final int RULE_STRING=7;
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
    public static final int RULE_INT_DEC=4;
    public static final int RULE_ID=8;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_INT_HEX=5;
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

    	public void setGrammarAccess(HwMapDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMemoryMap"
    // InternalHwMapDsl.g:53:1: entryRuleMemoryMap : ruleMemoryMap EOF ;
    public final void entryRuleMemoryMap() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:54:1: ( ruleMemoryMap EOF )
            // InternalHwMapDsl.g:55:1: ruleMemoryMap EOF
            {
             before(grammarAccess.getMemoryMapRule()); 
            pushFollow(FOLLOW_1);
            ruleMemoryMap();

            state._fsp--;

             after(grammarAccess.getMemoryMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemoryMap"


    // $ANTLR start "ruleMemoryMap"
    // InternalHwMapDsl.g:62:1: ruleMemoryMap : ( ( rule__MemoryMap__Group__0 ) ) ;
    public final void ruleMemoryMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:66:2: ( ( ( rule__MemoryMap__Group__0 ) ) )
            // InternalHwMapDsl.g:67:2: ( ( rule__MemoryMap__Group__0 ) )
            {
            // InternalHwMapDsl.g:67:2: ( ( rule__MemoryMap__Group__0 ) )
            // InternalHwMapDsl.g:68:3: ( rule__MemoryMap__Group__0 )
            {
             before(grammarAccess.getMemoryMapAccess().getGroup()); 
            // InternalHwMapDsl.g:69:3: ( rule__MemoryMap__Group__0 )
            // InternalHwMapDsl.g:69:4: rule__MemoryMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MemoryMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMemoryMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemoryMap"


    // $ANTLR start "entryRuleOutput"
    // InternalHwMapDsl.g:78:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:79:1: ( ruleOutput EOF )
            // InternalHwMapDsl.g:80:1: ruleOutput EOF
            {
             before(grammarAccess.getOutputRule()); 
            pushFollow(FOLLOW_1);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getOutputRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // InternalHwMapDsl.g:87:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:91:2: ( ( ( rule__Output__Group__0 ) ) )
            // InternalHwMapDsl.g:92:2: ( ( rule__Output__Group__0 ) )
            {
            // InternalHwMapDsl.g:92:2: ( ( rule__Output__Group__0 ) )
            // InternalHwMapDsl.g:93:3: ( rule__Output__Group__0 )
            {
             before(grammarAccess.getOutputAccess().getGroup()); 
            // InternalHwMapDsl.g:94:3: ( rule__Output__Group__0 )
            // InternalHwMapDsl.g:94:4: rule__Output__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleComponent"
    // InternalHwMapDsl.g:103:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:104:1: ( ruleComponent EOF )
            // InternalHwMapDsl.g:105:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalHwMapDsl.g:112:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:116:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalHwMapDsl.g:117:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalHwMapDsl.g:117:2: ( ( rule__Component__Group__0 ) )
            // InternalHwMapDsl.g:118:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalHwMapDsl.g:119:3: ( rule__Component__Group__0 )
            // InternalHwMapDsl.g:119:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleInstantiation"
    // InternalHwMapDsl.g:128:1: entryRuleInstantiation : ruleInstantiation EOF ;
    public final void entryRuleInstantiation() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:129:1: ( ruleInstantiation EOF )
            // InternalHwMapDsl.g:130:1: ruleInstantiation EOF
            {
             before(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_1);
            ruleInstantiation();

            state._fsp--;

             after(grammarAccess.getInstantiationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // InternalHwMapDsl.g:137:1: ruleInstantiation : ( ( rule__Instantiation__Group__0 ) ) ;
    public final void ruleInstantiation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:141:2: ( ( ( rule__Instantiation__Group__0 ) ) )
            // InternalHwMapDsl.g:142:2: ( ( rule__Instantiation__Group__0 ) )
            {
            // InternalHwMapDsl.g:142:2: ( ( rule__Instantiation__Group__0 ) )
            // InternalHwMapDsl.g:143:3: ( rule__Instantiation__Group__0 )
            {
             before(grammarAccess.getInstantiationAccess().getGroup()); 
            // InternalHwMapDsl.g:144:3: ( rule__Instantiation__Group__0 )
            // InternalHwMapDsl.g:144:4: rule__Instantiation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instantiation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleBlock"
    // InternalHwMapDsl.g:153:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:154:1: ( ruleBlock EOF )
            // InternalHwMapDsl.g:155:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalHwMapDsl.g:162:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:166:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalHwMapDsl.g:167:2: ( ( rule__Block__Group__0 ) )
            {
            // InternalHwMapDsl.g:167:2: ( ( rule__Block__Group__0 ) )
            // InternalHwMapDsl.g:168:3: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalHwMapDsl.g:169:3: ( rule__Block__Group__0 )
            // InternalHwMapDsl.g:169:4: rule__Block__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleRegister"
    // InternalHwMapDsl.g:178:1: entryRuleRegister : ruleRegister EOF ;
    public final void entryRuleRegister() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:179:1: ( ruleRegister EOF )
            // InternalHwMapDsl.g:180:1: ruleRegister EOF
            {
             before(grammarAccess.getRegisterRule()); 
            pushFollow(FOLLOW_1);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getRegisterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegister"


    // $ANTLR start "ruleRegister"
    // InternalHwMapDsl.g:187:1: ruleRegister : ( ( rule__Register__Group__0 ) ) ;
    public final void ruleRegister() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:191:2: ( ( ( rule__Register__Group__0 ) ) )
            // InternalHwMapDsl.g:192:2: ( ( rule__Register__Group__0 ) )
            {
            // InternalHwMapDsl.g:192:2: ( ( rule__Register__Group__0 ) )
            // InternalHwMapDsl.g:193:3: ( rule__Register__Group__0 )
            {
             before(grammarAccess.getRegisterAccess().getGroup()); 
            // InternalHwMapDsl.g:194:3: ( rule__Register__Group__0 )
            // InternalHwMapDsl.g:194:4: rule__Register__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Register__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegisterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegister"


    // $ANTLR start "entryRuleRegisterBits"
    // InternalHwMapDsl.g:203:1: entryRuleRegisterBits : ruleRegisterBits EOF ;
    public final void entryRuleRegisterBits() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:204:1: ( ruleRegisterBits EOF )
            // InternalHwMapDsl.g:205:1: ruleRegisterBits EOF
            {
             before(grammarAccess.getRegisterBitsRule()); 
            pushFollow(FOLLOW_1);
            ruleRegisterBits();

            state._fsp--;

             after(grammarAccess.getRegisterBitsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegisterBits"


    // $ANTLR start "ruleRegisterBits"
    // InternalHwMapDsl.g:212:1: ruleRegisterBits : ( ( rule__RegisterBits__Group__0 ) ) ;
    public final void ruleRegisterBits() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:216:2: ( ( ( rule__RegisterBits__Group__0 ) ) )
            // InternalHwMapDsl.g:217:2: ( ( rule__RegisterBits__Group__0 ) )
            {
            // InternalHwMapDsl.g:217:2: ( ( rule__RegisterBits__Group__0 ) )
            // InternalHwMapDsl.g:218:3: ( rule__RegisterBits__Group__0 )
            {
             before(grammarAccess.getRegisterBitsAccess().getGroup()); 
            // InternalHwMapDsl.g:219:3: ( rule__RegisterBits__Group__0 )
            // InternalHwMapDsl.g:219:4: rule__RegisterBits__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegisterBits__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegisterBitsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegisterBits"


    // $ANTLR start "entryRuleRange"
    // InternalHwMapDsl.g:228:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:229:1: ( ruleRange EOF )
            // InternalHwMapDsl.g:230:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalHwMapDsl.g:237:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:241:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalHwMapDsl.g:242:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalHwMapDsl.g:242:2: ( ( rule__Range__Group__0 ) )
            // InternalHwMapDsl.g:243:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalHwMapDsl.g:244:3: ( rule__Range__Group__0 )
            // InternalHwMapDsl.g:244:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleConstant"
    // InternalHwMapDsl.g:253:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:254:1: ( ruleConstant EOF )
            // InternalHwMapDsl.g:255:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalHwMapDsl.g:262:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:266:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalHwMapDsl.g:267:2: ( ( rule__Constant__Group__0 ) )
            {
            // InternalHwMapDsl.g:267:2: ( ( rule__Constant__Group__0 ) )
            // InternalHwMapDsl.g:268:3: ( rule__Constant__Group__0 )
            {
             before(grammarAccess.getConstantAccess().getGroup()); 
            // InternalHwMapDsl.g:269:3: ( rule__Constant__Group__0 )
            // InternalHwMapDsl.g:269:4: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalHwMapDsl.g:278:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalHwMapDsl.g:279:1: ( ruleIntegerLiteral EOF )
            // InternalHwMapDsl.g:280:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalHwMapDsl.g:287:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__Alternatives ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:291:2: ( ( ( rule__IntegerLiteral__Alternatives ) ) )
            // InternalHwMapDsl.g:292:2: ( ( rule__IntegerLiteral__Alternatives ) )
            {
            // InternalHwMapDsl.g:292:2: ( ( rule__IntegerLiteral__Alternatives ) )
            // InternalHwMapDsl.g:293:3: ( rule__IntegerLiteral__Alternatives )
            {
             before(grammarAccess.getIntegerLiteralAccess().getAlternatives()); 
            // InternalHwMapDsl.g:294:3: ( rule__IntegerLiteral__Alternatives )
            // InternalHwMapDsl.g:294:4: rule__IntegerLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "rule__Output__ModeAlternatives_2_0"
    // InternalHwMapDsl.g:302:1: rule__Output__ModeAlternatives_2_0 : ( ( 'VHDL' ) | ( 'C' ) );
    public final void rule__Output__ModeAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:306:1: ( ( 'VHDL' ) | ( 'C' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHwMapDsl.g:307:2: ( 'VHDL' )
                    {
                    // InternalHwMapDsl.g:307:2: ( 'VHDL' )
                    // InternalHwMapDsl.g:308:3: 'VHDL'
                    {
                     before(grammarAccess.getOutputAccess().getModeVHDLKeyword_2_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getModeVHDLKeyword_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:313:2: ( 'C' )
                    {
                    // InternalHwMapDsl.g:313:2: ( 'C' )
                    // InternalHwMapDsl.g:314:3: 'C'
                    {
                     before(grammarAccess.getOutputAccess().getModeCKeyword_2_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOutputAccess().getModeCKeyword_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ModeAlternatives_2_0"


    // $ANTLR start "rule__Component__Alternatives_4"
    // InternalHwMapDsl.g:323:1: rule__Component__Alternatives_4 : ( ( ( rule__Component__BlocksAssignment_4_0 ) ) | ( ( rule__Component__InstsAssignment_4_1 ) ) );
    public final void rule__Component__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:327:1: ( ( ( rule__Component__BlocksAssignment_4_0 ) ) | ( ( rule__Component__InstsAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_INT_DEC && LA2_0<=RULE_INT_HEX)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHwMapDsl.g:328:2: ( ( rule__Component__BlocksAssignment_4_0 ) )
                    {
                    // InternalHwMapDsl.g:328:2: ( ( rule__Component__BlocksAssignment_4_0 ) )
                    // InternalHwMapDsl.g:329:3: ( rule__Component__BlocksAssignment_4_0 )
                    {
                     before(grammarAccess.getComponentAccess().getBlocksAssignment_4_0()); 
                    // InternalHwMapDsl.g:330:3: ( rule__Component__BlocksAssignment_4_0 )
                    // InternalHwMapDsl.g:330:4: rule__Component__BlocksAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__BlocksAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getBlocksAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:334:2: ( ( rule__Component__InstsAssignment_4_1 ) )
                    {
                    // InternalHwMapDsl.g:334:2: ( ( rule__Component__InstsAssignment_4_1 ) )
                    // InternalHwMapDsl.g:335:3: ( rule__Component__InstsAssignment_4_1 )
                    {
                     before(grammarAccess.getComponentAccess().getInstsAssignment_4_1()); 
                    // InternalHwMapDsl.g:336:3: ( rule__Component__InstsAssignment_4_1 )
                    // InternalHwMapDsl.g:336:4: rule__Component__InstsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__InstsAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComponentAccess().getInstsAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Alternatives_4"


    // $ANTLR start "rule__IntegerLiteral__Alternatives"
    // InternalHwMapDsl.g:344:1: rule__IntegerLiteral__Alternatives : ( ( RULE_INT_DEC ) | ( RULE_INT_HEX ) );
    public final void rule__IntegerLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:348:1: ( ( RULE_INT_DEC ) | ( RULE_INT_HEX ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT_DEC) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT_HEX) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHwMapDsl.g:349:2: ( RULE_INT_DEC )
                    {
                    // InternalHwMapDsl.g:349:2: ( RULE_INT_DEC )
                    // InternalHwMapDsl.g:350:3: RULE_INT_DEC
                    {
                     before(grammarAccess.getIntegerLiteralAccess().getINT_DECTerminalRuleCall_0()); 
                    match(input,RULE_INT_DEC,FOLLOW_2); 
                     after(grammarAccess.getIntegerLiteralAccess().getINT_DECTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:355:2: ( RULE_INT_HEX )
                    {
                    // InternalHwMapDsl.g:355:2: ( RULE_INT_HEX )
                    // InternalHwMapDsl.g:356:3: RULE_INT_HEX
                    {
                     before(grammarAccess.getIntegerLiteralAccess().getINT_HEXTerminalRuleCall_1()); 
                    match(input,RULE_INT_HEX,FOLLOW_2); 
                     after(grammarAccess.getIntegerLiteralAccess().getINT_HEXTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Alternatives"


    // $ANTLR start "rule__MemoryMap__Group__0"
    // InternalHwMapDsl.g:365:1: rule__MemoryMap__Group__0 : rule__MemoryMap__Group__0__Impl rule__MemoryMap__Group__1 ;
    public final void rule__MemoryMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:369:1: ( rule__MemoryMap__Group__0__Impl rule__MemoryMap__Group__1 )
            // InternalHwMapDsl.g:370:2: rule__MemoryMap__Group__0__Impl rule__MemoryMap__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MemoryMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__Group__0"


    // $ANTLR start "rule__MemoryMap__Group__0__Impl"
    // InternalHwMapDsl.g:377:1: rule__MemoryMap__Group__0__Impl : ( () ) ;
    public final void rule__MemoryMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:381:1: ( ( () ) )
            // InternalHwMapDsl.g:382:1: ( () )
            {
            // InternalHwMapDsl.g:382:1: ( () )
            // InternalHwMapDsl.g:383:2: ()
            {
             before(grammarAccess.getMemoryMapAccess().getMemoryMapAction_0()); 
            // InternalHwMapDsl.g:384:2: ()
            // InternalHwMapDsl.g:384:3: 
            {
            }

             after(grammarAccess.getMemoryMapAccess().getMemoryMapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__Group__0__Impl"


    // $ANTLR start "rule__MemoryMap__Group__1"
    // InternalHwMapDsl.g:392:1: rule__MemoryMap__Group__1 : rule__MemoryMap__Group__1__Impl rule__MemoryMap__Group__2 ;
    public final void rule__MemoryMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:396:1: ( rule__MemoryMap__Group__1__Impl rule__MemoryMap__Group__2 )
            // InternalHwMapDsl.g:397:2: rule__MemoryMap__Group__1__Impl rule__MemoryMap__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MemoryMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MemoryMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__Group__1"


    // $ANTLR start "rule__MemoryMap__Group__1__Impl"
    // InternalHwMapDsl.g:404:1: rule__MemoryMap__Group__1__Impl : ( ( rule__MemoryMap__OutputsAssignment_1 )* ) ;
    public final void rule__MemoryMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:408:1: ( ( ( rule__MemoryMap__OutputsAssignment_1 )* ) )
            // InternalHwMapDsl.g:409:1: ( ( rule__MemoryMap__OutputsAssignment_1 )* )
            {
            // InternalHwMapDsl.g:409:1: ( ( rule__MemoryMap__OutputsAssignment_1 )* )
            // InternalHwMapDsl.g:410:2: ( rule__MemoryMap__OutputsAssignment_1 )*
            {
             before(grammarAccess.getMemoryMapAccess().getOutputsAssignment_1()); 
            // InternalHwMapDsl.g:411:2: ( rule__MemoryMap__OutputsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHwMapDsl.g:411:3: rule__MemoryMap__OutputsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__MemoryMap__OutputsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMemoryMapAccess().getOutputsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__Group__1__Impl"


    // $ANTLR start "rule__MemoryMap__Group__2"
    // InternalHwMapDsl.g:419:1: rule__MemoryMap__Group__2 : rule__MemoryMap__Group__2__Impl ;
    public final void rule__MemoryMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:423:1: ( rule__MemoryMap__Group__2__Impl )
            // InternalHwMapDsl.g:424:2: rule__MemoryMap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MemoryMap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__Group__2"


    // $ANTLR start "rule__MemoryMap__Group__2__Impl"
    // InternalHwMapDsl.g:430:1: rule__MemoryMap__Group__2__Impl : ( ( rule__MemoryMap__ComponentsAssignment_2 ) ) ;
    public final void rule__MemoryMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:434:1: ( ( ( rule__MemoryMap__ComponentsAssignment_2 ) ) )
            // InternalHwMapDsl.g:435:1: ( ( rule__MemoryMap__ComponentsAssignment_2 ) )
            {
            // InternalHwMapDsl.g:435:1: ( ( rule__MemoryMap__ComponentsAssignment_2 ) )
            // InternalHwMapDsl.g:436:2: ( rule__MemoryMap__ComponentsAssignment_2 )
            {
             before(grammarAccess.getMemoryMapAccess().getComponentsAssignment_2()); 
            // InternalHwMapDsl.g:437:2: ( rule__MemoryMap__ComponentsAssignment_2 )
            // InternalHwMapDsl.g:437:3: rule__MemoryMap__ComponentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MemoryMap__ComponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMemoryMapAccess().getComponentsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // InternalHwMapDsl.g:446:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:450:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // InternalHwMapDsl.g:451:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Output__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // InternalHwMapDsl.g:458:1: rule__Output__Group__0__Impl : ( () ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:462:1: ( ( () ) )
            // InternalHwMapDsl.g:463:1: ( () )
            {
            // InternalHwMapDsl.g:463:1: ( () )
            // InternalHwMapDsl.g:464:2: ()
            {
             before(grammarAccess.getOutputAccess().getOutputAction_0()); 
            // InternalHwMapDsl.g:465:2: ()
            // InternalHwMapDsl.g:465:3: 
            {
            }

             after(grammarAccess.getOutputAccess().getOutputAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // InternalHwMapDsl.g:473:1: rule__Output__Group__1 : rule__Output__Group__1__Impl rule__Output__Group__2 ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:477:1: ( rule__Output__Group__1__Impl rule__Output__Group__2 )
            // InternalHwMapDsl.g:478:2: rule__Output__Group__1__Impl rule__Output__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Output__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // InternalHwMapDsl.g:485:1: rule__Output__Group__1__Impl : ( 'Output' ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:489:1: ( ( 'Output' ) )
            // InternalHwMapDsl.g:490:1: ( 'Output' )
            {
            // InternalHwMapDsl.g:490:1: ( 'Output' )
            // InternalHwMapDsl.g:491:2: 'Output'
            {
             before(grammarAccess.getOutputAccess().getOutputKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getOutputKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group__2"
    // InternalHwMapDsl.g:500:1: rule__Output__Group__2 : rule__Output__Group__2__Impl rule__Output__Group__3 ;
    public final void rule__Output__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:504:1: ( rule__Output__Group__2__Impl rule__Output__Group__3 )
            // InternalHwMapDsl.g:505:2: rule__Output__Group__2__Impl rule__Output__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Output__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Output__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2"


    // $ANTLR start "rule__Output__Group__2__Impl"
    // InternalHwMapDsl.g:512:1: rule__Output__Group__2__Impl : ( ( rule__Output__ModeAssignment_2 ) ) ;
    public final void rule__Output__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:516:1: ( ( ( rule__Output__ModeAssignment_2 ) ) )
            // InternalHwMapDsl.g:517:1: ( ( rule__Output__ModeAssignment_2 ) )
            {
            // InternalHwMapDsl.g:517:1: ( ( rule__Output__ModeAssignment_2 ) )
            // InternalHwMapDsl.g:518:2: ( rule__Output__ModeAssignment_2 )
            {
             before(grammarAccess.getOutputAccess().getModeAssignment_2()); 
            // InternalHwMapDsl.g:519:2: ( rule__Output__ModeAssignment_2 )
            // InternalHwMapDsl.g:519:3: rule__Output__ModeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Output__ModeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getModeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__2__Impl"


    // $ANTLR start "rule__Output__Group__3"
    // InternalHwMapDsl.g:527:1: rule__Output__Group__3 : rule__Output__Group__3__Impl ;
    public final void rule__Output__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:531:1: ( rule__Output__Group__3__Impl )
            // InternalHwMapDsl.g:532:2: rule__Output__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Output__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3"


    // $ANTLR start "rule__Output__Group__3__Impl"
    // InternalHwMapDsl.g:538:1: rule__Output__Group__3__Impl : ( ( rule__Output__PathAssignment_3 ) ) ;
    public final void rule__Output__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:542:1: ( ( ( rule__Output__PathAssignment_3 ) ) )
            // InternalHwMapDsl.g:543:1: ( ( rule__Output__PathAssignment_3 ) )
            {
            // InternalHwMapDsl.g:543:1: ( ( rule__Output__PathAssignment_3 ) )
            // InternalHwMapDsl.g:544:2: ( rule__Output__PathAssignment_3 )
            {
             before(grammarAccess.getOutputAccess().getPathAssignment_3()); 
            // InternalHwMapDsl.g:545:2: ( rule__Output__PathAssignment_3 )
            // InternalHwMapDsl.g:545:3: rule__Output__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Output__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getPathAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalHwMapDsl.g:554:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:558:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalHwMapDsl.g:559:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalHwMapDsl.g:566:1: rule__Component__Group__0__Impl : ( () ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:570:1: ( ( () ) )
            // InternalHwMapDsl.g:571:1: ( () )
            {
            // InternalHwMapDsl.g:571:1: ( () )
            // InternalHwMapDsl.g:572:2: ()
            {
             before(grammarAccess.getComponentAccess().getComponentAction_0()); 
            // InternalHwMapDsl.g:573:2: ()
            // InternalHwMapDsl.g:573:3: 
            {
            }

             after(grammarAccess.getComponentAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalHwMapDsl.g:581:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:585:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalHwMapDsl.g:586:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalHwMapDsl.g:593:1: rule__Component__Group__1__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:597:1: ( ( 'Component' ) )
            // InternalHwMapDsl.g:598:1: ( 'Component' )
            {
            // InternalHwMapDsl.g:598:1: ( 'Component' )
            // InternalHwMapDsl.g:599:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalHwMapDsl.g:608:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:612:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalHwMapDsl.g:613:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalHwMapDsl.g:620:1: rule__Component__Group__2__Impl : ( ( rule__Component__CompNameAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:624:1: ( ( ( rule__Component__CompNameAssignment_2 ) ) )
            // InternalHwMapDsl.g:625:1: ( ( rule__Component__CompNameAssignment_2 ) )
            {
            // InternalHwMapDsl.g:625:1: ( ( rule__Component__CompNameAssignment_2 ) )
            // InternalHwMapDsl.g:626:2: ( rule__Component__CompNameAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getCompNameAssignment_2()); 
            // InternalHwMapDsl.g:627:2: ( rule__Component__CompNameAssignment_2 )
            // InternalHwMapDsl.g:627:3: rule__Component__CompNameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__CompNameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getCompNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalHwMapDsl.g:635:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:639:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalHwMapDsl.g:640:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalHwMapDsl.g:647:1: rule__Component__Group__3__Impl : ( '{' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:651:1: ( ( '{' ) )
            // InternalHwMapDsl.g:652:1: ( '{' )
            {
            // InternalHwMapDsl.g:652:1: ( '{' )
            // InternalHwMapDsl.g:653:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalHwMapDsl.g:662:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:666:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalHwMapDsl.g:667:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalHwMapDsl.g:674:1: rule__Component__Group__4__Impl : ( ( rule__Component__Alternatives_4 )* ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:678:1: ( ( ( rule__Component__Alternatives_4 )* ) )
            // InternalHwMapDsl.g:679:1: ( ( rule__Component__Alternatives_4 )* )
            {
            // InternalHwMapDsl.g:679:1: ( ( rule__Component__Alternatives_4 )* )
            // InternalHwMapDsl.g:680:2: ( rule__Component__Alternatives_4 )*
            {
             before(grammarAccess.getComponentAccess().getAlternatives_4()); 
            // InternalHwMapDsl.g:681:2: ( rule__Component__Alternatives_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_INT_DEC && LA5_0<=RULE_INT_HEX)||LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalHwMapDsl.g:681:3: rule__Component__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Component__Alternatives_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalHwMapDsl.g:689:1: rule__Component__Group__5 : rule__Component__Group__5__Impl ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:693:1: ( rule__Component__Group__5__Impl )
            // InternalHwMapDsl.g:694:2: rule__Component__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalHwMapDsl.g:700:1: rule__Component__Group__5__Impl : ( '}' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:704:1: ( ( '}' ) )
            // InternalHwMapDsl.g:705:1: ( '}' )
            {
            // InternalHwMapDsl.g:705:1: ( '}' )
            // InternalHwMapDsl.g:706:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Instantiation__Group__0"
    // InternalHwMapDsl.g:716:1: rule__Instantiation__Group__0 : rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1 ;
    public final void rule__Instantiation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:720:1: ( rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1 )
            // InternalHwMapDsl.g:721:2: rule__Instantiation__Group__0__Impl rule__Instantiation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Instantiation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instantiation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__0"


    // $ANTLR start "rule__Instantiation__Group__0__Impl"
    // InternalHwMapDsl.g:728:1: rule__Instantiation__Group__0__Impl : ( () ) ;
    public final void rule__Instantiation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:732:1: ( ( () ) )
            // InternalHwMapDsl.g:733:1: ( () )
            {
            // InternalHwMapDsl.g:733:1: ( () )
            // InternalHwMapDsl.g:734:2: ()
            {
             before(grammarAccess.getInstantiationAccess().getInstantiationAction_0()); 
            // InternalHwMapDsl.g:735:2: ()
            // InternalHwMapDsl.g:735:3: 
            {
            }

             after(grammarAccess.getInstantiationAccess().getInstantiationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__0__Impl"


    // $ANTLR start "rule__Instantiation__Group__1"
    // InternalHwMapDsl.g:743:1: rule__Instantiation__Group__1 : rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2 ;
    public final void rule__Instantiation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:747:1: ( rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2 )
            // InternalHwMapDsl.g:748:2: rule__Instantiation__Group__1__Impl rule__Instantiation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Instantiation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instantiation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__1"


    // $ANTLR start "rule__Instantiation__Group__1__Impl"
    // InternalHwMapDsl.g:755:1: rule__Instantiation__Group__1__Impl : ( ( rule__Instantiation__AddrAssignment_1 ) ) ;
    public final void rule__Instantiation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:759:1: ( ( ( rule__Instantiation__AddrAssignment_1 ) ) )
            // InternalHwMapDsl.g:760:1: ( ( rule__Instantiation__AddrAssignment_1 ) )
            {
            // InternalHwMapDsl.g:760:1: ( ( rule__Instantiation__AddrAssignment_1 ) )
            // InternalHwMapDsl.g:761:2: ( rule__Instantiation__AddrAssignment_1 )
            {
             before(grammarAccess.getInstantiationAccess().getAddrAssignment_1()); 
            // InternalHwMapDsl.g:762:2: ( rule__Instantiation__AddrAssignment_1 )
            // InternalHwMapDsl.g:762:3: rule__Instantiation__AddrAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Instantiation__AddrAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getAddrAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__1__Impl"


    // $ANTLR start "rule__Instantiation__Group__2"
    // InternalHwMapDsl.g:770:1: rule__Instantiation__Group__2 : rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3 ;
    public final void rule__Instantiation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:774:1: ( rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3 )
            // InternalHwMapDsl.g:775:2: rule__Instantiation__Group__2__Impl rule__Instantiation__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Instantiation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instantiation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__2"


    // $ANTLR start "rule__Instantiation__Group__2__Impl"
    // InternalHwMapDsl.g:782:1: rule__Instantiation__Group__2__Impl : ( ( rule__Instantiation__TypeAssignment_2 ) ) ;
    public final void rule__Instantiation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:786:1: ( ( ( rule__Instantiation__TypeAssignment_2 ) ) )
            // InternalHwMapDsl.g:787:1: ( ( rule__Instantiation__TypeAssignment_2 ) )
            {
            // InternalHwMapDsl.g:787:1: ( ( rule__Instantiation__TypeAssignment_2 ) )
            // InternalHwMapDsl.g:788:2: ( rule__Instantiation__TypeAssignment_2 )
            {
             before(grammarAccess.getInstantiationAccess().getTypeAssignment_2()); 
            // InternalHwMapDsl.g:789:2: ( rule__Instantiation__TypeAssignment_2 )
            // InternalHwMapDsl.g:789:3: rule__Instantiation__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Instantiation__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInstantiationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__2__Impl"


    // $ANTLR start "rule__Instantiation__Group__3"
    // InternalHwMapDsl.g:797:1: rule__Instantiation__Group__3 : rule__Instantiation__Group__3__Impl ;
    public final void rule__Instantiation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:801:1: ( rule__Instantiation__Group__3__Impl )
            // InternalHwMapDsl.g:802:2: rule__Instantiation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instantiation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__3"


    // $ANTLR start "rule__Instantiation__Group__3__Impl"
    // InternalHwMapDsl.g:808:1: rule__Instantiation__Group__3__Impl : ( ( rule__Instantiation__NameAssignment_3 )? ) ;
    public final void rule__Instantiation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:812:1: ( ( ( rule__Instantiation__NameAssignment_3 )? ) )
            // InternalHwMapDsl.g:813:1: ( ( rule__Instantiation__NameAssignment_3 )? )
            {
            // InternalHwMapDsl.g:813:1: ( ( rule__Instantiation__NameAssignment_3 )? )
            // InternalHwMapDsl.g:814:2: ( rule__Instantiation__NameAssignment_3 )?
            {
             before(grammarAccess.getInstantiationAccess().getNameAssignment_3()); 
            // InternalHwMapDsl.g:815:2: ( rule__Instantiation__NameAssignment_3 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHwMapDsl.g:815:3: rule__Instantiation__NameAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Instantiation__NameAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInstantiationAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalHwMapDsl.g:824:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:828:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalHwMapDsl.g:829:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalHwMapDsl.g:836:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:840:1: ( ( () ) )
            // InternalHwMapDsl.g:841:1: ( () )
            {
            // InternalHwMapDsl.g:841:1: ( () )
            // InternalHwMapDsl.g:842:2: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalHwMapDsl.g:843:2: ()
            // InternalHwMapDsl.g:843:3: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalHwMapDsl.g:851:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:855:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalHwMapDsl.g:856:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalHwMapDsl.g:863:1: rule__Block__Group__1__Impl : ( 'Block' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:867:1: ( ( 'Block' ) )
            // InternalHwMapDsl.g:868:1: ( 'Block' )
            {
            // InternalHwMapDsl.g:868:1: ( 'Block' )
            // InternalHwMapDsl.g:869:2: 'Block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalHwMapDsl.g:878:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:882:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalHwMapDsl.g:883:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalHwMapDsl.g:890:1: rule__Block__Group__2__Impl : ( ( rule__Block__NameAssignment_2 ) ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:894:1: ( ( ( rule__Block__NameAssignment_2 ) ) )
            // InternalHwMapDsl.g:895:1: ( ( rule__Block__NameAssignment_2 ) )
            {
            // InternalHwMapDsl.g:895:1: ( ( rule__Block__NameAssignment_2 ) )
            // InternalHwMapDsl.g:896:2: ( rule__Block__NameAssignment_2 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_2()); 
            // InternalHwMapDsl.g:897:2: ( rule__Block__NameAssignment_2 )
            // InternalHwMapDsl.g:897:3: rule__Block__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Block__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalHwMapDsl.g:905:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:909:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // InternalHwMapDsl.g:910:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalHwMapDsl.g:917:1: rule__Block__Group__3__Impl : ( ( rule__Block__SizeAssignment_3 ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:921:1: ( ( ( rule__Block__SizeAssignment_3 ) ) )
            // InternalHwMapDsl.g:922:1: ( ( rule__Block__SizeAssignment_3 ) )
            {
            // InternalHwMapDsl.g:922:1: ( ( rule__Block__SizeAssignment_3 ) )
            // InternalHwMapDsl.g:923:2: ( rule__Block__SizeAssignment_3 )
            {
             before(grammarAccess.getBlockAccess().getSizeAssignment_3()); 
            // InternalHwMapDsl.g:924:2: ( rule__Block__SizeAssignment_3 )
            // InternalHwMapDsl.g:924:3: rule__Block__SizeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Block__SizeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getSizeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // InternalHwMapDsl.g:932:1: rule__Block__Group__4 : rule__Block__Group__4__Impl rule__Block__Group__5 ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:936:1: ( rule__Block__Group__4__Impl rule__Block__Group__5 )
            // InternalHwMapDsl.g:937:2: rule__Block__Group__4__Impl rule__Block__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Block__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // InternalHwMapDsl.g:944:1: rule__Block__Group__4__Impl : ( '{' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:948:1: ( ( '{' ) )
            // InternalHwMapDsl.g:949:1: ( '{' )
            {
            // InternalHwMapDsl.g:949:1: ( '{' )
            // InternalHwMapDsl.g:950:2: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Block__Group__5"
    // InternalHwMapDsl.g:959:1: rule__Block__Group__5 : rule__Block__Group__5__Impl rule__Block__Group__6 ;
    public final void rule__Block__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:963:1: ( rule__Block__Group__5__Impl rule__Block__Group__6 )
            // InternalHwMapDsl.g:964:2: rule__Block__Group__5__Impl rule__Block__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Block__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Block__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__5"


    // $ANTLR start "rule__Block__Group__5__Impl"
    // InternalHwMapDsl.g:971:1: rule__Block__Group__5__Impl : ( ( rule__Block__RegsAssignment_5 )* ) ;
    public final void rule__Block__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:975:1: ( ( ( rule__Block__RegsAssignment_5 )* ) )
            // InternalHwMapDsl.g:976:1: ( ( rule__Block__RegsAssignment_5 )* )
            {
            // InternalHwMapDsl.g:976:1: ( ( rule__Block__RegsAssignment_5 )* )
            // InternalHwMapDsl.g:977:2: ( rule__Block__RegsAssignment_5 )*
            {
             before(grammarAccess.getBlockAccess().getRegsAssignment_5()); 
            // InternalHwMapDsl.g:978:2: ( rule__Block__RegsAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_INT_DEC && LA7_0<=RULE_INT_HEX)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHwMapDsl.g:978:3: rule__Block__RegsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Block__RegsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getRegsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__5__Impl"


    // $ANTLR start "rule__Block__Group__6"
    // InternalHwMapDsl.g:986:1: rule__Block__Group__6 : rule__Block__Group__6__Impl ;
    public final void rule__Block__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:990:1: ( rule__Block__Group__6__Impl )
            // InternalHwMapDsl.g:991:2: rule__Block__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Block__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__6"


    // $ANTLR start "rule__Block__Group__6__Impl"
    // InternalHwMapDsl.g:997:1: rule__Block__Group__6__Impl : ( '}' ) ;
    public final void rule__Block__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1001:1: ( ( '}' ) )
            // InternalHwMapDsl.g:1002:1: ( '}' )
            {
            // InternalHwMapDsl.g:1002:1: ( '}' )
            // InternalHwMapDsl.g:1003:2: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__6__Impl"


    // $ANTLR start "rule__Register__Group__0"
    // InternalHwMapDsl.g:1013:1: rule__Register__Group__0 : rule__Register__Group__0__Impl rule__Register__Group__1 ;
    public final void rule__Register__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1017:1: ( rule__Register__Group__0__Impl rule__Register__Group__1 )
            // InternalHwMapDsl.g:1018:2: rule__Register__Group__0__Impl rule__Register__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Register__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Register__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__0"


    // $ANTLR start "rule__Register__Group__0__Impl"
    // InternalHwMapDsl.g:1025:1: rule__Register__Group__0__Impl : ( ( rule__Register__AddrAssignment_0 ) ) ;
    public final void rule__Register__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1029:1: ( ( ( rule__Register__AddrAssignment_0 ) ) )
            // InternalHwMapDsl.g:1030:1: ( ( rule__Register__AddrAssignment_0 ) )
            {
            // InternalHwMapDsl.g:1030:1: ( ( rule__Register__AddrAssignment_0 ) )
            // InternalHwMapDsl.g:1031:2: ( rule__Register__AddrAssignment_0 )
            {
             before(grammarAccess.getRegisterAccess().getAddrAssignment_0()); 
            // InternalHwMapDsl.g:1032:2: ( rule__Register__AddrAssignment_0 )
            // InternalHwMapDsl.g:1032:3: rule__Register__AddrAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Register__AddrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegisterAccess().getAddrAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__0__Impl"


    // $ANTLR start "rule__Register__Group__1"
    // InternalHwMapDsl.g:1040:1: rule__Register__Group__1 : rule__Register__Group__1__Impl rule__Register__Group__2 ;
    public final void rule__Register__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1044:1: ( rule__Register__Group__1__Impl rule__Register__Group__2 )
            // InternalHwMapDsl.g:1045:2: rule__Register__Group__1__Impl rule__Register__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Register__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Register__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__1"


    // $ANTLR start "rule__Register__Group__1__Impl"
    // InternalHwMapDsl.g:1052:1: rule__Register__Group__1__Impl : ( ( rule__Register__NameAssignment_1 ) ) ;
    public final void rule__Register__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1056:1: ( ( ( rule__Register__NameAssignment_1 ) ) )
            // InternalHwMapDsl.g:1057:1: ( ( rule__Register__NameAssignment_1 ) )
            {
            // InternalHwMapDsl.g:1057:1: ( ( rule__Register__NameAssignment_1 ) )
            // InternalHwMapDsl.g:1058:2: ( rule__Register__NameAssignment_1 )
            {
             before(grammarAccess.getRegisterAccess().getNameAssignment_1()); 
            // InternalHwMapDsl.g:1059:2: ( rule__Register__NameAssignment_1 )
            // InternalHwMapDsl.g:1059:3: rule__Register__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Register__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegisterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__1__Impl"


    // $ANTLR start "rule__Register__Group__2"
    // InternalHwMapDsl.g:1067:1: rule__Register__Group__2 : rule__Register__Group__2__Impl rule__Register__Group__3 ;
    public final void rule__Register__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1071:1: ( rule__Register__Group__2__Impl rule__Register__Group__3 )
            // InternalHwMapDsl.g:1072:2: rule__Register__Group__2__Impl rule__Register__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Register__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Register__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__2"


    // $ANTLR start "rule__Register__Group__2__Impl"
    // InternalHwMapDsl.g:1079:1: rule__Register__Group__2__Impl : ( ( rule__Register__ConstsAssignment_2 )* ) ;
    public final void rule__Register__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1083:1: ( ( ( rule__Register__ConstsAssignment_2 )* ) )
            // InternalHwMapDsl.g:1084:1: ( ( rule__Register__ConstsAssignment_2 )* )
            {
            // InternalHwMapDsl.g:1084:1: ( ( rule__Register__ConstsAssignment_2 )* )
            // InternalHwMapDsl.g:1085:2: ( rule__Register__ConstsAssignment_2 )*
            {
             before(grammarAccess.getRegisterAccess().getConstsAssignment_2()); 
            // InternalHwMapDsl.g:1086:2: ( rule__Register__ConstsAssignment_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHwMapDsl.g:1086:3: rule__Register__ConstsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Register__ConstsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRegisterAccess().getConstsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__2__Impl"


    // $ANTLR start "rule__Register__Group__3"
    // InternalHwMapDsl.g:1094:1: rule__Register__Group__3 : rule__Register__Group__3__Impl ;
    public final void rule__Register__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1098:1: ( rule__Register__Group__3__Impl )
            // InternalHwMapDsl.g:1099:2: rule__Register__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Register__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__3"


    // $ANTLR start "rule__Register__Group__3__Impl"
    // InternalHwMapDsl.g:1105:1: rule__Register__Group__3__Impl : ( ( rule__Register__BitsAssignment_3 )* ) ;
    public final void rule__Register__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1109:1: ( ( ( rule__Register__BitsAssignment_3 )* ) )
            // InternalHwMapDsl.g:1110:1: ( ( rule__Register__BitsAssignment_3 )* )
            {
            // InternalHwMapDsl.g:1110:1: ( ( rule__Register__BitsAssignment_3 )* )
            // InternalHwMapDsl.g:1111:2: ( rule__Register__BitsAssignment_3 )*
            {
             before(grammarAccess.getRegisterAccess().getBitsAssignment_3()); 
            // InternalHwMapDsl.g:1112:2: ( rule__Register__BitsAssignment_3 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalHwMapDsl.g:1112:3: rule__Register__BitsAssignment_3
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__Register__BitsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRegisterAccess().getBitsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__Group__3__Impl"


    // $ANTLR start "rule__RegisterBits__Group__0"
    // InternalHwMapDsl.g:1121:1: rule__RegisterBits__Group__0 : rule__RegisterBits__Group__0__Impl rule__RegisterBits__Group__1 ;
    public final void rule__RegisterBits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1125:1: ( rule__RegisterBits__Group__0__Impl rule__RegisterBits__Group__1 )
            // InternalHwMapDsl.g:1126:2: rule__RegisterBits__Group__0__Impl rule__RegisterBits__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__RegisterBits__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisterBits__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__Group__0"


    // $ANTLR start "rule__RegisterBits__Group__0__Impl"
    // InternalHwMapDsl.g:1133:1: rule__RegisterBits__Group__0__Impl : ( ( rule__RegisterBits__RangeAssignment_0 ) ) ;
    public final void rule__RegisterBits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1137:1: ( ( ( rule__RegisterBits__RangeAssignment_0 ) ) )
            // InternalHwMapDsl.g:1138:1: ( ( rule__RegisterBits__RangeAssignment_0 ) )
            {
            // InternalHwMapDsl.g:1138:1: ( ( rule__RegisterBits__RangeAssignment_0 ) )
            // InternalHwMapDsl.g:1139:2: ( rule__RegisterBits__RangeAssignment_0 )
            {
             before(grammarAccess.getRegisterBitsAccess().getRangeAssignment_0()); 
            // InternalHwMapDsl.g:1140:2: ( rule__RegisterBits__RangeAssignment_0 )
            // InternalHwMapDsl.g:1140:3: rule__RegisterBits__RangeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RegisterBits__RangeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRegisterBitsAccess().getRangeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__Group__0__Impl"


    // $ANTLR start "rule__RegisterBits__Group__1"
    // InternalHwMapDsl.g:1148:1: rule__RegisterBits__Group__1 : rule__RegisterBits__Group__1__Impl rule__RegisterBits__Group__2 ;
    public final void rule__RegisterBits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1152:1: ( rule__RegisterBits__Group__1__Impl rule__RegisterBits__Group__2 )
            // InternalHwMapDsl.g:1153:2: rule__RegisterBits__Group__1__Impl rule__RegisterBits__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RegisterBits__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisterBits__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__Group__1"


    // $ANTLR start "rule__RegisterBits__Group__1__Impl"
    // InternalHwMapDsl.g:1160:1: rule__RegisterBits__Group__1__Impl : ( ( rule__RegisterBits__NameAssignment_1 ) ) ;
    public final void rule__RegisterBits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1164:1: ( ( ( rule__RegisterBits__NameAssignment_1 ) ) )
            // InternalHwMapDsl.g:1165:1: ( ( rule__RegisterBits__NameAssignment_1 ) )
            {
            // InternalHwMapDsl.g:1165:1: ( ( rule__RegisterBits__NameAssignment_1 ) )
            // InternalHwMapDsl.g:1166:2: ( rule__RegisterBits__NameAssignment_1 )
            {
             before(grammarAccess.getRegisterBitsAccess().getNameAssignment_1()); 
            // InternalHwMapDsl.g:1167:2: ( rule__RegisterBits__NameAssignment_1 )
            // InternalHwMapDsl.g:1167:3: rule__RegisterBits__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegisterBits__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegisterBitsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__Group__1__Impl"


    // $ANTLR start "rule__RegisterBits__Group__2"
    // InternalHwMapDsl.g:1175:1: rule__RegisterBits__Group__2 : rule__RegisterBits__Group__2__Impl ;
    public final void rule__RegisterBits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1179:1: ( rule__RegisterBits__Group__2__Impl )
            // InternalHwMapDsl.g:1180:2: rule__RegisterBits__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisterBits__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__Group__2"


    // $ANTLR start "rule__RegisterBits__Group__2__Impl"
    // InternalHwMapDsl.g:1186:1: rule__RegisterBits__Group__2__Impl : ( ( rule__RegisterBits__ConstsAssignment_2 )* ) ;
    public final void rule__RegisterBits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1190:1: ( ( ( rule__RegisterBits__ConstsAssignment_2 )* ) )
            // InternalHwMapDsl.g:1191:1: ( ( rule__RegisterBits__ConstsAssignment_2 )* )
            {
            // InternalHwMapDsl.g:1191:1: ( ( rule__RegisterBits__ConstsAssignment_2 )* )
            // InternalHwMapDsl.g:1192:2: ( rule__RegisterBits__ConstsAssignment_2 )*
            {
             before(grammarAccess.getRegisterBitsAccess().getConstsAssignment_2()); 
            // InternalHwMapDsl.g:1193:2: ( rule__RegisterBits__ConstsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHwMapDsl.g:1193:3: rule__RegisterBits__ConstsAssignment_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RegisterBits__ConstsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRegisterBitsAccess().getConstsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalHwMapDsl.g:1202:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1206:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalHwMapDsl.g:1207:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalHwMapDsl.g:1214:1: rule__Range__Group__0__Impl : ( '[' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1218:1: ( ( '[' ) )
            // InternalHwMapDsl.g:1219:1: ( '[' )
            {
            // InternalHwMapDsl.g:1219:1: ( '[' )
            // InternalHwMapDsl.g:1220:2: '['
            {
             before(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalHwMapDsl.g:1229:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1233:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalHwMapDsl.g:1234:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalHwMapDsl.g:1241:1: rule__Range__Group__1__Impl : ( ( rule__Range__LeftAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1245:1: ( ( ( rule__Range__LeftAssignment_1 ) ) )
            // InternalHwMapDsl.g:1246:1: ( ( rule__Range__LeftAssignment_1 ) )
            {
            // InternalHwMapDsl.g:1246:1: ( ( rule__Range__LeftAssignment_1 ) )
            // InternalHwMapDsl.g:1247:2: ( rule__Range__LeftAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getLeftAssignment_1()); 
            // InternalHwMapDsl.g:1248:2: ( rule__Range__LeftAssignment_1 )
            // InternalHwMapDsl.g:1248:3: rule__Range__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalHwMapDsl.g:1256:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1260:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalHwMapDsl.g:1261:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalHwMapDsl.g:1268:1: rule__Range__Group__2__Impl : ( ( rule__Range__Group_2__0 )? ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1272:1: ( ( ( rule__Range__Group_2__0 )? ) )
            // InternalHwMapDsl.g:1273:1: ( ( rule__Range__Group_2__0 )? )
            {
            // InternalHwMapDsl.g:1273:1: ( ( rule__Range__Group_2__0 )? )
            // InternalHwMapDsl.g:1274:2: ( rule__Range__Group_2__0 )?
            {
             before(grammarAccess.getRangeAccess().getGroup_2()); 
            // InternalHwMapDsl.g:1275:2: ( rule__Range__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_OP_2DOT) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHwMapDsl.g:1275:3: rule__Range__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Range__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRangeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalHwMapDsl.g:1283:1: rule__Range__Group__3 : rule__Range__Group__3__Impl ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1287:1: ( rule__Range__Group__3__Impl )
            // InternalHwMapDsl.g:1288:2: rule__Range__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalHwMapDsl.g:1294:1: rule__Range__Group__3__Impl : ( ']' ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1298:1: ( ( ']' ) )
            // InternalHwMapDsl.g:1299:1: ( ']' )
            {
            // InternalHwMapDsl.g:1299:1: ( ']' )
            // InternalHwMapDsl.g:1300:2: ']'
            {
             before(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group_2__0"
    // InternalHwMapDsl.g:1310:1: rule__Range__Group_2__0 : rule__Range__Group_2__0__Impl rule__Range__Group_2__1 ;
    public final void rule__Range__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1314:1: ( rule__Range__Group_2__0__Impl rule__Range__Group_2__1 )
            // InternalHwMapDsl.g:1315:2: rule__Range__Group_2__0__Impl rule__Range__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Range__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__0"


    // $ANTLR start "rule__Range__Group_2__0__Impl"
    // InternalHwMapDsl.g:1322:1: rule__Range__Group_2__0__Impl : ( RULE_OP_2DOT ) ;
    public final void rule__Range__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1326:1: ( ( RULE_OP_2DOT ) )
            // InternalHwMapDsl.g:1327:1: ( RULE_OP_2DOT )
            {
            // InternalHwMapDsl.g:1327:1: ( RULE_OP_2DOT )
            // InternalHwMapDsl.g:1328:2: RULE_OP_2DOT
            {
             before(grammarAccess.getRangeAccess().getOP_2DOTTerminalRuleCall_2_0()); 
            match(input,RULE_OP_2DOT,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getOP_2DOTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__0__Impl"


    // $ANTLR start "rule__Range__Group_2__1"
    // InternalHwMapDsl.g:1337:1: rule__Range__Group_2__1 : rule__Range__Group_2__1__Impl ;
    public final void rule__Range__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1341:1: ( rule__Range__Group_2__1__Impl )
            // InternalHwMapDsl.g:1342:2: rule__Range__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__1"


    // $ANTLR start "rule__Range__Group_2__1__Impl"
    // InternalHwMapDsl.g:1348:1: rule__Range__Group_2__1__Impl : ( ( rule__Range__RightAssignment_2_1 ) ) ;
    public final void rule__Range__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1352:1: ( ( ( rule__Range__RightAssignment_2_1 ) ) )
            // InternalHwMapDsl.g:1353:1: ( ( rule__Range__RightAssignment_2_1 ) )
            {
            // InternalHwMapDsl.g:1353:1: ( ( rule__Range__RightAssignment_2_1 ) )
            // InternalHwMapDsl.g:1354:2: ( rule__Range__RightAssignment_2_1 )
            {
             before(grammarAccess.getRangeAccess().getRightAssignment_2_1()); 
            // InternalHwMapDsl.g:1355:2: ( rule__Range__RightAssignment_2_1 )
            // InternalHwMapDsl.g:1355:3: rule__Range__RightAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Range__RightAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getRightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group__0"
    // InternalHwMapDsl.g:1364:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1368:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalHwMapDsl.g:1369:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Constant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0"


    // $ANTLR start "rule__Constant__Group__0__Impl"
    // InternalHwMapDsl.g:1376:1: rule__Constant__Group__0__Impl : ( 'Constant' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1380:1: ( ( 'Constant' ) )
            // InternalHwMapDsl.g:1381:1: ( 'Constant' )
            {
            // InternalHwMapDsl.g:1381:1: ( 'Constant' )
            // InternalHwMapDsl.g:1382:2: 'Constant'
            {
             before(grammarAccess.getConstantAccess().getConstantKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getConstantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__0__Impl"


    // $ANTLR start "rule__Constant__Group__1"
    // InternalHwMapDsl.g:1391:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1395:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalHwMapDsl.g:1396:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Constant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1"


    // $ANTLR start "rule__Constant__Group__1__Impl"
    // InternalHwMapDsl.g:1403:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__ValueAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1407:1: ( ( ( rule__Constant__ValueAssignment_1 ) ) )
            // InternalHwMapDsl.g:1408:1: ( ( rule__Constant__ValueAssignment_1 ) )
            {
            // InternalHwMapDsl.g:1408:1: ( ( rule__Constant__ValueAssignment_1 ) )
            // InternalHwMapDsl.g:1409:2: ( rule__Constant__ValueAssignment_1 )
            {
             before(grammarAccess.getConstantAccess().getValueAssignment_1()); 
            // InternalHwMapDsl.g:1410:2: ( rule__Constant__ValueAssignment_1 )
            // InternalHwMapDsl.g:1410:3: rule__Constant__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Constant__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__1__Impl"


    // $ANTLR start "rule__Constant__Group__2"
    // InternalHwMapDsl.g:1418:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1422:1: ( rule__Constant__Group__2__Impl )
            // InternalHwMapDsl.g:1423:2: rule__Constant__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2"


    // $ANTLR start "rule__Constant__Group__2__Impl"
    // InternalHwMapDsl.g:1429:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1433:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // InternalHwMapDsl.g:1434:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // InternalHwMapDsl.g:1434:1: ( ( rule__Constant__NameAssignment_2 ) )
            // InternalHwMapDsl.g:1435:2: ( rule__Constant__NameAssignment_2 )
            {
             before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            // InternalHwMapDsl.g:1436:2: ( rule__Constant__NameAssignment_2 )
            // InternalHwMapDsl.g:1436:3: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constant__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group__2__Impl"


    // $ANTLR start "rule__MemoryMap__OutputsAssignment_1"
    // InternalHwMapDsl.g:1445:1: rule__MemoryMap__OutputsAssignment_1 : ( ruleOutput ) ;
    public final void rule__MemoryMap__OutputsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1449:1: ( ( ruleOutput ) )
            // InternalHwMapDsl.g:1450:2: ( ruleOutput )
            {
            // InternalHwMapDsl.g:1450:2: ( ruleOutput )
            // InternalHwMapDsl.g:1451:3: ruleOutput
            {
             before(grammarAccess.getMemoryMapAccess().getOutputsOutputParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOutput();

            state._fsp--;

             after(grammarAccess.getMemoryMapAccess().getOutputsOutputParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__OutputsAssignment_1"


    // $ANTLR start "rule__MemoryMap__ComponentsAssignment_2"
    // InternalHwMapDsl.g:1460:1: rule__MemoryMap__ComponentsAssignment_2 : ( ruleComponent ) ;
    public final void rule__MemoryMap__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1464:1: ( ( ruleComponent ) )
            // InternalHwMapDsl.g:1465:2: ( ruleComponent )
            {
            // InternalHwMapDsl.g:1465:2: ( ruleComponent )
            // InternalHwMapDsl.g:1466:3: ruleComponent
            {
             before(grammarAccess.getMemoryMapAccess().getComponentsComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getMemoryMapAccess().getComponentsComponentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemoryMap__ComponentsAssignment_2"


    // $ANTLR start "rule__Output__ModeAssignment_2"
    // InternalHwMapDsl.g:1475:1: rule__Output__ModeAssignment_2 : ( ( rule__Output__ModeAlternatives_2_0 ) ) ;
    public final void rule__Output__ModeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1479:1: ( ( ( rule__Output__ModeAlternatives_2_0 ) ) )
            // InternalHwMapDsl.g:1480:2: ( ( rule__Output__ModeAlternatives_2_0 ) )
            {
            // InternalHwMapDsl.g:1480:2: ( ( rule__Output__ModeAlternatives_2_0 ) )
            // InternalHwMapDsl.g:1481:3: ( rule__Output__ModeAlternatives_2_0 )
            {
             before(grammarAccess.getOutputAccess().getModeAlternatives_2_0()); 
            // InternalHwMapDsl.g:1482:3: ( rule__Output__ModeAlternatives_2_0 )
            // InternalHwMapDsl.g:1482:4: rule__Output__ModeAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Output__ModeAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOutputAccess().getModeAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__ModeAssignment_2"


    // $ANTLR start "rule__Output__PathAssignment_3"
    // InternalHwMapDsl.g:1490:1: rule__Output__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Output__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1494:1: ( ( RULE_STRING ) )
            // InternalHwMapDsl.g:1495:2: ( RULE_STRING )
            {
            // InternalHwMapDsl.g:1495:2: ( RULE_STRING )
            // InternalHwMapDsl.g:1496:3: RULE_STRING
            {
             before(grammarAccess.getOutputAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutputAccess().getPathSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__PathAssignment_3"


    // $ANTLR start "rule__Component__CompNameAssignment_2"
    // InternalHwMapDsl.g:1505:1: rule__Component__CompNameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Component__CompNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1509:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1510:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1510:2: ( RULE_ID )
            // InternalHwMapDsl.g:1511:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getCompNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCompNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__CompNameAssignment_2"


    // $ANTLR start "rule__Component__BlocksAssignment_4_0"
    // InternalHwMapDsl.g:1520:1: rule__Component__BlocksAssignment_4_0 : ( ruleBlock ) ;
    public final void rule__Component__BlocksAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1524:1: ( ( ruleBlock ) )
            // InternalHwMapDsl.g:1525:2: ( ruleBlock )
            {
            // InternalHwMapDsl.g:1525:2: ( ruleBlock )
            // InternalHwMapDsl.g:1526:3: ruleBlock
            {
             before(grammarAccess.getComponentAccess().getBlocksBlockParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getBlocksBlockParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__BlocksAssignment_4_0"


    // $ANTLR start "rule__Component__InstsAssignment_4_1"
    // InternalHwMapDsl.g:1535:1: rule__Component__InstsAssignment_4_1 : ( ruleInstantiation ) ;
    public final void rule__Component__InstsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1539:1: ( ( ruleInstantiation ) )
            // InternalHwMapDsl.g:1540:2: ( ruleInstantiation )
            {
            // InternalHwMapDsl.g:1540:2: ( ruleInstantiation )
            // InternalHwMapDsl.g:1541:3: ruleInstantiation
            {
             before(grammarAccess.getComponentAccess().getInstsInstantiationParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleInstantiation();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getInstsInstantiationParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__InstsAssignment_4_1"


    // $ANTLR start "rule__Instantiation__AddrAssignment_1"
    // InternalHwMapDsl.g:1550:1: rule__Instantiation__AddrAssignment_1 : ( ruleIntegerLiteral ) ;
    public final void rule__Instantiation__AddrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1554:1: ( ( ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:1555:2: ( ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:1555:2: ( ruleIntegerLiteral )
            // InternalHwMapDsl.g:1556:3: ruleIntegerLiteral
            {
             before(grammarAccess.getInstantiationAccess().getAddrIntegerLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getInstantiationAccess().getAddrIntegerLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__AddrAssignment_1"


    // $ANTLR start "rule__Instantiation__TypeAssignment_2"
    // InternalHwMapDsl.g:1565:1: rule__Instantiation__TypeAssignment_2 : ( RULE_ID ) ;
    public final void rule__Instantiation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1569:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1570:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1570:2: ( RULE_ID )
            // InternalHwMapDsl.g:1571:3: RULE_ID
            {
             before(grammarAccess.getInstantiationAccess().getTypeIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstantiationAccess().getTypeIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__TypeAssignment_2"


    // $ANTLR start "rule__Instantiation__NameAssignment_3"
    // InternalHwMapDsl.g:1580:1: rule__Instantiation__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Instantiation__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1584:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1585:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1585:2: ( RULE_ID )
            // InternalHwMapDsl.g:1586:3: RULE_ID
            {
             before(grammarAccess.getInstantiationAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInstantiationAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instantiation__NameAssignment_3"


    // $ANTLR start "rule__Block__NameAssignment_2"
    // InternalHwMapDsl.g:1595:1: rule__Block__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1599:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1600:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1600:2: ( RULE_ID )
            // InternalHwMapDsl.g:1601:3: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_2"


    // $ANTLR start "rule__Block__SizeAssignment_3"
    // InternalHwMapDsl.g:1610:1: rule__Block__SizeAssignment_3 : ( ruleIntegerLiteral ) ;
    public final void rule__Block__SizeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1614:1: ( ( ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:1615:2: ( ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:1615:2: ( ruleIntegerLiteral )
            // InternalHwMapDsl.g:1616:3: ruleIntegerLiteral
            {
             before(grammarAccess.getBlockAccess().getSizeIntegerLiteralParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getSizeIntegerLiteralParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__SizeAssignment_3"


    // $ANTLR start "rule__Block__RegsAssignment_5"
    // InternalHwMapDsl.g:1625:1: rule__Block__RegsAssignment_5 : ( ruleRegister ) ;
    public final void rule__Block__RegsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1629:1: ( ( ruleRegister ) )
            // InternalHwMapDsl.g:1630:2: ( ruleRegister )
            {
            // InternalHwMapDsl.g:1630:2: ( ruleRegister )
            // InternalHwMapDsl.g:1631:3: ruleRegister
            {
             before(grammarAccess.getBlockAccess().getRegsRegisterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRegister();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getRegsRegisterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__RegsAssignment_5"


    // $ANTLR start "rule__Register__AddrAssignment_0"
    // InternalHwMapDsl.g:1640:1: rule__Register__AddrAssignment_0 : ( ruleIntegerLiteral ) ;
    public final void rule__Register__AddrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1644:1: ( ( ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:1645:2: ( ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:1645:2: ( ruleIntegerLiteral )
            // InternalHwMapDsl.g:1646:3: ruleIntegerLiteral
            {
             before(grammarAccess.getRegisterAccess().getAddrIntegerLiteralParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getRegisterAccess().getAddrIntegerLiteralParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__AddrAssignment_0"


    // $ANTLR start "rule__Register__NameAssignment_1"
    // InternalHwMapDsl.g:1655:1: rule__Register__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Register__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1659:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1660:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1660:2: ( RULE_ID )
            // InternalHwMapDsl.g:1661:3: RULE_ID
            {
             before(grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegisterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__NameAssignment_1"


    // $ANTLR start "rule__Register__ConstsAssignment_2"
    // InternalHwMapDsl.g:1670:1: rule__Register__ConstsAssignment_2 : ( ruleConstant ) ;
    public final void rule__Register__ConstsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1674:1: ( ( ruleConstant ) )
            // InternalHwMapDsl.g:1675:2: ( ruleConstant )
            {
            // InternalHwMapDsl.g:1675:2: ( ruleConstant )
            // InternalHwMapDsl.g:1676:3: ruleConstant
            {
             before(grammarAccess.getRegisterAccess().getConstsConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getRegisterAccess().getConstsConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__ConstsAssignment_2"


    // $ANTLR start "rule__Register__BitsAssignment_3"
    // InternalHwMapDsl.g:1685:1: rule__Register__BitsAssignment_3 : ( ruleRegisterBits ) ;
    public final void rule__Register__BitsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1689:1: ( ( ruleRegisterBits ) )
            // InternalHwMapDsl.g:1690:2: ( ruleRegisterBits )
            {
            // InternalHwMapDsl.g:1690:2: ( ruleRegisterBits )
            // InternalHwMapDsl.g:1691:3: ruleRegisterBits
            {
             before(grammarAccess.getRegisterAccess().getBitsRegisterBitsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRegisterBits();

            state._fsp--;

             after(grammarAccess.getRegisterAccess().getBitsRegisterBitsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Register__BitsAssignment_3"


    // $ANTLR start "rule__RegisterBits__RangeAssignment_0"
    // InternalHwMapDsl.g:1700:1: rule__RegisterBits__RangeAssignment_0 : ( ruleRange ) ;
    public final void rule__RegisterBits__RangeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1704:1: ( ( ruleRange ) )
            // InternalHwMapDsl.g:1705:2: ( ruleRange )
            {
            // InternalHwMapDsl.g:1705:2: ( ruleRange )
            // InternalHwMapDsl.g:1706:3: ruleRange
            {
             before(grammarAccess.getRegisterBitsAccess().getRangeRangeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRegisterBitsAccess().getRangeRangeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__RangeAssignment_0"


    // $ANTLR start "rule__RegisterBits__NameAssignment_1"
    // InternalHwMapDsl.g:1715:1: rule__RegisterBits__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RegisterBits__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1719:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1720:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1720:2: ( RULE_ID )
            // InternalHwMapDsl.g:1721:3: RULE_ID
            {
             before(grammarAccess.getRegisterBitsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegisterBitsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__NameAssignment_1"


    // $ANTLR start "rule__RegisterBits__ConstsAssignment_2"
    // InternalHwMapDsl.g:1730:1: rule__RegisterBits__ConstsAssignment_2 : ( ruleConstant ) ;
    public final void rule__RegisterBits__ConstsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1734:1: ( ( ruleConstant ) )
            // InternalHwMapDsl.g:1735:2: ( ruleConstant )
            {
            // InternalHwMapDsl.g:1735:2: ( ruleConstant )
            // InternalHwMapDsl.g:1736:3: ruleConstant
            {
             before(grammarAccess.getRegisterBitsAccess().getConstsConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getRegisterBitsAccess().getConstsConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterBits__ConstsAssignment_2"


    // $ANTLR start "rule__Range__LeftAssignment_1"
    // InternalHwMapDsl.g:1745:1: rule__Range__LeftAssignment_1 : ( ruleIntegerLiteral ) ;
    public final void rule__Range__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1749:1: ( ( ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:1750:2: ( ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:1750:2: ( ruleIntegerLiteral )
            // InternalHwMapDsl.g:1751:3: ruleIntegerLiteral
            {
             before(grammarAccess.getRangeAccess().getLeftIntegerLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getLeftIntegerLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LeftAssignment_1"


    // $ANTLR start "rule__Range__RightAssignment_2_1"
    // InternalHwMapDsl.g:1760:1: rule__Range__RightAssignment_2_1 : ( ruleIntegerLiteral ) ;
    public final void rule__Range__RightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1764:1: ( ( ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:1765:2: ( ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:1765:2: ( ruleIntegerLiteral )
            // InternalHwMapDsl.g:1766:3: ruleIntegerLiteral
            {
             before(grammarAccess.getRangeAccess().getRightIntegerLiteralParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getRightIntegerLiteralParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__RightAssignment_2_1"


    // $ANTLR start "rule__Constant__ValueAssignment_1"
    // InternalHwMapDsl.g:1775:1: rule__Constant__ValueAssignment_1 : ( ruleIntegerLiteral ) ;
    public final void rule__Constant__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1779:1: ( ( ruleIntegerLiteral ) )
            // InternalHwMapDsl.g:1780:2: ( ruleIntegerLiteral )
            {
            // InternalHwMapDsl.g:1780:2: ( ruleIntegerLiteral )
            // InternalHwMapDsl.g:1781:3: ruleIntegerLiteral
            {
             before(grammarAccess.getConstantAccess().getValueIntegerLiteralParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getConstantAccess().getValueIntegerLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__ValueAssignment_1"


    // $ANTLR start "rule__Constant__NameAssignment_2"
    // InternalHwMapDsl.g:1790:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHwMapDsl.g:1794:1: ( ( RULE_ID ) )
            // InternalHwMapDsl.g:1795:2: ( RULE_ID )
            {
            // InternalHwMapDsl.g:1795:2: ( RULE_ID )
            // InternalHwMapDsl.g:1796:3: RULE_ID
            {
             before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200040L});

}