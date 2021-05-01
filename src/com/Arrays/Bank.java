package com.Arrays;

import java.util.ArrayList;

public class Bank {
	
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String n) {
		this.name = n;
		this.branches = new ArrayList<Branch>();
	}
	
	
	public Branch findBranch(String name) {
		
		for(Branch b : branches) {
			if(b.getName().equals(name)) {
				return b;
			}
		}
		
		return null;
	}
	
	
	public boolean addBranch(String branchName) {
		
		Branch brch = findBranch(branchName);
		
		if(brch != null) {
			
			System.out.println("Couldn't add branch because it is already present.");
			return false;
			
		}else{
			
			this.branches.add(new Branch(branchName));
			System.out.println("New Branch Added: " + branchName);
			return true;
			
		}
		
	}
	
	public boolean addCustomer(String branchName, String custName, double initialTrans) {
		
		Branch brch = findBranch(branchName);
		
//		if(brch != null) {
//			
//			int val = this.branches.indexOf(brch);
//			Customer cust = this.branches.get(val).findCustomer(custName);
//			
//			
//			if(cust == null) {
//				
//				boolean success = this.branches.get(val).newCustomer(custName, initialTrans);
//				
//				if(success) {
//					System.out.println("Customer successfully added.");
//					return true;
//				}else{
//					System.out.println("Customer failed to be added.");
//					return false;
//				}
//				
//			}else {
//				
//				System.out.println("Customer already exists.");
//				return false;
//				
//			}
//			
//		}else{
//			
//			System.out.println("Branch does not exist.");
//			return false;
//			
//		}
		
		if(brch != null) {
			return brch.newCustomer(custName, initialTrans);
		}
		
		return false;
		
	}
	
	public boolean addCustomerTransaction(String branchName, String custName, double trans) {
		Branch brch = findBranch(branchName);
		
//		if(brch != null) {
//			
//			int val = this.branches.indexOf(brch);
//			Customer cust = this.branches.get(val).findCustomer(custName);
//			
//			
//			if(cust == null) {
//				
//				boolean success = 
//						this.branches.get(val).addCustomerTransaction(custName, trans);
//				
//				if(success) {
//					System.out.println("Customer successfully added.");
//					return true;
//				}else{
//					System.out.println("Customer failed to be added.");
//					return false;
//				}
//				
//			}else {
//				
//				System.out.println("Customer already exists.");
//				return false;
//				
//			}
//			
//		}else{
//			
//			System.out.println("Branch does not exist.");
//			return false;
//			
//		}
		
		if(brch != null) {
			return brch.addCustomerTransaction(custName, trans);
		}
		
		return false;
	}
	
	
	
	public boolean listCustomers(String branchName, boolean printTrans) {
		
		Branch brch = findBranch(branchName);
		
		if(brch == null) {
			return false;
		}
		
		int customerNumber = 0;
		int transNumber = 0;
		
		if(printTrans) {
			
			customerNumber++;
			
			System.out.println("Customer details for branch " + brch.getName());
			
			for(Customer cust : brch.getCustomers()) {
				
				System.out.println("Customer: " + cust.getName() + "[" + customerNumber +"]");
				System.out.println("Transactions");
				
				transNumber++;
				for(Double x: cust.getTransactions()) {
					
					System.out.println("[" + transNumber +"]" + " Ammount " + x);
					transNumber++;
				}
				transNumber = 0;
				
			}
			
		}else{
			
			customerNumber++;
			
			System.out.println("Customer details for branch " + brch.getName());
			
			for(Customer cust : brch.getCustomers()) {
				
				System.out.println("Customer: " + cust.getName() + "[" + customerNumber +"]");
				
			}
		}
		
		return true;
	}
	
	

}
