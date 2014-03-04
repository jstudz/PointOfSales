package pointofsales;

public class PointOfSale {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        ReceiptOutputStrategy ros = new ReceiptJOptionOutput();
        
        cr.addNewSale("100", new FakeDatabase());
        cr.addItemToReceipt("A111", 2);
        cr.addItemToReceipt("C333", 2);
        cr.outputFinalSale(ros);
        
        cr.addNewSale("200", new FakeDatabase());
        cr.addItemToReceipt("B222", 4);
        cr.addItemToReceipt("D444", 1);
        cr.outputFinalSale(ros);
    }
    
}
