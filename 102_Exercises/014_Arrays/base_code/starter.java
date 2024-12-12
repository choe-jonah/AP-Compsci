/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		int i = 0;
		int ii = 3;
		while(i<1000){
			arr[i] = ii;
			System.out.print(arr[i]+", ");
			ii = ii+3;
			i++;
		}
		for(int i = 0; i < arr.length; i++){
			arr[i] = (i+1)*3;
			System.out.print(c);
		}
		 System.out.println("--------------------------------------");
		 int i2 = 0;
		 int ii2 = 1000;
		 int [] arr2 = new int [1000];
		 while(i2<1000){
		 	arr2[i2] = ii2;
		 	System.out.print(arr2[i2]+", ");
		 	ii2 = ii2-1;
		 	i2++;
		 }
		 
	}
}
