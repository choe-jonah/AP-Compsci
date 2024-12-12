/*
 *	Author: Jonah Choe
 *  Date:10/13/24
*/

import java.util.Scanner;

class starter {
	public static boolean checkPrime(int a){
		int num1= a-1;
		while(num1>1)
		{
			if((a%num1)==0)
		{
		return false;
		}
		num1--;
		}
		return true;
	}
	public static void printPrimes(int b){
		int num1 = 2;
		while(b>num1){
			if(checkPrime(num1))
			{
				System.out.println(num1);
			}
			num1++;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number and we'll print out every prime number until that number: ");
		int primeNumber = sc.nextInt();
		printPrimes(primeNumber);
	}
}
