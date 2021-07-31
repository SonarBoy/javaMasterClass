package com.debugging;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UtilitiesTest {
	
	private Utilities utils;
	private String inputValue = "";
	private String outputValue = "";
	
	
	
	public UtilitiesTest(String o,String i) {
		super();
		
		this.outputValue = o;
		this.inputValue = i;
	}
	
	
	@org.junit.Before
	public void setup() {
		this.utils = new Utilities();
	}
	
//	
	@org.junit.Test
	public void everyNthChar_Test() {
		//(char[] arr, int n)
		
		char[] arr = {'h','e','l','l','o'};

		
		assertArrayEquals(new char[] {'e','l'},utils.everyNthChar(arr, 2));
		
		assertArrayEquals(new char[]{'h','e','l','l','o'},utils.everyNthChar(arr, 19));
		//fail("Test not yet implemented: everyNthChar_Test");
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> testConditions_removePairs(){
		return Arrays.asList(new Object[][] {
			{"ABCDEF","ABCDEFF"},
			{"AB8EFG","AB88EFFG"},
			{"ZYZQB","ZYZQQB"},
			{"A","A"},
		});
	}
	
	
	//@org.junit.Test(expected = Exception.class)
	@org.junit.Test
	public void removePairs() throws Exception{
		
//		assertEquals("ABCDEF",utils.removePairs("AABCDDEFF"));
//		assertEquals("ABCABDEF",utils.removePairs("ABCCABDEEF"));
//		
//		
//		assertEquals("a",utils.removePairs("a"));
//		assertEquals(null,utils.removePairs(null));
		
		assertEquals(outputValue,utils.removePairs(inputValue));
		//(String source)
		
		//fail("Test not yet implemented: removePairs");
	}
	
	@org.junit.Test(expected = ArithmeticException.class)
	public void converter() {
		//(int a, int b)
		
		assertEquals(300,utils.converter(10, 5));
		assertEquals(300,utils.converter(10, 0));
		//fail("Test not yet implemented: converter");
	}
	
	@org.junit.Test
	public void nullIfOddLength() {
		
		assertEquals("00",utils.nullIfOddLength("00"));
		assertEquals(null,utils.nullIfOddLength("002"));
		//(String s)
		//fail("Test not yet implemented: nullIfOddLength");
	}
	
}
