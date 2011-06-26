package org.mt.lic.eol.util;

import java.util.HashSet;

import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.Div;
import org.mt.lic.eol.eventOrientedLanguage.Minus;
import org.mt.lic.eol.eventOrientedLanguage.Multi;
import org.mt.lic.eol.eventOrientedLanguage.NumberLiteral;
import org.mt.lic.eol.eventOrientedLanguage.Plus;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.UnbindHandler;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.eventOrientedLanguage.impl.CompoundImpl;
import org.mt.lic.eol.eventOrientedLanguage.impl.HandlerDeclImpl;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

public class CodeGenerator extends EventOrientedLanguageSwitch<String> {
	
	protected HashSet<String> libraries;
	protected HashSet<String> modules;
	protected String folder;
	
	public CodeGenerator() {
		libraries = new HashSet<String>();
		modules = new HashSet<String>();
	}
	
	@Override
	public String casePrintOutput(PrintOutput object) {
		libraries.add("iostream");
		return "std::cout << " + doSwitch(object.getOutput()) + " << std::endl;\n";
	}
	
	@Override
	public String caseCompound(Compound object) {
		StringBuffer toReturn = new StringBuffer();
		toReturn.append("{\n");
		for (AbstractBlock block : object.getBody()) {
			toReturn = toReturn.append(doSwitch(block));
		}
		toReturn.append("}\n");
		return toReturn.toString();
	}
	
	@Override
	public String caseRaiseEvent(RaiseEvent object) {
		// TODO parametri di raise
		//data_consume *x = new data_consume;
		//x->var1 = 10;
		//x->var2 = 3;
		//onProduce->setState(x);
		
		// String structName = NameConventions.HandlerStructName(object.get);
		StringBuffer buf = new StringBuffer();
		buf.append(" *x = new data_consume;");
		
		return object.getEventName().getName() + "->notify();\n";
	}

	@Override
	public String caseBindHandler(BindHandler object) {
		return object.getEventName().getName() + "->attach(" + object.getHandlerName().getName() + ");\n";
	}
	
	@Override
	public String caseUnbindHandler(UnbindHandler object) {
		return object.getEventName().getName() + "->detach(" + object.getHandlerName().getName() + ");\n";
	}

	@Override
	public String caseVariableDeclaration(VariableDeclaration object) {
		if(object.eContainer().getClass().equals(HandlerDeclImpl.class)){
			// signature handler case
			System.out.println("signature handler case");
		}else if(object.eContainer().getClass().equals(CompoundImpl.class)){
			// local declaration case
			System.out.println("local declaration case");
		}else{
			// TODO throw exception
			System.out.println("throw exception");
		}
		
		return NameConventions.convertTypeName(object.getType()) + " " + object.getName() + ";\n";
	}

	@Override
	public String caseVariableAssign(VariableAssign object) {
		// TODO Auto-generated method stub
		return super.caseVariableAssign(object);
	}

	@Override
	public String casePlus(Plus object) {
		return "("+doSwitch(object.getLeft())+"+"+doSwitch(object.getRight())+")";
	}

	@Override
	public String caseMinus(Minus object) {
		return "("+doSwitch(object.getLeft())+"-"+doSwitch(object.getRight())+")";
	}

	@Override
	public String caseMulti(Multi object) {
		return "("+doSwitch(object.getLeft())+"*"+doSwitch(object.getRight())+")";
	}

	@Override
	public String caseDiv(Div object) {
		return "("+doSwitch(object.getLeft())+"/"+doSwitch(object.getRight())+")";
	}

	@Override
	public String caseNumberLiteral(NumberLiteral object) {
		return object.getValue();
	}

	@Override
	public String caseVariableReference(VariableReference object) {
		return object.getVar().getName();
	}
	
	
}
