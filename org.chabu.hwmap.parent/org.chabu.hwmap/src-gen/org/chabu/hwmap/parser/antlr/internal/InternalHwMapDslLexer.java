package org.chabu.hwmap.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHwMapDslLexer extends Lexer {
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

    public InternalHwMapDslLexer() {;} 
    public InternalHwMapDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalHwMapDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalHwMapDsl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:11:7: ( 'Output' )
            // InternalHwMapDsl.g:11:9: 'Output'
            {
            match("Output"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:12:7: ( 'VHDL' )
            // InternalHwMapDsl.g:12:9: 'VHDL'
            {
            match("VHDL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:13:7: ( 'C' )
            // InternalHwMapDsl.g:13:9: 'C'
            {
            match('C'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:14:7: ( 'Component' )
            // InternalHwMapDsl.g:14:9: 'Component'
            {
            match("Component"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:15:7: ( '{' )
            // InternalHwMapDsl.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:16:7: ( '}' )
            // InternalHwMapDsl.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:17:7: ( 'Block' )
            // InternalHwMapDsl.g:17:9: 'Block'
            {
            match("Block"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:18:7: ( '[' )
            // InternalHwMapDsl.g:18:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:19:7: ( ']' )
            // InternalHwMapDsl.g:19:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:20:7: ( 'Constant' )
            // InternalHwMapDsl.g:20:9: 'Constant'
            {
            match("Constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "RULE_INT_DEC"
    public final void mRULE_INT_DEC() throws RecognitionException {
        try {
            int _type = RULE_INT_DEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:808:14: ( ( ( '-' )? '1' .. '9' ( '0' .. '9' )* | '0' ) )
            // InternalHwMapDsl.g:808:16: ( ( '-' )? '1' .. '9' ( '0' .. '9' )* | '0' )
            {
            // InternalHwMapDsl.g:808:16: ( ( '-' )? '1' .. '9' ( '0' .. '9' )* | '0' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='-'||(LA3_0>='1' && LA3_0<='9')) ) {
                alt3=1;
            }
            else if ( (LA3_0=='0') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHwMapDsl.g:808:17: ( '-' )? '1' .. '9' ( '0' .. '9' )*
                    {
                    // InternalHwMapDsl.g:808:17: ( '-' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0=='-') ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalHwMapDsl.g:808:17: '-'
                            {
                            match('-'); 

                            }
                            break;

                    }

                    matchRange('1','9'); 
                    // InternalHwMapDsl.g:808:31: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalHwMapDsl.g:808:32: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:808:43: '0'
                    {
                    match('0'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_DEC"

    // $ANTLR start "RULE_INT_HEX"
    public final void mRULE_INT_HEX() throws RecognitionException {
        try {
            int _type = RULE_INT_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:810:14: ( '0x' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )+ )
            // InternalHwMapDsl.g:810:16: '0x' ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )+
            {
            match("0x"); 

            // InternalHwMapDsl.g:810:21: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalHwMapDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_HEX"

    // $ANTLR start "RULE_OP_2DOT"
    public final void mRULE_OP_2DOT() throws RecognitionException {
        try {
            int _type = RULE_OP_2DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:812:14: ( '..' )
            // InternalHwMapDsl.g:812:16: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OP_2DOT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:814:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalHwMapDsl.g:814:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalHwMapDsl.g:814:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHwMapDsl.g:814:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalHwMapDsl.g:814:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalHwMapDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:816:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalHwMapDsl.g:816:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalHwMapDsl.g:816:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalHwMapDsl.g:816:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalHwMapDsl.g:816:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalHwMapDsl.g:816:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalHwMapDsl.g:816:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalHwMapDsl.g:816:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalHwMapDsl.g:816:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalHwMapDsl.g:816:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalHwMapDsl.g:816:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:818:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalHwMapDsl.g:818:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalHwMapDsl.g:818:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalHwMapDsl.g:818:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:820:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalHwMapDsl.g:820:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalHwMapDsl.g:820:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalHwMapDsl.g:820:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalHwMapDsl.g:820:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHwMapDsl.g:820:41: ( '\\r' )? '\\n'
                    {
                    // InternalHwMapDsl.g:820:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalHwMapDsl.g:820:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:822:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalHwMapDsl.g:822:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalHwMapDsl.g:822:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalHwMapDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalHwMapDsl.g:824:16: ( . )
            // InternalHwMapDsl.g:824:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalHwMapDsl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_INT_DEC | RULE_INT_HEX | RULE_OP_2DOT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=19;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalHwMapDsl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalHwMapDsl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalHwMapDsl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalHwMapDsl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalHwMapDsl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalHwMapDsl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalHwMapDsl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalHwMapDsl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalHwMapDsl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalHwMapDsl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalHwMapDsl.g:1:70: RULE_INT_DEC
                {
                mRULE_INT_DEC(); 

                }
                break;
            case 12 :
                // InternalHwMapDsl.g:1:83: RULE_INT_HEX
                {
                mRULE_INT_HEX(); 

                }
                break;
            case 13 :
                // InternalHwMapDsl.g:1:96: RULE_OP_2DOT
                {
                mRULE_OP_2DOT(); 

                }
                break;
            case 14 :
                // InternalHwMapDsl.g:1:109: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 15 :
                // InternalHwMapDsl.g:1:117: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 16 :
                // InternalHwMapDsl.g:1:129: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 17 :
                // InternalHwMapDsl.g:1:145: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 18 :
                // InternalHwMapDsl.g:1:161: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 19 :
                // InternalHwMapDsl.g:1:169: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\25\1\30\2\uffff\1\25\2\uffff\1\23\1\uffff\1\36\2\23\1\uffff\3\23\2\uffff\1\25\1\uffff\2\25\3\uffff\1\25\11\uffff\6\25\1\60\4\25\1\uffff\2\25\1\67\1\70\2\25\2\uffff\3\25\1\76\1\77\2\uffff";
    static final String DFA15_eofS =
        "\100\uffff";
    static final String DFA15_minS =
        "\1\0\1\165\1\110\1\60\2\uffff\1\154\2\uffff\1\61\1\uffff\1\170\1\56\1\101\1\uffff\2\0\1\52\2\uffff\1\164\1\uffff\1\104\1\155\3\uffff\1\157\11\uffff\1\160\1\114\1\160\1\163\1\143\1\165\1\60\1\157\1\164\1\153\1\164\1\uffff\1\156\1\141\2\60\1\145\1\156\2\uffff\1\156\2\164\2\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\165\1\110\1\172\2\uffff\1\154\2\uffff\1\71\1\uffff\1\170\1\56\1\172\1\uffff\2\uffff\1\57\2\uffff\1\164\1\uffff\1\104\1\156\3\uffff\1\157\11\uffff\1\160\1\114\1\160\1\163\1\143\1\165\1\172\1\157\1\164\1\153\1\164\1\uffff\1\156\1\141\2\172\1\145\1\156\2\uffff\1\156\2\164\2\172\2\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\5\1\6\1\uffff\1\10\1\11\1\uffff\1\13\3\uffff\1\16\3\uffff\1\22\1\23\1\uffff\1\16\2\uffff\1\3\1\5\1\6\1\uffff\1\10\1\11\1\13\1\14\1\15\1\17\1\20\1\21\1\22\13\uffff\1\2\6\uffff\1\7\1\1\5\uffff\1\12\1\4";
    static final String DFA15_specialS =
        "\1\1\16\uffff\1\2\1\0\57\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\5\23\1\11\1\14\1\21\1\13\11\12\7\23\1\16\1\6\1\3\13\16\1\1\6\16\1\2\4\16\1\7\1\23\1\10\1\15\1\16\1\23\32\16\1\4\1\23\1\5\uff82\23",
            "\1\24",
            "\1\26",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\16\25\1\27\13\25",
            "",
            "",
            "\1\33",
            "",
            "",
            "\11\36",
            "",
            "\1\37",
            "\1\40",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\41",
            "\0\41",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "\1\45",
            "",
            "\1\46",
            "\1\47\1\50",
            "",
            "",
            "",
            "\1\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "\1\66",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\73",
            "\1\74",
            "\1\75",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | RULE_INT_DEC | RULE_INT_HEX | RULE_OP_2DOT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_16 = input.LA(1);

                        s = -1;
                        if ( ((LA15_16>='\u0000' && LA15_16<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='O') ) {s = 1;}

                        else if ( (LA15_0=='V') ) {s = 2;}

                        else if ( (LA15_0=='C') ) {s = 3;}

                        else if ( (LA15_0=='{') ) {s = 4;}

                        else if ( (LA15_0=='}') ) {s = 5;}

                        else if ( (LA15_0=='B') ) {s = 6;}

                        else if ( (LA15_0=='[') ) {s = 7;}

                        else if ( (LA15_0==']') ) {s = 8;}

                        else if ( (LA15_0=='-') ) {s = 9;}

                        else if ( ((LA15_0>='1' && LA15_0<='9')) ) {s = 10;}

                        else if ( (LA15_0=='0') ) {s = 11;}

                        else if ( (LA15_0=='.') ) {s = 12;}

                        else if ( (LA15_0=='^') ) {s = 13;}

                        else if ( (LA15_0=='A'||(LA15_0>='D' && LA15_0<='N')||(LA15_0>='P' && LA15_0<='U')||(LA15_0>='W' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {s = 14;}

                        else if ( (LA15_0=='\"') ) {s = 15;}

                        else if ( (LA15_0=='\'') ) {s = 16;}

                        else if ( (LA15_0=='/') ) {s = 17;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 18;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=',')||(LA15_0>=':' && LA15_0<='@')||LA15_0=='\\'||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_15 = input.LA(1);

                        s = -1;
                        if ( ((LA15_15>='\u0000' && LA15_15<='\uFFFF')) ) {s = 33;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}