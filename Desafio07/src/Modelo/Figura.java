package Modelo;

public abstract class Figura {
    protected Integer base;
    protected Integer altura;

    protected String tipo;

    public Figura() {
    }

    public Figura(Integer base, Integer altura, String tipo) {
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }

    public abstract Float calculaArea();

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

}
