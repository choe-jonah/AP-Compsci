/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		int b;
		b = (int)(Math.random()*1000);
		if(a==b){
			System.out.println("Correct!");
		}
		else{
			System.out.print("Wrong.");
			System.out.print(" The answer was ");
			System.out.print(b);
			
		}
		
	}
}
