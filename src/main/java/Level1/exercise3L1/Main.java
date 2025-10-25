package Level1.exercise3L1;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {


		List<String> monthsYear = new ArrayList<>(Arrays.asList("January", "February","March","April", "May", "June",
				"July", "August", "September", "October","November", "December"));

		out.println("The years months are: ");
		monthsYear.forEach(months -> out.print(" - "+months));
		}


}


