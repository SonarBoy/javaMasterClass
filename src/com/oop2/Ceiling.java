package com.oop2;

public class Ceiling {
    private int height;
    private int paintedColor;
    
    public Ceiling(int hei, int pnt){
        this.height = hei;
        this.paintedColor = pnt;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getPaintedColor(){
        return this.paintedColor;
    }
}
