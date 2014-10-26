public class FractionCalculatorTest{
	public static void main(String[] args){
		//check that Calculator can carry out the 4 main operators with some or several
		//numbers and fractions
		FractionCalculator testerCalculator = new FractionCalculator();
		Fraction fractionA = new Fraction(1,2);
		System.out.println(testerCalculator.evaluate(fractionA, "3 + 2"));
	}
}