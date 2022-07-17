package Models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Store {

    public String name;
    ArrayList<Product> groceryList;
    ArrayList<Product> productList;

    public Store() {
        this.productList = new ArrayList<>();
    }

    public Store(ArrayList<Product> groceryList) {
        this.groceryList = groceryList;
    }

    public ArrayList<Product> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<Product> groceryList) {
        this.groceryList = groceryList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public List<Product> productCategory(String category) {
        List<Product> categorisedProducts = new ArrayList<>();
        for (Product product : productList) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                categorisedProducts.add(product);
            }
        }
        return categorisedProducts;
    }
    public void addProductFromCSV(String path) {
        String line = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                if (findProduct(values[4]) < 0) { /* If not found create, else modify*/
                    String category = values[3];
                    String name = values[4];
                    int quantity = Integer.valueOf(values[5]);
                    Double price = Double.parseDouble(values[6]);
                    Product newProduct = new Product(name, price, quantity, category);
                    productList.add(newProduct);
                } else {
                    int productIndex = findProduct(values[4]);
                    Product product = this.productList.get(productIndex);
                    product.setQuantity(product.getQuantity() + Integer.parseInt(values[5]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //returns the index of the product in arrayList
    public int findProduct(String productName) {
        for (Product product : this.productList) {
            if (productName.equalsIgnoreCase(product.getName())) {
                return this.productList.indexOf(product);
            }
        }
        return -1;
    }
}
