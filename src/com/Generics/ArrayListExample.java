package com.Generics;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String [] args) {

		ArrayList<Integer> items = new ArrayList<>();
		//ArrayList items = new ArrayList();
		items.add(1);
		items.add(1);
		//items.add("John");
		items.add(1);
		items.add(1);
		
		printDouble(items);
	}
	

	private static void printDouble(ArrayList<Integer> list) {
		
		for(int item: list) {
			//System.out.println(item * 2);
			System.out.println(item * 2);
		}
	}

} 
