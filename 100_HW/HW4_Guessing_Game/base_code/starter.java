/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
		
	int randomNumber = (int)(Math.random() * 3 + 1);
	// guess 1
	if (randomNumber == 1){
		System.out.println("It is an ability fighting game!");
		System.out.print("What is your guess? ");
		String first = sc.nextLine();
		
		
		if (!first.equals("valorant") && !first.equals("Valorant")){
			System.out.println("It is a game made by the company riot");
			String second = sc.nextLine();
			
			if (second.equals("valorant") || second.equals("Valorant")){
				System.out.print("That is 50% correct");
			}
			else {
				System.out.print("Try again ");
			}
		}
		
		if (first.equals("valorant") || first.equals("Valorant")){
			System.out.println("That is 100% correct");
		}
}
	
	// guess 2
	if (randomNumber == 2){
		System.out.println("Artist of the m.A.A.d city album(ONLY inlcude his first name");
		System.out.print("What is your guess? ");
		String first = sc.nextLine();
		
		if (!first.equals("Kendrick") && !first.equals("kendrick")){
			System.out.println("Last name is Lamar");
			String second = sc.nextLine();
			
			if (second.equals("Kendrick") || second.equals("kendrick")){
				System.out.print("That is 50% correct");
			}
			else {
				System.out.print("Try again ");
			}
		}
		
		if (first.equals("Kendrick") || first.equals("kendrick")){
			System.out.println("That is 100% correct");
		}
		
	}
	
	// guess 3
	if (randomNumber == 3){
		System.out.println("Aritst of the wolf album(ONLY include his first name");
		System.out.print("What is your guess? ");
		String first = sc.nextLine();
		
		if (!first.equals("Tyler") && !first.equals("tyler")){
			System.out.println("His latest album was Don't tap the glass");
			String second = sc.nextLine();
			
			if (second.equals("Tyler") || second.equals("tyler")){
				System.out.print("That is 50% correct");
			}
			else {
				System.out.print("Try again ");
			}
		}
		
		if (first.equals("Tyler") || first.equals("tyler")){
			System.out.println("That is 100% correct");
		}
		
	}
	
		

	}
}
