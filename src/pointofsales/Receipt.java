/*
    The receipt class is used to create the receipt based on the line item class.
    
*/
package pointofsales;

import java.text.DecimalFormat;

public class Receipt {
    private LineItem[] lineItem = new LineItem[0];
    private Customer customer;
    private DataAccessStrategy newDB;
    private SalesTaxStrategy salesTax;
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    
    //This consturctor uses the customerID to find the customer through the
    //database the user chooses to use.
    public Receipt(String customerID, DataAccessStrategy newDB,SalesTaxStrategy salesTax ) {
        this.customer = newDB.findCustomer(customerID);
        this.newDB = newDB;
        this.salesTax = salesTax;
    }
    
    //This method takes the product that the customer is buying and adds it
    //to the line item array. A temporary database is created in order to
    //copy the array over and increase the size for every item that is being
    //purcahsed
    public void addItemToSaleList(String productCode, double quantity) {
       LineItem li = new LineItem(newDB.findProduct(productCode), quantity );
       
       LineItem[] tempItemList = new LineItem[1 + lineItem.length];
       
       System.arraycopy(lineItem, 0, tempItemList, 0, lineItem.length);
       
       tempItemList[lineItem.length] = li;
       lineItem = tempItemList;
    }
    
    //This method is used to take the line item array and make it into
    //a string to output on the screen.
    public String getReceipt() {
        StringBuilder items = new StringBuilder();
        items.append("Thanks for shopping at Kohl's Department Store" + "\n");
        items.append("Thanks for shopping ").append(customer.getFirstName()).append(" ").append(customer.getLastName()).append(" (").append(customer.getCustomerID()).append(")");
        items.append("\n" + "\n");
        items.append("Product     Price    Quantity    Subtotal   Discount" + "\n" +
    "----------------------------------------------------" + "\n");
        for (LineItem lineItem1 : lineItem) {
            items.append(lineItem1.getProduct().getDescription());
            items.append(" $").append(numberFormat.format(lineItem1.getProduct().getPrice()));
            items.append(" ").append(lineItem1.getQuantity());
            items.append(" $").append(numberFormat.format(lineItem1.getSubTotal()));
            items.append(" $").append(numberFormat.format(lineItem1.getDiscountAmount()));
            items.append("\n");
        }
        items.append("\n" + "Tax: $").append(numberFormat.format(getTaxAmount())).append("\n");
        items.append("\n" + "Total Amount: $").append(numberFormat.format(getFinalTotal())).append("\n");
        
        return items.toString();
        
    }
    
    //gets the total from the line item array for the customer
    public double getFinalTotal() {
        double total = 0;
        for (LineItem lineItem1 : lineItem) {
            total = total + lineItem1.getSubTotal() - lineItem1.getDiscountAmount();
        }
        return total + getTaxAmount();
    }
    
    public double getTaxAmount() {
        double total = 0;
        for (LineItem lineItem1 : lineItem) {
            total = total + lineItem1.getSubTotal() - lineItem1.getDiscountAmount();
        }
       return total * salesTax.getStateSalesTax();

    }

    public LineItem[] getLineItem() {
        return lineItem;
    }

    public void setLineItem(LineItem[] lineItem) {
        this.lineItem = lineItem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DataAccessStrategy getNewDB() {
        return newDB;
    }

    public void setNewDB(DataAccessStrategy newDB) {
        this.newDB = newDB;
    }
    
    
    
}