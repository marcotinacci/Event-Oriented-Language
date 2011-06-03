package org.mt.lic.eol.util;

import org.mt.lic.eol.eventOrientedLanguage.Program;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

public class ASTPrinter extends EventOrientedLanguageSwitch<String> {
	
	@Override
	public String caseProgram(Program prog){
		String toReturn = "";
		toReturn += "eventi : " + prog.getEvents().getEvents() +'\n';
		toReturn += "globali: " + prog.getGlobals().getGlobals() +'\n';
		toReturn += "gestori: " + prog.getHandlers().getHandlers() + '\n';
		return toReturn;
	}
		
	
}
