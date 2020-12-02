package com.Expressions.Statements.MethodBlocks;

public class minutesAndSecondsChallenge {

	public static void main(String[] args) {
		
		
		System.out.println(getDurationString(72, 17));
		System.out.println(getDurationString(4337));
	}
	
	public static String getDurationString(int minutes, int seconds) {
		
		if(minutes < -1 || (seconds < -1 || seconds > 59)) {
			return "Invalid Value";
		}
		
		return (minutes / 60) + "h " 
		+ (minutes % 60) + "m " 
		+ seconds + "s";
	}
	
	public static String getDurationString(int seconds) {
	
		if(seconds < -1) {
			return "Invalid Value";
		}
		
		int min = seconds / 60;
		int sec = seconds % 60;
		
		return getDurationString(min, sec);
		
	}
	

}
