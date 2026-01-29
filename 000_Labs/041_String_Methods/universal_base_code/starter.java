/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name with a space in between");
		String word = sc.nextLine();
		int index = word.indexOf(" ");
		System.out.println("last name is " + word.substring(index+1));
		
	}
}
