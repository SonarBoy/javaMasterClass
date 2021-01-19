package com.oop2;

public class Bedroom {
    
    private String name;
    
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;
    
    public Bedroom(String n, Wall w1,Wall w2,Wall w3,Wall w4,Ceiling ceil,Bed b,Lamp lmp){
        
        this.name = n;
        
        this.wall1 = w1;
        this.wall2 = w2;
        this.wall3 = w3;
        this.wall4 = w4;
        
        this.bed = b;
        this.ceiling = ceil;
        this.lamp = lmp;
        
    }
    
    public Lamp getLamp(){
        return this.lamp;
    }
    
    
    public void makeBed(){
        this.bed.make();
    }
}
