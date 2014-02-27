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

 
    
    //testing class
//    public static void main(String[] args) {
//        DollarsOffDiscount dod = new DollarsOffDiscount(10, 20, 3);
//        System.out.println(dod.getDiscount());
//    }
}
