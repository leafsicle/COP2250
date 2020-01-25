// Matt Cooke
// 2073995
package cooke1and2;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		//prompt the user to enter  temperature in fahrenheit to convert to celsius
		System.out.println("Please enter a temperature in fahrenheit to convert to celsius");
		//create an instance of the scanner class
		Scanner input = new Scanner(System.in);
		//store the next double as the variable tempInF
		double tempInFahrenheit = input.nextDouble();
		//close the input 
		input.close();
		//perform the conversion and store it in a variable
		double outputCelsius = (tempInFahrenheit-32)*(5.0/9);
		//print out the information to the user
		System.out.println("Converting "+ tempInFahrenheit + "F to celsius is "+ outputCelsius +"C");
	}
}
