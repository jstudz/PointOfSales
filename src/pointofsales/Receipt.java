package pointofsales;

public class Receipt {
    private LineItem lineItem;
    private double total = 0;
    private String storeName;
    private double tax;
    
    public double getTotal() {
        
        return total;
    }
    
    public double getTax() {
        return total * .051;
    }
    
    
    public static void main(String[] args) {
        LineItem li = new LineItem(new Product(45, "Hat", "556A", new DollarsOffDiscount(10, 45, 1)));
        System.out.println(li.getSubTotal());
    }
}
