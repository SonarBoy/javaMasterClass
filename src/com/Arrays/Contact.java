package com.Arrays;

public class Contact {
	private String name;
	private String phoneNumber;
	
	public Contact(String name, String number) {
		this.name = name;
		this.phoneNumber = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	public static Contact createContact(String name,String number) {
		return new Contact(name,number);
	}
}
