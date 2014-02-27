package pointofsales;

public class LineItem {
    private Product product;
    private double quantity;

    public LineItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //Calculates the Discount Amount whether or not it's a percentage or dollar
    //off
    public double getDiscountAmount () {
        return product.getDiscountStrategy().getDiscount(product.getPrice(), quantity);
    }
    
    //Calculates the Subtotal, gets the quantity from the DiscountStrategy and then
    //the price from the product
    public double getSubTotal() {
        return quantity * product.getPrice();
    }
     
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
     public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    //testing the class out
//    public static void main(String[] args) {
//        LineItem item = new LineItem(new Product(45, "Hat", "556A", new DollarsOffDiscount(10)), 2);
//        System.out.println(item.getSubTotal());
//        System.out.println(item.getDiscountAmount());
//        
//    }
}
