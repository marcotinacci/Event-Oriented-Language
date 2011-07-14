package org.mt.lic.eol.validation;

import java.util.List;

import org.eclipse.xtext.validation.Check;
import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.generating.CodeGeneratorHelper;
import org.mt.lic.eol.util.TypeHelper;
 
public class EventOrientedLanguageJavaValidator extends AbstractEventOrientedLanguageJavaValidator {

	// TODO controllo uso e inizializzazione variabili globali su init
	// TODO controllo raise con tipi dei parametri corretti
	// TODO controllo codice morto
	// TODO controllo codice non raggiungibile
	// TODO controllo return
	// TODO controllo bind con handler dallo stesso nome
	
	/**
	 * Controlla che l'handler agganciato all'evento sia compatibile con quest'ultimo. Il controllo
	 * avviene sul numero di parametri e se questi sono dello stesso tipo e nello stesso ordine.
	 * @param bind
	 */
	@Check
	public void checkEventBinding(BindHandler bind){
		EventDecl event = bind.getEventName();
		HandlerDecl handler = bind.getHandlerName();
		if(!TypeHelper.sameParams(event.getParams(), handler.getParams())){
			error("The handler " + CodeGeneratorHelper.formatHandlerSignature(handler) +  
					" is not bindable to the event " + CodeGeneratorHelper.formatEventSignature(event), null);
		}
	}
	
	/**
	 * Controllo della corretta invocazione di un evento. Consiste nel controllare che il numero di 
	 * parametri della raise sia lo stesso della dichiarazione degli eventi e che i parametri siano
	 * compatibili
	 * @param raise
	 */
	@Check
	public void checkRaise(RaiseEvent raise){
		if(!TypeHelper.compatibleParams(raise.getParams(), raise.getEvent().getParams())){
			error("The event " + CodeGeneratorHelper.formatEventSignature(raise.getEvent()) +  
					" cannot be raised with " + raise.getParams().size() + " parameters", null);
		}
	}
	
	/**
	 * Controllo che la variabile dichiarata venga effettivamente usata in lettura o scrittura
	 * @param decl 
	 */
	@Check
	public void checkUnusedVariable(VariableDeclaration decl){
		if(!VariableUseChecker.getInstance().checkVariableUse(decl)){
			warning("The variable " + decl.getName() + " is never used", null);
		}
	}
	
	/**
	 * Controllo che la variabile referenziata venga effettivamente inizializzata prima
	 * dell'utilizzo
	 * @param ref
	 */
	@Check
	public void checkUseUninizializedVariable(VariableReference ref){
		if(!VariableInitializedChecker.getInstance().checkVariableInitialized(ref)){
			error("The variable " + ref.getVar().getName() + " may not have been initialized", null);			
		}
	}
	
	/**
	 * Controllo che i riferimenti a variabili nelle condizioni siano unicamente booleani
	 * @param ref
	 */
//	@Check
//	public void checkBooleanReference(BooleanReference ref){
		// TODO  
//		if(!ref.getVar().getType().equals(Type.TBOOL)){
//			error("The variable "+ ref.getVar().getName() +" must be boolean", null);
//		}
//	}
	
	/**
	 * Controllo che i nomi degli handler siano unici
	 * @param handler
	 */
	@Check
	public void checkHandlerUnicity(HandlerDecl handler){
		List<HandlerDecl> handlers = ((HandlerSection)handler.eContainer()).getHandlers();
		int position = handlers.indexOf(handler);
		for(int i = 0; i < position; i++){
			HandlerDecl current = handlers.get(i);
			// TODO controllo dei tipi dei parametri
			if(
				// stesso nome
				current.getName().equals(handler.getName()) 
				// stessi parametri
				&& TypeHelper.sameParams(current.getParams(), handler.getParams()) 
				// stessi parametri bind
				&& TypeHelper.sameParams(current.getBindParams(), handler.getBindParams())) 
			{
				error("The signature of the handler " 
						+ CodeGeneratorHelper.formatHandlerSignature(handler) 
						+ " must be unique", null);
			}
		}
	}
	
	/**
	 * Controllo che la dichiarazione di una variabile non sia giˆ stata dichiarata 
	 * nello stesso scope
	 * @param var
	 */
	@Check
	public void checkVariableUnicity(VariableDeclaration var){
		if(!VariableDeclarationChecker.getInstance().checkVariableDeclaration(var)){
			error("Duplicate variable declaration " + var.getName(), null);
		}
	}

}
