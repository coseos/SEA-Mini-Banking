package de.telekom.sea7.implementation;

import de.telekom.sea7.Depot;
import de.telekom.sea7.DepotView;

public class DepotViewImplWithPrefix implements DepotView {

	//               List model
	public void show(Depot model) {
		
		System.out.println("Überschrift");
		for(Object object : model) {
			
			System.out.println("Zahlung: " + object);
		}
		
	}

}
