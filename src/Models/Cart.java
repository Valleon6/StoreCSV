package Models;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> groceryList;

    public Cart(){
       this.groceryList = new ArrayList<>();
    }
    public ArrayList<Product> getGroceryList() {
        return groceryList;
    }
    public void setGroceryList(ArrayList<Product> groceryList) {
        this.groceryList = groceryList;
    }
    public String toString(){
        return "Cart{" + "GroceryList = " + "}";
    }
}
