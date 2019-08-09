package java_july;

import java.util.Scanner;

public class PowerRecursive {

public static int powerResult (int a, int b) {
	if(b == 0 ) {
		return 1;
	} else {
		return (a * powerResult (a, b-1));
	}
}	
	
public static void main(String[] args) {

	Scanner input = new Scanner (System.in);
	System.out.println("Input integer value that is base: ");
	int a = input.nextInt();
	System.out.println("Input integer value that is power ");
	int b = input.nextInt();

	int result = powerResult(a, b);
	
	System.out.print("The power output of " + a + "^" + b + " is " + result);
	
}
}

