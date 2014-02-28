

package pointofsales;

public class CashRegister {
    private Receipt receipt;
    
    public void addItemToReceipt (LineItem li) {
        receipt.addItemToSaleList(li);
    }
    
}
