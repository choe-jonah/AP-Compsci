/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (a) :");
		int a = sc.nextInt();
		System.out.println("Enter another number (b) :");
		int b = sc.nextInt();
		boolean c;
		c = (a<b);
		if(c)
		{
			System.out.println("wow, a<b");
		}
		boolean d;
		d = (a>b);
		if(d)
		{
			System.out.println("awesome a>b");
		}
		boolean e;
		e = (a==b);
		if(e)
		{
			System.out.println("cool a=b");
		}
		
	}
}
