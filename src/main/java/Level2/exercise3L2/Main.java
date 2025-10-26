package Level2.exercise3L2;

import Level2.exercise3L2.interfaces.CalculatorInterface;

public class Main {
	public static void main(String[] args) {

		float a = 5;
		float b = 0;

		CalculatorInterface add = (() -> a+b);

		CalculatorInterface subtract= (() -> a-b);

		CalculatorInterface multiply = (() -> a*b);


		CalculatorInterface division = () -> {
				if (b == 0) throw new ArithmeticException("No zero divide");

				return a / b;

			};

		showOperationResult("Add",add);
		showOperationResult("Subtract", subtract);
		showOperationResult("Multiply", multiply);
		showOperationResult("Division", division);
	}



	public static void showOperationResult(String nameOperation, CalculatorInterface calculator){

		try{
			System.out.println(nameOperation +": " + calculator.operation());
		}catch (ArithmeticException ae){
			System.out.println("Error: "+ae.getMessage());
		}
	}
}
