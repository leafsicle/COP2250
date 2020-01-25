package chap1and2;

// doing the math

public class Example5 {

	public static void main(String[] args) {
		// See  Table 2.3 for the math operators
		
		int num1 = 12, num2 = 5;
		// % operator produces the remainder
		System.out.println(50 % 16);  // output is 2
		
		// next line outputs 2. This is integer division
		System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
		
		// see section 2.15 to learn about type conversion
		// next line illustrates casting int to double. Output is 2.4
		System.out.println(num1 + " / " + num2 + " = " + (double) num1 / num2);	
		
		double dub1 = 3.5;
		int num3 = (int)dub1; // casts double to int, with loss of precision
		System.out.println(num3);  // output is 3

		int num4 = 130;  // but max positive is 127 
		byte b = (byte)num4;
		System.out.println("Byte value is " + b); // output is -126!
		
		System.out.println((2 * (3 + 4 * 3)) / (3 + 6 / 2));  // output is 5
		// simplifies to 30 / 6
		
		// the pow method of the Math class for exponents
		System.out.println(num2 + " cubed is " + Math.pow(num2, 3));
		
	}
}
