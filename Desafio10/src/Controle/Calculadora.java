package Controle;
import Modelo.*;

public class Calculadora {
     private CalculadoraModel calcular;

    public Calculadora() {

    }

    public CalculadoraModel getCalcular() {
        return calcular;
    }

    public void setCalcular(String operacao) {
        switch (operacao){
            case "+":
                calcular = new Soma();
                break;
            case "-":
                calcular = new Subtracao();
                break;
            case "*":
                calcular = new Multiplicacao();
                break;
            case "/":
                calcular = new Divisao();
                break;
            default:
                calcular = new Soma();
                break;
        }

    }
}
