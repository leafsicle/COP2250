//Matthew Cooke
//2073995
package cooke5;

public class Program51 {

	public static void main(String[] args) {

		int LINE_LENGTH = 4;
		int number = 200;
		int multiples = 0;
		int total = 0;
		int printCount = 0;
		//use the multiples variable as our sentinel value
		while(multiples<16) {
			//negate everything that isn't ^ by %13 && %17
			if (number%13==0 ^ number%17==0) {
				// have a line counter before we print them
				if(printCount< LINE_LENGTH) {
					//print formatted lines
					System.out.printf("%9d |",number);	
					//increment the counter for output on lines and the multiples counter 
					printCount++;
					multiples++;
				} else {
					//once we are at a print count of 4 then start a new line and set counter to 0
					System.out.println();
					printCount=0;
				}
				//sum the number and total
				total+=number;
			}
			//increment number
			number++;
		//print the total
		}System.out.println("\nThe total is "+total);
	
	}

}
