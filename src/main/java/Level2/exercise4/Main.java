package Level2.exercise4;

import Level2.exercise4.service.ServiceList;

import java.util.Arrays;
import java.util.List;


public class Main {
	public static void main(String[] args) {

		List<String> alphanumericList = Arrays.asList("3", "Verde", "343", "Ricardo", "892", "Alfred","Ernest");

		ServiceList listSorted = new ServiceList();


		System.out.println("Sorted by first character: ");
		listSorted.sortedByFirstCharacter(alphanumericList).forEach(System.out::println);


		System.out.println("Sorted by strings which contains 'e' character: ");
		List<String> list2 = listSorted.sortedByECharacter(alphanumericList);
		System.out.println(list2);


		System.out.println("Change on the strings the character 'a' by number '4': ");
		listSorted.changeAby4(alphanumericList);

		System.out.println("Show the numeric strings inside the list: ");
		System.out.println(listSorted.showNumericStrings(alphanumericList));


	}

}
