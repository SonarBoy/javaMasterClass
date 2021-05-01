package com.Arrays;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	private ArrayList<Double> transactions;
	
	

	public Customer(String n, double initialTrans) {
		this.name = n;
		this.transactions = new ArrayList<Double>();
		addTransaction(initialTrans);
	}
	
	public void addTransaction(double trans) {
		this.transactions.add(trans);
	}
	
	public String getName() {
		return name;
	}


	public ArrayList<Double> getTransactions() {
		return transactions;
	}
	
	
}
