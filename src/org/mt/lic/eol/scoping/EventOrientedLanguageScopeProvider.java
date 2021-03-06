/*
 * generated by Xtext
 */
package org.mt.lic.eol.scoping;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;


/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class EventOrientedLanguageScopeProvider extends AbstractDeclarativeScopeProvider {
	
	IScope scope_VariableAssign_name(AbstractBlock a, EReference ref){
		return Scopes.scopeFor(getDeclarations(a));
	}
	
	// ref � il riferimento alla var contenuta in VariableReference
	// a � il contesto che continene VariableReference
	IScope scope_VariableReference_var(AbstractBlock a, EReference ref){
		return Scopes.scopeFor(getDeclarations(a));
	}
	
	private List<VariableDeclaration> getDeclarations(EObject object) {
		List<VariableDeclaration> list = new LinkedList<VariableDeclaration>();
		// risali alla radice del programma
		getDeclarations(object, list);
		while(!(object instanceof Program)){
			EObject father = object.eContainer();
			if(father instanceof Compound){
				int nodePos = ((Compound) father).getBody().indexOf(object);
				for(int i = 0; i < nodePos; i++){
					getDeclarations(((Compound) father).getBody().get(i), list);
				}
			}else{
				getDeclarations(father,list);
			}
			object = object.eContainer();
		}
		return list;
	}

	private List<VariableDeclaration> getDeclarations(EObject object, List<VariableDeclaration> list) {
		if(object instanceof Program){
			// aggiungi le variabili globali
			list.addAll(((Program)object).getGlobals().getGlobals());
		}else if(object instanceof HandlerDecl){
			// aggiungi i parametri della signature dell'handler
			list.addAll(((HandlerDecl) object).getParams());
		}else if(object instanceof Compound){
			// aggiungi ricorsivamente le dichiarazioni contenute nel blocco
			for (AbstractBlock block : ((Compound) object).getBody()) {
				getDeclarations(block, list);
			}
		}else if(object instanceof VariableDeclaration){
			// aggiungi la singola dichiarazione
			list.add((VariableDeclaration)object);
		}
		return list;
	}



	
}
