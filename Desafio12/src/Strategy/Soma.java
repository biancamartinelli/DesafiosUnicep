package Strategy;

public class Soma implements CalculoStrategy{

    public Soma() {
    }

    @Override
    public Double calcular(float a, float b) {
        return Double.parseDouble(String.valueOf(a + b)) ;
    }
}
