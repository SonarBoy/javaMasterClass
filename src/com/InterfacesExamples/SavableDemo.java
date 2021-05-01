package com.InterfacesExamples;

import java.util.ArrayList;
import java.util.Scanner;

public class SavableDemo {
	
	public static void main(String [] args) {
		
		ISaveable tim = new Player("Tim", 10, "Age of Empires 2");
		System.out.println(tim);
		
		
//		saveObject(tim);
//		loadObject(tim);
		
		tim.toString();
		System.out.println(tim);
		
		
		ISaveable werewolf = new Monster("Werewolf","Bite","Boreal Forest");
		System.out.println(((Monster) werewolf).getName());
		
		System.out.println(werewolf.toString());
		
		saveObject(werewolf);
		loadObject(werewolf);
		
		System.out.println(werewolf.toString());
		
		
	}
	
	public static void saveObject(ISaveable objectToSave) {
		for(int i = 0; i < objectToSave.write().size(); i++) {
			System.out.println("Saving "+objectToSave.write().get(i) + " to device.");
		}
	}
	
	public static void loadObject(ISaveable objectToLoad) {
		ArrayList<String> values = readValues();
		objectToLoad.read(values);
	}
	
	
	public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
