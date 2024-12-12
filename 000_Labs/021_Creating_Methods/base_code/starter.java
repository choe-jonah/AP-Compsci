/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void sentenceName(String a,String b){
		Scanner sc = new Scanner(System.in);
		String x = a;
		String y = b;
		String sum = x+ " "+y;
		System.out.println(x);
		System.out.println(sum);
		return;
		
	}
	
	public static void main(String args[]) {
		System.out.println("Enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		String firstSentence = sc.nextLine();
		System.out.println("Enter another sentence: ");
		String secondSentence = sc.nextLine();
		System.out.println("This is your sentences combined: ");
		sentenceName(firstSentence, secondSentence);



		
	}
}
