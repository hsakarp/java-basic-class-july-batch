package java_july;

import java.util.Scanner;
public class myFactorial {

public static void main(String[] args) {
	int number;
    System.out.println("Enter the factorial number: ");
    Scanner scanner = new Scanner(System.in);
    number = scanner.nextInt();
    scanner.close();
    
    int a = 1;
    long fact = 1;
    while(a<=number)
    {
        fact = fact * a;
        a++;
    }
    System.out.println("Factorial of "+number+" is: "+fact);
    
	
}
}
