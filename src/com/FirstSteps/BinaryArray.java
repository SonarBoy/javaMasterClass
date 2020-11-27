package com.FirstSteps;

public class BinaryArray {

	public static void main(String[] args) {
		
		int[] array = {0,1,0,1,0,1,0,0,0,0,1};
		
		int counter = 0;
		
		for(int x: array) {
			if(x == 0) {
				counter++;
			}
		}
		
		for(int runner = 0; runner < counter;runner++) {
			array[runner] = 0;
		}
		
		for(int runner = counter; runner < array.length;runner++) {
			array[runner] = 1;
		}
		
		for(int x:array) {
			System.out.println(x);
		}

	}

}
