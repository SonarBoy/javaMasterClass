package com.debugging;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class humanSquaringTests {
	
	HumanSquaringObject obj;
	
	@org.junit.Before
	public void setup() {
		this.obj = new HumanSquaringObject();
	}
	
	@org.junit.Test
	public void correctAns() {
		
		this.obj.humanSquaring(285);
		
		assertEquals((285 * 285),this.obj.ans);
	}
	
	@org.junit.Test
	public void numbersInTens() {
		
		this.obj.humanSquaring(77);
		System.out.println(this.obj.calculationRoll);
	}
	

}
