package com.FirstSteps;

public class PrimitiveTypesChallenge {
	public static void main(String []args) {
		
		byte x = 100;
		short y = 200;
		int z = 300;
		
		long total = 50_000 + (10 * (x + y + z));
		
		short shortTotal = (short)total;
		
		System.out.println(total);
		System.out.println(shortTotal);
	}
}
