package org.mt.lic.eol.generating;

import java.io.File;
import java.util.HashSet;

import org.mt.lic.eol.util.FileHelper;
import org.mt.lic.eol.util.NameConventions;

public class MainCodeGenerator{
	
	/**
	 * Metodo di generazione del codice, il generatore agisce su un file alla volta e
	 * salva nella cartella del progetto i file generati. 
	 * Con questo metodo vengono generati il file iniziale main.cpp, i vari moduli
	 * (<nomefile>.eol -> <nomefile>.cpp), il file contenente le strutture dati 
	 * necessarie Datatype.h, il makefile e le classi Event e Handler.
	 * @param fileName nome del file da compilare
	 * @param folder percorso del progetto
	 */
	public void generateCode(String mainFileName, String folder){
		
		String mainModuleName = NameConventions.getFileNameFromPath(mainFileName); 
		
		// insieme dei nomi dei moduli
		HashSet<String> moduleFiles = new HashSet<String>();
		moduleFiles.add(mainModuleName+".cpp");
		
		// crea cartella
		File project = new File(folder);
		project.mkdirs();
		
		// genera il modulo del file principale
		ModuleCodeGenerator.getInstance().generateModule(mainFileName, folder);
		
		// scrivi file principale main.cpp
		String mainFile = FileHelper.readFileContent("static-source/template/struct_main.cpp");
		mainFile = mainFile.replace("__MODULES__", CodeGeneratorHelper.formatModules(moduleFiles));
		mainFile = mainFile.replace("__MAIN__", CodeGeneratorHelper.formatMain(mainModuleName));
		FileHelper.writeFileContent(folder+"main.cpp", mainFile);
		
		// scrivi datatype
		StructCodeGenerator.getInstance().generateStructModule(folder);
		
		// scrivi makefile
		String makefile = FileHelper.readFileContent("static-source/template/struct_makefile");
		makefile = makefile.replace("__SOURCELIST__", CodeGeneratorHelper.formatMakefileSources(moduleFiles));
		makefile = makefile.replace("__EXENAME__", "eolprogram");
		FileHelper.writeFileContent(folder+"makefile", makefile);
		
		// copia include files
		FileHelper.writeFileContent(folder+"Event.h", FileHelper.readFileContent("static-source/include/Event.h"));
		FileHelper.writeFileContent(folder+"Event.cpp", FileHelper.readFileContent("static-source/include/Event.cpp"));
		FileHelper.writeFileContent(folder+"Handler.h", FileHelper.readFileContent("static-source/include/Handler.h"));
		FileHelper.writeFileContent(folder+"Handler.cpp", FileHelper.readFileContent("static-source/include/Handler.cpp"));
	}
	
	static private MainCodeGenerator instance = null;
	
	private MainCodeGenerator(){};
	
	static public MainCodeGenerator getInstance(){
		if(instance == null){
			instance = new MainCodeGenerator();
		}
		return instance;
	}
}
