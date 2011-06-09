package org.mt.lic.eol.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHelper {
	/**
	 * Metodo che restituisce il contenuto di un dato file sotto forma di stringa
	 * @param fileName nome del file da leggere
	 * @return contenuto del file
	 */
	static public String readFileContent(String fileName){
		BufferedReader reader;
		StringBuffer main = new StringBuffer();
		try {
			reader = new BufferedReader(new FileReader(fileName));
			try {
				String line = null;
				while((line = reader.readLine()) != null){
					main.append(line);
					main.append(System.getProperty("line.separator"));
				}
			}finally{
				reader.close();
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("Errore: file "+fileName+" non trovato!");
			fnfe.printStackTrace();			
		} catch (IOException ioe) {
			System.err.println("Errore: lettura del file "+fileName+" fallita!");
			ioe.printStackTrace();
		}
		
		return main.toString();
	}
	
	/**
	 * Metodo che crea un nuovo file con il contenuto specificato
	 * @param fileName nome del file
	 * @param content contenuto da scrivere nel file
	 */
	static public void writeFileContent(String fileName, String content){
		File newFile = new File(fileName);
		try {
			newFile.createNewFile();
			BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
			// scrivi contenuto file
			writer.write(content);
			writer.close();
		} catch (IOException e) {
			System.err.println("Errore: creazione del file "+fileName+" fallita!");
			e.printStackTrace();
		}
	}
	
}
