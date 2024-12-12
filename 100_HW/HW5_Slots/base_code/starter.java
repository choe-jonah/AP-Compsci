/*
 *	Author: Jonah Choe
 *  Date: 10/6/2024
 * 	Collaborator(s): Daniel Sohn
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Slot Machine Rules:");
		System.out.println("1. You start with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("a. If two numbers match, you double your money.");
		System.out.println("b. If three numbers match, you triple your money.");
		System.out.println("c. If none match, you lose your money.");
		System.out.println("----------------------------------------------------------");
		String a;
		int money;
		int bet;
		int num1;
		int num2;
		int num3;
		money = 100;
		while(true)
		{
			System.out.println("Would you like to play slots? (Yes, yes, y, Y): ");
			a = sc.nextLine();
			if(a.equals("yes")|| a.equals("Yes") || a.equals("y") || a.equals("Y"))
			{
				System.out.println("You have "+ money +". How much do you want to spend");
				bet = sc.nextInt();
				sc.nextLine();
				if(bet>money)
				{
					System.out.println("Please choose a smaller number: ");
					bet = sc.nextInt();
				}
				if(bet<=money)
				{
					num1 = (int)(Math.random()*11);
					num2 = (int)(Math.random()*11);
					num3 = (int)(Math.random()*11);
					System.out.println("Okay, lets play.");
					System.out.println("Your rolls are: ");
					System.out.println("________________________");
					System.out.println(" | "+num1+" | "+num2+" | "+num3+" | ");
					System.out.println("________________________");
					
					if(num1 == num2 || num2 == num3 || num3 == num1)
					{
						System.out.println("You win! Your bet amount has now doubled!");
						money = (2*bet) + money;
					}
					else if (num1==num2 && num2==num3)
					{
						System.out.println("Jackpot! Your bet amount has now tripled");
						money = (3*bet)+money;
					}
					else
					{
						System.out.println("You lost. Try again.");
						money = money-bet;
					}
				}
				if(money==0)
				{
					System.out.println("You ran out of money. Come again.");
					break;
				}
			}
			if(a.equals("no"))
			{
				System.out.println("You left the banmk with "+ money+ "dollars");
			}
		}
		
	}
}
