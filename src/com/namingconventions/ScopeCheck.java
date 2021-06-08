package com.namingconventions;

public class ScopeCheck {
	public int publicVar = 0;
	private int privateVar = -1;

	
	public ScopeCheck() {
		System.out.println("Scope Check created, public var = " + publicVar +
				": privateVar = " + privateVar);
	}
	
	public int getPrivateVar() {
		return privateVar;
	}
	
	public void timesTwo() {
		
		System.out.println("New local privateVar in this method scope");
		int privateVar = 2;
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " times two is " + i * privateVar);
		}
	}
	
	public class InnerClass{
		public int privateVar = 3;
		
		public InnerClass() {
			System.out.println("Private Var: " + privateVar);
		}
		
		public void timesTwo() {
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " times two is " + i * privateVar);
			}
		}
		
		public void timesTwoOuter() {
			
			//takes the private var from the outer class
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " times two is " + i * ScopeCheck.this.privateVar);
			}
		}
		
	}
}
