package ch.bbw.ConsoleCalculator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator testee;
	
	@Before
	public void setup() {
		testee = new Calculator();
		
	}
	
	@Test
	public void testSummeZweiPositivIsOk() {
		
		assertTrue(testee.addition(10, 25) == 35);
	}
	
	@Test
	public void testSubtraktionZweiPositivIsOk() {
		
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testMultiplikationZweiPositivIsOk() {
		
		assertTrue(testee.multiplikation(4, 3) == 12);
	}
	
	@Test
	public void testDivisionZweiPositivIsOk() {
		
		assertTrue(testee.division(25, 5) == 5);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivisionDurchNullExpected() {
		
		assertTrue(testee.division(25, 0) == 0);
	}
	
	@Test
	public void testDivisionDurchNullUnexpected() throws ArithmeticException {
		
		assertTrue(testee.division(25, 0) == 0);
	}
}
