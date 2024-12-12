/*
 *	Author: Jonah Choe
 *  Date: 9/22/2024
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what day it is (0-6): ");
		int a = sc.nextInt();
		if((a == 1)||(a == 2)||(a == 3)||(a == 4)||(a == 5)){
			System.out.println("It is a weekday its 7 am");
		}
		if((a == 0)||(a == 6)){
			System.out.println("It is the weekend. its 10pm.");
		}
		else{
			System.out.println("Wrong input");
		}
	}
}
