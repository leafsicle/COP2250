//Matthew Cooke
//2073995
package cooke4;

public class Program44 {

	public static void main(String[] args) {
		//trying to find length of side b , <B and <A
		//express known variables
		int a= 16;
		int c =34;
		//show math
		double b = Math.sqrt((c*c)-(a*a));
		//print and format side b
		System.out.printf("Side b equals %2.3f\n",b);
		
		int C = 90;
		//SohCahToa
		//use arc angles now that we have known side lengths
		double A = Math.toDegrees(Math.acos(b/c)); //cos A == adj/hypot
		double B = Math.toDegrees(Math.asin(b/c)); //sin B == opp/hypot
		System.out.printf("Angle A equals %2.3f degrees \n",A);
		System.out.printf("Angle B equals %2.3f degrees",B);

	}

}
