/*
   * Author:
   * Date:
   * Collaborator(s):
*/


import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("use lower case only");
		String x = sc.nextLine(); // bees = ees-bay, gmo = o-gmay, are = are-way
		
	
			
		while (x.indexOf(" ") != -1){ 
			
			int space = x.indexOf(" ");
			
			String word = x.substring(0, space); 
			String first = word.substring(0,1); 
			String second = word.substring(1,2); 
			x = x.substring(space + 1); 
			

			if ((!(first.equals("a")) && !(first.equals("e")) && !(first.equals("i")) && !(first.equals("o")) && !(first.equals("u"))) && ((second.equals("a")) || (second.equals("e")) || (second.equals("i")) || (second.equals("o")) || (second.equals("u")))){
				System.out.println(word.substring(1, word.length()) + "-" + word.substring(0,1) + "ay");
			}
			else if ((!(first.equals("a")) && !(first.equals("e")) && !(first.equals("i")) && !(first.equals("o")) && !(first.equals("u"))) && ((!(second.equals("a")) && !(second.equals("e")) && !(second.equals("i")) && !(second.equals("o")) && !(second.equals("u"))))){
				System.out.println(word.substring(2, word.length()) + "-" + word.substring(0,2) + "ay");
			}
			else if (((first.equals("a")) || (first.equals("e")) || (first.equals("i")) || (first.equals("o")) || (first.equals("u")))){
				System.out.println(word + "-way");
			}
			
		}
		// System.out.println(x);

			// For lastword
			String word = x;
			String first = word.substring(0,1); 
			String second = word.substring(1,2); 
			// System.out.println(word);
			// System.out.println(first);
			// System.out.println(second);
			if ((!(first.equals("a")) && !(first.equals("e")) && !(first.equals("i")) && !(first.equals("o")) && !(first.equals("u"))) && ((second.equals("a")) || (second.equals("e")) || (second.equals("i")) || (second.equals("o")) || (second.equals("u")))){
				System.out.println(word.substring(1, word.length()) + "-" + word.substring(0,1) + "ay");
			}
			else if ((!(first.equals("a")) && !(first.equals("e")) && !(first.equals("i")) && !(first.equals("o")) && !(first.equals("u"))) && ((!(second.equals("a")) && !(second.equals("e")) && !(second.equals("i")) && !(second.equals("o")) && !(second.equals("u"))))){
				System.out.println(word.substring(2, word.length()) + "-" + word.substring(0,2) + "ay");
			}
			else if (((first.equals("a")) || (first.equals("e")) || (first.equals("i")) || (first.equals("o")) || (first.equals("u")))){
				System.out.println(word + "-way");
			}




		
	}
			

			
}
		
		
