package com.oop2;

public class HealthyBurger extends Hamburger{
    
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    
    private String healthyExtra2Name;
    private double healthyExtra2Price;
    
    public HealthyBurger(String meat, double price){
        super("Healthy Burger",meat,price,"Brown Rye Roll");
    }
    
    public void addHealthyAddition1(String name, double price){
    	this.healthyExtra1Name = name;
    	this.healthyExtra1Price = price;
    }
    
    public void addHealthyAddition2(String name, double price){
    	this.healthyExtra2Name = name;
    	this.healthyExtra2Price = price;
    }
    
    @Override
    public double itemizeHamburger() {
    	
    	double hamburgerPrice = super.itemizeHamburger(); 
    	
    	if(healthyExtra1Name != null) {
    		hamburgerPrice += this.healthyExtra1Price;
    		System.out.println("Added " + this.healthyExtra1Name + " for " + this.healthyExtra1Price);
    	}
    	
    	if(healthyExtra2Name != null) {
    		hamburgerPrice += this.healthyExtra2Price;
    		System.out.println("Added " + this.healthyExtra2Name + " for " + this.healthyExtra2Price);
    	} 
    	
    	return hamburgerPrice;
    }
}