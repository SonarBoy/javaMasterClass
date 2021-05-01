package com.InterfacesExamples;

public interface NodeList {
	
	abstract ListItem getRoot();
	abstract boolean addItem(ListItem x);
	abstract boolean removeItem(ListItem x);
	abstract void traverse(ListItem root);
	
}
