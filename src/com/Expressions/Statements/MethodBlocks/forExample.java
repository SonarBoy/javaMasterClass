package com.Expressions.Statements.MethodBlocks;

public class forExample {

	
	
	public static void main(String[] args) {

		
		for(int count = 1; count < 8; count++) {
			System.out.println("Interest gained on 10000 at a rate of " + count + " = " + calcInterest(10000d, count));
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for(int count = 8; count > 1; count--) {
			System.out.println("Interest gained on 10000 at a rate of " + count + " = " + calcInterest(10000d, count));
		}
		
		threeSumFive();
	}
	
	
	public static double calcInterest(double principal, double rate) {
		return (principal * (rate/100));
	}
	
	public static boolean isPrime(int x) {
		
		if(x == 1) {
			return false;
		}
		
		for(int num = 2; num <= (long) Math.sqrt(num);num++) {
			System.out.println("Looping " + num);
			
			if(x % num == 0) {
				return false;
			}
		}
		
		return true;
	}

	
	public static void threeSumFive() {
		
		int total = 0;
		int exitCond = 0;
		
		for(int runner = 1; runner <= 1000; runner++) {
			
			if(runner % 3 == 0 && runner % 5 == 0) {
				total += runner;
				exitCond++;
				System.out.println("Hit the number " + runner);
			}
			
			if(exitCond == 5) {
				break;
			}
		
			
		}
		
		System.out.println("Final Tally: "+ total);
		
	}
}
