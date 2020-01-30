// Matthew Cooke
//2073995
package cooke4;

public class Program45 {

	public static void main(String[] args) {
		//set known values
		String item = "VR Headset";
		char dept = 'E';
		double price = 399.99; 
		int qty = 2;
		boolean taxable = true;
		
		//new variables for tax and calculated taxes
		double salesTax = .07;
		double calcTax = salesTax * price*qty;
		//format everything
		System.out.printf("Purchase: %s, quantity %d @ $%3.2f",item, qty, price);
		System.out.printf("\nDept %c, taxable %b",dept, taxable);
		System.out.printf("\nSubtotal: $%2.2f",(price*qty));
		System.out.printf("\n7%% Sales Tax is $%2.2f",calcTax);
		System.out.printf("\nTotal Payable: $%2.2f",(calcTax+price*qty));
	}
}
