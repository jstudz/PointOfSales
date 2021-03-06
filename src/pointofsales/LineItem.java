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

    //cannot be null
    public void setProduct(Product product) throws IllegalArgumentException{
        
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        } else {
            this.product = product;
        }
    }
    
     public double getQuantity() {
        return quantity;
    }

    //cannot be less than zero
    public void setQuantity(double quantity) throws IllegalArgumentException{
        
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity can never be less than 0, please reenter the quantity");
        } else {
            this.quantity = quantity;
        }
        
    }
    

}
