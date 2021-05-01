package com.InterfacesExamples;

public abstract class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println("Eating with beak");
		
	}

	@Override
	public void breathe() {
		System.out.println("Bird is eating.");
		
	}
	
	
}
