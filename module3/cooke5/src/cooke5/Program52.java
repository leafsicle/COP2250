package cooke5;

import java.util.Scanner;

public class Program52 {

	public static void main(String[] args) {
		// Write a program that prompts the user for a binary number (8 bits or less) as
		// a String and converts it to base-10 decimal.
		// Assume the user complies and does enter a valid binary number and proceed by
		// using a for loop to perform the conversion.
		// prompt the user
		System.out.println("Give me a binary number that is less than or equal to 8 bits");
		// start the scanner
		Scanner input = new Scanner(System.in);
		// get the input from the user
		String userInput = input.next();
		// close the scanner
		input.close();
		// start a total
		int total = 0;
		// get the length of the input so we don't have to recalculate the length of the
		// input each time
		int length = userInput.length();
		// loop it out
		for (int i = 0; i < length; i++) {
			// need a counter-balance for the string order
			char c = userInput.charAt(i);
			int temp = Character.getNumericValue(c);
			if (temp == 1) {
				total += (temp * Math.pow(2, length-i-1));
			}
		}
		System.out.println(total);
	}

}
