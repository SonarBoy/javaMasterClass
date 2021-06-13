package com.namingconventions;

public class SIBTest {
	
	public static final String owner;
	 
	
	static {
		owner = "tim";
		System.out.println("SIBTest static init block called");
	}
	
	
	public SIBTest() {
		System.out.println("SIB Constructor called");
	}
	
	static {
		System.out.println("2nd initialization block called");
	}
	
	public void someMethod() {
		System.out.println("Some Method called");
	}
}
