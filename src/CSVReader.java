import Models.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Product> getProductList(String path) {
        String line = "";
        List<Product> productList = new ArrayList<>();
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                String category = values[3];
                String name = values[4];
                int quantity = Integer.valueOf(values[5]);
                float price = Float.parseFloat(values[6]);
                Product newProduct = new Product(name, price, quantity, category);
                productList.add(newProduct);
//                productList.add(new Product(name, price, quantity, category));
                System.out.println("Category: " + category + " Name: "
                        + name + "Quantity: " + quantity + " Price: " + price);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return productList;
    }
}

