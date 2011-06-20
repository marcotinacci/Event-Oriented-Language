package org.mt.lic.eol.util;

import org.mt.lic.eol.eventOrientedLanguage.Type;

/**
 * Convenzioni dei nomi usati nella generazione del codice
 * @author Marco Tinacci
 */
public class NameConventions {
	
	public static String HandlerClassName(String handlerName) {
		return "Handler_"+handlerName;
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
		default:
			// TODO throw exception
			toReturn = "";
		}
		return toReturn;
	}
}
