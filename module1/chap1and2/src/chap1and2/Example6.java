package chap1and2;

// See Table 2.4 for the augmented assignment operators
// See section 2.14 for the ++ and -- operators
// See Table 2.5 for operation of ++ and -- as prefix or postfix

public class Example6 {

	public static void main(String[] args) {
		
		int num1 = 8, num2 = 2;
		int num3 = ++num1 / ++num2;  // becomes 9 / 3
		System.out.println("num3 is " + num3);
		
		num1 += 5;
		num2 /= 3;
		int num4 = num1-- + --num2;
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);		
		System.out.println("num4 = " + num4);

	}

}
