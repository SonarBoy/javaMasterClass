package com.Arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Array = " + Arrays.toString(array));
		
		reverseTim(array);
		
		System.out.println("Array = " + Arrays.toString(array));
		
	}
	
	private static void reverseTim(int [] array) {
		
		int maxIndex = array.length - 1;
		int halfLength = array.length / 2;
		
		for(int runner = 0; runner < halfLength; runner++) {
			
			int temp = array[runner];
			array[runner] = array[maxIndex - runner];
			array[maxIndex - runner] = temp;
			
		}
		
		
	}

}
