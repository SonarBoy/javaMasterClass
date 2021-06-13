package com.FirstSteps;

public class bitwiseOperator {
	public static void main(String [] args) {
		
		System.out.println("Byte Max Value: " + Integer.toBinaryString(Byte.MAX_VALUE));
		System.out.println();
		System.out.println();
				
		
		byte val1 = 12;  // 0000 1100
		byte val2 = 10;  // 0000 1010
		byte val3 = 16;
		byte res;
	
		
		System.out.println("Bitwise Compliment");
		System.out.println("Input " + Integer.toBinaryString(val1));
		res = (byte) ~val1;
		System.out.println(res);
		
		int formatLength = Integer.toBinaryString(res).length();
		
		System.out.println("Output " + Integer.toBinaryString(res).substring(formatLength-5, formatLength));
		System.out.println();
		
		System.out.println("Bitwise AND");
		res = (byte) (val1 & val2);
		System.out.println(Integer.toBinaryString(val1));
		System.out.println(Integer.toBinaryString(val2));
		System.out.println();
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		System.out.println();
		
		System.out.println("Bitwise OR");
		res = (byte) (val1 | val2);
		System.out.println(Integer.toBinaryString(val1));
		System.out.println(Integer.toBinaryString(val2));
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		System.out.println();
		
		System.out.println("Bitwise XOR");
		res = (byte) (val1 ^ val2);
		System.out.println(Integer.toBinaryString(val1));
		System.out.println(Integer.toBinaryString(val2));
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		System.out.println();
		
		System.out.println("Bitwise Left Shift");
		res = (byte)(val1 << 2);
		System.out.println(Integer.toBinaryString(val1));
		
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		System.out.println();
		
		System.out.println("Bitwise Right Shift");
		res = (byte)(val1 >> 2);
		System.out.println(Integer.toBinaryString(val1));
		
		System.out.println(res);
		System.out.println(Integer.toBinaryString(res));
		System.out.println();
		
		
		System.out.println(sumXor(10));
		System.out.println(SumXOR(10));
	}
	
	
	public static int sumXor(int n) {
	    
		   
	    int ans = 0;
	    
	    
	    
	    while (n > 0){
	    	
	    	System.out.println(n + ":  " + Integer.toBinaryString(n));
	    	System.out.println(2+ ":  " + Integer.toBinaryString(2));
	    	
	    	
	    	
	       if (n % 2 == 0) {
	    	   System.out.println("--------XOR SUCCESS---------");
	    	   ans++;
	       }
	       
	       System.out.println();
	       n /= 2;
	    }

	    return  (int) Math.pow(2 , ans);
	 
	}
	
	public static int SumXOR(int n) {
		
		int ans = 0;
		
		int firstNumber = 0;
		int secondNumber = 0;
		
		
		for(int runner = 0; runner < n; runner++) {
			
			firstNumber = runner + n;
			secondNumber = n ^ runner;
			
			if(firstNumber == secondNumber) {
				System.out.println(n + ":  "+Integer.toBinaryString(n));
				System.out.println(runner + ":  " + Integer.toBinaryString(runner));
				System.out.println();
				ans++;
			}
			
		}
		
		return ans;
	}
}
