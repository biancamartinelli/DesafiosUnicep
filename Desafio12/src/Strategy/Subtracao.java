package Strategy;

public class Subtracao implements CalculoStrategy{

    public Subtracao() {
    }

    @Override
    public Double calcular(float a, float b) {
        return Double.parseDouble(String.valueOf(a - b)) ;
    }
}
