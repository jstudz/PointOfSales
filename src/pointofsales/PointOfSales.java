package pointofsales;

public class PointOfSales {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.addNewSale("100", new FakeDatabase());
        cr.addItemToReceipt("A111", 2);
        cr.addItemToReceipt("C333", 2);
        System.out.println(cr.outputFinalSale());
        
        cr.addNewSale("200", new FakeDatabase());
        cr.addItemToReceipt("B222", 4);
        cr.addItemToReceipt("D444", 1);
        System.out.println(cr.outputFinalSale());
    }
    
}
