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
		String before = sc.nextLine();
		System.out.println("The line before: " + before);
		
		String answer = " ";
			
		while (before.indexOf(" ") != -1){ // index of return -1 if not found
			
			int space = before.indexOf(" ");
			
			String word = before.substring(0, space);
		
			before = before.substring(space + 1);
			answer = word + " " + answer;
			
		}
		
		System.out.println("The line after: " + before + " " + answer);


/*
		int length = before.length(); // 5 in this case
		int i = 1;
		int j = 0;
		
		
		System.out.println("The line after: ");
		while (i <= (length)){ // 4
			System.out.print(before.substring(length - i , length - j));
			i++;
			j++;
		}
*/		
		
		// System.out.println(after);
		
		
	}
}
