/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please type in cat timothy or house");
		String animalObjectFace = sc.nextLine();
		// String dog = sc.nextLine();
		// String timmyface = sc.nextLine();
		// String rock = sc.nextLine();
		
		if (animalObjectFace.equals("cat")){
			System.out.println("|\\---/|");;
			System.out.println("|o   o|");
			System.out.println("\\  ^  /");
		}
		else if(animalObjectFace.equals("timothy")){
			System.out.println("///\\\\\\");
			System.out.println("|O  O|");
			System.out.println("\\  + /");
		}
		else if(animalObjectFace.equals("house")){
			System.out.println("  _____");
			System.out.println(" /     \\");
			System.out.println(" |_____|");
		}
		else {
			System.out.print("Run the system again..");
		}
	}
}
