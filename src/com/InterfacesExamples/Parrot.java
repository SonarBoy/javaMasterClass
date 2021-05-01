package com.InterfacesExamples;

import com.Arrays.CanFly;

public class Parrot extends Bird implements CanFly {

	public Parrot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Flitting from branch to branch.");
		
	}
	
	
}
