package Level1.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {

		List<String> listNames = new ArrayList<>(Arrays.asList("Pedro", "Juan", "Ramona","Oscar"));


		returnOcharacter(listNames).forEach(System.out::println);

	}


	public static List<String> returnOcharacter(List<String> list){
		return list.stream()
				.filter(s -> s.toLowerCase().contains("o"))
				.collect(Collectors.toList());

	}

}
