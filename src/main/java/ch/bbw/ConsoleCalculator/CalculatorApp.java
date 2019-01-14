package ch.bbw.ConsoleCalculator;

/**
 * Hello world!
 *
 */
public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int val1 = 0;
		int val2 = 0;

		System.out.println("|Console Calculator|");
		System.out.println("==================");
		System.out.println();

		val1 = 10;
		val2 = 20;
		System.out.println("Summe " + val1 + " + " + val2 + " = " + calc.addition(10, 20));
		System.out.println("Differenz " + val2 + " - " + val1 + " = " + calc.subtraktion(20, 10));
		System.out.println("Produkt " + val1 + " * " + val2 + " = " + calc.multiplikation(10, 20));
		System.out.println("Quotient " + val2 + " / " + val1 + " = " + calc.division(20, 10));

	}
}
