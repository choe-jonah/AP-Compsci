/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a word");
		String word = sc.nextLine();
		int joe = 1;
		for(int i = 0; i < word.length(); i++){
			System.out.println(word.substring(i, joe));
			joe++;	
		}

		
	}
}
