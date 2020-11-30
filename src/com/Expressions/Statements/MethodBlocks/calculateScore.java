package com.Expressions.Statements.MethodBlocks;

public class calculateScore {

	public static void main(String[] args) {
		
		String name = "John";
		int score = 1500;
		int position = calculateHighScore(score);

		displayHighScorePosition(name, position);
		
		displayHighScorePosition("Josh");
		displayHighScorePosition("Josh",calculateHighScore(900));
		displayHighScorePosition("Jack",calculateHighScore(400));
		displayHighScorePosition("Julian",calculateHighScore(50));
		displayHighScorePosition("Jameila",calculateHighScore(1000));
		
		printConversion(1.25);
		
		 areEqualByThreeDecimalPlaces(3.175,3.176);
		 
		System.out.println(3.175 / 0.1);
		System.out.println(3.175 / 0.01);
		System.out.println(3.175 / 0.001);
		System.out.println(3.175 / 0.0001);
		
		
		System.out.println(3.176 / 0.1);
		System.out.println(3.176 / 0.01);
		System.out.println(3.176 / 0.001);
		System.out.println(3.176 / 0.0001);
		
	}
	
	public static void displayHighScorePosition(String name) {
		System.out.println("The user : " + name + " is up next");
	}
	
	
	public static void displayHighScorePosition(String name, int position){
		
		System.out.println(name + " managed to get into position " +  
		position + " on the high score table");
	}
	
	
	public static long toMilesPerHour(double kilometersPerHour){
    
        long value;
        
        if(kilometersPerHour < 0){
            value = -1;
        }else{
            value = (int)(kilometersPerHour * 0.621371);
        }
        
        return value;
    
    }
	
	
	   public static boolean areEqualByThreeDecimalPlaces(double first, double second){
	        
	        
	        
	        if((int)(first) == (int)(second)){
	            if((int)(first % 1) == (int)(second % 1)){
	                if((int)(first % 0.1) == (int)(second % 0.1)){
	                    if((int)(first % 0.01) == (int)(second % 0.01)){
	                        
	                            return true;
	                        
	                    }else{
	                        return false;
	                    }
	                }
	            }
	        }
	        
	        
	        return false;
	        
	        
	        
	        
	        
	  }
	
	
	 public static void printConversion(double kilometersPerHour){
	       
	       if(kilometersPerHour < 0){
	           System.out.println("Invalid Value");
	           return;
	       }else{
	           System.out.println(kilometersPerHour + " km/h = "+ toMilesPerHour(kilometersPerHour) + " mi/h");
	       }
	 }
	
	public static int calculateHighScore(int score) {
		
		
		//A better way to do this is uncommented below
//		if(score >= 1000) {
//			return 1;
//		}else if(score >= 500 && score < 1000) {
//			return 2;
//		}else if(score >= 100 && score < 500) {
//			return 3;
//		}
//		
//		return 4;
		
		int position = 4;
		
		if(score >= 1000) {
			position = 1;
		}else if(score >= 500 && score < 1000) {
			position = 2;
		}else if(score >= 100 && score < 500) {
			position = 3;
		}
		
		
		return position;
	}

}
