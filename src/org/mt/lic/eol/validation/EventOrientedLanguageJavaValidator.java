package org.mt.lic.eol.validation;

import org.eclipse.xtext.validation.Check;
import org.mt.lic.eol.eventOrientedLanguage.BindHandler;
import org.mt.lic.eol.eventOrientedLanguage.Program;
 
public class EventOrientedLanguageJavaValidator extends AbstractEventOrientedLanguageJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
//		}
//	}
	
	// example check
	@Check
	public void checkEventBinding(BindHandler bindHandler){
		if(!bindHandler.getEventName().startsWith("on")){
			warning("Event names should start with \"on\"", 0);
		}
	}
	
	
	@Check
	public void checkVariableDeclaration(Program program){
		
	}
}
