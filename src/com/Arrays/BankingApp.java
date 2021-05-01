package com.Arrays;

public class BankingApp {

	public static void main(String[] args) {
		
		Bank bank = new Bank("New Bank");
		
		bank.addBranch("Tor");
		bank.addCustomer("Tor", "Tim", 100);
		bank.addCustomer("Tor", "John", 200);
		bank.addCustomer("Tor", "Dave", 300);
		
		
		bank.addBranch("Syd");
		bank.addCustomer("Syd", "Mike", 100);
		bank.addCustomerTransaction("Syd", "Mike", 100);
		bank.addCustomerTransaction("Syd", "Mike", 100);
		bank.addCustomerTransaction("Syd", "Mike", 100);
		
		
		bank.listCustomers("Syd", true);

	}

}
