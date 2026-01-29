/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your title?");
		String title = sc.nextLine();
		System.out.println("Would you like to be a Duelist, Sentinel, or Controller?");
		String className = sc.nextLine();
		if(className.equals("Duelist") || className.equals("duelist")){
			System.out.println("You have chosen duelist! Go plant the spike on A site.");
		}
		else if(className.equals("Sentinel") || className.equals("sentinel")){
			System.out.println("You have chosen sentinel! Make sure to defend B site");
		}
		else if(className.equals("Controller") || className.equals("controller")){
			System.out.println("You have chosen controller! Make sure to help the duelist entry onto C site.");
		}
		else {
			System.out.println("You have queue dodged. Click play again.");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Luck, Skill, MapAwareness, and InternetSpeed . Spend them wisely.");
		int totalPoints = 20;
		
		//Luck points
		System.out.println("Luck (1-10):");
		int luckPoints = sc.nextInt();
		if (luckPoints > 0 && luckPoints < 10){
		totalPoints -= luckPoints;
		System.out.println("You have " + (totalPoints) + " points left");
		
		} else{
			System.out.print("Different value!");
			luckPoints = sc.nextInt();
			totalPoints -= luckPoints;
			System.out.println("You have " + (totalPoints) + " points left");
		}

		
		//Skill points
		System.out.println("Skill (1-10):");
		int skillPoints = sc.nextInt();
		if (skillPoints > 0 && skillPoints < 10){
		totalPoints -= skillPoints;
		System.out.println("You have " + (totalPoints) + " points left");
		} else{
			System.out.print("Different value!");
			skillPoints = sc.nextInt();
			totalPoints -= skillPoints;
			System.out.println("You have " + (totalPoints) + " points left");
		}

		//MapAwareness points
		System.out.println("MapAwareness (1-10):");
		int MapAwarenessPoints = sc.nextInt();
		if (MapAwarenessPoints > 0 && MapAwarenessPoints < 10){
		totalPoints -= MapAwarenessPoints;
		System.out.println("You have " + (totalPoints) + " points left");
		} else{
			System.out.print("Different value!");
			MapAwarenessPoints = sc.nextInt();
			totalPoints -= MapAwarenessPoints;
			System.out.println("You have " + (totalPoints) + " points left");
		}

		//InternetSpeed points
		System.out.println("InternetSpeed (1-10):");
		int InternetSpeedPoints = sc.nextInt();
		if (InternetSpeedPoints > 0 && InternetSpeedPoints < 10){
		totalPoints -= InternetSpeedPoints;
		System.out.println("You have " + (totalPoints) + " points left");
		} else{
			System.out.print("Different value!");
			InternetSpeedPoints = sc.nextInt();
			totalPoints -= InternetSpeedPoints;
			// System.out.println("You have " + (totalPoints) + " points left");
		}
		
		System.out.println("////////////////////////////");
		
		System.out.println("You are " + name + ", the" + title + " of CVHS");
		System.out.println("You're a " + className + " with the following stats!");
		System.out.println("Luck" + " - " + luckPoints);
		System.out.println("Skill" + " - " + skillPoints);
		System.out.println("MapAwareness" + " - " + MapAwarenessPoints);
		System.out.println("InternetSpeed" + " - " + InternetSpeedPoints);
		
		System.out.println("GOOD LUCK!! This is your rank up game!!");

	}
}
