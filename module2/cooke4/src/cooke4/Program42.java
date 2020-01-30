//matthew Cooke
//2073995
package cooke4;

import java.util.Scanner;

public class Program42 {

	public static void main(String[] args) {

		System.out.println("please enter a date as mm\\dd\\yy and i'll tell you if it's valid");
		Scanner input = new Scanner(System.in);

		String userInput = input.next().trim();
		input.close();
		// check for the slashes
		if (userInput.charAt(2) == '/' && userInput.charAt(5) == '/') {
			char m1 = userInput.charAt(0);
			char m2 = userInput.charAt(1);
			char d1 = userInput.charAt(3);
			char d2 = userInput.charAt(4);
			char y1 = userInput.charAt(6);
			char y2 = userInput.charAt(7);

			System.out.println(Character.isDigit(m2));

			if (Character.isDigit(m1) && Character.isDigit(m2) && Character.isDigit(d1) && Character.isDigit(d2)
					&& Character.isDigit(y1) && Character.isDigit(y2)) {
				int month1Int = Character.getNumericValue(m1);
				int month2Int = Character.getNumericValue(m2);
				int day1Int = Character.getNumericValue(d1);
				int day2Int = Character.getNumericValue(d2);
				int year1Int = Character.getNumericValue(y1);
				int year2Int = Character.getNumericValue(y2);
				int monthVal = month1Int + month2Int;
				int dayVal = day1Int + day2Int;
				int yearVal = year1Int + year2Int;
				if (monthVal * dayVal == yearVal) {
					System.out.println("Congratulations on the magic date!!");
				} else {
					System.out.println("Close but not quite. Your numbers didn't work out correctly");
				}
			} else {
				System.out.println(
						"Your slashes were in the right place but one of the characters wasn't a valid digit. Try again please");
			}
		} else {
			System.out.println("Not a valid input due to your slashes \\");
		}
	}
}
