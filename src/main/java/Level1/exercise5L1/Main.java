package Level1.exercise5L1;

public class Main  {
	public static void main(String[] args) {


		PiValueInterface pi = () -> 3.14159;

		System.out.println("Pi value: "+pi.getPiValue());


	}

}
