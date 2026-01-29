/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog test = new Dog("jimmothy", 10);
		Dog test2 = new Dog("jimantha", "robot");
		
		///////////////////////
		// don't forget the constructor's name when calling methods
		// test.setName("jimantha");
		// test.setAge(30);
		// test.setBreed("robot");
		// System.out.println(test.getName());
		// System.out.println(test.getAge());
		// System.out.println(test.getBreed());
		///////////////////////
		
		boolean isSleepingDogOne = test.isSleeping();
		boolean isSleepingDogTwo = test.isSleeping();
		// System.out.println(isSleepingDogOne);
		// System.out.println(isSleepingDogTwo);
		if (isSleepingDogOne){
			System.out.println("dog is asleep...");
		}
		else{
			test.bark();
		}
		
		if(isSleepingDogTwo && !isSleepingDogOne){
			test2.bark();
		}
		
		if(!isSleepingDogTwo && !isSleepingDogOne){
			test2.bark();
		}
	}
}
