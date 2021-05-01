package com.Arrays;

import java.util.ArrayList;

public class Branch {
	private String name;

	private ArrayList<Customer> custList;

	public Branch(String n) {
		this.name = n;
		this.custList = new ArrayList<Customer>();
	}

	public String getName() {
		return name;
	}
	
	public ArrayList<Customer> getCustomers() {
		return custList;
	}
	
	public Customer findCustomer(String custName) {
		
		for(Customer x: custList) {
			if(x.getName().equals(custName)) {
				return x;
			}
		}
		
		return null;
	}

	public boolean newCustomer(String custName, double trans) {

		Customer x = findCustomer(custName);
		
		
		if(x == null) {
			
			this.custList.add(new Customer(custName, trans));
			
			//System.out.println("Customer Added: " + custName + 
			//		" with initial transaction of : $" + trans);
			
			x = null;
			
			return true;
		}
		
		//System.out.println("Failed to add customer: " + custName + " customer already exists.");
		return false; 
	}
	
	public boolean addCustomerTransaction(String custName, double trans) {
		
		Customer x = findCustomer(custName);
		
		if(x != null) {
			
			int val = this.custList.indexOf(x);
			this.custList.get(val).addTransaction(trans);
			
			//System.out.println("Customer Transaction Added: " + custName + 
			//		" with transaction of : $" + trans);
			
			
			return true;
		}
		
		
		//System.out.println("Failed to create Transaction: " + custName + " not found.");
		 
		return false;
	}
	

}
