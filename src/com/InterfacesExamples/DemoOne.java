package com.InterfacesExamples;

public class DemoOne {
	
	public static void main(String [] args) {
		
		
		//You can declare a variable as an interface
		//But when implementing it you must assign it an object that 
		//implements the interface. 
		ITelephone tele;
		
		tele = new DeskPhone(142536, false);
		
		tele.callPhone(142536);
		tele.answer();
		
		
		
		tele = new MobilePhone(142536);
		tele.powerOn();
		tele.callPhone(142536);
		tele.answer();
	}
}
