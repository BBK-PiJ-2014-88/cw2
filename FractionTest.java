
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

    }
    static void test(Fraction f1, Fraction f2, String msg){
				if (! f1.equals(f2)){
				System.out.println(msg);
				}
	}
}