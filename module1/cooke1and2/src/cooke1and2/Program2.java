// Matt Cooke
// 2073995
package cooke1and2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// prompt the user for the unit price
		System.out.println("Please enter the unit price for an item ");
		// store the double as unitPrice
		double unitPrice = input.nextDouble();
		// prompt the user for the quantity
		System.out.println("Please enter the number of items you want to purchase ");
		// store the qty as an int
		int qty = input.nextInt();
		// close the scanner instance
		input.close();
		// perform the subtotal math
		double subTotal = qty * unitPrice;
		// print the subtotal to the user
		System.out.println("Your subtotal is $" + subTotal);
	}
}