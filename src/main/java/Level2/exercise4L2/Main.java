package Level2.exercise4L2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<String> alphanumericList = Arrays.asList("3", "Verde", "343", "Ricardo", "892", "Alfred");


		System.out.println("Sorted by first character: ");
		sortedByFirstCharacter(alphanumericList).forEach(System.out::println);
		System.out.println("Sorted by strings which contains 'e' character: ");
		sortedByECharacter(alphanumericList);
		System.out.println("Change on the strings the character 'a' by number '4': ");
		changeAby4(alphanumericList);
		System.out.println("Show the numeric strings inside the list: ");
		showNumericStrings(alphanumericList).forEach(System.out::println);


	}

	public static List<String> sortedByFirstCharacter(List<String> list){
		return list.stream()
					   .sorted(Comparator.comparing(s -> s.charAt(0)))
					   .collect(Collectors.toList());

	}

	public static void sortedByECharacter(List<String> list){
		list.sort((s1,s2) -> {
							boolean containsE1 = s1.contains("e");
							boolean containsE2 = s2.contains("e");

							if(containsE1 && !containsE2) return -1;
							else if (!containsE1 && containsE2) return 1;
							else return 0;
						});

		list.forEach(System.out::println);
	}


	public static void changeAby4(List<String> list){
		list.stream()
				.map(s -> s.toLowerCase().replace("a","4"))
				.forEach(System.out::println);


	}

	public static List<String> showNumericStrings(List<String> list){

		return list.stream()
				.filter(s -> s.matches("\\d+"))
				.collect(Collectors.toList());

	}
}
