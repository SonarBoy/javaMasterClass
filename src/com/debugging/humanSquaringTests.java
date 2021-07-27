package com.debugging;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class humanSquaringTests {
	
	@org.junit.Before
	public void setup() {
		
	}
	
	@org.junit.Test
	public void correctAns() {
		
		humanSquaring.humanSquaring(285);
		assertEquals((285 * 285),humanSquaring.ans);
	}
	
	@org.junit.Test
	public void numbersInTens() {
		
//		for(int runner = 5; runner <= 20; runner += 5) {
//			
//			humanSquaring.humanSquaring(runner);
//			
//			assertEquals(10 % 5,(humanSquaring.firstDistance) % 5);
//		}
			
		
	}
	

}
