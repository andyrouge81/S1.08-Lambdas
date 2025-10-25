package Level1.exercise7L1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) {


		List<String> listLength = new ArrayList<>(Arrays.asList("23", "Hola", "Pedro", "23424","4","Bonifacio"));

		System.out.println("List without sorting: ");
		System.out.println(listLength);


		listLength.sort(Comparator.comparingInt(String::length).reversed());

		System.out.println("List with reverse sorted:");
		System.out.println(listLength);
	}
}
