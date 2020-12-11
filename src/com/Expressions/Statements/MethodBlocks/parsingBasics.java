package com.Expressions.Statements.MethodBlocks;

public class parsingBasics {

	public static void main(String[] args) {
		String numberAsString = "2018";
		System.out.println("numberAsString = " + numberAsString);
		
		int number = Integer.parseInt(numberAsString);
		System.out.println("number = " + number);
		
		numberAsString += 1;
		number += 1;
		
		
		System.out.println("numberAsString = " + numberAsString);
		System.out.println("number = " + number);
		
		numberAsString = "2018.125";
		double doubleNumber = 2018.125;
		
		numberAsString += 1;
		doubleNumber += 1;
		
		System.out.println("numberAsString = " + numberAsString);
		System.out.println("number = " + doubleNumber);
		
	}

}
