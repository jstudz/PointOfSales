package pointofsales;

public class LineItem {
    private Product product;
    private double subTotal;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getSubTotal() {
        return product.getDiscoutStrategy().getQuantity() * product.getPrice();
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    
}
