package com.Expressions.Statements.MethodBlocks;

public class breakingDownNumbers {
	public static void main (String [] args) {
		
		System.out.println("125 = " + sumDigits(125));
		System.out.println("939 = " + sumDigits(939));
	}
	
	public static int sumDigits(int number) {
		
		
		if(number < 10) {
			return -1;
		}
		
		int sum = 0;
		
		while( number > 0) {
			
			int digit = number % 10;
			
			System.out.println("Least Significant digit pulled off: " + digit);
			
			sum += digit;
			
			System.out.println("Current Sum: " + sum);
			
			number /= 10;
			
			System.out.println("Current Number: " + number);
			
			System.out.println();
		}
		
		return sum;
	}
	
	public static boolean isPalindrome(int number){
	     
	     if(number <= -1){
	         number *= -1;
	     }
	     
	     int reverse = 0;
	     int lastDigit = 0;
	     int numb = number;
	     
	     while(numb > 0){
	         reverse *= 10;
	         lastDigit = numb % 10;
	         reverse += lastDigit;
	         numb /= 10;
	     }
	     
	    
	     if(reverse == number){
	         return true;
	     }else{
	         return false;
	     }
	     
	 }
	
	 public static int sumFirstAndLastDigit(int number){
	        
	        if( number <= -1 ){
	            return -1;
	        }else{
	            
	            if(number < 10){
	                return (2 * number);
	            }
	            
	            
	            int firstDigit = 0;
	            int lastDigit = 0;
	            
	            boolean firstHit = false;
	            
	            while(number > 0){
	                
	                if(!firstHit){
	                    firstDigit = number % 10;
	                    firstHit = true;
	                }else{
	                    lastDigit = number % 10;
	                }
	                
	                number /= 10;
	                
	            }
	            
	            return (firstDigit + lastDigit);
	        }
	 }
	 
	 
	 public static int getEvenDigitSum(int number){
	        
	        if( number <= -1){
	            return -1;
	        }
	        
	        int digit = 0;
	        int total = 0;
	        
	        for(int runner = 1; number > 0;runner++){
	            
	            digit = number % 10;
	            
	            if(digit % 2 == 0){
	                total += digit;
	            }
	            
	            number /= 10;
	            
	        }
	        
	        return total;
	    }
	        
}
