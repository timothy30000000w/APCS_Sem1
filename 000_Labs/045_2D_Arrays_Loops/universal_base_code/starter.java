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
		System.out.println("Row");
		int row = sc.nextInt();
		System.out.println("Column");
		int column = sc.nextInt();

		int [][] arr = new int[row][column];
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				arr[i][j] = (int)((Math.random() * 10) + 1);
				// System.out.println(arr[i][j]);
			}
		}
		
		// prints out all values
		printAllValues(arr);
		
		System.out.println("What row to calculate the values of? ");
		int rowToCalculateAverageOf = sc.nextInt();
		if(rowToCalculateAverageOf >= row){
			System.out.println("Error for row");
			return;
		}
		
		// This method calculates the average of the row
		// Change the number passed to calculate a diff row
		double y = printAndAverageOfRow(arr, rowToCalculateAverageOf);
		System.out.println("Here is the average of row " + rowToCalculateAverageOf +": " + y);
		
		// This method calculates the average of all values
		double x = printAndAverageOfAllRows(arr);
		System.out.println("Here is the average of all values " + x);
		
	}
	
	
	
	
	public static double printAndAverageOfRow(int[][] arr, int numOfRow){
		
		double total = 0.0;
		System.out.println("num of row" + numOfRow);
		
		for(int i = numOfRow; i < numOfRow + 1; i++){
			for(int j = 0; j < arr[0].length; j++){
				total += arr[i][j];
			}
			// System.out.println("\n" + "Here is the total of your selected row: " + total);
			// System.out.println("Here is the number of columns: " + arr[numOfRow].length);
		}
		
		return total/(arr[numOfRow].length);
	}
	
	
	
	public static double printAndAverageOfAllRows(int[][] arr){
		
		double total = 0.0;
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				total += arr[i][j];
			}
			// System.out.println("\n" + "Here is the total of all rows: " + total);
		}
		return total/((arr[0].length * arr.length));
	}
	
	
	
	public static void printAllValues(int [][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[0].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
}
