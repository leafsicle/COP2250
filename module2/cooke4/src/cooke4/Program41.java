//matt cooke
//2073995
package cooke4;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		// Write a program that prompts for a character that could be the first
		// character in a legal Java variable name.
		// See page 40 to review legal identifiers. Your program should test the input
		// and identify it as valid or invalid.
		// tests to see if charAt(0): is a letter, _ or $

		// prompt the user
		System.out.println("please enter in a valid first character an identifier");

		// instantiate the scanner class
		Scanner input = new Scanner(System.in);

		// get the next input
		String text = input.next();
		input.close();
		// take only the first character
		char userInput = text.charAt(0);

		// cast it to an int to make my life easier
		// int decimalValue = (int)userInput;

		if ((userInput >= 'A' && userInput <= 'Z') || (userInput >= 'a' && userInput <= 'z') || (userInput == 95)
				|| userInput == 36) {
			System.out.println(userInput + " is a valid input");
		} else {
			System.out.println("That is not a valid input");
		}
	}

}
