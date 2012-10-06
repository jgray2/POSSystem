package possystem;

/**
 *
 * @author jgray2
 */
public class CashRegister {

    Product[] products = {
        new Product("A101", "Baseball Hat", 19.95, new XmasDiscountStrategy()),
        new Product("B205", "Men's Dress Shirt", 35.50, new XmasDiscountStrategy()),
        new Product("C222", "Women's Socks", 9.50, new NoDiscountStrategy())
    };
    Customer[] customers = {
        new Customer("C01", "Bob Smith"),
        new Customer("C02", "Jim Jones"),
        new Customer("C03", "Sally Fields")
    };
    private Receipt receipt;

    private void startNewSale(String customerID) {
    }

   public void addItemToSale(String prodId, int qty) {
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdID())) {
                product = p;
                break;
            }
        }       
		// if found, add the lineItem to the receipt
        if(product != null) {
            receipt.addLineItem(product, qty);
        }   
    }


    private void finalizeSale() {
    }
}
