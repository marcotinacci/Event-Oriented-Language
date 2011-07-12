package org.mt.lic.eol.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.GlobalSection;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;
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
	 * @param types lista dei tipi
	 * @return stringa con una lettera per ogni tipo dei campi
	 */
	public static String formatFieldsType(List<Type> types) {
		StringBuffer buf = new StringBuffer();
		for (Type type: types) {
			switch (type) {
			case TINT:
				buf.append("i");
				break;
			case TREAL:
				buf.append("d");
				break;
			case TBOOL:
				buf.append("b");
				break;
			case TSTRING:
				buf.append("s");
			default:
				// TODO throw exception
				break;
			}
		}
		return buf.toString();
	}
	
	/**
	 * facciata alternativa del metodo formatFieldsType(List<Type>)
	 * @param params lista delle dichiarazioni dei parametri
	 * @return stringa con una lettera per ogni tipo dei campi
	 */
	public static String formatFieldsTypeFromParams(List<VariableDeclaration> params){
		List<Type> types = new LinkedList<Type>();
		for (VariableDeclaration param : params) {
			types.add(param.getType());
		}
		return formatFieldsType(types);
	}
	
	public static String formatStruct(List<Type> types) {
		String structName = NameConventions.DatatypeStructName(CodeGeneratorHelper.formatFieldsType(types));
		StringBuffer buf = new StringBuffer();
		
		buf.append("typedef struct " + structName + "{\n");
		int counter = 0;
		for (Type type: types) {
			buf.append("\t" + type + " var" + counter + ";\n");
			counter++;
		}
		buf.append("};\n\n");
		return buf.toString();
	}

	public static String formatParamsCast(String typeName) {
		// TODO modificare con i nomi delle variabili, dare dei caratteri suffissi a tutti i nomi per evitare sovrapposizioni
		return typeName + " *params = (" + typeName + "*)args;\n";
	}

	public static String formatAllStruct(HashSet<List<Type>> set) {
		StringBuffer toReturn = new StringBuffer();
		for (List<Type> types : set) {
			toReturn.append(formatStruct(types));
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

	public static String formatAllHandlerClasses(HandlerSection handlers, String moduleName) {
		StringBuffer toReturn = new StringBuffer();
		for (HandlerDecl handler : handlers.getHandlers()) {
			toReturn.append(formatHandlerClass(handler, moduleName)+'\n');
		}
		return toReturn.toString();
	}

	public static String formatHandlerClass(HandlerDecl handler, String moduleName) {
		String handlerModel = FileHelper.readFileContent("static-source/template/struct_handler.cpp");
		return handlerModel
			.replace("__HANDLERCLASSNAME__", NameConventions.HandlerClassName(handler.getName()))
			.replace("__MODULECLASSNAME__", NameConventions.ModuleClassName(moduleName))
			.replace("__HANDLERPARAMSCAST__", HandlerCodeGenerator.getInstance().doSwitch(handler))
			.replace("__HANDLERBODY__", HandlerCodeGenerator.getInstance().doSwitch(handler.getBody()));
	}

	public static String formatAllEventDeclarations(List<EventDecl> events) {
		StringBuffer toReturn = new StringBuffer();
		for (EventDecl event : events) {
			toReturn.append(formatEventDeclaration(event));
		}
		return toReturn.toString();
	}

	public static String formatEventDeclaration(EventDecl event) {
		return "Event* "+ event.getName() +";\n";
	}

	public static String formatAllEventAllocations(List<EventDecl> events) {
		StringBuffer toReturn = new StringBuffer();
		for (EventDecl event : events) {
			toReturn.append(formatEventAllocation(event));
		}
		return toReturn.toString();
	}

	public static String formatEventAllocation(EventDecl event) {
		return event.getName() + " = new Event();\n";
	}

	public static String formatAllEventDeallocations(
			List<EventDecl> events) {
		StringBuffer toReturn = new StringBuffer();
		for (EventDecl event : events) {
			toReturn.append(formatEventDeallocation(event));
		}
		return toReturn.toString();
	}

	public static String formatEventDeallocation(EventDecl event) {
		return "delete "+ event.getName() + ";\n";
	}

	public static String formatAllGlobalVariables(List<VariableDeclaration> vars) {
		StringBuffer toReturn = new StringBuffer();
		for (VariableDeclaration decl : vars) {
			toReturn.append(formatGlobalVariable(decl));
		}
		return toReturn.toString();
	}

	public static String formatGlobalVariable(VariableDeclaration decl) {
		return NameConventions.convertTypeName(decl.getType()) + " " + decl.getName() + ";\n";
	}

	public static String formatVariableReference(VariableDeclaration decl) {
		String toReturn = decl.getName();
		// caso variabile di modulo
		if(decl.eContainer() instanceof GlobalSection){
			return NameConventions.moduleReference() + toReturn;
		}
		return toReturn;
	}
	
}
