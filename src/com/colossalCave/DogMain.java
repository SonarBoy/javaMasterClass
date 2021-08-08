package com.colossalCave;

public class DogMain {

	public static void main(String[] args) {
		
		Labrador rover = new Labrador("Rover");
		Dog rover2 = new Dog("Rover");
		
		
		/**
		 * A Labrador is an instance dog but a dog is not an instance of a Labrador 
		 * in this case the second equals will fail because you cannot cast a 
		 */
		
		/*
		 * Now to ensure that equals cant be overridden in subclasses of dog what
		 * we wnat to do to confirm that we would be is we actually want to go back to
		 * the dog class and make it final. Marking a method as final means that it 
		 * cannot be overriden.
		 */
		System.out.println(rover2.equals(rover));
		System.out.println(rover.equals(rover2));

	}

}
