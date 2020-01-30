//Matthew Cooke
//2073995

package cooke3;

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		//prompt the user 
		System.out.println("Please enter an EVEN mulitple of the number 19 between 300 and 400. "
				+ "If you get it wrong I will tell you if you and the same if you get it correct");
		
		//instantiate the scanner class
		Scanner input = new Scanner(System.in);
		//get the input from the user
		int guess = input.nextInt();
		//close the scanner
		input.close();
		
		//begin the compound bool
		//check for even first
		if(guess%2==0 && guess>=300 && guess<=400 && guess%19==0) {
			int otherFactor = guess/19;
			//innermoset if should be correct answer
			System.out.println("Excellent Job! either you guessed well or cheated but I don't care either way");
			System.out.println("the other factor is "+ otherFactor);
		} else {
			//odd number input else statement
			System.out.println("Your number does not meet the requirements. Sorry");
		}
		
	}

}
