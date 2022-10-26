package Modelo;

public class Divisao extends CalculadoraModel{


    @Override
    public Float calculo() {
        return Float.valueOf(a / b);
    }

    public Divisao() {
    }

    public Divisao(Integer a, Integer b) {
        super(a, b);
    }
}

