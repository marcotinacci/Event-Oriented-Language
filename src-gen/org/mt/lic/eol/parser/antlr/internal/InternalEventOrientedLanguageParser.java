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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_BOOL", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init:'", "'end'", "'globals:'", "';'", "'events:'", "'handlers:'", "'('", "','", "')'", "'{'", "'}'", "'out'", "'in'", "'+='", "'-='", "'='", "'raise'", "'int'", "'real'", "'bool'"
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

                if ( ((LA2_0>=30 && LA2_0<=32)) ) {
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


    // $ANTLR start entryRuleParamDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:418:1: entryRuleParamDeclaration returns [EObject current=null] : iv_ruleParamDeclaration= ruleParamDeclaration EOF ;
    public final EObject entryRuleParamDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamDeclaration = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:419:2: (iv_ruleParamDeclaration= ruleParamDeclaration EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:420:2: iv_ruleParamDeclaration= ruleParamDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getParamDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleParamDeclaration_in_entryRuleParamDeclaration764);
            iv_ruleParamDeclaration=ruleParamDeclaration();
            _fsp--;

             current =iv_ruleParamDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamDeclaration774); 

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
    // $ANTLR end entryRuleParamDeclaration


    // $ANTLR start ruleParamDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:427:1: ruleParamDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleParamDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:432:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:433:2: ( (lv_type_0_0= ruleType ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:434:1: (lv_type_0_0= ruleType )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:434:1: (lv_type_0_0= ruleType )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:435:3: lv_type_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getParamDeclarationAccess().getTypeTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleParamDeclaration820);
            lv_type_0_0=ruleType();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParamDeclarationRule().getType().getClassifier());
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

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:457:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:458:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:458:1: (lv_name_1_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParamDeclaration837); 

            			createLeafNode(grammarAccess.getParamDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getParamDeclarationRule().getType().getClassifier());
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
    // $ANTLR end ruleParamDeclaration


    // $ANTLR start entryRuleEventDecl
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:489:1: entryRuleEventDecl returns [EObject current=null] : iv_ruleEventDecl= ruleEventDecl EOF ;
    public final EObject entryRuleEventDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventDecl = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:490:2: (iv_ruleEventDecl= ruleEventDecl EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:491:2: iv_ruleEventDecl= ruleEventDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEventDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleEventDecl_in_entryRuleEventDecl878);
            iv_ruleEventDecl=ruleEventDecl();
            _fsp--;

             current =iv_ruleEventDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEventDecl888); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:498:1: ruleEventDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ) ;
    public final EObject ruleEventDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:503:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:504:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:504:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:504:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')'
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:504:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:505:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:505:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:506:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEventDecl930); 

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

            match(input,19,FOLLOW_19_in_ruleEventDecl945); 

                    createLeafNode(grammarAccess.getEventDeclAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:532:1: ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=30 && LA6_0<=32)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:532:2: ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:532:2: ( (lv_params_2_0= ruleParamDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:533:1: (lv_params_2_0= ruleParamDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:533:1: (lv_params_2_0= ruleParamDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:534:3: lv_params_2_0= ruleParamDeclaration
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getEventDeclAccess().getParamsParamDeclarationParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParamDeclaration_in_ruleEventDecl967);
                    lv_params_2_0=ruleParamDeclaration();
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
                    	        		"ParamDeclaration", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:556:2: ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==20) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:556:4: ',' ( (lv_params_4_0= ruleParamDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleEventDecl978); 

                    	            createLeafNode(grammarAccess.getEventDeclAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:560:1: ( (lv_params_4_0= ruleParamDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:561:1: (lv_params_4_0= ruleParamDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:561:1: (lv_params_4_0= ruleParamDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:562:3: lv_params_4_0= ruleParamDeclaration
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getEventDeclAccess().getParamsParamDeclarationParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParamDeclaration_in_ruleEventDecl999);
                    	    lv_params_4_0=ruleParamDeclaration();
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
                    	    	        		"ParamDeclaration", 
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

            match(input,21,FOLLOW_21_in_ruleEventDecl1013); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:596:1: entryRuleHandlerDecl returns [EObject current=null] : iv_ruleHandlerDecl= ruleHandlerDecl EOF ;
    public final EObject entryRuleHandlerDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHandlerDecl = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:597:2: (iv_ruleHandlerDecl= ruleHandlerDecl EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:598:2: iv_ruleHandlerDecl= ruleHandlerDecl EOF
            {
             currentNode = createCompositeNode(grammarAccess.getHandlerDeclRule(), currentNode); 
            pushFollow(FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl1049);
            iv_ruleHandlerDecl=ruleHandlerDecl();
            _fsp--;

             current =iv_ruleHandlerDecl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHandlerDecl1059); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:605:1: ruleHandlerDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) ) ;
    public final EObject ruleHandlerDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:610:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleAbstractBlock ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:612:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:612:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:613:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHandlerDecl1101); 

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

            match(input,19,FOLLOW_19_in_ruleHandlerDecl1116); 

                    createLeafNode(grammarAccess.getHandlerDeclAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:639:1: ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=30 && LA8_0<=32)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:639:2: ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:639:2: ( (lv_params_2_0= ruleParamDeclaration ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:640:1: (lv_params_2_0= ruleParamDeclaration )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:640:1: (lv_params_2_0= ruleParamDeclaration )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:641:3: lv_params_2_0= ruleParamDeclaration
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getParamsParamDeclarationParserRuleCall_2_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleParamDeclaration_in_ruleHandlerDecl1138);
                    lv_params_2_0=ruleParamDeclaration();
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
                    	        		"ParamDeclaration", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:663:2: ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==20) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:663:4: ',' ( (lv_params_4_0= ruleParamDeclaration ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleHandlerDecl1149); 

                    	            createLeafNode(grammarAccess.getHandlerDeclAccess().getCommaKeyword_2_1_0(), null); 
                    	        
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:667:1: ( (lv_params_4_0= ruleParamDeclaration ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:668:1: (lv_params_4_0= ruleParamDeclaration )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:668:1: (lv_params_4_0= ruleParamDeclaration )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:669:3: lv_params_4_0= ruleParamDeclaration
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getParamsParamDeclarationParserRuleCall_2_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleParamDeclaration_in_ruleHandlerDecl1170);
                    	    lv_params_4_0=ruleParamDeclaration();
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
                    	    	        		"ParamDeclaration", 
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

            match(input,21,FOLLOW_21_in_ruleHandlerDecl1184); 

                    createLeafNode(grammarAccess.getHandlerDeclAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:695:1: ( (lv_body_6_0= ruleAbstractBlock ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:696:1: (lv_body_6_0= ruleAbstractBlock )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:696:1: (lv_body_6_0= ruleAbstractBlock )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:697:3: lv_body_6_0= ruleAbstractBlock
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getBodyAbstractBlockParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleAbstractBlock_in_ruleHandlerDecl1205);
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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:727:1: entryRuleAbstractBlock returns [EObject current=null] : iv_ruleAbstractBlock= ruleAbstractBlock EOF ;
    public final EObject entryRuleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractBlock = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:728:2: (iv_ruleAbstractBlock= ruleAbstractBlock EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:729:2: iv_ruleAbstractBlock= ruleAbstractBlock EOF
            {
             currentNode = createCompositeNode(grammarAccess.getAbstractBlockRule(), currentNode); 
            pushFollow(FOLLOW_ruleAbstractBlock_in_entryRuleAbstractBlock1241);
            iv_ruleAbstractBlock=ruleAbstractBlock();
            _fsp--;

             current =iv_ruleAbstractBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractBlock1251); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:736:1: ruleAbstractBlock returns [EObject current=null] : ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) ) ;
    public final EObject ruleAbstractBlock() throws RecognitionException {
        EObject current = null;

        EObject this_Command_0 = null;

        EObject lv_body_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:741:6: ( ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:1: ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:1: ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||(LA10_0>=24 && LA10_0<=25)||(LA10_0>=29 && LA10_0<=32)) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("742:1: ( (this_Command_0= ruleCommand ';' ) | ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' ) )", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:2: (this_Command_0= ruleCommand ';' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:2: (this_Command_0= ruleCommand ';' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:743:5: this_Command_0= ruleCommand ';'
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getCommandParserRuleCall_0_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleCommand_in_ruleAbstractBlock1299);
                    this_Command_0=ruleCommand();
                    _fsp--;

                     
                            current = this_Command_0; 
                            currentNode = currentNode.getParent();
                        
                    match(input,16,FOLLOW_16_in_ruleAbstractBlock1308); 

                            createLeafNode(grammarAccess.getAbstractBlockAccess().getSemicolonKeyword_0_1(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:756:6: ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:756:6: ( () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:756:7: () '{' ( (lv_body_4_0= ruleAbstractBlock ) )* '}'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:756:7: ()
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:757:5: 
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

                    match(input,22,FOLLOW_22_in_ruleAbstractBlock1335); 

                            createLeafNode(grammarAccess.getAbstractBlockAccess().getLeftCurlyBracketKeyword_1_1(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:771:1: ( (lv_body_4_0= ruleAbstractBlock ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==22||(LA9_0>=24 && LA9_0<=25)||(LA9_0>=29 && LA9_0<=32)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:772:1: (lv_body_4_0= ruleAbstractBlock )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:772:1: (lv_body_4_0= ruleAbstractBlock )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:773:3: lv_body_4_0= ruleAbstractBlock
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getAbstractBlockAccess().getBodyAbstractBlockParserRuleCall_1_2_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1356);
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

                    match(input,23,FOLLOW_23_in_ruleAbstractBlock1367); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:807:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:808:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:809:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1404);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1414); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:816:1: ruleCommand returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler | this_RaiseEvent_4= ruleRaiseEvent | this_PrintOutput_5= rulePrintOutput | this_ReadInput_6= ruleReadInput ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_VariableAssign_1 = null;

        EObject this_BindHandler_2 = null;

        EObject this_UnbindHandler_3 = null;

        EObject this_RaiseEvent_4 = null;

        EObject this_PrintOutput_5 = null;

        EObject this_ReadInput_6 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:821:6: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler | this_RaiseEvent_4= ruleRaiseEvent | this_PrintOutput_5= rulePrintOutput | this_ReadInput_6= ruleReadInput ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:822:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler | this_RaiseEvent_4= ruleRaiseEvent | this_PrintOutput_5= rulePrintOutput | this_ReadInput_6= ruleReadInput )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:822:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler | this_RaiseEvent_4= ruleRaiseEvent | this_PrintOutput_5= rulePrintOutput | this_ReadInput_6= ruleReadInput )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 30:
            case 31:
            case 32:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    alt11=3;
                    }
                    break;
                case 27:
                    {
                    alt11=4;
                    }
                    break;
                case 28:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("822:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler | this_RaiseEvent_4= ruleRaiseEvent | this_PrintOutput_5= rulePrintOutput | this_ReadInput_6= ruleReadInput )", 11, 2, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            case 24:
                {
                alt11=6;
                }
                break;
            case 25:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("822:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler | this_RaiseEvent_4= ruleRaiseEvent | this_PrintOutput_5= rulePrintOutput | this_ReadInput_6= ruleReadInput )", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:823:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableDeclarationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleCommand1461);
                    this_VariableDeclaration_0=ruleVariableDeclaration();
                    _fsp--;

                     
                            current = this_VariableDeclaration_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:833:5: this_VariableAssign_1= ruleVariableAssign
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableAssignParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableAssign_in_ruleCommand1488);
                    this_VariableAssign_1=ruleVariableAssign();
                    _fsp--;

                     
                            current = this_VariableAssign_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:843:5: this_BindHandler_2= ruleBindHandler
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBindHandlerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindHandler_in_ruleCommand1515);
                    this_BindHandler_2=ruleBindHandler();
                    _fsp--;

                     
                            current = this_BindHandler_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:853:5: this_UnbindHandler_3= ruleUnbindHandler
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getUnbindHandlerParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnbindHandler_in_ruleCommand1542);
                    this_UnbindHandler_3=ruleUnbindHandler();
                    _fsp--;

                     
                            current = this_UnbindHandler_3; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 5 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:863:5: this_RaiseEvent_4= ruleRaiseEvent
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getRaiseEventParserRuleCall_4(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleRaiseEvent_in_ruleCommand1569);
                    this_RaiseEvent_4=ruleRaiseEvent();
                    _fsp--;

                     
                            current = this_RaiseEvent_4; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 6 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:873:5: this_PrintOutput_5= rulePrintOutput
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getPrintOutputParserRuleCall_5(), currentNode); 
                        
                    pushFollow(FOLLOW_rulePrintOutput_in_ruleCommand1596);
                    this_PrintOutput_5=rulePrintOutput();
                    _fsp--;

                     
                            current = this_PrintOutput_5; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 7 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:883:5: this_ReadInput_6= ruleReadInput
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getReadInputParserRuleCall_6(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleReadInput_in_ruleCommand1623);
                    this_ReadInput_6=ruleReadInput();
                    _fsp--;

                     
                            current = this_ReadInput_6; 
                            currentNode = currentNode.getParent();
                        

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


    // $ANTLR start entryRulePrintOutput
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:899:1: entryRulePrintOutput returns [EObject current=null] : iv_rulePrintOutput= rulePrintOutput EOF ;
    public final EObject entryRulePrintOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrintOutput = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:900:2: (iv_rulePrintOutput= rulePrintOutput EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:901:2: iv_rulePrintOutput= rulePrintOutput EOF
            {
             currentNode = createCompositeNode(grammarAccess.getPrintOutputRule(), currentNode); 
            pushFollow(FOLLOW_rulePrintOutput_in_entryRulePrintOutput1658);
            iv_rulePrintOutput=rulePrintOutput();
            _fsp--;

             current =iv_rulePrintOutput; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrintOutput1668); 

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
    // $ANTLR end entryRulePrintOutput


    // $ANTLR start rulePrintOutput
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:908:1: rulePrintOutput returns [EObject current=null] : ( 'out' ( (lv_output_1_0= ruleValue ) ) ) ;
    public final EObject rulePrintOutput() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_output_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:913:6: ( ( 'out' ( (lv_output_1_0= ruleValue ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:914:1: ( 'out' ( (lv_output_1_0= ruleValue ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:914:1: ( 'out' ( (lv_output_1_0= ruleValue ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:914:3: 'out' ( (lv_output_1_0= ruleValue ) )
            {
            match(input,24,FOLLOW_24_in_rulePrintOutput1703); 

                    createLeafNode(grammarAccess.getPrintOutputAccess().getOutKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:918:1: ( (lv_output_1_0= ruleValue ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:919:1: (lv_output_1_0= ruleValue )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:919:1: (lv_output_1_0= ruleValue )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:920:3: lv_output_1_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getPrintOutputAccess().getOutputValueParserRuleCall_1_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePrintOutput1724);
            lv_output_1_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getPrintOutputRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"output",
            	        		lv_output_1_0, 
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
    // $ANTLR end rulePrintOutput


    // $ANTLR start entryRuleReadInput
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:950:1: entryRuleReadInput returns [EObject current=null] : iv_ruleReadInput= ruleReadInput EOF ;
    public final EObject entryRuleReadInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReadInput = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:951:2: (iv_ruleReadInput= ruleReadInput EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:952:2: iv_ruleReadInput= ruleReadInput EOF
            {
             currentNode = createCompositeNode(grammarAccess.getReadInputRule(), currentNode); 
            pushFollow(FOLLOW_ruleReadInput_in_entryRuleReadInput1760);
            iv_ruleReadInput=ruleReadInput();
            _fsp--;

             current =iv_ruleReadInput; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReadInput1770); 

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
    // $ANTLR end entryRuleReadInput


    // $ANTLR start ruleReadInput
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:959:1: ruleReadInput returns [EObject current=null] : ( 'in' ( ( RULE_ID ) ) ) ;
    public final EObject ruleReadInput() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:964:6: ( ( 'in' ( ( RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:965:1: ( 'in' ( ( RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:965:1: ( 'in' ( ( RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:965:3: 'in' ( ( RULE_ID ) )
            {
            match(input,25,FOLLOW_25_in_ruleReadInput1805); 

                    createLeafNode(grammarAccess.getReadInputAccess().getInKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:969:1: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:970:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:970:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:971:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getReadInputRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReadInput1823); 

            		createLeafNode(grammarAccess.getReadInputAccess().getInputVariableDeclarationCrossReference_1_0(), "input"); 
            	

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
    // $ANTLR end ruleReadInput


    // $ANTLR start entryRuleVariableDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:991:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:992:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:993:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1859);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1869); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1000:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1005:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1006:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1006:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1006:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1006:2: ( (lv_type_0_0= ruleType ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1007:1: (lv_type_0_0= ruleType )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1007:1: (lv_type_0_0= ruleType )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1008:3: lv_type_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration1915);
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

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1030:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1031:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1031:1: (lv_name_1_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1032:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1932); 

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


    // $ANTLR start entryRuleBindHandler
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1062:1: entryRuleBindHandler returns [EObject current=null] : iv_ruleBindHandler= ruleBindHandler EOF ;
    public final EObject entryRuleBindHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindHandler = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1063:2: (iv_ruleBindHandler= ruleBindHandler EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1064:2: iv_ruleBindHandler= ruleBindHandler EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindHandlerRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindHandler_in_entryRuleBindHandler1973);
            iv_ruleBindHandler=ruleBindHandler();
            _fsp--;

             current =iv_ruleBindHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindHandler1983); 

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
    // $ANTLR end entryRuleBindHandler


    // $ANTLR start ruleBindHandler
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1071:1: ruleBindHandler returns [EObject current=null] : ( ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleBindHandler() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1076:6: ( ( ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1077:1: ( ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1077:1: ( ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1077:2: ( ( RULE_ID ) ) '+=' ( ( RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1077:2: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1078:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1078:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1079:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindHandler2026); 

            		createLeafNode(grammarAccess.getBindHandlerAccess().getEventNameEventDeclCrossReference_0_0(), "eventName"); 
            	

            }


            }

            match(input,26,FOLLOW_26_in_ruleBindHandler2036); 

                    createLeafNode(grammarAccess.getBindHandlerAccess().getPlusSignEqualsSignKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1095:1: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1096:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1096:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1097:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getBindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindHandler2054); 

            		createLeafNode(grammarAccess.getBindHandlerAccess().getHandlerNameHandlerDeclCrossReference_2_0(), "handlerName"); 
            	

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
    // $ANTLR end ruleBindHandler


    // $ANTLR start entryRuleUnbindHandler
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1117:1: entryRuleUnbindHandler returns [EObject current=null] : iv_ruleUnbindHandler= ruleUnbindHandler EOF ;
    public final EObject entryRuleUnbindHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnbindHandler = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1118:2: (iv_ruleUnbindHandler= ruleUnbindHandler EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1119:2: iv_ruleUnbindHandler= ruleUnbindHandler EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnbindHandlerRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnbindHandler_in_entryRuleUnbindHandler2090);
            iv_ruleUnbindHandler=ruleUnbindHandler();
            _fsp--;

             current =iv_ruleUnbindHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnbindHandler2100); 

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
    // $ANTLR end entryRuleUnbindHandler


    // $ANTLR start ruleUnbindHandler
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1126:1: ruleUnbindHandler returns [EObject current=null] : ( ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) ;
    public final EObject ruleUnbindHandler() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1131:6: ( ( ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1132:1: ( ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1132:1: ( ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1132:2: ( ( RULE_ID ) ) '-=' ( ( RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1132:2: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1133:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1133:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1134:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUnbindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnbindHandler2143); 

            		createLeafNode(grammarAccess.getUnbindHandlerAccess().getEventNameEventDeclCrossReference_0_0(), "eventName"); 
            	

            }


            }

            match(input,27,FOLLOW_27_in_ruleUnbindHandler2153); 

                    createLeafNode(grammarAccess.getUnbindHandlerAccess().getHyphenMinusEqualsSignKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1150:1: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1151:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1151:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1152:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getUnbindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnbindHandler2171); 

            		createLeafNode(grammarAccess.getUnbindHandlerAccess().getHandlerNameHandlerDeclCrossReference_2_0(), "handlerName"); 
            	

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
    // $ANTLR end ruleUnbindHandler


    // $ANTLR start entryRuleVariableAssign
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1172:1: entryRuleVariableAssign returns [EObject current=null] : iv_ruleVariableAssign= ruleVariableAssign EOF ;
    public final EObject entryRuleVariableAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssign = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1173:2: (iv_ruleVariableAssign= ruleVariableAssign EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1174:2: iv_ruleVariableAssign= ruleVariableAssign EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableAssignRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableAssign_in_entryRuleVariableAssign2207);
            iv_ruleVariableAssign=ruleVariableAssign();
            _fsp--;

             current =iv_ruleVariableAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssign2217); 

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
    // $ANTLR end entryRuleVariableAssign


    // $ANTLR start ruleVariableAssign
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1181:1: ruleVariableAssign returns [EObject current=null] : ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleVariableAssign() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1186:6: ( ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:1: ( ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:2: ( ( RULE_ID ) ) '=' ( (lv_value_2_0= ruleValue ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1187:2: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1188:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1189:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getVariableAssignRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssign2260); 

            		createLeafNode(grammarAccess.getVariableAssignAccess().getNameVariableDeclarationCrossReference_0_0(), "name"); 
            	

            }


            }

            match(input,28,FOLLOW_28_in_ruleVariableAssign2270); 

                    createLeafNode(grammarAccess.getVariableAssignAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1205:1: ( (lv_value_2_0= ruleValue ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:1: (lv_value_2_0= ruleValue )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1206:1: (lv_value_2_0= ruleValue )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1207:3: lv_value_2_0= ruleValue
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableAssignAccess().getValueValueParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleVariableAssign2291);
            lv_value_2_0=ruleValue();
            _fsp--;


            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableAssignRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode.getParent(), current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
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
    // $ANTLR end ruleVariableAssign


    // $ANTLR start entryRuleRaiseEvent
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1237:1: entryRuleRaiseEvent returns [EObject current=null] : iv_ruleRaiseEvent= ruleRaiseEvent EOF ;
    public final EObject entryRuleRaiseEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRaiseEvent = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1238:2: (iv_ruleRaiseEvent= ruleRaiseEvent EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1239:2: iv_ruleRaiseEvent= ruleRaiseEvent EOF
            {
             currentNode = createCompositeNode(grammarAccess.getRaiseEventRule(), currentNode); 
            pushFollow(FOLLOW_ruleRaiseEvent_in_entryRuleRaiseEvent2327);
            iv_ruleRaiseEvent=ruleRaiseEvent();
            _fsp--;

             current =iv_ruleRaiseEvent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRaiseEvent2337); 

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
    // $ANTLR end entryRuleRaiseEvent


    // $ANTLR start ruleRaiseEvent
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1246:1: ruleRaiseEvent returns [EObject current=null] : ( 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )* )? ')' ) ;
    public final EObject ruleRaiseEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_params_3_0 = null;

        AntlrDatatypeRuleToken lv_params_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1251:6: ( ( 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )* )? ')' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1252:1: ( 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )* )? ')' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1252:1: ( 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )* )? ')' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1252:3: 'raise' ( ( RULE_ID ) ) '(' ( ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )* )? ')'
            {
            match(input,29,FOLLOW_29_in_ruleRaiseEvent2372); 

                    createLeafNode(grammarAccess.getRaiseEventAccess().getRaiseKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1256:1: ( ( RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1257:1: ( RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1257:1: ( RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1258:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getRaiseEventRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRaiseEvent2390); 

            		createLeafNode(grammarAccess.getRaiseEventAccess().getEventNameEventDeclCrossReference_1_0(), "eventName"); 
            	

            }


            }

            match(input,19,FOLLOW_19_in_ruleRaiseEvent2400); 

                    createLeafNode(grammarAccess.getRaiseEventAccess().getLeftParenthesisKeyword_2(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1274:1: ( ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_INT && LA13_0<=RULE_BOOL)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1274:2: ( (lv_params_3_0= ruleValue ) ) ( ',' ( (lv_params_5_0= ruleValue ) ) )*
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1274:2: ( (lv_params_3_0= ruleValue ) )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1275:1: (lv_params_3_0= ruleValue )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1275:1: (lv_params_3_0= ruleValue )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1276:3: lv_params_3_0= ruleValue
                    {
                     
                    	        currentNode=createCompositeNode(grammarAccess.getRaiseEventAccess().getParamsValueParserRuleCall_3_0_0(), currentNode); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleRaiseEvent2422);
                    lv_params_3_0=ruleValue();
                    _fsp--;


                    	        if (current==null) {
                    	            current = factory.create(grammarAccess.getRaiseEventRule().getType().getClassifier());
                    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	        }
                    	        try {
                    	       		add(
                    	       			current, 
                    	       			"params",
                    	        		lv_params_3_0, 
                    	        		"Value", 
                    	        		currentNode);
                    	        } catch (ValueConverterException vce) {
                    				handleValueConverterException(vce);
                    	        }
                    	        currentNode = currentNode.getParent();
                    	    

                    }


                    }

                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1298:2: ( ',' ( (lv_params_5_0= ruleValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1298:4: ',' ( (lv_params_5_0= ruleValue ) )
                    	    {
                    	    match(input,20,FOLLOW_20_in_ruleRaiseEvent2433); 

                    	            createLeafNode(grammarAccess.getRaiseEventAccess().getCommaKeyword_3_1_0(), null); 
                    	        
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1302:1: ( (lv_params_5_0= ruleValue ) )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1303:1: (lv_params_5_0= ruleValue )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1303:1: (lv_params_5_0= ruleValue )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1304:3: lv_params_5_0= ruleValue
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getRaiseEventAccess().getParamsValueParserRuleCall_3_1_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleRaiseEvent2454);
                    	    lv_params_5_0=ruleValue();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getRaiseEventRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"params",
                    	    	        		lv_params_5_0, 
                    	    	        		"Value", 
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,21,FOLLOW_21_in_ruleRaiseEvent2468); 

                    createLeafNode(grammarAccess.getRaiseEventAccess().getRightParenthesisKeyword_4(), null); 
                

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
    // $ANTLR end ruleRaiseEvent


    // $ANTLR start entryRuleValue
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1338:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1339:2: (iv_ruleValue= ruleValue EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1340:2: iv_ruleValue= ruleValue EOF
            {
             currentNode = createCompositeNode(grammarAccess.getValueRule(), currentNode); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue2505);
            iv_ruleValue=ruleValue();
            _fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue2516); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1347:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_REAL_1=null;
        Token this_BOOL_2=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1352:6: ( (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1353:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1353:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL )
            int alt14=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt14=1;
                }
                break;
            case RULE_REAL:
                {
                alt14=2;
                }
                break;
            case RULE_BOOL:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1353:1: (this_INT_0= RULE_INT | this_REAL_1= RULE_REAL | this_BOOL_2= RULE_BOOL )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1353:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleValue2556); 

                    		current.merge(this_INT_0);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getINTTerminalRuleCall_0(), null); 
                        

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1361:10: this_REAL_1= RULE_REAL
                    {
                    this_REAL_1=(Token)input.LT(1);
                    match(input,RULE_REAL,FOLLOW_RULE_REAL_in_ruleValue2582); 

                    		current.merge(this_REAL_1);
                        
                     
                        createLeafNode(grammarAccess.getValueAccess().getREALTerminalRuleCall_1(), null); 
                        

                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1369:10: this_BOOL_2= RULE_BOOL
                    {
                    this_BOOL_2=(Token)input.LT(1);
                    match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleValue2608); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1384:1: ruleType returns [Enumerator current=null] : ( ( 'int' ) | ( 'real' ) | ( 'bool' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1388:6: ( ( ( 'int' ) | ( 'real' ) | ( 'bool' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1389:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1389:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt15=1;
                }
                break;
            case 31:
                {
                alt15=2;
                }
                break;
            case 32:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1389:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1389:2: ( 'int' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1389:2: ( 'int' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1389:4: 'int'
                    {
                    match(input,30,FOLLOW_30_in_ruleType2665); 

                            current = grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getT_INTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1395:6: ( 'real' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1395:6: ( 'real' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1395:8: 'real'
                    {
                    match(input,31,FOLLOW_31_in_ruleType2680); 

                            current = grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getT_REALEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1401:6: ( 'bool' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1401:6: ( 'bool' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1401:8: 'bool'
                    {
                    match(input,32,FOLLOW_32_in_ruleType2695); 

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
    public static final BitSet FOLLOW_13_in_ruleProgram364 = new BitSet(new long[]{0x00000001E3400010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleProgram385 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleProgram395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_entryRuleGlobalSection431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalSection441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGlobalSection476 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalSection498 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleGlobalSection508 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_ruleEventSection_in_entryRuleEventSection546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSection556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEventSection591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventDecl_in_ruleEventSection613 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEventSection623 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_entryRuleHandlerSection661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerSection671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleHandlerSection706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_ruleHandlerSection727 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_entryRuleParamDeclaration764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamDeclaration774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParamDeclaration820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamDeclaration837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDecl_in_entryRuleEventDecl878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDecl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDecl930 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEventDecl945 = new BitSet(new long[]{0x00000001C0200000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleEventDecl967 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleEventDecl978 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleEventDecl999 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleEventDecl1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDecl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHandlerDecl1101 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHandlerDecl1116 = new BitSet(new long[]{0x00000001C0200000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleHandlerDecl1138 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleHandlerDecl1149 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleHandlerDecl1170 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleHandlerDecl1184 = new BitSet(new long[]{0x00000001E3400010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleHandlerDecl1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_entryRuleAbstractBlock1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractBlock1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleAbstractBlock1299 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAbstractBlock1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAbstractBlock1335 = new BitSet(new long[]{0x00000001E3C00010L});
    public static final BitSet FOLLOW_ruleAbstractBlock_in_ruleAbstractBlock1356 = new BitSet(new long[]{0x00000001E3C00010L});
    public static final BitSet FOLLOW_23_in_ruleAbstractBlock1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleCommand1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssign_in_ruleCommand1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindHandler_in_ruleCommand1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnbindHandler_in_ruleCommand1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRaiseEvent_in_ruleCommand1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrintOutput_in_ruleCommand1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadInput_in_ruleCommand1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrintOutput_in_entryRulePrintOutput1658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrintOutput1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulePrintOutput1703 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleValue_in_rulePrintOutput1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReadInput_in_entryRuleReadInput1760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReadInput1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleReadInput1805 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReadInput1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindHandler_in_entryRuleBindHandler1973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindHandler1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindHandler2026 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleBindHandler2036 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindHandler2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnbindHandler_in_entryRuleUnbindHandler2090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnbindHandler2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnbindHandler2143 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleUnbindHandler2153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnbindHandler2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssign_in_entryRuleVariableAssign2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssign2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssign2260 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleVariableAssign2270 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleVariableAssign2291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRaiseEvent_in_entryRuleRaiseEvent2327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRaiseEvent2337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRaiseEvent2372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRaiseEvent2390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleRaiseEvent2400 = new BitSet(new long[]{0x00000000002000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleRaiseEvent2422 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleRaiseEvent2433 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_ruleValue_in_ruleRaiseEvent2454 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleRaiseEvent2468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue2505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleValue2556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_in_ruleValue2582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleValue2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleType2665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType2695 = new BitSet(new long[]{0x0000000000000002L});

}
