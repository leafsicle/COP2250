//matthew cooke
//2073995
package cooke10;

import java.util.Arrays;
import java.util.Scanner;

public class Program10_2 {

	public static void main(String[] args) {
		// ask the user what to type
		System.out.println("Enter the Hexadecimal");
		// start the input
		Scanner input = new Scanner(System.in);
		// create a new stringbuilder instance
		StringBuilder sb = new StringBuilder();
		// set the new
		String str = input.nextLine();
		// assign the hexadecimal # to the string builder object
		sb.append(str);
		// append a space
		sb.append(" ");
		// append a number in binary to its String data member.
		String binaryStr = Integer.toString(10111);
		sb.append(binaryStr);
		// append a space
		sb.append(" ");
		// append a base 10 number
		String base10Str = Integer.toString(76);
		sb.append(base10Str);
		// print the StringBuilder object's String data member.
		System.out.println("Here is your StringBuilder object:" + sb);
		// create a String from the StringBuilder.
		String fullString = sb.toString();
		// create an array of Strings from this String.
		String[] newStrArr = fullString.split(" ");
		// get the first string
		String element0 = newStrArr[0];
		String element1 = newStrArr[1];
		String element2 = newStrArr[2];
		// parse the first element of this array to a base-10 number and display it.
		int firstBase10 = Integer.parseInt(element0, 16);
		System.out.printf("%s hex = %d in base-10", element0, firstBase10);
		// parse the second element in the array to a base-10 number and display it.
		int secondBase10 = Integer.parseInt(element1, 2);
		System.out.printf("\n%s Binary = %d in base-10", element1, secondBase10);
		// display the third element of the array as a hexadecimal number.
		String onlyBase16 = Integer.toHexString(Integer.parseInt(element2));
		System.out.printf("\n%s base-10 = %s in hex", element2, onlyBase16);

	}
}
