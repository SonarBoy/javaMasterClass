package com.namingconventions;

import java.util.ArrayList;

// Note you cannot have private class Account at the top level

/*
 * Class level
 * 
 * Only classes interfaces and enums can exist at the top level 
 * everything else must be included within one of these.
 * 
 * Package-private: the object is only available within its own 
 * package. Package rpivate is specified by not specifying, it is
 * the default if you do not specify public. There is not a 
 * "package-private" keyword.
 * 
 * Member level
 * 
 * public: at the member level, public has the same meaning as the 
 * top level. A public class member( or field) and public method can be 
 * accessed from any other class anywhere even in a different package.
 * 
 * Package-private: this also has the same meaning as it does at the 
 * top level. An object with no access modifier is visible to every 
 * class within the same package( but not to classes in external packages).
 * 
 * private: the object is only visible within the class it is declared. It
 * is not visible anywhere else (including in subclasses of its class).
 * 
 * proctected: the object is visible anywhere in its own package ( like package
 * -private) but also in subclasses even if they are in another package. 
 * 
 */
public class Account {
	private String accountName;
	private  int balance = 0;
	private  ArrayList<Integer> transactions;
	
	
	public Account(String accountName) {
		this.accountName = accountName;
		this.transactions = new ArrayList<Integer>();
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int ammount) {
		if(ammount > 0) {
			transactions.add(ammount);
			this.balance += ammount;
		}else {
			System.out.println("Cannot deposit negative sums");
		}
	}
	
	public void withdraw(int ammount) {
		int withdrawal = -ammount;
		
		if(withdrawal < 0) {
			
			this.transactions.add(withdrawal);
			this.balance += withdrawal;
			System.out.println(ammount + " wtihdrawn. Balance is now " + this.balance);
			
		}else{
			
			System.out.println("Cannot withdraw negative sums");
			
		}
	}
	
	public void calculateBalance() {
		this.balance = 0;
		
		for(int i: this.transactions) {
			this.balance += i;
		}
		
		System.out.println("Calculated balance is " + this.balance);
	}
}
