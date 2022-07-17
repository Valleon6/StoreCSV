package Services;

import Models.Cart;
import Models.Customer;
import Models.Product;

public interface CashierService {
    String sellProduct(Cart cart, Customer customer);
    String issueReceipt(Cart cart, Customer customer, Product product);
}
