package pointofsales;

public class LineItem {
    private Product product;
    private double subTotal;

    public LineItem(Product product) {
        this.product = product;
    }

    public double getTotal() {
        return getSubTotal() - getDiscountAmount();
    }
    
    //Calculates the Discount Amount whether or not it's a percentage or dollar
    //off
    public double getDiscountAmount () {
        return product.getDiscountStrategy().getDiscount();
    }
    
    //Calculates the Subtotal, gets the quantity from the DiscountStrategy and then
    //the price from the product
    public double getSubTotal() {
        return product.getDiscountStrategy().getQuantity() * product.getPrice();
    }
    
     public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
     
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    //testing the class out
    public static void main(String[] args) {
        LineItem item = new LineItem(new Product(45, "Hat", "556A", new DollarsOffDiscount(10, 45, 1)));
        System.out.println(item.getSubTotal());
        System.out.println(item.getDiscountAmount());
        System.out.println(item.getTotal());
    }
}
