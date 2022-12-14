package logic;

public class Detail {
    private Product product;
    private short cant;

    public Detail(Product product, short cant) {
        this.product = product;
        this.cant = cant;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public short getCant() {
        return cant;
    }

    public void setCant(short cant) {
        this.cant = cant;
    }

    public double getSubTotal() {
        return product.getValue() * cant + (product.getIVA() * cant);
    }
}
