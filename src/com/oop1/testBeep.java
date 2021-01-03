package com.oop1;

public class testBeep {

	public static void main(String[] args) {
		java.awt.Toolkit.getDefaultToolkit().beep();
		
		/**
		 * Reference vs Object vs Instance Class
		 * 
		 * - Lets use the analogy of building a house to understand Classes.
		 * 
		 * - A CLASS is basically a blueprint for a house using the blueprint we
		 * can build as many houses as we like based on those plans.
		 * 
		 * - Each house you build (in other words instantiates using the new operator
		 * is an objext also known as an instance).
		 * 
		 * - Each house you build has an address (a physical location). In other words
		 * if you want to tell someone where you live you give them your address (perhaps 
		 * written on a piece of paper) This is known as a reference.
		 * 
		 * - You can copy that reference as many times as you like but there is still just one
		 * house. In other words we are copying the paper that has address on it not the house 
		 * itself.
		 * 
		 * - We can pass references as parameters to constructors and methods. 
		 */
//		
//		Car porche = new Car();
//		porche.setMode("Carrera");
//		System.out.println("Cars Model: " + porche.getMode());
		
		
		//Creates a new Instance of a house with blueHouse
		//Create a new reference called anotherHouse and assign it to the
		//same object in memory
		House blueHouse = new House("blue");
		House anotherHouse = blueHouse;
		
		
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		//Changes the original house object to a color of red because note in 
		//the above lines we have only created a reference to the house object 
		//called antherHouse
		anotherHouse.setColor("red");
		
		System.out.println(blueHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		
		//Here we create a new instance of the house object with green house
		//and assign the anotherHouse reference variable to green house.
		House greenHouse = new House("green");
		anotherHouse = greenHouse;
		
		System.out.println(blueHouse.getColor());
		System.out.println(greenHouse.getColor());
		System.out.println(anotherHouse.getColor());
		
		
		/**
		 * this vs super
		 * 
		 * - super: use to access/call the parent class members (variables and methods).
		 * - this: is used to call the current class members (variables and methods)
		 * 
		 * - use this() to call a constructor from another overloaded constructor in 
		 * the same class. 
		 * 
		 * - Note: both calls to this and super must be the first statement in the constructor
		 * of an object.
		 */
		
		/**
		 * Method Overloading Vs Method Overriding
		 * 
		 * - Overloading: providing two or more seprate methods in a class with the same name
		 * but different parameters. Note the compiler decides which method is going to be called based
		 * on the method name return type and argument list. We can overload static and instance methods.
		 * 
		 * - Overriding: means defining a method is a child class that already exists in the parent
		 * class with same signature. Note the method that is going to be called is decided at runtime
		 * by the JVM (Also known as Runtime Polymorphism and Dynamic Method Dispatch)
		 * 
		 * Overloading Rules:
		 * 
		 * Methods will be considered overloaded if both follow the rules
		 * 	- Methods must have the same method name.
		 *  - Methods must have different parameters.
		 *  
		 * If methods follow the rules above then they may or may not
		 *  - Have different return types.
		 *  - Have different access modifiers.
		 *  - Throw different checked or unchecked exceptions.
		 *  
		 *  Overriding Rules:
		 *  
		 *  When overriding a method it's recomended to put @Override immediately above the method name
		 *  deffinition. This is an annotation that the compiler reads and will then show us an error if 
		 *  we dont follow overriding rules correctly. 
		 *
		 * Methods will be considered overridden if both follow the rules
		 *  - It must have same name and same arguments.
		 *  - Return type can be a subclass of the return type in the parent class.
		 *  - It can't have a lower access modifier (private -> protected -> public).
		 *   
		 *   
		 * Important points about overriding:
		 * - Only inherited methods can be overridden, in other words methods can be overridden only in 
		 * child classes.
		 * - Constructors and private methods cannot be overridden. 
		 * - A subclass can use super.methodName() to call the superclass version of an overridden method.
		 * 
		 */
		
		/**
		 * Static methods Vs Instance Methods
		 * 
		 * Static means that the particular belongs to a type itself rather than to an instance of that type
		 * This means that only one instance of that static member is created which is shared across all instance 
		 * of the class.
		 * Static Methods are declared using a static modifier.
		 * Static methods can't access instance methods and instance variables directly.
		 * 
		 * 
		 * Static or Instance?
		 * 
		 * Should a method be static?
		 *  => Does it use any fields (instance variables) or instance methods?
		 *  YES: Instance
		 *  NO: Consider making it static.
		 */
		
	}

}
