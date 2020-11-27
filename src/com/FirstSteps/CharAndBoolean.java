package com.FirstSteps;

public class CharAndBoolean {

	public static void main(String[] args) {
		
		//char occupies two bytes of memory or 16 bits and 
		//thus has a width of 16. The reason it's not just a single byte
		//is that it allows you to store unicode charaters. 
		char myChar = 'D';
		
		char myUnicodeExample = '\u00A9';
		
		System.out.println(myChar);
		System.out.println(myUnicodeExample);
		
		
		//When creating boolean variable names make them a true or false
		//question because its easier to read. 
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanVlaue = false;
		
		boolean isCustomerOverEighteen = true;
		
		

	}

}
