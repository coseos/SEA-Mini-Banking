package de.telekom.sea7;

public interface Depot {

	void add(Object object);
	
	Object get(int index);
	
	int size();

}
