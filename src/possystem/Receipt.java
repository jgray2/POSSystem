
package possystem;

public class Receipt {
    private LineItem lineItem;
    private Customer customer;
    private int qty;
    private Product product;
    LineItem[] lineItems = new LineItem[1];
  
     // Here's how to add a purchased product as a LineItem
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
        addToArray(item); 
    }
    
    private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItem, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
	// Here's how to loop through all the line items and get a grand total
    public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getOriginalPriceSubtotal();
        }
        return grandTotal;
    }


    
}
