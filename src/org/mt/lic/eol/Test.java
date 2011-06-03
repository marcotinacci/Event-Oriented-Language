package org.mt.lic.eol;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mt.lic.eol.util.ASTPrinter;

public class Test {
	public static void main(String[] args){
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();

		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI("./examples/example01.eol"), true);
		EObject eobject = resource.getContents().get(0);
		
		ASTPrinter printer = new ASTPrinter();
		System.out.println(printer.doSwitch(eobject));
		
		
		
		
	}

}
