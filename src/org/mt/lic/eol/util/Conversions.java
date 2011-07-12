package org.mt.lic.eol.util;

import java.util.LinkedList;
import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;

public class Conversions {
	
	/**
	 * metodo che converte la lista di dichiarazioni di variabili in
	 * una lista contenente solo i tipi con cui sono dichiarate
	 * @param vars lista di dichiarazioni
	 * @return lista di tipi
	 */
	static public List<Type> variablesToTypes(List<VariableDeclaration> vars){
		List<Type> types = new LinkedList<Type>();
		for (VariableDeclaration var : vars) {
			types.add(var.getType());
		}
		return types;
	}
}
