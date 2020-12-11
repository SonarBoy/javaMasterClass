package com.Expressions.Statements.MethodBlocks;

public class breakingDownNumbers {
	public static void main (String [] args) {
		
		System.out.println("125 = " + sumDigits(125));
		System.out.println("939 = " + sumDigits(939));
		
		System.out.println(getLargestPrime(14));
		System.out.println(getLargestPrimeWorking(14));
		
		printSquareStar(15);
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
	 
	 
	 public static int getLargestPrime(int number){
	        
	        if(number <= 1){
	            return -1;
	        }
	        
	        boolean isPrime = true;
	        int largestPrime = 1;
	        
	        
	        
	        for(int runner = 1; runner <= number; runner++){
	            
	            if(number % runner  == 0){
	                
	                for(int primeRunner = 2; primeRunner <= Math.sqrt(runner) + 1; primeRunner++){
	                    
	                    if(runner % primeRunner == 0){
	                        isPrime = false;
	                        break;
	                    }
	                }
	                
	                if(isPrime){
	                    largestPrime = runner;
	                }
	            }
	            
	            isPrime = true;
	            
	        }
	        
	        return largestPrime;
	        
	    }
	 
	  public static int getLargestPrimeWorking(int number){
	        
	        if(number <= 1){
	            return -1;
	        }
	    
	        
	        boolean isPrime = true;
	        int largestPrime = 1;
	        
	        
	        
	        for(int runner = 1; runner <= number; runner++){
	            
	            if(number % runner  == 0){
	                
	                for(int primeRunner = 2; primeRunner < runner; primeRunner++){
	                    
	                    if(runner % primeRunner == 0){
	                        isPrime = false;
	                        break;
	                    }
	                }
	                
	                if(isPrime){
	                    largestPrime = runner;
	                }
	            }
	            
	            isPrime = true;
	            
	        }
	        
	        return largestPrime;
	        
	    }
	  
	    public static void printSquareStar(int number){
	        
	        if(number < 5){
	            System.out.println("Invalid Value");    
	            return;
	        }
	        
	        boolean isSpaceNeeded = true;
	        
	        for(int row = 0; row < number; row++){
	            
	            
	            
	            for(int col = 0; col < number;col++){
	                
	            	//Top Row
	                if(row == 0){
	                    System.out.print("*");
	                    isSpaceNeeded = false;
	                }
	                
	                //Bottom Row
	                if(row == (number - 1)){
	                    System.out.print("*");
	                    isSpaceNeeded = false;
	                }
	                
	                //Left Column
	                if(col == 0 && row != 0  && row != number - 1 ){
	                    System.out.print("*");
	                    isSpaceNeeded = false;
	                }
	                
	                //Right Column
	                if(col == number - 1 && row != 0  && row != number - 1 ){
	                    System.out.print("*");
	                    isSpaceNeeded = false;
	                }
	                
	                //Diagonal Starting at Top Left
	                if(row == col && row != 0 && row != number - 1 && col != 0 && col != number - 1) {
	                	System.out.print("*");
	                	isSpaceNeeded = false;
	                }

	                //Diagonal Starting at Bottom Right
	                if(col == ((number - row) - 1) && row != number - 1 && col != 0 && col != number - 1 && isSpaceNeeded) {
	                	System.out.print("*");
	                	isSpaceNeeded = false;
	                }
	                
	                
	                //Else Throw a Space
	                if(isSpaceNeeded) {
	                	System.out.print(" ");
	                }
	                
	                isSpaceNeeded = true;
	            }
	            
	            
	            System.out.println();
	        }
	        
	    }
	        
}
