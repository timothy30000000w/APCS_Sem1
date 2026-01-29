/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		String[][] words = {
			// Col 0, 1, 2, 3
			
			{"The", "A", "My", "Our"},					// Row 0
			{"quick", "lazy", "happy", "curious"},		// Row 1
			{"dog", "cat", "robot", "student"},			// Row 2
			{"eats", "builds", "chases", "studies"},	// Row 3
			{"pizza", "code", "homework", "dreams"}		// Row 4
		};
		
		
	
		
		for(int j = 0; j < 1; j++){
			for (int i = 0; i < words.length; i++){
				System.out.print(words[i][j] + " ");
			}
			System.out.println();
		}
		
		// 1. The quick dog eats pizza
		// 2. My lazy cat chases homework
		// 3. Our happy student studies code
		// 4. A curious robot builds dreams
		// 5. The quick robot studies pizza
		// 6. My happy robot dog eats homework
		
		
		// 2. My lazy cat chases homework
		System.out.println(words[0][2] + " " + words[1][1] + " " + words[2][1] + " " + words[3][2] + " " + words[4][2]);
		// 3. Our happy student studies code
		System.out.println(words[0][3] + " " + words[1][2] + " " + words[2][3] + " " + words[3][3] + " " + words[4][1]);
		// 4. A curious robot builds dreams
		System.out.println(words[0][1] + " " + words[1][3] + " " + words[2][2] + " " + words[3][1] + " " + words[4][3]);
		// 5. The quick robot studies pizza
		System.out.println(words[0][0] + " " + words[1][0] + " " + words[2][2] + " " + words[3][3] + " " + words[4][0]);
		// 6. My happy robot dog eats homework
		System.out.println(words[0][2] + " " + words[1][2] + " " + words[2][2] + " " + words[3][0] + " " + words[4][2]);
		

	}
}
