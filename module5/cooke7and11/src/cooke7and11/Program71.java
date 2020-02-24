//Matthew Cooke
//2073995
package cooke7and11;

public class Program71 {

	public static void main(String[] args) {
		// create an array of integers that is 24 elements large
		int[] randomNums = new int[24];
		// iterate over the array
		for (int i = 0; i < randomNums.length; i++) {
			// multiply the random number by the difference in the range and add the minimum
			// value +1 to it for inclusive
			randomNums[i] = (int) (Math.random() * (21) + 40);
		}
		// call the display method and save the returned value as a double for the
		// average
		double average = displayArray(randomNums);
		// tell the user what the average is
		System.out.printf("The average of the above numbers is %5.1f", average);
	}

	public static double displayArray(int[] random) {
		// create a variable for the total
		double total = 0;
		// iterate over the loop
		for (int i = 0; i < random.length; i++) {
			// every 6th value create a new line
			if ((i + 1) % 6 == 0) {
				System.out.println(random[i] + " ");
			} else {
				System.out.print(random[i] + " ");
			}
			// add the number to the total
			total += random[i];
		}
		//return the average as the total over the length of the array
		return (total / random.length);
	}

}
