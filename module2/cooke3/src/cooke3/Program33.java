//Matthew Cooke
//2073995
package cooke3;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		// prompt the user
		System.out.println(
				"Please enter the last name of one of the previous 5 presidents. I'll let you know if you get the name correct");

		// open scanner class
		Scanner input = new Scanner(System.in);

		// get the input
		String userInput = input.next();

		// close the scanner
		input.close();

		// compare that user name in a switch case
		switch (userInput) {
		case "Trump":
			System.out.println("yep! " + userInput + " is one of the last 5 US Presidents");
			break;
		case "Obama":
			System.out.println("yep! " + userInput + " is one of the last 5 US Presidents");
			break;
		case "Bush":
			System.out.println("yep! " + userInput + " is one of the last 5 US Presidents");
			break;
		case "Clinton":
			System.out.println("yep! " + userInput + " is one of the last 5 US Presidents");
			break;
		default:
			System.out.println("Your answer isn't correct. Try using google to look up the answer.");
			break;
		}

	}

}
