package com.Expressions.Statements.MethodBlocks;

public class calculateScore {

	public static void main(String[] args) {
		
		String name = "John";
		int score = 1500;
		int position = calculateHighScore(score);

		displayHighScorePosition(name, position);
		
		displayHighScorePosition("Josh",calculateHighScore(900));
		displayHighScorePosition("Jack",calculateHighScore(400));
		displayHighScorePosition("Julian",calculateHighScore(50));
		displayHighScorePosition("Jameila",calculateHighScore(1000));
	}
	
	public static void displayHighScorePosition(String name, int position){
		
		System.out.println(name + " managed to get into position " +  
		position + " on the high score table");
	}
	
	public static int calculateHighScore(int score) {
		
		if(score >= 1000) {
			return 1;
		}else if(score >= 500 && score < 1000) {
			return 2;
		}else if(score >= 100 && score < 500) {
			return 3;
		}
		
		return 4;
	}

}
