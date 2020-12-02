package com.Expressions.Statements.MethodBlocks;

public class switchExample {

	public static void main(String[] args) {
		
		int switchValue = 3;
		
		switch(switchValue) {
			case 1: 
				System.out.println("Value was 1");
				break;
				
			case 2: 
				System.out.println("Value was 2");
				break;
				
			case 3: case 4: case 5:
				System.out.println("Actually it was a " + switchValue);
				break;
			
			default:
				System.out.println("Was not 1 or 2");
				break;
		}
		
		
		
		char insert = '9';
		
		switch(insert) {
		
		case 'A':
			System.out.println("A FOUND!");
			break;
			
		case 'B':
			System.out.println("B FOUND!");
			break;
			
		case 'C':
			System.out.println("C FOUND!");
			break;
			
		case 'D':
			System.out.println("D FOUND!");
			break;
			
		case 'E':
			System.out.println("E FOUND!");
			break;
			
		default:
			System.out.println("Notting found.");
		}

	}

}
