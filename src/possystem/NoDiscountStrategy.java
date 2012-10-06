/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package possystem;

/**
 *
 * @author jgray2
 */
public class NoDiscountStrategy implements DiscountStrategy {
    
    @Override
    public double getDiscount(double price) {
        return 0;
    }
    
}
