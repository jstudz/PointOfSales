

package pointofsales;

public class DollarsOffDiscount implements DiscountStrategy {
    private double dollarsOff;
    private double price;
    private double quantity;
    
    @Override
    public double getDiscount() {
        return dollarsOff;
    }

    public double getDollarsOff() {
        return dollarsOff;
    }

    public void setDollarsOff(double dollarsOff) {
        this.dollarsOff = dollarsOff;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    
}
