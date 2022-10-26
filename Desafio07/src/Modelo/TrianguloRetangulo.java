package Modelo;

public class TrianguloRetangulo extends Figura{

    public TrianguloRetangulo() {
    }

    public TrianguloRetangulo(Integer base, Integer altura) {
        super(base, altura, "Triangulo Retangulo");
    }

    @Override
    public Float calculaArea() {
        return Float.parseFloat(String.valueOf((altura * base) / 2));
    }
}
