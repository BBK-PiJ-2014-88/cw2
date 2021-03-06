//Completed Version
public class FractionCalculatorTest{
	public static void main(String[] args){
		//check that Calculator can carry out the 4 main operators with some or several
		//numbers and fractions

		FractionCalculator testerCalculator = new FractionCalculator();
		Fraction fractionA = new Fraction(1,2);

		//addition test

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

		//division test

		System.out.println(testerCalculator.evaluate(fractionA, "7 / 5"));
		if(testerCalculator.initialValue.equals(new Fraction(7,5))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}
		System.out.println(testerCalculator.evaluate(fractionA, "18/3 / 9/7"));
		if(testerCalculator.initialValue.equals(new Fraction(14,3))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		//absolute value, negative and clear test, alone and in combination with
		//other operations. Try all possibilities a,A,abs,n,N,neg,c,C,clear

		System.out.println(testerCalculator.evaluate(fractionA, "2 - 3 abs + 4"));
		if(testerCalculator.initialValue.equals(new Fraction(5,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "2 + 3 - 10 A"));
		if(testerCalculator.initialValue.equals(new Fraction(5,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "-3 a + 2"));
		if(testerCalculator.initialValue.equals(new Fraction(5,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "2 neg - 3"));
		if(testerCalculator.initialValue.equals(new Fraction(-5,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "3/1 - 6 N + 3"));
		if(testerCalculator.initialValue.equals(new Fraction(6,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "4 n"));
		if(testerCalculator.initialValue.equals(new Fraction(-4,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "5 + 2 clear 3"));
		if(testerCalculator.initialValue.equals(new Fraction(3,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "4 * 1/2 C 1 + 1"));
		if(testerCalculator.initialValue.equals(new Fraction(2,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println(testerCalculator.evaluate(fractionA, "4 5 c 6"));
		if(testerCalculator.initialValue.equals(new Fraction(6,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		//check that quit works and that an error message is printed when an error occurs
		//when an error occurs the value of initialValue should be 0 as it is reset after errors

		System.out.println("Should print an error message: ");
		System.out.println(testerCalculator.evaluate(fractionA, "5 + 3?"));
		if(testerCalculator.initialValue.equals(new Fraction(0,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println("Should print an error message: ");
		System.out.println(testerCalculator.evaluate(fractionA, "5 + + +"));
		if(testerCalculator.initialValue.equals(new Fraction(0,1))){
			System.out.println("test successful");
		}
		else{
			System.out.println("test failed");
		}

		System.out.println("Checking that program will quit");
		System.out.println(testerCalculator.evaluate(fractionA, "3 + 5 q"));

		System.out.println("Checking that program will quit Test2");
		System.out.println(testerCalculator.evaluate(fractionA, "3 + 5 - 4 q 5"));

		System.out.println("Checking that program will quit Test2");
		System.out.println(testerCalculator.evaluate(fractionA, "7/3 + 1 Q 5"));

	}
}