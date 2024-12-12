/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue");
		String a = sc.nextLine();
		if((a.equals("Wizard"))||(a.equals("wizard"))||(a.equals("Warrior"))||(a.equals("warrior"))||(a.equals("Rogue"))||(a.equals("rogue"))){
			System.out.println("You are now a "+a);
		}
		else{
			System.out.println("Your input is invalid");
		}
	}
}
