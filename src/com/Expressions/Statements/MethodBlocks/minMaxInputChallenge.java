package com.Expressions.Statements.MethodBlocks;

import java.util.Scanner;

public class minMaxInputChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double min = 0;
		boolean firstInput = true;
		boolean firstValid = true;
		
		double max = 0;
		boolean secondValid = true;
		
		double inputValue = 0;
		
		while(true) {
			System.out.println("Enter a number");
			
			firstValid = scan.hasNextDouble();
			
			if(firstValid) {
				
				inputValue = scan.nextDouble();
				
				if(firstInput) {
					firstInput = false;
					min = inputValue;
					max = inputValue;
				}
				
				if(inputValue < min) {
					min = inputValue;
				}else if(inputValue > max) {
					max = inputValue;
				}else {
					
				}
			}else {
				System.out.println("Invalid Value");
				break;
			}
			
			scan.nextLine();
		}
		
		
		System.out.println("Max: " + max + " Min: " + min);
		
		
//		while(true) {
//			
//			System.out.println("Enter first Number: ");
//			
//			firstValid = scan.hasNextDouble();
//			if(firstValid) {
//				first = scan.nextDouble();
//				break;
//			}else{
//				System.out.println("Invalid Number");
//			}
//			
//			scan.nextLine();
//		
//		}
//			
//		while(true) {
//			System.out.println("Enter second Number: ");
//			scan.nextLine();
//			if(scan.hasNextDouble()) {
//				second = scan.nextDouble();
//				break;
//			}else{
//				System.out.println("Invalid Number");
//				
//			}
//			
//		}
//		
//		
//		if(first > second) {
//			System.out.println("First Number was Greater: " + first);
//		}
//		
//		if(second > first) {
//			System.out.println("Second Number was Greater: " + second);
//		}
//		
//		if(second == first) {
//			System.out.println("Both Numbers are equal: " + first + " " + second);
//		}
		
			
		
		

	}

}
