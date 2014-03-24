/*
    All Databases should have at least these two methods in order to help
    find the product and the customer based on product Code and customer ID.
*/

package pointofsales;

public interface DataAccessStrategy {

    Customer findCustomer(String customerID);

    Product findProduct(String productCode);
    
}
