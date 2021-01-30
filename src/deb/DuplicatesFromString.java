package deb;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicatesFromString {

	public static void main(String[] args) {

		String[] strAnimals = { "lion", "bear", "deer", "lion", "elephant", "deer" };

		System.out.println("Before removing duplicates from string array: " + Arrays.toString(strAnimals));
		// convert given string array to list add elements to LinkedHashSet
		// LinkedHashSet will remove duplicate elements

		LinkedHashSet<String> lhsAnimals = new LinkedHashSet<String>(Arrays.asList(strAnimals));

		String[] strNewAnimals = lhsAnimals.toArray(new String[lhsAnimals.size()]);

		System.out.println("After removing duplicates from string array: " + Arrays.toString(strNewAnimals));
	}
}
