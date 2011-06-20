package org.mt.lic.eol.util;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.ParameterDeclaration;
import org.mt.lic.eol.eventOrientedLanguage.Type;

public class CodeGeneratorHelper {
	
	/**
	 * Metodo di formattazione delle inclusioni dei moduli c++
	 * @param modules insieme dei nomi dei moduli
	 * @return Stringa di inclusione dei moduli in sintassi c++
	 */
	static public String formatModules(HashSet<String> modules){
		StringBuffer toReturn = new StringBuffer();
		for (String module : modules) {
			toReturn.append("#include \""+module+".h\"\n");
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

	public static String formatMakefileSources(HashSet<String> modules) {
		StringBuffer toReturn = new StringBuffer();
		for (String module : modules) {
			toReturn.append(module+".cpp ");
		}
		return toReturn.toString();
	}
	
	/**
	 * metodo che definisce il suffisso del nome della struttura dati per il passaggio di parametri
	 * (i.e. con un int avremo "i", con un bool, un double e un int avremo "bdi" e cos“ via)
	 * @param object dichiarazione dell'handler
	 * @return stringa con una lettera per ogni tipo dei campi
	 */
	public static String formatFieldsType(HandlerDecl object) {
		StringBuffer buf = new StringBuffer();
		for (ParameterDeclaration decl: object.getParams()) {
			switch (decl.getType().getValue()) {
			case Type.TINT_VALUE:
				buf.append("i");
				break;
			case Type.TREAL_VALUE:
				buf.append("d");
				break;
			case Type.TBOOL_VALUE:
				buf.append("b");
				break;
			default:
				// TODO throw exception
				break;
			}
		}
		return buf.toString();
	}
	
	public static String formatStruct(HandlerDecl object) {
		String structName = NameConventions.DatatypeStructName(CodeGeneratorHelper.formatFieldsType(object));
		String upStructName = structName.toUpperCase();
		StringBuffer buf = new StringBuffer();
		
		buf.append("#ifndef _"+ upStructName +"_\n");
		buf.append("#define	_"+ upStructName +"_\n\n");
		buf.append("typedef struct "+ structName + "{\n");
		int counter = 0;
		for (ParameterDeclaration decl: object.getParams()) {
			buf.append(decl.getType() + " var"+ counter +";\n");
			counter++;
		}
		buf.append("};\n");
		buf.append("#endif /* _"+ upStructName +"_ */\n");
		return buf.toString();
	}

	public static String formatParamsCast(String typeName) {
		return typeName + " *params = (" + typeName + "*)args;\n";
	}

	public static String formatAllStruct(EList<HandlerDecl> handlers) {
		StringBuffer toReturn = new StringBuffer();
		for (HandlerDecl decl : handlers) {
			toReturn.append(formatStruct(decl)+"\n");
		}
		return toReturn.toString();
	}
	
}
