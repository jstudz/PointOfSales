package pointofsales;

import javax.swing.JOptionPane;

public class ReceiptJOptionOutput implements ReceiptOutputStrategy {

    @Override
    public void displayReceipt(Receipt receipt) {
        JOptionPane.showMessageDialog(null, receipt.getReceipt());
    }
    
}
