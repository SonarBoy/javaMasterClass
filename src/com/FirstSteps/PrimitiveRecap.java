package com.FirstSteps;

public class PrimitiveRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * byte
		 * short
		 * int
		 * long 
		 * float
		 * double 
		 * char 
		 * boolean
		 */
		
		String name = "Heap Space";
		System.out.println("My String : "+ name);
		
		name = name + " This is more added.";
		System.out.println("My String : "+ name);
		
		name = name + " This is more added." + " \u00a9";
		System.out.println("My String : "+ name);
		
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println("My String: " + numberString);
		
		String lastString = "10";
		int myInt = 20;
		lastString = lastString + myInt;
		System.out.println("Last String: " +lastString);
		
		
		//Note: Strings in Java are immutable. That means you can't 
		//change a String after it's created. Instead, what happens is a 
		//new String is created. 
	}

}
