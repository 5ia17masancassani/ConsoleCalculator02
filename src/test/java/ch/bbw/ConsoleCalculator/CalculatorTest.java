package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertTrue;


import org.junit.Test;


public class CalculatorTest {
	
	Calculator testee;
	
	@Test
	public void shouldAnswerWithTrue() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
}
