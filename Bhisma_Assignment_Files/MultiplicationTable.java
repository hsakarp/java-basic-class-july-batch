package java_july;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the number of Multiplication table:  ");
		
		int number = input.nextInt();
		
		for (int i =0; i<10; i++) {
			
			System.out.println(number + "x" + (i+1) + " = " + (number * (i+1)));
		}
		
	}

}
