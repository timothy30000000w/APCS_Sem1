/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {


		String [] song = new String[10];
		song[0] = "here comes the sun";
		song[1] = "Here comes the sun";
		song[2] = "And I say, it's all right";
		song[3] = "Little darling";
		song[4] = "It's been a long, cold, lonely winter";
		song[5] = "Little darling";
		song[6] = "It feels like years since it's been here";
		song[7] = "Here comes the sun";
		song[8] = "Here comes the sun";
		song[9] = "And I say, it's all right";
		
		int i = 0;
		
		while (i< 10){
			System.out.println(song[i]);
			i = i + 1;
		}

		
	}
}
