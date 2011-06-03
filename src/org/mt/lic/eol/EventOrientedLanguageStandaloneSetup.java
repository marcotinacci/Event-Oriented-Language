
package org.mt.lic.eol;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EventOrientedLanguageStandaloneSetup extends EventOrientedLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new EventOrientedLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

