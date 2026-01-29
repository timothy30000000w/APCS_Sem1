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
		System.out.println("input your symbol");
		String symbol = sc.nextLine();
		System.out.println("input your width");
		int width = sc.nextInt();
		System.out.println("input your height");
		int height = sc.nextInt();
		String [][] arr = new String[height][width];
		
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[0].length; j++){
				arr[i][j] = symbol;
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
}
