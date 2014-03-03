package pointofsales;



public class Receipt {
    private LineItem[] lineItem = new LineItem[0];
    private Customer customer;
    private DatabaseStrategy newDB;

    public Receipt(String customerID, DatabaseStrategy newDB) {
        this.customer = newDB.findCustomer(customerID);
        this.newDB = newDB;
    }
    
    public void addItemToSaleList(String productCode, double quantity) {
       LineItem li = new LineItem(newDB.findProduct(productCode), quantity );
       
       LineItem[] tempItemList = new LineItem[1 + lineItem.length];
       
       System.arraycopy(lineItem, 0, tempItemList, 0, lineItem.length);
       
       tempItemList[lineItem.length] = li;
       lineItem = tempItemList;
       
       
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }
    
    public String getReceipt() {
        String items = "Welcome to Kohl's Department Store" + "\n";
        items += "\n";
        items += "\n";
        items += "Thank you for shopping here, " + customer.getFirstName()
                  + " " + customer.getLastName();
        items += "\n";
        items += "\n";
        items += "Product     Price    Subtotal   Discount" + "\n";
        items += "----------------------------------------" + "\n";
        for (int x = 0; x < lineItem.length; x++) {
            items += lineItem[x].getProduct().getDescription();
            items += " $" + lineItem[x].getProduct().getPrice();
            items += " $" + lineItem[x].getSubTotal();
            items += " $" + lineItem[x].getDiscountAmount();
            items += "\n";
        }
            
        items += "\n";
        items += "Total Amount: $" + getFinalTotal();
            
        return items;
        
    }
    
    public double getFinalTotal() {
        double total = 0;
        
        for (int x = 0; x < lineItem.length; x++) {
            total = total + lineItem[x].getSubTotal() - lineItem[x].getDiscountAmount();
        }
        return total;
    }
    

    
}