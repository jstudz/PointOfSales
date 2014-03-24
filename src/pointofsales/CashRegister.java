

package pointofsales;

public class CashRegister {
    private Receipt receipt;
    private ReceiptOutputStrategy ros;

    //Creates a new receipt object with the customerID and the type of database
    //strategy used
    public void addNewSale(String customerID, DataAccessStrategy dbStrat, SalesTaxStrategy tax) {
        receipt = new Receipt(customerID, dbStrat, tax);
    }
    
    //this method is used to add items to the receipt and lineitem array
    public void addItemToReceipt (String productCode, double qty) {
        receipt.addItemToSaleList(productCode, qty);
    }
    
    //this method calls the getReceipt method from the receipt class which
    //puts all of the items in the array together in a String.
    public void outputFinalSale(ReceiptOutputStrategy ros) {
        ros.displayReceipt(receipt);
    }
}
