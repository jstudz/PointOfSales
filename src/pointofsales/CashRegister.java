

package pointofsales;

public class CashRegister {
    private Receipt receipt;
    
    public void addNewSale(String customerID, DatabaseStrategy dbStrat) {
        receipt = new Receipt(customerID, dbStrat);
    }
    public void addItemToReceipt (String productCode, double qty) {
        receipt.addItemToSaleList(productCode, qty);
    }
    
    public String getFinalSale() {
        return receipt.getReceipt();
    }
}
