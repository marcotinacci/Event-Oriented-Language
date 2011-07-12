package org.mt.lic.eol.generating;

import java.io.File;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.util.FileHelper;
import org.mt.lic.eol.util.NameConventions;

class ModuleCodeGenerator extends CodeGenerator {
	
	static private ModuleCodeGenerator instance = null;
	
	private ModuleCodeGenerator(){};
	
	static public ModuleCodeGenerator getInstance(){
		if(instance == null){
			instance = new ModuleCodeGenerator();
		}
		return instance;
	}
	
	private String moduleCode;
	private String moduleName;
	
	/**
	 * Metodo principale della classe che genera il codice del modulo specificato
	 * @param moduleName
	 * @param projectPath
	 */
	public void generateModule(String sourceName, String projectPath) {
		reset();
		this.moduleName = NameConventions.getFileNameFromPath(sourceName);

		// crea cartella
		folder = projectPath;
		File project = new File(folder);
		project.mkdirs();

		// leggi il file da compilare
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.getResource(URI.createURI(sourceName), true);
		EObject root = resource.getContents().get(0);
		
		// inizia la visita
		moduleCode = doSwitch(root);
		// nome del modulo
		moduleCode = moduleCode.replaceAll("__MODULECLASSNAME__", NameConventions.ModuleClassName(moduleName));
		// scrittura inclusioni moduli
		moduleCode = moduleCode.replace("__MODULES__", CodeGeneratorHelper.formatModules(modules));
		// scrittura inclusioni librerie
		moduleCode = moduleCode.replace("__LIBRARIES__", CodeGeneratorHelper.formatLibraries(libraries));
		
		FileHelper.writeFileContent(folder + moduleName + ".cpp", moduleCode);
	}

	@Override
	public String caseProgram(Program object) {
		List<EventDecl> events = object.getEvents().getEvents();
		// lettura del template
		String toReturn = FileHelper.readFileContent("static-source/template/struct_module.cpp");
		// variabili globali
		toReturn = toReturn.replace("__GLOBALVARS__", 
				CodeGeneratorHelper.formatAllGlobalVariables(object.getGlobals().getGlobals()));
		// definizione degli handler del modulo
		toReturn = toReturn.replace("__HANDLERS__", 
				CodeGeneratorHelper.formatAllHandlerClasses(object.getHandlers(), moduleName));
		// dichiarazione degli eventi
		toReturn = toReturn.replace("__EVENTDECL__", CodeGeneratorHelper.formatAllEventDeclarations(events));
		// allocazione degli eventi nel costruttore
		toReturn = toReturn.replace("__EVENTINIT__", CodeGeneratorHelper.formatAllEventAllocations(events));
		// deallocazione degli eventi nel distruttore
		toReturn = toReturn.replace("__EVENTDELETE__", CodeGeneratorHelper.formatAllEventDeallocations(events));
		// corpo dell'init
		toReturn = toReturn.replace("__INIT__", doSwitch(object.getInit()));
		// aggiungi le strutture richieste dagli handler
		StructCodeGenerator.getInstance().addStructs(object.getHandlers().getHandlers());
		// includi il modulo delle definizioni delle strutture
		modules.add(NameConventions.getDatatypeFilename());
		return toReturn;
	}
	
}	
