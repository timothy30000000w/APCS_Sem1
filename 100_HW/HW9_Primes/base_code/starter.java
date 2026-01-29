	/*
	 *	Author:
	 *  Date:
	*/
	import java.util.Scanner;
	
	class starter {
		public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int maxNum = sc.nextInt();
		printPrimes(maxNum);
		}
		
		
		
		
		// method 1
		public static boolean checkPrime(int y){ // false = not a prime, true = a prime
			if (y <= 1){
				return false;
			}
			int initial = 2;
			while (initial < y){ // 2 < 2 is false so return true outside.. 
				if (y % initial == 0){
					return false;
				}
				initial = initial + 1; // This increment must be initial or no other way to break out. 
			}
			return true;
		}
		
		
		// method 2
		public static void printPrimes(int x){ // start with this first
			int y = 2;
			while (y < x){ // e.g 2 < 20
			if (checkPrime(y)){ // jump to method 1 
				System.out.println(y);
			}
			y = y + 1;
			}
			
		}
	
	}
			
		
		
		
		
		
		
		
		
		
		
			
			
	

	
