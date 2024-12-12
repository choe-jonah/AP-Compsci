/*
 *	Author:  Jonah Choe
 *  Date: 10/18/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);
	BaseClass class1 = new BaseClass("noRole");
	class1.giverolestats();
	
	
	System.out.println("What class would you like to be?");
	String role = sc.nextLine();
        if(role.equals("Warrior")||(role.equals("Wizard")||(role.equals("Rogue")))){
		BaseClass class2 = new BaseClass(role);
		class2.giverolestats();
	}
	else{
		System.out.println("Your input is incorrect. Please use capital letter for correct input");
		role = new String("noRole");
		BaseClass class2 = new BaseClass(role);
		class2.giverolestats();
			}
		}
	}
