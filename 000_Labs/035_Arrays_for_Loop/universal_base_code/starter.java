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
	
	int randomNum;
	
	for (int i = 0; i < arr.length; i++){
		randomNum = (int)(Math.random() * 1001);
		arr[i] = randomNum;
	}
	
	for (int x = 0; x < arr.length; x++){
		System.out.println(arr[x]);
		// prevent crash
		// if(x > 100){
		// 	break;
		// }
		
	}



		
	}
}
