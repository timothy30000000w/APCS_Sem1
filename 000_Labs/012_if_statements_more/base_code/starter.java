/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		if (first != second){
			System.out.print("The values are different");
		}
		else {
			System.out.print("The values are the same");
		}
	}
}
