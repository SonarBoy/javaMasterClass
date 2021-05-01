package com.InterfacesExamples;

public class DeskPhone implements ITelephone{

	private int myNumber;
	private boolean isRinging;
	
	
	public DeskPhone(int num, boolean ring) {
		this.myNumber = num;
		this.isRinging = ring;
	}
	
	@Override
	public void powerOn() {
		System.out.println("No action taken.");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing " + myNumber + " on deskphone.");
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the desk phone.");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging = true;
			System.out.println("The Phone is Ringing!");
		}else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		
		return isRinging;
	}
	

}
