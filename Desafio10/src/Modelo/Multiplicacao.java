package Modelo;

public class Multiplicacao extends CalculadoraModel{


    @Override
    public Float calculo() {
        return Float.valueOf(a * b);
    }

    public Multiplicacao() {
    }

    public Multiplicacao(Integer a, Integer b) {
        super(a, b);
    }
}

