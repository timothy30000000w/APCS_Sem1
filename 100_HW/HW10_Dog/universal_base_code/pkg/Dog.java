package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	
	// Set these to private later and call system.out.print using the getters
	private String name;
	private int age;
	private String breed;
	
	public Dog() {
		this.name = "clifford";
		this.age = 3;
		this.breed = "big red dog";
	}
	
	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = "dog dog";
	}
	public Dog(String name, String breed) {
		this.name = name;
		this.age = 1;
		this.breed = breed;
	}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = "dog dog";
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}
	public boolean isSleeping(){
		int randomNum = (int)(Math.random() * 2 + 1);
		if (randomNum == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public void bark(){
		System.out.println(name + " barks!");
	}
	
}
