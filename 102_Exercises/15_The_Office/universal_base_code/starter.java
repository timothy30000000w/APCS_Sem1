/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		Employee walter = new Employee(2940, "Walter", "White", 8000);
		walter.employeeToString();
		
		michael.raiseSalary(40);
		dwight.raiseSalary(50);
		jim.raiseSalary(20);
		pam.raiseSalary(50);
		walter.raiseSalary(100);
		
		
		System.out.println("THE NEW SALARY OF EVERYONE");
		
		System.out.println("Michael's salary");
		System.out.println("salary: " + michael.getSalary());
		System.out.println("Annual salary: " + michael.getAnnualSalary());
		
		
		System.out.println("Dwight's salary");
		System.out.println("salary: " + dwight.getSalary());
		System.out.println("Annual salary: " + dwight.getAnnualSalary());
		
		System.out.println("Jim's salary");
		System.out.println("salary: " + jim.getSalary());
		System.out.println("Annual salary: " + jim.getAnnualSalary());
		
		System.out.println("Pam's salary");
		System.out.println("salary: " + pam.getSalary());
		System.out.println("Annual salary: " + pam.getAnnualSalary());
		
		System.out.println("Walter's salary");
		System.out.println("salary: " + walter.getSalary());
		System.out.println("Annual salary: " + walter.getAnnualSalary());
	}
}
