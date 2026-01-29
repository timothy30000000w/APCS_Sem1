/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("WELCOME ");
	System.out.println("--------------------------------------------------");
	
	
	
	int total = 100;
	
	
while (total > 0){
	System.out.print("Would you like to play the slots? (Yes/yes/Y/y): " );
	String stringInput = sc.nextLine();
		
		if (stringInput.equals("Yes") || stringInput.equals("yes") || stringInput.equals("Y") || stringInput.equals("y")){
		System.out.print("You have " + total + ". How much would you like to wager? ");
		int integerInput = sc.nextInt();
		sc.nextLine();
			if (integerInput <= total) {
				int firstNum = (int)(Math.random()*11); 
				int secondNum = (int)(Math.random()*11); 
				int thirdNum = (int)(Math.random()*11); 
					System.out.println("Great! Let's play!!!");
					System.out.println("Your rolls are");
					System.out.println("_______________________");
					System.out.println("|" + firstNum + "|" + secondNum + "|" + thirdNum + "|");
					System.out.println("_______________________");
					
					if(firstNum == secondNum && firstNum == thirdNum){
						total += (3* integerInput);
						System.out.println("You won! total balance: " + total);
					}
					else if((firstNum == secondNum || firstNum == thirdNum || secondNum == thirdNum)){       
						total += (2 * integerInput);
						System.out.println("You won! total balance: " + total);
					}
					else {
						total -= integerInput;
						System.out.println("You Lost! total balance: " + total);
					}
			}
			else {
				System.out.print("the input must be valid!");
			}
	}
	else if (stringInput.equals("No") || stringInput.equals("no") || stringInput.equals("N") || stringInput.equals("n")){
	System.out.print("Sad to see you go! You still have " + total + " left. Come again soon! Thanks!");
	total = 0;
	}
	else {
		System.out.println("That wasn't quite the correct answer. Try again.");
		total = 0;
	}
}


	}
	
}
