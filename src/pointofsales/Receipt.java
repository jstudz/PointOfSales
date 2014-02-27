package pointofsales;



public class Receipt {
    private LineItem[] lineItem = new LineItem[0];

    public void addProductToTotalSale(LineItem li) {
        addItemToSaleList(li);
        lineItem[lineItem.length - 1] = li;
    }
    
    public void addItemToSaleList(LineItem li) {
       LineItem[] tempItemList = new LineItem[1 + lineItem.length];
       
       for (int i = 0; i < tempItemList.length; i++) {
           tempItemList[i] = lineItem[i];
       }
       
       lineItem = tempItemList;
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }
    
    public static void main(String[] args) {
        Receipt newRec = new Receipt();
        newRec.addProductToTotalSale(new LineItem(new Product(45, "456G", "hat", new DollarsOffDiscount(10)), 2));
        System.out.println(newRec.getLineItem());
    }
    
}
