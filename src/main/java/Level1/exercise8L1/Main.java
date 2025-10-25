package Level1.exercise8L1;

public class Main {
	public static void main(String[] args) {

		ReverseInterface reversed = (s ->  new StringBuilder(s).reverse().toString());

		String originalWord = "Manolocabezabolo";
		String reverseWord = reversed.reverse(originalWord);

		System.out.println("The original word is, "+originalWord+ " the reversed one is: "+reverseWord);



	}
}
