package cooke6;

import java.util.Scanner;

public class Program64 {

	public static void main(String[] args) {
		// Now for a creative program. Write an original class with at least two methods that demonstrate method overloading.
		//Full points will not be awarded for examples cloned from the textbook or other sources. 
		//Execute all of the overloaded methods in the main method. 
		//In comments clearly show that you understand overloading and how your methods illustrate overloading.
		int choice =0;
		
		String name="";
		//ask the user to pick an option to get one of two sets of questions that contain different types assigned to the responses
		System.out.println("Please choose path 1 or 2 and I'll return information back to you based on your choice");
		Scanner input = new Scanner(System.in);
		//store the user's choice in the variable
		choice = input.nextInt();
		//choice 1 question set
		if(choice==1) {
			System.out.println("True or False: You are human");
			Boolean bit =input.nextBoolean();
			System.out.println("What is your name?");
			name = input.next();
			System.out.println("What is your favorite flavor?");
			String flavor = input.next();
			//this processor method should take a Bool, String, and String
			processor(bit,name,flavor);
			input.close();
		} else {
			System.out.println("What is your name?");
			name = input.next();
			System.out.println("True or False: You are human");
			Boolean bit =input.nextBoolean();
			System.out.println("How old are you?");
			int age = input.nextInt();
			//this processor should take types String, Bool, Int
			processor(name,bit,age);
			input.close();
		}
	}
	//This method takes the questions from question set 1 and echoes them back to the user and tells them that they chose option 1 based on the order of input types
		public static void processor (Boolean bit, String name,String flavor) {
			System.out.println("You chose option 1");
			//the bit field about being human was just for this part
			if(bit) {
				System.out.println("You claim to be a human named "+ name+ " that likes the flavor "+ flavor);
				System.out.println("Next time choose Option 2 for different questions to get different results from the processor");
			}else {
				System.out.println("You claim to be NOT a human named "+ name+ " that likes the flavor "+ flavor);
				System.out.println("Next time choose Option 2 for different questions to get different results from the processor");
			}
		}
		//This method takes the questions from question set 2 and echoes them back to the user and tells them that they chose option 2 based on the order of input types

		public static void processor (String name, Boolean bit, int age) {
			System.out.println("You chose option 2");
			//the bit field about being human was just for this part
			if(bit) {
				System.out.println("Hi, "+name+ "! \n You claimed to be a human. I think I believe you since you're a whopping "+age+" years old.");
				System.out.println("Next time choose Option 1 for different questions to get different results from the processor");
			}else {
				System.out.println("Hi, "+name+ "! \n You claimed to NOT be a human. I think I believe you since you're a whopping "+age+" years old.");
				System.out.println("Next time choose Option 1 for different questions to get different results from the processor");
			}
		}		
		

}
