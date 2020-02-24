package cooke6;

public class Program61 {

	public static void main(String[] args) {
		//assign two variables
		int num1 = 3, num2 = 5;
		//print out the returned value in a print statement because we're lazy
		System.out.println(positiveDifference(num1,num2));
	}
	
	//new public method
	public static int positiveDifference(int x, int y) {
		//see which is larger and then subtract the smaller from the larger and return the int
		if(x>y) {
			return x-y;
		} else {
			return y-x;
		}
	}
}
