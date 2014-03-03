package pointofsales;

public class DollarsOffDiscount implements DiscountStrategy {
    private double dollarsOff;


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

    public void setDollarsOff(double dollarsOff) {
        this.dollarsOff = dollarsOff;
    }

 
    

}
