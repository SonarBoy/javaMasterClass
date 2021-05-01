package com.Arrays;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		// Here Java just saves the memory address rather than create a new Object.
		Customer customer = new Customer("Tim", 100);
		customer.setType("Basic Customer");
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setType("Testing Customer");
		
		System.out.println("Type for customer "+ customer.getType() + 
				"Type for another customer " + customer.getType());
		
		
		LinkedList<String> placesToVisit = new LinkedList<String>();
		
		addInOrder("F", placesToVisit);
		addInOrder("D", placesToVisit);
		addInOrder("C", placesToVisit);
		addInOrder("B", placesToVisit);
		addInOrder("A", placesToVisit);
		
		
//		placesToVisit.add("a");
//		placesToVisit.add("b");
//		placesToVisit.add("c");
//		placesToVisit.add("d");
//		placesToVisit.add("e");
//		placesToVisit.add("f");
		
//		for(int i = 0; i < placesToVisit.size(); i++) {
//			System.out.println("Places to visit: " + placesToVisit.get(i));
//		}
		
		printList(placesToVisit);
		
		placesToVisit.add(2, "Z");
		System.out.println();
		
//		for(int i = 0; i < placesToVisit.size(); i++) {
//			System.out.println("Places to visit: " + placesToVisit.get(i));
//		}
//		
		printList(placesToVisit);
		
		placesToVisit.remove(2);
		System.out.println();
		
		printList(placesToVisit);
		
		
		visit(placesToVisit);
	}
	
	private static void printList(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println("Now Visiting " + i.next());
		}
		
		System.out.println("==============================");
		
	}
	
	private static boolean addInOrder(String newCity, LinkedList<String> list) {
		ListIterator<String> stringListIterator = list.listIterator();
		
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			
			if(comparison == 0) {
				System.out.println(newCity + " is already included as a destination");
			}else if(comparison > 0) {
				// new City should appear before this one. 
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if(comparison < 0) {
				// move on next city
			}
		}
		
		
		stringListIterator.add(newCity);
		return true;
		
	}

	
	private static void visit(LinkedList cities) {
		Scanner scan = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true; 
		
		ListIterator<String> listIterator = cities.listIterator();
		
		if(cities.isEmpty()) {
			System.out.println("No Cities in the itenerary");
			return;
		}else {
			System.out.println("Now Visiting " + listIterator.next());
			printMenu();
		}
		
		while(!quit) {
			int action = scan.nextInt();
			scan.nextLine();
			
			switch(action) {
				case 0:
					System.out.println("Holiday over");
					quit = true;
					
					break;
					
				case 1:
					
					if(!goingForward) {
						if(listIterator.hasNext()) {
							listIterator.next();
						}
						goingForward =  true;
					}
					
					if(listIterator.hasNext()) {
						System.out.println("Now Visiting " + listIterator.next());
					}else{
						System.out.println("Reached the end of the list");
						goingForward = false;
					}
						
					break;
					
				case 2:
					
					if(goingForward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						goingForward =  false;
					}
					
					
					if(listIterator.hasPrevious()) {
						System.out.println("Now visiting " + listIterator.previous());
					}else {
						System.out.println("We are at the start of the list");
						goingForward = true;
					}
					break;
					
				case 3:
					printMenu();
					break;
			}
		}

	}
	
	private static void printMenu() {
		System.out.println("0: Quit");
		System.out.println("1: Go to next city.");
		System.out.println("2: Go to previous city.");
		System.out.println("3: Print out menu");
	}
}
