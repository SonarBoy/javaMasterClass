package com.Expressions.Statements.MethodBlocks;

public class overloadingExample {

	public static void main(String[] args) {
		
		System.out.println(calcFeetAndInchesToCentimeters(5,12));

		System.out.println(calcFeetAndInchesToCentimeters(72));
	}
	
	public static double calcFeetAndInchesToCentimeters(int feet,int inches) {
		
		if(feet <= -1 || (inches < -1 || inches > 12)){
			System.out.println("Invalid Feet or Inches Parameter");
			return -1;
		}
		
		return ((feet * 12) * 2.54) + (inches * 2.54);
	}
	
	public static double calcFeetAndInchesToCentimeters(int inches) {
		
		if(inches <= -1) {
			System.out.println("Invalid Feet or Inches Parameter");
			return -1;
		}
		
		int methodFeet = (inches/12);
		int methodInches = (inches % 12); 

		return calcFeetAndInchesToCentimeters(methodFeet, methodInches);
		
				
	}

}
