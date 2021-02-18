package com.Arrays;

import java.util.Scanner;

public class MinimumElement {
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		scanner.hasNextLine();
		
		int [] returnedArray = readInteger(count);
		
		int returnedMin = findMin(returnedArray);
		System.out.println("Min: " + returnedMin);
		
	}
	
	
	private static int findMin(int [] array) {
		int min = Integer.MAX_VALUE;
		
		for(int runner = 0; runner < array.length; runner++) {
			int value = array[runner];
			
			if(value < min) {
				min = value;
			}
			
		}
		
		return min;
	}
	
	
	
	private static int[] readInteger(int count) {
		int[] array = new int[count];
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter a number: ");
			int number = scanner.nextInt();
			
			scanner.nextLine();
			array[i] = number;
		}
		
		return array;
	}
}
