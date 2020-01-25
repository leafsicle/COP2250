package myjava1;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		//create new instance of a scanner class
		Scanner input = new Scanner(System.in);
		
		//prompt user for price
		System.out.println("Enter a price(double)");
		
		//assign price as variable to store input
		double price = input.nextDouble();
		
		//prompt user for number of items
		System.out.println("Please enter a quantity(int)");
		
		//get the quantity and store it as an int 
		int qty = input.nextInt();
		
		//close the input instance to prevent a memory leak
		input.close();
		
		///math harder!
		double subTotal = qty*price;
		//show the user what happened and tell them what the total is
		System.out.println("Your total is $" + subTotal);
	}

}
