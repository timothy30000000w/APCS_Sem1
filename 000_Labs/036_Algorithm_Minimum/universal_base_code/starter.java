/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		
		
		int arraySize = (int)(Math.random() * 150 + 51);
		// System.out.println(arraySize);
		int [] arr = new int[arraySize];

		
		
		for (int i = 0; i < arr.length; i++){
			int randomInt = (int)(Math.random() * 100 + 1);
			arr[i] = randomInt;
			// prints all elements of array with random size and values
			System.out.println(arr[i]);
		}
		
		int min = Integer.MAX_VALUE;
		// System.out.println(max);
		
		// find min
		for (int i = 0; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		
		System.out.println("THE MININUM: " + min);
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++){
			if (arr[i] > min){
				max = arr[i];
				min = arr[i];
			}
		}
		
		System.out.println("THE MAXIMUM: " + max);


	int total = 0;
	
		for (int i = 0; i < arr.length; i++){
			total += arr[i];
		}
	
		System.out.println("The total amount of elements: " + arraySize);
		System.out.println("The average: " +total/arr.length);
		
		
	}
}
