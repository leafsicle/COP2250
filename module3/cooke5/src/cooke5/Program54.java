package cooke5;

import java.util.Scanner;

public class Program54 {

	public static void main(String[] args) {
		//inform the user of what the program expects
		System.out.println("You will be prompted to enter a quantity and the unit price.");
		
		//start the scanner
		Scanner input = new Scanner(System.in);
		
		//prompt for unit price followed by the start of a WHILE Loop
		System.out.println("Please enter the unit price of the item that you'd like to purchase or enter \'0\' by itself to exit");
		float unitPrice = input.nextFloat();
		
		//create the quantity variable too to use it as a secondary sentinel value. create total and subtotal too
		float subTotal = 0, total = 0, quantity = 0;
		
		//Now that we have a sentinel value we can start the while loop
		while(unitPrice !=0) {
			System.out.println("Please enter the quantity of the item that you'd like to purchase or enter \'0\' by itself to exit");
			quantity = input.nextFloat();
			//calc the subtotal & total
			subTotal = (quantity * (unitPrice));
			//add the subtotal to the total counter
			total+=subTotal;
			//return the subtotal to the user
			System.out.printf("the subtotal for this item is $%5.2f", subTotal);
			//prompt the user for the next unit price
			System.out.println("\nPlease enter the unit price of the item that you'd like to purchase or enter \'0\' by itself to exit");
			//capture this again for the sentinel
			unitPrice = input.nextFloat();
		}
		//determine which output to show the user whether or not they entered any values
		if(total>0) {
			//return the total
			System.out.printf("the total is $%5.2f",total);
		} else {
			//since they broke the loop immediately then they didnt have anything to add and create pesky errors
			System.out.println("Sorry that you didn't want to run the calculator");
		}
	}

}
