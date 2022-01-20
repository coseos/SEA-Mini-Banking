package de.telekom.sea7.implementation;

import de.telekom.sea7.Application;
import de.telekom.sea7.Depot;
import de.telekom.sea7.View;

public class ApplicationImpl implements Application {

	private Depot depot = new DepotImpl();
	// private List  model = new ArrayList(); // = new LinkedList();
	private View  view  = new ViewImpl();
	
	public void run(String[] args) {
		
		// model.add(...)
		depot.add(new ZahlungImpl());
		depot.add(new ZahlungImpl());
		depot.add(new ZahlungImpl());
		
		// view.sho(model);
		view.show(depot);
		
		System.out.println("Erstes objektorientes Programm");
	}
}
