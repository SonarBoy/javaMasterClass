package com.Expressions.Statements.MethodBlocks;

import java.util.Scanner;

public class InputCalc {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        boolean hasNextValue; 
	        int inputValue;
	        int sum = 0;
	        long avg = 0;
	        
	        while(true){
	            
	            
	            
	            hasNextValue = scan.hasNextInt();
	            
	            if(hasNextValue){
	                inputValue = scan.nextInt();
	                
	                sum += inputValue;
	                avg++;
	            }else{
	                
	                avg = Math.round(((double)sum/(double)avg));
	                System.out.println(avg);
	                
	                
	                break;
	            }
	            
	            
	        }
	        
	        System.out.println("SUM = " + (int)(sum) + " AVG = "+ (avg));

	}

}
