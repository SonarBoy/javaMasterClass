package com.concreteInheritance;

import java.util.Random;

public abstract class  Bicycle {
	
	protected double height;
	protected double weight;
	protected double tirePressure;
	
	
	public Bicycle(double h, double w, double t){
		this.height = h;
		this.weight = w;
		this.tirePressure = t;
	}
	
	protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
}
