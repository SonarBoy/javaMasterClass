package com.debugging;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class BankAccountTest {
	
	private BankAccount account;
	
	
	private static int showWhenExecuted;
	
	@org.junit.BeforeClass
	public static void starter() {
		System.out.println("Before class runs tests once per run "
				+ "instead of once per method invocation.");
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	
	@org.junit.Before
	public void setup() {
		this.account = new BankAccount("John", "K",1000,BankAccount.CHECKING);
		System.out.print("The annotation org.junit.Before gets executed before every test.");
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	//Annotation test tell the 
	@org.junit.Test
	public void deposit() throws Exception{
		
		double balance = this.account.deposit(200, true);
		assertEquals(1200, balance,0);
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	@org.junit.Test
	public void getBalance_deposit() throws Exception{
		
		this.account.deposit(200, true);
		assertEquals(1200, this.account.getBalance(),0);
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	@org.junit.Test
	public void getBalance_withdraw_branch() throws Exception{
		
		this.account.withdraw(600, true);
		assertEquals(400,this.account.getBalance(),0);
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	//This is how you catch an exception in a junit test.
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void getBalance_withdraw_notBranch() throws Exception{
		
		this.account.withdraw(600, false);
		assertEquals(400,this.account.getBalance(),0);
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	@org.junit.Test
	public void isChecking_true() {
		
		assertTrue("The account is not a checking account",this.account.isChecking());
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	@org.junit.Test
	public void dummyTest() {
		assertEquals(20,20);
		System.out.println("Execution Count " + showWhenExecuted++);
		/*
		assertNotEquals() we can use this instead of assertEquals() when we don't 
		want the actual value to be equal to a specific value.
		
		assertArrayEquals() when we want to verify the value of an array, we have to use
		the assertArrayEquals()method assertEquals method wont work 
		because it will only consider two arrays equal if they are the same instance.
		assertArrayEquals() method considers two arrays equal when their lengths 
		are the same and every element in both arrays is the same.  
		
		assertNull() checks for null
		
		assertNotNull() checks for not null 
		
		assertSame and assertNotSame() we use this when we want to check whether two
		instances are the exact same instance. Remember that the assertEquals() method
		uses the equals() method to test for equality. The assertSame() method compares
		the object references. 
		
		assertThat() this method compares the actual value against a matcher. This is more 
		powerful than the other assert methods since we can compare the actual value against
		a range of values. 
		*/
	}
	
	@org.junit.AfterClass
	public static void ender() {
		System.out.println("Logged out.");
		System.out.println("Execution Count " + showWhenExecuted++);
	}
	
	@org.junit.AfterClass
	public static void teardown() {
		System.out.println("Logged out.");
		System.out.println("Execution Count " + showWhenExecuted++);
	}
}

