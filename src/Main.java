import Models.*;

public class Main {
    public static void main(String[] args) {

        String path = "/Users/smartlink/Desktop/Intellij Projects/Decagon Projects/StoreCSV/src/_FoodSales.csv";

        Manager manager1 = new Manager("John Ucheagwu", "No001", "General Manager");
        Cashier cashier1 = new Cashier("Chisom Ekechukwu", "No002","1st Cashier");
        Cart cart1 = new Cart();
        Product product1 = new Product("Pineapple",700,4);
        Customer customer1 = new Customer("Valentine Ekechukwu", 10000000.50, cart1);
        CSVReader storeCSV = new CSVReader();

        customer1.addToCart(product1);
        customer1.buyProducts(cart1);
        System.out.println(customer1.toString());

        System.out.println();

        storeCSV.getProductList(path);
        System.out.println();
        System.out.println(storeCSV.getProductList(path));


        Store happyBite = new Store();
        Store bigTreat = new Store();
        happyBite.addProductFromCSV(path);

        for (Product product : happyBite.getProductList()){
            System.out.println(product);
        }
        for (Product product : bigTreat.getProductList()) {
            System.out.println(product);
        }
    }
}