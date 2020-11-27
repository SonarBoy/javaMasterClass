package com.FirstSteps;

public class ifThenExample {
	public static void main(String [] args) {
		boolean isAlien = false;
		
		//When putting a ; at the end of the line it closes off all 
		//conditional logic associated with the if statement. 
		if(isAlien == false);
			System.out.println("Yes I am not an Alien");
			
		//In this case both lines will print. 
		if(isAlien == false)
			System.out.println("Yes I am not an Alien");
			System.out.println("And I am scared of Aliens");
			
		//In this example the first line will not print and the second line
		//will because it is not technically in the statement. 
		if(isAlien == true)
			System.out.println("Yes I am not an Alien");
			System.out.println("And I am scared of Aliens");
			
			
		if(isAlien == false) {
			System.out.println("Yes I am not an Alien");
			System.out.println("And I am scared of Aliens");
		}
		
		int topScore = 80;
		if(topScore == 100) {
			System.out.println("You got the high score.");
		}
		
		if(topScore != 100) {
			System.out.println("You got the high score. NOT");
		}
		
		if(topScore >= 100) {
			System.out.println("You got the high score. GREATER THAN OR EQUAL TO ");
		}
		
		if(topScore <= 100) {
			System.out.println("You got the high score. LESS THAN OR EQUAL TO ");
		}
		
		
		int secondTopScore = 50;
		
		//Logical AND
		if((topScore > secondTopScore) && (topScore < 100)) {
			System.out.println("Greater than second top score.");
		}
		
		if((topScore > 90) || (secondTopScore <= 90)) {
			System.out.println("EITHER OR BOTH OF THE CONDITIONS ARE TRUE");
		}
		
		//New Broken thing
		//Here we are returning a boolean so this is why this doesnt throw an error.
		boolean isCar = false;
		if(isCar = true) {
			System.out.println("THIS IS NOT SUPPOSED TO HAPPEN");
		}
		
		//Ternary Operator.
		// Before the ? is the condition.
		// Before the : is what happens if it is true.
		// After the : is what happens if the condition is false. 
		boolean wasCar = isCar ? true : false;
		
		if(wasCar) {
			System.out.println("It was not a car");
		}
		
		isCar = true;
		
		wasCar = isCar ? true : false;
		
		if(wasCar) {
			System.out.println("It was a car");
		}
		
		int ternaryTest = isCar ? 100 : 200;
		
		//OPERATOR PRECEDENCE TABLE NOW I KNOW WHY ++ was executing first.
		//http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
		
		double firstNumber = 20.00d;
		double secondNumber = 80.00d;
		
		double ans = (firstNumber + secondNumber) * 100d;
		System.out.println("The Answer: " + ans);
		
		System.out.println("The Remainder: " +(ans % 40d));
		boolean isAnsEmpty = (ans % 40d == 0) ? true : false;
		
		
		if(!isAnsEmpty) {
			System.out.println("Got Some Remainder!");
		}
	}

}
