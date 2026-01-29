/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number: ");
	int input = sc.nextInt();
	System.out.println("Here are the next 5 numbers!");
	System.out.println(input + ", " + (input + 1) + ", " + (input + 2) + ", " +(input + 3) + ", " + (input + 4) + ", " + (input+5));
	System.out.println("Here are the next 5 multiples of " + input + "!");
	System.out.println((input * 1) + ", " + (input * 2) + ", " +(input * 3) + ", " + (input * 4) + ", " + (input * 5));
	System.out.println("Here is " + input + " divided by 100!");
	System.out.println(input/100.0);
	System.out.println("Here is " + input + " divided by 10!");
	System.out.print(input/10.0);
	

	}
}
