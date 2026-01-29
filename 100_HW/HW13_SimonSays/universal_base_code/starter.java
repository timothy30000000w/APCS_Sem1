/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a difficulty level: 1, 2, or 3");
        int diff = sc.nextInt();
        sc.nextLine();

        

        /* 
            Basics of the game:
            - Given a set of words, the player must memorize the colors
            - After a 5 second delay, the player must type in each color one at a time on separate lines
            - At any point, if they type in an incorrect color, the game ends. The game will print out the correct colors.
            - If they get them all right, the game will continue and add one more word to the series.
            - The series changes every round.
        */

        //  Given the Colors class, use the following method calls to help this program.
        /*
        Colors.print("Test 1");         // This prints out the value given without a new line   
        Colors.println("Test 2");       // This prints out the value given then a new line
        Colors.print("Test 3", "BRIGHT_Red");       // 2 String parameters: Value, Color of text
        Colors.println("Test 4", "BRIGHT_Red");     // 2 String parameters: Value, Color of text WITH a new line after
        Colors.print("Test 5", "BRIGHT_Red", "BG_Blue");         // 3 String parameters: Value, Color of text, Color of background
        Colors.println("Test 6", "BRIGHT_Red", "BG_Blue");       // 3 String parameters: Value, Color of text, Color of background WITH a new line after
        // Notice: for the colors, you must concatenate "BRIGHT_" or "BG_" to the input parameter to get the bright or background versions of the colors.
        */
        // Feel free to comment out the test code above when you start your assignment
        
        
        int oneCurrentIndex = 0;
        int oneCurrentLength = 1;
        
        
        int round = 1;
        
        if(diff == 1){

            /*
                Difficulty level 1:
                    The user will receive a series of colors as words (ex. "Red", "Blue", "Green", etc.)
                    The user must type in the colors in the correct order

                1. The game should repeat until the player loses
                2. Each round, a new set of words is generated. The game starts at 1 word and adds one more word each round.
                    - All words should be randomly chosen and stored to be checked later
                    - Print each word when generated for the user to start to memorize
                3. Tell the user to memorize the phrase then start the count down of 5 seconds
                4. After the delay, print a bunch of new lines to clear the screen
                5. Prompt the user to type in each color one at a time
                    - Take in as many inputs as there words generated
                    - Check all words against the generated list of words
                    - ALL words should be taken in, THEN you can tell the user if they lost
                    - This means checking and keeping track of if they lost or not
                6. Once all inputs are taken in 
                    - Tell the user if they lost or won
                    - If they lost, print out the correct series of colors and end the game
                    - If they won, start a new round with one more word (start back at step 1)
            */

            boolean isActive = true;
            boolean win = false;
            int currentRound = 1; // default was 6
            // 1.
            while (isActive){
                 String [] oneArray = new String[currentRound];
                 String [] oneInputs = new String[currentRound];
                 
                 
            // 2.
                for (int i = 0; i < currentRound; i++){
                    oneArray[i] = getColorWord();
                }
                printArray(oneArray);
            // 3. 
                delay(5);
            // 4. 
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            // 5.
                System.out.println("Enter the words you saw");
                for (int i = 0; i < currentRound; i++){
                    oneInputs[i] = sc.nextLine();
                }                
                
                win = true;
                for (int i = 0; i < currentRound; i++){
                    if (!oneInputs[i].equals(oneArray[i])){
                        win = false;
                        System.out.println("Game over");
                        System.out.print("Correct answers: ");
                        printArray(oneArray);
                        isActive = false;
                        break;
                    }
                }
                    if (win && isActive){
                        System.out.println("nice job");
                        System.out.println("------------------------------------\n");
                        currentRound++;
                    }
                
            }
            
            
            


        }
        else if(diff == 2){
            /*
                Difficulty level 2:
                    This should act the same as difficulty level 1 with the following changes:
                    The user will receive a series of colors as words AND as text color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text or as a color
                    The user must type in the colors in the correct order by either text or text color
                    Both the text words and the text colors should be stored to be checked later
            */
            
            boolean isActive = true;
            boolean win = true;
            int currentRound = 1;
            
            while (isActive){
                String [] secondArray = new String[currentRound];
                String [] secondColors = new String[currentRound];
                
                for (int i = 0; i < currentRound; i++){
                    secondArray[i] = getColorWord();
                    secondColors[i] = getColorWord();
                    Colors.println(secondArray[i], "BRIGHT_" + secondColors[i]);
                    
                }
            // 3. 
            
            
                
                delay(5);
            // 4. 
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                
                
                
                boolean check = Math.random() < 0.5;
                if (check){
                    System.out.println("Enter words you saw");
                }
                else{
                    System.out.println("Enter the colors you saw");
                }
                
                for (int i = 0; i < currentRound; i++){ // better way to keep counter(IMP)
                    String input = sc.nextLine();
                    if(check && !input.equals(secondArray[i])){
                        win = false;
                        break;
                    }
                    if(!check && !input.equals(secondColors[i])){
                        win = false;
                        break;
                    }
                }
                if(win){
                    System.out.println("NICE ...");
                    currentRound++;
                }
                else{
                    System.out.println("You got it wrong. Here are the words ");
                    printArray(secondArray);
                    System.out.println("the colors ");
                    printArray(secondColors);
                    isActive = false;
                }

                
                // boolean win = true;
                // for (int i = 0; i < currentRound; i++);
                // String guess = sc.nextLine();
                
            }
            

        }
        else if(diff == 3){
            /*
                Difficulty level 3:
                    This should act the same as difficulty level 2 with the following changes:
                    The user will receive a series of colors as words, as text color, and as background color (ex. "Red", "Blue", "Green", etc.)
                    The computer will randomly choose either to check the word as text, as a color, or as background color
                    The user must type in the colors in the correct order
                    All of the text words, the text colors and the background colors should be stored to be checked later
            */
          boolean isActive = true;
            boolean win = true;
            int currentRound = 1;
            boolean firstV = false;
            boolean secondV = false;
            boolean thirdV = false;
            
            while (isActive){
                String [] thirdArray = new String[currentRound];
                String [] thirdColors = new String[currentRound];
                String [] background = new String[currentRound];
                
                for (int i = 0; i < currentRound; i++){
                    thirdArray[i] = getColorWord();
                    thirdColors[i] = getColorWord();
                    background[i] = getColorWord();
                    Colors.println(thirdArray[i], "BRIGHT_" + thirdColors[i], "BG_" + background[i]);
                    
                }
            // 3. 
            
            
                
                delay(5);
            // 4. 
                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                
                
                int randomNum = (int)(Math.random() * 3) ;
                
            
                if (randomNum == 0){
                    System.out.println("Enter words you saw");
                    firstV = true;
                }
                else if(randomNum == 1){
                    System.out.println("Enter the colors you saw");
                    secondV = true;
                }
                else{
                    System.out.println("Enter the background colors you saw");
                    thirdV = true;
                }
                
                for (int i = 0; i < currentRound; i++){ // better way to keep counter(IMP)
                    String input = sc.nextLine();
                    if(firstV && !input.equals(thirdArray[i])){
                        win = false;
                        firstV = false;
                        break;
                    }
                    if(secondV && !input.equals(thirdColors[i])){
                        win = false;
                        secondV = false;
                        break;
                    }
                    if(thirdV && !input.equals(background[i])){
                        win = false;
                        thirdV = false;
                        break;
                    }
                }
                
                
                if(win){
                    System.out.println("NICE ...");
                    firstV = false;
                    secondV = false;
                    thirdV = false;
                    currentRound++;
                }
                else{
                    System.out.println("You got it wrong. Here are the words ");
                    printArray(thirdArray);
                    System.out.println("the colors ");
                    printArray(thirdColors);
                    System.out.println("the background colors ");
                    printArray(background);
                    isActive = false;
                }

 
            }

        }
        else {
            System.out.println("Wrong number, try again.");
        }
    }

    // This method should take in a String array as a parameter and print out each element in the array.
    public static void printArray(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
	}


    // This method can be called to return a random color. This syntax is the correct syntax for the Colors class. 
    public static String getColorWord(){
        int rand = (int)(Math.random()*5);
        switch (rand){
            case 0: return "Purple";
            case 1: return "Red";
            case 2: return "Green";
            case 3: return "Yellow";
            case 4: return "Blue";
            default: return "White";
        }
    }
    

    // This method can be called to delay for a certain number of seconds.
    // The parameter count represents the number of seconds to delay.
    public static void delay(int count){
        for (int i = 0; i < count; i++) {
			System.out.print(count-i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
        }
    }
}






