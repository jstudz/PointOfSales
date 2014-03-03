/*
    All discount classes need the getDiscount method
*/
package pointofsales;

public interface DiscountStrategy {

    double getDiscount(double price, double quantity);
    
}
