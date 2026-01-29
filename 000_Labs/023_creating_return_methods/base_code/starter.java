/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	System.out.print(pow(3,5));
	}
	
	public static int pow(int a, int b){
		//2x2x2x2x2
		int newValue = 1;
		int x = 0;
		while (x < b){
			
			if(x > b){
				break;
			}
			newValue *= a;
			x=x+1;
		}
		return newValue;
		
	}
	
}
