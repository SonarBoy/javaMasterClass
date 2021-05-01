package com.InterfacesExamples;

public class MobilePhone implements ITelephone{

	private int myNumber;
	private boolean isRinging;
	private boolean isOn;
	
	public MobilePhone(int num) {
		this.myNumber = num;
		
	}
	
	@Override
	public void powerOn() {
		System.out.println("HELLO MOTO");
		this.isOn = true;
	}

	@Override
	public void dial(int phoneNumber) {
		if(isOn) {
			System.out.println("Now ringing " + myNumber + " on deskphone.");
		}else {
			System.out.println("Phone is off.");
		}
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the mobile phone.");
			isRinging = false;
		}
		
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber && isOn) {
			isRinging = true;
			System.out.println("The Phone is Ringing!");
			System.out.println("Play Ring tone");
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
