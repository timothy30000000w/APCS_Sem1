/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
 while (true){
        System.out.println("Would you like to play? yes/no/done");
        String input = sc.nextLine();
        
        if (input.equals("yes")){
            System.out.println("rock paper or scissor?(MUST BE IN LOWERCASE) ");
            String guess = sc.nextLine(); // input rock paper or scissors
            String botGuess = getObject(); // rock paper or scissors
            System.out.println("this is the bot's guess: " + botGuess);
            int value = compare2(guess, botGuess);
            if (value == 0){
                System.out.println("tie");
            }
            if (value == 1){
                System.out.println("victory");
            }
            if( value == 2){
                System.out.println("lost");
            }
            
        }
        else if (input.equals("no")){
           // input a numu want comp to play itself
           System.out.println("How many times do you want the computer to play itself?");
           int botnum = sc.nextInt();
           sc.nextLine();
           int x = 0;
           int player1Total = 0;
           int player2Total = 0;
           int tieTotal = 0;
           // Generate 2 objects for the computer to play as Player 1 and Player 2
           while (x < botnum){
               String player1 = getObject(); // rockpaper or scissors
               String player2 = getObject(); // rock paper or scissors
               
               int winNum = compare2(player1, player2);
               if (winNum == 1){
                   player1Total += 1;
               }
               else if(winNum == 2){
                   player2Total +=1;
               }
               else {
                   tieTotal += 1;
               }
               
               x+=1;
           }
           //results 
           // Player 1 victory
           System.out.println("Player 1 victory: " + player1Total);
           // player 2 victory
           System.out.println("Player 2 victory: " +player2Total);
           // Player 3 stats
           System.out.println("total tie: " + tieTotal);
           
           
        }
        else if (input.equals("done")){
            return;
        }
        else{
            System.out.println("try again");
        }
    
 }



    }
    
    public static String getObject(){
        int randomNum = (int)(Math.random() * 3 + 1);
        
        if (randomNum == 1){
            return "rock";
        } 
        else if (randomNum == 2){
            return "paper";
        }
        else {
            return "scissor";
        } 
       
    }
    
    public static int compare2(String player, String bot){
            if (player.equals(bot)){
                    return 0;
            }
            // rock against paper
            else if(player.equals("rock") && bot.equals("paper")){
                return 2;
            }
            // rock against scissors
            else if(player.equals("rock") && bot.equals("scissor")){
                return 1;
            }
            // paper against scissors
            else if(player.equals("paper") && bot.equals("scissor")){
                return 2;
            }
            // paper against rock
            else if(player.equals("paper") && bot.equals("rock")){
                return 1;
            }
            // scissor against rock
            else if(player.equals("scissor") && bot.equals("rock")){
                return 2;
            }
            // sicssors against paper
            else if(player.equals("scissor") && bot.equals("paper")){
                return 1;
            }   
            
            return -1;
    }
    

    
}
