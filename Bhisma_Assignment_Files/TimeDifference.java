package java_july;

import java.util.Scanner;
public class TimeDifference {
public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	System.out.println("Please enter the time difference between your home and destination in hours? ");
	int hours = input.nextInt ();
	
	int wrapAround = hours % 24;
	int midnightWrap = Math.abs(wrapAround);
	int noon = Math.abs(wrapAround + 12);
		System.out.println("The time in your destination when it's noon at home in a 24 hour format  will be " + noon + ":00" + " and the time in your destination when it's midnight at home will be " + midnightWrap + ":00");
		
	input.close ();
	
}
}
