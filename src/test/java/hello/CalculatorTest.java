package hello;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(3, 4);		
		
		assertEquals(7, result);
	}
	
	@Test
	public void testB64() {
		Calculator calculator = new Calculator();
		String result;
		try {
			result = calculator.toB64("pippo");
			assertEquals("cGlwcG8=", result);
		} catch (UnsupportedEncodingException e) {
			fail(e.getMessage());
		}
	}

}
