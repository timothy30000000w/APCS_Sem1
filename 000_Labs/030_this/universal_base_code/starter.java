/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	// return string
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		int randomAge = (int)(Math.random()*7);
		PooleDwarf test = new PooleDwarf(randName(), randomAge);
		System.out.println(test.getName());
		// System.out.println(test.getAge());
		// System.out.println(test.isSameName("Dopey"));
		// System.out.println(test.isSameName("Bashful"));
		// System.out.println(test.isSameName("Grumpy"));
		
		PooleDwarf test2 = new PooleDwarf(randName(), randomAge);
		PooleDwarf test3 = new PooleDwarf(randName(), randomAge);
		PooleDwarf test4 = new PooleDwarf(randName(), randomAge);
		PooleDwarf test5 = new PooleDwarf(randName(), randomAge);
		PooleDwarf test6 = new PooleDwarf(randName(), randomAge);
		PooleDwarf test7 = new PooleDwarf(randName(), randomAge);
		System.out.println(test2.getName());
		System.out.println(test3.getName());
		System.out.println(test4.getName());
		System.out.println(test5.getName());
		System.out.println(test6.getName());
		System.out.println(test7.getName());
		
		
		int totalDuplicates = 0;
		
		if (test.isSameName(test2.getName())){
			
			totalDuplicates = totalDuplicates + 1;
			System.out.println(totalDuplicates);
		}
		if (test.isSameName(test3.getName())){
			
			totalDuplicates = totalDuplicates + 1;
			
		}
		if (test.isSameName(test4.getName())){
			
			totalDuplicates = totalDuplicates + 1;

		}
		if (test.isSameName(test5.getName())){
			
			totalDuplicates = totalDuplicates + 1;
		
		}
		if (test.isSameName(test6.getName())){
			
			totalDuplicates = totalDuplicates + 1;
		
		}
		if (test.isSameName(test7.getName())){
			
			totalDuplicates = totalDuplicates + 1;
		
		}
		System.out.println("The total amount of duplicates: " + totalDuplicates);

	
		
	}
}
