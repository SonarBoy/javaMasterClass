package com.oop1;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String email;
	
	
	public VipCustomer() {
		this("def",0.0,"no-email");
	}
	
	
	public VipCustomer(String n,String em) {
		this(n,0.0,em);
	}
	
	
	
	public VipCustomer(String n,double cl,String em) {
		this.name = n;
		this.creditLimit = cl;
		this.email = em;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
