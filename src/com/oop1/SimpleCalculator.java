package com.oop1;

public class SimpleCalculator {
    // write your code here
    
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber(){
        return this.firstNumber;
    }
    
    public double getSecondNumber(){
        return this.secondNumber;
    }
    
    public void setFirstNumber(double value){
        this.firstNumber = value;
    }
    
    public void setSecondNumber(double value){
        this.secondNumber = value;
    }
    
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        }else{
            return this.firstNumber/this.secondNumber;
        }
    }
    
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    
}