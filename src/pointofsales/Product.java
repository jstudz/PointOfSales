/*
    The product class is where the products are created. It has the price, description
    product code as well as a discount strategy for each product.
*/
package pointofsales;

public class Product {
    private double price;
    private String description;
    private String productCode;
    private DiscountStrategy discoutStrategy;

    //Requires the product to have a price, description, product code, and discount strategy
    public Product(double price, String description, String ProductCode, DiscountStrategy discoutStrategy) {
        this.price = price;
        this.description = description;
        this.productCode = ProductCode;
        this.discoutStrategy = discoutStrategy;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be less than zero");
        } else {
            this.price = price;
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.length() <= 0) {
            System.out.println("Description cannot be empty");
        } else {
            this.description = description;
        }
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String ProductCode) {
        if (productCode == null || productCode.length() <= 0) {
            System.out.println("Product Code cannot be empty");
        } else {
            this.productCode = ProductCode;
        }
    }

    public DiscountStrategy getDiscountStrategy() {
        return discoutStrategy;
    }

    public void setDiscoutStrategy(DiscountStrategy discoutStrategy) {
        this.discoutStrategy = discoutStrategy;
    }
    
    

}
