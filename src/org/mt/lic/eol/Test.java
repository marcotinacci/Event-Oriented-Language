package org.mt.lic.eol;

import org.mt.lic.eol.util.ModuleCodeGenerator;

/**
 * classe dedicata alle prove
 * @author marco tinacci
 *
 */
public class Test {
	public static void main(String[] args){
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		ModuleCodeGenerator.getInstance().generateModule("examples/example01.eol", "generated-cpp/prova01/");
//		try {
//			MainCodeGenerator cg = new MainCodeGenerator();
//			cg.generateCode("examples/example01.eol", "generated-cpp/prova01/");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
	}

}
