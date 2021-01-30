package deb;

public class Pattern {

	public static void main(String[] args) {

		/*
		 * 1 12 123 1234
		 */

		int rows = 4;

		for (int i = 1; i <= rows; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
