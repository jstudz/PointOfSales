

package pointofsales;

public interface DatabaseStrategy {

    Customer findCustomer(int customerID);

    Product findProduct(String productCode);
    
}
