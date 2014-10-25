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
		boolean carryOn = true;

		do{
			System.out.println("Enter line of input: ");
			String userInput = System.console().readLine();
			evaluate(initialValue, userInput);
		}while (carryOn == true);

	}

	public void evaluate(Fraction fraction, String inputString){
		Fraction resultValue = fraction;
		String textInput = inputString;

		String unitOfText = ""; //temporary holder for unit(operator or fraction) entered by user
		String operator = "";
		Fraction operand2 = new Fraction(0,1);

		int startOfUnit = 0;
		int position = 0;
		int position2 = 1;

		while (position2 < textInput.length()){
			boolean checkUnit = false;
			if (textInput.substring(position, position2).equals(" ")){
				unitOfText = textInput.substring(startOfUnit, position);
				startOfUnit = position2;
				position++;
				position2++;
				checkUnit = true;
			}
			else{
				position++;
				position2++;
			}
			if(checkUnit == true){
				if(unitOfText.equals("q") || unitOfText.equals("Q") || unitOfText.equals("quit")){
					System.out.println("You have exited the program. Goodbye");
					System.exit(0);
					break;
				}

			}


		}
		System.out.println("Result of calculating line of input: " + resultValue);
	}

	public Fraction convertToFraction(String numStr){
	//This method converts the numbers the user has entered into fractions to be used
	//in the evaluate method
		String strToConvert = numStr;
		boolean inFractionForm = false;
		int operand1 = 0;
		int operand2 = 0;
		for (int x = 0; x < numStr.length(); x++){
			if (strToConvert.charAt(x).equals("/"))
				operand1 = Integer.parseInt(strToConvert.substring(0,x));
				operand2 = Integer.parseInt(strToConvert.substring(x+1,strToConvert.length()));
				inFractionForm = true;
				return new Fraction(operand1, operand2);
		}
		if(inFractionForm == false){
			operand1 = Integer.parseInt(strToConvert);
			return new Fraction(operand1,1);
		}
	}
}

//will probably need to use if num.getClass() != Fraction, use the method to convert it to a fraction