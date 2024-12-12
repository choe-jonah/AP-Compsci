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
		System.out.println("What is your name: ");
		String b = sc.nextLine();
		System.out.println("What is your title: ");
		String c = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or a Rogue");
		String a = sc.nextLine();
		if((a.equals("Wizard"))||(a.equals("wizard"))||(a.equals("Warrior"))||(a.equals("warrior"))||(a.equals("Rogue"))||(a.equals("rogue"))){
			System.out.println("You are now a "+a);
		}
		else{
			System.out.println("Your input is invalid");
		}
		System.out.println("You have 20 skill points to spend on Strength, Dexterity, Intelligence, and Charisma");
		System.out.println("Strength (1-10): ");
		int d = sc.nextInt();
		System.out.println("You have "+(20-d)+" points left");
		System.out.println("Dexterity (1-10): ");
		int e = sc.nextInt();
		System.out.println("You have "+(20-d-e)+" points left");
		System.out.println("Intelligence (1-10): ");
		int f = sc.nextInt();
		System.out.println("You have "+(20-d-e-f)+" points left");
		System.out.println("Charisma (1-10): ");
		int g = sc.nextInt();
		System.out.println("------------------------------------------------");
		System.out.println(" ");
		System.out.println("You are "+b+", the "+c+" of CVHS");
		System.out.println("You're a "+a+" with the following stats");
		System.out.println("Strength - "+d);
		System.out.println("Dexterity - "+e);
		System.out.println("Intelligence - "+f);
		System.out.println("Charisma - "+g);
		
	}
}
