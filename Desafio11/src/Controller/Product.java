package Controller;
import Model.ProductModel;

public class Product {
    private ProductModel model;
    private Float precoDeCompra;

    public Product() {
    }

    public Product(Float precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    public ProductModel getModel() {
        return model;
    }

    public void setModel() {
        this.model = new ProductModel();
    }

    public Float getPrecoDeCompra() {
        return precoDeCompra;
    }

    public void setPrecoDeCompra(Float precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }
}
