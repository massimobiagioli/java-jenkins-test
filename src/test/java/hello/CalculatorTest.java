package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testSum() {
		Calculator calculator = new Calculator();
		int result = calculator.sum(3, 4);		
		
		assertEquals(7, result);
	}

}
