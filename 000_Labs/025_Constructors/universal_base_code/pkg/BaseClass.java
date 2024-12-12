/*
 *	Author:  Jonah Choe
 *  Date: 10/18/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass{
	int strengthValue;
	int dexterityValue;
	int intelligenceValue;
	int constitutionValue;
	int charismaValue;
	String role;
	
	public BaseClass(String a) {
	role = a;
	strengthValue = 0;
	dexterityValue = 0;
	intelligenceValue = 0;
	constitutionValue = 0;
	charismaValue = 0;
		
	}
	public void giverolestats(){
		System.out.println("------------------------------");
		System.out.println("Your role is:" + role);
		System.out.println("Strength: "+strengthValue);
		System.out.println("Dexterity: "+ dexterityValue);
		System.out.println("Intelligence: "+intelligenceValue);
		System.out.println("Constituion: "+ constitutionValue);
		System.out.println("Charisma: "+charismaValue);
		System.out.println("-------------------------------");
		System.out.println("");
	}

}

