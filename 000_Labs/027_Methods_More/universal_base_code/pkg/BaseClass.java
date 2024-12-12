/*
 *	Author:  Jonah Choe
 *  Date: 10/23/24
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int str;
	int dex;
	int intelligence;
	int charisma;
	int con;
	
	public BaseClass(String a){
		role = a;
		str = 0;
		dex= 0;
		intelligence = 0;
		con = 0;
		charisma = 0;
	}
	
	public BaseClass(String role, int s, int d, int i, int ch, int c){
		role = role;
		str = s;
		dex = d;
		intelligence  = i;
		con = c;
		charisma = ch;
	}
	public String setRole(String a){
		if(a.equals("warrior")||(a.equals("wizard")||(a.equals("rogue")))){
			return a;
		}
		else{
			System.out.println("You've decided not to choose a role. Rerun program");
			return a;
			}
		}
		public int setStr(int s){
			return str;
		}
		public int setDex(int d){
			return dex;
		}
		public int setInt(int i){
			return intelligence;
		}
		public int setChar(int ch){
			return charisma;
		}
		public int setCont(int c){
			return con;
		}
		public boolean setAll(String role, int s, int d, int i, int ch, int c){
			this.role = role;
			str = s;
			dex = d;
			intelligence = i;
			con = c;
			charisma = ch;
			if(role.equals("warrior")||(role.equals("wizard")||(role.equals("rogue")))&&str>0&&dex>0&&intelligence>0&&charisma>0&&con>0){
				return true;
				}
				else{
					return false;
				}
			}
				public void myToString(){
		System.out.println("------------------------------");
		System.out.println("Your role is:" + role);
		System.out.println("Strength: "+str);
		System.out.println("Dexterity: "+ dex);
		System.out.println("Intelligence: "+intelligence);
		System.out.println("Constituion: "+ con);
		System.out.println("Charisma: "+charisma);
		System.out.println("-------------------------------");
		System.out.println("");
	}

			}
