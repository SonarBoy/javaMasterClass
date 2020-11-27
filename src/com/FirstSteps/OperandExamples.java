package com.FirstSteps;

public class OperandExamples {
	public static void main(String[]args) {
		int result = 1 + 2;
		System.out.println("1 + 2 = "+result);
		
		int previousResult = result;
		System.out.println("previousResult = " + previousResult);
		
		result = result - 1;
		System.out.println("3 - 1 = " + previousResult);
		System.out.println("previousResult = " + previousResult);
		
		result = result * 10;
		System.out.println("2 * 10 = " + previousResult);
		
		result = result / 5;
		System.out.println("20 / 5 = " + result);
		
		result = result % 3;
		System.out.println("4 % 3 = "+ result);
		
		//Abbreviations
		result++; // 1 + 1 = 2;
		System.out.println("1 + 1 = "+ result);
		
		result--; // 2 - 1 = 1
		System.out.println("2 - 1 = "+ result);
		
		result += 2; //1 + 2 = 3
		System.out.println("1 + 2 = "+ result);
		
		result -= 2;
		System.out.println("3 - 2 = "+ result);
		
		result *= 10;
		System.out.println("10 * 1 = "+ result);
		
		result /= 5;
		System.out.println("10 / 5 = " + result);
	}
}
