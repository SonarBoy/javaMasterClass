package com.namingconventions;

public class Password {
	private static final int key = 777777;
	private final int encryptedPassword;
	
	public Password(int password) {
		this.encryptedPassword = encryptDecrypt(password);
		
	}
	
	private int encryptDecrypt(int password) {
		return password ^ key;
	}
	
	public final void storePassword() {
		System.out.println("Saving password as " + this.encryptedPassword);
		
	}
	
	public boolean letMeIn(int password) {
		if(encryptDecrypt(password) == this.encryptedPassword) {
			System.out.println("Welcome");
			return true;
		}
		
		System.out.println("Invalid Password");
		return false;
	}
	
	
}
