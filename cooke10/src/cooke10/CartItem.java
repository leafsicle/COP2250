package cooke10;

class CartItem {
	//defines these private data members:
	//String item, double price, int quantity
	private	String item;
	private double price;
	private int qty;
	
	//defines a constructor that sets all data members when a CartItem is instantiated.
	public CartItem(String item, double price, int qty) {
		this.item=item;
		this.price=price;
		this.qty=qty;
	}
	//defines setters for all data members.
	public void setItem(String itemName) {
		this.item=itemName;
	}
	public void setItemPrice(double itemPrice) {
		this.price=itemPrice;
	}
	public void setQty(int itemQty) {
		this.qty=itemQty;
	}
	//defines a subtotal method that returns the item price * quantity.
	public void getSubTotal() {
		System.out.printf("$%4.2f",(price*qty));
	}
	//defines a toString method that summarizes the data for an item.
	public String toString() {
		return "Cart Item" + item + ", price= " + (qty*price) + ", quantity: " + qty;
	}
}
