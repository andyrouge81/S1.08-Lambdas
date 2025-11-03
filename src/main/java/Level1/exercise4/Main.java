package Level1.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<String> monthsYear = new ArrayList<>(Arrays.asList("January", "February","March","April", "May", "June",
				"July", "August", "September", "October","November", "December"));

		System.out.println("The year months are: ");
		monthsYear.forEach(System.out::println);
	}
}
