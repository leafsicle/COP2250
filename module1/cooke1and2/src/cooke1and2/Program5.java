// Matt Cooke
// 2073995
package cooke1and2;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		//Use an augmented assignment operator to decrease the quotient by 2.5 and display the result.
		Scanner input = new Scanner(System.in);
		//prompt the user to enter two numbers
		System.out.println("Please enter two numbers on each subsequent line and press enter after each.");
		
		//store the numbers to variables
		System.out.println("number 1: ");
		float num1 = input.nextFloat();
		System.out.println("number 2: ");
		float num2 = input.nextFloat();
		//perform the math and store it as a variable
		float quotient = num1/num2;
		
		//print out the results for the user
		System.out.println("the quotient of "+ num1 + " and "+num2+" is equal to "+ quotient);
		
		//subtract 2.5 from the quotient of the two numbers
		quotient-=+2.5;
		//print out the new results for the user
		System.out.println("the quotient of "+ num1 + " and "+num2+" minus 2.5 is equal to "+ quotient);
	}
}