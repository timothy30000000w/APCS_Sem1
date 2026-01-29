/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	// Spiderman a = new Spiderman("tim");
	// System.out.println(a.getSpiderman());
	// Spiderman b = new Spiderman();
	// System.out.println(b.getSpiderman());
	// Spiderman c = new Spiderman(20);
	// System.out.println(c.getSpiderman());
	// Spiderman d = new Spiderman("timothy", 20);
	// System.out.println(d.getSpiderman());
	
	Spiderman a = new Spiderman("walter", 30, "gus");
	System.out.println(a.getSpiderman());
	Spiderman a1 = new Spiderman("hank", 40, "walter");
	System.out.println(a1.getSpiderman());
	Spiderman a2 = new Spiderman("saul", 40, "gus");
	System.out.println(a2.getSpiderman());
	Spiderman a3 = new Spiderman("jessie", 15, "walter");
	System.out.println(a3.getSpiderman());
	Spiderman b = new Spiderman("Tobey Maguire", 48, "Green Goblin");
	System.out.println(b.getSpiderman());	
	Spiderman c = new Spiderman("Andrew Garfield", 40, "Garfield");
	System.out.println(c.getSpiderman());	
	Spiderman d = new Spiderman("Tom Holland", 27, "The vulture");
	System.out.println(d.getSpiderman());	
	

	// Get and set methods
	//	Spiderman b = new Spiderman("Tobey Maguire", 48, "Green Goblin");
	// System.out.println(b.getSpiderman());	
	// b.setHeroName("Tobey Maguire");
	// System.out.println(b.getHeroName());
	// b.setAge(1);
	// System.out.println(b.getAge());
	// b.setVillain("aquaman");
	// b.getVillain();
	
	}
}
