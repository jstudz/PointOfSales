package pointofsales;

public class Product {
    private double price;
    private String description;
    private String ProductCode;
    private DiscountStrategy discoutStrategy;

    public Product(double price, String description, String ProductCode, DiscountStrategy discoutStrategy) {
        this.price = price;
        this.description = description;
        this.ProductCode = ProductCode;
        this.discoutStrategy = discoutStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    public DiscountStrategy getDiscoutStrategy() {
        return discoutStrategy;
    }

    public void setDiscoutStrategy(DiscountStrategy discoutStrategy) {
        this.discoutStrategy = discoutStrategy;
    }
    
    
}
