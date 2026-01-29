/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[1000];
		
		int i = 0;
	
		while (i < arr.length){
			int randomNum = (int)(Math.random() * 1000);
			arr[i] = randomNum;
			i = i + 1;
		}
		
		
		int x = 0;
		
		while (x < arr.length){
			System.out.println(arr[x]);
			x = x + 1;
			// to prevent crash
			// if (x > 100){
			// 	break;
			// }
		}
		
	}
}
