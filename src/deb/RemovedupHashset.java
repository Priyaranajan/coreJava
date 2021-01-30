package deb;

import java.util.HashSet;
import java.util.Set;

public class RemovedupHashset {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		System.out.println("Duplicate elements in given array: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
		String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
		System.out.println("Finding duplicate elements in array using brute force method");
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {

				}
			}
		}
		// Second solution : use HashSet data structure to find duplicates
		System.out.println("Duplicate elements from array using HashSet data structure");
		Set<String> store = new HashSet<>();
		for (String name : names) {

			if (store.add(name) == false) {

				System.out.println("found a duplicate element in array : " + name);

			}
		}
	}
}
