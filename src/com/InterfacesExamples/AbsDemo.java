package com.InterfacesExamples;

public class AbsDemo {
	public static void main(String [] args) {
		
		Dog x = new Dog("Bruno");
		x.eat();
		x.breathe();
		
		
		//Remeber you cant instantaiate an abstract class.
		//Bird e = new Bird("Bey");
		Parrot e = new Parrot("Bey");
		e.eat();
		e.breathe();
		e.fly();
	}
}
