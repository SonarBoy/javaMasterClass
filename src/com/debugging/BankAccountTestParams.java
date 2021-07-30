package com.debugging;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BankAccountTestParams {
	
	private BankAccount account;
	private double amount;
	private boolean branch;
	private double expected;
	
	
	
	public BankAccountTestParams(double amount, boolean branch, double expected) {
		super();
		this.amount = amount;
		this.branch = branch;
		this.expected = expected;
	}

	@org.junit.Before
	public void setup() {
		this.account = new BankAccount("John", "K",1000,BankAccount.CHECKING);
		System.out.println("Running test.");
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> testConditions(){
		return Arrays.asList(new Object[][] {
			{100,true,1100},
			{150,true,1150},
			{120,true,1120},
			{140,true,1140},
			{160,true,1160},
		});
	}
	
	@org.junit.Test
	public void getBalance_deposit() throws Exception{
		
		this.account.deposit(amount, branch);
		assertEquals(expected, this.account.getBalance(),0);
		
	}
}
