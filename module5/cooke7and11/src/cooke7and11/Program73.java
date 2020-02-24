//Matthew Cooke
//2073995
package cooke7and11;

import java.util.ArrayList;

public class Program73 {

	public static void main(String[] args) {

		//new array with 14 temps
		int[] temps = new int[14];
		//iterate over it and fill it with new random temps
		for (int i = 0; i < temps.length; i++) {
			//take difference and add 1 to difference then add the min value
			temps[i] = (int) (Math.random() * (41)+10);
		}
		//create a variable to hold the returned arraylist from the method
		ArrayList<Integer> coldTemps = displayArray(temps);
		//create a variable that is the size of the arraylist
		int count = coldTemps.size();
		//tell the user something useful
		System.out.println("\nThere were "+ count+ " below freezing");
		//iterate over the arraylist and print them
		for (Integer temp : coldTemps) {
			System.out.print(temp + " ");
		}
	}
	
	public static ArrayList<Integer> displayArray(int[] temperatures) {
		//new array list for any freezing temps
		ArrayList<Integer> freezing = new ArrayList<>();
		System.out.println("Temperatures in the last two weeks ");
		for (int i = 0; i < temperatures.length; i++) {
			//print out the last two weeks worth of temps
			System.out.print(temperatures[i] + " ");
			//if they are below freezing add them tothe list
			if(temperatures[i]<32) {
				freezing.add(temperatures[i]);
			}
		}
		//return them to the main method
		return freezing;
	}

}
