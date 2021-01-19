package com.oop2;

public class Hamburger {
    private String name;
    private String meat;
    private String breadRollType;
    private double price;
    
    
    private String addition1Name = "";
    private double addition1Price = 0;
    
    private String addition2Name = "";
    private double addition2Price = 0;
    
    private String addition3Name = "";
    private double addition3Price = 0;
    
    private String addition4Name = "";
    private double addition4Price = 0;
    
    public Hamburger(String n, String m, double p , String brt){
        this.name = n;
        this.meat = m;
        this.breadRollType = brt;
        this.price = p;
    }
    
    public void addHamburgerAddition1(String n,double p){
        this.addition1Name = n;
        this.addition1Price = p;
    }
    
    public void addHamburgerAddition2(String n,double p){
        this.addition2Name = n;
        this.addition2Price = p;
    }
    
    public void addHamburgerAddition3(String n,double p){
        this.addition3Name = n;
        this.addition3Price = p;
    }
    
    public void addHamburgerAddition4(String n,double p){
        this.addition4Name = n;
        this.addition4Price = p;
    }
    
    
    
    public double itemizeHamburger(){
    	double hamburgerPrice = this.price;
        
    	if(addition1Name != null) {
    		hamburgerPrice += this.addition1Price;
    		System.out.println("Added "+this.addition1Name + " for extra " + this.addition1Price);
    		
    	} 
    	
    	if(addition2Name != null) {
    		
    		hamburgerPrice += this.addition2Price;
    		System.out.println("Added "+this.addition2Name + " for extra " + this.addition2Price);
    		
    	}
    	
    	if(addition3Name != null) {
    		
    		hamburgerPrice += this.addition3Price;
    		System.out.println("Added "+this.addition3Name + " for extra " + this.addition3Price);
    		
    	}
    	
    	if(addition4Name != null) {
    		
    		hamburgerPrice += this.addition4Price;
    		System.out.println("Added "+this.addition4Name + " for extra " + this.addition4Price);
    		
    	}
    	
    	System.out.println("Total: " + hamburgerPrice);
    	return hamburgerPrice;
    }

}