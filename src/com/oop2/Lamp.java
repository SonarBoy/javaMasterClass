package com.oop2;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;
    
    
    public Lamp(String sty, boolean batt, int glob){
        this.style = sty;
        this.battery = batt;
        this.globRating = glob;
    }
    
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    
    public String getStyle(){
        return this.style;
    }
    
    public boolean isBattery(){
        return this.battery;
    }
    
    public int getGlobRating(){
        return this.globRating;
    }
}
