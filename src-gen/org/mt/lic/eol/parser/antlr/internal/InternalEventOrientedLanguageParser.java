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
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.mt.lic.eol.services.EventOrientedLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventOrientedLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_BOOL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init:'", "'end'", "'globals:'", "';'", "'events:'", "'handlers:'", "'('", "','", "')'", "'{'", "'}'", "'='", "'+='", "'-='", "'raise'", "'out'", "'in'", "'+'", "'-'", "'*'", "'/'", "'int'", "'real'", "'bool'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=8;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_BOOL=7;
    public static final int RULE_INT=5;
    public static final int RULE_REAL=6;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalEventOrientedLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g"; }



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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:78:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:79:2: (iv_ruleProgram= ruleProgram EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:80:2: iv_ruleProgram= ruleProgram EOF
            {
             currentNode = createCompositeNode(grammarAccess.getProgramRule(), currentNode); 
            pushFollow(FOLLOW_ruleProgram_in_entryRuleProgram75);
            iv_ruleProgram=ruleProgram();
            _fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProgram85); 

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
    // $ANTLR end entryRuleProgram


    // $ANTLR start ruleProgram
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:87:1: ruleProgram returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_globals_1_0 = null;

        EObject lv_events_2_0 = null;

        EObject lv_handlers_3_0 = null;

        EObject lv_init_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:92:6: ( ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:1: ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:1: ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:2: ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleAbstractBlock ) ) 'end'
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:2: ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:95:1: ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:95:1: ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:96:2: ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getProgramAccess().getUnorderedGroup_0());
            	
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:99:2: ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:100:3: ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )*
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:100:3: ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )*
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
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:102:4: ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:102:4: ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:103:5: {...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleProgram", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0)");
            	    }
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:103:104: ( ( (lv_globals_1_0= ruleGlobalSection ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:104:6: ( (lv_globals_1_0= ruleGlobalSection ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0);
            	    	 				
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:107:6: ( (lv_globals_1_0= ruleGlobalSection ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:108:1: (lv_globals_1_0= ruleGlobalSection )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:108:1: (lv_globals_1_0= ruleGlobalSection )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:109:3: lv_globals_1_0= ruleGlobalSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getGlobalsGlobalSectionParserRuleCall_0_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleGlobalSection_in_ruleProgram173);
            	    lv_globals_1_0=ruleGlobalSection();
            	    _fsp--;


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgramAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:138:4: ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:138:4: ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:139:5: {...}? => ( ( (lv_events_2_0= ruleEventSection ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleProgram", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1)");
            	    }
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:139:104: ( ( (lv_events_2_0= ruleEventSection ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:140:6: ( (lv_events_2_0= ruleEventSection ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1);
            	    	 				
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:143:6: ( (lv_events_2_0= ruleEventSection ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:144:1: (lv_events_2_0= ruleEventSection )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:144:1: (lv_events_2_0= ruleEventSection )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:145:3: lv_events_2_0= ruleEventSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getEventsEventSectionParserRuleCall_0_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventSection_in_ruleProgram244);
            	    lv_events_2_0=ruleEventSection();
            	    _fsp--;


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getProgramAccess().getUnorderedGroup_0());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:174:4: ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:174:4: ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:175:5: {...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleProgram", "getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2)");
            	    }
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:175:104: ( ( (lv_handlers_3_0= ruleHandlerSection ) ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:176:6: ( (lv_handlers_3_0= ruleHandlerSection ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2);
            	    	 				
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:179:6: ( (lv_handlers_3_0= ruleHandlerSection ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:180:1: (lv_handlers_3_0= ruleHandlerSection )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:180:1: (lv_handlers_3_0= ruleHandlerSection )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:181:3: lv_handlers_3_0= ruleHandlerSection
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getHandlersHandlerSectionParserRuleCall_0_2_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleHandlerSection_in_ruleProgram315);
            	    lv_handlers_3_0=ruleHandlerSection();
            	    _fsp--;


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

            match(input,13,FOLLOW_13_in_ruleProgram364); 

                    createLeafNode(grammarAccess.getProgramAccess().getInitKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:221:1: ( (lv_init_5_0= ruleAbstractBlock ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:222:1: (lv_init_5_0= ruleAbstractBlock )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:222:1: (lv_init_5_0= ruleAbstractBlock )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:223:3: lv_init_5_0= ruleAbstractBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getInitAbstractBlockParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleProgram385);
            lv_init_5_0=ruleAbstractBlock();
            _fsp--;


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

            match(input,14,FOLLOW_14_in_ruleProgram395); 

                    createLeafNode(grammarAccess.getProgramAccess().getEndKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleProgram


    // $ANTLR start entryRuleGlobalSection
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:257:1: entryRuleGlobalSection returns [EObject current=null] : iv_ruleGlobalSection= ruleGlobalSection EOF ;
    public final EObject entryRuleGlobalSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalSection = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:258:2: (iv_ruleGlobalSection= ruleGlobalSection EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:259:2: iv_ruleGlobalSection= ruleGlobalSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getGlobalSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleGlobalSection_in_entryRuleGlobalSection431);
            iv_ruleGlobalSection=ruleGlobalSection();
            _fsp--;

             current =iv_ruleGlobalSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalSection441); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:266:1: ruleGlobalSection returns [EObject current=null] : ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ ) ;
    public final EObject ruleGlobalSection() throws RecognitionException {
        EObject current = null;

        EObject lv_globals_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:271:6: ( ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:272:1: ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:272:1: ( 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:272:3: 'globals:' ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+
            {
            match(input,15,FOLLOW_15_in_ruleGlobalSection476); 

                    createLeafNode(grammarAccess.getGlobalSectionAccess().getGlobalsKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:276:1: ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=34 && LA2_0<=36)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:276:2: ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';'
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:276:2: ( (lv_globals_1_0= ruleVariableDeclaration ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:277:1: (lv_globals_1_0= ruleVariableDeclaration )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:277:1: (lv_globals_1_0= ruleVariableDeclaration )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:278:3: lv_globals_1_0= ruleVariableDeclaration
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getGlobalSectionAccess().getGlobalsVariableDeclarationParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleGlobalSection498);
            	    lv_globals_1_0=ruleVariableDeclaration();
            	    _fsp--;


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

            	    match(input,16,FOLLOW_16_in_ruleGlobalSection508); 

            	            createLeafNode(grammarAccess.getGlobalSectionAccess().getSemicolonKeyword_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:312:1: entryRuleEventSection returns [EObject current=null] : iv_ruleEventSection= ruleEventSection EOF ;
    public final EObject entryRuleEventSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSection = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:313:2: (iv_ruleEventSection= ruleEventSection EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:314:2: iv_ruleEventSection= ruleEventSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventSection_in_entryRuleEventSection546);
            iv_ruleEventSection=ruleEventSection();
            _fsp--;

             current =iv_ruleEventSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventSection556); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:321:1: ruleEventSection returns [EObject current=null] : ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ ) ;
    public final EObject ruleEventSection() throws RecognitionException {
        EObject current = null;

        EObject lv_events_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:326:6: ( ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:327:1: ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:327:1: ( 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:327:3: 'events:' ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+
            {
            match(input,17,FOLLOW_17_in_ruleEventSection591); 

                    createLeafNode(grammarAccess.getEventSectionAccess().getEventsKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:331:1: ( ( (lv_events_1_0= ruleEventDecl ) ) ';' )+
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
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:331:2: ( (lv_events_1_0= ruleEventDecl ) ) ';'
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:331:2: ( (lv_events_1_0= ruleEventDecl ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:332:1: (lv_events_1_0= ruleEventDecl )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:332:1: (lv_events_1_0= ruleEventDecl )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:333:3: lv_events_1_0= ruleEventDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEventSectionAccess().getEventsEventDeclParserRuleCall_1_0_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleEventDecl_in_ruleEventSection613);
            	    lv_events_1_0=ruleEventDecl();
            	    _fsp--;


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

            	    match(input,16,FOLLOW_16_in_ruleEventSection623); 

            	            createLeafNode(grammarAccess.getEventSectionAccess().getSemicolonKeyword_1_1(), null); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:367:1: entryRuleHandlerSection returns [EObject current=null] : iv_ruleHandlerSection= ruleHandlerSection EOF ;
    public final EObject entryRuleHandlerSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerSection = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:368:2: (iv_ruleHandlerSection= ruleHandlerSection EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:369:2: iv_ruleHandlerSection= ruleHandlerSection EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHandlerSectionRule(), currentNode); 
            pushFollow(FOLLOW_ruleHandlerSection_in_entryRuleHandlerSection661);
            iv_ruleHandlerSection=ruleHandlerSection();
            _fsp--;

             current =iv_ruleHandlerSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerSection671); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:376:1: ruleHandlerSection returns [EObject current=null] : ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ ) ;
    public final EObject ruleHandlerSection() throws RecognitionException {
        EObject current = null;

        EObject lv_handlers_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:381:6: ( ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:382:1: ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:382:1: ( 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+ )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:382:3: 'handlers:' ( (lv_handlers_1_0= ruleHandlerDecl ) )+
            {
            match(input,18,FOLLOW_18_in_ruleHandlerSection706); 

                    createLeafNode(grammarAccess.getHandlerSectionAccess().getHandlersKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:386:1: ( (lv_handlers_1_0= ruleHandlerDecl ) )+
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
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:387:1: (lv_handlers_1_0= ruleHandlerDecl )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:387:1: (lv_handlers_1_0= ruleHandlerDecl )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:388:3: lv_handlers_1_0= ruleHandlerDecl
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getHandlerSectionAccess().getHandlersHandlerDeclParserRuleCall_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleHandlerDecl_in_ruleHandlerSection727);
            	    lv_handlers_1_0=ruleHandlerDecl();
            	    _fsp--;


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


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:418:1: entryRuleEventDecl returns [EObject current=null] : iv_ruleEventDecl= ruleEventDecl EOF ;
    public final EObject entryRuleEventDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDecl = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:419:2: (iv_ruleEventDecl= ruleEventDecl EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:420:2: iv_ruleEventDecl= ruleEventDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventDecl_in_entryRuleEventDecl764);
            iv_ruleEventDecl=ruleEventDecl();
            _fsp--;

             current =iv_ruleEventDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDecl774); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:427:1: ruleEventDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ) ;
    public final EObject ruleEventDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:432:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')'
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:434:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:434:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:435:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDecl816); 

            			createLeafNode(grammarAccess.getEventDeclAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

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

            match(input,19,FOLLOW_19_in_ruleEventDecl831); 

                    createLeafNode(grammarAccess.getEventDeclAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:461:1: ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=34 && LA6_0<=36)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:461:2: ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:461:2: ( (lv_params_2_0= ruleVariableDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:462:1: (lv_params_2_0= ruleVariableDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:462:1: (lv_params_2_0= ruleVariableDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:463:3: lv_params_2_0= ruleVariableDeclaration
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEventDeclAccess().getParamsVariableDeclarationParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleEventDecl853);
                    lv_params_2_0=ruleVariableDeclaration();
                    _fsp--;


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

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:485:2: ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:485:4: ',' ( (lv_params_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleEventDecl864); 

                    	            createLeafNode(grammarAccess.getEventDeclAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:489:1: ( (lv_params_4_0= ruleVariableDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:490:1: (lv_params_4_0= ruleVariableDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:490:1: (lv_params_4_0= ruleVariableDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:491:3: lv_params_4_0= ruleVariableDeclaration
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEventDeclAccess().getParamsVariableDeclarationParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleEventDecl885);
                    	    lv_params_4_0=ruleVariableDeclaration();
                    	    _fsp--;


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
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleEventDecl899); 

                    createLeafNode(grammarAccess.getEventDeclAccess().getRightParenthesisKeyword_3(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:525:1: entryRuleHandlerDecl returns [EObject current=null] : iv_ruleHandlerDecl= ruleHandlerDecl EOF ;
    public final EObject entryRuleHandlerDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerDecl = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:526:2: (iv_ruleHandlerDecl= ruleHandlerDecl EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:527:2: iv_ruleHandlerDecl= ruleHandlerDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHandlerDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl935);
            iv_ruleHandlerDecl=ruleHandlerDecl();
            _fsp--;

             current =iv_ruleHandlerDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerDecl945); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:534:1: ruleHandlerDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) ) ;
    public final EObject ruleHandlerDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:539:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:540:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:540:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:540:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:540:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:541:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:541:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:542:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHandlerDecl987); 

            			createLeafNode(grammarAccess.getHandlerDeclAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

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

            match(input,19,FOLLOW_19_in_ruleHandlerDecl1002); 

                    createLeafNode(grammarAccess.getHandlerDeclAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:568:1: ( ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=34 && LA8_0<=36)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:568:2: ( (lv_params_2_0= ruleVariableDeclaration ) ) ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:568:2: ( (lv_params_2_0= ruleVariableDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:569:1: (lv_params_2_0= ruleVariableDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:569:1: (lv_params_2_0= ruleVariableDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:570:3: lv_params_2_0= ruleVariableDeclaration
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getParamsVariableDeclarationParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1024);
                    lv_params_2_0=ruleVariableDeclaration();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
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

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:592:2: ( ',' ( (lv_params_4_0= ruleVariableDeclaration ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:592:4: ',' ( (lv_params_4_0= ruleVariableDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleHandlerDecl1035); 

                    	            createLeafNode(grammarAccess.getHandlerDeclAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:596:1: ( (lv_params_4_0= ruleVariableDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:597:1: (lv_params_4_0= ruleVariableDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:597:1: (lv_params_4_0= ruleVariableDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:598:3: lv_params_4_0= ruleVariableDeclaration
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getParamsVariableDeclarationParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1056);
                    	    lv_params_4_0=ruleVariableDeclaration();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
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
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleHandlerDecl1070); 

                    createLeafNode(grammarAccess.getHandlerDeclAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:624:1: ( (lv_body_6_0= ruleAbstractBlock ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:625:1: (lv_body_6_0= ruleAbstractBlock )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:625:1: (lv_body_6_0= ruleAbstractBlock )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:626:3: lv_body_6_0= ruleAbstractBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getBodyAbstractBlockParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleHandlerDecl1091);
            lv_body_6_0=ruleAbstractBlock();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getHandlerDeclRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"body",
            	        		lv_body_6_0, 
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:656:1: entryRuleAbstractBlock returns [EObject current=null] : iv_ruleAbstractBlock= ruleAbstractBlock EOF ;
    public final EObject entryRuleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBlock = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:657:2: (iv_ruleAbstractBlock= ruleAbstractBlock EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:658:2: iv_ruleAbstractBlock= ruleAbstractBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractBlock_in_entryRuleAbstractBlock1127);
            iv_ruleAbstractBlock=ruleAbstractBlock();
            _fsp--;

             current =iv_ruleAbstractBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBlock1137); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:665:1: ruleAbstractBlock returns [EObject current=null] : ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) ) ;
    public final EObject ruleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject lv_body_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:670:6: ( ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:671:1: ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:671:1: ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=27 && LA10_0<=29)||(LA10_0>=34 && LA10_0<=36)) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("671:1: ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:671:2: (this_Command_0= ruleCommand ';' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:671:2: (this_Command_0= ruleCommand ';' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:672:5: this_Command_0= ruleCommand ';'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getCommandParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleAbstractBlock1185);
                    this_Command_0=ruleCommand();
                    _fsp--;

                     
                            current = this_Command_0; 
                            currentNode = currentNode.getParent();
                        
                    match(input,16,FOLLOW_16_in_ruleAbstractBlock1194); 

                            createLeafNode(grammarAccess.getAbstractBlockAccess().getSemicolonKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:685:6: ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:685:6: ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:685:7: () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:685:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:686:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getAbstractBlockAccess().getCompoundAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getAbstractBlockAccess().getCompoundAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,22,FOLLOW_22_in_ruleAbstractBlock1221); 

                            createLeafNode(grammarAccess.getAbstractBlockAccess().getLeftCurlyBracketKeyword_1_1(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:700:1: ( (lv_body_4_0= ruleAbstractBlock ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==22||(LA9_0>=27 && LA9_0<=29)||(LA9_0>=34 && LA9_0<=36)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:701:1: (lv_body_4_0= ruleAbstractBlock )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:701:1: (lv_body_4_0= ruleAbstractBlock )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:702:3: lv_body_4_0= ruleAbstractBlock
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getBodyAbstractBlockParserRuleCall_1_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1242);
                    	    lv_body_4_0=ruleAbstractBlock();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getAbstractBlockRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"body",
                    	    	        		lv_body_4_0, 
                    	    	        		"AbstractBlock", 
                    	    	        		currentNode);
                    	    	        } catch (ValueConverterException vce) {
                    	    				handleValueConverterException(vce);
                    	    	        }
                    	    	        currentNode = currentNode.getParent();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match(input,23,FOLLOW_23_in_ruleAbstractBlock1253); 

                            createLeafNode(grammarAccess.getAbstractBlockAccess().getRightCurlyBracketKeyword_1_3(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:736:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:737:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:738:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1290);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1300); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:745:1: ruleCommand returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_23_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject lv_value_4_0 = null;

        EObject lv_params_17_0 = null;

        EObject lv_params_19_0 = null;

        EObject lv_output_23_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:750:6: ( (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_23_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:751:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_23_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:751:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_23_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt13=4;
                    }
                    break;
                case 24:
                    {
                    alt13=2;
                    }
                    break;
                case 25:
                    {
                    alt13=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("751:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_23_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 13, 2, input);

                    throw nvae;
                }

                }
                break;
            case 27:
                {
                alt13=5;
                }
                break;
            case 28:
                {
                alt13=6;
                }
                break;
            case 29:
                {
                alt13=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("751:1: (this_VariableDeclaration_0= ruleVariableDeclaration | ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) ) | ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) | ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) | ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' ) | ( () 'out' ( (lv_output_23_0= ruleExpression ) ) ) | ( () 'in' ( ( RULE_ID ) ) ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:752:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableDeclarationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleCommand1347);
                    this_VariableDeclaration_0=ruleVariableDeclaration();
                    _fsp--;

                     
                            current = this_VariableDeclaration_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:761:6: ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:761:6: ( () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:761:7: () ( ( RULE_ID ) ) '=' ( (lv_value_4_0= ruleExpression ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:761:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:762:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCommandAccess().getVariableAssignAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getVariableAssignAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:772:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:773:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:773:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:774:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1380); 

                    		createLeafNode(grammarAccess.getCommandAccess().getNameVariableDeclarationCrossReference_1_1_0(), "name"); 
                    	

                    }


                    }

                    match(input,24,FOLLOW_24_in_ruleCommand1390); 

                            createLeafNode(grammarAccess.getCommandAccess().getEqualsSignKeyword_1_2(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:790:1: ( (lv_value_4_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:791:1: (lv_value_4_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:791:1: (lv_value_4_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:792:3: lv_value_4_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getValueExpressionParserRuleCall_1_3_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1411);
                    lv_value_4_0=ruleExpression();
                    _fsp--;


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
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:815:6: ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:815:6: ( () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:815:7: () ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:815:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:816:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCommandAccess().getBindHandlerAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getBindHandlerAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:826:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:827:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:827:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:828:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1446); 

                    		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_2_1_0(), "eventName"); 
                    	

                    }


                    }

                    match(input,25,FOLLOW_25_in_ruleCommand1456); 

                            createLeafNode(grammarAccess.getCommandAccess().getPlusSignEqualsSignKeyword_2_2(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:844:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:845:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:845:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:846:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1474); 

                    		createLeafNode(grammarAccess.getCommandAccess().getHandlerNameHandlerDeclCrossReference_2_3_0(), "handlerName"); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:859:6: ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:859:6: ( () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:859:7: () ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:859:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:860:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCommandAccess().getUnbindHandlerAction_3_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getUnbindHandlerAction_3_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:870:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:871:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:871:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:872:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1509); 

                    		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_3_1_0(), "eventName"); 
                    	

                    }


                    }

                    match(input,26,FOLLOW_26_in_ruleCommand1519); 

                            createLeafNode(grammarAccess.getCommandAccess().getHyphenMinusEqualsSignKeyword_3_2(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:888:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:889:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:889:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:890:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1537); 

                    		createLeafNode(grammarAccess.getCommandAccess().getHandlerNameHandlerDeclCrossReference_3_3_0(), "handlerName"); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:903:6: ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:903:6: ( () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:903:7: () 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )? ')'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:903:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:904:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCommandAccess().getRaiseEventAction_4_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getRaiseEventAction_4_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,27,FOLLOW_27_in_ruleCommand1564); 

                            createLeafNode(grammarAccess.getCommandAccess().getRaiseKeyword_4_1(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:918:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:919:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:919:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:920:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1582); 

                    		createLeafNode(grammarAccess.getCommandAccess().getEventNameEventDeclCrossReference_4_2_0(), "eventName"); 
                    	

                    }


                    }

                    match(input,19,FOLLOW_19_in_ruleCommand1592); 

                            createLeafNode(grammarAccess.getCommandAccess().getLeftParenthesisKeyword_4_3(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:936:1: ( ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_BOOL)||LA12_0==19) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:936:2: ( (lv_params_17_0= ruleExpression ) ) ( ',' ( (lv_params_19_0= ruleExpression ) ) )*
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:936:2: ( (lv_params_17_0= ruleExpression ) )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:937:1: (lv_params_17_0= ruleExpression )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:937:1: (lv_params_17_0= ruleExpression )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:938:3: lv_params_17_0= ruleExpression
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getParamsExpressionParserRuleCall_4_4_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleExpression_in_ruleCommand1614);
                            lv_params_17_0=ruleExpression();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"params",
                            	        		lv_params_17_0, 
                            	        		"Expression", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }

                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:960:2: ( ',' ( (lv_params_19_0= ruleExpression ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==20) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:960:4: ',' ( (lv_params_19_0= ruleExpression ) )
                            	    {
                            	    match(input,20,FOLLOW_20_in_ruleCommand1625); 

                            	            createLeafNode(grammarAccess.getCommandAccess().getCommaKeyword_4_4_1_0(), null); 
                            	        
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:964:1: ( (lv_params_19_0= ruleExpression ) )
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:965:1: (lv_params_19_0= ruleExpression )
                            	    {
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:965:1: (lv_params_19_0= ruleExpression )
                            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:966:3: lv_params_19_0= ruleExpression
                            	    {
                            	     
                            	    	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getParamsExpressionParserRuleCall_4_4_1_1_0(), currentNode); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1646);
                            	    lv_params_19_0=ruleExpression();
                            	    _fsp--;


                            	    	        if (current==null) {
                            	    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	    	        }
                            	    	        try {
                            	    	       		add(
                            	    	       			current, 
                            	    	       			"params",
                            	    	        		lv_params_19_0, 
                            	    	        		"Expression", 
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


                            }
                            break;

                    }

                    match(input,21,FOLLOW_21_in_ruleCommand1660); 

                            createLeafNode(grammarAccess.getCommandAccess().getRightParenthesisKeyword_4_5(), null); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:993:6: ( () 'out' ( (lv_output_23_0= ruleExpression ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:993:6: ( () 'out' ( (lv_output_23_0= ruleExpression ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:993:7: () 'out' ( (lv_output_23_0= ruleExpression ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:993:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:994:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCommandAccess().getPrintOutputAction_5_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getPrintOutputAction_5_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,28,FOLLOW_28_in_ruleCommand1687); 

                            createLeafNode(grammarAccess.getCommandAccess().getOutKeyword_5_1(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1008:1: ( (lv_output_23_0= ruleExpression ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1009:1: (lv_output_23_0= ruleExpression )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1009:1: (lv_output_23_0= ruleExpression )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1010:3: lv_output_23_0= ruleExpression
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getCommandAccess().getOutputExpressionParserRuleCall_5_2_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleExpression_in_ruleCommand1708);
                    lv_output_23_0=ruleExpression();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"output",
                    	        		lv_output_23_0, 
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
                case 7 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1033:6: ( () 'in' ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1033:6: ( () 'in' ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1033:7: () 'in' ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1033:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1034:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getCommandAccess().getReadInputAction_6_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getCommandAccess().getReadInputAction_6_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    match(input,29,FOLLOW_29_in_ruleCommand1735); 

                            createLeafNode(grammarAccess.getCommandAccess().getInKeyword_6_1(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1048:1: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1049:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1049:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1050:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getCommandRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCommand1753); 

                    		createLeafNode(grammarAccess.getCommandAccess().getInputVariableDeclarationCrossReference_6_2_0(), "input"); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1070:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1071:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1072:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1790);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1800); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1079:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1084:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1085:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1085:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1085:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1085:2: ( (lv_type_0_0= ruleType ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1086:1: (lv_type_0_0= ruleType )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1086:1: (lv_type_0_0= ruleType )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1087:3: lv_type_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration1846);
            lv_type_0_0=ruleType();
            _fsp--;


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

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1109:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1110:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1110:1: (lv_name_1_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1111:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1863); 

            			createLeafNode(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1141:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1142:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1143:2: iv_ruleExpression= ruleExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getExpressionRule(), currentNode); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1904);
            iv_ruleExpression=ruleExpression();
            _fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1914); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1150:1: ruleExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1155:6: (this_Addition_0= ruleAddition )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1157:5: this_Addition_0= ruleAddition
            {
             
                    currentNode=createCompositeNode(grammarAccess.getExpressionAccess().getAdditionParserRuleCall(), currentNode); 
                
            pushFollow(FOLLOW_ruleAddition_in_ruleExpression1960);
            this_Addition_0=ruleAddition();
            _fsp--;

             
                    current = this_Addition_0; 
                    currentNode = currentNode.getParent();
                

            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleAddition
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1173:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1174:2: (iv_ruleAddition= ruleAddition EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1175:2: iv_ruleAddition= ruleAddition EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAdditionRule(), currentNode); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1994);
            iv_ruleAddition=ruleAddition();
            _fsp--;

             current =iv_ruleAddition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition2004); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1182:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:6: ( (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: (this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1189:5: this_Multiplication_0= ruleMultiplication ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2051);
            this_Multiplication_0=ruleMultiplication();
            _fsp--;

             
                    current = this_Multiplication_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:1: ( ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=30 && LA15_0<=31)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:2: ( ( () '+' ) | ( () '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:2: ( ( () '+' ) | ( () '-' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==30) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==31) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1197:2: ( ( () '+' ) | ( () '-' ) )", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:3: ( () '+' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:3: ( () '+' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:4: () '+'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1198:5: 
            	            {
            	             
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

            	            match(input,30,FOLLOW_30_in_ruleAddition2072); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1218:6: ( () '-' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1218:6: ( () '-' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1218:7: () '-'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1218:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1219:5: 
            	            {
            	             
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

            	            match(input,31,FOLLOW_31_in_ruleAddition2099); 

            	                    createLeafNode(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1238:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1239:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1239:1: (lv_right_5_0= ruleMultiplication )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1240:3: lv_right_5_0= ruleMultiplication
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2122);
            	    lv_right_5_0=ruleMultiplication();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1270:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1271:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1272:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
             currentNode = createCompositeNode(grammarAccess.getMultiplicationRule(), currentNode); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2160);
            iv_ruleMultiplication=ruleMultiplication();
            _fsp--;

             current =iv_ruleMultiplication; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2170); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1279:1: ruleMultiplication returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1284:6: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1285:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1285:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1286:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
             
                    currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getPrimaryExpressionParserRuleCall_0(), currentNode); 
                
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2217);
            this_PrimaryExpression_0=rulePrimaryExpression();
            _fsp--;

             
                    current = this_PrimaryExpression_0; 
                    currentNode = currentNode.getParent();
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:1: ( ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=32 && LA17_0<=33)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:2: ( ( () '*' ) | ( () '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:2: ( ( () '*' ) | ( () '/' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==32) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==33) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("1294:2: ( ( () '*' ) | ( () '/' ) )", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:3: ( () '*' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:3: ( () '*' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:4: () '*'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1294:4: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1295:5: 
            	            {
            	             
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

            	            match(input,32,FOLLOW_32_in_ruleMultiplication2238); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1(), null); 
            	                

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1315:6: ( () '/' )
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1315:6: ( () '/' )
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1315:7: () '/'
            	            {
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1315:7: ()
            	            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1316:5: 
            	            {
            	             
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

            	            match(input,33,FOLLOW_33_in_ruleMultiplication2265); 

            	                    createLeafNode(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1(), null); 
            	                

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1335:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1336:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1336:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1337:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getMultiplicationAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMultiplication2288);
            	    lv_right_5_0=rulePrimaryExpression();
            	    _fsp--;


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
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1367:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1368:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrimaryExpressionRule(), currentNode); 
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2326);
            iv_rulePrimaryExpression=rulePrimaryExpression();
            _fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2336); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1376:1: rulePrimaryExpression returns [EObject current=null] : ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_1 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1381:6: ( ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt18=1;
                }
                break;
            case RULE_INT:
            case RULE_REAL:
            case RULE_BOOL:
                {
                alt18=2;
                }
                break;
            case RULE_ID:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1382:1: ( ( '(' this_Expression_1= ruleExpression ')' ) | ( () ( (lv_value_4_0= ruleValue ) ) ) | ( () ( ( RULE_ID ) ) ) )", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:2: ( '(' this_Expression_1= ruleExpression ')' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:2: ( '(' this_Expression_1= ruleExpression ')' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1382:4: '(' this_Expression_1= ruleExpression ')'
                    {
                    match(input,19,FOLLOW_19_in_rulePrimaryExpression2372); 

                            createLeafNode(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0(), null); 
                        
                     
                            currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression2394);
                    this_Expression_1=ruleExpression();
                    _fsp--;

                     
                            current = this_Expression_1; 
                            currentNode = currentNode.getParent();
                        
                    match(input,21,FOLLOW_21_in_rulePrimaryExpression2403); 

                            createLeafNode(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1400:6: ( () ( (lv_value_4_0= ruleValue ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1400:6: ( () ( (lv_value_4_0= ruleValue ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1400:7: () ( (lv_value_4_0= ruleValue ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1400:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1401:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberLiteralAction_1_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1411:2: ( (lv_value_4_0= ruleValue ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1412:1: (lv_value_4_0= ruleValue )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1412:1: (lv_value_4_0= ruleValue )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1413:3: lv_value_4_0= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getValueValueParserRuleCall_1_1_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_rulePrimaryExpression2441);
                    lv_value_4_0=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimaryExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		set(
                    	       			current, 
                    	       			"value",
                    	        		lv_value_4_0, 
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
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1436:6: ( () ( ( RULE_ID ) ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1436:6: ( () ( ( RULE_ID ) ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1436:7: () ( ( RULE_ID ) )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1436:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1437:5: 
                    {
                     
                            temp=factory.create(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_2_0().getType().getClassifier());
                            current = temp; 
                            temp = null;
                            CompositeNode newNode = createCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceAction_2_0(), currentNode.getParent());
                        newNode.getChildren().add(currentNode);
                        moveLookaheadInfo(currentNode, newNode);
                        currentNode = newNode; 
                            associateNodeWithAstElement(currentNode, current); 
                        

                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1447:2: ( ( RULE_ID ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1448:1: ( RULE_ID )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1448:1: ( RULE_ID )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1449:3: RULE_ID
                    {

                    			if (current==null) {
                    	            current = factory.create(grammarAccess.getPrimaryExpressionRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode, current);
                    	        }
                            
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimaryExpression2476); 

                    		createLeafNode(grammarAccess.getPrimaryExpressionAccess().getVarVariableDeclarationCrossReference_2_1_0(), "var"); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1469:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1470:2: (iv_ruleValue= ruleValue EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1471:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2514);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2525); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1478:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_REAL_1=null;
        Token this_BOOL_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1483:6: ( (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1484:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1484:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL )
            int alt19=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt19=1;
                }
                break;
            case RULE_REAL:
                {
                alt19=2;
                }
                break;
            case RULE_BOOL:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1484:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL )", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1484:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue2565); 

                    		current.merge(this_INT_0);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getINTTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1492:10: this_REAL_1= RULE_REAL
                    {
                    this_REAL_1=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleValue2591); 

                    		current.merge(this_REAL_1);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getREALTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1500:10: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)input.LT(1);
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleValue2617); 

                    		current.merge(this_BOOL_2);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getBOOLTerminalRuleCall_2(), null); 
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
            	    lastConsumedNode = currentNode;
                
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1515:1: ruleType returns [Enumerator current=null] : ( ( 'int' ) | ( 'real' ) | ( 'bool' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1519:6: ( ( ( 'int' ) | ( 'real' ) | ( 'bool' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1520:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1520:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt20=1;
                }
                break;
            case 35:
                {
                alt20=2;
                }
                break;
            case 36:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1520:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1520:2: ( 'int' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1520:2: ( 'int' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1520:4: 'int'
                    {
                    match(input,34,FOLLOW_34_in_ruleType2674); 

                            current = grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1526:6: ( 'real' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1526:6: ( 'real' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1526:8: 'real'
                    {
                    match(input,35,FOLLOW_35_in_ruleType2689); 

                            current = grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1532:6: ( 'bool' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1532:6: ( 'bool' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1532:8: 'bool'
                    {
                    match(input,36,FOLLOW_36_in_ruleType2704); 

                            current = grammarAccess.getTypeAccess().getT_BOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getT_BOOLEnumLiteralDeclaration_2(), null); 
                        

                    }


                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


 

    public static final BitSet FOLLOW_ruleProgram_in_entryRuleProgram75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProgram85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_ruleProgram173 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_ruleEventSection_in_ruleProgram244 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_ruleProgram315 = new BitSet(new long[]{0x000000000006A000L});
    public static final BitSet FOLLOW_13_in_ruleProgram364 = new BitSet(new long[]{0x0000001C38400010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleProgram385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_entryRuleGlobalSection431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalSection441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGlobalSection476 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalSection498 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGlobalSection508 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ruleEventSection_in_entryRuleEventSection546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSection556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEventSection591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventDecl_in_ruleEventSection613 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEventSection623 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_entryRuleHandlerSection661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerSection671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHandlerSection706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_ruleHandlerSection727 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleEventDecl_in_entryRuleEventDecl764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDecl774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDecl816 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEventDecl831 = new BitSet(new long[]{0x0000001C00200000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleEventDecl853 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleEventDecl864 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleEventDecl885 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleEventDecl899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDecl945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHandlerDecl987 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHandlerDecl1002 = new BitSet(new long[]{0x0000001C00200000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1024 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleHandlerDecl1035 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHandlerDecl1056 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleHandlerDecl1070 = new BitSet(new long[]{0x0000001C38400010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleHandlerDecl1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_entryRuleAbstractBlock1127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBlock1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleAbstractBlock1185 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAbstractBlock1194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAbstractBlock1221 = new BitSet(new long[]{0x0000001C38C00010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1242 = new BitSet(new long[]{0x0000001C38C00010L});
    public static final BitSet FOLLOW_23_in_ruleAbstractBlock1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleCommand1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1380 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1390 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1446 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1509 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleCommand1519 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommand1564 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1582 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCommand1592 = new BitSet(new long[]{0x00000000002800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1614 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCommand1625 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1646 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCommand1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCommand1687 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleCommand1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommand1735 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCommand1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1790 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1846 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleExpression1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2051 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_30_in_ruleAddition2072 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_31_in_ruleAddition2099 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2122 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2217 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_ruleMultiplication2238 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_33_in_ruleMultiplication2265 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMultiplication2288 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2326 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression2372 = new BitSet(new long[]{0x00000000000800F0L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression2394 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePrimaryExpression2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrimaryExpression2441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimaryExpression2476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2514 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleValue2591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleValue2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleType2704 = new BitSet(new long[]{0x0000000000000002L});

}
