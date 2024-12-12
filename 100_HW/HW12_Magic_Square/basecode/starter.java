import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// CVMath.specialSquare(5);
		Scanner sc = new Scanner(System.in);
		CVMath a = new CVMath();
		System.out.println("Input a number of how many perfect squares you want: ");
		int x = sc.nextInt();
		System.out.println("----------------------------------------------------------");
		a.specialSquare(x);
		
		
		//System.out.println(CVMath.findMid(2.3.1));
	}
}
