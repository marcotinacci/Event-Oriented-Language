package org.mt.lic.eol.generating;

import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.ReadInput;
import org.mt.lic.eol.eventOrientedLanguage.VariableAssign;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.VariableReference;
import org.mt.lic.eol.util.NameConventions;

class HandlerCodeGenerator extends CodeGenerator{
	
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
		toReturn.append(NameConventions.moduleReference()
				+object.getEvent().getName() + "->setState(state);\n");
		toReturn.append(NameConventions.moduleReference()
				+object.getEvent().getName() + "->notify();\n");
		return toReturn.toString();
	}
	
	@Override
	public String caseHandlerDecl(HandlerDecl object) {
		
		// controlla se  necessario inserire un cast
		if(object.getParams().size() > 0){
			
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
		return "";
	}
	
}
