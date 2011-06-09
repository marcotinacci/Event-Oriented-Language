package org.mt.lic.eol.validation;

import org.eclipse.xtext.validation.Check;
import org.mt.lic.eol.eventOrientedLanguage.EventDecl;
 
public class EventOrientedLanguageJavaValidator extends AbstractEventOrientedLanguageJavaValidator {

//	@Check
//	public void checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.getName().charAt(0))) {
//			warning("Name should start with a capital", MyDslPackage.GREETING__NAME);
//		}
//	}

	@Check
	public void checkEventBinding(EventDecl decl){
		if(!decl.getName().startsWith("on")){
			warning("Event names should start with \"on\"", 0);
		}
	}

}
