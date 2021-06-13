package com.namingconventions;

public class Demo {
	
	public static int multiplier = 7;
	
	public static void main(String [] args) {
		
		java.lang.Integer x =  8;
		
//		MyWindow test = new MyWindow("Hello");
//		test.setVisible(true);
		//org.w3c.dom.Node node = null;
		
		//Scope Work
		
//		String privateVarFour = "This is private to main()";
//		
//		ScopeCheck scopeInstance = new ScopeCheck();
//		System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());
//		
//		//this will return the private var that is a string and not the private var from the 
//		//ScopeCheck class.
//		System.out.println(privateVarFour);
//		
//		scopeInstance.timesTwo();
//		
//		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//		
//		innerClass.timesTwo();
//		innerClass.timesTwoOuter();
//		
//		scopeInstance.useInner();
		
		
		//Access modifiers examples
//		Account timsAccount = new Account("Tim");
//		timsAccount.deposit(1000);
//		timsAccount.withdraw(500);
//		timsAccount.withdraw(-200);
//		timsAccount.deposit(-20);
//		
//		timsAccount.calculateBalance();
//		
//		System.out.println("Balance on account is " +timsAccount.getBalance());
	
		
		
		StaticTest firstInstance = new StaticTest("1st Instance");
		System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
		
		StaticTest secondInstance = new StaticTest("2nd Instance");
		System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
		
		StaticTest thirdInstance = new StaticTest("3rd Instance");
		System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());
		
		
		//Normal class fields require an instance of the class
		//that dont actually exist until an instance has been created
		// main method is static and it can be called with the class instance
		// as a result java cnat allow a static method to access not static
		// fields or methods becase frankly they dont exist when the static Methods
		//called.
		
		//This restriction is pruely for static methods accessing non static fields
		// in its own class because the class that they are in has not been initialzed as an object. 
		
		System.out.println(multiply(6));
		
		SomeClass one = new SomeClass("One");
		SomeClass two = new SomeClass("Two");
		SomeClass three = new SomeClass("Three");
		
		System.out.println(one.getInstanceNumber());
		System.out.println(two.getInstanceNumber());
		System.out.println(three.getInstanceNumber());
		
		//WHy are constants declared as static final?
		//Because if the value really is constant and wont change
		// you dont want to be creating a copy of it with every instance.
		
		//By marking a class as final you can prevent your class from being
		//sub classed. 

		
		//Declaring your methods final
//		int pw = 101010101;
//		
//		//Password password = new ExtendedPassword(pw);
//		Password password = new Password(pw);
//		password.storePassword();
//		
//		password.letMeIn(1);
//		password.letMeIn(2321);
//		password.letMeIn(12345);
//		password.letMeIn(65651);
//		password.letMeIn(14444);
//		password.letMeIn(pw);
		
		System.out.println("Main method called");
		
		SIBTest test = new SIBTest();
		
		test.someMethod();
		
		System.out.println("Owner is " + SIBTest.owner);
		
		
	}
	
	public static int  multiply(int number) {
		return number * multiplier;
	}
}
