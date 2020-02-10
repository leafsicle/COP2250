//Matthew Cooke
//2073995
package cooke5;

public class Program51 {

	public static void main(String[] args) {
		int number = 200;
		int multiples = 0;
		int total = 0;
		// use the multiples variable as our sentinel value
		while (multiples < 16) {
			// negate everything that isn't ^ by %13 && %17
			if (number % 13 == 0 ^ number % 17 == 0) {
				// check the multiples counter
				if (multiples % 4 != 0) {
					// print formatted lines
					System.out.printf("%9d", number);
				} else {
					// start a new line then print
					System.out.printf("\n%9d", number);
				}
				// sum the number and total
				total += number;
				// add to the multiples counter
				multiples++;
			}
			// increment number
			number++;

			// print the total
		}
		System.out.println("\nThe total is " + total);
	}

}
