package Level1.exercise6L1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> listLength = new ArrayList<>(Arrays.asList("23", "Hola", "Pedro", "23424","4","Bonifacio"));

		System.out.println("List without sorting: ");
		System.out.println(listLength);

		listLength.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));


		System.out.println("List sorted by length with lambda expression:");
		System.out.println(listLength);


	}
}
