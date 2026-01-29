/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
    double item1price = 10.50;
    double item2price = 20.50;
    double item3price = 50.50;
        
    System.out.println("Welcome to my egg market");
    System.out.println("Here's our menu");
    System.out.println("1. 🥚 Hard Boiled egg - $" + item1price);
    System.out.println("2. 🍳 Cooked egg - $" + item2price);
    System.out.println("3. 🥚 Rare Hard Boiled egg - $" + item3price);
    
    System.out.println();
    System.out.println("How many hard boiled eggs would you want?");
    int quant1 = sc.nextInt();
    sc.nextLine();
    System.out.println("How many cooked eggs would you want?");
    int quant2 = sc.nextInt();
    sc.nextLine();
    System.out.println("How many rare hard boiled eggs would you want?");
    int quant3 = sc.nextInt();
    sc.nextLine();
    
    
    System.out.println("What's the name for the order?");
    String name = sc.nextLine();
    
    System.out.println();
    // double total1 = (quant1*item1price) + (quant2*item2price) + (quant3*item3price) ;
    double total1 = item1price * quant1;
    double total2 = item2price * quant2;
    double total3 = item3price * quant3;
    double total = total1 + total2 + total3;
    System.out.println("Your total quantity is: " + total);
    System.out.println("What percent would you like to tip?");
    double tipPercent = sc.nextDouble();
    
    double tip = total * (tipPercent / 100); // total = double * (tipPercent = double / 100 = int)
    double grandTotal = tip + total;
    
    System.out.println();
    System.out.println(name + "Your Recepit:");
    System.out.println(quant1 + " x " +"Hard Boiled egg" + " = " + total1);
    System.out.println(quant2 + " x " +"Cooked egg" + " = " + total2);
    System.out.println(quant3 + " x " +"Rare Hard Boiled egg" + " = " + total3);
    System.out.println("Tip(" +tip + "%) = " + tip);
    System.out.println("----------------------");
    System.out.println("Total = $" + grandTotal);
    System.out.println("----------------------");
    System.out.print("come back again");
	}
}
