/*
    The LineItem class is the class for each item the customer purchases. This 
    class inclused the product which has a description, product code, price and
    discount strategy. This class will give a subtotal as well.
*/
package pointofsales;

public class LineItem {
    private Product product;
    private double quantity;
    
    //Overrode the default constructor the make sure there is a product and
    //quantity being entered
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
    

}
