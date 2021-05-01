package com.InterfacesExamples;

import java.util.Scanner;

import com.InterfacesExamples.Button.OnClickListener;

public class InnerClassesDemo {
	
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	
	public static void main(String [] args) {
	
		GearBox mcLaren = new GearBox(6);
		
		//LOCAL CLASS
//		class ClickListener implements Button.OnClickListener{
//			public ClickListener() {
//				System.out.println("Ive been Attached");
//			}
//			
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + " was clicked");
//			}
//		}
//		
//		
//		btnPrint.setOnClickListener(new ClickListener());
//		btnPrint.onClick();
//
		
		//Anonymous Class (Think about it like java script)
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println( title + " was clicked");
				
			}
		});
		
		
		listen();
		
		/*
		 * You will get an error if you try to create a gear object without having
		 * a concrete gearbox class first. 
		 * 
		 * ERRORS:
		 * GearBox.Gear second = new GearBox.Gear(2,15);
		 * GearBox.Gear third = new mcLaren.Gear(3,20);
		 * 
		 * Correct way:
		 * GearBox.Gear first = mcLaren.new Gear(1, 12);
		 * 
		 * Note: that you would not really want to create 
		 * the inner class by itself.
		 */
	
		
//		mcLaren.operateClutch(true);
//		
//		mcLaren.changeGear(1);
//		
//		mcLaren.operateClutch(false);
//		
//		System.out.println(mcLaren.wheelSpeed(1000));
//		
//		mcLaren.changeGear(2);
//
//		System.out.println(mcLaren.wheelSpeed(3000));
//		
//		mcLaren.operateClutch(true);
//		
//		mcLaren.changeGear(3);
//		
//		mcLaren.operateClutch(false);
//		
//		System.out.println(mcLaren.wheelSpeed(6000));
		
		
		
	}
	
	
	private static void listen() {
		boolean quit = false;
		
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
				case 0 :
					quit = true;
				break;
				
				case 1 :
					btnPrint.onClick();
				break;
			}
		}
	}
}
