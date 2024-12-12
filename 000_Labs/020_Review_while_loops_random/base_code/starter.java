/*
 *	Author:  Jonah Choe
 *  Date: 10/1/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

	Scanner sc = new Scanner(System.in);
	int a = (int)(Math.random()*1000)+1;
	
	int b = 0;
	while(b != a){
	System.out.println("Guess a number (1-1000): ");
	b = sc.nextInt();
	if(b > a){
		System.out.println("Guess lower");
	}
	else if(b < a){
		System.out.println("Guess higher");
	}
		if(b == a){
			System.out.println("You got it right");
			break;
			}
		}
	}
}
