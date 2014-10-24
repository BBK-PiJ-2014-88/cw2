
public class FractionTest {
    public static void main(String[] args) {

        // test divide by zero - should print an error and exit
        new Fraction(1, 0);
        // test multiply
		Fraction f = new Fraction(3,10);
		Fraction g = new Fraction(1,2);
		Fraction h = new Fraction(3,5);
		Fraction t = new Fraction(4,5);
		Fraction z = new Fraction(3,8);
		Fraction k = new Fraction(7,18);
		if (!f.equals(g.multiply(h))){
			System.out.println("Multiply failed");
		}
        // test equals
		test(new Fraction(1, 2),new Fraction(1, 2),"error test 1");
		test(new Fraction(1, 2),new Fraction(3, 6),"error test 2");
		test(new Fraction(-1, 2),new Fraction(1, -2),"error test 3");
		test(new Fraction(-1, -2),new Fraction(1, 2),"error test 4");
		test(new Fraction(4, -8),new Fraction(1, 2),"error test 5");

        //addition test

   	    if(!t.equals(f.add(g))){
			System.out.println("Addition failed");
		}
    	else{
			System.out.println("Addition was successful");
			System.out.println(f.add(g));
		}
		if (!new Fraction(55,72).equals(z.add(k))){
			System.out.println("Addition failed");
		}
		else{
			System.out.println("Addition was successful");
			System.out.println(z.add(k));
		}

		// subtraction tests

		if(!new Fraction(-1,10).equals(g.subtract(h))){
			System.out.println("Subtraction failed");
		}
		else{
			System.out.println("Subtraction was successful");
			System.out.println(g.subtract(h));
		}
		if (!new Fraction(37,90).equals(t.subtract(k))){
			System.out.println("Subtraction failed");
		}
		else{
			System.out.println("Subtraction was successful");
			System.out.println(t.subtract(k));
		}

		//division tests

		if(!new Fraction(3,8).equals(f.divide(t))){
			System.out.println("Division failed");
		}
		else{
			System.out.println("Division was successful");
			System.out.println(f.divide(t));
		}
		if (!new Fraction(4,3).equals(g.divide(z))){
			System.out.println("Division failed");
		}
		else{
			System.out.println("Division was successful");
			System.out.println(g.divide(z));
		}


		//absolute value and negation tests

		if (!new Fraction(4,3).equals(new Fraction(4,3).absValue())){
			System.out.println("absValue failed");
		}
		else{
			System.out.println("absValue was successful");
			System.out.println(new Fraction(4,3).absValue());
		}
		if (!new Fraction(12,5).equals(new Fraction(-12,5).absValue())){
			System.out.println("absValue failed");
		}
		else{
			System.out.println("absValue was successful");
			System.out.println(new Fraction(-12,5).absValue());
		}
		if (!new Fraction(4,3).equals(new Fraction(-4,3).absValue())){
			System.out.println("absValue failed");
		}
		else{
			System.out.println("absValue was successful");
			System.out.println(new Fraction(-4,3).absValue());
		}
		if (!new Fraction(5,3).equals(new Fraction(-5,3).negate())){
			System.out.println("negate failed");
		}
		else{
			System.out.println("negate was successful");
			System.out.println(new Fraction(-5,3).negate());
		}
		if (!new Fraction(-21,6).equals(new Fraction(21,6).negate())){
			System.out.println("negate failed");
		}
		else{
			System.out.println("negate was successful");
			System.out.println(new Fraction(21,6).negate());
		}

		//Improved toString method test

		System.out.println(new Fraction(5,1));
		System.out.println(new Fraction(17,3));
		System.out.println(new Fraction(19,1));


    }
    static void test(Fraction f1, Fraction f2, String msg){
				if (! f1.equals(f2)){
				System.out.println(msg);
				}
	}
}