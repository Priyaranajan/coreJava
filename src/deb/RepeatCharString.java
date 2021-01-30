package deb;

public class RepeatCharString {

	public static void main(String[] args) {

		String s = "abbcdbbbbbuibbyb";
		// String str = "beautiful beach";

		char[] carray = s.toCharArray();
		// System.out.println("The string is:" + s);
		// System.out.print("Duplicate Characters in above string are: ");

		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; j < s.length(); j++) {

				if (carray[i] == carray[j]) {

					System.out.print(carray[j] + " ");
					break;

				}

			}
		}
	}
}
