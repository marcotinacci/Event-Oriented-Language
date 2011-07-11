package org.mt.lic.eol.util;

import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;

public class ModuleCodeGenerator extends CodeGenerator {
	
	public ModuleCodeGenerator(String moduleName, String folder, HandlerDecl object) {

		// file .h
		String content = FileHelper.readFileContent("static-source/template/struct_custom_handler.h");
		content = content.replaceAll("__UPPERHANDLERCLASSNAME__", moduleName.toUpperCase());
		content = content.replaceAll("__HANDLERCLASSNAME__", moduleName);
		content = content.replaceAll("__HANDLERSTRUCTDEF__", CodeGeneratorHelper.formatStruct(object));		
		FileHelper.writeFileContent(folder + moduleName + ".h", content);
		
		// file .cpp
		content = FileHelper.readFileContent("static-source/template/struct_custom_handler.cpp");

		content = content.replaceAll("__HANDLERCLASSNAME__", moduleName);
		content = content.replaceAll("__HANDLERPARAMSCAST__", doSwitch(object));
		content = content.replaceAll("__HANDLERBODY__", doSwitch(object.getBody()));
		FileHelper.writeFileContent(folder + moduleName + ".cpp", content);
	}

	
}	
