package com.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhoneFirstAttempt {
	
	
	public static void main(String[] args) {
		
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		Scanner scan = new Scanner(System.in);

		boolean recievingValues = true;
		int value; 
		
		String name;
		String number;
		
		
		while (recievingValues) {
			options();
			
			value = Integer.parseInt(scan.next());
			
			switch(value) {
				
			case 1:
				System.out.println("Enter contact name: ");
				name = scan.next();
				
				
				
				
				for(Contact item: contacts) {
					if(item.getName().equals(name)) {
						System.out.println("There is a record with that persons name "
								+ "already there.");
						break;
					}
				}
				
				System.out.println("Enter contact Number: ");
				number = scan.next();
				
				Contact x = new Contact(name,number);
				contacts.add(x);
				
			break;
				
			case 2:
				System.out.println("Enter contact name: ");
				name = scan.next();
				
				for(Contact item: contacts) {
					if(item.getName().equals(name) ) {
						System.out.println(name + " found");
						System.out.println("Enter new Number: ");
						number = scan.next();
						
						item.setPhoneNumber(number);
						break;
					}
				}
				
				System.out.println("No contact by the name " + name + " exists.");
				
			break;
			
			case 3:
				System.out.println("Enter contacts name that you want to remove: ");
				name = scan.next();
				Contact removedContact = null; 
				
				
				for(Contact item: contacts) {
					if(item.getName() == name) {
						removedContact = item;
						contacts.remove(item);
						break;
					}
				}
				
				if(removedContact == null) {
					System.out.println("Contact " + name + " not found.");
				}
				
				System.out.println("Contact : " + removedContact.getName() + " removed.");
				
			break;
			
			case 4:
				
				for(Contact item: contacts) {
					System.out.println(item.getName() + ":   Numb: " +item.getPhoneNumber());
				}
				
			break;
			
			case 5:
				recievingValues = false;
			break;
		
			
			default:
				
			break;
			}
			
			
		}

	}
	
	
	public static void options() {
		System.out.println("1 add new Contact: ");
		System.out.println("2 update existing Contact: ");
		System.out.println("3 remove Contact: ");
		System.out.println("4 print list of Contacts: ");
		System.out.println("5 Quit");
		System.out.println("");
	}
	
}
