package deb;

import java.util.Scanner;

public class HighestOddEven {

	// Write a java program to accept array of N integers and find the largest odd
	// number as well as largest even number and display them.

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int size, i, even = 1, odd = 0;
		System.out.println("enter size::");
		size = s.nextInt();
		int a[] = new int[size];
		System.out.println("enter array elements..");
		for (i = 0; i < size; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				if (even == 1) {
					even = a[i];
				}
				if (even < a[i]) {
					even = a[i];
				}
			} else {
				if (a[i] % 2 != 0) {
					if (odd == 0) {
						odd = a[i];
					}
					if (odd < a[i]) {
						odd = a[i];
					}
				}
			}
		}
		System.out.println("max of even is::" + even);
		System.out.println("max of odd is::" + odd);
	}

}
