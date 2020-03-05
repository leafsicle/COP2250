package cooke10;

import java.util.ArrayList;

public class Cart {
	//a private ArrayList of CartItem objects .
	private ArrayList<CartItem> cart;
	//a public static double to hold the total for the cart, initial value zero.
	public static double cartTotal=0;
	
	//defines a constructor that instantiates the ArrayList of cart items.
	public Cart() {
		this.cart = new ArrayList<CartItem>();	}
		
	//codes the method with the signature below to add a cart item and update the total:
	public void add(String item, double price, int quantity) {
		CartItem cartItem = new CartItem(item, price, quantity);
		//add the cartItem to the cart ArrayList
		cart.add(cartItem);
		//add the total to the cart
		cartTotal+=(price*quantity);
	}
	
	//codes a showCart method to print and number the arraylist cart items. This method also prints the cart total.
	public void showCart() {
		for (int i = 0; i < cart.size(); i++) {
			System.out.print(i+1+" ");
			cart.get(i).toString();
		}
		System.out.printf("\nCart total $%4.2f",cartTotal);
	}
	//codes the following method to remove an item based on its number in the cart.
	public void removeItem(int number) {
		cart.remove(number-1);
	}
	
	
}
