package org.mt.lic.eol.validation;

import org.eclipse.emf.ecore.EObject;
import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.Command;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.IfThenElse;
import org.mt.lic.eol.eventOrientedLanguage.ReadInput;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.eventOrientedLanguage.While;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

public class VariableInitializedChecker extends EventOrientedLanguageSwitch<Boolean> {
	
	private VariableInitializedChecker(){}
	
	static private VariableInitializedChecker instance = null;
	
	static public VariableInitializedChecker getInstance(){
		if(instance == null){
			instance = new VariableInitializedChecker();
		}
		return instance;
	}
	
	private VariableReference reference = null;
	
	public Boolean checkVariableInitialized(VariableReference ref){
		reference = ref;
		EObject node = ref;
		EObject father = node.eContainer();
		// risali al nodo Command
		while(!(node instanceof Command)){
			node = father;
			father = node.eContainer();
		}
		// controlla tra i comandi precedenti se ci sono state scritture
		while(node.eContainer() instanceof Compound){
			Compound container = (Compound)node.eContainer();
			int position = container.getBody().indexOf(node);
			for(int i = 0; i < position; i++){
				if(doSwitch(container.getBody().get(i))){
					return true;
				}
			}
			node = container;
		}
		// risali alla sezione
		while(node.eContainer() instanceof Compound){
			Compound container = (Compound)node.eContainer();
			node = container;
		}
		// se era un parametro di handler non viene segnalata la mancata inizializzazione
		if(node.eContainer() instanceof HandlerDecl 
				&& (((HandlerDecl)node.eContainer()).getParams().contains(ref.getVar())
						|| ((HandlerDecl)node.eContainer()).getBindParams().contains(ref.getVar())))
		{
			return true;
		}
		return false;
	}

	@Override
	public Boolean caseVariableAssign(VariableAssign object) {
		return object.getName().equals(reference.getVar());
	}

	@Override
	public Boolean caseReadInput(ReadInput object) {
		return object.getInput().equals(reference.getVar());
	}

	@Override
	public Boolean caseCompound(Compound object) {
		for (AbstractBlock block : object.getBody()) {
			if(doSwitch(block)){
				return true;
			}
		}
		return false;
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return false;
	}

	@Override
	public Boolean caseIfThenElse(IfThenElse object) {
		// vero solo se sia then che else sono veri
		// se non  bilanciato il corpo non viene considerato perchŽ 
		// potrebbe non essere eseguito a run-time
		return (object.isBalanced() && doSwitch(object.getElseBlock())) 
			&& doSwitch(object.getThenBlock());
	}

	@Override
	public Boolean caseWhile(While object) {
		// non si considera il corpo del while perchŽ potrebbe non essere 
		// eseguito a run-time
		return false;
	}
	
	
	
}
