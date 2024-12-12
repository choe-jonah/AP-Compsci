/*
 *	Author: Jonah Choe
 *  Date: 10/27/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		Dog myDog1 = new Dog("Jayden");
		myDog1.setAge(10);
		Dog myDog2 = new Dog("Daniels", "Dawg");
		if(myDog1.isSleeping()){
			System.out.println(myDog1.getName()+" is asleep");
		}
		else{
			myDog1.bark();
			myDog2.bark();
		}

	}
}
