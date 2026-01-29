/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int randomNumber = (int)(Math.random() * 1000);
		System.out.println(randomNumber);
		
		int x = sc.nextInt();
		if (x > randomNumber){
			System.out.println("Guess lower");
		}
		else if(x < randomNumber){
			System.out.println("Guess higher");
		}
	}
}
