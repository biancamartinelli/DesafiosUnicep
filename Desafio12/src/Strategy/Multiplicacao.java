package Strategy;

public class Multiplicacao implements CalculoStrategy{

    public Multiplicacao() {
    }

    @Override
        public Double calcular(float a, float b) {
            return Double.parseDouble(String.valueOf(a * b)) ;
        }
}

