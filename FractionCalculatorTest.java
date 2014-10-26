public class FractionCalculatorTest{
	public static void main(String[] args){
		//check that Calculator can carry out the 4 main operators with some or several
		//numbers and fractions
		FractionCalculator testerCalculator = new FractionCalculator();
		//addition test
		Fraction fractionA = new Fraction(1,2);
		System.out.println(testerCalculator.evaluate(fractionA, "3 + 2"));
		if(testerCalculator.initialValue.equals(new Fraction(5,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}
		//subtraction test
		System.out.println(testerCalculator.evaluate(fractionA, "6/1 - 2"));
		if(testerCalculator.initialValue.equals(new Fraction(4,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "4/2 - 7/1"));
		if(testerCalculator.initialValue.equals(new Fraction(-5,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}
		//multiplication test
		System.out.println(testerCalculator.evaluate(fractionA, "1/2 * 1/4"));
		if(testerCalculator.initialValue.equals(new Fraction(1,8))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "17/5 * 31/2"));
		if(testerCalculator.initialValue.equals(new Fraction(527,10))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}
		//subtraction test
		System.out.println(testerCalculator.evaluate(fractionA, "6 - 2"));
		if(testerCalculator.initialValue.equals(new Fraction(4,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}
	}
}