package org.mt.lic.eol;

import org.mt.lic.eol.generating.MainCodeGenerator;


/**
 * classe dedicata alle prove
 * @author Marco Tinacci
 *
 */
public class Test {
	public static void main(String[] args){
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		MainCodeGenerator.getInstance().generateCode("examples/example01.eol", "generated-cpp/prova01/");		
	}

}
