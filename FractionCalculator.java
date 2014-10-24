public class FractionCalculator{
	public static void main(String[] args){
		FractionCalculator FractionCalc = new FractionCalculator();
		FractionCalc.launch();
	}
	public void launch(){
		String operator = "";
		Fraction initialValue = new Fraction(0,1);

	    System.out.println("Hello my name is Sergio Lamela");
		System.out.println("Student Number: 12944473");
		System.out.println("Welcome to the amazing Fraction Calculator");
		System.out.println("Please leave a space between numbers and operators: ");
		System.out.println("Please enter what you would like to calculate.");
		System.out.println("To end, insert Q");

		do{
			System.out.println("Enter line of input: ");



		}while (System.console().readLine() != "q" || System.console().readLine() != "Q");

	}

	public void evaluate(Fraction fraction, String inputString){
		Fraction startingValue = fraction;
		String textInput = inputString;
	}
}