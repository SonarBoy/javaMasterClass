package com.oop1;

public class Wall {
    private double width;
    private double height;
    
    public Wall(){
        
    }
    
    public Wall(double w, double h){
        if(w <= 0 || h <= 0){
            if(w <= 0 && !(h <= 0)){
                this.width = 0;
                this.height = h;
            }else if(h <= 0 && !(w <= 0)){
                this.width = w;
                this.height = 0;
            }else{
                this.width = 0;
                this.height = 0;
            }
        }else{
            this.width = w;
            this.height = h;
        }
    }
    
    public void setWidth(double w){
        if(w <= 0 ){
            this.width = 0;
        }else{
            this.width = w;    
        }
        
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setHeight(double h){
        if(h <= 0){
            this.height = 0;
        }else{
            this.height = h;    
        }
        
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public double getArea(){
        return this.height * this.width;
    }
}
