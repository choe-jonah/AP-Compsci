/*
 *	Author:  Jonah Choe
 *  Date: 11/1/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		// Complete this constructor
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		// Fix this method
		name = nane;
	}
	
	public void setAge(int age){
		// Fix this method
		this.age = age;
	}

	public boolean isSameName(String name){
		// Complete this method
		if(this.name == name){
			return true;
		}
		else{
			return false;
		}
	}
}

