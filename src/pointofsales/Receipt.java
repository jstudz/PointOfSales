package pointofsales;



public class Receipt {
    private LineItem[] lineItem = new LineItem[0];

    public Receipt(LineItem[] lineItem) {
        this.lineItem = lineItem;
    }
    
    public void addProductToTotalSale(LineItem li) {
        addItemToSaleList(li);
    }
    
    public void addItemToSaleList(LineItem li) {
       LineItem[] tempItemList = new LineItem[lineItem.length + 1];
       
       for (int i = 0; i < lineItem.length; i++) {
           tempItemList[i] = lineItem[i];
       }
       
       lineItem = new LineItem[tempItemList.length];
       
       for (int j = 0; j < tempItemList.length; j++) {
           lineItem[j] = tempItemList[j];
       }
    }

    public LineItem[] getLineItem() {
        return lineItem;
    }
    
    public static void main(String[] args) {
        
    }
}
