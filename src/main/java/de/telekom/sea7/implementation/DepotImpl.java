package de.telekom.sea7.implementation;

import de.telekom.sea7.Depot;

// Depot/DepotImpl: die ArrayList (ähnlich) nachbauen
public class DepotImpl implements Depot {

	private Object[] objekte = new Object[9];
	private int anzahl;
	
	public void add(Object objekt) {
		objekte[anzahl++] = objekt;		
	}

	public Object get(int index) {		
		return objekte[index];
	}
	
	public int size() {
		return anzahl;
	}

}
