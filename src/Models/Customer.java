package Models;

import Services.CustomerService;

public class Customer implements CustomerService {
    private String name;
    private double wallet;
    private Cart cart;
    private Product product;

    public Customer(String name, double wallet, Cart cart) {
        this.name = name;
        this.wallet = wallet;
        this.cart = cart;
    }
    public String getName() {
        return name;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    public Cart getCart() {
        return cart;
    }

    public Product getProduct() {
        return product;
    }

    public void addToCart(Product productToBeAdded) {
        //Add to Cart
        cart.groceryList.add(productToBeAdded);
        System.out.println(cart.groceryList);
    }

    public String buyProducts(Cart cart) {
        // Loop through your cart
        double total = 0;
        String message = "";
        for (Product a : cart.groceryList) {
            total = total + a.totalPrice();
        }
        //Check Customers Wallet balance
        if(this.wallet > total){
            this.wallet -= total;
            System.out.println("You bought: " + cart.groceryList + ". Your total purchase cost is N" + total
                    + ". Your new balance is now: " + this.wallet);
            message = "Purchase Successful.";
        }else {
            message = "Insufficient Balance.";
        }
        return message;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                ", cart=" + cart +
                ", product=" + product +
                '}';
    }
}
