package pointofsales;

public class Receipt {
    private LineItem[] lineItem;
    private double total = 0;
    private String storeName;
    private double tax;
    
    public double getTotal() {
        return total;
    }
    
    public double getTax() {
        return total * .051;
    }
}
