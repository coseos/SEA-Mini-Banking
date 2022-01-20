package de.telekom.sea7.implementation;

import de.telekom.sea7.Application;
import de.telekom.sea7.Depot;
import de.telekom.sea7.DepotView;

public class ApplicationImpl implements Application {

	private Depot depot = new DepotImpl();
	// private List  model = new ArrayList(); // = new LinkedList();
	private DepotView  view  = new DepotViewImpl();
	
	public void run(String[] args) {
		
		// model.add(...)
		depot.add(new ZahlungImpl());
		depot.add(new ZahlungImpl());
		depot.add(new ZahlungImpl());
		
		// view.show(model);
		view.show(depot);
		
		System.out.println("Erstes objektorientes Programm");
	}
}
