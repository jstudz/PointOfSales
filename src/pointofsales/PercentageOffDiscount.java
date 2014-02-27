package pointofsales;

public class PercentageOffDiscount implements DiscountStrategy {
    private double percent;

    public PercentageOffDiscount(double percent) {
        this.percent = percent;

    }
    
    public double getDiscount(double price, double quantity) {
        return price * quantity * percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

 
    
    //testing the class
//    public static void main(String[] args) {
//        PercentageOffDiscount pod = new PercentageOffDiscount(.10, 20, 2);
//        System.out.println(pod.getDiscount());
//    }
}
