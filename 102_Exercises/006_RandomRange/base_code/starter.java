/*
 *	Author: Jonah Choe
 *  Date: 9/16/24
 *	Collaborator(s): Jayden Lee, Caleb Nam
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to create a range for your random number: ");
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number bigger than the first one: ");
		int b = sc.nextInt();
		System.out.println("Your range is "+a+" to "+b);
		System.out.println("Here is 5 random numbers in your range: ");
		int c = (int)((a)+(Math.random()*(b-a)));
		int d = (int)((a)+(Math.random()*(b-a)));
		int e = (int)((a)+(Math.random()*(b-a)));
		int f = (int)((a)+(Math.random()*(b-a)));
		int g = (int)((a)+(Math.random()*(b-a)));
		System.out.println(c + ", " + d + ", " + e + ", "+ f + ", "+ g);
				
	}
}
