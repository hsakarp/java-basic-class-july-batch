package java_july;
import java.util.Scanner; 
public class Greetings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("May I have your name please? ");
		String name = input.nextLine();
		System.out.println("Good Afternoon! " + name);
		System.out.print("Where would you like to go " + name +"?");
		String place = input.nextLine();
		System.out.println(place + " is a very beautiful destination. You will have a great experience in " + place + ".");
		input.close();
	
	input.close();
	}
 
}

