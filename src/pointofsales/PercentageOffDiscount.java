/*
    This discount strategy gives a percentage off based on the percent and total
    price of the subtotal. 
*/
package pointofsales;

public class PercentageOffDiscount implements DiscountStrategy {
    private double percent;

    //Construcot requires a percentage to be entered
    public PercentageOffDiscount(double percent) {
        this.percent = percent;
    }
    
    @Override
    public double getDiscount(double price, double quantity) {
        return price * quantity * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

 
    

}
