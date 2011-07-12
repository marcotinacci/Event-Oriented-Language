package org.mt.lic.eol.util;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

public class StructCodeGenerator {
	
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
	 * @param handlers
	 */
	public synchronized void generateStructModule(List<HandlerDecl> handlers){
		// lettura del template
		String moduleCode = FileHelper.readFileContent("static-source/template/struct_module.cpp");
		moduleCode = moduleCode.replaceFirst("__STRUCTDEFS__", CodeGeneratorHelper.formatAllStruct(datatypes));
	}
	
	/**
	 * resetta lo stato del generatore
	 */
	public void reset(){
		datatypes = new HashSet<List<Type>>();
	}
}
