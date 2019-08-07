package java_july;
import java.util.Scanner;

public class Factorial_Method {
	public static void main (String args[]) {
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter the factorial number: ");
	       	       
	       int n = input.nextInt();
	       while (n<=0) {
	   		System.out.println("You entered non-positive number, please enter positive integer: ");
	   		n=input.nextInt();
	   	}
      int result = fact(n);
	       System.out.println("The factorial of " + n + " is " + result);
	   }

	   public static int fact(int n) {
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       return result;
	   }
	}
