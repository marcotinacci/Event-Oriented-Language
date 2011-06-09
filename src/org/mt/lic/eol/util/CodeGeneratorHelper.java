package org.mt.lic.eol.util;

import java.util.HashSet;

public class CodeGeneratorHelper {
	
	/**
	 * Metodo di formattazione delle inclusioni dei moduli c++
	 * @param modules insieme dei nomi dei moduli
	 * @return Stringa di inclusione dei moduli in sintassi c++
	 */
	static public String formatModules(HashSet<String> modules){
		StringBuffer toReturn = new StringBuffer();
		for (String module : modules) {
			toReturn.append("#include \""+module+"\"\n");
		}
		return toReturn.toString();
	}
	
	/**
	 * Metodo di formattazione delle librerie c++
	 * @param libraries insieme dei nomi delle librerie
	 * @return Stringa di inclusione delle librerie in sintassi c++
	 */
	static public String formatLibraries(HashSet<String> libraries){
		StringBuffer toReturn = new StringBuffer();
		for (String library : libraries) {
			toReturn.append("#include <"+library+">\n");
		}
		return toReturn.toString();
	}
	
}
