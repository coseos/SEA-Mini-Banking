package de.telekom.sea7;

import de.telekom.sea7.implementation.ApplicationImpl;

public class Starter {

	public static void main(String[] args) {
	    
		// Abstrakt/allgemein     Konkrete eine Anwendung auswähle
		Application application = new ApplicationImpl();
		
		application.run(args);

	} 

}
