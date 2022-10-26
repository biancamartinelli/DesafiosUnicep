package Strategy;

public class Divisao implements CalculoStrategy{
    public Divisao() {
    }

    @Override
    public Double calcular(float a, float b) {
        return Double.parseDouble(String.valueOf(a / b)) ;
    }
}
