

package pointofsales;

public class PercentageOffDiscount implements DiscountStrategy {
    private double percent;
    private double price;
    private double quantity;
    
    @Override
    public double getDiscount() {
        return price * quantity * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
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
