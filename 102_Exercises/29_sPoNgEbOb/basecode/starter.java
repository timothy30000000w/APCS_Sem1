/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sent = sc.nextLine();
		
		while(sent.indexOf(" ") != -1){
			String word = sent.substring(0, sent.indexOf(" "));
			System.out.print(spongeWord(word) + " ");
			sent = sent.substring(sent.indexOf(" ") +1);
		}
		
		System.out.print(spongeWord(sent));
	

	
		
	}	
	
	public static String spongeWord(String sent){
		
		String ans = " ";
		for(int i = 0; i < sent.length(); i++){
		String letter = sent.substring(i, i+1);
		if (i % 2 == 0){
			letter = letter.toLowerCase();
		}
		else{
			letter = letter.toUpperCase();
		}
		
		ans = ans + letter;
		}
		
		return ans;
		
	}

}


	// for (int i = 0; i < word.length(); i++){
	// 	// String word;
	// 		// if (word.substring(i,i+1).equals(" ")){
	// 		// 	System.out.println("index for space" + i);	
	// 		// 	continue;
	// 		// }
	// 		if(i % 2 == 0){
	// 			word.substring(i,i+1) = word.substring(i,i+1).toUpperCase();
	// 		}
	// 		if(i % 2 == 1){
	// 			word.substring(i,i+1) = word.substring(i,i+1).toLowerCase();
	// 		}
			
	// 	}
	// 	System.out.println(word);
		
		
	
	// }
	
	
	
	// private static String test(String sentence){
		
		
	// 	for (int i = 0; i < sentence.length(); i++){
	// 		if (sentence.substring(i,i+1).equals(" ")){
	// 			System.out.println("index for space" + i);	
	// 			continue;
	// 		}
	// 		if(i % 2 == 0){
	// 			System.out.println(i);
	// 			System.out.println(i+1);
	// 			sentence.substring(i,i+1).toUpperCase();
	// 		}
	// 	}
		
	// 	return sentence;
	
	// }
// }
