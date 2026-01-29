/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	
	
		BaseClass test = new BaseClass();
	
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		int i = 0;
		int j = 1;
		
		
		while(i < word.length()){
			
			System.out.println(i + " " + word.substring(i, j));
			i++;
			j++;
			
		}
		

		
	}
}
