public class FractionCalculator{
	public static void main(String[] args){
		FractionCalculator FractionCalc = new FractionCalculator();
		FractionCalc.launch();
	}
	public void launch(){
	    System.out.println("Hello my name is Sergio Lamela");
		System.out.println("Student Number: 12944473");
		System.out.println("Welcome to the amazing Fraction Calculator");
		System.out.println("Please leave a space between numbers and operators: ");
		System.out.println("Please enter what you would like to calculate.");
		System.out.println("To end, insert Q");

		//User String input and initial fraction value will be put into evaluate method
		//each iteration. The evaluate method will print the final result of
		//evaluating the user's line of input. The initialValue fraction will become
		//the final output of the previous iteration.

		Fraction initialValue = new Fraction(0,1); //this is equivalent to 0

		do{
			System.out.println("Enter line of input: ");
			String userInput = System.console().readLine();
			evaluate(initialValue, userInput);
		}while (System.console().readLine() != "q" || System.console().readLine() != "Q");

	}

	public void evaluate(Fraction fraction, String inputString){
		Fraction resultValue = fraction;
		String textInput = inputString;
		String operator = "";
		int position = 0;
		int position2 = 0;
		while (position < textInput.length()){

		}
	}
}