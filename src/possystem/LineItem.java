package possystem;

public class LineItem {

    private Product product;
    private double quantity;
    private double subtotal;

    public LineItem(Product product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getOriginalPriceSubtotal() {
        return subtotal = quantity * product.getUnitPrice();
    }
}
