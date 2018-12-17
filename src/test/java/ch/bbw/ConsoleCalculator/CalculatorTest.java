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
	public void testSummeZweiNegativIsOk() {

		assertTrue(testee.addition(-10, -25) == -35);
	}
	
	@Test
	public void testSummePositivNegativIsOk() {

		assertTrue(testee.addition(-10, 25) == 15);
	}
	
	@Test
	public void testSummePositivNullIsOk() {

		assertTrue(testee.addition(50, 0) == 50);
	}
	
	@Test
	public void testSummeNegativNullIsOk() {

		assertTrue(testee.addition(-50, 0) == -50);
	}
	
	@Test
	public void testSummeMaxIsOk() {

		assertTrue(testee.addition(Integer.MAX_VALUE, 1) == Integer.MAX_VALUE+1);
	}
	
	@Test
	public void testSummeMinIsOk() {

		assertTrue(testee.addition(Integer.MIN_VALUE, -1) == Integer.MIN_VALUE-1);
	}
	
	@Test
	public void testSummeMaxMinIsOk() {

		assertTrue(testee.addition(Integer.MIN_VALUE, Integer.MAX_VALUE) == -1);
	}
	
	
	

	@Test
	public void testSubtraktionZweiPositivIsOk() {

		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubtraktionZweiNegativIsOk() {

		assertTrue(testee.subtraktion(-5, -10) == 5);
	}
	
	@Test
	public void testSubtraktionPositivNegativIsOk() {

		assertTrue(testee.subtraktion(5, -10) == 15);
	}
	
	@Test
	public void testSubtraktionPositivNullIsOk() {

		assertTrue(testee.subtraktion(0, 10) == -10);
	}
	
	@Test
	public void testSubtraktionNegativNullIsOk() {

		assertTrue(testee.subtraktion(0, -10) == 10);
	}
	
	@Test
	public void testSubtraktionMaxIsOk() {

		assertTrue(testee.subtraktion(Integer.MAX_VALUE, -1) == Integer.MAX_VALUE+1);
	}
	
	@Test
	public void testSubtraktionMinIsOk() {

		assertTrue(testee.subtraktion(Integer.MIN_VALUE, 1) == Integer.MIN_VALUE-1);
	}
	
	@Test
	public void testSubtraktionMaxMinIsOk() {

		assertTrue(testee.subtraktion(Integer.MAX_VALUE, Integer.MIN_VALUE) == -1);
	}
	
	
	

	@Test
	public void testMultiplikationZweiPositivIsOk() {

		assertTrue(testee.multiplikation(4, 3) == 12);
	}
	
	
	
	
	@Test
	public void testDivisionZweiPositivIsOk() {

		assertTrue(testee.division(25, 5) == 5);
	}
	
	@Test
	public void testDivisionZweiNegativIsOk() {

		assertTrue(testee.division(-25, -5) == 5);
	}
	
	@Test
	public void testDivisionPositivNegativIsOk() {

		assertTrue(testee.division(25, -5) == -5);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivisionDurchNullExpected() {

		assertTrue(testee.division(25, 0) == 0);
	}

//	@Test
//	public void testDivisionDurchNullUnexpected() throws ArithmeticException {
//		
//		assertTrue(testee.division(25, 0) == 0);
//	}
	
	@Test
	public void testDivisionMaxExpected() {

		assertTrue(testee.division(Integer.MAX_VALUE, Integer.MAX_VALUE) == 1);
	}
	
	@Test
	public void testDivisionMinExpected() {

		assertTrue(testee.division(Integer.MIN_VALUE, Integer.MIN_VALUE) == 1);
	}
	
	@Test
	public void testDivisionMaxMinExpected() {

		assertTrue(testee.division(Integer.MIN_VALUE, Integer.MIN_VALUE) == Integer.MIN_VALUE / Integer.MIN_VALUE);
	}
	
	
	
}
