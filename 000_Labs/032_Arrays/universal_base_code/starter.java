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
		
		
		int[] arr = new int[10];

		int i = 0;
		int total = 10;
		while(i < arr.length){
			total = total -1;
			arr[i] = total;
			System.out.println(arr[i]);
			i = i + 1;
			
			
		}
		
		// System.out.println(arr[8]);
	}
}
