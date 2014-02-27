

package pointofsales;

public class NoDiscount implements DiscountStrategy {
    
    @Override
    public double getDiscount(double price, double quantity) {
        return 0;
    }
}
