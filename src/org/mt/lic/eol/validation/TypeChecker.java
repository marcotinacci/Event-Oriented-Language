package org.mt.lic.eol.validation;

import org.eclipse.emf.ecore.EObject;
import org.mt.lic.eol.eventOrientedLanguage.And;
import org.mt.lic.eol.eventOrientedLanguage.Div;
import org.mt.lic.eol.eventOrientedLanguage.Eq;
import org.mt.lic.eol.eventOrientedLanguage.Geq;
import org.mt.lic.eol.eventOrientedLanguage.Gtr;
import org.mt.lic.eol.eventOrientedLanguage.Leq;
import org.mt.lic.eol.eventOrientedLanguage.Less;
import org.mt.lic.eol.eventOrientedLanguage.Minus;
import org.mt.lic.eol.eventOrientedLanguage.Multi;
import org.mt.lic.eol.eventOrientedLanguage.Not;
import org.mt.lic.eol.eventOrientedLanguage.NumberLiteral;
import org.mt.lic.eol.eventOrientedLanguage.Or;
import org.mt.lic.eol.eventOrientedLanguage.Plus;
import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;
import org.mt.lic.eol.util.TypeHelper;

public class TypeChecker extends EventOrientedLanguageSwitch<Type> {
	
	private static TypeChecker instance = null;
	
	private TypeChecker(){}
	
	public static TypeChecker getInstance(){
		if(instance == null){
			instance = new TypeChecker();
		}
		return instance;
	}
	
	public Type getType(EObject object){
		return doSwitch(object);
	}

	@Override
	public Type casePlus(Plus object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseMinus(Minus object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseMulti(Multi object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseDiv(Div object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseNumberLiteral(NumberLiteral object) {
		return Type.getByName(object.getValue());
	}

	@Override
	public Type caseVariableReference(VariableReference object) {
		return object.getVar().getType();
	}

	@Override
	public Type caseAnd(And object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseOr(Or object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseNot(Not object) {
		return doSwitch(object.getCond());
	}

	@Override
	public Type caseLeq(Leq object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseLess(Less object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseEq(Eq object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseGeq(Geq object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type caseGtr(Gtr object) {
		return TypeHelper.combine(doSwitch(object.getLeft()), doSwitch(object.getRight()));
	}

	@Override
	public Type defaultCase(EObject object) {
		return null;
	}
	
}
