package java_july;

import java.util.Scanner;

public class TravelTime {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How many days are you going to spend in a destination place?");
		int days = input.nextInt();
		
		System.out.println("What is your total budget for the trip in USD?");
		double budget = input.nextDouble();
		
		System.out.print("What is the currency symbol of your destination country?");
		String symbol = input.next();
		
		System.out.print("What is the conversion rate of 1 USD to the destination country?");
		double rate = input.nextDouble();
		
		System.out.println();
		
		int totalHours = days * 24;
		int totalMinutes = totalHours * 60;
		int totalSeconds = totalMinutes * 60;
		
		double dailyBudget = budget / days;
		double dailyBudgetRound = Math.round(dailyBudget*100)/100.00;
		double localBudget = budget * rate;
		double dailyLocalBudget = localBudget / days;
		double localBudgetRound = Math.round(localBudget*100);
		
		System.out.println("You will be travelling for: "  + days + " days"  + " which equals to " + totalHours + " hours" + " or " + totalMinutes + " minutes" + " or " + totalSeconds + " seconds.");
		System.out.println("Your total budget for whole trip in USD is: " + budget + " and you can spend " + dailyBudgetRound + " per day.");
		System.out.println("Your total budget for whole trip in " + symbol +" is: " + localBudget + " and you can spend " + localBudgetRound + " per day.");
		
		input.close();
		
	}

}
