package pointofsales;



public class Receipt {
    private LineItem[] lineItem = new LineItem[0];
    
    
    public void addItemToSaleList(LineItem li) {
       LineItem[] tempItemList = new LineItem[1 + lineItem.length];
       
       System.arraycopy(lineItem, 0, tempItemList, 0, tempItemList.length);
       
       tempItemList[lineItem.length - 1] = li;
       lineItem = tempItemList;
       
       
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }
    
    public static void main(String[] args) {
        Receipt newRec = new Receipt();
        newRec.addItemToSaleList(new LineItem(new Product(45, "456G", "hat", new DollarsOffDiscount(10)), 2));
        System.out.println(newRec.getLineItem());
    }
    
}
