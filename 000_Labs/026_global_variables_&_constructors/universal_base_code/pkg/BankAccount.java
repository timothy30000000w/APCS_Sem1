/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount{
	
	
	//THIS IS LAB 26
	
	
	
	
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
	public void printInfo(){
		System.out.println(owner);
		System.out.println(accountNumber);
		System.out.println(balance);
		System.out.println(isActive);
		System.out.println(nextAccountNumber);
	}

}