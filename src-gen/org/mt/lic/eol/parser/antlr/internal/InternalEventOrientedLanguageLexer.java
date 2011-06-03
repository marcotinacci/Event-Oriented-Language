package org.mt.lic.eol.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventOrientedLanguageLexer extends Lexer {
    public static final int RULE_ID=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int Tokens=28;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=8;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int RULE_ML_COMMENT=7;
    public static final int RULE_STRING=6;
    public static final int RULE_INT=5;
    public static final int T11=11;
    public static final int T12=12;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=9;
    public static final int T15=15;
    public static final int T16=16;
    public static final int T17=17;
    public static final int T18=18;
    public static final int T19=19;
    public InternalEventOrientedLanguageLexer() {;} 
    public InternalEventOrientedLanguageLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g"; }

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:10:5: ( 'init:' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:10:7: 'init:'
            {
            match("init:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:11:5: ( 'end' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:11:7: 'end'
            {
            match("end"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:12:5: ( 'globals:' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:12:7: 'globals:'
            {
            match("globals:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:13:5: ( ';' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:13:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:14:5: ( 'events:' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:14:7: 'events:'
            {
            match("events:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:15:5: ( 'handlers:' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:15:7: 'handlers:'
            {
            match("handlers:"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:16:5: ( '(' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:16:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:17:5: ( ',' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:17:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:18:5: ( ')' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:18:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:19:5: ( '{' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:19:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:20:5: ( '}' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:20:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:21:5: ( '+=' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:21:7: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:22:5: ( '-=' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:22:7: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:23:5: ( '=' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:23:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:24:5: ( 'int' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:24:7: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:25:5: ( 'real' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:25:7: 'real'
            {
            match("real"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:26:5: ( 'bool' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:26:7: 'bool'
            {
            match("bool"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:10: ( ( '0' .. '9' )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:12: ( '0' .. '9' )+
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:12: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1208:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1208:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1208:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1208:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1208:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1210:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFE')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:62: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:82: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:87: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFE')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:88: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1210:129: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFE')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFE')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFE')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:41: ( '\\r' )? '\\n'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1214:41: '\\r'
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

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1216:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1216:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1218:16: ( . )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1218:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:8: ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=24;
        int LA12_0 = input.LA(1);

        if ( (LA12_0=='i') ) {
            int LA12_1 = input.LA(2);

            if ( (LA12_1=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    int LA12_46 = input.LA(4);

                    if ( ((LA12_46>='0' && LA12_46<='9')||(LA12_46>='A' && LA12_46<='Z')||LA12_46=='_'||(LA12_46>='a' && LA12_46<='z')) ) {
                        alt12=19;
                    }
                    else {
                        alt12=15;}
                    }
                    break;
                case 'i':
                    {
                    int LA12_47 = input.LA(4);

                    if ( (LA12_47=='t') ) {
                        int LA12_55 = input.LA(5);

                        if ( (LA12_55==':') ) {
                            alt12=1;
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                    }
                    break;
                default:
                    alt12=19;}

            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='e') ) {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA12_26 = input.LA(3);

                if ( (LA12_26=='d') ) {
                    int LA12_48 = input.LA(4);

                    if ( ((LA12_48>='0' && LA12_48<='9')||(LA12_48>='A' && LA12_48<='Z')||LA12_48=='_'||(LA12_48>='a' && LA12_48<='z')) ) {
                        alt12=19;
                    }
                    else {
                        alt12=2;}
                }
                else {
                    alt12=19;}
                }
                break;
            case 'v':
                {
                int LA12_27 = input.LA(3);

                if ( (LA12_27=='e') ) {
                    int LA12_49 = input.LA(4);

                    if ( (LA12_49=='n') ) {
                        int LA12_57 = input.LA(5);

                        if ( (LA12_57=='t') ) {
                            int LA12_63 = input.LA(6);

                            if ( (LA12_63=='s') ) {
                                int LA12_68 = input.LA(7);

                                if ( (LA12_68==':') ) {
                                    alt12=5;
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
                }
                break;
            default:
                alt12=19;}

        }
        else if ( (LA12_0=='g') ) {
            int LA12_3 = input.LA(2);

            if ( (LA12_3=='l') ) {
                int LA12_28 = input.LA(3);

                if ( (LA12_28=='o') ) {
                    int LA12_50 = input.LA(4);

                    if ( (LA12_50=='b') ) {
                        int LA12_58 = input.LA(5);

                        if ( (LA12_58=='a') ) {
                            int LA12_64 = input.LA(6);

                            if ( (LA12_64=='l') ) {
                                int LA12_69 = input.LA(7);

                                if ( (LA12_69=='s') ) {
                                    int LA12_72 = input.LA(8);

                                    if ( (LA12_72==':') ) {
                                        alt12=3;
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0==';') ) {
            alt12=4;
        }
        else if ( (LA12_0=='h') ) {
            int LA12_5 = input.LA(2);

            if ( (LA12_5=='a') ) {
                int LA12_30 = input.LA(3);

                if ( (LA12_30=='n') ) {
                    int LA12_51 = input.LA(4);

                    if ( (LA12_51=='d') ) {
                        int LA12_59 = input.LA(5);

                        if ( (LA12_59=='l') ) {
                            int LA12_65 = input.LA(6);

                            if ( (LA12_65=='e') ) {
                                int LA12_70 = input.LA(7);

                                if ( (LA12_70=='r') ) {
                                    int LA12_73 = input.LA(8);

                                    if ( (LA12_73=='s') ) {
                                        int LA12_75 = input.LA(9);

                                        if ( (LA12_75==':') ) {
                                            alt12=6;
                                        }
                                        else {
                                            alt12=19;}
                                    }
                                    else {
                                        alt12=19;}
                                }
                                else {
                                    alt12=19;}
                            }
                            else {
                                alt12=19;}
                        }
                        else {
                            alt12=19;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='(') ) {
            alt12=7;
        }
        else if ( (LA12_0==',') ) {
            alt12=8;
        }
        else if ( (LA12_0==')') ) {
            alt12=9;
        }
        else if ( (LA12_0=='{') ) {
            alt12=10;
        }
        else if ( (LA12_0=='}') ) {
            alt12=11;
        }
        else if ( (LA12_0=='+') ) {
            int LA12_11 = input.LA(2);

            if ( (LA12_11=='=') ) {
                alt12=12;
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='-') ) {
            int LA12_12 = input.LA(2);

            if ( (LA12_12=='=') ) {
                alt12=13;
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='=') ) {
            alt12=14;
        }
        else if ( (LA12_0=='r') ) {
            int LA12_14 = input.LA(2);

            if ( (LA12_14=='e') ) {
                int LA12_39 = input.LA(3);

                if ( (LA12_39=='a') ) {
                    int LA12_52 = input.LA(4);

                    if ( (LA12_52=='l') ) {
                        int LA12_60 = input.LA(5);

                        if ( ((LA12_60>='0' && LA12_60<='9')||(LA12_60>='A' && LA12_60<='Z')||LA12_60=='_'||(LA12_60>='a' && LA12_60<='z')) ) {
                            alt12=19;
                        }
                        else {
                            alt12=16;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( (LA12_0=='b') ) {
            int LA12_15 = input.LA(2);

            if ( (LA12_15=='o') ) {
                int LA12_40 = input.LA(3);

                if ( (LA12_40=='o') ) {
                    int LA12_53 = input.LA(4);

                    if ( (LA12_53=='l') ) {
                        int LA12_61 = input.LA(5);

                        if ( ((LA12_61>='0' && LA12_61<='9')||(LA12_61>='A' && LA12_61<='Z')||LA12_61=='_'||(LA12_61>='a' && LA12_61<='z')) ) {
                            alt12=19;
                        }
                        else {
                            alt12=17;}
                    }
                    else {
                        alt12=19;}
                }
                else {
                    alt12=19;}
            }
            else {
                alt12=19;}
        }
        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {
            alt12=18;
        }
        else if ( (LA12_0=='^') ) {
            int LA12_17 = input.LA(2);

            if ( ((LA12_17>='A' && LA12_17<='Z')||LA12_17=='_'||(LA12_17>='a' && LA12_17<='z')) ) {
                alt12=19;
            }
            else {
                alt12=24;}
        }
        else if ( ((LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='a'||(LA12_0>='c' && LA12_0<='d')||LA12_0=='f'||(LA12_0>='j' && LA12_0<='q')||(LA12_0>='s' && LA12_0<='z')) ) {
            alt12=19;
        }
        else if ( (LA12_0=='\"') ) {
            int LA12_19 = input.LA(2);

            if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFE')) ) {
                alt12=20;
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='\'') ) {
            int LA12_20 = input.LA(2);

            if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFE')) ) {
                alt12=20;
            }
            else {
                alt12=24;}
        }
        else if ( (LA12_0=='/') ) {
            switch ( input.LA(2) ) {
            case '/':
                {
                alt12=22;
                }
                break;
            case '*':
                {
                alt12=21;
                }
                break;
            default:
                alt12=24;}

        }
        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
            alt12=23;
        }
        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||LA12_0=='*'||LA12_0=='.'||LA12_0==':'||LA12_0=='<'||(LA12_0>='>' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFE')) ) {
            alt12=24;
        }
        else {
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T11 | T12 | T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | RULE_INT | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );", 12, 0, input);

            throw nvae;
        }
        switch (alt12) {
            case 1 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:10: T11
                {
                mT11(); 

                }
                break;
            case 2 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:14: T12
                {
                mT12(); 

                }
                break;
            case 3 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:18: T13
                {
                mT13(); 

                }
                break;
            case 4 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:22: T14
                {
                mT14(); 

                }
                break;
            case 5 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:26: T15
                {
                mT15(); 

                }
                break;
            case 6 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:30: T16
                {
                mT16(); 

                }
                break;
            case 7 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:34: T17
                {
                mT17(); 

                }
                break;
            case 8 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:38: T18
                {
                mT18(); 

                }
                break;
            case 9 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:42: T19
                {
                mT19(); 

                }
                break;
            case 10 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:46: T20
                {
                mT20(); 

                }
                break;
            case 11 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:50: T21
                {
                mT21(); 

                }
                break;
            case 12 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:54: T22
                {
                mT22(); 

                }
                break;
            case 13 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:58: T23
                {
                mT23(); 

                }
                break;
            case 14 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:62: T24
                {
                mT24(); 

                }
                break;
            case 15 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:66: T25
                {
                mT25(); 

                }
                break;
            case 16 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:70: T26
                {
                mT26(); 

                }
                break;
            case 17 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:74: T27
                {
                mT27(); 

                }
                break;
            case 18 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:78: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 19 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:87: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 20 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:95: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 21 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:107: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 22 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:123: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 23 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:139: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 24 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1:147: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


 

}