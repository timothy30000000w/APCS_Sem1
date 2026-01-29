/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Do you want to be a Wizard, Warrior, or a Rogue");
		String className = sc.nextLine();
		if (className.equals("Wizard") || className.equals("wizard")){
			System.out.print("You have chosen the wizard class");
		}
		else if (className.equals("Warrior") || className.equals("warrior")){
			System.out.print("You have chosen the warrior class");
		}
		else if (className.equals("Rogue") || className.equals("rogue")){
			System.out.print("You have chosen the rogue class");
		}
		else {
			System.out.print("Select your class again!");
		}
		
	}
}
