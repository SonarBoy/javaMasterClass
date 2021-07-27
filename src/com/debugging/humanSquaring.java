package com.debugging;

public class humanSquaring {
	
	public static String calculationRoll = "-----Calculation Roll-----"; 
	public static int ans = 0;
	public static int firstDistance = 0;
	public static int secondDistance = 0;
	public static int distanceCounter = 0;
	
	public static void humanSquaring(int number) {
		
		if(number % 10 == 0) {
			ans = number * number;
			calculationRoll += "\n";
			calculationRoll += number + " * " + number + " = " + (ans);
		}else{
			
			calculationRoll += "\n";
			calculationRoll += "Numbers that add to " + (number + number);
			calculationRoll += "\n";
			
			firstDistance = number;
			secondDistance = number;
			
			while((firstDistance % 10 != 0) && (secondDistance % 10 != 0)) {
				
				calculationRoll += firstDistance + "  " + secondDistance + "\n";
				firstDistance--;
				secondDistance++;
				distanceCounter++;
				
			}
			
			calculationRoll += firstDistance + "  " + secondDistance + "\n";
			
		}
		
		ans = (int) ((firstDistance * secondDistance) + (Math.pow(distanceCounter,2)));
		calculationRoll += "\n";
		calculationRoll += "("+firstDistance + " * " + secondDistance + ") + "+distanceCounter+"^2 = "+ ans +"\n";
	}
	
	public static void main(String[] args) {
		
		humanSquaring(285);
		
		System.out.println(calculationRoll);
		

	}

}
