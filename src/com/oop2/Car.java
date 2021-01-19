package com.oop2;

public class Car {
    
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cyl, String n){
        this.cylinders = cyl;
        this.name = n;
    }
    
    public String startEngine(){
        return "Car -> startEngine()";
    }
    
    public String accelerate(){
        return "Car -> accelerate()";
    }
    
    public String brake(){
        return "Car -> brake()";
    }
    
    public int getCylinders(){
        return this.cylinders;
    }
    
    public String getName(){
        return this.name;
    }
}