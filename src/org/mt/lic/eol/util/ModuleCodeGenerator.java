package org.mt.lic.eol.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mt.lic.eol.eventOrientedLanguage.Program;

public class ModuleCodeGenerator extends CodeGenerator {
	
	static private ModuleCodeGenerator instance = null;
	
	private ModuleCodeGenerator(){};
	
	static public ModuleCodeGenerator getInstance(){
		if(instance == null){
			instance = new ModuleCodeGenerator();
		}
		return instance;
	}
	
//	public synchronized void generateModule(String moduleName, String folder, HandlerDecl object) {
//
//		// file .h
//		String content = FileHelper.readFileContent("static-source/template/struct_custom_handler.h");
//		content = content.replaceAll("__UPPERHANDLERCLASSNAME__", moduleName.toUpperCase());
//		content = content.replaceAll("__HANDLERCLASSNAME__", moduleName);
//		content = content.replaceAll("__HANDLERSTRUCTDEF__", CodeGeneratorHelper.formatStruct(object));		
//		FileHelper.writeFileContent(folder + moduleName + ".h", content);
//		
//		// file .cpp
//		content = FileHelper.readFileContent("static-source/template/struct_custom_handler.cpp");
//
//		content = content.replaceAll("__HANDLERCLASSNAME__", moduleName);
//		content = content.replaceAll("__HANDLERPARAMSCAST__", doSwitch(object));
//		content = content.replaceAll("__HANDLERBODY__", doSwitch(object.getBody()));
//		FileHelper.writeFileContent(folder + moduleName + ".cpp", content);
//	}
	
	private String moduleCode;
	private String moduleName;
	
	/**
	 * Metodo principale della classe che genera il codice del modulo specificato
	 * @param moduleName
	 * @param projectPath
	 */
	public synchronized void generateModule(String moduleName, String projectPath) {
		this.moduleName = moduleName;
		// leggi il file da compilare
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(moduleName), true);
		EObject root = resource.getContents().get(0);
		
		// lettura del template
		moduleCode = FileHelper.readFileContent("static-source/template/struct_module.cpp");
		// inizia la visita
		doSwitch(root);
		
		moduleCode = moduleCode.replaceAll("__MODULECLASSNAME__", moduleName);
		moduleCode = moduleCode.replaceAll("__HANDLERS__", null);
		moduleCode = moduleCode.replaceAll("__EVENTDECL__", null);
		moduleCode = moduleCode.replaceAll("__EVENTINIT__", null);
		moduleCode = moduleCode.replaceAll("__EVENTDELETE__", null);
		moduleCode = moduleCode.replaceAll("__INIT__", null);
		// le librerie sono inserite per ultime, dopo aver determinato le dipendenze
		moduleCode = moduleCode.replaceAll("__LIBRARIES__", null);
		
		FileHelper.writeFileContent(folder + moduleName + ".cpp", moduleCode);
	}

	@Override
	public String caseProgram(Program object) {
		String toReturn = FileHelper.readFileContent("static-source/template/struct_module.cpp");
		toReturn = toReturn.replace("__GLOBALVARS__", doSwitch(object.getGlobals()));
		toReturn = toReturn.replace("__HANDLERS__", 
				CodeGeneratorHelper.formatAllHandlerClasses(object.getHandlers(),moduleName));
		return toReturn;
	}
	
	
	
}	
