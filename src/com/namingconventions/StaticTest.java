package com.namingconventions;

public class StaticTest {
	//Once a variable or field is declared static there will
	//only ever be one created.
	private static int numInstances = 0;
	private String name;
	
	public StaticTest(String name) {
		this.name = name;
		numInstances++;
	}
	
	public static int getNumInstances() {
		return numInstances;
	}
	
	public String getName() {
		return name;
	}
}
