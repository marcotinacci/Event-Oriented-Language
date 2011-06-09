package org.mt.lic.eol.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.EventSection;
import org.mt.lic.eol.eventOrientedLanguage.HandlerDecl;
import org.mt.lic.eol.eventOrientedLanguage.HandlerSection;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.UnbindHandler;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

public class CodeGenerator extends EventOrientedLanguageSwitch<String> {

	private final String MAIN_MODEL = "static-source/template/struct_main.cpp";
	private String folder;
	private HashSet<String> modules;
	private HashSet<String> libraries; 
	
	public CodeGenerator() {}
	
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
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(fileName), true);
		EObject eobject = resource.getContents().get(0);
		// scrivi file principale main.cpp
		FileHelper.writeFileContent(folder+"main.cpp", doSwitch(eobject));
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
		return toReturn;
	}

	@Override
	public String casePrintOutput(PrintOutput object) {
		libraries.add("iostream");
		return "std::cout << " + object.getOutput() + " << std:endl;\n";
	}

	@Override
	public String caseRaiseEvent(RaiseEvent object) {
		// TODO parametri di raise
		return object.getEventName().getName() + "->notify();\n";
	}

	@Override
	public String caseBindHandler(BindHandler object) {
		return object.getEventName().getName() + "->attach(" + object.getHandlerName().getName() + ");\n";
	}
	
	@Override
	public String caseUnbindHandler(UnbindHandler object) {
		return object.getEventName().getName() + "->detach(" + object.getHandlerName().getName() + ");\n";
	}

	@Override
	public String caseCompound(Compound object) {
		StringBuffer toReturn = new StringBuffer();
		toReturn.append("{\n");
		for (AbstractBlock block : object.getBody()) {
			toReturn = toReturn.append(doSwitch(block));
		}
		toReturn.append("}\n");
		return toReturn.toString();
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

		// definisci la nuova classe handler
		// file .h
		String content = FileHelper.readFileContent("static-source/template/struct_custom_handler.h");
		content = content.replaceAll("__HANDLERCLASSNAME__", handlerClassName);
		FileHelper.writeFileContent(folder+handlerClassName+".h", content);
		
		// file .cpp
		content = FileHelper.readFileContent("static-source/template/struct_custom_handler.cpp");
		content = content.replaceAll("__HANDLERCLASSNAME__", handlerClassName);
		// TODO gestire i parametri
		content = content.replaceAll("__HANDLERPARAMS__", "int var");
		// TODO gestire il corpo dell'update
		content = content.replaceAll("__HANDLERBODY__", "std::cout << \"Update var = \" << var << std::endl;\n");
		FileHelper.writeFileContent(folder+handlerClassName+".cpp", content);

		// aggiungi l'handler alle inclusioni
		modules.add(handlerClassName+".h");
		
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
		modules.add("Event.h");
		return "Event* "+object.getName() + " =  new Event();";
	}
}
