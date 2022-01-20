package de.telekom.sea7.implementation;

import de.telekom.sea7.Depot;
import de.telekom.sea7.View;

public class ViewImplWithPrefix implements View {

	//               List model
	public void show(Depot model) {
		
		System.out.println("Überschrift");
//		for(Object object : model) {
//			System.out.println("Zahlung: " + object);
//		}
		
	}

}
