package Models;

import Services.CashierService;

public class Cashier extends Staff implements CashierService {
    private double balance;
    private Product product;

    public Cashier(String name, String staffId, String role) {
        super(name, staffId, role);
    }

    public double getBalance() {
        return balance;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String sellProduct(Cart cart, Customer customer) {
        double balance = 0;
        String message = " ";
        double walletBalance;
        for (Product shopList : cart.groceryList) {
            balance += shopList.getPrice();
            this.balance = balance;
        }

        if(customer.getWallet() > balance){
            walletBalance = customer.getWallet() - balance;
            customer.setWallet(walletBalance);
            message = "Your purchase was successful";
        }else{
            return "Sorry, insufficient balance. Purchase can't be processed.";
        }
        return message;
    }

    @Override
    public String issueReceipt(Cart cart, Customer customer, Product product) {
        String message = "";
        if(customer.getWallet() > balance){
            message = "Product name: " + product.getName() + "\n" + "" + "Product price: "
                    + product.getPrice() + "\n" + "Total Price: " + product.totalPrice();
        }else{
            return "Sorry! Receipt will be issued after purchase";
        }
        return message;
    }
}