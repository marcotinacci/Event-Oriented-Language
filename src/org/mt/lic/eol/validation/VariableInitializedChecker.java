package org.mt.lic.eol.validation;

import org.eclipse.emf.ecore.EObject;
import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.Command;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.GlobalSection;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.IfThenElse;
import org.mt.lic.eol.eventOrientedLanguage.Program;
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
	
	/**
	 * metodo principale della classe, controlla che dato un riferimento a
	 * variabile questa sia effettivamente stata inizializzata precedentemente
	 * @param ref riferimento a variabile
	 * @return true se è stata inizializzata correttamente, false altrimenti 
	 */
	public Boolean checkVariableInitialized(VariableReference ref){
		reference = ref;
		EObject node = ref;
		EObject father = node.eContainer();
		Program root = (Program)ref.eResource().getContents().get(0);
		
		// controllo se la variabile e' globale
		if(root.getGlobals().getGlobals().contains(ref.getVar()))
		{
			return doSwitch(root.getInit());
		}
		
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
		// se era un parametro di handler non viene segnalata la mancata inizializzazione
		if(node.eContainer() instanceof HandlerDecl 
				&& (((HandlerDecl)node.eContainer()).getParams().contains(ref.getVar())
						|| ((HandlerDecl)node.eContainer()).getBindParams().contains(ref.getVar())))
		{
			return true;
		}else if(node.eContainer() instanceof GlobalSection){
			// se era una variabile globale non viene 
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
		// se non è bilanciato il corpo non viene considerato perché 
		// potrebbe non essere eseguito a run-time
		return (object.isBalanced() && doSwitch(object.getElseBlock())) 
			&& doSwitch(object.getThenBlock());
	}

	@Override
	public Boolean caseWhile(While object) {
		// non si considera il corpo del while perché potrebbe non essere 
		// eseguito a run-time
		return false;
	}
	
	
	
}
