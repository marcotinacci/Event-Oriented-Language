package org.mt.lic.eol.generating;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.util.FileHelper;
import org.mt.lic.eol.util.NameConventions;

class StructCodeGenerator {
	
	private static StructCodeGenerator instance = null;
	
	private StructCodeGenerator(){
		datatypes = new HashSet<List<Type>>();
	}
	
	public static StructCodeGenerator getInstance(){
		if(instance == null){
			instance = new StructCodeGenerator();
		}
		return instance;
	}
	
	private HashSet<List<Type>> datatypes;
	
	/**
	 * metodo che incrementa l'insieme di strutture considerate considerando
	 * le signature degli handler
	 * @param handlers
	 */
	public void addStructs(List<HandlerDecl> handlers){
		for (HandlerDecl handler : handlers) {
			List<Type> types = new LinkedList<Type>();
			for (VariableDeclaration decl : handler.getParams()) {
				types.add(decl.getType());
			}
			datatypes.add(types);
		}
	}
	
	/**
	 * genera il modulo contenente le definizioni delle strutture necessarie
	 */
	public void generateStructModule(String folder){
		// lettura del template
		String structCode = FileHelper.readFileContent("static-source/template/struct_datatype.cpp");
		structCode = structCode.replaceFirst("__STRUCTDEFS__", CodeGeneratorHelper.formatAllStruct(datatypes));
		FileHelper.writeFileContent(folder + NameConventions.getDatatypeFilename(), structCode);
	}
	
	/**
	 * resetta lo stato del generatore
	 */
	public void reset(){
		datatypes = new HashSet<List<Type>>();
	}
}
