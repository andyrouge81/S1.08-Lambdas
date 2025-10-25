package Level2.exercise1L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<String> listNames = new ArrayList<>(Arrays.asList("Alfredo", "Ana", "Manolo", "Ale", "Andrea"));

		System.out.println("The names of the list started by 'A' are: ");


		callTeamA(listNames).forEach(System.out::println);
	}

	public static List<String> callTeamA(List<String> names){
		return names.stream()
				.filter(s ->s.startsWith("A"))
				.filter(s ->s.length()==3 )
				.collect(Collectors.toList());


	}
}
