/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		// Largest int
		if ((x > y) && (x > z)){
			
			System.out.println(x);
		}
		if ((y > x) && (y > z)){
			System.out.println(y);
		}
		if ((z > x) && (z > y)){
			System.out.println(z);
		}
		
		// Smallest int
		if ((x < y) && (x < z)){
			System.out.println(x);
		}
		if ((y < x) && (y < z)){
			System.out.println(y);
		}
		if ((z < x) && (z < y)){
			System.out.println(z);
		}
	}
}
