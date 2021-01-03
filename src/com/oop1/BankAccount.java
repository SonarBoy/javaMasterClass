package com.oop1;

public class BankAccount {
	
	
	private String accountNumber;
	private String customerName;
	private String email;
	private String phoneNumber;
	private double balance;
	
	
	
	//When calling a constructor from another constructor
	//it must be the first line otherwise it doesnt work. 
	public BankAccount(String name) {
		this("", name, "", "", 0.0);
	}
	
	public BankAccount(String number, 
					   String custName, 
					   String email, 
					   String phone, 
					   double bal) {
		
		
	this.accountNumber = number;
	this.customerName = custName;
	this.email = email;
	this.phoneNumber = phone;
	this.balance = bal;
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double dep) {
		this.balance += dep;
	}
	
	public void withdrawl(double with) {
		
		if(this.balance - with < 0) {
			System.out.println("Cannot complete transaction.");
		}else{
			this.balance -= with;
		}
		
		
	}

	public static void main(String[] args) {

	}

}
