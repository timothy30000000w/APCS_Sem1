package pkg;
import java.util.*;

public class ShoppingCartItem {
    String itemName;
    double itemCost;
    int quantity;
    
    public ShoppingCartItem(){
        this.itemName = "Nothing";
        this.itemCost = 0.0;
        this.quantity = 0;
    }
    public ShoppingCartItem(String a, double b, int c){
        this.itemName = a;
        this.itemCost = b;
        this.quantity = c;
    }
 
    public void cartToString(){
        System.out.println("You have" + " " + this.quantity + " " + "of" + " " + this.itemName + " " + "for" + " " + this.itemCost + " " + "each.");
    }
    public String getItemName(){
        return this.itemName;
    }
    public double getQuantity(){
        return this.quantity;
    }
    public double getTotalCost(){
        return (this.itemCost * this.quantity);
    }
    public double getTotalWithTax(){
        return (getTotalCost() * 1.12);
    }
    public double quantityToCostCalculator(int a){
        return itemCost * a;
    }
    public boolean compareItemCost(ShoppingCartItem a){
        if (a.itemCost > itemCost){
            return true;
        }
        else {
            return false;
        }
    }
    public ShoppingCartItem copyCart(){
        ShoppingCartItem cart = new ShoppingCartItem(itemName, itemCost, quantity);
        return cart;
    }
    
}

