// Matt Cooke
// 2073995
package cooke1and2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//prompt the user to enter the length and width separately then store it in a variable
		System.out.println("Please enter in the length of the first side");
		double length = input.nextDouble();
		//prompt the user to get the next dimension to the rectangle and store it too
		System.out.println("Please enter in the length of the second side");
		double width = input.nextDouble();
		input.close();
		//perform the math for the area calculation
		double area = length * width;
		double perimeter = 2*length + 2* width;
		
		System.out.println("The total area for the rectangle is "+ area);
		System.out.println("The perimeter for the rectangle is "+ perimeter);
	}

}
