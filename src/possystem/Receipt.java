
package possystem;

public class Receipt {
    private LineItem lineItem;
    private Customer customer;
    private int qty;
    private Product product;
    LineItem[] item = new LineItem[0];
  
     // Here's how to add a purchased product as a LineItem
    public void addLineItem(Product product, int qty) {
        LineItem item = new LineItem(product, qty);
//        addToArray(item);
    }


    
}
