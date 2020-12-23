package com.Expressions.Statements.MethodBlocks;

import java.util.Scanner;

public class readingUserInputChallenge {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		boolean isValidInt = true;
		int holder = 0;
		
		
		for(int runner = 0; runner < 10; runner++) {
			System.out.println("Enter the " + runner + " number: ");
			isValidInt = scan.hasNextInt();
			
			if(isValidInt) {
				holder += scan.nextInt();
			}else {
				System.out.println("Invalid Number Entered " +scan.next());
			}
			
			scan.nextLine();
		}
		
		
		System.out.println("Your final number " + holder);
		scan.close();
		
		
		timsReadingUserInputChallenge();
	}
	
	
	public static void timsReadingUserInputChallenge() {
		
		Scanner scanner = new Scanner(System.in);
		
		int counter = 0;
		int sum = 0;
		
		while(counter < 10) {
			
			int order = counter + 1;
			
			System.out.println("Enter number #"+order +":");
			
			boolean isAnInt = scanner.hasNextInt();
			
			if(isAnInt) {
				int number = scanner.nextInt();
				counter++;
				
				sum += number;
				
				if(counter == 10) {
					break;
				}
				
			}else {
				System.out.println("Invalid number");
			}
			
			scanner.nextLine();
		}
		
		
		System.out.println("sum = "+ sum);
		scanner.close();
	}
}
