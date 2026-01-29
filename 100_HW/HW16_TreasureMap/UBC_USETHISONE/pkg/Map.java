package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	public Map(int row, int column){
		
		map = new int [row][column];
		for (int i = 0; i < map.length; i++){
			for (int j = 0; j < map[0].length; j++){
				map[i][j] = 0;
				posX = 0;
				posX = 0;
				map[posX][posY] = 2;
				
			}
		}
		
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		// System.out.println(map.length);
		// System.out.println(map[0].length);
		int randomRow = (int)(Math.random() * map.length);
		int randomColumn = (int)(Math.random() * map[0].length);
		// Delete this later
		System.out.println("(FOR Mr.Poole) coordinates for the treasure:");
		System.out.println("row " + randomRow);
		System.out.println("column " + randomColumn);
		treasureX = randomRow;
		treasureY = randomColumn;

		
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		
		
		if (m == 1){
			// up
			// 1) move
			int newX = posX - 1;
			int newY;
			// 2) Out of bounds?
			if (newX < 0 || newX >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posX = newX;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if (m == 2){
			// down
			// 1) move
			int newX = posX + 1;
			int newY;
			// 2) Out of bounds?
			if (newX < 0 || newX >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posX = newX;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if(m == 3){
			// left
			// 1) move
			int newX;
			int newY = posY - 1;
			// 2) Out of bounds?
			if (newY < 0 || newY >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posY = newY;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if(m == 4){
			// right
			// 1) move
			int newX;
			int newY = posY + 1;
			// 2) Out of bounds?
			if (newY < 0 || newY >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posY = newY;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if(m == 5){
			// left up
			// 1) move
			int newX = posX - 1;
			int newY = posY - 1;
			// 2) Out of bounds?
			if (newX < 0 || newX >= map.length || newY < 0 || newY >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posX = newX;
			posY = newY;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if(m == 6){
			// right up
			// 1) move
			int newX = posX - 1;
			int newY = posY + 1;
			// 2) Out of bounds?
			if (newX < 0 || newX >= map.length || newY < 0 || newY >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posX = newX;
			posY = newY;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if(m == 7){
			// left down
			// 1) clear old position if 2
			// 1) move
			int newX = posX + 1;
			int newY = posY - 1;
			// 2) Out of bounds?
			if (newX < 0 || newX >= map.length || newY < 0 || newY >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posX = newX;
			posY = newY;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
		}
		if(m == 8){
			// right down
			// 1) move
			int newX = posX + 1;
			int newY = posY + 1;
			// 2) Out of bounds?
			if (newX < 0 || newX >= map.length || newY < 0 || newY >= map.length){
				return false;
			}
			// 3) before move
			if (map[posX][posY] == 3){
				map[posX][posY] = 1;
			} else{
				map[posX][posY] = 0;
			}
			// 4) Update the position
			posX = newX;
			posY = newY;
			// 5) after move
			if (map[posX][posY] == 1){
				map[posX][posY] = 3;
			} else {
				map[posX][posY] = 2;
			}
			
			// // 1) clear old positions
			// if(map[posX][posY] == 3){
			// 	map[posX][posY] = 1;
			// }
			// else if(map[posX][posY] == 2){
			// map[posX][posY] = 0;
			// }
			// // 2) Move
			// int newX = posX + 1;
			// int newY = posY + 1;
			// // 3) Out of bounds?
			// if (newX < 0 || newX >= map.length || newY < 0 || newY >= map.length){
			// 	return false;
			// }
			// // 4) Update value
			// posX = newX;
			// posY = newY;
			
			// // 5) Display 2 or 3
			// if ((map[posX][posY]) == 1){
			// map[posX][posY] = 3;
			
			// }
			// else{
			// map[posX][posY] = 2;	
			// }
	
		}

		// printMap();
		return true;	// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){

		// 1) clear old position if 2
		if(map[posX][posY] == 3){
			map[posX][posY] = 1;
		}
		else if(map[posX][posY] == 2){
		map[posX][posY] = 0;
		}
		// 2) Move
		int newX = row;
		int newY = col;
		// 3) Out of bounds?
		if (newX < 0 || newX >= map.length || newY < 0 || newY >= map.length){
			return false;
		}
		// 4) Update value
		posX = newX;
		posY = newY;
			
		// 5) Display 2 or 3
		if ((map[posX][posY]) == 1){
		map[posX][posY] = 3;
		
		}
		else{
		map[posX][posY] = 2;	
		}		

		// printMap();

		return true;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
		if(map[posX][posY] == map[treasureX][treasureY]){
			map[posX][posY] = 5;
			// printMap();
			return true;
		}
		
		if(map[posX][posY] == 2) {
			map[posX][posY] = 3;
		}
		else if(map[posX][posY] == 0){
			map[posX][posY] = 1;
			// printMap();
			
		}
		return false;
			// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		System.out.println("The treasure was at " + treasureX + "," + treasureY);

	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
		for (int i = 0; i < map.length; i++){
			System.out.print("| ");
			for (int j = 0; j < map[0].length; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
		}
	}

}
