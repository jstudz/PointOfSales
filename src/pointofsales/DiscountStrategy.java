package pointofsales;

public interface DiscountStrategy {

    double getDiscount(double price, double quantity);
    
}
