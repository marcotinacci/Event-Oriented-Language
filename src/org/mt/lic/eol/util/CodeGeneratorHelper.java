package org.mt.lic.eol.util;

import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

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
	public static String formatFieldsType(List<VariableDeclaration> fields) {
		StringBuffer buf = new StringBuffer();
		for (VariableDeclaration decl: fields) {
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
		String structName = NameConventions.DatatypeStructName(CodeGeneratorHelper.formatFieldsType(object.getParams()));
		String upStructName = structName.toUpperCase();
		StringBuffer buf = new StringBuffer();
		
		buf.append("#ifndef _"+ upStructName +"_\n");
		buf.append("#define	_"+ upStructName +"_\n\n");
		buf.append("typedef struct "+ structName + "{\n");
		int counter = 0;
		for (VariableDeclaration decl: object.getParams()) {
			buf.append(decl.getType() + " var"+ counter +";\n");
			counter++;
		}
		buf.append("};\n");
		buf.append("#endif /* _"+ upStructName +"_ */\n");
		return buf.toString();
	}

	public static String formatParamsCast(String typeName) {
		// TODO modificare con i nomi delle variabili, dare dei caratteri suffissi a tutti i nomi per evitare sovrapposizioni
		return typeName + " *params = (" + typeName + "*)args;\n";
	}

	public static String formatAllStruct(EList<HandlerDecl> handlers) {
		StringBuffer toReturn = new StringBuffer();
		for (HandlerDecl decl : handlers) {
			toReturn.append(formatStruct(decl)+"\n");
		}
		return toReturn.toString();
	}

	public static String formatHandlerSignature(HandlerDecl handler) {
		return handler.getName() 
			+ formatParameters(handler.getBindParams(), true) 
			+ formatParameters(handler.getParams());
	}

	public static String formatEventSignature(EventDecl event) {
		return event.getName() + formatParameters(event.getParams());
	}
	
	public static String formatParameters(List<VariableDeclaration> params){
		return formatParameters(params, false);
	}
	
	public static String formatParameters(List<VariableDeclaration> params, Boolean isBind){
		StringBuffer toReturn = new StringBuffer();
		toReturn.append(isBind?'[':'(');
		if(params.size() != 0){
			toReturn.append(NameConventions.convertTypeName(params.get(0).getType()));
			for (int i = 1; i < params.size(); i++) {
				toReturn.append(", " + NameConventions.convertTypeName(params.get(i).getType()));				
			}
		}
		toReturn.append(isBind?']':')');
		return toReturn.toString();
	}
	
}
