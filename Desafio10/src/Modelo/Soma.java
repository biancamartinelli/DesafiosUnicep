package Modelo;

public class Soma extends CalculadoraModel{


    @Override
    public Float calculo() {
        return Float.valueOf(a + b);
    }

    public Soma() {
    }

    public Soma(Integer a, Integer b) {
        super(a, b);
    }
}
