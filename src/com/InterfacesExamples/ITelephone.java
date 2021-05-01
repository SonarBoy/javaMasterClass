package com.InterfacesExamples;

public interface ITelephone {
	
	// Interfaces 
	// A contract with classes that says that the specified method signatures and vairables will not change.
	
	public void powerOn();
	
	public void dial(int phoneNumber);
	
	public void answer();
	
	public boolean callPhone(int phoneNumber);
	
	public boolean isRinging();
	
	
	
}
