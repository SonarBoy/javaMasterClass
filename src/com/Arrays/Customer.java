package com.Arrays;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private ArrayList<Double> transactions;
	
	public Customer(String n, ArrayList<Double> trans) {
		this.name = n;
		this.transactions = trans;
	}
}
