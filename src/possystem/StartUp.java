
package possystem;

/**
 *
 * @author jgray2
 */
public class StartUp {
    public static void main(String[] args) {
        CashRegister register = new CashRegister ();
        
        register.startNewSale("C02");
        register.addItemToSale("A101", 3);
        register.finalizeSale();
        
    }
    
}
