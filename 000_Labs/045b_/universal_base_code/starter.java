/*
 *	Author:  
 *  Date: 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
				- Scanner sc 
				- String variable
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
				- str.length()
				- Add 5 to str.length and create 2d array
			3. Choose what direction the word should hide in
					- Vertical, Horizontal, Diagonal
					- (int)(Math.random() * 3)
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };

		
		String word = sc.nextLine();
		// System.out.println(word);
		
		int length = word.length() + 5;
		
		
		String [][] puzzle = new String[length][length];
		
		
		
		int randomNum = (int)(Math.random() * 3);
	
		// horizontal
		if(randomNum == 0){
			// System.out.println("a" + puzzle[0].length);
			// System.out.println("b" + word.length());
			int bounds = puzzle[0].length - word.length();
			System.out.println("Bounds" + bounds);
			int startingRow = (int)(Math.random() * length);
			System.out.println("Row" + startingRow);
			int startingColumn = (int)(Math.random() * bounds);
			System.out.println("Column" + startingColumn);
			
			for (int i = 0; i < word.length(); i++){
				puzzle[startingRow][startingColumn + i] = word.substring(i, i+1);
			}

		}
		// vertical 
		if(randomNum == 1){
			int bounds = puzzle.length - word.length();
			System.out.println("Bounds " + bounds);
			int startingRow = (int)(Math.random() * bounds);
			System.out.println("Row " + startingRow);
			int startingColumn = (int)(Math.random() * length);
			System.out.println("Column " + startingColumn);
			
			// puzzle[startingRow][startingColumn] = "E";
			for (int i = 0; i < word.length(); i++){
				puzzle[startingRow + i][startingColumn] = word.substring(i, i+1);
			}
			
		}
		// diagonal
		if(randomNum == 2){
			int bounds = puzzle.length - word.length();
			System.out.println("Bounds " + bounds);
			int startingRow = (int)(Math.random() * bounds);
			System.out.println("Row " + startingRow);
			int startingColumn = (int)(Math.random() * bounds);
			System.out.println("Column " + startingColumn);
			
			for (int i = 0; i < word.length(); i++){
				puzzle[startingRow + i][startingColumn + i] = word.substring(i, i+1);
			}
		}
		
		
		
		for (String [] rows: puzzle){
			for (String val: rows){
				if (val == null){
					int randomNumber = (int)(Math.random() * letters.length);
						val = letters[randomNumber];
				}
				
				System.out.print(val + " ");
				
			}
			System.out.println();
		}
	
		
	}
}
