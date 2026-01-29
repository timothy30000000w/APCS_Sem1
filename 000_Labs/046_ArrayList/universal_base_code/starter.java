/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Amount of cookies");
	int cookies = sc.nextInt();
	sc.nextLine();
	
	ArrayList<String> arr = new ArrayList<String>(cookies);
	
	for (int i = 0; i < cookies; i++){
		String input = sc.nextLine();
		
		arr.add(input);
	}
	
	System.out.println("your cookies");
	for (int i = 0; i < arr.size(); i++){
		System.out.println("cookie " + i + ": " + arr.get(i));
	}
	// System.out.println(arr);



	}
}
