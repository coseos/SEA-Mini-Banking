package de.telekom.sea7.implementation;

import de.telekom.sea7.Depot;
import de.telekom.sea7.View;

public class ViewImpl implements View {

	//               List  model
	public void show(Depot depot) {
		
		for(int i=0; i < depot.size(); i++) {
			System.out.println(depot.get(i));
		}
		
//		for(Object object : model) {
//			System.out.println(object);
//		}
		
	}

}
