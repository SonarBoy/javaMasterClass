package com.FirstSteps;

public class Testing {
	
	public static void main(String [] args) {
		int myValue = 10000;
		
		int myMinValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE;
		
		System.out.println(myMinValue);
		System.out.println(myMaxValue);
		
		System.out.println("Busted Min Int: " + (myMinValue + -1));
		System.out.println("Busted Max Int: " + myMaxValue + 1);
		
		
		int x = 9_000;
		
		System.out.println(x);
		
		
		byte minByteValue = Byte.MIN_VALUE;
		byte maxByteValue = Byte.MAX_VALUE;
		
		System.out.println(minByteValue);
		System.out.println(maxByteValue);
		
		short minShortValue = Short.MIN_VALUE;
		short maxShortValue = Short.MAX_VALUE;
		
		System.out.println(minShortValue);
		System.out.println(maxShortValue);
		
		
		long minLongValue = Long.MIN_VALUE;
		long maxLongValue = Long.MAX_VALUE;
		
		System.out.println(minLongValue);
		System.out.println(maxLongValue);
		
		long bigLong = -9223372036854775808L;
		
		
		int myTotal = myMinValue /2;
		
		//Throws error because the default value that java puts in numbers
		//is an int. Whats in parenthesis is treated as an int.
		//byte myNewByteValue = (minByteValue / 2);
		
		byte myNewByteValue = (byte)(minByteValue/2);
		short myNewShortValue = (short)(minShortValue / 2);
		
	}
	
}
