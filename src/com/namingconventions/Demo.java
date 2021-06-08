package com.namingconventions;

public class Demo {
	public static void main(String [] args) {
		
		java.lang.Integer x =  8;
		
//		MyWindow test = new MyWindow("Hello");
//		test.setVisible(true);
		//org.w3c.dom.Node node = null;
		
		
		
		String privateVar = "This is private to main()";
		
		ScopeCheck scopeInstance = new ScopeCheck();
		System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
		
		//this will return the private var that is a string and not the private var from the 
		//ScopeCheck class.
		System.out.println(privateVar);
		
		scopeInstance.timesTwo();
		
		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		
		innerClass.timesTwo();
		innerClass.timesTwoOuter();
	}
}
