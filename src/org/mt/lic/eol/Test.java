package org.mt.lic.eol;

import org.mt.lic.eol.generating.MainCodeGenerator;

// TODO eliminare la detach degli handler? si potrebbe direttamente deallocare l'evento e i rispettivi handler dal distruttore alla chiusura del blocco dove è stato dichiarato
// TODO generare il codice dei parametri di bind (stato degli handlers)
// TODO aggiungere interazione tra moduli
// TODO lanciare compilatore eol e compilatore c++ da bottone di eclipse

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
