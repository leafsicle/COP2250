package cooke5;

public class Program53 {

	public static void main(String[] args) {
		//Write a Java program that generates a table of square roots and cube roots for numbers from 5 to 100 in steps of 5. 
		//See Sample output. The table should show columns 10 characters wide with headings and decimals as shown.
		//System.out.printf("\nSubtotal: $%2.2f",(price*qty));

		System.out.printf("%10s%10s%10s","Number","Sq. Root","Cu.Root\n");
		System.out.printf("%10s%10s%10s","------","------","------\n");
		for(int i=5;i<101;i+=5) {
			double square = Math.sqrt(i);
			double cube = Math.cbrt(i);
			System.out.printf("%10.1f%10.3f%10.3f\n",(double)i, square,cube);
		}
	}

}
