package org.mt.lic.eol.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.EventSection;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;
import org.mt.lic.eol.eventOrientedLanguage.Program;

public class MainCodeGenerator extends CodeGenerator {

	private final String MAIN_MODEL = "static-source/template/struct_main.cpp";
	
	public MainCodeGenerator() {
		super();
	}
	
	/**
	 * Metodo di generazione del codice, il generatore agisce su un file alla volta e
	 * salva nella cartella del progetto i file generati
	 * @param fileName nome del file da compilare
	 * @param projectPath percorso del progetto
	 * @throws FileNotFoundException
	 */
	public void generateCode(String fileName, String projectPath) throws FileNotFoundException{
		modules = new HashSet<String>();
		libraries = new HashSet<String>();
		// crea cartella
		folder = projectPath;
		File project = new File(folder);
		project.mkdirs();
		// leggi il file da compilare (eobject)
		ModuleCodeGenerator.getInstance().generateModule(fileName, projectPath);
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(fileName), true);
		EObject eobject = resource.getContents().get(0);
		// scrivi file principale main.cpp
		FileHelper.writeFileContent(folder+"main.cpp", doSwitch(eobject));
		
		// scrivi make file
		String makefile = FileHelper.readFileContent("static-source/template/struct_makefile");
		makefile = makefile.replaceFirst("__SOURCELIST__", CodeGeneratorHelper.formatMakefileSources(modules));
		makefile = makefile.replaceFirst("__EXENAME__", "eolprogram");
		FileHelper.writeFileContent(folder+"makefile", makefile);
		// copia include files
		FileHelper.writeFileContent(folder+"Event.h", FileHelper.readFileContent("static-source/include/Event.h"));
		FileHelper.writeFileContent(folder+"Event.cpp", FileHelper.readFileContent("static-source/include/Event.cpp"));
		FileHelper.writeFileContent(folder+"Handler.h", FileHelper.readFileContent("static-source/include/Handler.h"));
		FileHelper.writeFileContent(folder+"Handler.cpp", FileHelper.readFileContent("static-source/include/Handler.cpp"));
	}
	
	@Override
	public String caseProgram(Program object) {
		// carica la struttura del main
		String toReturn = FileHelper.readFileContent(MAIN_MODEL);
		// scrittura eventi
		toReturn = toReturn.replaceFirst("__EVENTS__", doSwitch(object.getEvents()));
		// scrittura gestori
		toReturn = toReturn.replaceFirst("__HANDLERS__", doSwitch(object.getHandlers()));
		// scrittura main
		toReturn = toReturn.replaceFirst("__INIT__", doSwitch(object.getInit()));
		// scrittura inclusioni moduli
		toReturn = toReturn.replaceFirst("__MODULES__", CodeGeneratorHelper.formatModules(modules));
		// scrittura inclusioni librerie
		toReturn = toReturn.replaceFirst("__LIBRARIES__", CodeGeneratorHelper.formatLibraries(libraries));
		// scrittura delle strutture necessarie al passaggio di valori tra gestori e eventi
		toReturn = toReturn.replaceFirst("__MAINSTRUCTDEF__", CodeGeneratorHelper.formatAllStruct(object.getHandlers().getHandlers()));
		
		return toReturn;
	}

	@Override
	public String caseHandlerSection(HandlerSection object) {
		StringBuffer toReturn = new StringBuffer();
		for(HandlerDecl handler : object.getHandlers()){
			toReturn.append(doSwitch(handler)+'\n');
		}
		return toReturn.toString();
	}

	@Override
	public String caseHandlerDecl(HandlerDecl object) {
		// nome della classe handler
		String handlerClassName = NameConventions.HandlerClassName(object.getName());
		
		// TODO appena commentata la seguente riga...
		//ModuleCodeGenerator.getInstance().generateModule(handlerClassName, folder, object);
		
		// aggiungi l'handler alle inclusioni
		modules.add(handlerClassName);

		return handlerClassName+"* "+object.getName() + " = new "+handlerClassName+"();";
	}

	@Override
	public String caseEventSection(EventSection object) {
		StringBuffer toReturn = new StringBuffer();
		for(EventDecl event : object.getEvents()){
			toReturn.append(doSwitch(event)+'\n');
		}
		return toReturn.toString();
	}

	@Override
	public String caseEventDecl(EventDecl object) {
		modules.add("Event");
		return "Event* "+object.getName() + " =  new Event();";
	}
}
