package com.InterfacesExamples;

import com.Arrays.CanFly;

public class Penguin extends Bird implements CanFly{

	public Penguin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("I fly in water");
		
	}
	
	public void swin() {
		
	}

}
