package com.oop2;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;
    
    public Bed(String sty, int pill, int hei, int sht, int qlt){
        this.style = sty;
        this.pillows = pill;
        this.height = hei;
        this.sheets = sht;
        this.quilt = qlt;
    }
    
    public void make(){
        System.out.print("Bedroom -> Making bed | ");
    }
    
    public String getStyle(){
        return this.style;
    }
    
    public int getPillows(){
        return this.pillows;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getSheets(){
        return this.sheets;
    }
    
    public int getQuilt(){
        return this.quilt;
    }
    
}