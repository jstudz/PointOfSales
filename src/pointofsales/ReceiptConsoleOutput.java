

package pointofsales;

public class ReceiptConsoleOutput implements ReceiptOutputStrategy {

    @Override
    public void displayReceipt(Receipt receipt) {
        System.out.println(receipt.getReceipt());
    }
}
