package org.mt.lic.eol.generating;

import java.util.HashSet;
import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.Div;
import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.Minus;
import org.mt.lic.eol.eventOrientedLanguage.Multi;
import org.mt.lic.eol.eventOrientedLanguage.NumberLiteral;
import org.mt.lic.eol.eventOrientedLanguage.Plus;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.ReadInput;
import org.mt.lic.eol.eventOrientedLanguage.UnbindHandler;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;
import org.mt.lic.eol.util.NameConventions;

abstract class CodeGenerator extends EventOrientedLanguageSwitch<String> {
	
	protected HashSet<String> libraries;
	protected HashSet<String> modules;
	protected String folder;
	
	public CodeGenerator() {
		reset();
	}
	
	public void reset(){
		libraries = new HashSet<String>();
		modules = new HashSet<String>();
		modules.add("Event.h");
		modules.add("Handler.h");
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
		// TODO delete delle new come lo state!!

		StringBuffer toReturn = new StringBuffer();
		// nome struttura
		String structName = NameConventions.DatatypeStructName(
				CodeGeneratorHelper.formatFieldsTypeFromParams(object.getEvent().getParams()));
		toReturn.append(structName + " *state = new " + structName + ";\n");
		List<Expression> params = object.getParams();
		for (int i = 0; i < params.size(); i++) {
			toReturn.append("state->var" + i + " = " + doSwitch(params.get(i)) + ";\n");
		}
		toReturn.append(object.getEvent().getName() + "->setState(state);\n");
		toReturn.append(object.getEvent().getName() + "->notify();\n");
		return toReturn.toString();
	}

	@Override
	public String caseBindHandler(BindHandler object) {
		String handlerClassName = NameConventions.HandlerClassName(object.getHandlerName().getName());
		return object.getEventName().getName() + "->attach(new " + handlerClassName + "(this));\n";
//		return handlerClassName + "* "+ object.getHandlerName().getName() 
//			+ " = new " + handlerClassName + "(this);\n" 
//			+ object.getEventName().getName() + "->attach(" + object.getHandlerName().getName() + ");\n"; 
	}
	
	@Override
	public String caseUnbindHandler(UnbindHandler object) {
		return object.getEventName().getName() + "->detach(" + object.getHandlerName().getName() + ");\n";
	}
	
	@Override
	public String caseVariableDeclaration(VariableDeclaration object) {
		return NameConventions.convertTypeName(object.getType()) + " " + object.getName() + ";\n";
	}

	@Override
	public String caseHandlerDecl(HandlerDecl object) {
		String structName = NameConventions.DatatypeStructName(
				CodeGeneratorHelper.formatFieldsTypeFromParams(object.getParams()));
		StringBuffer toReturn = new StringBuffer();
		// esegui cast da void*
		toReturn.append(CodeGeneratorHelper.formatParamsCast(structName) + "\n");

		List<VariableDeclaration> params = object.getParams();
		for(int i=0; i < params.size(); i++){
			toReturn.append( NameConventions.convertTypeName(params.get(i).getType()) + " " +
				params.get(i).getName() + "= params->var"+ i +";\n");
		}
		return toReturn.toString();
	}
	
	@Override
	public String caseVariableAssign(VariableAssign object) {
		return object.getName().getName() + " = " + doSwitch(object.getValue()) + ";\n";
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

	@Override
	public String caseReadInput(ReadInput object) {
		libraries.add("iostream");
		return "std::cin >> " + object.getInput().getName() + ";\n";
	}

	public HashSet<String> getLibraries() {
		return libraries;
	}

	public void setLibraries(HashSet<String> libraries) {
		this.libraries = libraries;
	}

	public HashSet<String> getModules() {
		return modules;
	}

	public void setModules(HashSet<String> modules) {
		this.modules = modules;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}
	
}
