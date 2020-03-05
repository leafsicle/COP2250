package cooke9;

public class Gift {

	// instance variables
	private String recipient;
	private String description;
	private double price;
	private int qty;

	// static variable
	public static int recipients = 0;

	// create a new Gift object
	public Gift(String recipient, String description, double price, int qty) {
		this.recipient = recipient;
		this.description = description;
		this.price = price;
		this.qty = qty;
		recipients++;
	}

	// get for recipient
	public String getRecipient() {
		return recipient;
	}

	// set for recipient
	public void setRecipient(String newRecipient) {
		this.recipient = newRecipient;
	}

	// get for description
	public String getDescription() {
		return description;
	}

	// set for description
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	// get for description
	public double getPrice() {
		return price;
	}

	// set for description
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}

	// get for qty
	public int getQty() {
		return qty;
	}

	// set for price
	public void setQty(int newQty) {
		this.qty = newQty;
	}
	
	//method to print the total cost of this item
	public void giftsVal() {
		System.out.printf("Spent on %s $%4.2f\n",recipient,(price*qty));
	}
	
	//toString Method
	public String toString() {
	return recipient + ", gift " + description + ", $"
			+ price + ", quantity: " + qty;
	}
	
	

}
 