//Matthew Cooke
//2073995
package cooke3;

import java.util.Scanner;

public class Program44 {

	public static void main(String[] args) {
		//prompt the user
		System.out.println("Please enter the last name of one of the previous 5 presidents. I'll let you know if you get the name correct");
		
		//open scanner class
		Scanner input = new Scanner(System.in);
		
		//get the input
		String userInput = input.next();
		
		//close the scanner
		input.close();
		
		//compare that user name in a multiway-if regardless of case and print out the president number too
		if ("Trump".equalsIgnoreCase(userInput)) {
			System.out.println("yep! Trump is president number 45");
		} else if ("Obama".equalsIgnoreCase(userInput)) {
		  System.out.println("yep! Obama was president number 44"); 
		} else if("Bush".equalsIgnoreCase(userInput)) {
		  System.out.println("yep! Bush was president number 43 OR 41 technically"); 
		} else if("Clinton".equalsIgnoreCase(userInput)) {
		  System.out.println("yep! Clinton is president number 42"); 
		} else {
		  System.out.println("You didn't list any of the last 5 presidents. Try using google to look up the answer.");
		}
	}
}

