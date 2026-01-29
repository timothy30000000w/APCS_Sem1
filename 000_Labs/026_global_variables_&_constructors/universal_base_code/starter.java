/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		
		// //THIS IS LAB 26		
		
		
		
		// Your code goes below here
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Bob");
		BankAccount c = new BankAccount("Hank", 1000);
		BankAccount d = new BankAccount("Tim", 30.50);
		System.out.println("-----");
		a.printInfo();
		System.out.println("-----");
		b.printInfo();
		System.out.println("-----");
		c.printInfo();
		System.out.println("-----");
		d.printInfo();
	}
}
