/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int randomNum = (int)(Math.random()*1000);
	int guess = sc.nextInt();
	
	while(guess != randomNum){
		
		if (guess == randomNum){
			break;
		}
		else if (guess > randomNum) {
			System.out.println("guess lower");
		}
		else if (guess < randomNum) {
			System.out.println("guess higher");
		}
		
		guess = sc.nextInt();
		
	}
	System.out.print("you won");

		
	}
}
