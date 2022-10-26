package Modelo;

public class Retangulo extends Figura {

    public Retangulo() {
    }

    public Retangulo(Integer base, Integer altura) {
        super(base, altura, "Retangulo");
    }

    @Override
    public Float calculaArea() {
        return Float.parseFloat(String.valueOf(altura * base));
    }

}
