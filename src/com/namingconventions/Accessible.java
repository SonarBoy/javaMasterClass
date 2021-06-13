package com.namingconventions;

interface Accessible { //Package Private: eventhing in com.namingconventions can see it
	int SOME_CONSTANT = 100; // All interface variables are public static final
	public void methodA(); //Standard Public
	void methodB();// All interface variables are public 
	boolean methodC();//  All interface variables are public 
}
