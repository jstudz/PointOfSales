

package pointofsales;

public class FakeDatabase {
    private Product[] products = {
        new Product(15, "Hat", "A123", new DollarsOffDiscount(2)),
        new Product(20, "T-Shirt", "B123", new PercentageOffDiscount(.05)),
        
    };
            
}
