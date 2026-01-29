/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
				// Your code goes below here
		BankAccount a = new BankAccount();
		BankAccount b = new BankAccount("Walter White");
		BankAccount c = new BankAccount("Jesse Pinkman", 230670.41);

		a.displayAccountInfo();
		b.displayAccountInfo();
		c.displayAccountInfo();
		System.out.println();

		System.out.println("----------ACCOUNT 1 ACTIONS----------");
		a.setOwner("Mike Ehrmantraut");
		a.deposit(50325.58);
		System.out.println("The new owner of account a is " + a.getOwner());
		System.out.println("The account balance of " + a.getOwner() + "'s account is " + a.getBalance());
		System.out.println();

		System.out.println("----------ACCOUNT 2 ACTIONS----------");
		System.out.println(b.getOwner() + " is trying to withdraw $50000");
		b.withdraw(50000);
		System.out.println();

		System.out.println("----------ACCOUNT 3 ACTIONS----------");
		System.out.println(c.getOwner() + " is trying to withdraw $" + c.getBalance());
		c.withdraw(c.getBalance());
		c.checkBalance();
		c.closeAccount();
		c.deposit(1);
		
		// Scanner sc = new Scanner(System.in);
		
		// BankAccount a = new BankAccount();
		// BankAccount b = new BankAccount("Bob");
		// BankAccount c = new BankAccount("Hank", 1000);
		// BankAccount d = new BankAccount("Tim", 30.50);
		
		// System.out.println("all bank info ----------------------------");
		
		// a.setOwner("Timmy"); // mutatator for name
		// System.out.println(a.getOwner()); // acessor for name
		// System.out.println(a.getBalance()); // acessor for balance
		// // a.isActive(); // false
		// // System.out.println(isActive);
		// a.deposit(50.4); 
		// a.withdraw(50.0);
		// a.displayAccountInfo();
		
		// System.out.println("balance info ONLY ------------------------");
		// a.checkBalance();
		
		// System.out.println("all bank info ----------------------------");
		// b.displayAccountInfo();
		// System.out.println("balance info ONLY ------------------------");
		// b.checkBalance();
		
		// System.out.println("all bank info ----------------------------");
		// c.displayAccountInfo();
		// System.out.println("balance info ONLY ------------------------");
		// c.checkBalance();
		
		// System.out.println("all bank info ----------------------------");
		// d.displayAccountInfo();
		// System.out.println("balance info ONLY ------------------------");
		// d.checkBalance();
		
		// // FUNCTIONSS ---------------------------------------------------
		// // Create a Bank Account 3 different ways
		// System.out.println("--------------------------------------------");
		// System.out.println("Input an integer");
		// System.out.println("1 = no info, 2 = name only, 3 = name and initial deposit");
		// int num = sc.nextInt();
		// sc.nextLine();
		
		// BankAccount createdAccount = new BankAccount(); // Declare a default value NOT BankAccount createdAccount;
		
		// if (num == 1){

		// 	createdAccount = new BankAccount();
		// 	// createdAccount.displayAccountInfo();
		// }
		// else if (num == 2){
		// 	System.out.println("name ? ");
		// 	String name = sc.nextLine();
		// 	createdAccount = new BankAccount(name);
		// 	// createdAccount.displayAccountInfo(); 
		// }
		// else if (num == 3){
		// 	System.out.println("name ? ");
		// 	String name = sc.nextLine();
		// 	System.out.println("deposit ? (double)");
		// 	double deposit = sc.nextDouble();
		// 	createdAccount = new BankAccount(name, deposit);
		// 	// createdAccount.displayAccountInfo(); 
		// }
		// else{
		// 	System.out.println("error");
		// }
		
		// System.out.println("--------------------------------------------");
		// System.out.println("Would you like to check the balance?");
		// System.out.println("1 = yes ofc, 2 = no");
		// int userBalance = sc.nextInt();
		// sc.nextLine();
		// if (userBalance == 1){
		// 	createdAccount.checkBalance();
		// }
		// else if (userBalance == 2){
		// 	System.out.println("okay");
		// }
		// else {
		// 	System.out.println("consider the next question ... ");
		// }
		
		// System.out.println("--------------------------------------------");
		// System.out.println("Would you like to check all info?");
		// System.out.println("1 = yes, 2 = no");
		// int userAllInfo = sc.nextInt();
		// sc.nextLine();
		// if (userAllInfo == 1){
		// 	createdAccount.displayAccountInfo();
		// }
		// else if (userAllInfo == 2){
		// 	return;
		// }
		// else {
		// 	System.out.println("bye");
		// }
		
	}
}
