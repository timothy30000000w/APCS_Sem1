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
		System.out.println(this.balance);
	}
	// acessor
	public String getOwner(){
		return this.owner;
	}
	public double getBalance(){
		return this.balance;
	}
	
	
	// mutator
	public void setOwner(String x){
		this.owner = x;
	}
	public void closeAccount(){
		this.owner = "Deleted";
		this.accountNumber = 0;
		this.balance = 0.0;
		this.isActive = false;
		this.nextAccountNumber = 0;
	}
	public void isActive(){
		if (this.isActive){
			this.isActive = false;
		}
		else{
			this.isActive = true;
		}
	}
	
	public void deposit(double x){
		if(this.isActive){
			this.balance += x;
		}
		else{
			System.out.println("account not active");
		}
	}
	
	public void withdraw(double x){
		if(this.isActive && this.balance >= x){
			this.balance -= x;
		}
		else {
			System.out.println("account not active or not enough money");
		}
	}
	
	
	public void displayAccountInfo(){
		System.out.println("This is the owner: " + owner);
		System.out.println("This is the account number: " + accountNumber);
		System.out.println("This is the balance: " + balance);
		System.out.println("This is the isActive: " + isActive);
		System.out.println("This is the nextAccountNumber: " + nextAccountNumber);
	}


}