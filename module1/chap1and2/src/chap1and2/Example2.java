package chap1and2;
// this program has errors

public class Example2 {

	public static void main(String[] args) {
		// see Section 1.10 Programming Errors
		
		// next line needs to end with ; Fix it now.
		//System.out.println("Java rocks!")
		
		// syntax error on next line. There is no printn. Fix it now.
		//System.out.printn("I like Java");
		
		// runtime error on next line (division by zero). Fix it now.
		System.out.println(12 / (3 * 2 - 6));
		
		// integer division. Not an error, but a "gotcha"		
		System.out.println(9 / 5);  // output is 1, not 1.8
		// change to (9.0 / 5) or (9 / 5.0) for true division 
	}

}
