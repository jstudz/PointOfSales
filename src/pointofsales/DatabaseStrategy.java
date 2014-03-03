

package pointofsales;

public interface DatabaseStrategy {

    Customer findCustomer(String customerID);

    Product findProduct(String productCode);
    
}
