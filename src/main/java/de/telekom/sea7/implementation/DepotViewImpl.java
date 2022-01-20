package de.telekom.sea7.implementation;

import de.telekom.sea7.Depot;
import de.telekom.sea7.DepotView;
import de.telekom.sea7.Zahlung;
import de.telekom.sea7.ZahlungView;

public class DepotViewImpl implements DepotView {

	//               List  model
	public void show(Depot depot) {
		
//		for(int i=0; i < depot.size(); i++) {
//			System.out.println(depot.get(i));
//		}
		
		for(Object object : depot) {
			Zahlung zahlung = (Zahlung) object;
			ZahlungView zahlungView = new ZahlungViewImpl();			
			zahlungView.show(zahlung);
// 			System.out.println(object);
		}
	}

}
