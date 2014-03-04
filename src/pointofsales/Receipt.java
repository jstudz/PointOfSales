/*
    The receipt class is used to create the receipt based on the line item class.
    
*/
package pointofsales;

import java.text.DecimalFormat;

public class Receipt {
    private LineItem[] lineItem = new LineItem[0];
    private Customer customer;
    private DatabaseStrategy newDB;
    private SalesTaxStrategy salesTax;
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    
    //This consturctor uses the customerID to find the customer through the
    //database the user chooses to use.
    public Receipt(String customerID, DatabaseStrategy newDB, SalesTaxStrategy tax) {
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
        items.append("Thanks for shopping " + customer.getFirstName() + " " + customer.getLastName() + " (" + customer.getCustomerID()
              + ")");
        items.append("\n" + "\n");
        items.append("Product     Price    Quantity    Subtotal   Discount" + "\n" +
    "----------------------------------------------------" + "\n");

        for (int x = 0; x < lineItem.length; x++) {
            items.append(lineItem[x].getProduct().getDescription());
            items.append(" $" + numberFormat.format(lineItem[x].getProduct().getPrice()));
            items.append(" " + lineItem[x].getQuantity());
            items.append(" $" + numberFormat.format(lineItem[x].getSubTotal()));
            items.append(" $" + numberFormat.format(lineItem[x].getDiscountAmount()));
            items.append("\n");
        }
        items.append("\n" + "Tax: $" + numberFormat.format(getTaxAmount()) + "\n");
        items.append("\n" + "Total Amount: $" + numberFormat.format(getFinalTotal()) + "\n");
        
        return items.toString();
        
    }
    
    //gets the total from the line item array for the customer
    public double getFinalTotal() {
        double total = 0;
        
        for (int x = 0; x < lineItem.length; x++) {
            total = total + lineItem[x].getSubTotal() - lineItem[x].getDiscountAmount();
        }
        return total + getTaxAmount();
    }
    
    public double getTaxAmount() {
        double total = 0;
        
        for (int x = 0; x < lineItem.length; x++) {
            total = total + lineItem[x].getSubTotal() - lineItem[x].getDiscountAmount();
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

    public DatabaseStrategy getNewDB() {
        return newDB;
    }

    public void setNewDB(DatabaseStrategy newDB) {
        this.newDB = newDB;
    }
    
    
    
}