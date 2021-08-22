package com.concreteInheritance;

import java.util.ArrayList;

public class Garage <T extends Bicycle> {
	
	private ArrayList<T> bycycleStock = new ArrayList<T>();
	
	
	public void addBike(T bike) {
		this.bycycleStock.add(bike);
	}
	
	
	
}
