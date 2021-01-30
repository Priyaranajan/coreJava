package deb;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDupStringArray {

	static String[] strColors = { "red", "blue", "green", "red", "yellow", "green" };
	// duplicate

	// compre to
	/*
	 * for(int i=0;i<strColors.length;i++) { for(int j=i+1;j<strColors.length;j++){
	 * 
	 * if(strColors[i]).equals(strColors[j]){ System.out.println();
	 * 
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<String> aListColors = new ArrayList<String>();

		for (int i = 0; i < strColors.length; i++) {

			if (!aListColors.contains(strColors[i])) {
				aListColors.add(strColors[i]);
			}

			// convert ArrayList back to array
			strColors = aListColors.toArray(new String[aListColors.size()]);

			System.out.println("Array after removing duplicates: " + Arrays.toString(strColors));

		}
	}
}
