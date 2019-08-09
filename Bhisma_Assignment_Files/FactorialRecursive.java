package java_july;

import java.util.Scanner;
public class FactorialRecursive {

	public static int factorial (int n) {
		
		if (n ==0) {
			return 1;
		} else {
			return (n * factorial(n-1));
		}
			}
	
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please input the factorial number");
	int number = input.nextInt();
	
	int fact = factorial(number);
	System.out.println("Factorial of " + number + " is: " + fact);
	
	}

}
