package Level2.exercise3;

import Level2.exercise3.interfaces.CalculatorInterface;

public class Main {
	public static void main(String[] args) {


		CalculatorInterface add = ((a, b) -> a + b);

		CalculatorInterface subtract = ((a, b) -> a - b);

		CalculatorInterface multiply = ((a, b) -> a * b);



		CalculatorInterface division = (a, b) ->  a / b;



		System.out.println("Addition: "+add.operation(5,3));
		System.out.println("Subtract: "+subtract.operation(4, 2 ));
		System.out.println("Multiply: "+multiply.operation(3,7));
		System.out.println("Division: " +division.operation(5,5));
		System.out.println("Division by zero: "+division.operation(5,0));
	}
}

