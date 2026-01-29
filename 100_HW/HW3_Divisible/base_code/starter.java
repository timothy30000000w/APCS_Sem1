/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int y = sc.nextInt();
	int firstnumber = x % 2;
	int secondnumber = y % 2;
	if (firstnumber == 0){
		System.out.println("The value is even");
	}
	
	else {
		System.out.println("The value is odd");
	}

	if (secondnumber == 0){
		System.out.println("The value is even");
	}
	else {
		System.out.println("The value is odd");
	}
	
	
	if (x % 3 == 0){
		System.out.println("This is divisible by 3");
	}
	if(x % 4 == 0){
		System.out.println("This is divisible by 4");
	}
	if(x % 5 == 0){
		System.out.println("This is divisble by 5");
	}
	// Check if the num is not divisible by 3 4 or 5
	if (x % 3 == 0){
		
	}
	else if(x % 4 ==0){
		
	}
	else if(x % 5 ==0){
		
	}
	else{
		System.out.println("This is not divisble by 3, 4, or 5");
	}

			
	
	if (y % 3 == 0){
		System.out.println("This is divisible by 3");
	}
	if(y % 4 == 0){
		System.out.println("This is divisible by 4");
	}
	if(y % 5 == 0){
		System.out.println("This is divisble by 5");
	}
	// Check if the num is not divisible by 3 4 or 5
	if (y % 3 == 0){
		
	}
	else if(y % 4 ==0){
		
	}
	else if(y % 5 ==0){
		
	}
	else{
		System.out.println("This is not divisble by 3, 4, or 5");
	}
	
	
	}
}
