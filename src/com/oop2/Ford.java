package com.oop2;

public class Ford extends Car {
    public Ford(int cyl, String n){
        super(cyl,n);
    }

    @Override
    public String startEngine(){
        return getClass().getName()  + " -> startEngine()";
    }
    
    @Override
    public String accelerate(){
        return getClass().getName()  + " -> accelerate()";
    }
    
    @Override
    public String brake(){
        return getClass().getName()  + " -> brake()";
    }
}
