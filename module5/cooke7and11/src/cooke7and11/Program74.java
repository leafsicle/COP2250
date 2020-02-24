//Matthew Cooke
//2073995
package cooke7and11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program74 {

	public static void main(String[] args) {
		// Use a foreach loop (see page 253) to process the array and display the names
		// on one line separated by spaces.
		// Pass the array to a void method.
		// six string array
		String[] nameArr = new String[6];
		System.out.println("Enter six first names");
		// start the scanner
		Scanner input = new Scanner(System.in);
		// assign the input to a new array
		String userInput = input.nextLine().trim();
		// close the input
		input.close();
		// store the value
		int nameLength = userInput.length();
		// create a counter for new benchmark of iterating through the string before
		// storing them in an array
		int substringStart = 0;
		// manual add for array position
		int counter = 0;
		// iterate over the string
		for (int i = 0; i < nameLength; i++) {
			// create a variable to pass into the array
			String name = null;
			// if the character is a whitespace character start the substring sequence
			if (Character.isWhitespace(userInput.charAt(i))) {
				// a new string called word will be made from a substring from the stringFlag to
				// the current character
				name = userInput.substring(substringStart, i);
				// use array counter
				nameArr[counter] = name;
				// increment the position as the next substring marker
				substringStart = ++i;
				// increment the array counter
				counter++;
			}
			// at the last position we can go from the last substringStart to the end of the
			// string
			if (i == nameLength - 1) {
				// get last word
				name = userInput.substring(substringStart, nameLength);
				// add the last value to the array
				nameArr[counter] = name;
			}
		}
		//foreach over the array
		for (String name : nameArr) {
			// for my use only so I dont have to type in the input
			System.out.print(name + " ");
		}
		System.out.println();
		nameMachine(nameArr);
	}

	public static void nameMachine(String[] nameArr) {
		//sort this the easy way
		Arrays.sort(nameArr);
		System.out.println("Sorted array of names");
		//create an array list of strings
		ArrayList<String> newNameList = new ArrayList<String>();
		//loop over the array passing in the strings to the new array list
		for (String name : nameArr) {
			System.out.print(name+ " ");
			newNameList.add(name);
		}
		//insert my chosen name at the beginning of the arrayList
		newNameList.add(0, "Barack");
		//get the size of the list
		int listSize = newNameList.size();
		//Remove the name at the end of the arraylist.
		newNameList.remove(listSize-1);
		//tell the user what they are looking at
		System.out.println("\nFinal list of names");
		//Use a foreach loop to process the arraylist and display the names on one one line separated by spaces.
		for (String name : newNameList) {
			System.out.print(name+ " ");
		}
	}

}
