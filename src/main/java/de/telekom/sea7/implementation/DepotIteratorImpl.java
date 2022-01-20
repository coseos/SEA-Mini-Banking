package de.telekom.sea7.implementation;

import java.util.Iterator;

import de.telekom.sea7.Depot;

public class DepotIteratorImpl implements Iterator {
	
	private Depot depot; // null
	private int i = 0; // -1;
	
	public DepotIteratorImpl(Depot depot) {
		this.depot = depot;
	}

	public boolean hasNext() {
		return( i < depot.size());	
		
		// boolean ergebnis = ( i < depot.size());
	    // 	return ergebnis;
		
		// return i < depot.size();
		
		// if   ( ergebnis ) {  //    i < depot.size() -> true / false
		//	return ergebnis; // ergebnis == true
		//} else {
		//	return ergebnis; // ergebnis == false;
		//}
	}

	public Object next() {
		return depot.get(i++);
	}

}
