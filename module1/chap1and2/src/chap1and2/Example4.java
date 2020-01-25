package chap1and2;

import java.util.Scanner; // needed because Scanner not in java.lang

public class Example4 {

	public static void main(String[] args) {
		// similar program but with user input for data
		
		// class Scanner is used for keyboard input. See Section 2.9.2
		// next creates an instance of Scanner and hooks it up to keyboard
		// System.in is Java's name for the keyboard 
		Scanner input = new Scanner(System.in);
		// we create a prompt for the user to see
		System.out.println("Enter the quantity");
		int quantity = input.nextInt();  // assign user input to quantity
		
		// and a prompt for the price
		System.out.println("Enter the price");
		double price = input.nextDouble();  // assign user input to price
		
		double total = quantity * price;  // total is declared and assigned	
		System.out.println("Please pay $" + total);  // NOTE: + sign not comma
		
		input.close();  // delete Scanner instance
	}

}
