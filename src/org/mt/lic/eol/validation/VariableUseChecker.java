package org.mt.lic.eol.validation;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.Div;
import org.mt.lic.eol.eventOrientedLanguage.Eq;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.Geq;
import org.mt.lic.eol.eventOrientedLanguage.GlobalSection;
import org.mt.lic.eol.eventOrientedLanguage.Gtr;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.IfThenElse;
import org.mt.lic.eol.eventOrientedLanguage.Leq;
import org.mt.lic.eol.eventOrientedLanguage.Less;
import org.mt.lic.eol.eventOrientedLanguage.Minus;
import org.mt.lic.eol.eventOrientedLanguage.Multi;
import org.mt.lic.eol.eventOrientedLanguage.Plus;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.eventOrientedLanguage.While;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

/**
 * classe switch per il controllo dell'utilizzo di una variabile
 * @author Marco Tinacci
 *
 */
public class VariableUseChecker extends EventOrientedLanguageSwitch<Boolean>{
	
	private VariableUseChecker(){}
	
	static private VariableUseChecker instance = null;
	
	static public VariableUseChecker getInstance(){
		if(instance == null){
			instance = new VariableUseChecker();
		}
		return instance;
	}
	
	private VariableDeclaration declaration;
	
	public Boolean checkVariableUse(VariableDeclaration decl){
		Boolean used = false;
		declaration = decl;
		if(decl.eContainer() instanceof GlobalSection) // dichiarazione globale
		{ 
			used = doSwitch(((Program)decl.eContainer().eContainer()).getInit());
		}
		else if(decl.eContainer() instanceof HandlerDecl // dichiarazione di parametro
				|| decl.eContainer() instanceof EventDecl) // dichiarazione di evento
		{  
			used = true;
		}
		else if(decl.eContainer() instanceof Compound) // dichiarazione locale
		{
			Compound container = ((Compound)decl.eContainer());
			int position = container.getBody().indexOf(decl);
			for(int i = position + 1; i < container.getBody().size(); i++){
				if(doSwitch(container.getBody().get(i))){
					used = true;
					break;
				}
			}
		}else{
			// TODO throw exception
		}
		return used;
	}

	@Override
	public Boolean caseCompound(Compound object) {
		Boolean used = false;
		for (AbstractBlock block : object.getBody()) {
			if(doSwitch(block)){
				used = true;
				break;
			}
		}
		return used;
	}

	@Override
	public Boolean caseVariableAssign(VariableAssign object) {
		return doSwitch(object.getValue())
		 || object.getName().getName().equals(declaration.getName()); 
	}

	@Override
	public Boolean caseVariableReference(VariableReference object) {
		return object.getVar().getName().equals(declaration.getName());
	}

	@Override
	public Boolean caseRaiseEvent(RaiseEvent object) {
		
		List<Expression> params = object.getParams();
		Boolean isInit = false;
		for (Expression expression : params) {
			if(doSwitch(expression)){
				isInit = true;
				break;
			}
		}
		return isInit;
	}

	@Override
	public Boolean casePrintOutput(PrintOutput object) {
		return doSwitch(object.getOutput());
	}

	@Override
	public Boolean caseIfThenElse(IfThenElse object) {
		// vero solo se la condizione è vera o se sia then che else sono veri
		// se non è bilanciato il corpo non viene considerato perché 
		// potrebbe non essere eseguito a run-time
		return doSwitch(object.getCondition()) || 
			((object.isBalanced() && doSwitch(object.getElseBlock())) 
			&& doSwitch(object.getThenBlock()));
	}

	@Override
	public Boolean caseWhile(While object) {
		// non si considera il corpo del while perché potrebbe non essere 
		// eseguito a run-time
		return doSwitch(object.getCondition());
	}

	@Override
	public Boolean defaultCase(EObject object) {
		return false;
	}

	@Override
	public Boolean casePlus(Plus object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseMinus(Minus object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseMulti(Multi object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseDiv(Div object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseLeq(Leq object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseLess(Less object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseEq(Eq object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseGeq(Geq object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}

	@Override
	public Boolean caseGtr(Gtr object) {
		return doSwitch(object.getLeft()) || doSwitch(object.getRight());
	}
	
	
	
	
	

}
