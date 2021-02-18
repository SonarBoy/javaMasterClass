package com.Arrays;

import java.util.Arrays;

public class arrayReferenceTypeExample {

	public static void main(String[] args) {
		
		int myIntValue = 10;
		int anotherIntValue = myIntValue;
		
		System.out.println("My Int Value: " + myIntValue);
		System.out.println("My Int Another Value: " + anotherIntValue);
		
		
		int [] myIntArray = new int[5];
		int [] anotherArray = myIntArray;
		
		System.out.println("Regular toString()");
		System.out.println(myIntArray.toString()); 
		System.out.println(anotherArray.toString()); 
		
		System.out.println("My Int Array: " + Arrays.toString(myIntArray));
		System.out.println("My Antoher Int Array: " + Arrays.toString(anotherArray));
		
		anotherArray[0] = -1;
		
		System.out.println();
		System.out.println("After Change");
		System.out.println("My Int Array: " + Arrays.toString(myIntArray));
		System.out.println("My Antoher Int Array: " + Arrays.toString(anotherArray));
		
		modifyArray(myIntArray);
		
		System.out.println();
		System.out.println("After Static Method Reference Change");
		System.out.println("My Int Array: " + Arrays.toString(myIntArray));
		System.out.println("My Antoher Int Array: " + Arrays.toString(anotherArray));
	}
	
	private static void modifyArray(int [] array) {
		array[0] = 2;
	}

}
