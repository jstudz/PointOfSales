

package pointofsales;

public class WisconsinStateSalesTax implements SalesTaxStrategy {
    
    @Override
    public double getStateSalesTax() {
        return .051;
    }
}
