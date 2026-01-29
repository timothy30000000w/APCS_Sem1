/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		int y = sc.nextInt();

		int i = 0;
		while(true){
			if (i == y){
				break;
			}
			System.out.println(x);
			i += 1;
		}
		
	}
}
