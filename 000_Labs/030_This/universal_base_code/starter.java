/*
 *	Author:  Jonah Choe
 *  Date: 11/1/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf dwarfOne = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf dwarfTwo = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf dwarfThree = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf dwarfFour = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf dwarfFive = new PooleDwarf(randName(), (int)(Math.random()*10));
		PooleDwarf dwarfSix = new PooleDwarf(randName(), (int)(Math.random()*10));
		int counter = 0;
		if(dwarfOne.isSameName(dwarfTwo.getName())){
			counter = counter + 1;
		}
		if(dwarfOne.isSameName(dwarfThree.getName())){
			counter = counter + 1;
		}
		if(dwarfOne.isSameName(dwarfFour.getName())){
			counter = counter + 1;
		}
		if(dwarfOne.isSameName(dwarfFive.getName())){
			counter = counter + 1;
		}
		if(dwarfOne.isSameName(dwarfSix.getName())){
			counter = counter + 1;
		}
		System.out.println(dwarfOne.getName()+" name was duplicated "+ counter + " time(s). ");
		
	}
}
