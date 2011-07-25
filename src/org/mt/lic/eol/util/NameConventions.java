package org.mt.lic.eol.util;

import java.io.File;

import org.mt.lic.eol.eventOrientedLanguage.Type;

/**
 * Convenzioni dei nomi usati nella generazione del codice
 * @author Marco Tinacci
 */
public class NameConventions {
	
	public static String HandlerClassName(String handlerName) {
		return "Handler_" + handlerName;
	}

	public static String DatatypeStructName(String typeSuffix) {
		return "datatype_" + typeSuffix;
	}
	
	public static String convertTypeName(Type type){
		String toReturn;
		switch(type){
		case TBOOL:
			toReturn = "bool";
			break;
		case TINT:
			toReturn = "int";
			break;
		case TREAL:
			toReturn = "double";
			break;
		case TSTRING:
			toReturn = "string";
		default:
			// TODO throw exception
			toReturn = "";
		}
		return toReturn;
	}

	public static String ModuleClassName(String moduleName) {
		return "Module_" + moduleName;
	}

	public static String getFileNameFromPath(String path) {
		return path.substring(path.lastIndexOf(File.separatorChar) + 1, 
				path.lastIndexOf('.'));
	}

	public static String moduleReference() {
		return "module";
	}

	public static String getDatatypeFilename() {
		return "Datatype.h";
	}
}
