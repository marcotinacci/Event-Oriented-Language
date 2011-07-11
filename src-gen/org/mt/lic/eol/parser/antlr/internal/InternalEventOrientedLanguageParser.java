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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL", "RULE_INT", "RULE_REAL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init:'", "'end'", "'globals:'", "';'", "'events:'", "'handlers:'", "'('", "','", "')'", "'['", "']'", "'{'", "'}'", "'='", "'+='", "'-='", "'raise'", "'out'", "'in'", "'if'", "'else'", "'while'", "'+'", "'-'", "'*'", "'/'", "'AND'", "'OR'", "'NOT'", "'<='", "'<'", "'=='", "'>='", "'>'", "'int'", "'real'", "'bool'", "'string'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=5;
    public static final int RULE_INT=6;
    public static final int RULE_REAL=7;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalEventOrientedLanguageParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[86+1];
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:746:1: ruleAbstractBlock returns [EObject current=null] : ( (this_Command_0= ruleCommand ';' ) | this_Construct_2= ruleConstruct | ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' ) ) ;
    public final EObject ruleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject this_Construct_2 = null;

        EObject lv_body_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:751:6: ( ( (this_Command_0= ruleCommand ';' ) | this_Construct_2= ruleConstruct | ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:1: ( (this_Command_0= ruleCommand ';' ) | this_Construct_2= ruleConstruct | ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:1: ( (this_Command_0= ruleCommand ';' ) | this_Construct_2= ruleConstruct | ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' ) )
            int alt12=3;
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
                alt12=1;
                }
                break;
            case 32:
            case 34:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("752:1: ( (this_Command_0= ruleCommand ';' ) | this_Construct_2= ruleConstruct | ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' ) )", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:2: (this_Command_0= ruleCommand ';' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:2: (this_Command_0= ruleCommand ';' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:753:2: this_Command_0= ruleCommand ';'
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getCommandParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommand_in_ruleAbstractBlock1286);
                    this_Command_0=ruleCommand();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Command_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,16,FOLLOW_16_in_ruleAbstractBlock1295); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractBlockAccess().getSemicolonKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:770:2: this_Construct_2= ruleConstruct
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getConstructParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstruct_in_ruleAbstractBlock1327);
                    this_Construct_2=ruleConstruct();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Construct_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:782:6: ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:782:6: ( () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:782:7: () '{' ( (lv_body_5_0= ruleAbstractBlock ) )* '}'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:782:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:783:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAbstractBlockAccess().getCompoundAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAbstractBlockAccess().getCompoundAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,24,FOLLOW_24_in_ruleAbstractBlock1355); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractBlockAccess().getLeftCurlyBracketKeyword_2_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:800:1: ( (lv_body_5_0= ruleAbstractBlock ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID||LA11_0==24||(LA11_0>=29 && LA11_0<=32)||LA11_0==34||(LA11_0>=47 && LA11_0<=50)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:801:1: (lv_body_5_0= ruleAbstractBlock )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:801:1: (lv_body_5_0= ruleAbstractBlock )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:802:3: lv_body_5_0= ruleAbstractBlock
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getBodyAbstractBlockParserRuleCall_2_2_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1376);
                    	    lv_body_5_0=ruleAbstractBlock();
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
                    	      	        		lv_body_5_0, 
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

                    match(input,25,FOLLOW_25_in_ruleAbstractBlock1387); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAbstractBlockAccess().getRightCurlyBracketKeyword_2_3(), null); 
                          
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:836:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:837:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:838:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1424);
            iv_ruleCommand=ruleCommand();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1434); if (failed) return current;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:845:1: ruleCommand returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_bindParams_10_0 = null;

        EObject lv_bindParams_12_0 = null;

        EObject lv_params_22_0 = null;

        EObject lv_params_24_0 = null;

        EObject lv_output_28_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:850:6: ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:851:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:851:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )
            int alt16=7;
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
                        new NoViableAltException("851:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 16, 2, input);

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
                alt16=6;
                }
                break;
            case 31:
                {
                alt16=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("851:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_28_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:852:2: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableDeclarationParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleCommand1484);
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
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:864:6: ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:864:6: ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:864:7: () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:864:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:865:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getVariableAssignAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getVariableAssignAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:878:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:879:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:879:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:880:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1524); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getNameVariableDeclarationCrossReference_1_1_0(), "name"); 
                      	
                    }

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleCommand1534); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getEqualsSignKeyword_1_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:899:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:900:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:900:1: (lv_value_4_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:901:3: lv_value_4_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getValueExpressionParserRuleCall_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1555);
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
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:924:6: ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:924:6: ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:924:7: () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) '[' ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )? ']'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:924:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:925:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getBindHandlerAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getBindHandlerAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:938:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:939:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:939:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:940:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1597); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_2_1_0(), "eventName"); 
                      	
                    }

                    }


                    }

                    match(input,27,FOLLOW_27_in_ruleCommand1607); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getPlusSignEqualsSignKeyword_2_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:959:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:960:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:960:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:961:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1629); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getHandlerNameHandlerDeclCrossReference_2_3_0(), "handlerName"); 
                      	
                    }

                    }


                    }

                    match(input,22,FOLLOW_22_in_ruleCommand1639); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getLeftSquareBracketKeyword_2_4(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:980:1: ( ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_REAL)||LA13_0==19||LA13_0==41) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:980:2: ( (lv_bindParams_10_0= ruleExpression ) ) ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:980:2: ( (lv_bindParams_10_0= ruleExpression ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:981:1: (lv_bindParams_10_0= ruleExpression )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:981:1: (lv_bindParams_10_0= ruleExpression )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:982:3: lv_bindParams_10_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBindParamsExpressionParserRuleCall_2_5_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCommand1661);
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

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1004:2: ( ',' ( (lv_bindParams_12_0= ruleExpression ) ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1004:4: ',' ( (lv_bindParams_12_0= ruleExpression ) )
                            {
                            match(input,20,FOLLOW_20_in_ruleCommand1672); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getCommandAccess().getCommaKeyword_2_5_1_0(), null); 
                                  
                            }
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1008:1: ( (lv_bindParams_12_0= ruleExpression ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1009:1: (lv_bindParams_12_0= ruleExpression )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1009:1: (lv_bindParams_12_0= ruleExpression )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1010:3: lv_bindParams_12_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBindParamsExpressionParserRuleCall_2_5_1_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCommand1693);
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

                    match(input,23,FOLLOW_23_in_ruleCommand1706); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getRightSquareBracketKeyword_2_6(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1037:6: ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1037:6: ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1037:7: () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1037:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1038:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getUnbindHandlerAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getUnbindHandlerAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1051:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1052:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1052:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1053:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1748); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_3_1_0(), "eventName"); 
                      	
                    }

                    }


                    }

                    match(input,28,FOLLOW_28_in_ruleCommand1758); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getHyphenMinusEqualsSignKeyword_3_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1072:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1074:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1780); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getHandlerNameHandlerDeclCrossReference_3_3_0(), "handlerName"); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1090:6: ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1090:6: ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1090:7: () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )? ')'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1090:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1091:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getRaiseEventAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getRaiseEventAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,29,FOLLOW_29_in_ruleCommand1810); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getRaiseKeyword_4_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1108:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1109:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1109:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1110:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1832); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_4_2_0(), "eventName"); 
                      	
                    }

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleCommand1842); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_4_3(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1129:1: ( ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_REAL)||LA15_0==19||LA15_0==41) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1129:2: ( (lv_params_22_0= ruleExpression ) ) ( ',' ( (lv_params_24_0= ruleExpression ) ) )*
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1129:2: ( (lv_params_22_0= ruleExpression ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1130:1: (lv_params_22_0= ruleExpression )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1130:1: (lv_params_22_0= ruleExpression )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1131:3: lv_params_22_0= ruleExpression
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getParamsExpressionParserRuleCall_4_4_0_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExpression_in_ruleCommand1864);
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

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1153:2: ( ',' ( (lv_params_24_0= ruleExpression ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==20) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1153:4: ',' ( (lv_params_24_0= ruleExpression ) )
                            	    {
                            	    match(input,20,FOLLOW_20_in_ruleCommand1875); if (failed) return current;
                            	    if ( backtracking==0 ) {

                            	              createLeafNode(grammarAccess.getCommandAccess().getCommaKeyword_4_4_1_0(), null); 
                            	          
                            	    }
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1157:1: ( (lv_params_24_0= ruleExpression ) )
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1158:1: (lv_params_24_0= ruleExpression )
                            	    {
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1158:1: (lv_params_24_0= ruleExpression )
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1159:3: lv_params_24_0= ruleExpression
                            	    {
                            	    if ( backtracking==0 ) {
                            	       
                            	      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getParamsExpressionParserRuleCall_4_4_1_1_0(), currentNode); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1896);
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

                    match(input,21,FOLLOW_21_in_ruleCommand1910); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getRightParenthesisKeyword_4_5(), null); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1186:6: ( () 'out' ( (lv_output_28_0= ruleExpression ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1186:6: ( () 'out' ( (lv_output_28_0= ruleExpression ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1186:7: () 'out' ( (lv_output_28_0= ruleExpression ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1186:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getPrintOutputAction_5_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getPrintOutputAction_5_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,30,FOLLOW_30_in_ruleCommand1940); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getOutKeyword_5_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1204:1: ( (lv_output_28_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1205:1: (lv_output_28_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1205:1: (lv_output_28_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:3: lv_output_28_0= ruleExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getOutputExpressionParserRuleCall_5_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1961);
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
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1229:6: ( () 'in' ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1229:6: ( () 'in' ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1229:7: () 'in' ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1229:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1230:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getCommandAccess().getReadInputAction_6_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getReadInputAction_6_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,31,FOLLOW_31_in_ruleCommand1991); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getCommandAccess().getInKeyword_6_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1247:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1248:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1248:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1249:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand2013); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getCommandAccess().getInputVariableDeclarationCrossReference_6_2_0(), "input"); 
                      	
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


    // $ANTLR start entryRuleConstruct
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1272:1: entryRuleConstruct returns [EObject current=null] : iv_ruleConstruct= ruleConstruct EOF ;
    public final EObject entryRuleConstruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1273:2: (iv_ruleConstruct= ruleConstruct EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1274:2: iv_ruleConstruct= ruleConstruct EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstructRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleConstruct_in_entryRuleConstruct2050);
            iv_ruleConstruct=ruleConstruct();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleConstruct; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstruct2060); if (failed) return current;

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
    // $ANTLR end entryRuleConstruct


    // $ANTLR start ruleConstruct
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1281:1: ruleConstruct returns [EObject current=null] : ( ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) ) ) ;
    public final EObject ruleConstruct() throws RecognitionException {
        EObject current = null;

        Token lv_balanced_6_0=null;
        EObject lv_condition_3_0 = null;

        EObject lv_thenBlock_5_0 = null;

        EObject lv_elseBlock_7_0 = null;

        EObject lv_condition_11_0 = null;

        EObject lv_block_13_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1286:6: ( ( ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1287:1: ( ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1287:1: ( ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            else if ( (LA18_0==34) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1287:1: ( ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? ) | ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) ) )", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1287:2: ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1287:2: ( () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )? )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1287:3: () 'if' '(' ( (lv_condition_3_0= ruleCondition ) ) ')' ( (lv_thenBlock_5_0= ruleAbstractBlock ) ) ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )?
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1287:3: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1288:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstructAccess().getIfThenElseAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstructAccess().getIfThenElseAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,32,FOLLOW_32_in_ruleConstruct2108); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructAccess().getIfKeyword_0_1(), null); 
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleConstruct2118); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructAccess().getLeftParenthesisKeyword_0_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1309:1: ( (lv_condition_3_0= ruleCondition ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1310:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1310:1: (lv_condition_3_0= ruleCondition )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1311:3: lv_condition_3_0= ruleCondition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructAccess().getConditionConditionParserRuleCall_0_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleConstruct2139);
                    lv_condition_3_0=ruleCondition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"condition",
                      	        		lv_condition_3_0, 
                      	        		"Condition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleConstruct2149); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructAccess().getRightParenthesisKeyword_0_4(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1337:1: ( (lv_thenBlock_5_0= ruleAbstractBlock ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1338:1: (lv_thenBlock_5_0= ruleAbstractBlock )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1338:1: (lv_thenBlock_5_0= ruleAbstractBlock )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1339:3: lv_thenBlock_5_0= ruleAbstractBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructAccess().getThenBlockAbstractBlockParserRuleCall_0_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleConstruct2170);
                    lv_thenBlock_5_0=ruleAbstractBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"thenBlock",
                      	        		lv_thenBlock_5_0, 
                      	        		"AbstractBlock", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:2: ( ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==33) ) {
                        int LA17_1 = input.LA(2);

                        if ( (synpred25()) ) {
                            alt17=1;
                        }
                    }
                    switch (alt17) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:3: ( (lv_balanced_6_0= 'else' ) ) ( (lv_elseBlock_7_0= ruleAbstractBlock ) )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:3: ( (lv_balanced_6_0= 'else' ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1362:1: (lv_balanced_6_0= 'else' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1362:1: (lv_balanced_6_0= 'else' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1363:3: lv_balanced_6_0= 'else'
                            {
                            lv_balanced_6_0=(Token)input.LT(1);
                            match(input,33,FOLLOW_33_in_ruleConstruct2189); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getConstructAccess().getBalancedElseKeyword_0_6_0_0(), "balanced"); 
                                  
                            }
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getConstructRule().getType().getClassifier());
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

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:2: ( (lv_elseBlock_7_0= ruleAbstractBlock ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1383:1: (lv_elseBlock_7_0= ruleAbstractBlock )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1383:1: (lv_elseBlock_7_0= ruleAbstractBlock )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1384:3: lv_elseBlock_7_0= ruleAbstractBlock
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getConstructAccess().getElseBlockAbstractBlockParserRuleCall_0_6_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleConstruct2223);
                            lv_elseBlock_7_0=ruleAbstractBlock();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getConstructRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		set(
                              	       			current, 
                              	       			"elseBlock",
                              	        		lv_elseBlock_7_0, 
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
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1407:6: ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1407:6: ( () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1407:7: () 'while' '(' ( (lv_condition_11_0= ruleCondition ) ) ')' ( (lv_block_13_0= ruleAbstractBlock ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1407:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1408:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstructAccess().getWhileAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstructAccess().getWhileAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,34,FOLLOW_34_in_ruleConstruct2255); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructAccess().getWhileKeyword_1_1(), null); 
                          
                    }
                    match(input,19,FOLLOW_19_in_ruleConstruct2265); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructAccess().getLeftParenthesisKeyword_1_2(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1429:1: ( (lv_condition_11_0= ruleCondition ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1430:1: (lv_condition_11_0= ruleCondition )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1430:1: (lv_condition_11_0= ruleCondition )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1431:3: lv_condition_11_0= ruleCondition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructAccess().getConditionConditionParserRuleCall_1_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleConstruct2286);
                    lv_condition_11_0=ruleCondition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"condition",
                      	        		lv_condition_11_0, 
                      	        		"Condition", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,21,FOLLOW_21_in_ruleConstruct2296); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstructAccess().getRightParenthesisKeyword_1_4(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1457:1: ( (lv_block_13_0= ruleAbstractBlock ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1458:1: (lv_block_13_0= ruleAbstractBlock )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1458:1: (lv_block_13_0= ruleAbstractBlock )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1459:3: lv_block_13_0= ruleAbstractBlock
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstructAccess().getBlockAbstractBlockParserRuleCall_1_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleConstruct2317);
                    lv_block_13_0=ruleAbstractBlock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstructRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"block",
                      	        		lv_block_13_0, 
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
    // $ANTLR end ruleConstruct


    // $ANTLR start entryRuleVariableDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1489:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1490:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1491:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2354);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2364); if (failed) return current;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1498:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1503:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1504:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1504:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1504:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1504:2: ( (lv_type_0_0= ruleType ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1505:1: (lv_type_0_0= ruleType )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1505:1: (lv_type_0_0= ruleType )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1506:3: lv_type_0_0= ruleType
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration2410);
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

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1528:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1529:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1529:1: (lv_name_1_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1530:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration2427); if (failed) return current;
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1560:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1561:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1562:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression2468);
            iv_ruleExpression=ruleExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression2478); if (failed) return current;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1569:1: ruleExpression returns [EObject current=null] : (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MathExpression_0 = null;

        EObject this_Condition_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1574:6: ( (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )
            int alt19=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA19_1 = input.LA(2);

                if ( (synpred27()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )", 19, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA19_2 = input.LA(2);

                if ( (synpred27()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )", 19, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REAL:
                {
                int LA19_3 = input.LA(2);

                if ( (synpred27()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )", 19, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA19_4 = input.LA(2);

                if ( (synpred27()) ) {
                    alt19=1;
                }
                else if ( (true) ) {
                    alt19=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )", 19, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL:
            case 41:
                {
                alt19=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1575:1: (this_MathExpression_0= ruleMathExpression | this_Condition_1= ruleCondition )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1576:2: this_MathExpression_0= ruleMathExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getMathExpressionParserRuleCall_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleExpression2528);
                    this_MathExpression_0=ruleMathExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_MathExpression_0; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1589:2: this_Condition_1= ruleCondition
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getConditionParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleExpression2558);
                    this_Condition_1=ruleCondition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Condition_1; 
                              currentNode = currentNode.getParent();
                          
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
    // $ANTLR end ruleExpression


    // $ANTLR start entryRuleMathExpression
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1608:1: entryRuleMathExpression returns [EObject current=null] : iv_ruleMathExpression= ruleMathExpression EOF ;
    public final EObject entryRuleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1609:2: (iv_ruleMathExpression= ruleMathExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1610:2: iv_ruleMathExpression= ruleMathExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMathExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMathExpression_in_entryRuleMathExpression2593);
            iv_ruleMathExpression=ruleMathExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMathExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMathExpression2603); if (failed) return current;

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
    // $ANTLR end entryRuleMathExpression


    // $ANTLR start ruleMathExpression
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1617:1: ruleMathExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleMathExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1622:6: (this_Addition_0= ruleAddition )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1624:2: this_Addition_0= ruleAddition
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMathExpressionAccess().getAdditionParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleMathExpression2652);
            this_Addition_0=ruleAddition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Addition_0; 
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
    // $ANTLR end ruleMathExpression


    // $ANTLR start entryRuleAddition
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1643:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1644:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1645:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition2686);
            iv_ruleAddition=ruleAddition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2696); if (failed) return current;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1652:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1657:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1658:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1658:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1659:2: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2746);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=35 && LA21_0<=36)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==35) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==36) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1670:2: ( ( () '+' ) | ( () '-' ) )", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:3: ( () '+' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:3: ( () '+' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:4: () '+'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1670:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1671:2: 
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

            	            match(input,35,FOLLOW_35_in_ruleAddition2770); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1694:6: ( () '-' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1694:6: ( () '-' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1694:7: () '-'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1694:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1695:2: 
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

            	            match(input,36,FOLLOW_36_in_ruleAddition2800); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1717:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1718:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1718:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1719:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2823);
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
            	    break loop21;
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1749:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1750:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1751:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2861);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2871); if (failed) return current;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1758:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1763:6: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1764:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1764:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1765:2: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2921);
            this_PrimaryExpression_0=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=37 && LA23_0<=38)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==37) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==38) ) {
            	        alt22=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1776:2: ( ( () '*' ) | ( () '/' ) )", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:3: ( () '*' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:3: ( () '*' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:4: () '*'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1776:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1777:2: 
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

            	            match(input,37,FOLLOW_37_in_ruleMultiplication2945); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1800:6: ( () '/' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1800:6: ( () '/' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1800:7: () '/'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1800:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1801:2: 
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

            	            match(input,38,FOLLOW_38_in_ruleMultiplication2975); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1823:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1824:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1824:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1825:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2998);
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
            	    break loop23;
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1855:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1856:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1857:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3036);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression3046); if (failed) return current;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1864:1: rulePrimaryExpression returns [EObject current=null] : ( ( '(' this_MathExpression_1= ruleMathExpression ')' ) | ( () ( (lv_value_4_0= ruleNumericValue ) ) ) | ( () ( ( RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MathExpression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1869:6: ( ( ( '(' this_MathExpression_1= ruleMathExpression ')' ) | ( () ( (lv_value_4_0= ruleNumericValue ) ) ) | ( () ( ( RULE_ID ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1870:1: ( ( '(' this_MathExpression_1= ruleMathExpression ')' ) | ( () ( (lv_value_4_0= ruleNumericValue ) ) ) | ( () ( ( RULE_ID ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1870:1: ( ( '(' this_MathExpression_1= ruleMathExpression ')' ) | ( () ( (lv_value_4_0= ruleNumericValue ) ) ) | ( () ( ( RULE_ID ) ) ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt24=1;
                }
                break;
            case RULE_INT:
            case RULE_REAL:
                {
                alt24=2;
                }
                break;
            case RULE_ID:
                {
                alt24=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1870:1: ( ( '(' this_MathExpression_1= ruleMathExpression ')' ) | ( () ( (lv_value_4_0= ruleNumericValue ) ) ) | ( () ( ( RULE_ID ) ) ) )", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1870:2: ( '(' this_MathExpression_1= ruleMathExpression ')' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1870:2: ( '(' this_MathExpression_1= ruleMathExpression ')' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1870:4: '(' this_MathExpression_1= ruleMathExpression ')'
                    {
                    match(input,19,FOLLOW_19_in_rulePrimaryExpression3082); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMathExpressionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMathExpression_in_rulePrimaryExpression3107);
                    this_MathExpression_1=ruleMathExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_MathExpression_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,21,FOLLOW_21_in_rulePrimaryExpression3116); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1891:6: ( () ( (lv_value_4_0= ruleNumericValue ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1891:6: ( () ( (lv_value_4_0= ruleNumericValue ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1891:7: () ( (lv_value_4_0= ruleNumericValue ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1891:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1892:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1905:2: ( (lv_value_4_0= ruleNumericValue ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1906:1: (lv_value_4_0= ruleNumericValue )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1906:1: (lv_value_4_0= ruleNumericValue )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1907:3: lv_value_4_0= ruleNumericValue
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueNumericValueParserRuleCall_1_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumericValue_in_rulePrimaryExpression3157);
                    lv_value_4_0=ruleNumericValue();
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
                      	        		lv_value_4_0, 
                      	        		"NumericValue", 
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
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1930:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1930:6: ( () ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1930:7: () ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1930:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1931:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1944:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1945:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1945:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1946:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression3199); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPrimaryExpressionAccess().getVarVariableDeclarationCrossReference_2_1_0(), "var"); 
                      	
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


    // $ANTLR start entryRuleCondition
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1969:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1970:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1971:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConditionRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3236);
            iv_ruleCondition=ruleCondition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3246); if (failed) return current;

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
    // $ANTLR end entryRuleCondition


    // $ANTLR start ruleCondition
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1978:1: ruleCondition returns [EObject current=null] : this_BinaryBoolean_0= ruleBinaryBoolean ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryBoolean_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1983:6: (this_BinaryBoolean_0= ruleBinaryBoolean )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1985:2: this_BinaryBoolean_0= ruleBinaryBoolean
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getConditionAccess().getBinaryBooleanParserRuleCall(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleBinaryBoolean_in_ruleCondition3295);
            this_BinaryBoolean_0=ruleBinaryBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_BinaryBoolean_0; 
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
    // $ANTLR end ruleCondition


    // $ANTLR start entryRuleBinaryBoolean
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2004:1: entryRuleBinaryBoolean returns [EObject current=null] : iv_ruleBinaryBoolean= ruleBinaryBoolean EOF ;
    public final EObject entryRuleBinaryBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryBoolean = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2005:2: (iv_ruleBinaryBoolean= ruleBinaryBoolean EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2006:2: iv_ruleBinaryBoolean= ruleBinaryBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBinaryBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleBinaryBoolean_in_entryRuleBinaryBoolean3329);
            iv_ruleBinaryBoolean=ruleBinaryBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleBinaryBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryBoolean3339); if (failed) return current;

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
    // $ANTLR end entryRuleBinaryBoolean


    // $ANTLR start ruleBinaryBoolean
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2013:1: ruleBinaryBoolean returns [EObject current=null] : (this_UnaryBoolean_0= ruleUnaryBoolean ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) ) )* ) ;
    public final EObject ruleBinaryBoolean() throws RecognitionException {
        EObject current = null;

        EObject this_UnaryBoolean_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2018:6: ( (this_UnaryBoolean_0= ruleUnaryBoolean ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2019:1: (this_UnaryBoolean_0= ruleUnaryBoolean ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2019:1: (this_UnaryBoolean_0= ruleUnaryBoolean ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2020:2: this_UnaryBoolean_0= ruleUnaryBoolean ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getBinaryBooleanAccess().getUnaryBooleanParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryBoolean_in_ruleBinaryBoolean3389);
            this_UnaryBoolean_0=ruleUnaryBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_UnaryBoolean_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:1: ( ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    int LA26_2 = input.LA(2);

                    if ( (synpred35()) ) {
                        alt26=1;
                    }


                }
                else if ( (LA26_0==40) ) {
                    int LA26_3 = input.LA(2);

                    if ( (synpred35()) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:2: ( ( () 'AND' ) | ( () 'OR' ) ) ( (lv_right_5_0= ruleUnaryBoolean ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:2: ( ( () 'AND' ) | ( () 'OR' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==39) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==40) ) {
            	        alt25=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("2031:2: ( ( () 'AND' ) | ( () 'OR' ) )", 25, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:3: ( () 'AND' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:3: ( () 'AND' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:4: () 'AND'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2032:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getBinaryBooleanAccess().getAndLeftAction_1_0_0_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getBinaryBooleanAccess().getAndLeftAction_1_0_0_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,39,FOLLOW_39_in_ruleBinaryBoolean3413); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getBinaryBooleanAccess().getANDKeyword_1_0_0_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:6: ( () 'OR' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:6: ( () 'OR' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:7: () 'OR'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2056:2: 
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      temp=factory.create(grammarAccess.getBinaryBooleanAccess().getOrLeftAction_1_0_1_0().getType().getClassifier());
            	                      try {
            	                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
            	                      } catch(ValueConverterException vce) {
            	                      	handleValueConverterException(vce);
            	                      }
            	                      current = temp; 
            	                      temp = null;
            	                      CompositeNode newNode = createCompositeNode(grammarAccess.getBinaryBooleanAccess().getOrLeftAction_1_0_1_0(), currentNode.getParent());
            	                  newNode.getChildren().add(currentNode);
            	                  moveLookaheadInfo(currentNode, newNode);
            	                  currentNode = newNode; 
            	                      associateNodeWithAstElement(currentNode, current); 
            	                  
            	            }

            	            }

            	            match(input,40,FOLLOW_40_in_ruleBinaryBoolean3443); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getBinaryBooleanAccess().getORKeyword_1_0_1_1(), null); 
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2078:3: ( (lv_right_5_0= ruleUnaryBoolean ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2079:1: (lv_right_5_0= ruleUnaryBoolean )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2079:1: (lv_right_5_0= ruleUnaryBoolean )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2080:3: lv_right_5_0= ruleUnaryBoolean
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBinaryBooleanAccess().getRightUnaryBooleanParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryBoolean_in_ruleBinaryBoolean3466);
            	    lv_right_5_0=ruleUnaryBoolean();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBinaryBooleanRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		set(
            	      	       			current, 
            	      	       			"right",
            	      	        		lv_right_5_0, 
            	      	        		"UnaryBoolean", 
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
    // $ANTLR end ruleBinaryBoolean


    // $ANTLR start entryRuleUnaryBoolean
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2110:1: entryRuleUnaryBoolean returns [EObject current=null] : iv_ruleUnaryBoolean= ruleUnaryBoolean EOF ;
    public final EObject entryRuleUnaryBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryBoolean = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2111:2: (iv_ruleUnaryBoolean= ruleUnaryBoolean EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2112:2: iv_ruleUnaryBoolean= ruleUnaryBoolean EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getUnaryBooleanRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleUnaryBoolean_in_entryRuleUnaryBoolean3504);
            iv_ruleUnaryBoolean=ruleUnaryBoolean();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleUnaryBoolean; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryBoolean3514); if (failed) return current;

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
    // $ANTLR end entryRuleUnaryBoolean


    // $ANTLR start ruleUnaryBoolean
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2119:1: ruleUnaryBoolean returns [EObject current=null] : ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) ) ;
    public final EObject ruleUnaryBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_4_0=null;
        EObject this_Condition_1 = null;

        EObject lv_cond_7_0 = null;

        EObject this_MathExpression_10 = null;

        EObject lv_right_21_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2124:6: ( ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:1: ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:1: ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA28_1 = input.LA(2);

                if ( (synpred36()) ) {
                    alt28=1;
                }
                else if ( (true) ) {
                    alt28=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2125:1: ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) )", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_BOOL:
                {
                alt28=2;
                }
                break;
            case 41:
                {
                alt28=3;
                }
                break;
            case RULE_ID:
                {
                int LA28_4 = input.LA(2);

                if ( (synpred39()) ) {
                    alt28=4;
                }
                else if ( (true) ) {
                    alt28=5;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2125:1: ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) )", 28, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_REAL:
                {
                alt28=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2125:1: ( ( '(' this_Condition_1= ruleCondition ')' ) | ( () ( (lv_value_4_0= RULE_BOOL ) ) ) | ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) ) | ( () ( ( RULE_ID ) ) ) | (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:2: ( '(' this_Condition_1= ruleCondition ')' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:2: ( '(' this_Condition_1= ruleCondition ')' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:4: '(' this_Condition_1= ruleCondition ')'
                    {
                    match(input,19,FOLLOW_19_in_ruleUnaryBoolean3550); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnaryBooleanAccess().getLeftParenthesisKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryBooleanAccess().getConditionParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleUnaryBoolean3575);
                    this_Condition_1=ruleCondition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_Condition_1; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,21,FOLLOW_21_in_ruleUnaryBoolean3584); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnaryBooleanAccess().getRightParenthesisKeyword_0_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2146:6: ( () ( (lv_value_4_0= RULE_BOOL ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2146:6: ( () ( (lv_value_4_0= RULE_BOOL ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2146:7: () ( (lv_value_4_0= RULE_BOOL ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2146:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2147:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getUnaryBooleanAccess().getBooleanLiteralAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getBooleanLiteralAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2160:2: ( (lv_value_4_0= RULE_BOOL ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2161:1: (lv_value_4_0= RULE_BOOL )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2161:1: (lv_value_4_0= RULE_BOOL )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2162:3: lv_value_4_0= RULE_BOOL
                    {
                    lv_value_4_0=(Token)input.LT(1);
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleUnaryBoolean3621); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getUnaryBooleanAccess().getValueBOOLTerminalRuleCall_1_1_0(), "value"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryBooleanRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"value",
                      	        		lv_value_4_0, 
                      	        		"BOOL", 
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
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2185:6: ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2185:6: ( () 'NOT' ( (lv_cond_7_0= ruleCondition ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2185:7: () 'NOT' ( (lv_cond_7_0= ruleCondition ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2185:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2186:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getUnaryBooleanAccess().getNotAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getNotAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,41,FOLLOW_41_in_ruleUnaryBoolean3656); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getUnaryBooleanAccess().getNOTKeyword_2_1(), null); 
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2203:1: ( (lv_cond_7_0= ruleCondition ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2204:1: (lv_cond_7_0= ruleCondition )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2204:1: (lv_cond_7_0= ruleCondition )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2205:3: lv_cond_7_0= ruleCondition
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryBooleanAccess().getCondConditionParserRuleCall_2_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCondition_in_ruleUnaryBoolean3677);
                    lv_cond_7_0=ruleCondition();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryBooleanRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"cond",
                      	        		lv_cond_7_0, 
                      	        		"Condition", 
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
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:6: ( () ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:7: () ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2229:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getUnaryBooleanAccess().getBooleanReferenceAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getBooleanReferenceAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2242:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2243:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2243:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2244:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryBooleanRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnaryBoolean3719); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getUnaryBooleanAccess().getVarVariableDeclarationCrossReference_3_1_0(), "var"); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2260:6: (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2260:6: (this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2261:2: this_MathExpression_10= ruleMathExpression ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) ) ( (lv_right_21_0= ruleMathExpression ) )
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getUnaryBooleanAccess().getMathExpressionParserRuleCall_4_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleUnaryBoolean3752);
                    this_MathExpression_10=ruleMathExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_MathExpression_10; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2272:1: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) )
                    int alt27=5;
                    switch ( input.LA(1) ) {
                    case 42:
                        {
                        alt27=1;
                        }
                        break;
                    case 43:
                        {
                        alt27=2;
                        }
                        break;
                    case 44:
                        {
                        alt27=3;
                        }
                        break;
                    case 45:
                        {
                        alt27=4;
                        }
                        break;
                    case 46:
                        {
                        alt27=5;
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("2272:1: ( ( () '<=' ) | ( () '<' ) | ( () '==' ) | ( () '>=' ) | ( () '>' ) )", 27, 0, input);

                        throw nvae;
                    }

                    switch (alt27) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2272:2: ( () '<=' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2272:2: ( () '<=' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2272:3: () '<='
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2272:3: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2273:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getUnaryBooleanAccess().getLeqLeftAction_4_1_0_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getLeqLeftAction_4_1_0_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,42,FOLLOW_42_in_ruleUnaryBoolean3775); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnaryBooleanAccess().getLessThanSignEqualsSignKeyword_4_1_0_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2296:6: ( () '<' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2296:6: ( () '<' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2296:7: () '<'
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2296:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2297:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getUnaryBooleanAccess().getLessLeftAction_4_1_1_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getLessLeftAction_4_1_1_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,43,FOLLOW_43_in_ruleUnaryBoolean3805); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnaryBooleanAccess().getLessThanSignKeyword_4_1_1_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 3 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2320:6: ( () '==' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2320:6: ( () '==' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2320:7: () '=='
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2320:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2321:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getUnaryBooleanAccess().getEqLeftAction_4_1_2_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getEqLeftAction_4_1_2_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,44,FOLLOW_44_in_ruleUnaryBoolean3835); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnaryBooleanAccess().getEqualsSignEqualsSignKeyword_4_1_2_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 4 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2344:6: ( () '>=' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2344:6: ( () '>=' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2344:7: () '>='
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2344:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2345:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getUnaryBooleanAccess().getGeqLeftAction_4_1_3_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getGeqLeftAction_4_1_3_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,45,FOLLOW_45_in_ruleUnaryBoolean3865); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnaryBooleanAccess().getGreaterThanSignEqualsSignKeyword_4_1_3_1(), null); 
                                  
                            }

                            }


                            }
                            break;
                        case 5 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2368:6: ( () '>' )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2368:6: ( () '>' )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2368:7: () '>'
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2368:7: ()
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2369:2: 
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      temp=factory.create(grammarAccess.getUnaryBooleanAccess().getGtrLeftAction_4_1_4_0().getType().getClassifier());
                                      try {
                                      	factory.set(temp, "left", current, null /*ParserRule*/, currentNode);
                                      } catch(ValueConverterException vce) {
                                      	handleValueConverterException(vce);
                                      }
                                      current = temp; 
                                      temp = null;
                                      CompositeNode newNode = createCompositeNode(grammarAccess.getUnaryBooleanAccess().getGtrLeftAction_4_1_4_0(), currentNode.getParent());
                                  newNode.getChildren().add(currentNode);
                                  moveLookaheadInfo(currentNode, newNode);
                                  currentNode = newNode; 
                                      associateNodeWithAstElement(currentNode, current); 
                                  
                            }

                            }

                            match(input,46,FOLLOW_46_in_ruleUnaryBoolean3895); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getUnaryBooleanAccess().getGreaterThanSignKeyword_4_1_4_1(), null); 
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2391:3: ( (lv_right_21_0= ruleMathExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2392:1: (lv_right_21_0= ruleMathExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2392:1: (lv_right_21_0= ruleMathExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2393:3: lv_right_21_0= ruleMathExpression
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getUnaryBooleanAccess().getRightMathExpressionParserRuleCall_4_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleMathExpression_in_ruleUnaryBoolean3918);
                    lv_right_21_0=ruleMathExpression();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getUnaryBooleanRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"right",
                      	        		lv_right_21_0, 
                      	        		"MathExpression", 
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
    // $ANTLR end ruleUnaryBoolean


    // $ANTLR start entryRuleNumericValue
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2425:1: entryRuleNumericValue returns [String current=null] : iv_ruleNumericValue= ruleNumericValue EOF ;
    public final String entryRuleNumericValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericValue = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2426:2: (iv_ruleNumericValue= ruleNumericValue EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2427:2: iv_ruleNumericValue= ruleNumericValue EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getNumericValueRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleNumericValue_in_entryRuleNumericValue3958);
            iv_ruleNumericValue=ruleNumericValue();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleNumericValue.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumericValue3969); if (failed) return current;

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
    // $ANTLR end entryRuleNumericValue


    // $ANTLR start ruleNumericValue
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2434:1: ruleNumericValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL ) ;
    public final AntlrDatatypeRuleToken ruleNumericValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_REAL_1=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2439:6: ( (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2440:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2440:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_REAL) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2440:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2440:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumericValue4009); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNumericValueAccess().getINTTerminalRuleCall_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2448:10: this_REAL_1= RULE_REAL
                    {
                    this_REAL_1=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleNumericValue4035); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_REAL_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getNumericValueAccess().getREALTerminalRuleCall_1(), null); 
                          
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
    // $ANTLR end ruleNumericValue


    // $ANTLR start ruleType
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2463:1: ruleType returns [Enumerator current=null] : ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2467:6: ( ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2468:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2468:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt30=1;
                }
                break;
            case 48:
                {
                alt30=2;
                }
                break;
            case 49:
                {
                alt30=3;
                }
                break;
            case 50:
                {
                alt30=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2468:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) | ( 'string' ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2468:2: ( 'int' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2468:2: ( 'int' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2468:4: 'int'
                    {
                    match(input,47,FOLLOW_47_in_ruleType4092); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2474:6: ( 'real' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2474:6: ( 'real' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2474:8: 'real'
                    {
                    match(input,48,FOLLOW_48_in_ruleType4107); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2480:6: ( 'bool' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2480:6: ( 'bool' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2480:8: 'bool'
                    {
                    match(input,49,FOLLOW_49_in_ruleType4122); if (failed) return current;
                    if ( backtracking==0 ) {

                              current = grammarAccess.getTypeAccess().getT_BOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              createLeafNode(grammarAccess.getTypeAccess().getT_BOOLEnumLiteralDeclaration_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2486:6: ( 'string' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2486:6: ( 'string' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2486:8: 'string'
                    {
                    match(input,50,FOLLOW_50_in_ruleType4137); if (failed) return current;
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

    // $ANTLR start synpred25
    public final void synpred25_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:3: ( ( ( 'else' ) ) ( ( ruleAbstractBlock ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:3: ( ( 'else' ) ) ( ( ruleAbstractBlock ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:3: ( ( 'else' ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1362:1: ( 'else' )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1362:1: ( 'else' )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1363:3: 'else'
        {
        match(input,33,FOLLOW_33_in_synpred252189); if (failed) return ;

        }


        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:2: ( ( ruleAbstractBlock ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1383:1: ( ruleAbstractBlock )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1383:1: ( ruleAbstractBlock )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1384:3: ruleAbstractBlock
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getConstructAccess().getElseBlockAbstractBlockParserRuleCall_0_6_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleAbstractBlock_in_synpred252223);
        ruleAbstractBlock();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1576:2: ( ruleMathExpression )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1576:2: ruleMathExpression
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleMathExpression_in_synpred272528);
        ruleMathExpression();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred35
    public final void synpred35_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:2: ( ( ( () 'AND' ) | ( () 'OR' ) ) ( ( ruleUnaryBoolean ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:2: ( ( () 'AND' ) | ( () 'OR' ) ) ( ( ruleUnaryBoolean ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:2: ( ( () 'AND' ) | ( () 'OR' ) )
        int alt41=2;
        int LA41_0 = input.LA(1);

        if ( (LA41_0==39) ) {
            alt41=1;
        }
        else if ( (LA41_0==40) ) {
            alt41=2;
        }
        else {
            if (backtracking>0) {failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("2031:2: ( ( () 'AND' ) | ( () 'OR' ) )", 41, 0, input);

            throw nvae;
        }
        switch (alt41) {
            case 1 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:3: ( () 'AND' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:3: ( () 'AND' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:4: () 'AND'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2031:4: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2032:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,39,FOLLOW_39_in_synpred353413); if (failed) return ;

                }


                }
                break;
            case 2 :
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:6: ( () 'OR' )
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:6: ( () 'OR' )
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:7: () 'OR'
                {
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2055:7: ()
                // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2056:2: 
                {
                if ( backtracking==0 ) {
                   
                  	  /* */ 
                  	
                }

                }

                match(input,40,FOLLOW_40_in_synpred353443); if (failed) return ;

                }


                }
                break;

        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2078:3: ( ( ruleUnaryBoolean ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2079:1: ( ruleUnaryBoolean )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2079:1: ( ruleUnaryBoolean )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2080:3: ruleUnaryBoolean
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getBinaryBooleanAccess().getRightUnaryBooleanParserRuleCall_1_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleUnaryBoolean_in_synpred353466);
        ruleUnaryBoolean();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred35

    // $ANTLR start synpred36
    public final void synpred36_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:2: ( ( '(' ruleCondition ')' ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:2: ( '(' ruleCondition ')' )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:2: ( '(' ruleCondition ')' )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2125:4: '(' ruleCondition ')'
        {
        match(input,19,FOLLOW_19_in_synpred363550); if (failed) return ;
        pushFollow(FOLLOW_ruleCondition_in_synpred363575);
        ruleCondition();
        _fsp--;
        if (failed) return ;
        match(input,21,FOLLOW_21_in_synpred363584); if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred36

    // $ANTLR start synpred39
    public final void synpred39_fragment() throws RecognitionException {   
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:6: ( ( () ( ( RULE_ID ) ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:6: ( () ( ( RULE_ID ) ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:6: ( () ( ( RULE_ID ) ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:7: () ( ( RULE_ID ) )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2228:7: ()
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2229:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2242:2: ( ( RULE_ID ) )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2243:1: ( RULE_ID )
        {
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2243:1: ( RULE_ID )
        // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:2244:3: RULE_ID
        {
        if ( backtracking==0 ) {
           
          		  /* */ 
          		
        }
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred393719); if (failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred39

    public final boolean synpred35() {
        backtracking++;
        int start = input.mark();
        try {
            synpred35_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred39() {
        backtracking++;
        int start = input.mark();
        try {
            synpred39_fragment(); // can never throw exception
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
    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred25() {
        backtracking++;
        int start = input.mark();
        try {
            synpred25_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleCommand_in_ruleAbstractBlock1286 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAbstractBlock1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct_in_ruleAbstractBlock1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleAbstractBlock1355 = new BitSet(new long[]{0x00078005E3000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1376 = new BitSet(new long[]{0x00078005E3000010L});
    public static final BitSet FOLLOW_25_in_ruleAbstractBlock1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleCommand1484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1524 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommand1534 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1597 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCommand1607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1629 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommand1639 = new BitSet(new long[]{0x00000200008800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1661 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCommand1672 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1693 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCommand1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1748 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand1758 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommand1810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1832 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommand1842 = new BitSet(new long[]{0x00000200002800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1864 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCommand1875 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1896 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCommand1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCommand1940 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCommand1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstruct_in_entryRuleConstruct2050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstruct2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleConstruct2108 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstruct2118 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleConstruct2139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstruct2149 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleConstruct2170 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleConstruct2189 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleConstruct2223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleConstruct2255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleConstruct2265 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleConstruct2286 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleConstruct2296 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleConstruct2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration2410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression2468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleExpression2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleExpression2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_entryRuleMathExpression2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMathExpression2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleMathExpression2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition2686 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2746 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleAddition2770 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_36_in_ruleAddition2800 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2823 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2921 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_37_in_ruleMultiplication2945 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_38_in_ruleMultiplication2975 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2998 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression3036 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression3082 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_ruleMathExpression_in_rulePrimaryExpression3107 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericValue_in_rulePrimaryExpression3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolean_in_ruleCondition3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolean_in_entryRuleBinaryBoolean3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolean3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolean_in_ruleBinaryBoolean3389 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleBinaryBoolean3413 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_40_in_ruleBinaryBoolean3443 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleUnaryBoolean_in_ruleBinaryBoolean3466 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolean_in_entryRuleUnaryBoolean3504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryBoolean3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleUnaryBoolean3550 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryBoolean3575 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleUnaryBoolean3584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleUnaryBoolean3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleUnaryBoolean3656 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleUnaryBoolean3677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnaryBoolean3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleUnaryBoolean3752 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_42_in_ruleUnaryBoolean3775 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_43_in_ruleUnaryBoolean3805 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_44_in_ruleUnaryBoolean3835 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_45_in_ruleUnaryBoolean3865 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_46_in_ruleUnaryBoolean3895 = new BitSet(new long[]{0x00000000000800D0L});
    public static final BitSet FOLLOW_ruleMathExpression_in_ruleUnaryBoolean3918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumericValue_in_entryRuleNumericValue3958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumericValue3969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumericValue4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleNumericValue4035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleType4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleType4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleType4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleType4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_synpred1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventSection_in_synpred2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_synpred3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_synpred252189 = new BitSet(new long[]{0x00078005E1000010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_synpred252223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMathExpression_in_synpred272528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_synpred353413 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_40_in_synpred353443 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleUnaryBoolean_in_synpred353466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_synpred363550 = new BitSet(new long[]{0x00000200000800F0L});
    public static final BitSet FOLLOW_ruleCondition_in_synpred363575 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_synpred363584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred393719 = new BitSet(new long[]{0x0000000000000002L});

}
