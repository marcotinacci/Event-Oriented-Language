package org.mt.lic.eol;

import java.io.FileNotFoundException;

import org.mt.lic.eol.util.CodeGenerator;

// TODO: gestire le librerie da includere (iostream ecc)

/**
 * classe dedicata alle prove
 * @author marco tinacci
 *
 */
public class Test {
	public static void main(String[] args){
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();

		//ResourceSet rs = new ResourceSetImpl();
		//Resource resource = rs.getResource(URI.createURI("./examples/example01.eol"), true);
		//EObject eobject = resource.getContents().get(0);
		//ASTPrinter printer = new ASTPrinter();
		//System.out.println(printer.doSwitch(eobject));
		
		try {
			CodeGenerator cg = new CodeGenerator();
			cg.generateCode("examples/example01.eol", "generated-cpp/prova01/");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
