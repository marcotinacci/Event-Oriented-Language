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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'init:'", "'end'", "'globals:'", "';'", "'events:'", "'handlers:'", "'('", "','", "')'", "'{'", "'}'", "'+='", "'-='", "'='", "'int'", "'real'", "'bool'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:87:1: ruleProgram returns [EObject current=null] : ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleCompound ) ) 'end' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_globals_1_0 = null;

        EObject lv_events_2_0 = null;

        EObject lv_handlers_3_0 = null;

        EObject lv_init_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:92:6: ( ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleCompound ) ) 'end' ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:1: ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleCompound ) ) 'end' )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:1: ( ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleCompound ) ) 'end' )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:93:2: ( ( ( ( ({...}? => ( ( (lv_globals_1_0= ruleGlobalSection ) ) ) ) | ({...}? => ( ( (lv_events_2_0= ruleEventSection ) ) ) ) | ({...}? => ( ( (lv_handlers_3_0= ruleHandlerSection ) ) ) ) )* ) ) ) 'init:' ( (lv_init_5_0= ruleCompound ) ) 'end'
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

                if ( LA1_0 ==13 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getProgramAccess().getUnorderedGroup_0(), 2) ) {
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

            match(input,11,FOLLOW_11_in_ruleProgram364); 

                    createLeafNode(grammarAccess.getProgramAccess().getInitKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:221:1: ( (lv_init_5_0= ruleCompound ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:222:1: (lv_init_5_0= ruleCompound )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:222:1: (lv_init_5_0= ruleCompound )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:223:3: lv_init_5_0= ruleCompound
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getProgramAccess().getInitCompoundParserRuleCall_2_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompound_in_ruleProgram385);
            lv_init_5_0=ruleCompound();
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
            	        		"Compound", 
            	        		currentNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	        currentNode = currentNode.getParent();
            	    

            }


            }

            match(input,12,FOLLOW_12_in_ruleProgram395); 

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
            match(input,13,FOLLOW_13_in_ruleGlobalSection476); 

                    createLeafNode(grammarAccess.getGlobalSectionAccess().getGlobalsKeyword_0(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:276:1: ( ( (lv_globals_1_0= ruleVariableDeclaration ) ) ';' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=25 && LA2_0<=27)) ) {
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

            	    match(input,14,FOLLOW_14_in_ruleGlobalSection508); 

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
            match(input,15,FOLLOW_15_in_ruleEventSection591); 

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

            	    match(input,14,FOLLOW_14_in_ruleEventSection623); 

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
            match(input,16,FOLLOW_16_in_ruleHandlerSection706); 

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

            match(input,17,FOLLOW_17_in_ruleEventDecl945); 

                    createLeafNode(grammarAccess.getEventDeclAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:532:1: ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=25 && LA6_0<=27)) ) {
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

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:556:4: ',' ( (lv_params_4_0= ruleParamDeclaration ) )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleEventDecl978); 

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

            match(input,19,FOLLOW_19_in_ruleEventDecl1013); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:605:1: ruleHandlerDecl returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleCompound ) ) ) ;
    public final EObject ruleHandlerDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_body_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:610:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleCompound ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleCompound ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleCompound ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:611:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )? ')' ( (lv_body_6_0= ruleCompound ) )
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

            match(input,17,FOLLOW_17_in_ruleHandlerDecl1116); 

                    createLeafNode(grammarAccess.getHandlerDeclAccess().getLeftParenthesisKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:639:1: ( ( (lv_params_2_0= ruleParamDeclaration ) ) ( ',' ( (lv_params_4_0= ruleParamDeclaration ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=25 && LA8_0<=27)) ) {
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

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:663:4: ',' ( (lv_params_4_0= ruleParamDeclaration ) )
                    	    {
                    	    match(input,18,FOLLOW_18_in_ruleHandlerDecl1149); 

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

            match(input,19,FOLLOW_19_in_ruleHandlerDecl1184); 

                    createLeafNode(grammarAccess.getHandlerDeclAccess().getRightParenthesisKeyword_3(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:695:1: ( (lv_body_6_0= ruleCompound ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:696:1: (lv_body_6_0= ruleCompound )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:696:1: (lv_body_6_0= ruleCompound )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:697:3: lv_body_6_0= ruleCompound
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getHandlerDeclAccess().getBodyCompoundParserRuleCall_4_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleCompound_in_ruleHandlerDecl1205);
            lv_body_6_0=ruleCompound();
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
            	        		"Compound", 
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


    // $ANTLR start entryRuleCompound
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:727:1: entryRuleCompound returns [EObject current=null] : iv_ruleCompound= ruleCompound EOF ;
    public final EObject entryRuleCompound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompound = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:728:2: (iv_ruleCompound= ruleCompound EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:729:2: iv_ruleCompound= ruleCompound EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCompoundRule(), currentNode); 
            pushFollow(FOLLOW_ruleCompound_in_entryRuleCompound1241);
            iv_ruleCompound=ruleCompound();
            _fsp--;

             current =iv_ruleCompound; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompound1251); 

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
    // $ANTLR end entryRuleCompound


    // $ANTLR start ruleCompound
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:736:1: ruleCompound returns [EObject current=null] : ( () ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) ) ) ;
    public final EObject ruleCompound() throws RecognitionException {
        EObject current = null;

        EObject lv_body_2_0 = null;

        EObject lv_body_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:741:6: ( ( () ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:1: ( () ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:1: ( () ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:2: () ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:742:2: ()
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:743:5: 
            {
             
                    temp=factory.create(grammarAccess.getCompoundAccess().getCompoundAction_0().getType().getClassifier());
                    current = temp; 
                    temp = null;
                    CompositeNode newNode = createCompositeNode(grammarAccess.getCompoundAccess().getCompoundAction_0(), currentNode.getParent());
                newNode.getChildren().add(currentNode);
                moveLookaheadInfo(currentNode, newNode);
                currentNode = newNode; 
                    associateNodeWithAstElement(currentNode, current); 
                

            }

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:753:2: ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID||LA11_0==14||(LA11_0>=25 && LA11_0<=27)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("753:2: ( ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' ) | ( ( (lv_body_4_0= ruleCommand ) )? ';' ) )", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:753:3: ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:753:3: ( '{' ( (lv_body_2_0= ruleCompound ) )* '}' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:753:5: '{' ( (lv_body_2_0= ruleCompound ) )* '}'
                    {
                    match(input,20,FOLLOW_20_in_ruleCompound1297); 

                            createLeafNode(grammarAccess.getCompoundAccess().getLeftCurlyBracketKeyword_1_0_0(), null); 
                        
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:757:1: ( (lv_body_2_0= ruleCompound ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID||LA9_0==14||LA9_0==20||(LA9_0>=25 && LA9_0<=27)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:758:1: (lv_body_2_0= ruleCompound )
                    	    {
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:758:1: (lv_body_2_0= ruleCompound )
                    	    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:759:3: lv_body_2_0= ruleCompound
                    	    {
                    	     
                    	    	        currentNode=createCompositeNode(grammarAccess.getCompoundAccess().getBodyCompoundParserRuleCall_1_0_1_0(), currentNode); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleCompound_in_ruleCompound1318);
                    	    lv_body_2_0=ruleCompound();
                    	    _fsp--;


                    	    	        if (current==null) {
                    	    	            current = factory.create(grammarAccess.getCompoundRule().getType().getClassifier());
                    	    	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	    	        }
                    	    	        try {
                    	    	       		add(
                    	    	       			current, 
                    	    	       			"body",
                    	    	        		lv_body_2_0, 
                    	    	        		"Compound", 
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

                    match(input,21,FOLLOW_21_in_ruleCompound1329); 

                            createLeafNode(grammarAccess.getCompoundAccess().getRightCurlyBracketKeyword_1_0_2(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:786:6: ( ( (lv_body_4_0= ruleCommand ) )? ';' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:786:6: ( ( (lv_body_4_0= ruleCommand ) )? ';' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:786:7: ( (lv_body_4_0= ruleCommand ) )? ';'
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:786:7: ( (lv_body_4_0= ruleCommand ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID||(LA10_0>=25 && LA10_0<=27)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:787:1: (lv_body_4_0= ruleCommand )
                            {
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:787:1: (lv_body_4_0= ruleCommand )
                            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:788:3: lv_body_4_0= ruleCommand
                            {
                             
                            	        currentNode=createCompositeNode(grammarAccess.getCompoundAccess().getBodyCommandParserRuleCall_1_1_0_0(), currentNode); 
                            	    
                            pushFollow(FOLLOW_ruleCommand_in_ruleCompound1358);
                            lv_body_4_0=ruleCommand();
                            _fsp--;


                            	        if (current==null) {
                            	            current = factory.create(grammarAccess.getCompoundRule().getType().getClassifier());
                            	            associateNodeWithAstElement(currentNode.getParent(), current);
                            	        }
                            	        try {
                            	       		add(
                            	       			current, 
                            	       			"body",
                            	        		lv_body_4_0, 
                            	        		"Command", 
                            	        		currentNode);
                            	        } catch (ValueConverterException vce) {
                            				handleValueConverterException(vce);
                            	        }
                            	        currentNode = currentNode.getParent();
                            	    

                            }


                            }
                            break;

                    }

                    match(input,14,FOLLOW_14_in_ruleCompound1369); 

                            createLeafNode(grammarAccess.getCompoundAccess().getSemicolonKeyword_1_1_1(), null); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end ruleCompound


    // $ANTLR start entryRuleCommand
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:822:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:823:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:824:2: iv_ruleCommand= ruleCommand EOF
            {
             currentNode = createCompositeNode(grammarAccess.getCommandRule(), currentNode); 
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1407);
            iv_ruleCommand=ruleCommand();
            _fsp--;

             current =iv_ruleCommand; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1417); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:831:1: ruleCommand returns [EObject current=null] : (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_VariableDeclaration_0 = null;

        EObject this_VariableAssign_1 = null;

        EObject this_BindHandler_2 = null;

        EObject this_UnbindHandler_3 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:836:6: ( (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:837:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:837:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=25 && LA12_0<=27)) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt12=4;
                    }
                    break;
                case 24:
                    {
                    alt12=2;
                    }
                    break;
                case 22:
                    {
                    alt12=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("837:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler )", 12, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("837:1: (this_VariableDeclaration_0= ruleVariableDeclaration | this_VariableAssign_1= ruleVariableAssign | this_BindHandler_2= ruleBindHandler | this_UnbindHandler_3= ruleUnbindHandler )", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:838:5: this_VariableDeclaration_0= ruleVariableDeclaration
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableDeclarationParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleCommand1464);
                    this_VariableDeclaration_0=ruleVariableDeclaration();
                    _fsp--;

                     
                            current = this_VariableDeclaration_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:848:5: this_VariableAssign_1= ruleVariableAssign
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getVariableAssignParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleVariableAssign_in_ruleCommand1491);
                    this_VariableAssign_1=ruleVariableAssign();
                    _fsp--;

                     
                            current = this_VariableAssign_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:858:5: this_BindHandler_2= ruleBindHandler
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getBindHandlerParserRuleCall_2(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleBindHandler_in_ruleCommand1518);
                    this_BindHandler_2=ruleBindHandler();
                    _fsp--;

                     
                            current = this_BindHandler_2; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 4 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:868:5: this_UnbindHandler_3= ruleUnbindHandler
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getCommandAccess().getUnbindHandlerParserRuleCall_3(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleUnbindHandler_in_ruleCommand1545);
                    this_UnbindHandler_3=ruleUnbindHandler();
                    _fsp--;

                     
                            current = this_UnbindHandler_3; 
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


    // $ANTLR start entryRuleVariableDeclaration
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:884:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:885:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:886:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableDeclarationRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1580);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();
            _fsp--;

             current =iv_ruleVariableDeclaration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration1590); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:893:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:898:6: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:899:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:899:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:899:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:899:2: ( (lv_type_0_0= ruleType ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:900:1: (lv_type_0_0= ruleType )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:900:1: (lv_type_0_0= ruleType )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:901:3: lv_type_0_0= ruleType
            {
             
            	        currentNode=createCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeEnumRuleCall_0_0(), currentNode); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVariableDeclaration1636);
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

            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:923:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:924:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:924:1: (lv_name_1_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:925:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableDeclaration1653); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:955:1: entryRuleBindHandler returns [EObject current=null] : iv_ruleBindHandler= ruleBindHandler EOF ;
    public final EObject entryRuleBindHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBindHandler = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:956:2: (iv_ruleBindHandler= ruleBindHandler EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:957:2: iv_ruleBindHandler= ruleBindHandler EOF
            {
             currentNode = createCompositeNode(grammarAccess.getBindHandlerRule(), currentNode); 
            pushFollow(FOLLOW_ruleBindHandler_in_entryRuleBindHandler1694);
            iv_ruleBindHandler=ruleBindHandler();
            _fsp--;

             current =iv_ruleBindHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBindHandler1704); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:964:1: ruleBindHandler returns [EObject current=null] : ( ( (lv_eventName_0_0= RULE_ID ) ) '+=' ( (lv_handlerName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleBindHandler() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token lv_handlerName_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:969:6: ( ( ( (lv_eventName_0_0= RULE_ID ) ) '+=' ( (lv_handlerName_2_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:970:1: ( ( (lv_eventName_0_0= RULE_ID ) ) '+=' ( (lv_handlerName_2_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:970:1: ( ( (lv_eventName_0_0= RULE_ID ) ) '+=' ( (lv_handlerName_2_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:970:2: ( (lv_eventName_0_0= RULE_ID ) ) '+=' ( (lv_handlerName_2_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:970:2: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:971:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:971:1: (lv_eventName_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:972:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindHandler1746); 

            			createLeafNode(grammarAccess.getBindHandlerAccess().getEventNameIDTerminalRuleCall_0_0(), "eventName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"eventName",
            	        		lv_eventName_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,22,FOLLOW_22_in_ruleBindHandler1761); 

                    createLeafNode(grammarAccess.getBindHandlerAccess().getPlusSignEqualsSignKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:998:1: ( (lv_handlerName_2_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:999:1: (lv_handlerName_2_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:999:1: (lv_handlerName_2_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1000:3: lv_handlerName_2_0= RULE_ID
            {
            lv_handlerName_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBindHandler1778); 

            			createLeafNode(grammarAccess.getBindHandlerAccess().getHandlerNameIDTerminalRuleCall_2_0(), "handlerName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getBindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"handlerName",
            	        		lv_handlerName_2_0, 
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
    // $ANTLR end ruleBindHandler


    // $ANTLR start entryRuleUnbindHandler
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1030:1: entryRuleUnbindHandler returns [EObject current=null] : iv_ruleUnbindHandler= ruleUnbindHandler EOF ;
    public final EObject entryRuleUnbindHandler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnbindHandler = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1031:2: (iv_ruleUnbindHandler= ruleUnbindHandler EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1032:2: iv_ruleUnbindHandler= ruleUnbindHandler EOF
            {
             currentNode = createCompositeNode(grammarAccess.getUnbindHandlerRule(), currentNode); 
            pushFollow(FOLLOW_ruleUnbindHandler_in_entryRuleUnbindHandler1819);
            iv_ruleUnbindHandler=ruleUnbindHandler();
            _fsp--;

             current =iv_ruleUnbindHandler; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnbindHandler1829); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1039:1: ruleUnbindHandler returns [EObject current=null] : ( ( (lv_eventName_0_0= RULE_ID ) ) '-=' ( (lv_handlerName_2_0= RULE_ID ) ) ) ;
    public final EObject ruleUnbindHandler() throws RecognitionException {
        EObject current = null;

        Token lv_eventName_0_0=null;
        Token lv_handlerName_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1044:6: ( ( ( (lv_eventName_0_0= RULE_ID ) ) '-=' ( (lv_handlerName_2_0= RULE_ID ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1045:1: ( ( (lv_eventName_0_0= RULE_ID ) ) '-=' ( (lv_handlerName_2_0= RULE_ID ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1045:1: ( ( (lv_eventName_0_0= RULE_ID ) ) '-=' ( (lv_handlerName_2_0= RULE_ID ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1045:2: ( (lv_eventName_0_0= RULE_ID ) ) '-=' ( (lv_handlerName_2_0= RULE_ID ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1045:2: ( (lv_eventName_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1046:1: (lv_eventName_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1046:1: (lv_eventName_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1047:3: lv_eventName_0_0= RULE_ID
            {
            lv_eventName_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnbindHandler1871); 

            			createLeafNode(grammarAccess.getUnbindHandlerAccess().getEventNameIDTerminalRuleCall_0_0(), "eventName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnbindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"eventName",
            	        		lv_eventName_0_0, 
            	        		"ID", 
            	        		lastConsumedNode);
            	        } catch (ValueConverterException vce) {
            				handleValueConverterException(vce);
            	        }
            	    

            }


            }

            match(input,23,FOLLOW_23_in_ruleUnbindHandler1886); 

                    createLeafNode(grammarAccess.getUnbindHandlerAccess().getHyphenMinusEqualsSignKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1073:1: ( (lv_handlerName_2_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1074:1: (lv_handlerName_2_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1074:1: (lv_handlerName_2_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1075:3: lv_handlerName_2_0= RULE_ID
            {
            lv_handlerName_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleUnbindHandler1903); 

            			createLeafNode(grammarAccess.getUnbindHandlerAccess().getHandlerNameIDTerminalRuleCall_2_0(), "handlerName"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getUnbindHandlerRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"handlerName",
            	        		lv_handlerName_2_0, 
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
    // $ANTLR end ruleUnbindHandler


    // $ANTLR start entryRuleVariableAssign
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1105:1: entryRuleVariableAssign returns [EObject current=null] : iv_ruleVariableAssign= ruleVariableAssign EOF ;
    public final EObject entryRuleVariableAssign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAssign = null;


        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1106:2: (iv_ruleVariableAssign= ruleVariableAssign EOF )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1107:2: iv_ruleVariableAssign= ruleVariableAssign EOF
            {
             currentNode = createCompositeNode(grammarAccess.getVariableAssignRule(), currentNode); 
            pushFollow(FOLLOW_ruleVariableAssign_in_entryRuleVariableAssign1944);
            iv_ruleVariableAssign=ruleVariableAssign();
            _fsp--;

             current =iv_ruleVariableAssign; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAssign1954); 

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
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1114:1: ruleVariableAssign returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleVariableAssign() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_value_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1119:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1120:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1120:1: ( ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_INT ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1120:2: ( (lv_name_0_0= RULE_ID ) ) '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1120:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1121:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1121:1: (lv_name_0_0= RULE_ID )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1122:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariableAssign1996); 

            			createLeafNode(grammarAccess.getVariableAssignAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableAssignRule().getType().getClassifier());
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

            match(input,24,FOLLOW_24_in_ruleVariableAssign2011); 

                    createLeafNode(grammarAccess.getVariableAssignAccess().getEqualsSignKeyword_1(), null); 
                
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1148:1: ( (lv_value_2_0= RULE_INT ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1149:1: (lv_value_2_0= RULE_INT )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1149:1: (lv_value_2_0= RULE_INT )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1150:3: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVariableAssign2028); 

            			createLeafNode(grammarAccess.getVariableAssignAccess().getValueINTTerminalRuleCall_2_0(), "value"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getVariableAssignRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
            	        try {
            	       		set(
            	       			current, 
            	       			"value",
            	        		lv_value_2_0, 
            	        		"INT", 
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
    // $ANTLR end ruleVariableAssign


    // $ANTLR start ruleType
    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1180:1: ruleType returns [Enumerator current=null] : ( ( 'int' ) | ( 'real' ) | ( 'bool' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

         setCurrentLookahead(); resetLookahead(); 
        try {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1184:6: ( ( ( 'int' ) | ( 'real' ) | ( 'bool' ) ) )
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1185:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )
            {
            // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1185:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 26:
                {
                alt13=2;
                }
                break;
            case 27:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1185:1: ( ( 'int' ) | ( 'real' ) | ( 'bool' ) )", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1185:2: ( 'int' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1185:2: ( 'int' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1185:4: 'int'
                    {
                    match(input,25,FOLLOW_25_in_ruleType2081); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0(), null); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1191:6: ( 'real' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1191:6: ( 'real' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1191:8: 'real'
                    {
                    match(input,26,FOLLOW_26_in_ruleType2096); 

                            current = grammarAccess.getTypeAccess().getREALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getREALEnumLiteralDeclaration_1(), null); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:6: ( 'bool' )
                    {
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:6: ( 'bool' )
                    // ../org.mt.lic.eol/src-gen/org/mt/lic/eol/parser/antlr/internal/InternalEventOrientedLanguage.g:1197:8: 'bool'
                    {
                    match(input,27,FOLLOW_27_in_ruleType2111); 

                            current = grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            createLeafNode(grammarAccess.getTypeAccess().getBOOLEnumLiteralDeclaration_2(), null); 
                        

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
    public static final BitSet FOLLOW_ruleGlobalSection_in_ruleProgram173 = new BitSet(new long[]{0x000000000001A800L});
    public static final BitSet FOLLOW_ruleEventSection_in_ruleProgram244 = new BitSet(new long[]{0x000000000001A800L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_ruleProgram315 = new BitSet(new long[]{0x000000000001A800L});
    public static final BitSet FOLLOW_11_in_ruleProgram364 = new BitSet(new long[]{0x000000000E104010L});
    public static final BitSet FOLLOW_ruleCompound_in_ruleProgram385 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProgram395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalSection_in_entryRuleGlobalSection431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalSection441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGlobalSection476 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleGlobalSection498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGlobalSection508 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_ruleEventSection_in_entryRuleEventSection546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventSection556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEventSection591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEventDecl_in_ruleEventSection613 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEventSection623 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleHandlerSection_in_entryRuleHandlerSection661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerSection671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleHandlerSection706 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_ruleHandlerSection727 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_entryRuleParamDeclaration764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamDeclaration774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleParamDeclaration820 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParamDeclaration837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEventDecl_in_entryRuleEventDecl878 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEventDecl888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEventDecl930 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEventDecl945 = new BitSet(new long[]{0x000000000E080000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleEventDecl967 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleEventDecl978 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleEventDecl999 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleEventDecl1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHandlerDecl_in_entryRuleHandlerDecl1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHandlerDecl1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHandlerDecl1101 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHandlerDecl1116 = new BitSet(new long[]{0x000000000E080000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleHandlerDecl1138 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleHandlerDecl1149 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_ruleParamDeclaration_in_ruleHandlerDecl1170 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19_in_ruleHandlerDecl1184 = new BitSet(new long[]{0x000000000E104010L});
    public static final BitSet FOLLOW_ruleCompound_in_ruleHandlerDecl1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompound_in_entryRuleCompound1241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompound1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCompound1297 = new BitSet(new long[]{0x000000000E304010L});
    public static final BitSet FOLLOW_ruleCompound_in_ruleCompound1318 = new BitSet(new long[]{0x000000000E304010L});
    public static final BitSet FOLLOW_21_in_ruleCompound1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCompound1358 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleCompound1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleCommand1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssign_in_ruleCommand1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindHandler_in_ruleCommand1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnbindHandler_in_ruleCommand1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleVariableDeclaration1636 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableDeclaration1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBindHandler_in_entryRuleBindHandler1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBindHandler1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindHandler1746 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBindHandler1761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBindHandler1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnbindHandler_in_entryRuleUnbindHandler1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnbindHandler1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnbindHandler1871 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleUnbindHandler1886 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleUnbindHandler1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAssign_in_entryRuleVariableAssign1944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAssign1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariableAssign1996 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVariableAssign2011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVariableAssign2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType2111 = new BitSet(new long[]{0x0000000000000002L});

}
