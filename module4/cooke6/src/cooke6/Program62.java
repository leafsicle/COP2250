package cooke6;

import java.util.Scanner;

public class Program62 {

	public static void main(String[] args) {
		//prompt the user to enter the dimensions of a rectangle as doubles
		System.out.println("Please enter in the dimensions of a rectangle. \n What is the width?");
		//start a new scanner
		Scanner input = new Scanner(System.in);
		//new variable for input 1
		double width = input.nextDouble();
		//prompt the user
		System.out.println("What is the length of the rectangle?");
		//store the length
		double length = input.nextDouble();
		//close the scanner
		input.close();
		//call for the area
		calcArea(width, length);
		//store the returned double as the value
		double perimeter = calcPerimeter(width, length);
		//print out the perimeter
		System.out.printf("\nPerimeter: %4.4f",perimeter);
		input.close();
	}
	public static void calcArea (double width, double length) {
		//calc and print the area. 4decimals
		double area = (width*length);
		System.out.printf("Area: %4.4f",area);
	}
	
	public static double calcPerimeter (double width, double length) {
		//calc and RETURN the perimeter 4 decimals
		return(2*(width+length));
	}
}
