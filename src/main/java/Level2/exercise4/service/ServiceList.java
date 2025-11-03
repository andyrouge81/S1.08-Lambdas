package Level2.exercise4.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceList {


	public List<String> sortedByFirstCharacter(List<String> list){
		return list.stream()
					   .sorted(Comparator.comparing(s -> s.charAt(0)))
					   .collect(Collectors.toList());

	}

	public List<String> sortedByECharacter(List<String> list){
			return list.stream()
					.sorted(Comparator.comparing(s ->!s.toLowerCase().contains("e")))
					.collect(Collectors.toList());
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
