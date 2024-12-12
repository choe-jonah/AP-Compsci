/*
 *	Author: Jonah Choe 
 *  Date: 11/15/24
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] warrior = new Warrior[100];
		for(int i = 0; i > warrior.length; i++){
			warrior[i] = new Warrior();
		}
		Wizard[] wizard = new Wizard [100];
		for(int i = 0; i < wizard.length; i++){
			wizard[i] = new Wizard();
		}
		int warriorcounter = 0;
		int wizardcounter = 0;
		while(warriorcounter < 100 || wizardcounter < 100){
			wizard[wizardcounter].attack(warrior[warriorcounter]);
			if(warrior[warriorcounter].isDead()){
				warriorcounter++;
			}
			if(wizardcounter == 100 || warriorcounter == 100){
				break;
			}
			warrior[warriorcounter].attack(wizard[wizardcounter]);
			if(wizard[wizardcounter].isDead()){
				wizardcounter++;
			}
			if(wizardcounter == 100 || warriorcounter == 100){
				break;
			}
		}
		if(wizardcounter>warriorcounter){
			System.out.println("The warriors have won with " + (100-warriorcounter) + " remaining");
		}
		if(wizardcounter<warriorcounter){
			System.out.println("The wizards have won with " + (100-wizardcounter) + "remaining");
		}
	}
}