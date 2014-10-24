
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int num, int denom) {
        if (denom == 0) {
            System.out.println("Invalid fraction with denominator 0");
	    // this should use exceptions
            return;
        }
        int gcd = myGcd(num, denom);
        setNumerator(num / gcd);
        setDenominator(denom / gcd);
    }

    @Override
    public String toString() {
        return "" + getNumerator() + '/' + getDenominator();
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int num) {
        numerator = num;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int num) {
        denominator = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    public Fraction multiply(Fraction other) {

        int num = this.getNumerator() * other.getNumerator();
        int denom = this.getDenominator() * other.getDenominator();
        return new Fraction(num, denom);
    }

    public Fraction add(Fraction other){
		int numThis = this.getNumerator();
		int denomThis = this.getDenominator();
		int numOther = other.getNumerator();
		int denomOther = other.getDenominator();
		int lcmOfThese = lcm(denomThis,denomOther);
		int multiplierThis = lcmOfThese / denomThis;
		int multiplierOther = lcmOfThese / denomOther;
		//using the multiplier to convert fraction to addable form
		denomThis = denomThis * multiplierThis;
		denomOther = denomOther * multiplierOther;
		numThis = numThis * multiplierThis;
		numOther = numOther * multiplierOther;
		int resultNumerator = numThis + numOther;
		return new Fraction(resultNumerator, denomThis);

	}

	public Fraction subtract(Fraction other){
		int numThis = this.getNumerator();
		int denomThis = this.getDenominator();
		int numOther = other.getNumerator();
		int denomOther = other.getDenominator();
		int lcmOfThese = lcm(denomThis,denomOther);
		int multiplierThis = lcmOfThese / denomThis;
		int multiplierOther = lcmOfThese / denomOther;
		//using the multiplier to convert fraction to subtractable form
		denomThis = denomThis * multiplierThis;
		denomOther = denomOther * multiplierOther;
		numThis = numThis * multiplierThis;
		numOther = numOther * multiplierOther;
		int resultNumerator = numThis - numOther;
		return new Fraction(resultNumerator, denomThis);
	}

	public int lcm(int a, int b){
		//a method to find the lowest common multiple of 2 numbers
		//this is necessary to convert the denominators of 2 fractions to the same
		//number so they can be added or subtracted
		//formula for the lcm of numbers A and B is
		//(A*B)/gcd(A,B)
		int abNumerator = a*b;
		int gcd = myGcd(a,b);
		int lowestMultiple = abNumerator / gcd;
		return lowestMultiple;
	}

    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}