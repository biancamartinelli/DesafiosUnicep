package Modelo;

import Interface.Calculo;

public abstract class CalculadoraModel implements Calculo {

    protected Integer a;
    protected Integer b;

    public CalculadoraModel() {
    }

    public CalculadoraModel(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
