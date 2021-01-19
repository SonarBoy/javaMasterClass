package com.oop2;

public class Printer {
    
    private int tonerLevel = -1;
    private int pagesPrinted;
    
    private boolean duplex;
    
    public Printer(int tl, boolean dup){
        
        if(tl > -1 && tl <= 100){
            this.tonerLevel = tl;
        }
        
        this.pagesPrinted = 0;
        this.duplex = dup;
    }
    
    public int addToner(int tonerAmount){
        
        if(tonerAmount > 0 && tonerAmount <= 100){
            
            if( ((this.tonerLevel + tonerAmount) <= 100) ){
                this.tonerLevel += tonerAmount;
                
                return this.tonerLevel;
            }else{
                return -1;
            }
            
        }else{
            return -1;
        }
    }
    
    public int printPages(int pages){
        int pagesToPrint = pages;
        
        if(duplex){
            
            if(pagesToPrint % 2 != 0){
                pagesToPrint = (pagesToPrint/2) + 1;
            }else{
                pagesToPrint /= 2;
            }
            
            
            pagesPrinted += pagesToPrint;
            
            return pagesToPrint;
        }else{
            pagesPrinted += pagesToPrint;
            
            return pagesToPrint;
        }
        
    }
    
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
