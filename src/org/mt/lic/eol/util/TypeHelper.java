package org.mt.lic.eol.util;

import java.util.List;

import org.mt.lic.eol.eventOrientedLanguage.Expression;
import org.mt.lic.eol.eventOrientedLanguage.Type;
import org.mt.lic.eol.eventOrientedLanguage.VariableDeclaration;
import org.mt.lic.eol.validation.TypeChecker;

public class TypeHelper {

	/**
	 * controlla se le due liste di parametri sono uguali, se e solo se 
	 * l'i-esimo parametro della prima lista ha lo stesso tipo dell'i-esimo
	 * parametro della seconda lista (e le liste hanno la stessa dimensione)  
	 * @param l1
	 * @param l2
	 * @return true se le liste sono uguali, false altrimenti
	 */
	public static Boolean sameParams(List<VariableDeclaration> l1,
			List<VariableDeclaration> l2) {
		if(l1.size() != l2.size())
			return false;
		for(int i = 0; i < l1.size(); i++){
			if(!l1.get(i).getType().equals(l2.get(i).getType()))
				return false;
		}
		return true;
	}

	/**
	 * restituisce il tipo ottenuto combinando due tipi in un operazione binaria
	 * generica
	 * @param t1
	 * @param t2
	 * @return tipo combinato
	 */
	public static Type combine(Type t1, Type t2) {
		if(t1.equals(t2)){
			return t1;
		}else if((t1.equals(Type.TREAL) && t2.equals(Type.TINT))
			|| (t2.equals(Type.TREAL) && t1.equals(Type.TINT))){
			return Type.TREAL;
		}
		// TODO throw exception
		return null;
	}
	
	/**
	 * determina se il primo tipo  utilizzabile come il secondo
	 * @param t1
	 * @param t2
	 * @return true se il primo tipo  compatibile con il secondo
	 */
	public static Boolean compatible(Type t1, Type t2) {
		return t1.equals(t2) || (t1.equals(Type.TINT) && t2.equals(Type.TREAL));
	}
	
	public static Boolean compatibleParams(List<Expression> expressions, 
			List<VariableDeclaration> params)
	{
		if(expressions.size() != params.size())
			return false;
		for(int i=0; i < expressions.size(); i++){
			if(!compatible( TypeChecker.getInstance().getType(expressions.get(i)),
					params.get(i).getType()))
				return false;
		}
		return true;
	}
}
