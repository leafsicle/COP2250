package cooke5;

import java.util.Scanner;

public class Program52 {

	public static void main(String[] args) {
		//Write a program that prompts the user for a binary number (8 bits or less) as a String and converts it to base-10 decimal. 
		//Assume the user complies and does enter a valid binary number and proceed by using a for loop to perform the conversion.
		//prompt the user
		System.out.println("Give me a binary number that is less than 8 bits");
		//start the scanner
		Scanner input = new Scanner(System.in);
		//get the input from the user
		String userInput = input.next();
		//close the scanner
		input.close();
		//start a total
		int total =0;
		//loop it out
		for(int i=0; i<8;i++) {
			//need a counter-balance for the string order
			int decrement =7;
			char c = userInput.charAt(decrement-i);
			int temp = Character.getNumericValue(c);
			if(temp==1) {
				 total+=(temp*Math.pow(2,i));
			}
		}
		System.out.println(total);
	}

}
