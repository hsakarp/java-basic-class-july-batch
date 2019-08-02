package java_july;

import java.util.Scanner;
public class CountryArea {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("What's the area of the destination country in km^2 ?");
		int area = input.nextInt();
		double areaInMiles = area * 0.3861;
		System.out.println("The area of the destination country in miles is " + areaInMiles);
		
		input.close();
		
	}

}
