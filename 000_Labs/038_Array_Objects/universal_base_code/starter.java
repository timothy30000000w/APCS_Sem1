/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		// create the wizard/warror obect
		Wizard [] wizard = new Wizard[100];
		Warrior [] warrior = new Warrior[100];
		
		int i = 0;
		// Wizard x = new Wizard();
		
		while (i < wizard.length){
			
			wizard[i] = new Wizard();;
			i++;
		}
		
		System.out.println(wizard[1].getName());
		System.out.println(wizard[5].getHealth());
		System.out.println(wizard[95].getHealth());
		
		int z = 0;
		
		while (z < warrior.length){
			
			warrior[z] = new Warrior();;
			z++;
		}
		
		System.out.println(warrior[1].getName());
		System.out.println(warrior[5].getHealth());
		System.out.println(warrior[95].getHealth());

		System.out.println("-----------------------");
		System.out.println("-----------------------");
		System.out.println("WARR");
		
		int currentIndexWizard = 0;
		int currentIndexWarrior = 0;
		boolean warIsOver = false;

		
		while (true) {
		
		// current index wizard attacks current index warrior
		wizard[currentIndexWizard].attack(warrior[currentIndexWarrior]);

	
		if(warrior[currentIndexWarrior].isDead()){
			currentIndexWarrior++;
			
		}
		if (wizard[99].isDead() || warrior[99].isDead()){
			warIsOver = true;
			break;
		}
		if(!warrior[currentIndexWarrior].isDead()){
			warrior[currentIndexWarrior].attack(wizard[currentIndexWizard]);
		}
		if (wizard[currentIndexWizard].isDead()){
			currentIndexWizard++;
			// wizard[currentIndexWizard + 1];
		}
		
		if (wizard[99].isDead() || warrior[99].isDead()){
			warIsOver = true;
			break;
		}
		
		
		}
		
		System.out.println("-----------------------");
		System.out.println("-----------------------");
		System.out.println("AFTERMATHH");
		
		int index2= 0;
		int survivedWizards = 0;
		int survivedWarriors = 0;
		
		while (warIsOver){
			if (wizard[index2].getHealth() > 0){
				survivedWizards ++;
			};
			
			if (warrior[index2].getHealth() > 0){
				survivedWarriors ++;
			};

			index2++;
			
			if(index2 == 100){
				break;
			}
			
		}
		
		System.out.println("The survived wizards: " + survivedWizards);
		System.out.println("The survived warriors: " + survivedWarriors);
		
		
		
		
	}
}
