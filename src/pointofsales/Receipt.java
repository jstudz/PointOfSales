package pointofsales;



public class Receipt {
    private LineItem[] lineItem = new LineItem[0];

    public Receipt(LineItem[] lineItem) {
        this.lineItem = lineItem;
    }
    
    
    public void addProductToTotalSale(LineItem li) {
        addItemToSaleList();
    }
    
    public void addItemToSaleList() {
       LineItem[] tempItemList = new LineItem[lineItem.length + 1];
       
       for (int i = 0; i < tempItemList.length; i++) {
           tempItemList[i] = lineItem[i];
       }
       
       lineItem = new LineItem[tempItemList.length];
       
       for (int j = 0; j < lineItem.length; j++) {
           lineItem[j] = tempItemList[j];
       }
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }
    
    
    
    public static void main(String[] args) {
        Receipt newRec = new Receipt(new LineItem[1]);
        newRec.addProductToTotalSale(new LineItem(new Product(45, "456G", "hat", new DollarsOffDiscount(10)), 2));
        System.out.println(newRec.getLineItem());
    }
}
