/*
 *	Author: Jonah Choe
 *  Date: 9/11/2024
 *	Collaborator(s): Jayden Lee, Caleb Nam
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number: ");
		int number = sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		System.out.println(number);
		System.out.println(number+1);
		System.out.println(number+2);
		System.out.println(number+3);
		System.out.println(number+4);
		System.out.println(number+5);
		int a = number*2;
		int b = number*3;
		int c = number*4;
		int d = number*5;
		System.out.println("Here are the next 5 multiples of "+number+":");
		System.out.println(number+", "+a+", "+b+", "+c+", "+d);
		double e = number/100;
		System.out.println("Here is your number divided by 100:");
		System.out.println(e);
		double f = number/10;
		System.out.println("Here is your number divided by 10:");
		System.out.println(f);
		
		
	}
}
