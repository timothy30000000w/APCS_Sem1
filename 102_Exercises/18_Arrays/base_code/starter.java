/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int i = 0;
		 int total = 0;
		 while (i < arr1.length){
		 	
		 	total = total + 3;

		 	arr1[i] = total;
		 	i = i + 1;
		 	
		 }
		 
		 System.out.println(arr1[1000]);
	
	///////////////////////////////////////////
	
		 int [] array2 = new int[1001];
		 int index2 = 0;
		 int total2 = 1000;
		 
		 while (index2 < array2.length){
		 	array2[index2] = total2;
		 	total2 = total2 - 1;
		 	index2 = index2 + 1;
		 	
		 }
		 
		 System.out.println(array2[1000]);
	}
}
