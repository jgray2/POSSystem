
package possystem;

/**
 *
 * @author jgray2
 */
public class XmasDiscountStrategy implements DiscountStrategy {
    private double percDiscount = 0.30;
    private double discount;
    
    @Override
    public double getDiscount(double price) {
        return discount = price * percDiscount;
    }
    
    
    
}
