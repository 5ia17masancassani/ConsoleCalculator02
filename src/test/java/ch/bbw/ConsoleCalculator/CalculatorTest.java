package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertTrue;


import org.junit.Test;


public class CalculatorTest {
	
	Calculator testee;
	
	@Test
	public void testSummeZweiPositivIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSubtraktionZweiPositivIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
}
