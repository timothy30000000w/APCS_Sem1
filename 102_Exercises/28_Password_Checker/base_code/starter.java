import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt"); // store array			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text); 		// Scanner for counting number of lines
        Scanner sc = new Scanner(text);				// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; // count = 1,000,000
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		
// 		System.out.println(passwords[3]);
        // int i = 0;
        // System.out.println("Results");
   
        
       
        
        int strength1 = 0;
        int strength2 = 0;
        int strength3 = 0;
        int none = 0;
        int counter = 0;
        
        
        for(counter = 0; counter < passwords.length; counter++){
            if(passwords[counter].length() >= 8 && (passwords[counter].contains("!") || passwords[counter].contains("@") || passwords[counter].contains("#") || passwords[counter].contains("$") || passwords[counter].contains("%") || passwords[counter].contains("^") || passwords[counter].contains("&") || passwords[counter].contains("*"))){
                strength3++;
            }
            else if(passwords[counter].length() >= 8) {
                strength1 ++;
            }
            else if(passwords[counter].contains("!") || passwords[counter].contains("@") || passwords[counter].contains("#") || passwords[counter].contains("$") || passwords[counter].contains("%") || passwords[counter].contains("^") || passwords[counter].contains("&") || passwords[counter].contains("*")){
                strength2++;
            }
        }
        
        System.out.println(strength1);
        System.out.println(strength2);
        System.out.println(strength3);
        System.out.println(passwords.length-strength1-strength2-strength3);
        // System.out.println(passwords.length);
        
        // while (counter < passwords.length){
        //     if (passwords[counter].length() >= 8){
        //         strength1++;
                
        //     }
            
        //     if (passwords[counter].contains("!") || passwords[counter].contains("@") || passwords[counter].contains("#") || passwords[counter].contains("$") || passwords[counter].contains("%") || passwords[counter].contains("^") || passwords[counter].contains("&") || passwords[counter].contains("*")){
        //         strength2++;
                
        //     }

        //     if ((passwords[counter].length() > 8 && passwords[counter].contains("!") || passwords[counter].contains("@") || passwords[counter].contains("#") || passwords[counter].contains("$") || passwords[counter].contains("%") || passwords[counter].contains("^") || passwords[counter].contains("&") || passwords[counter].contains("*")){
        //         strength3++;
        //     }


        //     if (!(passwords[counter].length() >= 8) && !(passwords[counter].contains("!") || passwords[counter].contains("@") || passwords[counter].contains("#") || passwords[counter].contains("$") || passwords[counter].contains("%") || passwords[counter].contains("^") || passwords[counter].contains("&") || passwords[counter].contains("*"))){
        //         none++;
        //     }
            
        //     counter++;
        // }

        // System.out.println(strength1);
        // System.out.println(strength2);
        // System.out.println(strength3);
        // System.out.println(none);
		
        
	}
}
