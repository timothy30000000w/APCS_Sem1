/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

	int [] arr = new int[20];
	
	int randomNum;
	
	System.out.println("These are the 20 numbers");
	
	for (int i = 0; i < arr.length; i++){
		randomNum = (int)(Math.random() * 10 + 1);
		arr[i] = randomNum;
		System.out.print(arr[i] + " ");
	}
	
	
	int randomTarget = (int)(Math.random() * 10 + 1);
	
	System.out.println("The target nnumber to look for: " + randomTarget);
	
	int count = 0;
	for (int i = 0; i < arr.length; i++){
		if (arr[i] == randomTarget){
			
			System.out.println("Duplicate found at index: " + i);
			count++;
		}
	}
	
	System.out.println("Total number of duplicates for " + randomTarget + " is " + count);
	
	
	for (int i = 0; i < arr.length; i++){
		if(arr[i] == arr[i+1]){
			System.out.println("Two in a row found at indexes " + i + " " + (i+1) + " the number is " + arr[i]);
		}
		i++;
	}
	

	}
	

	
	
}