package de.telekom.sea7.implementation;

import de.telekom.sea7.Zahlung;
import de.telekom.sea7.ZahlungView;

public class ZahlungViewImpl implements ZahlungView {

	public void show(Zahlung zahlung) {
		System.out.println(zahlung);
		
	}

}
