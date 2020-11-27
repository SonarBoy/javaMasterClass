package com.FirstSteps;

public class FloatAndDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Single precession number that occupies 32 bits. 2 ^ 5
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatVlaue = Float.MAX_VALUE;
		System.out.println("Min Float : " + myMinFloatValue);
		System.out.println("Max Float : " + myMaxFloatVlaue);
		
		
		//Double precession number that occupies 64 bits. 2 ^ 6
		Double myMinDoubleValue = Double.MIN_VALUE;
		Double myMaxDoubleVlaue = Double.MAX_VALUE;
		System.out.println("Min Double : " + myMinDoubleValue);
		System.out.println("Max Double : " + myMaxDoubleVlaue);
		
		int myIntValue = 5/3;
		float myFloatValue = 5F / 3F;
		
		//Note if you just treat number without a decimal point they turn into
		//ints double myDoubleValue = 5/3; will equate to 1.0 you have to do the 
		//following to get a double result
		double myDoubleValue = 5d / 3d;
		
		System.out.println("My Int: " + myIntValue);
		System.out.println("My Float: " + myFloatValue);
		System.out.println("My Double: " + myDoubleValue);
		
		//You should always use the double for the following reasons
		//1) Modern chips Process Doubles faster.
		//2) Most of the Java Math functions are written to process doubles and
		//   not floats.
		
		double anotherNumber = 3_000_000.543D;
		System.out.println("Another Double: " + anotherNumber);
		
		//Float and double are great for general floating point operations
		//but both are hot great to use where precise calculations are required
		//Java has a class called BigDecimal that overcomes this. We will talk more
		//about that later in the course. 
	}

}
