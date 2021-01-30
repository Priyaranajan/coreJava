package deb;

public class ReverseNumber {
	// using while loop

	public static void main(String[] args) {

		int n = 987654, reverse = 0;
		while (n != 0) {
			int r = n % 10;
			reverse = reverse * 10 + r;
			n = n / 10;
		}
		System.out.println("The reverse number is: " + reverse);
	}
}
/*
 * int number = 123456, reverse = 0;
 * 
 * //we have not mentioned the initialization part of the for loop for( ;number
 * != 0; number=number/10) { int remainder = number % 10; reverse = reverse * 10
 * + remainder; } System.out.println("The reverse of the given number is: " +
 * reverse); }
 */