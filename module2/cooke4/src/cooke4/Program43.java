//Matthew Cooke
//2073995
package cooke4;

import java.util.Scanner;

public class Program43 {

	public static void main(String[] args) {
		/*
		 * Write a program that prompts the user to enter a full name (first middle
		 * last). Then print: the three initials of the name the length of the full
		 * name, not counting spaces the name in alphabetical format
		 */

		System.out.println("Please enter 3 names with a space in between each of them");
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine().trim();
		input.close();

		System.out.print(userInput.charAt(0));
		for (int i = 0; i < userInput.length(); i++) {
			if (Character.isWhitespace(userInput.charAt(i))) {
				System.out.print(userInput.charAt(++i));
			}
		}
		System.out.println();
		System.out.println("Ignoring spaces, name size is " + (userInput.length() - 2));

		String first = userInput.substring(0, userInput.indexOf(' '));
		String middle = userInput.substring((userInput.indexOf(' ') + 1), userInput.lastIndexOf(' '));
		String last = userInput.substring((userInput.lastIndexOf(' ') + 1), (userInput.length()));

		int char1 = first.charAt(0);
		int char2 = middle.charAt(0);
		int char3 = last.charAt(0);

		// 123
		if (char1 < char2 && char2 < char3) {
			System.out.println(first + " " + middle + " " + last);
			// 132
		} else if (char1 < char3 && char3 < char2) {
			System.out.println(first + " " + last + " " + middle);
			// 213
		} else if (char2 < char1 && char1 < char3) {
			System.out.println(middle + " " + first + " " + last);
			// 231
		} else if (char2 < char3 && char3 < char1) {
			System.out.println(middle + " " + last + " " + first);
			// 312
		} else if (char3 < char1 && char1 < char2) {
			System.out.println(last + " " + first + " " + middle);
			// 321
		} else if (char3 < char2 && char2 < char1) {
			System.out.println(last + " " + middle + " " + first);
		}
	}
}
