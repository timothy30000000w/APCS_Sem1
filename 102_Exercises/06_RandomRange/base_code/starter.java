/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	System.out.println("This number must be bigger than the first");
	int y = sc.nextInt();
	if (y > x){
	System.out.println("Your range is " + x + " to " + y);
	int random1 = (int)(Math.random() * (y-x) ) + x;
	int random2 = (int)(Math.random() * (y-x) ) + x;
	int random3 = (int)(Math.random() * (y-x) ) + x;
	int random4 = (int)(Math.random() * (y-x) ) + x;
	int random5 = (int)(Math.random() * (y-x) ) + x;
	System.out.println(random1);
	System.out.println(random2);
	System.out.println(random3);
	System.out.println(random4);
	System.out.println(random5);
		
		
	}
	else {
		System.out.print("The second number was not valid");
	}
	}
}
