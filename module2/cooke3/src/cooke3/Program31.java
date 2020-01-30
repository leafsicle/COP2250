//Matthew Cooke
//2073995
package cooke3;

import java.util.Scanner;

public class Program31 {

	public static void main(String[] args) {
		//tell the user what the program will do
		System.out.println("This program will calculate your overall grade by entering in 3 test scores."
				+ " Please enter numbers from 0-100 only.");
		//instantiate a scanner class
		Scanner input = new Scanner(System.in);
		
		//get the three test scores
		System.out.println("Score 1:");
		int score1 = input.nextInt();
		
		System.out.println("Score 2:");
		int score2 = input.nextInt();
		
		System.out.println("Score 3:");
		int score3 = input.nextInt();
		
		//close the scanner
		input.close();

		//calculations
		double totalScore = score1+score2+score3;
		// initialize the character for letter grade
		char letterGrade = 0;
		
		double average = (totalScore/3);
		
		// logic to figure out letter grade
		if (average <60){
			letterGrade = 'F';
		} else if (average <70){
			letterGrade = 'D';
		} else if (average <80){
			letterGrade = 'C';
		} else if (average <90){
			letterGrade = 'B';
		} else if (average <100){
			letterGrade = 'A';
		};
				
		System.out.println("Your average for the three tests is: " +average);
		System.out.println("Your overall grade for the three tests is: "+ letterGrade );
				
	}

}
