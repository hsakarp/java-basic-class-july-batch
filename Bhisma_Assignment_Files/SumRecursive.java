package java_july;

import java.util.Scanner;

public class SumRecursive {

	public static int addition(int n) {

		if (n == 1) {
			return 1;
		} else {
			return (n + addition(n - 1));
		}

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the number for recursive addition");
		int number = input.nextInt();

		/*
		 * if (number < 0) System.out.
		 * print("The number you entered is negative integer. Please enter positive integer "
		 * ); } number = input.nextInt();
		 */

		int output = addition(number);

		System.out.println("Recursive addition of " + number + " is: " + output);

	}

}
