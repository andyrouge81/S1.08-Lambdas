package Level2.exercise2L2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {


		List<Integer> listNumbers = new ArrayList<>(Arrays.asList(4,66,77,5,22));

		System.out.println(callEvenOddNumbers(listNumbers));
	}

	public static String callEvenOddNumbers(List<Integer> numbers){

		return numbers.stream()
					   .map(s -> (s % 2== 0 ? "e" : "o")+ s)
					   .collect(Collectors.joining(","));
	}
}
