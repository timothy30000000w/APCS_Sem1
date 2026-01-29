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
		System.out.println("Row");
		int row = sc.nextInt();
		System.out.println("Column");
		int column = sc.nextInt();
		
		double total = 0.0;
		
		int [][] arr = new int[row][column];
			for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr[0].length; j++){
					arr[i][j] = 5;
					total += arr[i][j];
				}
			}
		
		System.out.println(total/(arr.length * arr[0].length));

	}
}
