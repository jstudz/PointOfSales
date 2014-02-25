

package pointofsales;

public interface DiscountStrategy {

    double getDiscount();


    double getPrice();

    double getQuantity();

    void setPrice(double price);

    void setQuantity(double quantity);
    
}
