/*
 *	Author:  Jonah Choe
 *  Date: 10/10/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int pow(int a, int b){
		int powValue = 1;
		while(b != 0){
			powValue = powValue*a;
			b--;
		}
		return powValue;
	}
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Give an exponent");
		int yValue = sc.nextInt();
		System.out.println("Give an base");
		int xValue = sc.nextInt();
		int result = pow(xValue, yValue);
		System.out.println(xValue + " to the power of "+yValue+" is "+result);



		
	}
}
