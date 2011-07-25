package org.mt.lic.eol;

import org.mt.lic.eol.generating.MainCodeGenerator;

// TODO gestire la consumabilitˆ degli eventi
// TODO generare il codice dei parametri di bind (stato degli handlers)
// TODO lanciare compilatore eol e compilatore c++ da bottone di eclipse
// TODO type check

// TODO terminare controlli
// TODO relazione

/**
 * classe dedicata alle prove
 * @author Marco Tinacci
 *
 */
public class Test {
	public static void main(String[] args){
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
		MainCodeGenerator.getInstance().generateCode("examples/example02.eol", "generated-cpp/prova01/");		
	}

}
