package chap1and2;

public class Example3 {

	public static void main(String[] args) {
		// IMPORTANT: see section 2.4 for Java's rules for identifiers
		
		// see Table 2.1 for Java's numeric data types
		// unlike Python, in Java data types must be declared
		// int is default integer type, double is default for decimals
		
		int quantity;  // declares an int  
		quantity = 4;  // now value is assigned
		// you can also declare and assigned in one statement
		double price = 2.49;  // declares and assigns a double
		
		double total = quantity * price;  // total is declared and assigned
		
		System.out.println("Please pay $" + total);  // NOTE: + sign not comma
	}
}
