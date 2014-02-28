

package pointofsales;

public class FakeDatabase implements DatabaseStrategy {
    private Product[] products = {
        new Product(14.99, "Green Bay Packer's Hat", "A111", new DollarsOffDiscount(2)),
        new Product(21.99, "Iron Man T-Shirt", "B222", new PercentageOffDiscount(.05)),
        new Product(29.99, "Jeans", "C333", new PercentageOffDiscount(.10)),
        new Product(34.99, "Hoodie", "D444", new NoDiscount()),
        
    };
    
    private Customer[] customers = {
        
    };
    
    
    @Override
    public Product findProduct(String productCode) {
        Product product = null;
        
        for (Product p : products) {
            if (productCode.equals(p.getProductCode())) {
                product = p;
                break;
            }
                
        }
        return product;
    }
    
    @Override
    public Customer findCustomer(int customerID) {
        Customer customer = null;
        
        return customer;
    }
}
