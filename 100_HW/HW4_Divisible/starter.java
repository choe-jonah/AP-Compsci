/*
 *	Author: Jonah Choe
 *  Date: 9/29/24
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int a = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int b = sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a + " is divisible by 2");
		}
		else
		{
			System.out.println(a + " is not divisible by 2");
		}
		if(a%3==0)
		{
			System.out.println(a + " is divisible by 3");
		}
		if(a%4==0)
		{
			System.out.println(a + " is divisible by 4");
		}
		if(a%5==0)
		{
			System.out.println(a + " is divisible by 5");
		}
		System.out.println("");
		if(b%2==0)
		{
			System.out.println(b + " is divisible by 2");
		}
		else
		{
			System.out.println(b + " is not divisible by 2");
		}
		if(b%3==0)
		{
			System.out.println(b + " is divisible by 3");
		}
		if(b%4==0)
		{
			System.out.println(b + " is divisible by 4");
		}
		if(b%5==0)
		{
			System.out.println(b + " is divisible by 5");
		}
		
	}
}
