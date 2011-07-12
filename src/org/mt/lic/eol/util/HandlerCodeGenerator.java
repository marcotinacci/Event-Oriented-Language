package org.mt.lic.eol.util;

import org.mt.lic.eol.eventOrientedLanguage.BooleanReference;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.ReadInput;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;

public class HandlerCodeGenerator extends CodeGenerator{
	
	static private HandlerCodeGenerator instance = null;
	
	private HandlerCodeGenerator(){};
	
	static public HandlerCodeGenerator getInstance(){
		if(instance == null){
			instance = new HandlerCodeGenerator();
		}
		return instance;
	}
	
	@Override
	public String caseVariableReference(VariableReference object) {
		return CodeGeneratorHelper.formatVariableReference(object.getVar());
	}

	@Override
	public String caseVariableAssign(VariableAssign object) {
		return CodeGeneratorHelper.formatVariableReference(object.getName()) 
			+ " = " + doSwitch(object.getValue()) + ";\n";
	}

	@Override
	public String casePrintOutput(PrintOutput object) {
		ModuleCodeGenerator.getInstance().getLibraries().add("iostream");
		return "std::cout << " + doSwitch(object.getOutput()) + " << std::endl;\n";
	}
	
	@Override
	public String caseReadInput(ReadInput object) {
		// aggiungi la libreria iostream al modulo
		ModuleCodeGenerator.getInstance().getLibraries().add("iostream");
		return "std::cin >> " + CodeGeneratorHelper.formatVariableReference(object.getInput()) + ";\n";
	}

	@Override
	public String caseBooleanReference(BooleanReference object) {
		return CodeGeneratorHelper.formatVariableReference(object.getVar());
	}
}
