package org.mt.lic.eol.validation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

public class VariableDeclarationChecker extends EventOrientedLanguageSwitch<Boolean>{
	
	private static VariableDeclarationChecker instance = null;
	
	private VariableDeclarationChecker(){}
	
	public static VariableDeclarationChecker getInstance(){
		if(instance == null){
			instance = new VariableDeclarationChecker();
		}
		return instance;
	}
	
	private VariableDeclaration variableDeclaration;
	
	/**
	 * metodo principale del checker, controlla se una variabile è già stata
	 * dichiarata in uno scope che contiene quello attuale
	 * @param var
	 * @return true se la variabile è dichiarata correttamente, false altrimenti
	 */
	public synchronized Boolean checkVariableDeclaration(VariableDeclaration var){
		variableDeclaration = var;
		Boolean isHandlerParam = false;
		// viene segnalato l'errore anche se la dichiarazione coincide con una variabile globale
		List<VariableDeclaration> globals = ((Program)var.eResource().getContents().get(0)).getGlobals().getGlobals();
		for (VariableDeclaration decl : globals) {
			if(var != decl && var.getName().equals(decl.getName())){
				return false;
			}
		}
		
		// caso di dichiarazione di parametri handler
		if(var.eContainer() instanceof HandlerDecl){
			isHandlerParam = true;
			// controlla che non ci siano parametri dichiarati con lo stesso nome
			HandlerDecl handler = (HandlerDecl)var.eContainer();
			int posParam = 0;
			int posBindParam = 0;
			if(handler.getBindParams().contains(var)){
				posBindParam = handler.getBindParams().indexOf(var);
				posParam = 0;
			}else if(handler.getParams().contains(var)){
				posBindParam = handler.getBindParams().size();
				posParam = handler.getParams().indexOf(var);
			}
			for(int i = 0; i < posBindParam; i++){
				if(handler.getBindParams().get(i).getName().equals(var.getName())){
					return false;
				}
			}
			for(int i = 0; i < posParam; i++){
				if(handler.getParams().get(i).getName().equals(var.getName())){
					return false;
				}
			}
		}
		
		// controlla tra i comandi precedenti se ci sono state altre dichiarazioni
		EObject node = var;
		while(node.eContainer() instanceof Compound){
			Compound container = (Compound)node.eContainer();
			int position = container.getBody().indexOf(node);
			for(int i = 0; i < position; i++){
				if(!doSwitch(container.getBody().get(i))){
					return false;
				}
			}
			node = container;
		}
		
		// risali alla sezione
		while(node.eContainer() instanceof Compound){
			Compound container = (Compound)node.eContainer();
			node = container;
		}
		
		// viene segnalato l'errore anche se la dichiarazione locale coincide con un parametro di handler
		if(!isHandlerParam && node.eContainer() instanceof HandlerDecl)
		{
			for (VariableDeclaration param : ((HandlerDecl)node.eContainer()).getParams()) {
				if(var.getName().equals(param.getName())){
					return false;
				}
			}
			for (VariableDeclaration param : ((HandlerDecl)node.eContainer()).getBindParams()) {
				if(var.getName().equals(param.getName())){
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public Boolean caseVariableDeclaration(VariableDeclaration object) {
		return !object.getName().equals(variableDeclaration.getName());
	}

	@Override
	public Boolean caseCompound(Compound object) {
		for (AbstractBlock block : object.getBody()) {
			if(!doSwitch(block)){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public Boolean defaultCase(EObject object) {
		return true;
	}
	
}
