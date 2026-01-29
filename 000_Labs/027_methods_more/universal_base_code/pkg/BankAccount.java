/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
// -------GLOBAL VARIABLES-------
	private String owner;
	private int accountNumber;
	private	double balance;
	private boolean isActive; 
	private static int nextAccountNumber = (int)(Math.random() * 950 + 50); // IMP: Next account number is static but after it assigns values it will function like normal
	// -------CONSTRUCTORS-------
	
	public BankAccount(){
		owner = "Unknown";
		accountNumber = nextAccountNumber;
		balance = 0.0;
		isActive = true;
		nextAccountNumber = nextAccountNumber + 1;
		
	}
	
	public BankAccount(String x){
		owner = x;
		accountNumber = nextAccountNumber;
		balance = 0.0;
		isActive = true;
		nextAccountNumber = nextAccountNumber + 1;
		
	}
	
	public BankAccount(String x, double y){
		owner = x;
		accountNumber = nextAccountNumber;
		balance = y;
		isActive = true;
		nextAccountNumber = nextAccountNumber + 1;
	}
	
	
	// -------METHODS-------
	public void checkBalance(){
		System.out.println(balance);
	}
	// GETTER METHOD
	// public void deleteOwner(){
	// 	this.owner = "DeletedAccount";
	// }
	// ACESSOR METHOD
	// public String returnOwner(){
	// 	return this.owner;
	// }
	
	public void displayAccountInfo(){
		System.out.println("This is the owner: " + owner);
		System.out.println("This is the account number: " + accountNumber);
		System.out.println("This is the balance: " + balance);
		System.out.println("This is the isActive: " + isActive);
		System.out.println("This is the nextAccountNumber: " + nextAccountNumber);
	}


}