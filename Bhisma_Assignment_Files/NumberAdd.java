package java_july;

import java.util.Scanner;

public class NumberAdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input the value");
		int j = input.nextInt();
		int sum = 0;
		int count = 1;
		
		while (count <= j) {
			sum = sum+count;
			count++;
		}
		System.out.println("The sum from 1 to "+ j +" is " + sum);

	}


	}


