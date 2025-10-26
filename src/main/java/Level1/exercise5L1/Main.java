package Level1.exercise5L1;

import Level1.exercise5L1.interfaces.PiValueInterface;

public class Main  {
	public static void main(String[] args) {


		PiValueInterface pi = () -> 3.14159;

		System.out.println("Pi value: "+pi.getPiValue());


	}

}
