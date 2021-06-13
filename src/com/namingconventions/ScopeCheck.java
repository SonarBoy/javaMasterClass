package com.namingconventions;

public class ScopeCheck {
	public int publicVar = 0;
	private int privateVarOne = -1;

	
	public ScopeCheck() {
		System.out.println("Scope Check created, public var = " + publicVar +
				": privateVar = " + privateVarOne);
	}
	
	public int getPrivateVar() {
		return privateVarOne;
	}
	
	public void timesTwo() {
		
		System.out.println("New local privateVar in this method scope");
		int privateVarTwo = 2;
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " times two is " + i * privateVarTwo);
		}
	}
	
	public void useInner() {
		InnerClass innerClass = new InnerClass();
		System.out.println("Var Three from outer class " + innerClass.privateVarThree);
	}
	
	public class InnerClass{
		public int privateVarThree = 3;
		
		public InnerClass() {
			System.out.println("Private Var: " + privateVarThree);
		}
		
		public void timesTwo() {
			
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " times two is " + i * privateVarThree);
			}
		}
		
		public void timesTwoOuter() {
			
			//takes the private var from the outer class
			System.out.println("Private Var One is here as well: " + privateVarOne );
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " times two is " + i * ScopeCheck.this.privateVarOne);
			}
		}
		
	}
}
