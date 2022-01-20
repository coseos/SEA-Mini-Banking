package de.telekom.sea7;

import java.util.Iterator;

public interface Depot extends Iterable {

	void add(Object object);
	
	Object get(int index);
	
	int size();
	
	Iterator iterator(); // Nur für das "for" (each)

}
