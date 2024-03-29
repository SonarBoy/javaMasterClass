package com.Arrays;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList() {
		System.out.println("You have "+groceryList.size()
		+ " items in your grocery list");
		
		for(int runner = 0; runner < groceryList.size(); runner++) {
			System.out.println((runner + 1)+ ". "+groceryList.get(runner));
		}
	
	}
	
	public void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position, newItem);
	}
	
	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem) {
		boolean exists = groceryList.contains(searchItem);
		
		int position = groceryList.indexOf(searchItem);
		if(position >= 0) {
			return groceryList.get(position);
		}
		
		return null;
	}
}
