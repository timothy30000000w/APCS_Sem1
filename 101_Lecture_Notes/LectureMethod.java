/* 
    Lecture note example - Methods
*/

import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num 1: ");
        int num1 = sc.nextInt();
        System.out.println("num 2: ");
        int num2 = sc.nextInt();
        
        int num1Squared = squared(num1, num2);
        System.out.println(num1Squared);
        
        int num3 = sc.nextInt();
        int numAbsolute = absolute(num3);
        System.out.println(numAbsolute);
    }
	
	public static int squared(int a, int b){
	    return a * a;
    }
    
    public static int absolute(int a){
        if (a < 0){
            return (-1)*(a);
        }
        else
            return a;
    }
}