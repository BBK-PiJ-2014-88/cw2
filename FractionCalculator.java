public class FractionCalculator{
	public static Fraction initialValue = new Fraction(0,1); //this is equivalent to 0
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


		boolean carryOn = true;
		String userInput = "";

		do{
			System.out.println("Calculator initial value: " + initialValue);
			System.out.println("Enter line of input: ");
		    userInput = System.console().readLine();
			evaluate(initialValue, userInput);
		}while (!(userInput.equals("q")) && !(userInput.equals("Q")) && !(userInput.equals("quit")));

	}

	public void evaluate(Fraction fraction, String inputString){
		Fraction resultValue = fraction;
		String textInput = inputString + "  "; //add 2 spaces at the end so last value in input is not ignored
		System.out.println(inputString);

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
				else if(unitOfText.equals("+") || unitOfText.equals("-") ||
				unitOfText.equals("*") || unitOfText.equals("/")){
					if(!(operator.equals(""))){
						System.out.println("Error: You have inserted 2 operators in a row");
						System.out.println("The calculator will now reset");
						position2 = textInput.length() + 1;
						initialValue = new Fraction(0,1);
						break;
					}
					else{
						operator = unitOfText;
					}
				}
				else if(unitOfText.equals("a") || unitOfText.equals("A")||
				unitOfText.equals("abs")){
					resultValue = resultValue.absValue();
				}
				else if (unitOfText.equals("n") || unitOfText.equals("N")||
				unitOfText.equals("neg")){
					resultValue = resultValue.negate();
				}
				else if (unitOfText.equals("c") || unitOfText.equals("C")||
				unitOfText.equals("clears")){
					resultValue = new Fraction(0,1);
				}



			}


		}
		System.out.println("Result of calculating line of input: " + resultValue);
		System.out.println(unitOfText);
		initialValue = resultValue;
	}


	public Fraction convertToFraction(String numStr){
		//This method converts the numbers the user has entered into fractions to be used
		//in the evaluate method
		String strToConvert = numStr;
		int operand1 = 0;
		int operand2 = 0;
		for (int x = 0; x < numStr.length(); x++){
			if (strToConvert.substring(x,x+1).equals("/")){
				operand1 = Integer.parseInt(strToConvert.substring(0,x));
				operand2 = Integer.parseInt(strToConvert.substring(x+1,strToConvert.length()));
				return new Fraction(operand1, operand2);
			}
	    }
		//if program goes through the program without returning this means there is no "/"
		//and the input is simply a whole number so need to return as a fraction of number/1
		operand1 = Integer.parseInt(strToConvert);
		return new Fraction(operand1,1);

	}
}

//will probably need to use if num.getClass() != Fraction, use the method to convert it to a fraction