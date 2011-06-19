package org.mt.lic.eol;

import java.io.FileNotFoundException;

import org.mt.lic.eol.util.MainCodeGenerator;

/**
 * classe dedicata alle prove
 * @author marco tinacci
 *
 */
public class Test {
	public static void main(String[] args){
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();

		try {
			MainCodeGenerator cg = new MainCodeGenerator();
			cg.generateCode("examples/example01.eol", "generated-cpp/prova01/");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
