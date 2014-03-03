package pointofsales;

public class PointOfSales {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        
        cr.addNewSale("100", new FakeDatabase());
        cr.addItemToReceipt("A111", 2);
        cr.addItemToReceipt("C333", 4);
        System.out.println(cr.getFinalSale());
        
        cr.addNewSale("200", new FakeDatabase());
        cr.addItemToReceipt("B222", 4);
        System.out.println(cr.getFinalSale());
    }
    
}
