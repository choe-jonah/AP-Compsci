/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name: ");
	String b = sc.nextLine();
	System.out.println("Enter how many times you want it printed: ");
	int c = sc.nextInt();
	int start = 0;
	while(start < c){
		System.out.println(b);
		start = start +1;
		if(start>= c){
			break;
		}
	}
	

		
	}
}
