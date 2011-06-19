package org.mt.lic.eol.util;

import java.util.HashSet;

import org.mt.lic.eol.eventOrientedLanguage.AbstractBlock;
import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.Compound;
import org.mt.lic.eol.eventOrientedLanguage.PrintOutput;
import org.mt.lic.eol.eventOrientedLanguage.RaiseEvent;
import org.mt.lic.eol.eventOrientedLanguage.UnbindHandler;
import org.mt.lic.eol.eventOrientedLanguage.util.EventOrientedLanguageSwitch;

public class CodeGenerator extends EventOrientedLanguageSwitch<String> {
	
	protected HashSet<String> libraries;
	protected HashSet<String> modules;
	protected String folder;
	
	public CodeGenerator() {
		libraries = new HashSet<String>();
		modules = new HashSet<String>();
	}
	
	@Override
	public String casePrintOutput(PrintOutput object) {
		libraries.add("iostream");
		return "std::cout << " + object.getOutput() + " << std::endl;\n";
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
	public String caseRaiseEvent(RaiseEvent object) {
		// TODO parametri di raise
		//data_consume *x = new data_consume;
		//x->var1 = 10;
		//x->var2 = 3;
		//onProduce->setState(x);
		
		// String structName = NameConventions.HandlerStructName(object.get);
		StringBuffer buf = new StringBuffer();
		buf.append(" *x = new data_consume;");
		
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
}
