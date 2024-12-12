/*
 *	Author:  Jonah Choe
 *  Date: 10/23/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		BaseClass char1 = new BaseClass("noRole");
		char1.myToString();
		
		System.out.println("What class would you like to be?");
		String role  = sc.nextLine();
		BaseClass char2 = new BaseClass(role);
		if(char2.setAll(role,10,10,10,10,10)){
			char2.myToString();
		}
		else{
			System.out.println("Make sure all the numbers are greater than 0");
		}


		
	}
}
