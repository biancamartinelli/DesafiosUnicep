package Modelo;

public class Subtracao extends CalculadoraModel{


    @Override
    public Float calculo() {
        return Float.valueOf(a - b);

}

    public Subtracao() {
    }

    public Subtracao(Integer a, Integer b) {
        super(a, b);
    }
}
