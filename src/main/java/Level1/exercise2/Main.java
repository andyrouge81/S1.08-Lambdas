package Level1.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<String> listNames = new ArrayList<>(Arrays.asList("Pedrolo", "Juan", "Ramona", "Oso","Oscarinho"));


		listBack(listNames).forEach(System.out::println);

	}


	public static List<String> listBack(List<String> list){
		return list.stream()

					   .filter(s -> s.contains("o") && (s.length()>5))
					   .collect(Collectors.toList());


	}

}
