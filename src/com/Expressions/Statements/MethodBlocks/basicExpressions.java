package com.Expressions.Statements.MethodBlocks;

public class basicExpressions {

	public static void main(String[] args) {

		// An expression is a line of code after the data type.
		// The complete line is called the statement.
		double kilo = (100 * 1.609344);

		if (kilo > 100) {
			System.out.println("THis is an Expressoion");
		}

		/**
		 * The expressions from the following lines of code are score = 100; score > 90
		 * "You got the High Score!" score = 0;
		 */

		int score = 100;
		if (score > 90) {
			System.out.println("You got the High Score!");
			score = 0;
		}

		kilo--;
		score++;
		System.out.println("This line is a complete statement");
		
		boolean gameOver = true;
		int secondScore = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver == true) {
			int finalScore = secondScore + (levelCompleted * bonus);
			System.out.println("Your final score was "+ finalScore);
		}
		
		secondScore = 10_000;
		levelCompleted = 8;
		bonus = 200;
		
		if(gameOver) {
			int finalScore = secondScore + (levelCompleted * bonus);
			System.out.println("Your final score was "+ finalScore);
		}
		
		calculateScore(true,secondScore,levelCompleted,bonus);
		
		
	
	}
	
	public static int calculateScore(boolean gameStatus, int score,int levels,int bonus) {
		
		if(gameStatus) {
			int finalScore = score + (levels * bonus);
			finalScore += 1000;
			System.out.println("Your final score was "+ finalScore);
			return finalScore;
		}else{
			
			//Searching algorithms -1 identifies a value not found. 
			return -1;
		}
		
	}

}
