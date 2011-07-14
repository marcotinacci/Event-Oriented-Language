package org.mt.lic.eol.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mt.lic.eol.services.EventOrientedLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEventOrientedLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_REAL", "RULE_BOOL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init:'", "'end'", "'globals:'", "';'", "'events:'", "'handlers:'", "'('", "','", "')'", "'['", "']'", "'{'", "'}'", "'='", "'+='", "'-='", "'raise'", "'out'", "'in'", "'if'", "'else'", "'while'", "'AND'", "'OR'", "'<='", "'<'", "'=='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'NOT'", "'int'", "'real'", "'bool'", "'string'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=8;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=7;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalEventOrientedLanguageParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[80+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private EventOrientedLanguageGrammarAccess grammarAccess;
     	
        public InternalEventOrientedLanguageParser(TokenStream input, IAstFactory factory, EventOrientedLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Program";	
       	}
       	
       	@Override
       	protected EventOrientedLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleProgram
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:85:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


         
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getProgramAccess().getUnorderedGroup_0()
        		);
        	
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:91:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:92:2: iv_ruleProgram= ruleProgram EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram87);
            iv_ruleProgram=ruleProgram();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleProgram; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram97); if (failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:102:1: ruleProgram returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_globals_1_0 = null;

        EObject lv_events_2_0 = null;

        EObject lv_handlers_3_0 = null;

        EObject lv_init_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
        		UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        			grammarAccess.getProgramAccess().getUnorderedGroup_0()
        		);
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:110:6: ( ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:111:1: ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:111:1: ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:111:2: ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end'
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:111:2: ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:113:1: ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:113:1: ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:114:2: ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getProgramAccess().getUnorderedGroup_0());
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:117:2: ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:118:3: ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )*
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:118:3: ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )*
            loop1:
            do {
                int alt1=4;
                int LA1_0 = input.LA(1);

                if ( LA1_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2) ) {
                    alt1=3;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:120:4: ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:120:4: ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:121:5: {...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleProgram", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:121:104: ( ( (lv_globals_1_0= ruleGlobalSection ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:122:6: ( (lv_globals_1_0= ruleGlobalSection ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0);
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:125:6: ( (lv_globals_1_0= ruleGlobalSection ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:126:1: (lv_globals_1_0= ruleGlobalSection )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:126:1: (lv_globals_1_0= ruleGlobalSection )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:127:3: lv_globals_1_0= ruleGlobalSection
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getGlobalsGlobalSectionParserRuleCall_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGlobalSection_in_ruleProgram189);
            	    lv_globals_1_0=ruleGlobalSection();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"globals",
            	      	        		lv_globals_1_0, 
            	      	        		"GlobalSection", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgramAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:156:4: ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:156:4: ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:157:5: {...}? => ( ( (lv_events_2_0= ruleEventSection ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleProgram", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:157:104: ( ( (lv_events_2_0= ruleEventSection ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:158:6: ( (lv_events_2_0= ruleEventSection ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1);
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:161:6: ( (lv_events_2_0= ruleEventSection ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:162:1: (lv_events_2_0= ruleEventSection )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:162:1: (lv_events_2_0= ruleEventSection )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:163:3: lv_events_2_0= ruleEventSection
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getEventsEventSectionParserRuleCall_0_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEventSection_in_ruleProgram260);
            	    lv_events_2_0=ruleEventSection();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"events",
            	      	        		lv_events_2_0, 
            	      	        		"EventSection", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgramAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:192:4: ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:192:4: ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:193:5: {...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2) ) {
            	        if (backtracking>0) {failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleProgram", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:193:104: ( ( (lv_handlers_3_0= ruleHandlerSection ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:194:6: ( (lv_handlers_3_0= ruleHandlerSection ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2);
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:197:6: ( (lv_handlers_3_0= ruleHandlerSection ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:198:1: (lv_handlers_3_0= ruleHandlerSection )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:198:1: (lv_handlers_3_0= ruleHandlerSection )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:199:3: lv_handlers_3_0= ruleHandlerSection
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getHandlersHandlerSectionParserRuleCall_0_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHandlerSection_in_ruleProgram331);
            	    lv_handlers_3_0=ruleHandlerSection();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"handlers",
            	      	        		lv_handlers_3_0, 
            	      	        		"HandlerSection", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgramAccess().getUnorderedGroup_0());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getProgramAccess().getUnorderedGroup_0());

            }

            match(input,13,FOLLOW_13_in_ruleProgram380); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProgramAccess().getInitKeyword_1(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:239:1: ( (lv_init_5_0= ruleAbstractBlock ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:240:1: (lv_init_5_0= ruleAbstractBlock )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:240:1: (lv_init_5_0= ruleAbstractBlock )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:241:3: lv_init_5_0= ruleAbstractBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getInitAbstractBlockParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleProgram401);
            lv_init_5_0=ruleAbstractBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getProgramRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"init",
              	        		lv_init_5_0, 
              	        		"AbstractBlock", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            match(input,14,FOLLOW_14_in_ruleProgram411); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getProgramAccess().getEndKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleGlobalSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:278:1: entryRuleGlobalSection returns [EObject current=null] : iv_ruleGlobalSection= ruleGlobalSection EOF ;
    public final EObject entryRuleGlobalSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalSection = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:279:2: (iv_ruleGlobalSection= ruleGlobalSection EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:280:2: iv_ruleGlobalSection= ruleGlobalSection EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getGlobalSectionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleGlobalSection_in_entryRuleGlobalSection451);
            iv_ruleGlobalSection=ruleGlobalSection();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleGlobalSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalSection461); if (failed) return current;

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
    // $ANTLR end entryRuleGlobalSection


    // $ANTLR start ruleGlobalSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:287:1: ruleGlobalSection returns [EObject current=null] : ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ ) ;
    public final EObject ruleGlobalSection() throws RecognitionException {
        EObject current = null;

        EObject lv_globals_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:292:6: ( ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:293:1: ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:293:1: ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:293:3: 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+
            {
            match(input,15,FOLLOW_15_in_ruleGlobalSection496); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getGlobalSectionAccess().getGlobalsKeyword_0(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:297:1: ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=47 && LA2_0<=50)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:297:2: ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';'
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:297:2: ( (lv_globals_1_0= ruleVariableDeclaration ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:298:1: (lv_globals_1_0= ruleVariableDeclaration )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:298:1: (lv_globals_1_0= ruleVariableDeclaration )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:299:3: lv_globals_1_0= ruleVariableDeclaration
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getGlobalSectionAccess().getGlobalsVariableDeclarationParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalSection518);
            	    lv_globals_1_0=ruleVariableDeclaration();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getGlobalSectionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"globals",
            	      	        		lv_globals_1_0, 
            	      	        		"VariableDeclaration", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    match(input,16,FOLLOW_16_in_ruleGlobalSection528); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getGlobalSectionAccess().getSemicolonKeyword_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleGlobalSection


    // $ANTLR start entryRuleEventSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:333:1: entryRuleEventSection returns [EObject current=null] : iv_ruleEventSection= ruleEventSection EOF ;
    public final EObject entryRuleEventSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSection = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:334:2: (iv_ruleEventSection= ruleEventSection EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:335:2: iv_ruleEventSection= ruleEventSection EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEventSectionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEventSection_in_entryRuleEventSection566);
            iv_ruleEventSection=ruleEventSection();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEventSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSection576); if (failed) return current;

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
    // $ANTLR end entryRuleEventSection


    // $ANTLR start ruleEventSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:342:1: ruleEventSection returns [EObject current=null] : ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ ) ;
    public final EObject ruleEventSection() throws RecognitionException {
        EObject current = null;

        EObject lv_events_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:347:6: ( ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:348:1: ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:348:1: ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:348:3: 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+
            {
            match(input,17,FOLLOW_17_in_ruleEventSection611); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEventSectionAccess().getEventsKeyword_0(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:352:1: ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:352:2: ( (lv_events_1_0= ruleEventDecl ) ) ';'
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:352:2: ( (lv_events_1_0= ruleEventDecl ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:353:1: (lv_events_1_0= ruleEventDecl )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:353:1: (lv_events_1_0= ruleEventDecl )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:354:3: lv_events_1_0= ruleEventDecl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEventSectionAccess().getEventsEventDeclParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEventDecl_in_ruleEventSection633);
            	    lv_events_1_0=ruleEventDecl();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEventSectionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"events",
            	      	        		lv_events_1_0, 
            	      	        		"EventDecl", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    match(input,16,FOLLOW_16_in_ruleEventSection643); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getEventSectionAccess().getSemicolonKeyword_1_1(), null); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEventSection


    // $ANTLR start entryRuleHandlerSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:388:1: entryRuleHandlerSection returns [EObject current=null] : iv_ruleHandlerSection= ruleHandlerSection EOF ;
    public final EObject entryRuleHandlerSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerSection = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:389:2: (iv_ruleHandlerSection= ruleHandlerSection EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:390:2: iv_ruleHandlerSection= ruleHandlerSection EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHandlerSectionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHandlerSection_in_entryRuleHandlerSection681);
            iv_ruleHandlerSection=ruleHandlerSection();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHandlerSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerSection691); if (failed) return current;

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
    // $ANTLR end entryRuleHandlerSection


    // $ANTLR start ruleHandlerSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:397:1: ruleHandlerSection returns [EObject current=null] : ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ ) ;
    public final EObject ruleHandlerSection() throws RecognitionException {
        EObject current = null;

        EObject lv_handlers_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:402:6: ( ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:403:1: ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:403:1: ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:403:3: 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+
            {
            match(input,18,FOLLOW_18_in_ruleHandlerSection726); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHandlerSectionAccess().getHandlersKeyword_0(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:407:1: ( (lv_handlers_1_0= ruleHandlerDecl ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:408:1: (lv_handlers_1_0= ruleHandlerDecl )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:408:1: (lv_handlers_1_0= ruleHandlerDecl )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:409:3: lv_handlers_1_0= ruleHandlerDecl
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getHandlerSectionAccess().getHandlersHandlerDeclParserRuleCall_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHandlerDecl_in_ruleHandlerSection747);
            	    lv_handlers_1_0=ruleHandlerDecl();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getHandlerSectionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"handlers",
            	      	        		lv_handlers_1_0, 
            	      	        		"HandlerDecl", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleHandlerSection


    // $ANTLR start entryRuleEventDecl
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:439:1: entryRuleEventDecl returns [EObject current=null] : iv_ruleEventDecl= ruleEventDecl EOF ;
    public final EObject entryRuleEventDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDecl = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:440:2: (iv_ruleEventDecl= ruleEventDecl EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:441:2: iv_ruleEventDecl= ruleEventDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEventDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleEventDecl_in_entryRuleEventDecl784);
            iv_ruleEventDecl=ruleEventDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleEventDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDecl794); if (failed) return current;

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
    // $ANTLR end entryRuleEventDecl


    // $ANTLR start ruleEventDecl
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:448:1: ruleEventDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ) ;
    public final EObject ruleEventDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:453:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:454:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:454:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:454:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')'
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:454:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:455:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:455:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:456:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDecl836); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getEventDeclAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getEventDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,19,FOLLOW_19_in_ruleEventDecl851); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEventDeclAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:482:1: ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=47 && LA6_0<=50)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:482:2: ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:482:2: ( (lv_params_2_0= ruleVariableDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:483:1: (lv_params_2_0= ruleVariableDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:483:1: (lv_params_2_0= ruleVariableDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:484:3: lv_params_2_0= ruleVariableDeclaration
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getEventDeclAccess().getParamsVariableDeclarationParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleEventDecl873);
                    lv_params_2_0=ruleVariableDeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getEventDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"params",
                      	        		lv_params_2_0, 
                      	        		"VariableDeclaration", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:506:2: ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:506:4: ',' ( (lv_params_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleEventDecl884); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getEventDeclAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:510:1: ( (lv_params_4_0= ruleVariableDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:511:1: (lv_params_4_0= ruleVariableDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:511:1: (lv_params_4_0= ruleVariableDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:512:3: lv_params_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getEventDeclAccess().getParamsVariableDeclarationParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleEventDecl905);
                    	    lv_params_4_0=ruleVariableDeclaration();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getEventDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"params",
                    	      	        		lv_params_4_0, 
                    	      	        		"VariableDeclaration", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleEventDecl919); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getEventDeclAccess().getRightParenthesisKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleEventDecl


    // $ANTLR start entryRuleHandlerDecl
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:546:1: entryRuleHandlerDecl returns [EObject current=null] : iv_ruleHandlerDecl= ruleHandlerDecl EOF ;
    public final EObject entryRuleHandlerDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerDecl = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:547:2: (iv_ruleHandlerDecl= ruleHandlerDecl EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:548:2: iv_ruleHandlerDecl= ruleHandlerDecl EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getHandlerDeclRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl955);
            iv_ruleHandlerDecl=ruleHandlerDecl();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleHandlerDecl; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerDecl965); if (failed) return current;

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
    // $ANTLR end entryRuleHandlerDecl


    // $ANTLR start ruleHandlerDecl
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:555:1: ruleHandlerDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '[' ( ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )* )? ']' '(' ( ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_11_0= ruleAbstractBlock ) ) ) ;
    public final EObject ruleHandlerDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_bindParams_2_0 = null;

        EObject lv_bindParams_4_0 = null;

        EObject lv_params_7_0 = null;

        EObject lv_params_9_0 = null;

        EObject lv_body_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:560:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '[' ( ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )* )? ']' '(' ( ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_11_0= ruleAbstractBlock ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:561:1: ( ( (lv_name_0_0= RULE_ID ) ) '[' ( ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )* )? ']' '(' ( ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_11_0= ruleAbstractBlock ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:561:1: ( ( (lv_name_0_0= RULE_ID ) ) '[' ( ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )* )? ']' '(' ( ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_11_0= ruleAbstractBlock ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:561:2: ( (lv_name_0_0= RULE_ID ) ) '[' ( ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )* )? ']' '(' ( ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_11_0= ruleAbstractBlock ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:561:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:562:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:562:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:563:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHandlerDecl1007); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getHandlerDeclAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,22,FOLLOW_22_in_ruleHandlerDecl1022); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHandlerDeclAccess().getLeftSquareBracketKeyword_1(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:589:1: ( ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=47 && LA8_0<=50)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:589:2: ( (lv_bindParams_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:589:2: ( (lv_bindParams_2_0= ruleVariableDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:590:1: (lv_bindParams_2_0= ruleVariableDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:590:1: (lv_bindParams_2_0= ruleVariableDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:591:3: lv_bindParams_2_0= ruleVariableDeclaration
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getBindParamsVariableDeclarationParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1044);
                    lv_bindParams_2_0=ruleVariableDeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"bindParams",
                      	        		lv_bindParams_2_0, 
                      	        		"VariableDeclaration", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:613:2: ( ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:613:4: ',' ( (lv_bindParams_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleHandlerDecl1055); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getHandlerDeclAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:617:1: ( (lv_bindParams_4_0= ruleVariableDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:618:1: (lv_bindParams_4_0= ruleVariableDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:618:1: (lv_bindParams_4_0= ruleVariableDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:619:3: lv_bindParams_4_0= ruleVariableDeclaration
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getBindParamsVariableDeclarationParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1076);
                    	    lv_bindParams_4_0=ruleVariableDeclaration();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"bindParams",
                    	      	        		lv_bindParams_4_0, 
                    	      	        		"VariableDeclaration", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,23,FOLLOW_23_in_ruleHandlerDecl1090); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHandlerDeclAccess().getRightSquareBracketKeyword_3(), null); 
                  
            }
            match(input,19,FOLLOW_19_in_ruleHandlerDecl1100); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHandlerDeclAccess().getLeftParenthesisKeyword_4(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:649:1: ( ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=47 && LA10_0<=50)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:649:2: ( (lv_params_7_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:649:2: ( (lv_params_7_0= ruleVariableDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:650:1: (lv_params_7_0= ruleVariableDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:650:1: (lv_params_7_0= ruleVariableDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:651:3: lv_params_7_0= ruleVariableDeclaration
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getParamsVariableDeclarationParserRuleCall_5_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1122);
                    lv_params_7_0=ruleVariableDeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"params",
                      	        		lv_params_7_0, 
                      	        		"VariableDeclaration", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:673:2: ( ',' ( (lv_params_9_0= ruleVariableDeclaration ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:673:4: ',' ( (lv_params_9_0= ruleVariableDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleHandlerDecl1133); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getHandlerDeclAccess().getCommaKeyword_5_1_0(), null); 
                    	          
                    	    }
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:677:1: ( (lv_params_9_0= ruleVariableDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:678:1: (lv_params_9_0= ruleVariableDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:678:1: (lv_params_9_0= ruleVariableDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:679:3: lv_params_9_0= ruleVariableDeclaration
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getParamsVariableDeclarationParserRuleCall_5_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1154);
                    	    lv_params_9_0=ruleVariableDeclaration();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"params",
                    	      	        		lv_params_9_0, 
                    	      	        		"VariableDeclaration", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleHandlerDecl1168); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getHandlerDeclAccess().getRightParenthesisKeyword_6(), null); 
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:705:1: ( (lv_body_11_0= ruleAbstractBlock ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:706:1: (lv_body_11_0= ruleAbstractBlock )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:706:1: (lv_body_11_0= ruleAbstractBlock )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:707:3: lv_body_11_0= ruleAbstractBlock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getBodyAbstractBlockParserRuleCall_7_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleHandlerDecl1189);
            lv_body_11_0=ruleAbstractBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"body",
              	        		lv_body_11_0, 
              	        		"AbstractBlock", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleHandlerDecl


    // $ANTLR start entryRuleAbstractBlock
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:737:1: entryRuleAbstractBlock returns [EObject current=null] : iv_ruleAbstractBlock= ruleAbstractBlock EOF ;
    public final EObject entryRuleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBlock = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:738:2: (iv_ruleAbstractBlock= ruleAbstractBlock EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:739:2: iv_ruleAbstractBlock= ruleAbstractBlock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAbstractBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAbstractBlock_in_entryRuleAbstractBlock1225);
            iv_ruleAbstractBlock=ruleAbstractBlock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAbstractBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBlock1235); if (failed) return current;

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
    // $ANTLR end entryRuleAbstractBlock


    // $ANTLR start ruleAbstractBlock
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:746:1: ruleAbstractBlock returns [EObject current=null] : (this_Command_0= ruleCommand | ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' ) ) ;
    public final EObject ruleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject lv_body_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:751:6: ( (this_Command_0= ruleCommand | ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:1: (this_Command_0= ruleCommand | ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:1: (this_Command_0= ruleCommand | ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=29 && LA12_0<=32)||LA12_0==34||(LA12_0>=47 && LA12_0<=50)) ) {
                alt12=1;
            }
            else if ( (LA12_0==24) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("752:1: (this_Command_0= ruleCommand | ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' ) )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:753:2: this_Command_0= ruleCommand
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getCommandParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleAbstractBlock1285);
                    this_Command_0=ruleCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Command_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:765:6: ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:765:6: ( () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:765:7: () '{' ( (lv_body_3_0= ruleAbstractBlock ) )* '}'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:765:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:766:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAbstractBlockAccess().getCompoundAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAbstractBlockAccess().getCompoundAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,24,FOLLOW_24_in_ruleAbstractBlock1313); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractBlockAccess().getLeftCurlyBracketKeyword_1_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:783:1: ( (lv_body_3_0= ruleAbstractBlock ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==24||(LA11_0>=29 && LA11_0<=32)||LA11_0==34||(LA11_0>=47 && LA11_0<=50)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:784:1: (lv_body_3_0= ruleAbstractBlock )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:784:1: (lv_body_3_0= ruleAbstractBlock )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:785:3: lv_body_3_0= ruleAbstractBlock
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getBodyAbstractBlockParserRuleCall_1_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1334);
                    	    lv_body_3_0=ruleAbstractBlock();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getAbstractBlockRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"body",
                    	      	        		lv_body_3_0, 
                    	      	        		"AbstractBlock", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,25,FOLLOW_25_in_ruleAbstractBlock1345); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractBlockAccess().getRightCurlyBracketKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAbstractBlock


    // $ANTLR start entryRuleCommand
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:819:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:820:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:821:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1382);
            iv_ruleCommand=ruleCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1392); if (failed) return current;

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
    // $ANTLR end entryRuleCommand


    // $ANTLR start ruleCommand
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:828:1: ruleCommand returns [EObject current=null] : ( ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' ) | ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token lv_output_31_0=null;
        Token lv_balanced_42_0=null;
        EObject this_VariableDeclaration_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_bindParams_10_0 = null;

        EObject lv_bindParams_12_0 = null;

        EObject lv_params_22_0 = null;

        EObject lv_params_24_0 = null;

        EObject lv_output_28_0 = null;

        EObject lv_condition_39_0 = null;

        EObject lv_thenBlock_41_0 = null;

        EObject lv_elseBlock_43_0 = null;

        EObject lv_condition_47_0 = null;

        EObject lv_block_49_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:833:6: ( ( ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' ) | ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:834:1: ( ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' ) | ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:834:1: ( ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' ) | ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 29:
            case 30:
            case 31:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt18=1;
                }
                break;
            case 32:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("834:1: ( ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' ) | ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:834:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:834:2: ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:834:3: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ';'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:834:3: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )
                    int alt16=8;
                    switch ( input.LA(1) ) {
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        {
                        alt16=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        switch ( input.LA(2) ) {
                        case 27:
                            {
                            alt16=3;
                            }
                            break;
                        case 26:
                            {
                            alt16=2;
                            }
                            break;
                        case 28:
                            {
                            alt16=4;
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("834:3: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 16, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 29:
                        {
                        alt16=5;
                        }
                        break;
                    case 30:
                        {
                        int LA16_4 = input.LA(2);

                        if ( (LA16_4==RULE_STRING) ) {
                            int LA16_9 = input.LA(3);

                            if ( (synpred23()) ) {
                                alt16=6;
                            }
                            else if ( (synpred24()) ) {
                                alt16=7;
                            }
                            else {
                                if (backtracking>0) {failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("834:3: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 16, 9, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA16_4==RULE_ID||(LA16_4>=RULE_INT && LA16_4<=RULE_BOOL)||LA16_4==19||LA16_4==46) ) {
                            alt16=6;
                        }
                        else {
                            if (backtracking>0) {failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("834:3: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 16, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 31:
                        {
                        alt16=8;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("834:3: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 16, 0, input);

                        throw nvae;
                    }

                    switch (alt16) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:835:2: this_VariableDeclaration_0= ruleVariableDeclaration
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableDeclarationParserRuleCall_0_0_0(), currentNode); 
                                  
                            }
                            pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleCommand1444);
                            this_VariableDeclaration_0=ruleVariableDeclaration();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                      current = this_VariableDeclaration_0; 
                                      currentNode = currentNode.getParent();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:847:6: ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:847:6: ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:847:7: () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:847:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:848:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getVariableAssignAction_0_0_1_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getVariableAssignAction_0_0_1_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:861:2: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:862:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:862:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:863:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1484); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getNameVariableDeclarationCrossReference_0_0_1_1_0(), "name"); 
                              	
                            }

                            }


                            }

                            match(input,26,FOLLOW_26_in_ruleCommand1494); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getEqualsSignKeyword_0_0_1_2(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:882:1: ( (lv_value_4_0= ruleExpression ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:883:1: (lv_value_4_0= ruleExpression )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:883:1: (lv_value_4_0= ruleExpression )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:884:3: lv_value_4_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getValueExpressionParserRuleCall_0_0_1_3_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCommand1515);
                            lv_value_4_0=ruleExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"value",
                              	        		lv_value_4_0, 
                              	        		"Expression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 3 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:907:6: ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:907:6: ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:907:7: () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']'
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:907:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:908:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getBindHandlerAction_0_0_2_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getBindHandlerAction_0_0_2_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:921:2: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:922:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:922:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:923:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1557); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_0_0_2_1_0(), "eventName"); 
                              	
                            }

                            }


                            }

                            match(input,27,FOLLOW_27_in_ruleCommand1567); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getPlusSignEqualsSignKeyword_0_0_2_2(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:942:1: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:943:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:943:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:944:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1589); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getHandlerNameHandlerDeclCrossReference_0_0_2_3_0(), "handlerName"); 
                              	
                            }

                            }


                            }

                            match(input,22,FOLLOW_22_in_ruleCommand1599); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getLeftSquareBracketKeyword_0_0_2_4(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:963:1: ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_BOOL)||LA13_0==19||LA13_0==46) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:963:2: ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) )
                                    {
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:963:2: ( (lv_bindParams_10_0= ruleExpression ) )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:964:1: (lv_bindParams_10_0= ruleExpression )
                                    {
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:964:1: (lv_bindParams_10_0= ruleExpression )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:965:3: lv_bindParams_10_0= ruleExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBindParamsExpressionParserRuleCall_0_0_2_5_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1621);
                                    lv_bindParams_10_0=ruleExpression();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		add(
                                      	       			current, 
                                      	       			"bindParams",
                                      	        		lv_bindParams_10_0, 
                                      	        		"Expression", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:987:2: ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:987:4: ',' ( (lv_bindParams_12_0= ruleExpression ) )
                                    {
                                    match(input,20,FOLLOW_20_in_ruleCommand1632); if (failed) return current;
                                    if ( backtracking==0 ) {

                                              createLeafNode(grammarAccess.getCommandAccess().getCommaKeyword_0_0_2_5_1_0(), null); 
                                          
                                    }
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:991:1: ( (lv_bindParams_12_0= ruleExpression ) )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:992:1: (lv_bindParams_12_0= ruleExpression )
                                    {
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:992:1: (lv_bindParams_12_0= ruleExpression )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:993:3: lv_bindParams_12_0= ruleExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBindParamsExpressionParserRuleCall_0_0_2_5_1_1_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1653);
                                    lv_bindParams_12_0=ruleExpression();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		add(
                                      	       			current, 
                                      	       			"bindParams",
                                      	        		lv_bindParams_12_0, 
                                      	        		"Expression", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }


                                    }


                                    }
                                    break;

                            }

                            match(input,23,FOLLOW_23_in_ruleCommand1666); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getRightSquareBracketKeyword_0_0_2_6(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1020:6: ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1020:6: ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1020:7: () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1020:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1021:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getUnbindHandlerAction_0_0_3_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getUnbindHandlerAction_0_0_3_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1034:2: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1035:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1035:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1036:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1708); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_0_0_3_1_0(), "eventName"); 
                              	
                            }

                            }


                            }

                            match(input,28,FOLLOW_28_in_ruleCommand1718); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getHyphenMinusEqualsSignKeyword_0_0_3_2(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1055:1: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1056:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1056:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1057:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1740); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getHandlerNameHandlerDeclCrossReference_0_0_3_3_0(), "handlerName"); 
                              	
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 5 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:6: ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:6: ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:7: () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')'
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1074:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getRaiseEventAction_0_0_4_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getRaiseEventAction_0_0_4_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,29,FOLLOW_29_in_ruleCommand1770); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getRaiseKeyword_0_0_4_1(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1091:1: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1092:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1092:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1093:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1792); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getEventEventDeclCrossReference_0_0_4_2_0(), "event"); 
                              	
                            }

                            }


                            }

                            match(input,19,FOLLOW_19_in_ruleCommand1802); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_0_0_4_3(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1112:1: ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_BOOL)||LA15_0==19||LA15_0==46) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1112:2: ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )*
                                    {
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1112:2: ( (lv_params_22_0= ruleExpression ) )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1113:1: (lv_params_22_0= ruleExpression )
                                    {
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1113:1: (lv_params_22_0= ruleExpression )
                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1114:3: lv_params_22_0= ruleExpression
                                    {
                                    if ( backtracking==0 ) {
                                       
                                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getParamsExpressionParserRuleCall_0_0_4_4_0_0(), currentNode); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1824);
                                    lv_params_22_0=ruleExpression();
                                    _fsp--;
                                    if (failed) return current;
                                    if ( backtracking==0 ) {

                                      	        if (current==null) {
                                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                      	        }
                                      	        try {
                                      	       		add(
                                      	       			current, 
                                      	       			"params",
                                      	        		lv_params_22_0, 
                                      	        		"Expression", 
                                      	        		currentNode);
                                      	        } catch (ValueConverterException vce) {
                                      				handleValueConverterException(vce);
                                      	        }
                                      	        currentNode = currentNode.getParent();
                                      	    
                                    }

                                    }


                                    }

                                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1136:2: ( ',' ( (lv_params_24_0= ruleExpression ) ) )*
                                    loop14:
                                    do {
                                        int alt14=2;
                                        int LA14_0 = input.LA(1);

                                        if ( (LA14_0==20) ) {
                                            alt14=1;
                                        }


                                        switch (alt14) {
                                    	case 1 :
                                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1136:4: ',' ( (lv_params_24_0= ruleExpression ) )
                                    	    {
                                    	    match(input,20,FOLLOW_20_in_ruleCommand1835); if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	              createLeafNode(grammarAccess.getCommandAccess().getCommaKeyword_0_0_4_4_1_0(), null); 
                                    	          
                                    	    }
                                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1140:1: ( (lv_params_24_0= ruleExpression ) )
                                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1141:1: (lv_params_24_0= ruleExpression )
                                    	    {
                                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1141:1: (lv_params_24_0= ruleExpression )
                                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1142:3: lv_params_24_0= ruleExpression
                                    	    {
                                    	    if ( backtracking==0 ) {
                                    	       
                                    	      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getParamsExpressionParserRuleCall_0_0_4_4_1_1_0(), currentNode); 
                                    	      	    
                                    	    }
                                    	    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1856);
                                    	    lv_params_24_0=ruleExpression();
                                    	    _fsp--;
                                    	    if (failed) return current;
                                    	    if ( backtracking==0 ) {

                                    	      	        if (current==null) {
                                    	      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                                    	      	        }
                                    	      	        try {
                                    	      	       		add(
                                    	      	       			current, 
                                    	      	       			"params",
                                    	      	        		lv_params_24_0, 
                                    	      	        		"Expression", 
                                    	      	        		currentNode);
                                    	      	        } catch (ValueConverterException vce) {
                                    	      				handleValueConverterException(vce);
                                    	      	        }
                                    	      	        currentNode = currentNode.getParent();
                                    	      	    
                                    	    }

                                    	    }


                                    	    }


                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop14;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,21,FOLLOW_21_in_ruleCommand1870); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getRightParenthesisKeyword_0_0_4_5(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 6 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:6: ( () 'out' ( (lv_output_28_0= ruleExpression ) ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:6: ( () 'out' ( (lv_output_28_0= ruleExpression ) ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:7: () 'out' ( (lv_output_28_0= ruleExpression ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1170:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getPrintOutputAction_0_0_5_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getPrintOutputAction_0_0_5_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,30,FOLLOW_30_in_ruleCommand1900); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getOutKeyword_0_0_5_1(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:1: ( (lv_output_28_0= ruleExpression ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: (lv_output_28_0= ruleExpression )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: (lv_output_28_0= ruleExpression )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1189:3: lv_output_28_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getOutputExpressionParserRuleCall_0_0_5_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCommand1921);
                            lv_output_28_0=ruleExpression();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"output",
                              	        		lv_output_28_0, 
                              	        		"Expression", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 7 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:6: ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:6: ( () 'out' ( (lv_output_31_0= RULE_STRING ) ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:7: () 'out' ( (lv_output_31_0= RULE_STRING ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1213:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getPrintStringAction_0_0_6_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getPrintStringAction_0_0_6_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,30,FOLLOW_30_in_ruleCommand1951); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getOutKeyword_0_0_6_1(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1230:1: ( (lv_output_31_0= RULE_STRING ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1231:1: (lv_output_31_0= RULE_STRING )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1231:1: (lv_output_31_0= RULE_STRING )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1232:3: lv_output_31_0= RULE_STRING
                            {
                            lv_output_31_0=(Token)input.LT(1);
                            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCommand1968); if (failed) return current;
                            if ( backtracking==0 ) {

                              			createLeafNode(grammarAccess.getCommandAccess().getOutputSTRINGTerminalRuleCall_0_0_6_2_0(), "output"); 
                              		
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"output",
                              	        		lv_output_31_0, 
                              	        		"STRING", 
                              	        		lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 8 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1255:6: ( () 'in' ( ( RULE_ID ) ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1255:6: ( () 'in' ( ( RULE_ID ) ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1255:7: () 'in' ( ( RULE_ID ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1255:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1256:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getCommandAccess().getReadInputAction_0_0_7_0().getType().getClassifier());
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getReadInputAction_0_0_7_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,31,FOLLOW_31_in_ruleCommand2003); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getInKeyword_0_0_7_1(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1273:1: ( ( RULE_ID ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1274:1: ( RULE_ID )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1274:1: ( RULE_ID )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1275:3: RULE_ID
                            {
                            if ( backtracking==0 ) {
                               
                              		  /* */ 
                              		
                            }
                            if ( backtracking==0 ) {

                              			if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                                      
                            }
                            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand2025); if (failed) return current;
                            if ( backtracking==0 ) {

                              		createLeafNode(grammarAccess.getCommandAccess().getInputVariableDeclarationCrossReference_0_0_7_2_0(), "input"); 
                              	
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    match(input,16,FOLLOW_16_in_ruleCommand2037); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1295:6: ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1295:6: ( () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )? )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1295:7: () 'if' '(' ( (lv_condition_39_0= ruleExpression ) ) ')' ( (lv_thenBlock_41_0= ruleAbstractBlock ) ) ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )?
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1295:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1296:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getIfThenElseAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getIfThenElseAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,32,FOLLOW_32_in_ruleCommand2067); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getIfKeyword_1_1(), null); 
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleCommand2077); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_1_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1317:1: ( (lv_condition_39_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1318:1: (lv_condition_39_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1318:1: (lv_condition_39_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1319:3: lv_condition_39_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getConditionExpressionParserRuleCall_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand2098);
                    lv_condition_39_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"condition",
                      	        		lv_condition_39_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleCommand2108); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getRightParenthesisKeyword_1_4(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1345:1: ( (lv_thenBlock_41_0= ruleAbstractBlock ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1346:1: (lv_thenBlock_41_0= ruleAbstractBlock )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1346:1: (lv_thenBlock_41_0= ruleAbstractBlock )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1347:3: lv_thenBlock_41_0= ruleAbstractBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getThenBlockAbstractBlockParserRuleCall_1_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleCommand2129);
                    lv_thenBlock_41_0=ruleAbstractBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"thenBlock",
                      	        		lv_thenBlock_41_0, 
                      	        		"AbstractBlock", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:2: ( ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        int LA17_1 = input.LA(2);

                        if ( (synpred26()) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:3: ( (lv_balanced_42_0= 'else' ) ) ( (lv_elseBlock_43_0= ruleAbstractBlock ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:3: ( (lv_balanced_42_0= 'else' ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1370:1: (lv_balanced_42_0= 'else' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1370:1: (lv_balanced_42_0= 'else' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1371:3: lv_balanced_42_0= 'else'
                            {
                            lv_balanced_42_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleCommand2148); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getBalancedElseKeyword_1_6_0_0(), "balanced"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode, current);
                              	        }
                              	        
                              	        try {
                              	       		set(current, "balanced", true, "else", lastConsumedNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	    
                            }

                            }


                            }

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1390:2: ( (lv_elseBlock_43_0= ruleAbstractBlock ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1391:1: (lv_elseBlock_43_0= ruleAbstractBlock )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1391:1: (lv_elseBlock_43_0= ruleAbstractBlock )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1392:3: lv_elseBlock_43_0= ruleAbstractBlock
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getElseBlockAbstractBlockParserRuleCall_1_6_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleCommand2182);
                            lv_elseBlock_43_0=ruleAbstractBlock();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"elseBlock",
                              	        		lv_elseBlock_43_0, 
                              	        		"AbstractBlock", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1415:6: ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1415:6: ( () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1415:7: () 'while' '(' ( (lv_condition_47_0= ruleExpression ) ) ')' ( (lv_block_49_0= ruleAbstractBlock ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1415:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1416:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getWhileAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getWhileAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,34,FOLLOW_34_in_ruleCommand2214); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getWhileKeyword_2_1(), null); 
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleCommand2224); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_2_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1437:1: ( (lv_condition_47_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1438:1: (lv_condition_47_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1438:1: (lv_condition_47_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1439:3: lv_condition_47_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getConditionExpressionParserRuleCall_2_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand2245);
                    lv_condition_47_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"condition",
                      	        		lv_condition_47_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleCommand2255); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getRightParenthesisKeyword_2_4(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1465:1: ( (lv_block_49_0= ruleAbstractBlock ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1466:1: (lv_block_49_0= ruleAbstractBlock )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1466:1: (lv_block_49_0= ruleAbstractBlock )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1467:3: lv_block_49_0= ruleAbstractBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBlockAbstractBlockParserRuleCall_2_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleCommand2276);
                    lv_block_49_0=ruleAbstractBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_49_0, 
                      	        		"AbstractBlock", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleCommand


    // $ANTLR start entryRuleVariableDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1497:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1498:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1499:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2313);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2323); if (failed) return current;

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
    // $ANTLR end entryRuleVariableDeclaration


    // $ANTLR start ruleVariableDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1506:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1511:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1512:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1512:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1512:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1512:2: ( (lv_type_0_0= ruleType ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1513:1: (lv_type_0_0= ruleType )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1513:1: (lv_type_0_0= ruleType )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1514:3: lv_type_0_0= ruleType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration2369);
            lv_type_0_0=ruleType();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"type",
              	        		lv_type_0_0, 
              	        		"Type", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1536:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1537:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1537:1: (lv_name_1_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1538:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2386); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getVariableDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleVariableDeclaration


    // $ANTLR start entryRuleExpression
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1568:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1569:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1570:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2427);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2437); if (failed) return current;

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
    // $ANTLR end entryRuleExpression


    // $ANTLR start ruleExpression
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1577:1: ruleExpression returns [EObject current=null] : this_Logical_0= ruleLogical ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Logical_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1582:6: (this_Logical_0= ruleLogical )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1584:2: this_Logical_0= ruleLogical
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getLogicalParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleLogical_in_ruleExpression2486);
            this_Logical_0=ruleLogical();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Logical_0; 
                      currentNode = currentNode.getParent();
                  
            }

            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleLogical
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1603:1: entryRuleLogical returns [EObject current=null] : iv_ruleLogical= ruleLogical EOF ;
    public final EObject entryRuleLogical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1604:2: (iv_ruleLogical= ruleLogical EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1605:2: iv_ruleLogical= ruleLogical EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getLogicalRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical2520);
            iv_ruleLogical=ruleLogical();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleLogical; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical2530); if (failed) return current;

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
    // $ANTLR end entryRuleLogical


    // $ANTLR start ruleLogical
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1612:1: ruleLogical returns [EObject current=null] : (this_Relation_0= ruleRelation ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) ) )* ) ;
    public final EObject ruleLogical() throws RecognitionException {
        EObject current = null;

        EObject this_Relation_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1617:6: ( (this_Relation_0= ruleRelation ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1618:1: (this_Relation_0= ruleRelation ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1618:1: (this_Relation_0= ruleRelation ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1619:2: this_Relation_0= ruleRelation ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getLogicalAccess().getRelationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleRelation_in_ruleLogical2580);
            this_Relation_0=ruleRelation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Relation_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:1: ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    int LA20_2 = input.LA(2);

                    if ( (synpred29()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==36) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred29()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:2: ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleRelation ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:2: ( ( () 'AND' ) | ( () 'OR' ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==35) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==36) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1630:2: ( ( () 'AND' ) | ( () 'OR' ) )", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:3: ( () 'AND' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:3: ( () 'AND' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:4: () 'AND'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1631:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getLogicalAccess().getAndLeftAction_1_0_0_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,35,FOLLOW_35_in_ruleLogical2604); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getLogicalAccess().getANDKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:6: ( () 'OR' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:6: ( () 'OR' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:7: () 'OR'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1655:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getLogicalAccess().getOrLeftAction_1_0_1_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,36,FOLLOW_36_in_ruleLogical2634); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getLogicalAccess().getORKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1677:3: ( (lv_right_5_0= ruleRelation ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1678:1: (lv_right_5_0= ruleRelation )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1678:1: (lv_right_5_0= ruleRelation )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1679:3: lv_right_5_0= ruleRelation
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRelation_in_ruleLogical2657);
            	    lv_right_5_0=ruleRelation();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getLogicalRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_5_0, 
            	      	        		"Relation", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleLogical


    // $ANTLR start entryRuleRelation
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1709:1: entryRuleRelation returns [EObject current=null] : iv_ruleRelation= ruleRelation EOF ;
    public final EObject entryRuleRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelation = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1710:2: (iv_ruleRelation= ruleRelation EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1711:2: iv_ruleRelation= ruleRelation EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleRelation_in_entryRuleRelation2695);
            iv_ruleRelation=ruleRelation();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleRelation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelation2705); if (failed) return current;

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
    // $ANTLR end entryRuleRelation


    // $ANTLR start ruleRelation
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1718:1: ruleRelation returns [EObject current=null] : (this_Addition_0= ruleAddition ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) ) )? ) ;
    public final EObject ruleRelation() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;

        EObject lv_right_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1723:6: ( (this_Addition_0= ruleAddition ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) ) )? ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1724:1: (this_Addition_0= ruleAddition ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) ) )? )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1724:1: (this_Addition_0= ruleAddition ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) ) )? )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1725:2: this_Addition_0= ruleAddition ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) ) )?
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getRelationAccess().getAdditionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleRelation2755);
            this_Addition_0=ruleAddition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Addition_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:1: ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) ) )?
            int alt22=2;
            switch ( input.LA(1) ) {
                case 37:
                    {
                    int LA22_1 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 38:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 39:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 40:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt22=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred34()) ) {
                        alt22=1;
                    }
                    }
                    break;
            }

            switch (alt22) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:2: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_11_0= ruleAddition ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:2: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) )
                    int alt21=5;
                    switch ( input.LA(1) ) {
                    case 37:
                        {
                        alt21=1;
                        }
                        break;
                    case 38:
                        {
                        alt21=2;
                        }
                        break;
                    case 39:
                        {
                        alt21=3;
                        }
                        break;
                    case 40:
                        {
                        alt21=4;
                        }
                        break;
                    case 41:
                        {
                        alt21=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1736:2: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) )", 21, 0, input);

                        throw nvae;
                    }

                    switch (alt21) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:3: ( () '<=' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:3: ( () '<=' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:4: () '<='
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:4: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1737:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getRelationAccess().getLeqLeftAction_1_0_0_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,37,FOLLOW_37_in_ruleRelation2779); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRelationAccess().getLessThanSignEqualsSignKeyword_1_0_0_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:6: ( () '<' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:6: ( () '<' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:7: () '<'
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1761:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getRelationAccess().getLessLeftAction_1_0_1_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,38,FOLLOW_38_in_ruleRelation2809); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRelationAccess().getLessThanSignKeyword_1_0_1_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:6: ( () '==' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:6: ( () '==' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:7: () '=='
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1785:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getRelationAccess().getEqLeftAction_1_0_2_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,39,FOLLOW_39_in_ruleRelation2839); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRelationAccess().getEqualsSignEqualsSignKeyword_1_0_2_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:6: ( () '>=' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:6: ( () '>=' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:7: () '>='
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1809:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getRelationAccess().getGeqLeftAction_1_0_3_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getRelationAccess().getGeqLeftAction_1_0_3_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,40,FOLLOW_40_in_ruleRelation2869); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRelationAccess().getGreaterThanSignEqualsSignKeyword_1_0_3_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:6: ( () '>' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:6: ( () '>' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:7: () '>'
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1833:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getRelationAccess().getGtrLeftAction_1_0_4_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getRelationAccess().getGtrLeftAction_1_0_4_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,41,FOLLOW_41_in_ruleRelation2899); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getRelationAccess().getGreaterThanSignKeyword_1_0_4_1(), null); 
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1855:3: ( (lv_right_11_0= ruleAddition ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1856:1: (lv_right_11_0= ruleAddition )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1856:1: (lv_right_11_0= ruleAddition )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1857:3: lv_right_11_0= ruleAddition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAddition_in_ruleRelation2922);
                    lv_right_11_0=ruleAddition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getRelationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_11_0, 
                      	        		"Addition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleRelation


    // $ANTLR start entryRuleAddition
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1887:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1888:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1889:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2960);
            iv_ruleAddition=ruleAddition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2970); if (failed) return current;

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
    // $ANTLR end entryRuleAddition


    // $ANTLR start ruleAddition
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1896:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1901:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1902:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1902:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1903:2: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3020);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==42) ) {
                    int LA24_2 = input.LA(2);

                    if ( (synpred36()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==43) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred36()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==42) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==43) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1914:2: ( ( () '+' ) | ( () '-' ) )", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:3: ( () '+' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:3: ( () '+' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:4: () '+'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1915:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,42,FOLLOW_42_in_ruleAddition3044); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:6: ( () '-' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:6: ( () '-' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:7: () '-'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1939:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,43,FOLLOW_43_in_ruleAddition3074); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1961:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1962:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1962:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1963:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition3097);
            	    lv_right_5_0=ruleMultiplication();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAdditionRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_5_0, 
            	      	        		"Multiplication", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleAddition


    // $ANTLR start entryRuleMultiplication
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1993:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1994:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1995:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication3135);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication3145); if (failed) return current;

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
    // $ANTLR end entryRuleMultiplication


    // $ANTLR start ruleMultiplication
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2002:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2007:6: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2008:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2008:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2009:2: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3195);
            this_PrimaryExpression_0=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred38()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==45) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred38()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==44) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==45) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("2020:2: ( ( () '*' ) | ( () '/' ) )", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:3: ( () '*' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:3: ( () '*' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:4: () '*'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2021:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,44,FOLLOW_44_in_ruleMultiplication3219); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:6: ( () '/' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:6: ( () '/' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:7: () '/'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2045:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,45,FOLLOW_45_in_ruleMultiplication3249); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2067:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2068:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2068:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2069:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication3272);
            	    lv_right_5_0=rulePrimaryExpression();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMultiplicationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_5_0, 
            	      	        		"PrimaryExpression", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleMultiplication


    // $ANTLR start entryRulePrimaryExpression
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2099:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2100:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2101:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3310);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3320); if (failed) return current;

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
    // $ANTLR end entryRulePrimaryExpression


    // $ANTLR start rulePrimaryExpression
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2108:1: rulePrimaryExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        EObject lv_cond_5_0 = null;

        AntlrDatatypeRuleToken lv_value_7_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2113:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2114:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2114:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt27=1;
                }
                break;
            case 46:
                {
                alt27=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOL:
                {
                alt27=3;
                }
                break;
            case RULE_ID:
                {
                alt27=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2114:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) ) | ( () ( (lv_value_7_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) )", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2114:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2114:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2114:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,19,FOLLOW_19_in_rulePrimaryExpression3356); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression3381);
                    this_Expression_1=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,21,FOLLOW_21_in_rulePrimaryExpression3390); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2135:6: ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2135:6: ( () 'NOT' ( (lv_cond_5_0= ruleExpression ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2135:7: () 'NOT' ( (lv_cond_5_0= ruleExpression ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2135:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2136:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNotAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,46,FOLLOW_46_in_rulePrimaryExpression3420); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getNOTKeyword_1_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2153:1: ( (lv_cond_5_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2154:1: (lv_cond_5_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2154:1: (lv_cond_5_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2155:3: lv_cond_5_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getCondExpressionParserRuleCall_1_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression3441);
                    lv_cond_5_0=ruleExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"cond",
                      	        		lv_cond_5_0, 
                      	        		"Expression", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2178:6: ( () ( (lv_value_7_0= ruleValue ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2178:6: ( () ( (lv_value_7_0= ruleValue ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2178:7: () ( (lv_value_7_0= ruleValue ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2178:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2179:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2192:2: ( (lv_value_7_0= ruleValue ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2193:1: (lv_value_7_0= ruleValue )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2193:1: (lv_value_7_0= ruleValue )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2194:3: lv_value_7_0= ruleValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueValueParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValue_in_rulePrimaryExpression3482);
                    lv_value_7_0=ruleValue();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_7_0, 
                      	        		"Value", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2217:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2217:6: ( () ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2217:7: () ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2217:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2218:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2231:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2232:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2232:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2233:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getPrimaryExpressionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3524); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPrimaryExpressionAccess().getVarVariableDeclarationCrossReference_3_1_0(), "var"); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulePrimaryExpression


    // $ANTLR start entryRuleValue
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2256:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2257:2: (iv_ruleValue= ruleValue EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2258:2: iv_ruleValue= ruleValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3562);
            iv_ruleValue=ruleValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3573); if (failed) return current;

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
    // $ANTLR end entryRuleValue


    // $ANTLR start ruleValue
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2265:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL | this_STRING_3= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_REAL_1=null;
        Token this_BOOL_2=null;
        Token this_STRING_3=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2270:6: ( (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL | this_STRING_3= RULE_STRING ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2271:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL | this_STRING_3= RULE_STRING )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2271:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL | this_STRING_3= RULE_STRING )
            int alt28=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt28=1;
                }
                break;
            case RULE_REAL:
                {
                alt28=2;
                }
                break;
            case RULE_BOOL:
                {
                alt28=3;
                }
                break;
            case RULE_STRING:
                {
                alt28=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2271:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL | this_STRING_3= RULE_STRING )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2271:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue3613); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2279:10: this_REAL_1= RULE_REAL
                    {
                    this_REAL_1=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleValue3639); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_REAL_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getREALTerminalRuleCall_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2287:10: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)input.LT(1);
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleValue3665); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_BOOL_2);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2295:10: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValue3691); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_STRING_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_3(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleValue


    // $ANTLR start ruleType
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2310:1: ruleType returns [Enumerator current=null] : ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2314:6: ( ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2315:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2315:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt29=1;
                }
                break;
            case 48:
                {
                alt29=2;
                }
                break;
            case 49:
                {
                alt29=3;
                }
                break;
            case 50:
                {
                alt29=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2315:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) )", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2315:2: ( 'int' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2315:2: ( 'int' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2315:4: 'int'
                    {
                    match(input,47,FOLLOW_47_in_ruleType3748); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2321:6: ( 'real' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2321:6: ( 'real' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2321:8: 'real'
                    {
                    match(input,48,FOLLOW_48_in_ruleType3763); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2327:6: ( 'bool' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2327:6: ( 'bool' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2327:8: 'bool'
                    {
                    match(input,49,FOLLOW_49_in_ruleType3778); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_BOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_BOOLEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2333:6: ( 'string' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2333:6: ( 'string' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2333:8: 'string'
                    {
                    match(input,50,FOLLOW_50_in_ruleType3793); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_STRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_STRINGEnumLiteralDeclaration_3(), null); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleType

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:120:4: ( ({...}? => ( ( ( ruleGlobalSection ) ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:120:4: ({...}? => ( ( ( ruleGlobalSection ) ) ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:120:4: ({...}? => ( ( ( ruleGlobalSection ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:121:5: {...}? => ( ( ( ruleGlobalSection ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred1", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0)");
        }
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:121:104: ( ( ( ruleGlobalSection ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:122:6: ( ( ruleGlobalSection ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0);
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:125:6: ( ( ruleGlobalSection ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:126:1: ( ruleGlobalSection )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:126:1: ( ruleGlobalSection )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:127:3: ruleGlobalSection
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getGlobalsGlobalSectionParserRuleCall_0_0_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleGlobalSection_in_synpred1189);
        ruleGlobalSection();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred1

    // $ANTLR start synpred2
    public final void synpred2_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:156:4: ( ({...}? => ( ( ( ruleEventSection ) ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:156:4: ({...}? => ( ( ( ruleEventSection ) ) ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:156:4: ({...}? => ( ( ( ruleEventSection ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:157:5: {...}? => ( ( ( ruleEventSection ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1)");
        }
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:157:104: ( ( ( ruleEventSection ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:158:6: ( ( ruleEventSection ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1);
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:161:6: ( ( ruleEventSection ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:162:1: ( ruleEventSection )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:162:1: ( ruleEventSection )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:163:3: ruleEventSection
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getEventsEventSectionParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleEventSection_in_synpred2260);
        ruleEventSection();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:192:4: ( ({...}? => ( ( ( ruleHandlerSection ) ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:192:4: ({...}? => ( ( ( ruleHandlerSection ) ) ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:192:4: ({...}? => ( ( ( ruleHandlerSection ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:193:5: {...}? => ( ( ( ruleHandlerSection ) ) )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2) ) {
            if (backtracking>0) {failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2)");
        }
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:193:104: ( ( ( ruleHandlerSection ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:194:6: ( ( ruleHandlerSection ) )
        {
        getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2);
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:197:6: ( ( ruleHandlerSection ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:198:1: ( ruleHandlerSection )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:198:1: ( ruleHandlerSection )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:199:3: ruleHandlerSection
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getHandlersHandlerSectionParserRuleCall_0_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleHandlerSection_in_synpred3331);
        ruleHandlerSection();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:6: ( ( () 'out' ( ( ruleExpression ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:6: ( () 'out' ( ( ruleExpression ) ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:6: ( () 'out' ( ( ruleExpression ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:7: () 'out' ( ( ruleExpression ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1169:7: ()
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1170:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        match(input,30,FOLLOW_30_in_synpred231900); if (failed) return ;
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:1: ( ( ruleExpression ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: ( ruleExpression )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: ( ruleExpression )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1189:3: ruleExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getOutputExpressionParserRuleCall_0_0_5_2_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleExpression_in_synpred231921);
        ruleExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:6: ( ( () 'out' ( ( RULE_STRING ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:6: ( () 'out' ( ( RULE_STRING ) ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:6: ( () 'out' ( ( RULE_STRING ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:7: () 'out' ( ( RULE_STRING ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1212:7: ()
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1213:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        match(input,30,FOLLOW_30_in_synpred241951); if (failed) return ;
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1230:1: ( ( RULE_STRING ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1231:1: ( RULE_STRING )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1231:1: ( RULE_STRING )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1232:3: RULE_STRING
        {
        match(input,RULE_STRING,FOLLOW_RULE_STRING_in_synpred241968); if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:3: ( ( ( 'else' ) ) ( ( ruleAbstractBlock ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:3: ( ( 'else' ) ) ( ( ruleAbstractBlock ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:3: ( ( 'else' ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1370:1: ( 'else' )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1370:1: ( 'else' )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1371:3: 'else'
        {
        match(input,33,FOLLOW_33_in_synpred262148); if (failed) return ;

        }


        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1390:2: ( ( ruleAbstractBlock ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1391:1: ( ruleAbstractBlock )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1391:1: ( ruleAbstractBlock )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1392:3: ruleAbstractBlock
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getElseBlockAbstractBlockParserRuleCall_1_6_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAbstractBlock_in_synpred262182);
        ruleAbstractBlock();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred29
    public final void synpred29_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:2: ( ( ( () 'AND' ) | ( () 'OR' ) ) ( ( ruleRelation ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:2: ( ( () 'AND' ) | ( () 'OR' ) ) ( ( ruleRelation ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:2: ( ( () 'AND' ) | ( () 'OR' ) )
        int alt42=2;
        int LA42_0 = input.LA(1);

        if ( (LA42_0==35) ) {
            alt42=1;
        }
        else if ( (LA42_0==36) ) {
            alt42=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1630:2: ( ( () 'AND' ) | ( () 'OR' ) )", 42, 0, input);

            throw nvae;
        }
        switch (alt42) {
            case 1 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:3: ( () 'AND' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:3: ( () 'AND' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:4: () 'AND'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1630:4: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1631:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,35,FOLLOW_35_in_synpred292604); if (failed) return ;

                }


                }
                break;
            case 2 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:6: ( () 'OR' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:6: ( () 'OR' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:7: () 'OR'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1654:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1655:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,36,FOLLOW_36_in_synpred292634); if (failed) return ;

                }


                }
                break;

        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1677:3: ( ( ruleRelation ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1678:1: ( ruleRelation )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1678:1: ( ruleRelation )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1679:3: ruleRelation
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getLogicalAccess().getRightRelationParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleRelation_in_synpred292657);
        ruleRelation();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred29

    // $ANTLR start synpred34
    public final void synpred34_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:2: ( ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( ( ruleAddition ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:2: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( ( ruleAddition ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:2: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) )
        int alt43=5;
        switch ( input.LA(1) ) {
        case 37:
            {
            alt43=1;
            }
            break;
        case 38:
            {
            alt43=2;
            }
            break;
        case 39:
            {
            alt43=3;
            }
            break;
        case 40:
            {
            alt43=4;
            }
            break;
        case 41:
            {
            alt43=5;
            }
            break;
        default:
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1736:2: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) )", 43, 0, input);

            throw nvae;
        }

        switch (alt43) {
            case 1 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:3: ( () '<=' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:3: ( () '<=' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:4: () '<='
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1736:4: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1737:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,37,FOLLOW_37_in_synpred342779); if (failed) return ;

                }


                }
                break;
            case 2 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:6: ( () '<' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:6: ( () '<' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:7: () '<'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1760:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1761:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,38,FOLLOW_38_in_synpred342809); if (failed) return ;

                }


                }
                break;
            case 3 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:6: ( () '==' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:6: ( () '==' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:7: () '=='
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1784:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1785:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,39,FOLLOW_39_in_synpred342839); if (failed) return ;

                }


                }
                break;
            case 4 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:6: ( () '>=' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:6: ( () '>=' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:7: () '>='
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1808:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1809:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,40,FOLLOW_40_in_synpred342869); if (failed) return ;

                }


                }
                break;
            case 5 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:6: ( () '>' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:6: ( () '>' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:7: () '>'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1832:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1833:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,41,FOLLOW_41_in_synpred342899); if (failed) return ;

                }


                }
                break;

        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1855:3: ( ( ruleAddition ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1856:1: ( ruleAddition )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1856:1: ( ruleAddition )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1857:3: ruleAddition
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getRelationAccess().getRightAdditionParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAddition_in_synpred342922);
        ruleAddition();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred34

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:2: ( ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultiplication ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:2: ( ( () '+' ) | ( () '-' ) ) ( ( ruleMultiplication ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:2: ( ( () '+' ) | ( () '-' ) )
        int alt44=2;
        int LA44_0 = input.LA(1);

        if ( (LA44_0==42) ) {
            alt44=1;
        }
        else if ( (LA44_0==43) ) {
            alt44=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("1914:2: ( ( () '+' ) | ( () '-' ) )", 44, 0, input);

            throw nvae;
        }
        switch (alt44) {
            case 1 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:3: ( () '+' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:3: ( () '+' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:4: () '+'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1914:4: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1915:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,42,FOLLOW_42_in_synpred363044); if (failed) return ;

                }


                }
                break;
            case 2 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:6: ( () '-' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:6: ( () '-' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:7: () '-'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1938:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1939:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,43,FOLLOW_43_in_synpred363074); if (failed) return ;

                }


                }
                break;

        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1961:3: ( ( ruleMultiplication ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1962:1: ( ruleMultiplication )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1962:1: ( ruleMultiplication )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1963:3: ruleMultiplication
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleMultiplication_in_synpred363097);
        ruleMultiplication();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:2: ( ( ( () '*' ) | ( () '/' ) ) ( ( rulePrimaryExpression ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:2: ( ( () '*' ) | ( () '/' ) ) ( ( rulePrimaryExpression ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:2: ( ( () '*' ) | ( () '/' ) )
        int alt45=2;
        int LA45_0 = input.LA(1);

        if ( (LA45_0==44) ) {
            alt45=1;
        }
        else if ( (LA45_0==45) ) {
            alt45=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("2020:2: ( ( () '*' ) | ( () '/' ) )", 45, 0, input);

            throw nvae;
        }
        switch (alt45) {
            case 1 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:3: ( () '*' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:3: ( () '*' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:4: () '*'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:4: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2021:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,44,FOLLOW_44_in_synpred383219); if (failed) return ;

                }


                }
                break;
            case 2 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:6: ( () '/' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:6: ( () '/' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:7: () '/'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2044:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2045:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,45,FOLLOW_45_in_synpred383249); if (failed) return ;

                }


                }
                break;

        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2067:3: ( ( rulePrimaryExpression ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2068:1: ( rulePrimaryExpression )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2068:1: ( rulePrimaryExpression )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2069:3: rulePrimaryExpression
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulePrimaryExpression_in_synpred383272);
        rulePrimaryExpression();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred38

    public final boolean synpred34() {
        backtracking++;
        int start = input.mark();
        try {
            synpred34_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred36() {
        backtracking++;
        int start = input.mark();
        try {
            synpred36_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred29() {
        backtracking++;
        int start = input.mark();
        try {
            synpred29_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred2() {
        backtracking++;
        int start = input.mark();
        try {
            synpred2_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred3() {
        backtracking++;
        int start = input.mark();
        try {
            synpred3_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram87 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_ruleProgram189 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_ruleEventSection_in_ruleProgram260 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_ruleProgram331 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_13_in_ruleProgram380 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleProgram401 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_entryRuleGlobalSection451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalSection461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGlobalSection496 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalSection518 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGlobalSection528 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleEventSection_in_entryRuleEventSection566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSection576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEventSection611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventDecl_in_ruleEventSection633 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEventSection643 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_entryRuleHandlerSection681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerSection691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHandlerSection726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_ruleHandlerSection747 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEventDecl_in_entryRuleEventDecl784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDecl794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDecl836 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEventDecl851 = new BitSet(new long[]{0x0007800000200000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleEventDecl873 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleEventDecl884 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleEventDecl905 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleEventDecl919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDecl965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHandlerDecl1007 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleHandlerDecl1022 = new BitSet(new long[]{0x0007800000800000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1044 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleHandlerDecl1055 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1076 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleHandlerDecl1090 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHandlerDecl1100 = new BitSet(new long[]{0x0007800000200000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1122 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleHandlerDecl1133 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1154 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleHandlerDecl1168 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleHandlerDecl1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_entryRuleAbstractBlock1225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBlock1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleAbstractBlock1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAbstractBlock1313 = new BitSet(new long[]{0x00078005E3000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1334 = new BitSet(new long[]{0x00078005E3000010L});
    public static final BitSet FOLLOW_25_in_ruleAbstractBlock1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleCommand1444 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1484 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommand1494 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1557 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCommand1567 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1589 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommand1599 = new BitSet(new long[]{0x00004000008801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1621 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommand1632 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1653 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCommand1666 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1708 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand1718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1740 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_29_in_ruleCommand1770 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1792 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommand1802 = new BitSet(new long[]{0x00004000002801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1824 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCommand1835 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1856 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCommand1870 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30_in_ruleCommand1900 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1921 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_30_in_ruleCommand1951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCommand1968 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_31_in_ruleCommand2003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand2025 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleCommand2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCommand2067 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommand2077 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand2098 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommand2108 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleCommand2129 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleCommand2148 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleCommand2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCommand2214 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommand2224 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand2245 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCommand2255 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleCommand2276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration2369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleExpression2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical2520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogical2580 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleLogical2604 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_36_in_ruleLogical2634 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleRelation_in_ruleLogical2657 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleRelation_in_entryRuleRelation2695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelation2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation2755 = new BitSet(new long[]{0x000003E000000002L});
    public static final BitSet FOLLOW_37_in_ruleRelation2779 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_38_in_ruleRelation2809 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_39_in_ruleRelation2839 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_40_in_ruleRelation2869 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_41_in_ruleRelation2899 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleRelation2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3020 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_42_in_ruleAddition3044 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_43_in_ruleAddition3074 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition3097 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication3135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3195 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_44_in_ruleMultiplication3219 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_45_in_ruleMultiplication3249 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication3272 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression3356 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression3381 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrimaryExpression3420 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrimaryExpression3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleValue3639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleValue3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValue3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleType3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleType3763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleType3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleType3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_synpred1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSection_in_synpred2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_synpred3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred231900 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleExpression_in_synpred231921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_synpred241951 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_synpred241968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred262148 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_synpred262182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_synpred292604 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_36_in_synpred292634 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleRelation_in_synpred292657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred342779 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_38_in_synpred342809 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_39_in_synpred342839 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_40_in_synpred342869 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_41_in_synpred342899 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleAddition_in_synpred342922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_synpred363044 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_43_in_synpred363074 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_synpred363097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_synpred383219 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_45_in_synpred383249 = new BitSet(new long[]{0x00004000000801F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_synpred383272 = new BitSet(new long[]{0x0000000000000002L});

}
