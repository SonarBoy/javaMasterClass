package com.oop2;

public class DeluxeBurger extends Hamburger{
    
    public DeluxeBurger(){
        super("DeluxeBurger","Sausage & Bacon",14.54,"White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }
    
    @Override
    public void addHamburgerAddition1(String n,double p){
        System.out.println("No Additional items can be added to a deluxe burger");
    }
    
    @Override
    public void addHamburgerAddition2(String n,double p){
        System.out.println("No Additional items can be added to a deluxe burger");
    }
    
    @Override
    public void addHamburgerAddition3(String n,double p){
        System.out.println("No Additional items can be added to a deluxe burger");
    }
    
    @Override
    public void addHamburgerAddition4(String n,double p){
        System.out.println("No Additional items can be added to a deluxe burger");
    }

}