//Matthew Cooke
//2073995
package cooke7and11;

public class Program72 {

	public static void main(String[] args) {
		//give the error for incorrect number of arguments
		if (args.length !=3) {
			System.out.println("Usage: This Java program requires 3 intger arguments to run as 'int int int' for len, width, and height respectively");
			System.exit(1);
		}
		//declare the variables for the volume and surface area
		int volume = 0;
		int surfaceArea = 0;
		//set each argument to a corresponding parameter for a dimension of a rectangular prism length(l), width(w), or height(h)
		int l= Integer.parseInt(args[0]);
		int w= Integer.parseInt(args[1]);
		int h= Integer.parseInt(args[2]);
		//formula for SA
		surfaceArea = (int)2*(w*l+h*l+h*w);
		//formula for volume
		volume = (int)l*w*h;
		
		System.out.println("The surface area is "  + surfaceArea);
		System.out.println("The volume is " + volume);
	}

}
