package org.mt.lic.eol.util;

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
}
