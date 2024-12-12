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
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("Enter third number: ");
		int c = sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.print(a);
				System.out.println(" is your biggest number");
			}
			
		}
		if(b>a){
			if(b>c){
				System.out.print(b);
				System.out.println(" is your biggest number");
			}
		}
		if(c>a){
			if(c>b){
				System.out.print(c);
				System.out.println(" is your biggest number");
			}
		}
		
	}
}
