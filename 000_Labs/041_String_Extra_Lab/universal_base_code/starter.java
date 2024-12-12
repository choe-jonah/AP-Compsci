/*
 *	Author:  Jonah Choe
 *  Date: 12/6/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String x = sc.nextLine();
		String result = "";
		while(true){
			if(x.indexOf(" ") == -1){
				result = x + " " + result;
				break;
			}
		int space = x.indexOf(" ");
		String word = x.substring(0,space);
		result = word + " " + result;
		x = x.substring(space+1);
		}
		System.out.println(result);
	}
}
