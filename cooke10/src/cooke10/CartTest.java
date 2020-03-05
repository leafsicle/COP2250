package cooke10;

import java.util.Scanner;

public class CartTest {

	public static void main(String[] args) {
		// creates a new empty Cart and then adds five or six items to it.
		Cart cartList = new Cart();
		cartList.add("Echo Dot", 29.99, 3);
		cartList.add("Wemo", 39.99, 2);
		cartList.add("Ear Buds", 49.99, 2);
		cartList.add("google Home", 79.99, 1);

		Scanner input = new Scanner(System.in);

		// displays the cart.
		cartList.showCart();

		// runs a loop at least once to ask if an item should be deleted, and if so,
		// prompts for the item number, deletes that item, and redisplays the cart.
		boolean deleteItem = true;
		// use a letter to help users make choice
		String choice = "";
		System.out.println("Do you wish to remove an item before checkout (y/n)");
		choice = input.next().trim().toLowerCase();
		// use a while loop while delete Item is true else break the loop
		//
		if (choice == "n") {
			deleteItem = false;
		} else if (choice == "y") {
			while (deleteItem) {
				System.out.println("Enter item # to delete");
				// get the item number from the user and call it itemNum
				int itemNum = input.nextInt();
				// call removeItem and pass in itemNum which should subtract 1 for the indexing
				cartList.removeItem(itemNum);
				// show the user the cart again
				cartList.showCart();
				// prompt them to see if there is anything else that they should remove
				System.out.println("Do you wish to remove an item before checkout (y/n)");
				choice = input.next().trim().toLowerCase();
				if (choice == "n") {
					deleteItem = false;
				}
			}
		}
		input.close();
	}
}
