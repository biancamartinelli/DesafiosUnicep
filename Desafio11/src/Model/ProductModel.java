package Model;

public class ProductModel {
    private final double markup = 1.54;


    public final double formula(Float precoDeCompra) {
        return (markup * precoDeCompra);
    }
}