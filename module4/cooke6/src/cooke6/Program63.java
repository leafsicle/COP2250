package cooke6;

import java.util.Scanner;

public class Program63 {

	public static void main(String[] args) {
		// create the variables for use in the main
		int itemCount = 0;
		int qty = 0;
		double unitPrice = 0;
		double total = 0;
		Boolean taxable = false;

		// prompt the user for the integer value of how many items they will be
		// purchasing
		System.out.println("How many items do you wish to purchase today?");
		// start the scanner
		Scanner input = new Scanner(System.in);
		// assign them to the itemCount
		itemCount = input.nextInt();
		// loop through
		for (int i = 0; i < itemCount; i++) {
			int counter = i+1;
			System.out.println("Enter price for item " + counter);
			unitPrice = input.nextDouble();
			System.out.println("Enter the quantity of this item");
			qty = input.nextInt();
			System.out.println("Is the item taxable? (true/false");
			taxable = input.nextBoolean();
			total += item(unitPrice,qty,taxable);
		}
		System.out.printf("Please pay $%,.2f%n",total);
		input.close();
	}

	public static double item(double unitPrice, int qty, Boolean taxable) {
		final double SALES_TAX = .07;
		double subTotal = 0, itemTotal = 0, tax = 0;

		if(taxable) {
			tax=(unitPrice * qty)*SALES_TAX;
			subTotal=qty*unitPrice;
			itemTotal = tax+subTotal;
		}else {
			subTotal=qty*unitPrice;
			itemTotal = tax+subTotal;
		}		
		System.out.printf("Subtotal $%,.2f%n", subTotal);
		System.out.printf("Tax $%,.2f%n", tax);
		System.out.printf("Total $%,.2f%n", itemTotal);
		subTotal = 0;
		tax=0;
		// print all three of these calculations in currency format.
		// return the total.
		return itemTotal;
	}

}
