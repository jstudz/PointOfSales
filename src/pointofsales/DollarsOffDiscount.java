/*
    This discount strategy is the dollars off discount. A certain dollar amount
    is discounted from the product.
*/
package pointofsales;

public class DollarsOffDiscount implements DiscountStrategy {
    private double dollarsOff;

    
    //Default constructor, requires the dollar amount to be entered.
    public DollarsOffDiscount(double dollarsOff) {
        this.dollarsOff = dollarsOff;
    }
    
    @Override
    public double getDiscount(double price, double quantity) {
        return dollarsOff;
    }

    public double getDollarsOff() {
        return dollarsOff;
    }

    public void setDollarsOff(double dollarsOff) throws IllegalArgumentException {
        
        if (dollarsOff <= 0) {
            throw new IllegalArgumentException("Dollars off cannot be less than or equal to 0");
        } else {
            this.dollarsOff = dollarsOff;
        }
    }

 
    

}
